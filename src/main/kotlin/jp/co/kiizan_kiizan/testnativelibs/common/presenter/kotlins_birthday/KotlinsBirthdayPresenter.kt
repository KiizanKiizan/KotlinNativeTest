package jp.co.kiizan_kiizan.testnativelibs.common.presenter.kotlins_birthday

import jp.co.kiizan_kiizan.testnativelibs.common.helper.date.DateComponents
import jp.co.kiizan_kiizan.testnativelibs.platform.helper.date.Date

/**
 * Kotlinの発表された日を返すクラス
 */
class KotlinsBirthdayPresenter(val date : Date) {

    fun kotlinsBirthday() : String {
        return date.dateWithFormat("yyyy年M月d日", DateComponents(2011, 7,20))
    }

}