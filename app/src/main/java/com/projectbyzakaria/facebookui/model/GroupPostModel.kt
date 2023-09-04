package com.projectbyzakaria.facebookui.model

data class GroupPostModel(
    val image:Int,
    val userImage:Int,
    val groupImage:Int,
    val userName:String,
    val time:String,
    val numberOfComments:Int,
    val numberOfShares:Int,
    val numberOfLikes:Int,
    val icon:Int,
    val text:String? = null,
    val keywords :List<String> = emptyList(),
    val settingsText:String? = null,
    val comments:List<Comment> = emptyList()
)
