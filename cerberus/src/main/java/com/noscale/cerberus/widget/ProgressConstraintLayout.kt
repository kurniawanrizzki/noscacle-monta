package com.noscale.cerberus.widget

import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import com.noscale.cerberus.R

/**
 * TODO: Add class header description
 * Created by kurniawanrizzki on 02/05/21.
 */
class ProgressConstraintLayout @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    private var mMainView: ConstraintLayout? = null

    private var mProgressView: IllustrationView? = null

    init {
        initialization(attrs, defStyleAttr)
    }

    private fun initialization (attrs: AttributeSet?, defStyleAttr: Int) {
        val inflater: LayoutInflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.view_progress_constraint, this, true)

        mMainView = view.findViewById(R.id.cl_pc_container)
        mProgressView = view.findViewById(R.id.iv_pc_progress)

        val ta: TypedArray? = context?.obtainStyledAttributes(attrs, R.styleable.ProgressConstraintLayout, defStyleAttr, 0)

        val progressSrc = ta?.getResourceId(R.styleable.ProgressConstraintLayout_src, R.raw.raw_progress)
        val progressTitle = ta?.getString(R.styleable.ProgressConstraintLayout_title) ?: context.getString(R.string.view_loading_title)
        val progressSubTitle = ta?.getString(R.styleable.ProgressConstraintLayout_subtitle) ?: context.getString(R.string.view_loading_subtitle)
        val progressVisibility = ta?.getBoolean(R.styleable.ProgressConstraintLayout_progressVisibility, true)

        showProgress(progressVisibility, progressSrc, progressTitle, progressSubTitle)
    }

    fun showProgress (isShown: Boolean?, src: Int?, title: String?, description: String?) {
        mProgressView?.setIllustrationSrc(src)
        mProgressView?.setTitle(title)
        mProgressView?.setSubTitle(description)

        showProgress(isShown)
    }

    fun showProgress (isShown: Boolean?) {
        if (isShown!!) {
            mProgressView?.visibility = View.VISIBLE
            mMainView?.visibility = View.GONE

            return
        }

        mProgressView?.visibility = View.GONE
        mMainView?.visibility = View.VISIBLE
    }

    override fun addView(child: View?, index: Int, params: ViewGroup.LayoutParams?) {
        if (null == mMainView || null == mProgressView) {
            super.addView(child, index, params)
            return
        }

        mMainView?.addView(child, index, params)
    }
}