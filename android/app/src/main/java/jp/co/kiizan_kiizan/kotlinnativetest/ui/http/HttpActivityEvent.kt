package jp.co.kiizan_kiizan.kotlinnativetest.ui.http

import android.view.View

/**
 * HttpActivityでのイベントインターフェース
 */
interface HttpActivityEvent {
    fun onClickGetButton(view: View)
}