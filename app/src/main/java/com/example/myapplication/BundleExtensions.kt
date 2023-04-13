package com.example.myapplication

import android.os.Build
import android.os.Build.VERSION.SDK_INT
import android.os.Bundle
import android.os.Parcelable

inline fun <reified T : Parcelable> Bundle.parcelable(key: String): T? = when {
    SDK_INT >= Build.VERSION_CODES.TIRAMISU -> getParcelable(key, T::class.java)
    else -> {
        // https://issuetracker.google.com/issues/242048899
        @Suppress("DEPRECATION")
        getParcelable(key) as? T
    }
}
