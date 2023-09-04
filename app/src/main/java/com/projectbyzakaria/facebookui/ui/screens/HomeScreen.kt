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
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.projectbyzakaria.facebookui.R
import com.projectbyzakaria.facebookui.ui.presintation.MainViewModel
import com.projectbyzakaria.facebookui.ui.theme.FacebookUITheme
import kotlinx.coroutines.launch


@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    viewModel: MainViewModel
) {

    val coroutineScope = rememberCoroutineScope()
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
                    modifier = Modifier.fillMaxWidth(),
                ) {

                    Tab(
                        selected = pagerState.currentPage == 0,
                        onClick = {
                            coroutineScope.launch {
                                pagerState.animateScrollToPage(0)
                            }
                        },
                        modifier = Modifier.height(50.dp),
                        selectedContentColor = MaterialTheme.colorScheme.primary,
                        unselectedContentColor = MaterialTheme.colorScheme.secondary
                    ) {
                        Icon(
                            painter = painterResource(id = if (pagerState.currentPage == 0) R.drawable.selected_home else R.drawable.home),
                            contentDescription = "home",
                            modifier = Modifier
                                .size(40.dp)
                                .padding(6.dp),

                            )
                    }

                    Tab(
                        selected = pagerState.currentPage == 1,
                        onClick = {
                            coroutineScope.launch {
                                pagerState.animateScrollToPage(1)
                            }
                        },
                        modifier = Modifier.height(50.dp),
                        selectedContentColor = MaterialTheme.colorScheme.primary,
                        unselectedContentColor = MaterialTheme.colorScheme.secondary
                    ) {
                        Icon(
                            painter = painterResource(id = if (pagerState.currentPage == 1) R.drawable.selected_group else R.drawable.group),
                            contentDescription = "group",
                            modifier = Modifier
                                .size(40.dp)
                                .padding(6.dp)
                        )
                    }

                    Tab(
                        selected = pagerState.currentPage == 2,
                        onClick = {
                            coroutineScope.launch {
                                pagerState.animateScrollToPage(2)
                            }
                        },
                        modifier = Modifier.height(50.dp),
                        selectedContentColor = MaterialTheme.colorScheme.primary,
                        unselectedContentColor = MaterialTheme.colorScheme.secondary
                    ) {
                        Icon(
                            painter = painterResource(id = if (pagerState.currentPage == 2) R.drawable.selected_videos else R.drawable.videos),
                            contentDescription = "video",
                            modifier = Modifier
                                .size(40.dp)
                                .padding(6.dp)
                        )
                    }

                    Tab(
                        selected = pagerState.currentPage == 3,
                        onClick = {
                            coroutineScope.launch {
                                pagerState.animateScrollToPage(3)
                            }
                        },
                        modifier = Modifier.height(50.dp),
                        selectedContentColor = MaterialTheme.colorScheme.primary,
                        unselectedContentColor = MaterialTheme.colorScheme.secondary
                    ) {
                        Icon(
                            painter = painterResource(id = if (pagerState.currentPage == 3) R.drawable.selected_store else R.drawable.store),
                            contentDescription = "store",
                            modifier = Modifier
                                .size(40.dp)
                                .padding(6.dp)
                        )
                    }

                    Tab(
                        selected = pagerState.currentPage == 4,
                        onClick = {
                            coroutineScope.launch {
                                pagerState.animateScrollToPage(4)
                            }
                        },
                        modifier = Modifier.height(50.dp),
                        selectedContentColor = MaterialTheme.colorScheme.primary,
                        unselectedContentColor = MaterialTheme.colorScheme.secondary
                    ) {

                        Icon(
                            painter = painterResource(
                                id = if (pagerState.currentPage == 4)
                                    R.drawable.selected_notification
                                else R.drawable.notification
                            ),
                            contentDescription = "notification",
                            modifier = Modifier
                                .size(40.dp)
                                .padding(6.dp)
                        )

                    }

                    Tab(
                        selected = pagerState.currentPage == 5,
                        onClick = {
                            coroutineScope.launch {
                                pagerState.animateScrollToPage(5)
                            }
                        },
                        modifier = Modifier.height(50.dp),
                        selectedContentColor = MaterialTheme.colorScheme.primary,
                        unselectedContentColor = MaterialTheme.colorScheme.secondary
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
                when (it) {
                    0 -> {
                        val posts by viewModel.posts.collectAsState()
                        if (posts.isEmpty()){

                        }else{
                            MainScreen(Modifier.fillMaxSize(),posts)
                        }
                    }
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

