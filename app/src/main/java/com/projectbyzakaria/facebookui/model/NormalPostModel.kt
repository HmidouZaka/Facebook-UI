package com.projectbyzakaria.facebookui.model

data class NormalPostModel(
    val image:Int,
    val userImage:Int,
    val userName:String,
    val time:String,
    val numberOfComments:Int,
    val numberOfShares:Int,
    val numberOfLikes:Int,
    val icon:Int,
    val text:String? = null,
    val keywords :List<String> = emptyList()
)
