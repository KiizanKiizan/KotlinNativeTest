package jp.co.kiizan_kiizan.kotlinnativetest.ui.home

import android.app.Activity
import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import jp.co.kiizan_kiizan.kotlinnativetest.R
import jp.co.kiizan_kiizan.kotlinnativetest.databinding.ActivityHomeBinding
import jp.co.kiizan_kiizan.kotlinnativetest.ui.http.HttpActivity
import jp.co.kiizan_kiizan.kotlinnativetest.ui.kotlins_birthday.KotlinsBirthdayActivity
import jp.co.kiizan_kiizan.testnativelibs.common.presenter.home.HomeListPresenter
import jp.co.kiizan_kiizan.testnativelibs.common.presenter.home.HomePresenter
import jp.co.kiizan_kiizan.testnativelibs.platform.presenter.home.HomeView

class HomeActivity : Activity(), HomeView, AdapterView.OnItemClickListener {

    val binding: ActivityHomeBinding by lazy {
        DataBindingUtil.setContentView<ActivityHomeBinding>(this, R.layout.activity_home)
    }

    private val homePresenter = HomePresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val arrayListAdapter = HomeListAdapter(this, HomeListPresenter())
        binding.homeListView.adapter = arrayListAdapter
        binding.homeListView.setOnItemClickListener(this)
    }

    override fun onStart() {
        super.onStart()

        homePresenter.homeView = this
    }

    override fun onStop() {
        super.onStop()

        homePresenter.homeView = null
    }

    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        homePresenter.tappedListAt(position.toLong())
    }

    override fun toKotlinsBirthdayActivity() {
        val intent = Intent(this, KotlinsBirthdayActivity::class.java)
        startActivity(intent)
    }

    override fun toHttpActivity() {
        val intent = Intent(this, HttpActivity::class.java)
        startActivity(intent)
    }
}