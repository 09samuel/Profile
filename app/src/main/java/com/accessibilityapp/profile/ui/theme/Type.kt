package com.accessibilityapp.profile.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

// Set of Material typography styles to start with


val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = MyFontFamily,
        fontSize = 16.sp
    ),
    titleLarge = TextStyle(
        fontFamily = MyFontFamily,
        fontSize = 20.sp
    ),
    labelSmall = TextStyle(
        fontFamily = MyFontFamily,
        fontSize = 14.sp
    )
    // Add more as needed
)
