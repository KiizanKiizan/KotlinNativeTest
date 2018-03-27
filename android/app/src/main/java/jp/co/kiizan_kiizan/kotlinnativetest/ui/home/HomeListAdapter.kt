package jp.co.kiizan_kiizan.kotlinnativetest.ui.home

import android.content.Context
import android.databinding.DataBindingUtil
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import jp.co.kiizan_kiizan.kotlinnativetest.R
import jp.co.kiizan_kiizan.kotlinnativetest.databinding.ViewHomeListBinding
import jp.co.kiizan_kiizan.testnativelibs.common.presenter.home.HomeListPresenter

/**
 * ホーム画面のリストアダプタ
 */
class HomeListAdapter(context: Context?, presenter: HomeListPresenter) : ArrayAdapter<String>(context, 0, presenter.titles()) {

    private val inflater = LayoutInflater.from(context)

    private class ViewHolder(view: View) {
        val binding: ViewHomeListBinding = DataBindingUtil.bind(view)
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = convertView ?: inflater.inflate(R.layout.view_home_list, null).apply { tag = ViewHolder(this) }
        (view.tag as ViewHolder).binding.homeListViewText.text = getItem(position)
        return view
    }
}