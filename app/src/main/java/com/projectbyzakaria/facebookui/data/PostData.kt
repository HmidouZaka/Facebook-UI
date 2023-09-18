package com.projectbyzakaria.facebookui.data

import com.projectbyzakaria.facebookui.R
import com.projectbyzakaria.facebookui.model.AdsPostModel
import com.projectbyzakaria.facebookui.model.Comment
import com.projectbyzakaria.facebookui.model.GroupPostModel
import com.projectbyzakaria.facebookui.model.NormalPostModel
import com.projectbyzakaria.facebookui.model.People
import com.projectbyzakaria.facebookui.utils.Response
import kotlinx.coroutines.delay

class PostData {

    val textPotine = """
        Vladimir Vladimirovich Putin[c] (born 7 October 1952) is a Russian politician and former intelligence officer who has served as President of Russia since 2012. Putin has held continuous positions as president or prime minister since 1999:[d] as prime minister from 1999 to 2000 and from 2008 to 2012, and as president from 2000 to 2008 and since 2012.[e][7]
        Putin worked as a KGB foreign intelligence officer for 16 years, rising to the rank of lieutenant colonel before resigning in 1991 to begin a political career in Saint Petersburg. In 1996, he moved to Moscow to join the administration of President Boris Yeltsin. He briefly served as the director of the Federal Security Service (FSB) and as secretary of the Security Council of Russia before being appointed prime minister in August 1999. Following Yeltsin's resignation, Putin became acting president and, in less than four months, was elected to his first term as president. He was subsequently reelected in 2004. Due to constitutional limitations of two consecutive presidential terms, Putin served as prime minister again from 2008 to 2012 under Dmitry Medvedev. He returned to the presidency in 2012, following an election marked by allegations of fraud and protests, and was reelected in 2018. In April 2021, after a referendum, he signed into law constitutional amendments that included one allowing him to run for reelection twice more, potentially extending his presidency to 2036.[8][9]
    """.trimIndent()
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
                text = textPotine,
                keywords = listOf("news", "al hadat", "potine"),
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
                        userImage = R.drawable.profileimage9,
                        comment = "\uD83E\uDD73",
                        numberOfLikes = 0,
                        name = "khalid pilano"
                    ),
                    Comment(
                        userImage = R.drawable.angry,
                        comment = "I can't understand that",
                        numberOfLikes = 0,
                        name = "taryna micato"
                    ),
                    Comment(
                        userImage = R.drawable.alhadatlogo,
                        comment = "this is a not real comment it is fake ok ? have a nice day",
                        numberOfLikes = 0,
                        name = "lopa finaco"
                    ),
                    Comment(
                        userImage = R.drawable.imagepost7,
                        comment = "have a nice day",
                        numberOfLikes = 0,
                        name = "jemy lkico"
                    ), Comment(
                        userImage = R.drawable.myprofilelogo,
                        comment = "me same this is a not real comment",
                        numberOfLikes = 0,
                        name = "arami125"
                    ),
                    Comment(
                        userImage = R.drawable.profileimage8,
                        comment = "this a not good news",
                        numberOfLikes = 0,
                        name = "men"
                    ),
                    Comment(
                        userImage = R.drawable.profileimage2,
                        comment = "I know ",
                        numberOfLikes = 5,
                        name = "lola"
                    ),
                    Comment(
                        userImage = R.drawable.profileimage6,
                        comment = "what is this",
                        numberOfLikes = 20,
                        name = "jamal"
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
                text = "hi everyone just I want asq hear in facebook \n if you have any comment or any thing put it in blow I mean comments ok  good day everyone it is just normal flow for everyone",
                keywords = listOf("fun", "keyword", "tags", "tag2"),
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
                        userImage = R.drawable.profileimage5,
                        comment = "I can't understand",
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
                ),
                isShowComments = true
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
                text = null,
                keywords = listOf(),
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
                isShowComments = false
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
                text = "hi gays what do you think about this two images I think it is a fun animals like if it happy or " +
                        "what please support me by put a comment and click like button in bottom left thanks everyone hi gays what do you think about this two images I think it is " +
                        "a fun animals like if it happy or what please support me by put a comment and click like button in bottom left thanks everyone",
                keywords = listOf(
                    "fun",
                    "animals",
                    "fun-animals",
                    "fun",
                    "animals",
                    "fun-animals",
                    "fun",
                    "animals",
                    "fun-animals"
                ),
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
                ),
                isShowComments = true
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
                text = "hi gays what do you think about this two images I think it is a fun animals like if it happy or what please support me by put a comment and click like button in bottom left thanks everyone hi gays what do you think about this two images I think it is a fun animals like if it happy or what please support me by put a comment and click like button in bottom left thanks everyone",
                keywords = listOf("books", "reading"),
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
                isShowComments = false
            )
        ),
        Response.NormalPost(
            NormalPostModel(
                image = R.drawable.imagepost1,
                userName = "noah2",
                userImage = R.drawable.profileimage2,
                time = "6h .",
                numberOfShares = 1,
                numberOfLikes = 30,
                numberOfComments = 5,
                icon = R.drawable.public_fill0_wght400_grad0_opsz24,
                text = "hi gays what do you think about this two images I think it is a fun animals like if it happy or what please support me by put a comment and click like button in bottom left thanks everyone hi gays what do you think about this two images I think it is a fun animals like if it happy or what please support me by put a comment and click like button in bottom left thanks everyone",
                keywords = listOf(),
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
                isShowComments = false
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
                text = null,
                keywords = listOf("music", "concert"),
                settingsText = "hi gays what do you think about this two images I think it is a fun animals like if it happy or what please support me by put a comment and click like button in bottom left thanks everyone hi gays what do you think about this two images I think it is a fun animals like if it happy or what please support me by put a comment and click like button in bottom left thanks everyone",
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
                text = textPotine,
                keywords = listOf("pets", "puppy", "potine"),
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
                ), isShowComments = true
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
                text = "Had an amazing time at the beach today!Had an amazing time at the beach today!Had an amazing time at the beach today!Had an amazing time at the beach today!Had an amazing time at the beach today!Had an amazing time at the beach today!",
                keywords = listOf("beach", "fun", "Had an amazing time at the beach today!"),
                settingsText = "Had an amazing time at the beach today!Had an amazing time at the beach today!Had an amazing time at the beach today!Had an amazing time at the beach today!Had an amazing time at the beach today!",
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
        Response.AdsPost(
            ads = AdsPostModel(
                image = R.drawable.adspost2,
                userImage = R.drawable.profileimage6,
                userName = "John Doe",
                time = "2h .",
                numberOfComments = 10,
                numberOfShares = 5,
                numberOfLikes = 100,
                icon = R.drawable.public_fill0_wght400_grad0_opsz24,
                textLink = "Learn More",
                textAds = "Check out our latest product!",
                text = "Introducing the all-new XYZ Smartphone. It's faster, smarter, and more affordable than ever!",
                keywords = listOf("Smartphone", "XYZ", "New Release"),
                settingsText = null,
                isWhatsAppAds = true,
                isShowComments = true,
                comments = listOf(
                    Comment(R.drawable.profileimage5, "Great product!", 15, "Alice Johnson"),
                    Comment(R.drawable.profileimage3, "I want one!", 5, "Bob Smith"),
                    Comment(R.drawable.myprofilelogo, "Impressive features!", 8, "Eva Anderson")
                )
            )
        ),
        Response.AdsPost(
            ads = AdsPostModel(
                image = R.drawable.adspost3,
                userImage = R.drawable.myprofilelogo,
                userName = "Fast Delivery",
                time = "1 day ago",
                numberOfComments = 5,
                numberOfShares = 3,
                numberOfLikes = 50,
                icon = R.drawable.public_fill0_wght400_grad0_opsz24,
                textLink = "Order Now",
                textAds = "Get your favorite food delivered to your doorstep!",
                text = """
            Craving your favorite dishes from local restaurants but don't want to go out? 
            We've got you covered. Order now and enjoy a hassle-free delivery experience. 
            With our fast and reliable service, your cravings are just a click away!
        """.trimIndent(),
                keywords = listOf("Delivery Service", "Food Delivery", "Local Restaurants"),
                settingsText = null, // Custom settings text
                isWhatsAppAds = true,
                isShowComments = true,
                comments = listOf(
                    Comment(R.drawable.profileimage6, "Always on time!", 12, "Anna Lee"),
                    Comment(R.drawable.myprofilelogo, "Love the variety!", 8, "David Clark"),
                    Comment(R.drawable.profileimage3, "Great service!", 10, "Sophia Smith")
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
        ),
        Response.AdsPost(
            ads = AdsPostModel(
                image = R.drawable.adspost1,
                userImage = R.drawable.profileimage9,
                userName = "TechZone",
                time = "3 hours ago",
                numberOfComments = 15,
                numberOfShares = 8,
                numberOfLikes = 120,
                icon = R.drawable.public_fill0_wght400_grad0_opsz24,
                textLink = "Learn More",
                textAds = "Upgrade Your Computing Experience with Our Latest PCs!",
                text = """
            Introducing the all-new TechZone PCs. Experience lightning-fast performance, 
            stunning graphics, and unparalleled productivity. Whether you're a gamer, 
            designer, or professional, our PCs are built to meet your needs.
        """.trimIndent(),
                keywords = listOf("PCs", "Computer Hardware", "Gaming PC"),
                settingsText = """Lorem ipsum dolor sit amet, consectetur
                    |adipiscing elit. Nulla facilisi. Sed nec quam ac justo
                    |feugiat sollicitudin. Vivamus vel justo
                    |in odio eleifend hendrerit. Proin cursus,
                    |metus ut ultrices commodo, ipsum metus auctor tortor, a
                    |commodo ex elit eget dolor. Fusce a justo euismod
                    |in ultricies odio, id euismod arcu. Suspendisse 
                    |potenti. Cras euismod nisi et bibendum convallis.\n""".trimMargin(),
                isWhatsAppAds = true,
                isShowComments = false,
                comments = listOf(
                    Comment(R.drawable.profileimage9, "I need one for gaming!", 10, "John Doe"),
                    Comment(R.drawable.care, "Impressive specs!", 8, "Jane Smith"),
                    Comment(R.drawable.profileimage3, "Can't wait to upgrade!", 12, "David Clark")
                )
            )
        ),
        Response.AdsPost(
            ads = AdsPostModel(
                image = R.drawable.adspost4,
                userImage = R.drawable.myprofilelogo,
                userName = "Delicious Eats",
                time = "2 hours ago",
                numberOfComments = 10,
                numberOfShares = 5,
                numberOfLikes = 100,
                icon = R.drawable.public_fill0_wght400_grad0_opsz24,
                textLink = "Order Now",
                textAds = "Craving your favorite food? We deliver!",
                text = "Satisfy your cravings with Delicious Eats. Explore a wide range of cuisines and enjoy doorstep delivery. Order now!",
                keywords = listOf("Food Delivery", "Cuisine", "Online Ordering"),
                settingsText = """Lorem ipsum dolor sit amet, consectetur
                    |adipiscing elit. Nulla facilisi. Sed nec quam ac justo
                    |feugiat sollicitudin. Vivamus vel justo
                    |in odio eleifend hendrerit. Proin cursus,
                    |metus ut ultrices commodo, ipsum metus auctor tortor, a
                    |commodo ex elit eget dolor. Fusce a justo euismod
                    |in ultricies odio, id euismod arcu. Suspendisse 
                    |potenti. Cras euismod nisi et bibendum convallis.\n""".trimMargin(),
                isWhatsAppAds = true,
                isShowComments = false,
                comments = listOf(
                    Comment(
                        R.drawable.profileimage9,
                        "Their pizza is amazing!",
                        15,
                        "Alice Johnson"
                    ),
                    Comment(
                        R.drawable.profileimage2,
                        "I order from them regularly.",
                        5,
                        "Bob Smith"
                    ),
                    Comment(R.drawable.profileimage6, "Quick delivery!", 8, "Eva Anderson")
                )
            )
        ),
        Response.AdsPost(
            ads = AdsPostModel(
                image = R.drawable.adspost5,
                userImage = R.drawable.myprofilelogo,
                userName = "Tasty Bites",
                time = "1 day ago",
                numberOfComments = 8,
                numberOfShares = 3,
                numberOfLikes = 70,
                icon = R.drawable.public_fill0_wght400_grad0_opsz24,
                textLink = "Reserve a Table",
                textAds = "Experience the flavors of our exquisite dishes!",
                text = """
            Discover a culinary journey like no other at Tasty Bites. Our chefs prepare 
            dishes that will tantalize your taste buds. Reserve a table for an unforgettable dining experience.
        """.trimIndent(),
                keywords = listOf("Restaurant", "Cuisine", "Fine Dining"),
                settingsText = """Lorem ipsum dolor sit amet, consectetur
                    |adipiscing elit. Nulla facilisi. Sed nec quam ac justo
                    |feugiat sollicitudin. Vivamus vel justo
                    |in odio eleifend hendrerit. Proin cursus,
                    |metus ut ultrices commodo, ipsum metus auctor tortor, a
                    |commodo ex elit eget dolor. Fusce a justo euismod
                    |in ultricies odio, id euismod arcu. Suspendisse 
                    |potenti. Cras euismod nisi et bibendum convallis.\n""".trimMargin(),
                isWhatsAppAds = true,
                isShowComments = false,
                comments = listOf(
                    Comment(R.drawable.profileimage4, "I love their seafood!", 12, "Anna Lee"),
                    Comment(R.drawable.profileimage7, "Great atmosphere!", 8, "David Clark"),
                    Comment(R.drawable.profileimage6, "Mouthwatering desserts!", 10, "Sophia Smith")
                )
            )
        ),
        Response.GroupPost(
            group = GroupPostModel(
                image = R.drawable.profileimage4,
                userImage = R.drawable.myprofilelogo,
                groupImage = R.drawable.imagepost2,
                groupName = "Outdoor Enthusiasts",
                userName = "William",
                time = "3h",
                numberOfComments = 5,
                numberOfShares = 4,
                numberOfLikes = 14,
                icon = R.drawable.group,
                text = "Enjoying a relaxing day at the park!",
                keywords = listOf("park", "relaxation"),
                settingsText = null,
                comments = listOf(
                    Comment(
                        userImage = R.drawable.profileimage4,
                        comment = "I love spending time outdoors!",
                        numberOfLikes = 2,
                        name = "Olivia"
                    ),
                    Comment(
                        userImage = R.drawable.profileimage5,
                        comment = "What park is this?",
                        numberOfLikes = 1,
                        name = "Emma"
                    ),
                    Comment(
                        userImage = R.drawable.profileimage7,
                        comment = "Looks like a perfect day!",
                        numberOfLikes = 1,
                        name = "Jack"
                    )
                ),
                isShowComments = false,
            )
        ),
        Response.GroupPost(
            group = GroupPostModel(
                image = R.drawable.imagepost4,
                userImage = R.drawable.profileimage8,
                groupImage = R.drawable.imagepost7,
                groupName = "Tech Enthusiasts",
                userName = "Sarah",
                time = "1d",
                numberOfComments = 8,
                numberOfShares = 2,
                numberOfLikes = 20,
                icon = R.drawable.group,
                text = "Just attended an amazing tech conference!",
                keywords = listOf("tech", "conference", "innovation"),
                settingsText = "Only group members can comment",
                comments = listOf(
                    Comment(
                        userImage = R.drawable.profileimage8,
                        comment = "I heard it was fantastic!",
                        numberOfLikes = 3,
                        name = "Mark"
                    ),
                    Comment(
                        userImage = R.drawable.profileimage7,
                        comment = "What were the key takeaways?",
                        numberOfLikes = 2,
                        name = "Emily"
                    ),
                    Comment(
                        userImage = R.drawable.profileimage6,
                        comment = "I wish I could have been there!",
                        numberOfLikes = 1,
                        name = "Alex"
                    ),
                    Comment(
                        userImage = R.drawable.profileimage4,
                        comment = "Let's discuss it at our next meetup!",
                        numberOfLikes = 0,
                        name = "Jessica"
                    )
                ),
                isShowComments = false
            )
        ),
        Response.GroupPost(
            group =GroupPostModel(
                image = R.drawable.imagepost2,
                userImage = R.drawable.profileimage6,
                groupImage = R.drawable.imagepost10,
                groupName = "Food Lovers",
                userName = "Michael",
                time = "5h",
                numberOfComments = 12,
                numberOfShares = 7,
                numberOfLikes = 32,
                icon = R.drawable.group,
                text = "Tried a new restaurant today, and the food was amazing!",
                keywords = listOf("food", "restaurant", "delicious"),
                settingsText = null,
                comments = listOf(
                    Comment(
                        userImage = R.drawable.profileimage5,
                        comment = "I've been wanting to go there!",
                        numberOfLikes = 4,
                        name = "Lisa"
                    ),
                    Comment(
                        userImage = R.drawable.profileimage8,
                        comment = "What did you order?",
                        numberOfLikes = 3,
                        name = "David"
                    ),
                    Comment(
                        userImage = R.drawable.adspost2,
                        comment = "You always find the best places!",
                        numberOfLikes = 2,
                        name = "Susan"
                    ),
                    Comment(
                        userImage = R.drawable.myprofilelogo,
                        comment = "Let's plan a group outing there!",
                        numberOfLikes = 3,
                        name = "Ryan"
                    ),
                    Comment(
                        userImage = R.drawable.profileimage6,
                        comment = "I'm hungry now!",
                        numberOfLikes = 1,
                        name = "Amber"
                    )
                ),
                isShowComments = false
            )
        ),
        Response.GroupPost(
            group =GroupPostModel(
                image = R.drawable.adspost5,
                userImage = R.drawable.profileimage8,
                groupImage = R.drawable.imagepost7,
                groupName = "Travel Enthusiasts",
                userName = "John",
                time = "2d",
                numberOfComments = 10,
                numberOfShares = 3,
                numberOfLikes = 25,
                icon = R.drawable.group,
                text = "Just returned from an amazing trip to the mountains!",
                keywords = listOf("travel", "mountains", "adventure"),
                settingsText = "Only group members can see this post",
                comments = listOf(
                    Comment(
                        userImage = R.drawable.profileimage3,
                        comment = "The photos you shared are breathtaking!",
                        numberOfLikes = 5,
                        name = "Linda"
                    ),
                    Comment(
                        userImage = R.drawable.profileimage1,
                        comment = "I need to plan a mountain trip too!",
                        numberOfLikes = 2,
                        name = "James"
                    ),
                    Comment(
                        userImage = R.drawable.profileimage6,
                        comment = "Tell us more about your adventure!",
                        numberOfLikes = 3,
                        name = "Emily"
                    )
                ),
                isShowComments = true
            )
        ),
        Response.GroupPost(
            group =GroupPostModel(
                image = R.drawable.adspost3,
                userImage = R.drawable.profileimage1,
                groupImage = R.drawable.imagepost5,
                groupName = "Art and Creativity",
                userName = "Anna",
                time = "4h",
                numberOfComments = 6,
                numberOfShares = 2,
                numberOfLikes = 18,
                icon = R.drawable.group,
                text = "Just finished a new painting today!",
                keywords = listOf("art", "painting", "creativity"),
                settingsText = null,
                comments = listOf(
                    Comment(
                        userImage = R.drawable.profileimage8,
                        comment = "Your art is always so inspiring!",
                        numberOfLikes = 3,
                        name = "Alex"
                    ),
                    Comment(
                        userImage = R.drawable.profileimage2,
                        comment = "Can't wait to see it! Share a photo?",
                        numberOfLikes = 2,
                        name = "Sophie"
                    ),
                    Comment(
                        userImage = R.drawable.profileimage4,
                        comment = "Your talent knows no bounds!",
                        numberOfLikes = 1,
                        name = "Lucas"
                    )
                ),
                isShowComments = true
            )
        ),
        Response.PeopleRecommendation(
            people = listOf(
                People(R.drawable.profileimage1, "Ahmed Smith", true),
                People(R.drawable.profileimage2, "Sarah Johnson", false),
                People(R.drawable.profileimage3, "Mohammed Brown", true),
                People(R.drawable.profileimage4, "Fatima Davis", false),
                People(R.drawable.profileimage5, "Ali Wilson", true),
                People(R.drawable.profileimage6, "Layla Martinez", true),
                People(R.drawable.profileimage7, "Ahlam White", false),
                People(R.drawable.profileimage9, "Khaled Lee", false)
            )
        ),
        Response.PeopleRecommendation(
            people = listOf(
                People(R.drawable.profileimage1, "Ahmed Smith", true),
                People(R.drawable.profileimage2, "Sarah Johnson", false),
                People(R.drawable.profileimage3, "Mohammed Brown", true),
                People(R.drawable.profileimage4, "Fatima Davis", false),
                People(R.drawable.profileimage5, "Ali Wilson", true),
                People(R.drawable.profileimage6, "Layla Martinez", true),
                People(R.drawable.profileimage7, "Ahlam White", false),
                People(R.drawable.profileimage9, "Khaled Lee", false)
            )
        )
    )


    suspend fun fetchPosts(): List<Response> {
        delay(1000)
        return data.shuffled()
    }
}
