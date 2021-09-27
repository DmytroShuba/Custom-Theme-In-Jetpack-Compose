package com.dmytroshuba.customthemedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import com.dmytroshuba.customthemedemo.model.PhotographItem

class MainActivity : AppCompatActivity() {

    // mocked items
    private val photographItems = listOf(
        PhotographItem(
            description = "Green water and a boat",
            photoUrl = "https://images.unsplash.com/photo-1596324121712-5bbc14482174?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=880&q=80",
            author = "Photograph by Tracey Isles"
        ),
        PhotographItem(
            description = "Rain drops on a flower",
            photoUrl = "https://images.unsplash.com/photo-1555662800-92f44b37a43d?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=909&q=80",
            author = "Photograph by Andriyko Podilnyk"
        ),
        PhotographItem(
            description = "Green roof in front of the blue sky",
            photoUrl = "https://images.unsplash.com/photo-1512977851705-67ee4bf294f4?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=860&q=80",
            author = "Photograph by Simone Hutsch"
        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DemoScreen(photographItems)
        }
    }
}
