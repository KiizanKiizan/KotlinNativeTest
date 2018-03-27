package jp.co.kiizan_kiizan.testnativelibs.platform.helper.date

import jp.co.kiizan_kiizan.testnativelibs.common.helper.date.DateComponents

/**
 * 日付インターフェース
 */
interface Date {
    fun dateWithFormat(format: String, dateComponents: DateComponents) : String
}