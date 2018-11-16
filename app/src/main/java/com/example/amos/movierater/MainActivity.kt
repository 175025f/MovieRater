package com.example.amos.movierater

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cbCheckbox.setOnClickListener() {
            if (cbCheckbox.isChecked == true) {
                cbViolence.visibility = View.VISIBLE
                cbLanguageUsed.visibility = View.VISIBLE
            } else {
                cbViolence.visibility = View.INVISIBLE
                cbLanguageUsed.visibility = View.INVISIBLE
            }
        }

        btnAdd.setOnClickListener( {
            var validate = true
            if(etName.text.isEmpty()) {
                validate = false
                etName.setError("Field empty")
            }
            if(etDescription.text.isEmpty()) {
                validate = false
                etDescription.setError("Field empty")
            }
            if(etDate.text.isEmpty()) {
                validate = false
                etDate.setError("Field empty")
            }

            var languageUsed = ""
            if(cbLanguageUsed.isChecked) {
                languageUsed = "Language"
            }

            var violence = ""
            if(cbViolence.isChecked) {
                violence = "Violence"
            }

            var language = ""
            if(rbEnglish.isChecked) {
                language = "English"
            }
            else if (rbChinese.isChecked) {
                language = "Chinese"
            }
            else if (rbMalay.isChecked) {
                language = "Malay"
            }
            else if (rbTamil.isChecked) {
                language = "Tamil"
            }

            if(validate) {
                Toast.makeText(this, "Title = " + etName.text + "\nOverview = " + etDescription.text + "\nRelease date = " + etDate.text + "\nLanguage = " + language + "\nSuitable for all ages = " + cbCheckbox.isChecked + "\nReason: \n" + violence + "\n" + languageUsed, Toast.LENGTH_LONG).show()
            }
        })
    }

}
