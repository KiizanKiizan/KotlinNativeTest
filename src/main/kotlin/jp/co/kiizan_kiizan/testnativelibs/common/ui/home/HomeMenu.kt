package jp.co.kiizan_kiizan.testnativelibs.common.ui.home

/**
 * ホーム画面に出す内容
 */
enum class HomeMenu(val rawValue :Long) {

    KotlinsBirthday(0) { override fun title() = "Kotlin's Birthday" },
    Http(1) { override fun title() = "Http Test" };

    abstract fun title(): String
}