package com.noscale.cerberus.widget.typography

import android.content.Context
import android.graphics.Typeface
import androidx.core.content.res.ResourcesCompat
import com.noscale.cerberus.R

/**
 * TODO: Add class header description
 * Created by kurniawanrizzki on 16/05/21.
 */
object ApplicableFontHelper {

    fun adjust (typography: Typography, action: (Int) -> Unit) {
        when (typography) {
            Typography.H1 -> action(R.style.AppTheme_TextAppearance_Headline1)
            Typography.H2 -> action(R.style.AppTheme_TextAppearance_Headline2)
            Typography.H3 -> action(R.style.AppTheme_TextAppearance_Headline3)
            Typography.H4 -> action(R.style.AppTheme_TextAppearance_Headline4)
            Typography.H5 -> action(R.style.AppTheme_TextAppearance_Headline5)
            Typography.H6 -> action(R.style.AppTheme_TextAppearance_Headline6)
            Typography.SUBTITLE_1 -> action(R.style.AppTheme_TextAppearance_Subtitle1)
            Typography.SUBTITLE_2 -> action(R.style.AppTheme_TextAppearance_Subtitle2)
            Typography.BODY_1 -> action(R.style.AppTheme_TextAppearance_Body1)
            Typography.BODY_2 -> action(R.style.AppTheme_TextAppearance_Body2)
            Typography.BUTTON -> action(R.style.AppTheme_TextAppearance_Button)
            Typography.CAPTION -> action(R.style.TextAppearance_AppCompat_Caption)
            Typography.OVERLINE -> action(R.style.AppTheme_TextAppearance_Overline)
        }
    }

    enum class Typography {
        H1, H2, H3, H4, H5, H6, SUBTITLE_1, SUBTITLE_2, BODY_1, BODY_2, BUTTON, CAPTION, OVERLINE
    }

}