package com.projectbyzakaria.facebookui.ui.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.projectbyzakaria.facebookui.R
import com.projectbyzakaria.facebookui.model.People
import com.projectbyzakaria.facebookui.ui.theme.Purple80
import com.projectbyzakaria.facebookui.ui.theme.PurpleGrey80

@Composable
fun PeopleComponent(
    people: People,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .clip(RoundedCornerShape(topEnd = 8.dp, topStart = 8.dp))
            .border(
                width = 0.5.dp,
                color = Color(0xFFD5D5D5),
                shape = RoundedCornerShape(8.dp)
            )
    ) {
        Image(
            painter = painterResource(
                id = people.imageProfile
            ), contentDescription = "",
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
                .clip(RoundedCornerShape(topEnd = 8.dp, topStart = 8.dp)),
            contentScale = ContentScale.Crop
        )

        Column(
            modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
        ) {
            Text(
                text = people.name,
                fontSize = 16.sp,
                maxLines = 1,
                fontWeight = FontWeight.W500
            )
            if (people.isHaveSameFriend) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(
                            id = people.imageProfile
                        ), contentDescription = "",
                        modifier = Modifier
                            .size(16.dp)
                            .clip(CircleShape),
                        contentScale = ContentScale.Crop
                    )
                    Spacer(modifier = Modifier.width(2.dp))
                    Text(text = "1 mutual Friend", fontSize = 12.sp, color = Color(0xFF949494))
                }
                Spacer(modifier = Modifier.height(10.dp))
            } else {
                Spacer(modifier = Modifier.height(26.dp))
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Button(
                    onClick = { },
                    shape = RoundedCornerShape(4.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Purple80,
                        contentColor = MaterialTheme.colorScheme.background
                    ),
                    contentPadding = PaddingValues(0.dp),
                    modifier = Modifier
                        .height(30.dp)
                        .width(120.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.add_person),
                        contentDescription = "add fr",
                        modifier = Modifier.height(18.dp),
                        tint = MaterialTheme.colorScheme.background,
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(text = "Add Friend")
                }
                Spacer(modifier = Modifier.width(8.dp))
                Button(
                    onClick = { },
                    shape = RoundedCornerShape(4.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFFDFDFDF),
                        contentColor = MaterialTheme.colorScheme.onBackground
                    ),
                    contentPadding = PaddingValues(0.dp),
                    modifier = Modifier
                        .width(75.dp)
                        .height(30.dp)
                ) {
                    Text(text = "Remove", fontSize = 14.sp)
                }
            }
        }
    }
}


@OptIn(ExperimentalFoundationApi::class)
@Preview(showBackground = true)
@Composable
fun PeopleComponentPreview() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        PeopleComponent(
            people = People(
                imageProfile = R.drawable.profileimage3,
                name = "Name User"
            ),
            modifier = Modifier.width(224.dp)
        )

        Spacer(modifier = Modifier.height(10.dp))

        HorizontalPager(
            pageCount = 8,
            contentPadding = PaddingValues(0.dp),
            modifier = Modifier.fillMaxWidth(),
            pageSize = PageSize.Fixed(224.dp),
            pageSpacing = 8.dp
        ) {
            PeopleComponent(
                people = People(
                    imageProfile = R.drawable.profileimage3,
                    name = "Name User",
                    isHaveSameFriend = true
                ),
                modifier = Modifier.width(250.dp)
            )
        }
    }
}


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PeopleRecommendation(
    modifier: Modifier = Modifier,
    list: List<People>,
) {
    Column(
        modifier
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 8.dp)
                .padding(top = 8.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "People You May be Know")
            Icon(painter = painterResource(id = R.drawable.more_hori), contentDescription = "more")
        }
        HorizontalPager(
            pageCount = list.size,
            contentPadding = PaddingValues(horizontal = 8.dp),
            modifier = Modifier.fillMaxWidth(),
            pageSize = PageSize.Fixed(224.dp),
            pageSpacing = 8.dp
        ) {
            PeopleComponent(
                people = list[it],
                modifier = Modifier.width(250.dp)
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "See All",
                modifier = Modifier.padding(vertical = 9.dp),
                color = Color(0xFF858585),
                fontSize = 12.sp
            )
            Icon(
                imageVector = Icons.Default.KeyboardArrowRight,
                contentDescription = "more",
                modifier = Modifier.size(18.dp),
                tint = Color(0xFF858585)
            )
        }


    }
}


@OptIn(ExperimentalFoundationApi::class)
@Preview(showBackground = true)
@Composable
fun PeopleComponentPreview2() {
    PeopleRecommendation(
        modifier = Modifier.fillMaxWidth(),
        list = listOf(
            People(
                imageProfile = R.drawable.profileimage3,
                name = "Name User"
            ),
            People(
                imageProfile = R.drawable.profileimage9,
                name = "Name User",
                isHaveSameFriend = true
            ),
            People(
                imageProfile = R.drawable.profileimage3,
                name = "Name User"
            )
        )
    )


}


