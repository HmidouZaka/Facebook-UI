package com.projectbyzakaria.facebookui.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.projectbyzakaria.facebookui.R
import com.projectbyzakaria.facebookui.model.Comment
import com.projectbyzakaria.facebookui.model.GroupPostModel
import com.projectbyzakaria.facebookui.model.NormalPostModel

@Composable
fun GroupPost(
    normalPost: GroupPostModel,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
    ) {
        HeaderGroup(
            image = normalPost.userImage,
            name = normalPost.userName,
            time = normalPost.time,
            icon = normalPost.icon,
            onClickClose = { },
            onClickMore = {},
            groupImage = normalPost.groupImage,
            nameGroup = normalPost.groupName,
            modifier = Modifier.fillMaxWidth()
        )

        if (normalPost.text == null && normalPost.settingsText != null) {
            SettingText(text = normalPost.settingsText)
        } else {
            TextPost(text = normalPost.text, keywords = normalPost.keywords)
        }

        Image(
            painter = painterResource(id = normalPost.image),
            contentDescription = "post image",
            modifier = Modifier
                .fillMaxWidth()
                .heightIn(max = 500.dp),
            contentScale = ContentScale.Crop,
        )

        if (normalPost.text != null && normalPost.settingsText != null) {
            SettingText(text = normalPost.settingsText)
        }

        ResultsNumbers(
            numberOfComments = normalPost.numberOfComments,
            numberOfLikes = normalPost.numberOfLikes,
            numberOfShares = normalPost.numberOfShares,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp)
                .background(MaterialTheme.colorScheme.secondary)
                .height(0.4.dp)
        )


        PostActions(
            modifier = Modifier.fillMaxWidth()
        )

        if (normalPost.isShowComments && normalPost.comments.isNotEmpty()) {
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp)
                    .background(MaterialTheme.colorScheme.secondary)
                    .height(0.4.dp)
            )
            Comments(
                comment = normalPost.comments.get(0),
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GroupPostPost() {
    GroupPost(
        normalPost = GroupPostModel(
            image = R.drawable.profileimage1,
            userImage = R.drawable.profileimage6,
            userName = "ahmed ahmed",
            time = "20h .",
            numberOfComments = 20,
            numberOfLikes = 103,
            numberOfShares = 6,
            icon = R.drawable.public_fill0_wght400_grad0_opsz24,
            text = "text test ".repeat(20),
            keywords = listOf(
                "keyword 1",
                "keyword 1",
                "keyword 1",
                "keyword 1",
                "keyword 1",
                "keyword 1",
                "keyword 1",
                "keyword 1",
                "keyword 1",
                "keyword 1",
                "keyword 1",
                "keyword 1",
                "keyword 1",
                "keyword 1",
            ), groupImage = R.drawable.myprofilelogo, groupName = "group name"
        ),
        modifier = Modifier.fillMaxWidth()
    )
}

@Preview(showBackground = true)
@Composable
fun GroupPostPostComment() {
    GroupPost(
        normalPost = GroupPostModel(
            image = R.drawable.profileimage1,
            userImage = R.drawable.profileimage6,
            userName = "ahmed ahmed",
            time = "20h .",
            numberOfComments = 20,
            numberOfLikes = 103,
            numberOfShares = 6,
            icon = R.drawable.public_fill0_wght400_grad0_opsz24,
            text = "text test ".repeat(20),
            keywords = listOf(
                "keyword 1",
                "keyword 1",
                "keyword 1",
                "keyword 1",
                "keyword 1",
                "keyword 1",
                "keyword 1",
                "keyword 1",
                "keyword 1",
                "keyword 1",
                "keyword 1",
                "keyword 1",
                "keyword 1",
                "keyword 1",
            ),
            comments = listOf(
                Comment(
                    userImage = R.drawable.profileimage7,
                    comment = "I love the beach!",
                    numberOfLikes = 2,
                    name = "ava"
                )
            ),
            isShowComments = true, groupImage = R.drawable.myprofilelogo, groupName = "group name"
        ),
        modifier = Modifier.fillMaxWidth(),
    )
}


@Preview(showBackground = true)
@Composable
fun GroupPostPostSettingsWithText() {
    GroupPost(
        normalPost = GroupPostModel(
            image = R.drawable.profileimage1,
            userImage = R.drawable.profileimage6,
            userName = "ahmed ahmed",
            time = "20h .",
            numberOfComments = 20,
            numberOfLikes = 103,
            numberOfShares = 6,
            icon = R.drawable.public_fill0_wght400_grad0_opsz24,
            text = null,
            keywords = listOf(
                "keyword 1",
                "keyword 1",
                "keyword 1",
                "keyword 1",
                "keyword 1",
                "keyword 1",
                "keyword 1",
                "keyword 1",
                "keyword 1",
                "keyword 1",
                "keyword 1",
                "keyword 1",
                "keyword 1",
                "keyword 1",
            ),
            comments = listOf(
                Comment(
                    userImage = R.drawable.profileimage7,
                    comment = "I love the beach!",
                    numberOfLikes = 2,
                    name = "ava"
                )
            ),
            isShowComments = true,
            settingsText = "It has roots in a piece of classical Latin literature from 45 BC, \n" +
                    "making it over 2000 years old. Richard McClintock, \n" +
                    "a Latin professor at Hampden-Sydney College in Virginia, \n",
            groupImage = R.drawable.myprofilelogo, groupName = "group name"
        ),
        modifier = Modifier.fillMaxWidth(),
    )
}

@Preview(showBackground = true)
@Composable
fun GroupPostPostSettings() {
    GroupPost(
        normalPost = GroupPostModel(
            image = R.drawable.profileimage1,
            userImage = R.drawable.profileimage6,
            userName = "ahmed ahmed",
            time = "20h .",
            numberOfComments = 20,
            numberOfLikes = 103,
            numberOfShares = 6,
            icon = R.drawable.public_fill0_wght400_grad0_opsz24,
            text = "tes test ".repeat(10),
            keywords = listOf(
                "keyword 1",
                "keyword 1",
                "keyword 1",
                "keyword 1",
                "keyword 1",
                "keyword 1",
                "keyword 1",
                "keyword 1",
                "keyword 1",
                "keyword 1",
                "keyword 1",
                "keyword 1",
                "keyword 1",
                "keyword 1",
            ),
            comments = listOf(
                Comment(
                    userImage = R.drawable.profileimage7,
                    comment = "I love the beach!",
                    numberOfLikes = 2,
                    name = "ava"
                )
            ),
            isShowComments = true,
            settingsText = "It has roots in a piece of classical Latin literature from 45 BC, \n" +
                    "making it over 2000 years old. Richard McClintock, \n" +
                    "a Latin professor at Hampden-Sydney College in Virginia, \n",
            groupImage = R.drawable.myprofilelogo, groupName = "group name"
        ),
        modifier = Modifier.fillMaxWidth(),
    )
}


@Preview(showBackground = true)
@Composable
fun GroupPostPost2() {
    GroupPost(
        normalPost = GroupPostModel(
            image = R.drawable.profileimage5,
            userImage = R.drawable.profileimage2,
            userName = "ahmed ahmed",
            time = "20h .",
            numberOfComments = 20,
            numberOfLikes = 103,
            numberOfShares = 6,
            icon = R.drawable.public_fill0_wght400_grad0_opsz24,
            text = null,
            groupImage = R.drawable.myprofilelogo, groupName = "group name"
        ),
        modifier = Modifier.fillMaxWidth()
    )
}