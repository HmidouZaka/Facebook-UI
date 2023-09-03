package com.projectbyzakaria.facebookui.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.projectbyzakaria.facebookui.R

@Composable
fun PostActions(
    modifier:Modifier = Modifier
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(
            modifier = Modifier
                .clickable {  }
                .weight(1f)
                .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Icon(
                painter = painterResource(id = R.drawable.like_button),
                contentDescription = "like",
                modifier = Modifier.size(18.dp),
                tint = MaterialTheme.colorScheme.secondary
            )
            Spacer(modifier = Modifier.padding(2.dp))
            Text(
                text = "Like",
                fontSize = 13.sp,
                color = MaterialTheme.colorScheme.secondary,
                modifier = Modifier,
                textAlign = TextAlign.Start
            )
        }
        Row(
            modifier = Modifier          .clickable {  }
                .weight(1f)
                .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Icon(
                painter = painterResource(id = R.drawable.comment),
                contentDescription = "like",
                modifier = Modifier.size(18.dp),
                tint = MaterialTheme.colorScheme.secondary
            )
            Spacer(modifier = Modifier.padding(2.dp))
            Text(
                text = "Comment",
                fontSize = 13.sp,
                color = MaterialTheme.colorScheme.secondary,
                modifier = Modifier,
                textAlign = TextAlign.Start
            )
        }
        Row(
            modifier = Modifier          .clickable {  }
                .weight(1f)
                .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Icon(
                painter = painterResource(id = R.drawable.share),
                contentDescription = "like",
                modifier = Modifier.size(18.dp),
                tint = MaterialTheme.colorScheme.secondary
            )
            Spacer(modifier = Modifier.padding(2.dp))
            Text(
                text = "Share",
                fontSize = 13.sp,
                color = MaterialTheme.colorScheme.secondary,
                modifier = Modifier,
                textAlign = TextAlign.Start
            )
        }
    }
}