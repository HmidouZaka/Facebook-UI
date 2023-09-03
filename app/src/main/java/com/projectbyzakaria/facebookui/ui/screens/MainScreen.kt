package com.projectbyzakaria.facebookui.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
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
import androidx.compose.ui.graphics.Brush
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
import com.projectbyzakaria.facebookui.model.NormalPostModel
import com.projectbyzakaria.facebookui.model.Story
import com.projectbyzakaria.facebookui.ui.components.NormalPost

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    var storyListData = remember {
        StoryList().getData()
    }
    LazyColumn(
        modifier = modifier.background(Color(0xFF74767A)),
        verticalArrangement = Arrangement.spacedBy(8.dp)
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
                                .width(114.dp)
                                .height(210.dp)

                                .border(
                                    width = 1.dp,
                                    color = Color(0xFFDADADA),
                                    shape = RoundedCornerShape(12.dp)
                                ).clickable {  }
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.myprofilelogo),
                                contentDescription = "my logo",
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(150.dp),
                                contentScale = ContentScale.Crop
                            )

                            Box(
                                modifier = Modifier
                                    .align(Alignment.Center)
                                    .padding(top = 80.dp)
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
                                fontSize = 13.sp,

                                )
                        }
                    } else {
                        var item = storyListData[index - 1]
                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(12.dp))
                                .background(Color(0xFFEBEBEB))
                                .width(114.dp)
                                .height(210.dp)

                                .border(
                                    width = 1.dp,
                                    color = Color(0xFFDADADA),
                                    shape = RoundedCornerShape(12.dp)
                                ).clickable {  }
                        ) {
                            Image(
                                painter = painterResource(id = item.storyImage),
                                contentDescription = "my logo",
                                modifier = Modifier.fillMaxSize(),
                                contentScale = ContentScale.Crop
                            )

                            Spacer(modifier = Modifier.fillMaxSize()
                                .background(
                                    brush = Brush.verticalGradient(listOf(
                                        Color(0xFFFFFF),
                                        Color(0xFFFFFF),
                                        Color(0xB4424242),
                                    ))
                                ))


                            Image(
                                painter = painterResource(id = item.profileImage),
                                contentDescription = "profile image",
                                modifier = Modifier
                                    .padding(8.dp)
                                    .size(36.dp)
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
                                fontSize = 13.sp,
                                color = MaterialTheme.colorScheme.background,

                            )
                        }
                    }
                }
            }
        }
        items(10){
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
                    text = "Whatever\n" +
                            "Where does it come from?\n" +
                            "Contrary to popular belief, Lorem Ipsum is not simply random text. \n" +
                            "It has roots in a piece of classical Latin literature from 45 BC, \n" +
                            "making it over 2000 years old. Richard McClintock, \n" +
                            "a Latin professor at Hampden-Sydney College in Virginia, \n" +
                            "looked up one of the more obscure Latin words, consectetur,\n" +
                            "from a Lorem Ipsum passage, and going through the cites of the word \n" +
                            "in classical literature, discovered the undoubtable source.\n" +
                            "Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus \n" +
                            "Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, \n" +
                            "written in 45 BC. This book is a treatise on the theory of ethics,\n" +
                            "very popular during the Renaissance. The first line of Lorem Ipsum, \n" +
                            "\"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32.\n" +
                            "\n" +
                            "The standard chunk of Lorem Ipsum used since the 1500s is reproduced \n" +
                            "below for those interested. Sections 1.10.32 and 1.10.33 from \"de \n" +
                            "Finibus Bonorum et Malorum\" by Cicero are also reproduced in their \n" +
                            "exact original form, accompanied by English versions from the 1914 \n" +
                            "translation by H. Rackham.",
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
                modifier = Modifier
                    .fillMaxWidth()
                    .background(MaterialTheme.colorScheme.background)
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun MainScreen() {
    MainScreen(Modifier.fillMaxSize())
}