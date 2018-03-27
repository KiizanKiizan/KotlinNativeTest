package jp.co.kiizan_kiizan.testnativelibs.common.presenter.home

import jp.co.kiizan_kiizan.testnativelibs.platform.presenter.home.HomeView
import jp.co.kiizan_kiizan.testnativelibs.common.ui.home.HomeMenu

/**
 * ホーム画面のプレゼンター
 */
class HomePresenter {

    var homeView: HomeView? = null

    fun tappedListAt(index: Long) {
        val menu = HomeMenu.values().find { it.rawValue == index } ?: return

        when(menu) {
            HomeMenu.KotlinsBirthday -> {homeView?.toKotlinsBirthdayActivity()}
        }
    }
}