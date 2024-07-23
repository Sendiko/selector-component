package com.sendiko.selector_component

/**
 *
 * Data class for Sendiko's custom selector component
 *
 * @param index to uniquely identified data.
 * @param label for the text that will be displayed.
 * @param data holder for any additional data to be linked.
 *
 * @author Sendiko
 *
 * */
data class SelectorData(
    val index: Int,
    val label: String,
    val data: Any? = null,
)
