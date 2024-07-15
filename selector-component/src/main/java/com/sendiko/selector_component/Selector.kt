package com.sendiko.selector_component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp

/**
*
* Sendiko's custom selector button!
*
* It is recommended to use integrated Event that takes [SelectorData].
*
 * @param currentSelected refers to the current [SelectorData].
 * @param onSelect is used to handle when the Button is clicked.
 * @param items is for how many buttons will be shown.
*
 * @see SelectorData
* */

@Composable
fun Selector(
    modifier: Modifier = Modifier,
    onSelect: (selectorData: SelectorData) -> Unit,
    currentSelected: SelectorData,
    items: List<SelectorData>,
) {
    Box(
        modifier = modifier
            .padding(8.dp)
            .fillMaxWidth()
            .clip(CircleShape)
            .background(MaterialTheme.colorScheme.surfaceContainerHigh)
    ) {
        Row(
            modifier = Modifier.padding(8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            items.forEach {
                SelectorButton(
                    modifier = Modifier.weight(1f),
                    data = it,
                    isActive = currentSelected == it,
                    onClick = {
                        onSelect(it)
                    }
                )
            }
        }
    }
}