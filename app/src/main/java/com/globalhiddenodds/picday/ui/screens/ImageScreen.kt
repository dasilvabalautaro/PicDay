package com.globalhiddenodds.picday.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.globalhiddenodds.picday.overview.DownloadViewModel


@Composable
fun ImageScreen(
    modifier: Modifier = Modifier,
    downloadViewModel: DownloadViewModel = viewModel(),
    date: String
) {
    Column(
        modifier = modifier
    ) {
        ImageItem(
            dataCloud = downloadViewModel.dataImage,
            onSearch = { downloadViewModel.getImage(date) })
    }
}