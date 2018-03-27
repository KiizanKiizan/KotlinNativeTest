package jp.co.kiizan_kiizan.testnativelibs.common.presenter.home

import jp.co.kiizan_kiizan.testnativelibs.common.ui.home.HomeMenu

/**
 * ホーム画面のリスト用のプレゼンター
 */
class HomeListPresenter {
    fun titles(): List<String> {
        return HomeMenu.values().map { it.title() }
    }
}