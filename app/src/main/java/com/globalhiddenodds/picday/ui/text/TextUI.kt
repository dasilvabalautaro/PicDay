package com.globalhiddenodds.picday.ui.text

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Title(title: String) {
    Text(
        text = title,
        style = MaterialTheme.typography.subtitle1,
        modifier = Modifier
            .padding(start = 10.dp, top = 5.dp, bottom = 5.dp)
            .wrapContentWidth(Alignment.Start)
    )
}

@Composable
fun SubTitle(title: String) {
    Text(
        text = title,
        style = MaterialTheme.typography.subtitle2,
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 10.dp)
            .wrapContentWidth(Alignment.CenterHorizontally)
    )
}

@Composable
fun CopyRight(author: String) {
    Text(
        text = author,
        style = MaterialTheme.typography.overline,
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 10.dp, end = 10.dp)
            .wrapContentWidth(Alignment.End)
    )
}

@Composable
fun BodyText(body: String) {
    Text(
        text = body,
        style = MaterialTheme.typography.body1,
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 10.dp, vertical = 10.dp)
            .wrapContentWidth(Alignment.Start)
    )
}
