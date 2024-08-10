package com.sendiko.selector_component

import androidx.compose.ui.graphics.Color

/**
 *
 * Custom color class for Selector component.
 *
 * @param buttonColor for button's container color.
 * @param textColor for button's text color.
 * @param surfaceColor for container outside the botton color.
 *
 */
data class SelectorColor(
    val buttonColor: Color? = null,
    val textColor: Color? = null,
    val surfaceColor: Color? = null,
)
