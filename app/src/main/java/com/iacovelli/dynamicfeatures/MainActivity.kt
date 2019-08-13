package com.iacovelli.dynamicfeatures

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.iacovelli.core.ActivityLink
import com.iacovelli.core.intentTo
import com.iacovelli.dynamicfeatures.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val dataBinding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        dataBinding.detailButton.setOnClickListener {
            val intent = intentTo(ActivityLink.DetailActivity)
            startActivity(intent)
        }
    }
}
