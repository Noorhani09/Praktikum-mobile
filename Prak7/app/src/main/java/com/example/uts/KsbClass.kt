package com.example.uts

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class KsbClass(
    val ksbimg: Int,
    val ksbname: String,
    val ksbdate: String,
    val ksbauthor: String,
    val ksbdesc: String,

) : Parcelable