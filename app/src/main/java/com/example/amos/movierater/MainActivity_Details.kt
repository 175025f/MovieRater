package com.example.amos.movierater

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.viewmoviedetails.*

class MainActivity_Details : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.viewmoviedetails)

        val movie = Movie("Venom",
            "When Eddie Brock acquires the powers of a symbiote, he will have to release his alter-ego Venom to save his life",
            "03-10-2018", "English", "Yes")

        tvTitle.text = movie.title
        tvOverview.text = movie.description
        tvLanguage.text = movie.language
        tvDate.text = movie.releaseDate
        tvSuitable.text = movie.suitable
    }
}

class Movie(Title: String, Description: String, ReleaseDate: String, Language: String, Suitable: String) {
    var title: String
    var description: String
    var releaseDate: String
    var language: String
    var suitable: String

    init {
        this.title = Title
        this.description = Description
        this.releaseDate = ReleaseDate
        this.language = Language
        this.suitable = Suitable
    }


}