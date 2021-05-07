package com.noscale.cerberus.widget

import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.TextView
import com.airbnb.lottie.LottieAnimationView
import com.noscale.cerberus.R

/**
 * TODO: Add class header description
 * Created by kurniawanrizzki on 02/05/21.
 */
class IllustrationView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    private var mLavIllustration: LottieAnimationView? = null

    private var mTvTitle: TextView? = null

    private var mTvSubTitle: TextView? = null

    init {
        initialization(attrs, defStyleAttr)
    }

    private fun initialization (attrs: AttributeSet?, defStyleAttr: Int) {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.view_illustration, this, true)

        mLavIllustration = view.findViewById(R.id.lav_illustration_animation)
        mTvTitle = view.findViewById(R.id.tv_illustration_title)
        mTvSubTitle = view.findViewById(R.id.tv_illustration_subtitle)

        val ta: TypedArray? = context.obtainStyledAttributes(attrs, R.styleable.IllustrationView, defStyleAttr, 0)

        val illustrationSrc = ta?.getResourceId(R.styleable.IllustrationView_src, 0)
        val title = ta?.getString(R.styleable.IllustrationView_title)
        val subTitle = ta?.getString(R.styleable.IllustrationView_subtitle)

        setIllustrationSrc(illustrationSrc)
        setTitle(title)
        setSubTitle(subTitle)
    }

    fun setIllustrationSrc (src: Int?) {
        src?.let {
            mLavIllustration?.setAnimation(it)
            invalidate()
        }
    }

    fun setTitle (title: String?) {
        mTvTitle?.text = title
        invalidate()
    }

    fun setSubTitle (subTitle: String?) {
        mTvSubTitle?.text = subTitle
        invalidate()
    }
}