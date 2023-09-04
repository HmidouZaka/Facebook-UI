package com.projectbyzakaria.facebookui.ui.components

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.projectbyzakaria.facebookui.R

@Composable
fun TextPost(text:String?,keywords:List<String>) {
    if (text != null) {
        var isShowed by remember {
            mutableStateOf(false)
        }
        Text(
            text = buildAnnotatedString {
                withStyle(
                    SpanStyle(
                        fontFamily = FontFamily(Font(R.font.robotoregular)),
                        fontSize = 17.sp,
                        color = MaterialTheme.colorScheme.onBackground,
                    )
                ) {
                    append(text)
                }
                if (keywords.isNotEmpty()) {
                    append("\n\n")
                    keywords.forEach {
                        withStyle(
                            SpanStyle(
                                color = MaterialTheme.colorScheme.primary
                            )
                        ) {
                            append("#$it\n")
                        }
                    }
                }
            },
            modifier = Modifier
                .padding(horizontal = 8.dp)
                .padding(top = 8.dp)
                .animateContentSize(),
            fontSize = 17.sp,
            color = MaterialTheme.colorScheme.onBackground,
            maxLines = if (isShowed) Int.MAX_VALUE else 4,
            overflow = TextOverflow.Ellipsis,
            fontFamily = FontFamily(Font(R.font.robotoregular))
        )
        if (text.length >= 250 || keywords.isNotEmpty()){
            Text(
                text = if (isShowed) "show less" else "show more...",
                textAlign = TextAlign.Start,
                color = MaterialTheme.colorScheme.secondary,
                fontSize = 14.sp,
                fontWeight = FontWeight.W300,
                modifier = Modifier
                    .padding(start = 8.dp, bottom = 8.dp)
                    .clickable(onClick = {
                        isShowed = !isShowed
                    })
            )
        }else{
            Spacer(modifier = Modifier.size(8.dp))
        }
    }
}