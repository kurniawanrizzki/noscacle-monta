package com.noscale.cerberus

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * TODO: Add class header description
 * Created by kurniawanrizzki on 02/05/21.
 */
open class BaseActivity: AppCompatActivity() {

    protected open var mLayoutResource: Int = R.layout.activity_base

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(mLayoutResource)
    }
}