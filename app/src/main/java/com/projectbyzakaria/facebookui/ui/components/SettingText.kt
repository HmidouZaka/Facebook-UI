package com.projectbyzakaria.facebookui.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.projectbyzakaria.facebookui.R

@Composable
fun SettingText(
    text: String,
    max: Int = 4,
    modifier: Modifier = Modifier,
    isShow: Boolean = true,
) {

    if (isShow) {
        Row(
            modifier = modifier.padding(8.dp).padding(bottom = 10.dp)
        ) {

            Spacer(
                modifier = Modifier
                    .width(1.dp)
                    .background(MaterialTheme.colorScheme.onBackground)
                    .height((max  * 25).dp)
            )

            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 6.dp),
                verticalArrangement = Arrangement.Center
            ) {

                Text(
                    text = text,
                    fontSize = 16.sp,
                    maxLines = max,
                    fontFamily = FontFamily(Font(R.font.robotoregular))
                )

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 6.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Default.Settings,
                        contentDescription = null,
                        modifier = Modifier.size(18.dp),
                        tint = MaterialTheme.colorScheme.secondary
                    )


                    Text(
                        text = "Rate this translation",
                        fontSize = 12.sp,
                        modifier = Modifier.padding(2.dp),
                        color = MaterialTheme.colorScheme.secondary
                    )

                }

            }

        }

    }
}


@Preview(showBackground = true)
@Composable
fun SettingText(

) {
    SettingText(
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
        max = 5
    )
}