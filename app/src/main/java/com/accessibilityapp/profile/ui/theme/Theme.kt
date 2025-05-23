package com.accessibilityapp.profile.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

private val DarkColorScheme = darkColorScheme(
            primary = AccentGreen,
            onPrimary = Color.Black,
            background = DarkBackground,
            surface = SurfaceDark,
            onSurface = TextPrimary,
)

private val LightColorScheme = lightColorScheme(
    primary = Purple40,
    secondary = PurpleGrey40,
    tertiary = Pink40

    /* Other default colors to override
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)

@Composable
fun ProfileTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
//    val colorScheme = when {
//        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
//            val context = LocalContext.current
//            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
//        }
//
//        darkTheme -> DarkColorScheme
//        else -> LightColorScheme
//    }
//
//    MaterialTheme(
//        colorScheme = colorScheme,
//        typography = Typography,
//        content = content
//    )

        MaterialTheme(
        colorScheme = darkColorScheme(
            primary = AccentGreen,
            onPrimary = Color.Black,
            background = DarkBackground,
            surface = SurfaceDark,
            onSurface = TextPrimary,
            surfaceDim = DividerGray,
            onSurfaceVariant = TextSecondary
        ),
        typography = Typography,
        shapes = Shapes(
            small = RoundedCornerShape(4.dp),
            medium = RoundedCornerShape(8.dp),
            large = RoundedCornerShape(0.dp)
        ),
        content = content
    )
}



//@Composable
//fun CredTheme(content: @Composable () -> Unit) {
//    MaterialTheme(
//        colorScheme = darkColorScheme(
//            primary = AccentGreen,
//            onPrimary = Color.Black,
//            background = DarkBackground,
//            surface = SurfaceDark,
//            onSurface = TextPrimary,
//        ),
//        typography = CredTypography,
//        shapes = Shapes(
//            small = RoundedCornerShape(4.dp),
//            medium = RoundedCornerShape(8.dp),
//            large = RoundedCornerShape(0.dp)
//        ),
//        content = content
//    )
//}
