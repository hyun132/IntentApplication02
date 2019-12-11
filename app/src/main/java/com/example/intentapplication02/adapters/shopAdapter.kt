package com.example.intentapplication02.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import com.example.intentapplication02.R
import kotlinx.android.synthetic.main.activity_login.view.*
import layout.Shop
import java.util.zip.Inflater

class shopAdapter(context: Context, resId:Int, list:ArrayList<Shop>) :ArrayAdapter<Shop>(context,resId,list) {

    val mContext = context
    val mList=list
    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if (tempRow == null){
            tempRow = inf.inflate(R.layout.shop_item,null)
        }

        var data=mList.get(position)
        var row=tempRow!!

        var shopNameTxt = row.findViewById<TextView>(R.id.shopNameTxt)
        var shopCommentTxt = row.findViewById<TextView>(R.id.shopComment)
        var shopImg= row.findViewById<ImageView>(R.id.shopImg)

        shopNameTxt.text= data.shopName
        shopCommentTxt.text= data.shopComment
        shopImg.setImageResource(R.drawable.ic_launcher_background)

        return row
    }

}