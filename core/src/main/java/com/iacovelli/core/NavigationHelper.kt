package com.iacovelli.core

import android.content.Intent

private const val APPLICATION_PACKAGE = "com.iacovelli.dynamicfeatures"
private const val BASE_PACKAGE = "com.iacovelli"

fun intentTo(link: ActivityLink): Intent {
    return Intent(Intent.ACTION_VIEW).setClassName(APPLICATION_PACKAGE, link.className)
}

sealed class ActivityLink(val className: String) {
    object DetailActivity: ActivityLink("$BASE_PACKAGE.details.DetailActivity")
}