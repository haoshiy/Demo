package com.hao.easy.mvvm.example.viewmodel

import com.hao.easy.mvvm.base.viewmodel.BaseListViewModel
import com.hao.easy.mvvm.extensions.map_main
import com.hao.easy.mvvm.extensions.subscribeBy
import com.hao.easy.mvvm.example.model.NewArticle

class NewArticlesViewModel : BaseListViewModel<NewArticle>() {

    override fun pageSize() = 6

    override fun loadData(page: Int, onResponse: (ArrayList<NewArticle>?) -> Unit) {
        api.getNewArticles(page - 1).map_main().subscribeBy({
            onResponse(it.datas)
        }, {
            onResponse(null)
        }).add()
    }
}