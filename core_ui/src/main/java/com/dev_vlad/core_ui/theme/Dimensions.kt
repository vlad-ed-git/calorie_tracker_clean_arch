package com.dev_vlad.core_ui.theme

import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class Dimensions (
    val noSpace : Dp  = 0.dp,
    val smSpace : Dp = 4.dp,
    val stdSpace : Dp = 8.dp,
    val mdSpace : Dp = 16.dp,
    val lgSpace : Dp = 24.dp,
    val xlSpace : Dp = 32.dp,
    val xxlSpace : Dp = 64.dp, )

//used to pass values down the composable tree
//without needing to pass them composable functions as parameters
val LocalSpacing = compositionLocalOf {
    Dimensions()
}