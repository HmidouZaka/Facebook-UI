package com.projectbyzakaria.facebookui.model

import android.graphics.Bitmap
import androidx.annotation.DrawableRes

data class Story(
    val namePerson: String,
    @DrawableRes
    val storyImage: Int,
    @DrawableRes
    val profileImage: Int,
)