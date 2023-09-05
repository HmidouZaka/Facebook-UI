package com.projectbyzakaria.facebookui.model

data class AdsPostModel(
    val image:Int,
    val userImage:Int,
    val userName:String,
    val time:String,
    val numberOfComments:Int,
    val numberOfShares:Int,
    val numberOfLikes:Int,
    val icon:Int,
    val textLink: String,
    val textAds: String,
    val text:String? = null,
    val keywords :List<String> = emptyList(),
    val settingsText:String? = null,
    val isWhatsAppAds:Boolean = true,
    val isShowComments:Boolean = false,
    val comments:List<Comment> = emptyList()
)
