package com.dongguk.untactstudy.Adapter

import com.dongguk.untactstudy.R
import com.xwray.groupie.GroupieViewHolder
import com.xwray.groupie.Item
import kotlinx.android.synthetic.main.member_list_row.view.*

class UserItem(val name:String, val uid : String) : Item<GroupieViewHolder>() {
    override fun getLayout(): Int {
        return R.layout.member_list_row
    }

    override fun bind(viewHolder: GroupieViewHolder, position: Int) {
        viewHolder.itemView.name.text = name
        viewHolder.itemView.member_uid.text = uid
    }
}