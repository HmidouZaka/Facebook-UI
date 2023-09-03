package com.projectbyzakaria.facebookui.ui.components

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.projectbyzakaria.facebookui.R
import com.projectbyzakaria.facebookui.model.NormalPostModel

@Composable
fun AdsPost(
    postModel: NormalPostModel,
    modifier: Modifier = Modifier,
    isByWhatsapp: Boolean = false,
) {

    Column(
        modifier = modifier
    ) {
        UserHeader(
            image = postModel.userImage,
            name = postModel.userName,
            time = postModel.time,
            icon = postModel.icon,
            onClickClose = { },
            onClickMore = {}
        )

        TextPost(text = postModel.text, keywords = postModel.keywords)

        Image(
            painter = painterResource(id = postModel.image),
            contentDescription = "post image",
            modifier = Modifier
                .fillMaxWidth()
                .heightIn(max = 300.dp),
            contentScale = ContentScale.Crop,
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color(0xFFE7E7E7))
                .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = "mywebsite.com",
                    fontSize = 16.sp,

                )
                Text(text = "Shop our plans")
            }

            if (isByWhatsapp) {
                Button(
                    onClick = { },
                    shape = RoundedCornerShape(8.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF389B3C),
                        contentColor = MaterialTheme.colorScheme.background

                    ),
                    modifier = Modifier
                        .height(40.dp)
                        .width(100.dp),
                    contentPadding = PaddingValues(0.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.whatsapp),
                        contentDescription = "icon",
                        tint = MaterialTheme.colorScheme.background,
                        modifier = Modifier.size(16.dp)
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = "WhatsApp",
                        fontSize = 14.sp,
                    )
                }
            } else {
                Button(
                    onClick = { },
                    shape = RoundedCornerShape(8.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = MaterialTheme.colorScheme.secondary,
                        contentColor = MaterialTheme.colorScheme.onBackground
                    ),
                    modifier = Modifier
                        .height(40.dp)
                        .width(90.dp),
                    contentPadding = PaddingValues(0.dp)
                ) {
                    Text(
                        text = "Shop now",
                        fontSize = 14.sp,

                        )
                }
            }


        }


        ResultsNumbers(
            numberOfComments = postModel.numberOfComments,
            numberOfLikes = postModel.numberOfLikes,
            numberOfShares = postModel.numberOfShares,
            modifier = Modifier.fillMaxWidth()
        )

        PostActions(modifier = Modifier.fillMaxWidth())


    }


}


@Preview(showBackground = true)
@Composable
fun AdsPost() {
    AdsPost(
        postModel = NormalPostModel(
            image = R.drawable.profileimage8,
            userImage = R.drawable.profileimage2,
            userName = "ahmed ahmed",
            time = "20h .",
            numberOfComments = 20,
            numberOfLikes = 103,
            numberOfShares = 6,
            icon = R.drawable.public_fill0_wght400_grad0_opsz24,
            text = null
        ),
        modifier = Modifier.fillMaxWidth()
    )
}

@Preview(showBackground = true)
@Composable
fun AdsPostText() {
    AdsPost(
        postModel = NormalPostModel(
            image = R.drawable.profileimage5,
            userImage = R.drawable.profileimage2,
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
        ),
        modifier = Modifier.fillMaxWidth(),
        isByWhatsapp = true
    )
}