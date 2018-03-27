package jp.co.kiizan_kiizan.kotlinnativetest.ui.kotlins_birthday

import android.app.Activity
import android.databinding.DataBindingUtil
import android.os.Bundle
import jp.co.kiizan_kiizan.kotlinnativetest.R
import jp.co.kiizan_kiizan.kotlinnativetest.databinding.ActivityKotlinsBirthdayBinding
import jp.co.kiizan_kiizan.kotlinnativetest.platform.helper.DateAndroid
import jp.co.kiizan_kiizan.testnativelibs.common.presenter.kotlins_birthday.KotlinsBirthdayPresenter

/**
 * Kotlinの発表された日を表示する
 */
class KotlinsBirthdayActivity : Activity() {

    val binding: ActivityKotlinsBirthdayBinding by lazy {
        DataBindingUtil.setContentView<ActivityKotlinsBirthdayBinding>(this, R.layout.activity_kotlins_birthday)
    }

    private val presenter = KotlinsBirthdayPresenter(DateAndroid())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.kotlinsBirthdayText.text = presenter.kotlinsBirthday()
    }

}