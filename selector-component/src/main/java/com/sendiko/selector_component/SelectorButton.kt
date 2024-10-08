package com.sendiko.selector_component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Text

@Composable
fun SelectorButton(
    modifier: Modifier = Modifier,
    data: SelectorData,
    isActive: Boolean,
    onClick: (data: SelectorData) -> Unit,
    containerColor: Color,
    contentColor: Color
) {
    val buttonColor = if (isActive) containerColor
    else Color.Transparent
    Box(
        modifier = modifier
            .clip(CircleShape)
            .background(buttonColor)
            .clickable { onClick(data) },
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = data.label,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(4.dp),
            color = contentColor
        )
    }
}