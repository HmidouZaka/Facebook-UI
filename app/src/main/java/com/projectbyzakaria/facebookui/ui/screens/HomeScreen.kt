package com.projectbyzakaria.facebookui.ui.screens

import MenuScreen
import NotificationsScreen
import StoreScreen
import VideoScreen
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.projectbyzakaria.facebookui.R
import com.projectbyzakaria.facebookui.ui.theme.FacebookUITheme


@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
) {


    val pagerState = rememberPagerState(initialPage = 0)

    Scaffold(
        modifier = modifier,
        topBar = {
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                TopAppBar(
                    title = {
                        Image(
                            painter = painterResource(id = R.drawable.facebook_logo),
                            contentDescription = "",
                            modifier = Modifier.height(60.dp)
                        )
                    },
                    modifier = Modifier.fillMaxWidth(),
                    actions = {
                        val modifierButtons = Modifier
                            .padding(horizontal = 4.dp)
                            .size(35.dp)
                            .clip(CircleShape)
                            .background(Color(0xFFEBEBEB))

                        Box(
                            modifier = modifierButtons,
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                painter = painterResource(
                                    id = R.drawable.add
                                ),
                                contentDescription = "add",
                                tint = MaterialTheme.colorScheme.onBackground,
                                modifier = Modifier.size(24.dp)
                            )
                        }

                        Box(
                            modifier = modifierButtons,
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                painter = painterResource(
                                    id = R.drawable.search
                                ),
                                contentDescription = "search",
                                tint = MaterialTheme.colorScheme.onBackground,
                                modifier = Modifier.size(24.dp)
                            )
                        }



                        Box(
                            modifier = modifierButtons,
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                painter = painterResource(
                                    id = R.drawable.messenger
                                ),
                                contentDescription = "messanger",
                                tint = MaterialTheme.colorScheme.onBackground,
                                modifier = Modifier.size(24.dp)
                            )
                        }


                    }
                )

                TabRow(
                    selectedTabIndex = pagerState.currentPage,
                    modifier = Modifier.fillMaxWidth()
                ) {

                    Tab(
                        selected = pagerState.currentPage == 0,
                        onClick = { },
                        modifier = Modifier.height(50.dp)
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.home),
                            contentDescription = "home",
                            modifier = Modifier
                                .size(40.dp)
                                .padding(6.dp),

                        )
                    }

                    Tab(
                        selected = pagerState.currentPage == 1,
                        onClick = { },
                        modifier = Modifier.height(50.dp)
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.group),
                            contentDescription = "group",
                            modifier = Modifier
                                .size(40.dp)
                                .padding(6.dp)
                        )
                    }

                    Tab(
                        selected = pagerState.currentPage == 2,
                        onClick = { },
                        modifier = Modifier.height(50.dp)
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.videos),
                            contentDescription = "video",
                            modifier = Modifier
                                .size(40.dp)
                                .padding(6.dp)
                        )
                    }

                    Tab(
                        selected = pagerState.currentPage == 3,
                        onClick = { },
                        modifier = Modifier.height(50.dp)
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.store),
                            contentDescription = "store",
                            modifier = Modifier
                                .size(40.dp)
                                .padding(6.dp)
                        )
                    }

                    Tab(
                        selected = pagerState.currentPage == 4,
                        onClick = { },
                        modifier = Modifier.height(50.dp)
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.notifications),
                            contentDescription = "notification",
                            modifier = Modifier
                                .size(40.dp)
                                .padding(6.dp)
                        )
                    }

                    Tab(
                        selected = pagerState .currentPage== 5,
                        onClick = { },
                        modifier = Modifier.height(50.dp)
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.menu),
                            contentDescription = "menu",
                            modifier = Modifier
                                .size(40.dp)
                                .padding(6.dp)
                        )
                    }

                }
            }
        }
    ) {
        Column(
            modifier = Modifier.padding(it)
        ) {
           HorizontalPager(pageCount = 6, state = pagerState) {
               when(it){
                   0 -> MainScreen(Modifier.fillMaxSize())
                   1 -> GroupScreen(Modifier.fillMaxSize())
                   2 -> VideoScreen(Modifier.fillMaxSize())
                   3 -> StoreScreen(Modifier.fillMaxSize())
                   4 -> NotificationsScreen(Modifier.fillMaxSize())
                   5 -> MenuScreen(Modifier.fillMaxSize())
               }
           }
        }
    }


}


@Preview
@Composable
fun HomeScreen() {
    FacebookUITheme {
        HomeScreen(modifier = Modifier.fillMaxSize())
    }
}