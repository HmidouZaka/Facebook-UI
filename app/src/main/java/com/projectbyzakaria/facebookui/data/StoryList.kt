package com.projectbyzakaria.facebookui.data

import com.projectbyzakaria.facebookui.R
import com.projectbyzakaria.facebookui.model.Story

class StoryList {

    private val storyList = mutableListOf<Story>()


    init {
        storyList.add(
            Story(
                namePerson = "Jawad lani",
                storyImage = R.drawable.profileimage2,
                profileImage = R.drawable.profileimage4
            )
        )
        storyList.add(
            Story(
                namePerson = "Nada Kamin",
                storyImage = R.drawable.profileimage6,
                profileImage = R.drawable.profileimage8
            )
        )
        storyList.add(
            Story(
                namePerson = "Khalid Moha",
                storyImage = R.drawable.profileimage7,
                profileImage = R.drawable.profileimage1
            )
        )
        storyList.add(
            Story(
                namePerson = "Ahmed Ahmed",
                storyImage = R.drawable.profileimage3,
                profileImage = R.drawable.profileimage5
            )
        )
        storyList.add(
            Story(
                namePerson = "yassin mofa",
                storyImage = R.drawable.profileimage9,
                profileImage = R.drawable.profileimage7
            )
        )
        storyList.add(
            Story(
                namePerson = "steve caline",
                storyImage = R.drawable.profileimage5,
                profileImage = R.drawable.profileimage2
            )
        )



    }


    fun getData() :List<Story>{
        return storyList
    }

}