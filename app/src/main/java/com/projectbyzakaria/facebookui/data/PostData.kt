package com.projectbyzakaria.facebookui.data

import com.projectbyzakaria.facebookui.R
import com.projectbyzakaria.facebookui.model.Comment
import com.projectbyzakaria.facebookui.model.NormalPostModel
import com.projectbyzakaria.facebookui.utils.Response
import kotlinx.coroutines.delay

class PostData {

    private val data = listOf<Response>(
        Response.NormalPost(
            NormalPostModel(
                image = R.drawable.imagepost9,
                userName = "zakaria hmiodu",
                userImage = R.drawable.profileimage5,
                time = "8h .",
                numberOfShares = 5,
                numberOfLikes = 20,
                numberOfComments = 3,
                icon = R.drawable.public_fill0_wght400_grad0_opsz24,
                text = "Hi friends, I'm excited to share my very first post with you! \uD83E\uDD73 What do you think about it? ",
                keywords = listOf("post", "facebook", "fun", "first", "friends"),
                settingsText = """Lorem ipsum dolor sit amet, consectetur
                    |adipiscing elit. Nulla facilisi. Sed nec quam ac justo
                    |feugiat sollicitudin. Vivamus vel justo
                    |in odio eleifend hendrerit. Proin cursus,
                    |metus ut ultrices commodo, ipsum metus auctor tortor, a
                    |commodo ex elit eget dolor. Fusce a justo euismod
                    |in ultricies odio, id euismod arcu. Suspendisse 
                    |potenti. Cras euismod nisi et bibendum convallis.\n""".trimMargin(),
                comments = listOf(
                    Comment(
                        userImage = R.drawable.profileimage2,
                        comment = "nice",
                        numberOfLikes = 1,
                        name = "ahmed"
                    ),
                    Comment(
                        userImage = R.drawable.profileimage9,
                        comment = "what is this ",
                        numberOfLikes = 1,
                        name = "loli"
                    ),
                    Comment(
                        userImage = R.drawable.profileimage7,
                        comment = "I see",
                        numberOfLikes = 2,
                        name = "khalid"
                    )
                ),
                isShowComments = true
            ),
            ),
        Response.NormalPost(
            NormalPostModel(
                image = R.drawable.imagepost10,
                userName = "al hadat",
                userImage = R.drawable.alhadatlogo,
                time = "12h .",
                numberOfShares = 8,
                numberOfLikes = 35,
                numberOfComments = 5,
                icon = R.drawable.public_fill0_wght400_grad0_opsz24,
                text =null,
                keywords = listOf("news","al hadat"),
                settingsText = """Lorem ipsum dolor sit amet, consectetur
                    |adipiscing elit. Nulla facilisi. Sed nec quam ac justo
                    |feugiat sollicitudin. Vivamus vel justo
                    |in odio eleifend hendrerit. Proin cursus,
                    |metus ut ultrices commodo, ipsum metus auctor tortor, a
                    |commodo ex elit eget dolor. Fusce a justo euismod
                    |in ultricies odio, id euismod arcu. Suspendisse 
                    |potenti. Cras euismod nisi et bibendum convallis.\n""".trimMargin(),
                comments = listOf(
                    Comment(
                        userImage = R.drawable.profileimage8,
                        comment = "\uD83E\uDD73",
                        numberOfLikes = 0,
                        name = "khalid"
                    )
                ),
                isShowComments = false
            )
        ),
        Response.NormalPost(
            NormalPostModel(
                image = R.drawable.imagepost3,
                userName = "emma",
                userImage = R.drawable.profileimage3,
                time = "2h .",
                numberOfShares = 2,
                numberOfLikes = 15,
                numberOfComments = 6,
                icon = R.drawable.public_fill0_wght400_grad0_opsz24,
                text = "",
                keywords = listOf("", ""),
                settingsText = null,
                comments = listOf(
                    Comment(
                        userImage = R.drawable.profileimage5,
                        comment = "I love traveling too!",
                        numberOfLikes = 2,
                        name = "david"
                    ),
                    Comment(
                        userImage = R.drawable.profileimage2,
                        comment = "Where was this taken?",
                        numberOfLikes = 1,
                        name = "sophia"
                    ),
                    Comment(
                        userImage = R.drawable.profileimage1,
                        comment = "Amazing!",
                        numberOfLikes = 3,
                        name = "lucas"
                    )
                )
            )
        ),
        Response.NormalPost(
            NormalPostModel(
                image = R.drawable.imagepost8,
                userName = "olivia",
                userImage = R.drawable.profileimage4,
                time = "5h .",
                numberOfShares = 3,
                numberOfLikes = 25,
                numberOfComments = 4,
                icon = R.drawable.public_fill0_wght400_grad0_opsz24,
                text = "Cooking up a storm in the kitchen today!",
                keywords = listOf("cooking", "food"),
                settingsText = null,
                comments = listOf(
                    Comment(
                        userImage = R.drawable.profileimage6,
                        comment = "What's on the menu?",
                        numberOfLikes = 1,
                        name = "mia"
                    ),
                    Comment(
                        userImage = R.drawable.profileimage8,
                        comment = "I wish I could taste that!",
                        numberOfLikes = 1,
                        name = "noah"
                    ),
                    Comment(
                        userImage = R.drawable.profileimage7,
                        comment = "Looks delicious!",
                        numberOfLikes = 2,
                        name = "ava"
                    )
                ),
                isShowComments = true
            )
        ),
        Response.NormalPost(
            NormalPostModel(
                image = R.drawable.imagepost4,
                userName = "chloe",
                userImage = R.drawable.profileimage1,
                time = "10h .",
                numberOfShares = 4,
                numberOfLikes = 18,
                numberOfComments = 7,
                icon = R.drawable.public_fill0_wght400_grad0_opsz24,
                text = "Spent the weekend hiking in the mountains!",
                keywords = listOf("hiking", "outdoors"),
                settingsText = null,
                comments = listOf(
                    Comment(
                        userImage = R.drawable.profileimage7,
                        comment = "What a beautiful view!",
                        numberOfLikes = 3,
                        name = "liam"
                    ),
                    Comment(
                        userImage = R.drawable.profileimage5,
                        comment = "I love hiking too!",
                        numberOfLikes = 2,
                        name = "oliver"
                    ),
                    Comment(
                        userImage = R.drawable.profileimage3,
                        comment = "Nature at its best!",
                        numberOfLikes = 2,
                        name = "amelia"
                    )
                )
            )
        ),
        Response.NormalPost(
            NormalPostModel(
                image = R.drawable.imagepost6,
                userName = "noah",
                userImage = R.drawable.profileimage2,
                time = "6h .",
                numberOfShares = 1,
                numberOfLikes = 30,
                numberOfComments = 5,
                icon = R.drawable.public_fill0_wght400_grad0_opsz24,
                text = "Just finished reading a great book!",
                keywords = listOf("books", "reading"),
                settingsText = null,
                comments = listOf(
                    Comment(
                        userImage = R.drawable.profileimage8,
                        comment = "What book was it?",
                        numberOfLikes = 1,
                        name = "sophia"
                    ),
                    Comment(
                        userImage = R.drawable.profileimage6,
                        comment = "I love reading too!",
                        numberOfLikes = 3,
                        name = "jack"
                    ),
                    Comment(
                        userImage = R.drawable.profileimage4,
                        comment = "Share your thoughts on the book!",
                        numberOfLikes = 1,
                        name = "emma"
                    )
                ),
                isShowComments = true
            )
        ),
        Response.NormalPost(
            NormalPostModel(
                image = R.drawable.imagepost5,
                userName = "mason",
                userImage = R.drawable.profileimage3,
                time = "4h .",
                numberOfShares = 3,
                numberOfLikes = 22,
                numberOfComments = 8,
                icon = R.drawable.public_fill0_wght400_grad0_opsz24,
                text = "Just attended an amazing concert last night!",
                keywords = listOf("music", "concert"),
                settingsText = null,
                comments = listOf(
                    Comment(
                        userImage = R.drawable.profileimage2,
                        comment = "Who was the artist?",
                        numberOfLikes = 1,
                        name = "ava"
                    ),
                    Comment(
                        userImage = R.drawable.profileimage7,
                        comment = "I bet it was a blast!",
                        numberOfLikes = 2,
                        name = "william"
                    ),
                    Comment(
                        userImage = R.drawable.profileimage5,
                        comment = "I wish I could have been there!",
                        numberOfLikes = 3,
                        name = "mia"
                    )
                ),
                isShowComments = true
            )
        ),

        Response.NormalPost(
            NormalPostModel(
                image = R.drawable.imagepost7,
                userName = "harper",
                userImage = R.drawable.profileimage4,
                time = "9h .",
                numberOfShares = 5,
                numberOfLikes = 17,
                numberOfComments = 6,
                icon = R.drawable.public_fill0_wght400_grad0_opsz24,
                text = "A productive day at work today!",
                keywords = listOf("work", "productivity"),
                settingsText = null,
                comments = listOf(
                    Comment(
                        userImage = R.drawable.profileimage6,
                        comment = "Good job!",
                        numberOfLikes = 1,
                        name = "olivia"
                    ),
                    Comment(
                        userImage = R.drawable.profileimage8,
                        comment = "Keep up the great work!",
                        numberOfLikes = 2,
                        name = "ethan"
                    ),
                    Comment(
                        userImage = R.drawable.profileimage1,
                        comment = "You're doing awesome!",
                        numberOfLikes = 1,
                        name = "liam"
                    )
                )
            )
        ),
        Response.NormalPost(
            NormalPostModel(
                image = R.drawable.imagepost11,
                userName = "mia",
                userImage = R.drawable.alhadatlogo,
                time = "7h .",
                numberOfShares = 3,
                numberOfLikes = 19,
                numberOfComments = 5,
                icon = R.drawable.public_fill0_wght400_grad0_opsz24,
                text = "Just adopted a cute puppy today! Meet Max 🐶❤️",
                keywords = listOf("pets", "puppy"),
                settingsText = null,
                comments = listOf(
                    Comment(
                        userImage = R.drawable.profileimage3,
                        comment = "Max is adorable!",
                        numberOfLikes = 2,
                        name = "jack"
                    ),
                    Comment(
                        userImage = R.drawable.profileimage1,
                        comment = "I love dogs!",
                        numberOfLikes = 1,
                        name = "sophia"
                    ),
                    Comment(
                        userImage = R.drawable.profileimage2,
                        comment = "What breed is Max?",
                        numberOfLikes = 2,
                        name = "emma"
                    )
                )
            )
        ),

        Response.NormalPost(
            NormalPostModel(
                image = R.drawable.imagepost4,
                userName = "oliver",
                userImage = R.drawable.profileimage2,
                time = "11h .",
                numberOfShares = 6,
                numberOfLikes = 24,
                numberOfComments = 4,
                icon = R.drawable.public_fill0_wght400_grad0_opsz24,
                text = "Had an amazing time at the beach today!",
                keywords = listOf("beach", "fun"),
                settingsText = null,
                comments = listOf(
                    Comment(
                        userImage = R.drawable.profileimage7,
                        comment = "I love the beach!",
                        numberOfLikes = 2,
                        name = "ava"
                    ),
                    Comment(
                        userImage = R.drawable.profileimage6,
                        comment = "The water looks so inviting!",
                        numberOfLikes = 1,
                        name = "william"
                    ),
                    Comment(
                        userImage = R.drawable.profileimage8,
                        comment = "Perfect weather for a beach day!",
                        numberOfLikes = 1,
                        name = "harper"
                    )
                )
            )
        ),
        Response.NormalPost(
            NormalPostModel(
                image = R.drawable.imagepost2,
                userName = "william",
                userImage = R.drawable.profileimage7,
                time = "3h .",
                numberOfShares = 4,
                numberOfLikes = 14,
                numberOfComments = 5,
                icon = R.drawable.public_fill0_wght400_grad0_opsz24,
                text = "Enjoying a relaxing day at the park!",
                keywords = listOf("park", "relaxation"),
                settingsText = null,
                comments = listOf(
                    Comment(
                        userImage = R.drawable.profileimage3,
                        comment = "I love spending time outdoors!",
                        numberOfLikes = 2,
                        name = "olivia"
                    ),
                    Comment(
                        userImage = R.drawable.profileimage1,
                        comment = "What park is this?",
                        numberOfLikes = 1,
                        name = "emma"
                    ),
                    Comment(
                        userImage = R.drawable.profileimage5,
                        comment = "Looks like a perfect day!",
                        numberOfLikes = 1,
                        name = "jack"
                    )
                )
            )
        ),

        Response.NormalPost(
            NormalPostModel(
                image = R.drawable.profileimage8,
                userName = "sophia",
                userImage = R.drawable.profileimage1,
                time = "9h .",
                numberOfShares = 2,
                numberOfLikes = 20,
                numberOfComments = 3,
                icon = R.drawable.public_fill0_wght400_grad0_opsz24,
                text = "Cooked a delicious homemade meal for dinner!",
                keywords = listOf("cooking", "food"),
                settingsText = null,
                comments = listOf(
                    Comment(
                        userImage = R.drawable.profileimage8,
                        comment = "What did you cook?",
                        numberOfLikes = 1,
                        name = "oliver"
                    ),
                    Comment(
                        userImage = R.drawable.profileimage6,
                        comment = "I need your recipe!",
                        numberOfLikes = 1,
                        name = "mia"
                    ),
                    Comment(
                        userImage = R.drawable.profileimage4,
                        comment = "Looks mouthwatering!",
                        numberOfLikes = 1,
                        name = "noah"
                    )
                )
            )
        )
    )


    suspend fun fetchPosts(): List<Response> {
        delay(1000)
        return data
    }
}
