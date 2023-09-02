package com.projectbyzakaria.facebookui.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.projectbyzakaria.facebookui.R
import com.projectbyzakaria.facebookui.data.StoryList
import com.projectbyzakaria.facebookui.model.Story

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    var storyListData = remember {
        StoryList().getData()
    }
    LazyColumn(
        modifier = modifier.background(MaterialTheme.colorScheme.secondary),
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        item {
            Row(
                modifier = Modifier
                    .background(MaterialTheme.colorScheme.background)
                    .padding(8.dp)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.myprofilelogo),
                    contentDescription = "discreption",
                    modifier = Modifier
                        .size(35.dp)
                        .clip(CircleShape)
                        .border(width = 1.dp, color = Color(0xFFECECEC), CircleShape),
                    alignment = Alignment.Center
                )

                Box(
                    modifier = Modifier
                        .padding(horizontal = 8.dp)
                        .weight(1f)
                        .border(width = 1.dp, color = Color(0xFFECECEC), CircleShape)
                        .clip(CircleShape),
                    contentAlignment = Alignment.CenterStart
                ) {
                    Text(
                        text = "What's on your mind?",
                        fontSize = 16.sp,
                        modifier = Modifier.padding(8.dp),
//                        fontFamily = FontFamily(Font(R.font.klavika_medium))
                    )
                }

                Icon(
                    painter = painterResource(id = R.drawable.newpost_icon),
                    contentDescription = "new post",
                    modifier = Modifier
                        .size(24.dp),
                    tint = Color(0xFF0FAA16)
                )
            }
        }
        item {
            LazyRow(
                modifier = Modifier
                    .background(MaterialTheme.colorScheme.background)
                    .fillMaxWidth()
                    .padding(8.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                items(storyListData.size + 1) { index: Int ->
                    if (index == 0) {
                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(12.dp))
                                .background(Color(0xFFEBEBEB))
                                .width(110.dp)
                                .height(210.dp)

                                .border(
                                    width = 1.dp,
                                    color = Color(0xFFDADADA),
                                    shape = RoundedCornerShape(12.dp)
                                )
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.myprofilelogo),
                                contentDescription = "my logo",
                                modifier = Modifier.fillMaxWidth()
                            )

                            Box(
                                modifier = Modifier
                                    .align(Alignment.Center)
                                    .padding(top = 24.dp)
                                    .size(28.dp)
                                    .clip(CircleShape)
                                    .background(MaterialTheme.colorScheme.primary),
                                contentAlignment = Alignment.Center
                            ) {
                                Icon(
                                    painter = painterResource(id = R.drawable.add),
                                    contentDescription = "add story",
                                    tint = MaterialTheme.colorScheme.background
                                )
                            }

                            Text(
                                text = "Create Story",
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(4.dp)
                                    .align(Alignment.BottomCenter),
                                textAlign = TextAlign.Center,
                                fontSize = 12.sp,

                                )
                        }
                    } else {
                        var item = storyListData[index - 1]
                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(12.dp))
                                .background(Color(0xFFEBEBEB))
                                .width(110.dp)
                                .height(210.dp)

                                .border(
                                    width = 1.dp,
                                    color = Color(0xFFDADADA),
                                    shape = RoundedCornerShape(12.dp)
                                )
                        ) {
                            Image(
                                painter = painterResource(id = item.storyImage),
                                contentDescription = "my logo",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )


                            Image(
                                painter = painterResource(id = item.profileImage),
                                contentDescription = "profile image",
                                modifier = Modifier
                                    .padding(8.dp)
                                    .size(30.dp)
                                    .border(
                                        width = 1.dp,
                                        color = MaterialTheme.colorScheme.primary,
                                        shape = CircleShape
                                    )
                                    .clip(CircleShape),
                                contentScale = ContentScale.Crop
                            )





                            Text(
                                text = item.namePerson,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(4.dp)
                                    .align(Alignment.BottomCenter),
                                textAlign = TextAlign.Start,
                                fontSize = 12.sp,
                                color = MaterialTheme.colorScheme.background,

                            )
                        }
                    }
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun MainScreen() {
    MainScreen(Modifier.fillMaxSize())
}