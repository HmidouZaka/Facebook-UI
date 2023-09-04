package com.projectbyzakaria.facebookui.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.projectbyzakaria.facebookui.R
import com.projectbyzakaria.facebookui.model.Comment

@Composable
fun Comments(
    comment: Comment,
    modifier: Modifier = Modifier,
) {

    Column(
        modifier = modifier.padding(top = 8.dp)
    ) {
        Row {
            Image(
                painter = painterResource(id = comment.userImage),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .padding(8.dp)
                    .size(45.dp)
                    .clip(CircleShape)
                    .border(
                        width = 0.5.dp,
                        color = Color(0xFFCFCFCF),
                        shape = CircleShape
                    )
            )

            Column(
                modifier = Modifier.weight(1f)

            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 8.dp, end = 8.dp, bottom = 8.dp)
                        .clip(RoundedCornerShape(8.dp))
                        .background(Color(0xFFECECEC))
                        .padding(4.dp)
                ) {
                    Text(
                        text = comment.name,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Start,
                        maxLines = 1
                    )
                    Text(
                        text = comment.comment, fontSize = 16.sp,
                        fontWeight = FontWeight.Normal,
                        textAlign = TextAlign.Start,
                        maxLines = 5
                    )
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 8.dp),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Like",
                        color = MaterialTheme.colorScheme.secondary,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily(Font(R.font.robotoregular))
                    )
                    Spacer(modifier = Modifier.width(8.dp))

                    Text(
                        text = "Reply",
                        color = MaterialTheme.colorScheme.secondary,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily(Font(R.font.robotoregular))
                    )

                    if (comment.numberOfLikes != 0) {
                        Spacer(modifier = Modifier.weight(1f))
                        Text(
                            text = "${comment.numberOfLikes}",
                            fontSize = 13.sp,
                            color = MaterialTheme.colorScheme.secondary,
                            modifier = Modifier.padding(end = 4.dp)
                        )
                        Icon(
                            painter = painterResource(id = R.drawable.like),
                            contentDescription = "",
                            modifier = Modifier.padding(end = 8.dp).size(18.dp),
                            tint = Color.Unspecified
                        )
                    }

                }


            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Image(
                painter = painterResource(id = R.drawable.myprofilelogo),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(38.dp)
                    .clip(CircleShape)
                    .border(
                        width = 0.5.dp,
                        color = Color(0xFFCFCFCF),
                        shape = CircleShape
                    )
            )

            Box(
                modifier = Modifier
                    .padding(start = 8.dp)
                    .fillMaxWidth()
                    .clip(CircleShape)
                    .background(Color(0xFFECECEC))
                    .padding(8.dp),
                contentAlignment = Alignment.CenterStart
            ) {
                Text(text = "Write a comment...", fontSize = 16.sp,color=MaterialTheme.colorScheme.secondary)
            }
        }

    }


}

@Preview(showBackground = true)
@Composable
fun Comments() {
    Comments(
        Comment(
            userImage = R.drawable.profileimage6,
            comment = "Good job!",
            numberOfLikes = 1,
            name = "olivia"
        ),
        modifier = Modifier.fillMaxWidth()
    )
}