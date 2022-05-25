package com.dev_vlad.onboarding_presentation.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.dev_vlad.core_ui.theme.CoreTypography
import com.dev_vlad.core_ui.theme.LocalSpacing
import com.dev_vlad.core_ui.theme.coreTheme

@Composable
fun MainBtn(
    text : String,
    onClick : () -> Unit,
    modifier: Modifier = Modifier,
    isEnabled : Boolean = true,
    textStyle: TextStyle = CoreTypography.button
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        enabled = isEnabled,
        shape = RoundedCornerShape(100.dp)
    ){
        Text(
            text = text,
            style = textStyle,
            color =  MaterialTheme.colors.onPrimary,
            modifier = Modifier.padding(LocalSpacing.current.smSpace)
        )
    }
}