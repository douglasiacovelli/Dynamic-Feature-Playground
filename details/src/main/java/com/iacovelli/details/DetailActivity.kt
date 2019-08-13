package com.iacovelli.details

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import com.iacovelli.details.databinding.ActivityDetailBinding
import com.iacovelli.dynamicfeatures.R as BaseR

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val dataBinding = DataBindingUtil.setContentView<ActivityDetailBinding>(this, R.layout.activity_detail)


        dataBinding.details.setTextColor(ContextCompat.getColor(this, BaseR.color.colorAccent))
    }
}
