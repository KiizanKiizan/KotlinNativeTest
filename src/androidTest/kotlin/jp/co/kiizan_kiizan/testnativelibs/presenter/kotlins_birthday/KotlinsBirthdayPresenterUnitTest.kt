package jp.co.kiizan_kiizan.testnativelibs.presenter.kotlins_birthday

import jp.co.kiizan_kiizan.kotlinnativetest.platform.helper.DateAndroid
import jp.co.kiizan_kiizan.testnativelibs.common.presenter.kotlins_birthday.KotlinsBirthdayPresenter
import org.junit.Test
import kotlin.test.assertEquals

class KotlinsBirthdayPresenterUnitTest {
    @Test
    fun Kotlinの発表日が取得される() {
        val presenter = KotlinsBirthdayPresenter(DateAndroid())
        val dateString = presenter.kotlinsBirthday()
        assertEquals("2011年7月20日", dateString, "正しい発表日ではありません")
    }
}