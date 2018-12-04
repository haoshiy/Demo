package com.hao.easy.mvvm.wechat.ui.adapter

import com.hao.easy.mvvm.base.adapter.BasePagedAdapter
import com.hao.easy.mvvm.base.adapter.ViewHolder
import com.hao.easy.mvvm.wechat.R
import com.hao.easy.mvvm.wechat.model.Article
import javax.inject.Inject

class WechatArticleAdapter @Inject constructor() : BasePagedAdapter<Article>(R.layout.wechat_item_wechat_article) {

    override fun bindViewHolder(holder: ViewHolder, item: Article, position: Int) {
        holder.setText(R.id.tvTitle, item.title)
                .setText(R.id.tvTime, "時間: ${item.niceDate}")
                .setImageResource(R.id.ivFav, if (item.collect) R.drawable.ic_fav_1 else R.drawable.ic_fav_0)
                .setClickListener(R.id.ivFav) {
                    itemClickListener?.apply {
                        this(it, item, position)
                    }
                }
    }
}