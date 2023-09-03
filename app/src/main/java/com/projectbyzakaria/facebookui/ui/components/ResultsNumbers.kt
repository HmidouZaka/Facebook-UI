package com.projectbyzakaria.facebookui.ui.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.projectbyzakaria.facebookui.R
import com.projectbyzakaria.facebookui.model.NormalPostModel

@Composable
fun ResultsNumbers(
    numberOfComments:Int,
    numberOfLikes:Int,
    numberOfShares:Int,
    modifier: Modifier = Modifier
) {

    Row(
        modifier = modifier.padding(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(id = R.drawable.like),
            contentDescription = "like",
            modifier = Modifier
                .size(18.dp)
                .border(
                    width = 0.5.dp,
                    color = MaterialTheme.colorScheme.background,
                    shape = CircleShape
                )
                .zIndex(1f),
            tint = Color.Unspecified
        )
        Icon(
            painter = painterResource(id = R.drawable.love),
            contentDescription = "like",
            modifier = Modifier
                .offset(x = -4.dp)
                .size(18.dp)
                .border(
                    width = 0.5.dp,
                    color = MaterialTheme.colorScheme.background,
                    shape = CircleShape
                ),
            tint = Color.Unspecified
        )

        Text(
            text = "$numberOfLikes",
            fontSize = 13.sp,
            color = MaterialTheme.colorScheme.secondary
        )

        Text(
            text = "$numberOfComments comments . $numberOfShares shares",
            fontSize = 13.sp,
            color = MaterialTheme.colorScheme.secondary,
            modifier = Modifier.weight(1f),
            textAlign = TextAlign.End
        )
    }


}