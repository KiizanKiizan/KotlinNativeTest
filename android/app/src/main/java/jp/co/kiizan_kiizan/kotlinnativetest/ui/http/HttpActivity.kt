package jp.co.kiizan_kiizan.kotlinnativetest.ui.http

import android.app.Activity
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.view.View
import android.widget.Button
import jp.co.kiizan_kiizan.kotlinnativetest.R
import jp.co.kiizan_kiizan.kotlinnativetest.databinding.ActivityHttpBinding

/**
 * Httpリクエストの画面
 */
class HttpActivity : Activity(), HttpActivityEvent {

    val binding: ActivityHttpBinding by lazy {
        DataBindingUtil.setContentView<ActivityHttpBinding>(this, R.layout.activity_http)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.event = this
    }

    override fun onClickGetButton(view: View) {

    }
}