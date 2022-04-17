package com.alfandy.utsmovieapp

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Movie(
    val imageMovie : Int,
    val nameMovie: String,
    val descMovie: String
) : Parcelable
