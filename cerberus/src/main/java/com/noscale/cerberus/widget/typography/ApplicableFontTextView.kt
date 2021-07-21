package com.noscale.cerberus.widget.typography

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView
import com.noscale.cerberus.R

/**
 * TODO: Add class header description
 * Created by kurniawanrizzki on 16/05/21.
 */
class ApplicableFontTextView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0):
    AppCompatTextView(context, attrs, defStyleAttr) {
        
        init {
            setup(attrs, defStyleAttr)
        }

    private fun setup (attrs: AttributeSet?, defStyleAttr: Int) {
        val ta = context.obtainStyledAttributes(attrs, R.styleable.RubikTextView, defStyleAttr, 0)
        val typography = ApplicableFontHelper.Typography.values()[ta.getInt(R.styleable.RubikTextView_typography, 0)]

        ApplicableFontHelper.adjust(typography) {
            setTextAppearance(it)
        }
    }
}