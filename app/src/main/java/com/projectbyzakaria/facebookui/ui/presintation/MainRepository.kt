package com.projectbyzakaria.facebookui.ui.presintation

import com.projectbyzakaria.facebookui.data.PostData

class MainRepository(
    private val data:PostData
) {


    suspend fun fetch() = data.fetchPosts()


}