package jp.co.kiizan_kiizan.kotlinnativetest.platform.helper

import android.text.format.DateFormat
import jp.co.kiizan_kiizan.testnativelibs.common.helper.date.DateComponents
import jp.co.kiizan_kiizan.testnativelibs.platform.helper.date.Date

import java.util.*

/**
 * 日付クラス実装
 */
class DateAndroid : Date {
    override fun dateWithFormat(format: String, dateComponents: DateComponents) : String {
        return DateFormat.format(format, createCalendar(dateComponents)).toString()
    }

    private fun createCalendar(dateComponents: DateComponents) : Calendar {
        val calendar = GregorianCalendar.getInstance()
        calendar.set(dateComponents.year, dateComponents.month - 1, dateComponents.day, 0, 0, 0)
        return calendar
    }
}