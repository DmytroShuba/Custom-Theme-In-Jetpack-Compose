package com.dmytroshuba.customthemedemo

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.dmytroshuba.customthemedemo.model.PhotographItem
import com.dmytroshuba.customthemedemo.theme.AppTheme

@Composable
fun DemoScreen(items: List<PhotographItem>) {
    LazyColumn(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(AppTheme.colors.background)
    ) {
        item {
            TopAppBar(
                title = {
                    Text(
                        text = "The gallery",
                        style = AppTheme.typography.h1,
                        color = AppTheme.colors.primary
                    )
                },
                backgroundColor = Color.Transparent,
                elevation = 2.dp
            )
        }
        items(items) { item ->
            GalleryItem(item)
        }
    }
}

@Composable
fun GalleryItem(item: PhotographItem) {
    Column(
        modifier = Modifier.padding(AppTheme.dimensions.paddingMedium)
    ) {
        Text(
            text = item.description,
            style = AppTheme.typography.body,
            color = AppTheme.colors.textPrimary,
            modifier = Modifier.padding(AppTheme.dimensions.paddingSmall)
        )
        Image(
            rememberImagePainter(item.photoUrl),
            contentDescription = null,
            modifier = Modifier.size(256.dp)
        )
        Text(
            text = item.author,
            style = AppTheme.typography.caption,
            color = AppTheme.colors.textSecondary,
            modifier = Modifier.padding(AppTheme.dimensions.paddingSmall)
        )
    }
}
