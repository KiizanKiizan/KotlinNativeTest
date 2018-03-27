package jp.co.kiizan_kiizan.testnativelibs.common.ui.home

/**
 * ホーム画面に出す内容
 */
enum class HomeMenu(val rawValue :Long) {

    KotlinsBirthday(0) { override fun title() = "Kotlin's Birthday" };

    abstract fun title(): String
}