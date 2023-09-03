package com.projectbyzakaria.facebookui.ui.components

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.projectbyzakaria.facebookui.R
import com.projectbyzakaria.facebookui.model.NormalPostModel

@Composable
fun NormalPost(
    normalPost: NormalPostModel,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
    ) {
        UserHeader(
            image = normalPost.userImage,
            name = normalPost.userName,
            time = normalPost.time,
            icon = normalPost.icon,
            onClickClose = { },
            onClickMore = {}
        )

        TextPost(text = normalPost.text, keywords = normalPost.keywords )

        Image(
            painter = painterResource(id = normalPost.image),
            contentDescription = "post image",
            modifier = Modifier
                .fillMaxWidth()
                .heightIn(max = 300.dp),
            contentScale = ContentScale.Crop,
        )

        ResultsNumbers(numberOfComments =normalPost.numberOfComments, numberOfLikes =normalPost.numberOfLikes, numberOfShares = normalPost.numberOfShares, modifier = Modifier.fillMaxWidth())

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
    }
}


@Preview(showBackground = true)
@Composable
fun NormalPost() {
    NormalPost(
        normalPost = NormalPostModel(
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
            )
        ),
        modifier = Modifier.fillMaxWidth()
    )
}

@Preview(showBackground = true)
@Composable
fun NormalPost2() {
    NormalPost(
        normalPost = NormalPostModel(
            image = R.drawable.profileimage5,
            userImage = R.drawable.profileimage2,
            userName = "ahmed ahmed",
            time = "20h .",
            numberOfComments = 20,
            numberOfLikes = 103,
            numberOfShares = 6,
            icon = R.drawable.public_fill0_wght400_grad0_opsz24,
            text = null
        ),
        modifier = Modifier.fillMaxWidth()
    )
}