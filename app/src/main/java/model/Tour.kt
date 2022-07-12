package model

import java.util.*

data class Tour (
    val id: UUID,
    val title: String,
    val addDate: Date,
    val isVisited: Boolean
)