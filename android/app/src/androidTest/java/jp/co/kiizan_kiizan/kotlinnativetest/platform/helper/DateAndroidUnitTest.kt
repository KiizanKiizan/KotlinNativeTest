package jp.co.kiizan_kiizan.kotlinnativetest.platform.helper

import jp.co.kiizan_kiizan.testnativelibs.common.helper.date.DateComponents
import org.junit.Test
import kotlin.test.assertEquals

class DateAndroidUnitTest {
    @Test
    fun フォーマット通りの文字列が返却される() {
        val components = DateComponents(2018, 3, 25)
        val dateString = DateAndroid().dateWithFormat("yyyy-MM-dd", components)
        assertEquals("2018-03-25", dateString, "フォーマット通りの日付文字列になっていません")
    }
}