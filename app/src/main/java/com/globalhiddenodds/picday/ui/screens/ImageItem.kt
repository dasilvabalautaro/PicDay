package com.globalhiddenodds.picday.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.globalhiddenodds.picday.network.DataCloud
import com.globalhiddenodds.picday.ui.ImageCentral
import com.globalhiddenodds.picday.ui.text.BodyText
import com.globalhiddenodds.picday.ui.text.CopyRight
import com.globalhiddenodds.picday.ui.text.SubTitle
import com.globalhiddenodds.picday.ui.text.Title

@Composable
fun ImageItem(
    dataCloud: DataCloud?,
    onSearch: () -> Unit,
    modifier: Modifier = Modifier
) {
    Scaffold(floatingActionButton = {
        FloatingActionButton(onClick = onSearch) {
            Icon(imageVector = Icons.Default.Star, contentDescription = null)
        }
    }) {
        LazyColumn(modifier = Modifier.padding(it)) {
            item {
                Card(
                    backgroundColor = MaterialTheme.colors.primary,
                    modifier = modifier.padding(vertical = 4.dp, horizontal = 8.dp)
                ) {
                    Column(
                        modifier = modifier
                            .fillMaxWidth()
                    ) {
                        if (dataCloud != null) {
                            ContentCard(dataCloud = dataCloud)
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun ContentCard(dataCloud: DataCloud) {
    Title(title = dataCloud.data.title)
    SubTitle(title = dataCloud.data.date)
    ImageCentral(url = dataCloud.data.url)
    CopyRight(author = "Image Credit: NASA")
    BodyText(body = dataCloud.data.explanation)
}