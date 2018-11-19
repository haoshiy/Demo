package com.hao.easy.mvvm.ui.fragment

import com.hao.easy.mvvm.R
import com.hao.easy.mvvm.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_second.*

/**
 * @author Yang Shihao
 * @date 2018/11/18
 */
class SecondFragment: BaseFragment() {
    override fun getLayoutId() = R.layout.fragment_second

    override fun initView() {
        textView.text = "通訊錄"
    }
}