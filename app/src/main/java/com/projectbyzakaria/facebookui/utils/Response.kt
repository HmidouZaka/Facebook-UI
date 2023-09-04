package com.projectbyzakaria.facebookui.utils

import com.projectbyzakaria.facebookui.model.AdsPostModel
import com.projectbyzakaria.facebookui.model.NormalPostModel
import com.projectbyzakaria.facebookui.model.People
import com.projectbyzakaria.facebookui.model.VideoPostModel

sealed class Response{
    data class NormalPost(public val normalPost : NormalPostModel?) : Response()
    data class AdsPost(public val ads : AdsPostModel?) : Response()
    data class PeopleRecommendation(public val people : People?) : Response()
    data class GroupPost(public val people : People?) : Response()
    data class VideoPost(public val video : VideoPostModel?) : Response()
    data class Reals(public val reals : VideoPostModel?) : Response()
}
