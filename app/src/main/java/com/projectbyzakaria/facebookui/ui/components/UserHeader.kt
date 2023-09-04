package com.projectbyzakaria.facebookui.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.projectbyzakaria.facebookui.R

@Composable
fun UserHeader(
    modifier: Modifier = Modifier,
    image: Int,
    name: String,
    time: String,
    icon: Int,
    onClickClose: () -> Unit,
    onClickMore: () -> Unit,
) {
    Row(
        modifier = modifier
    ) {
        Image(
            painter = painterResource(id = image),
            contentDescription = "image",
            modifier = Modifier
                .padding(8.dp)
                .size(44.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = Modifier
                .padding(top=8.dp,bottom=8.dp,end=8.dp)
                .height(50.dp)
                .weight(1f),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = name,
                textAlign = TextAlign.Start,
                color = MaterialTheme.colorScheme.onBackground,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
            Spacer(modifier = Modifier.height(4.dp))
            Row {
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
fun UserHeaderPreview() {
    UserHeader(
        Modifier.fillMaxWidth(),
        image = R.drawable.profileimage1,
        name = "Ahmed ahmed",
        time = "20h .",
        icon = R.drawable.group, {}, {})
}