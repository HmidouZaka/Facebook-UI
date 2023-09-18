package com.projectbyzakaria.facebookui.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.projectbyzakaria.facebookui.R


@Composable
fun HeaderGroup(
    image: Int,
    groupImage: Int,
    nameGroup: String,
    name: String,
    time: String,
    icon: Int,
    onClickClose: () -> Unit,
    onClickMore: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier
    ) {
        Box(
            modifier = Modifier.padding(start = 10.dp, top = 10.dp, bottom =10.dp)
        ) {
            Image(
                painter = painterResource(id = groupImage),
                contentDescription = "image",
                modifier = Modifier
                    .size(45.dp)
                    .clip(RoundedCornerShape(15.dp))
                    .border(
                        width = 0.5.dp,
                        color = Color(0xFFC2C2C2),
                        shape = RoundedCornerShape(15.dp)
                    ),
                contentScale = ContentScale.Crop,
                alignment = Alignment.Center

            )
            Image(
                painter = painterResource(id = image),
                contentDescription = "image",
                modifier = Modifier
                    .zIndex(1f)
                    .align(Alignment.BottomEnd)
                    .offset(4.dp, 4.dp)
                    .size(25.dp)
                    .clip(CircleShape)
                    .border(
                        width = 1.5.dp,
                        color = MaterialTheme.colorScheme.background,
                        shape = CircleShape
                    )
            )
        }

        Column(
            modifier = Modifier
                .padding(8.dp)
                .height(50.dp)
                .weight(1f),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = nameGroup,
                textAlign = TextAlign.Start,
                color = MaterialTheme.colorScheme.onBackground,
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
            Spacer(modifier = Modifier.height(4.dp))
            Row {

                Text(
                    text = "$name .",
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.secondary,

                    )
                Spacer(modifier = Modifier.padding(end = 4.dp))
                Text(
                    text = time,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.W400,
                    color = MaterialTheme.colorScheme.secondary
                )
                Spacer(modifier = Modifier.height(4.dp))

                Icon(
                    painter = painterResource(id = icon),
                    contentDescription = "Close",
                    modifier = Modifier
                        .size(16.dp),
                    tint = Color(0xFF6D6D6F)
                )
            }
        }

        Icon(
            painter = painterResource(id = R.drawable.more_hori),
            contentDescription = "Close",
            modifier = Modifier
                .padding(8.dp)
                .size(24.dp)
                .clip(CircleShape)
                .clickable { onClickMore() },
            tint = Color(0xFF6D6D6F)
        )
        Icon(
            painter = painterResource(id = R.drawable.close),
            contentDescription = "Close",
            modifier = Modifier
                .padding(8.dp)
                .size(24.dp)
                .clip(CircleShape)
                .clickable { onClickClose() },
            tint = Color(0xFF6D6D6F),

            )
    }
}

@Preview(showBackground = true)
@Composable
fun HeaderGroupPreview() {
    HeaderGroup(
        groupImage = R.drawable.profileimage5,
        image = R.drawable.profileimage1,
        name = "Ahmed ahmed",
        nameGroup = "Name Group",
        time = "20h .",
        icon = R.drawable.group, onClickMore = {}, onClickClose = {},
        modifier = Modifier.fillMaxWidth()
    )
}