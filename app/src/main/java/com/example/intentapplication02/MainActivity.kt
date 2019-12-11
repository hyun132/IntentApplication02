package com.example.intentapplication02

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.Toast
import com.example.intentapplication02.adapters.shopAdapter
import kotlinx.android.synthetic.main.activity_main.*
import layout.Shop

class MainActivity : AppCompatActivity() {

    val dataList=ArrayList<Shop>()
    var myAdapter:shopAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        var tempShopInfo = intent.getSerializableExtra("shop") as Shop
//        userInfoTxt
        userInfoTxt.text = intent.getStringExtra("userId")+" 님 안녕하세요!"
        myAdapter= shopAdapter(this,R.layout.shop_item,dataList)
        marketLv.adapter=myAdapter

        dataList.add(Shop("C:\\Users\\hyun\\AndroidStudioProjects\\IntentApplication02\\app\\src\\main\\res\\drawable\\rounded_rectangle_solid.xml","상호명4" ,   "가게소개4"))
        dataList.add(Shop("C:\\Users\\hyun\\AndroidStudioProjects\\IntentApplication02\\app\\src\\main\\res\\drawable\\rounded_rectangle_solid.xml","상호명5" ,   "가게소개5"))
        dataList.add(Shop("C:\\Users\\hyun\\AndroidStudioProjects\\IntentApplication02\\app\\src\\main\\res\\drawable\\rounded_rectangle_solid.xml","상호명1" ,   "가게소개1"))
        dataList.add(Shop("C:\\Users\\hyun\\AndroidStudioProjects\\IntentApplication02\\app\\src\\main\\res\\drawable\\rounded_rectangle_solid.xml","상호명2" ,   "가게소개2"))
        dataList.add(Shop("C:\\Users\\hyun\\AndroidStudioProjects\\IntentApplication02\\app\\src\\main\\res\\drawable\\rounded_rectangle_solid.xml","상호명3" ,   "가게소개3"))
        dataList.add(Shop("C:\\Users\\hyun\\AndroidStudioProjects\\IntentApplication02\\app\\src\\main\\res\\drawable\\rounded_rectangle_solid.xml","상호명4" ,   "가게소개4"))
        dataList.add(Shop("C:\\Users\\hyun\\AndroidStudioProjects\\IntentApplication02\\app\\src\\main\\res\\drawable\\rounded_rectangle_solid.xml","상호명5" ,   "가게소개5"))
        dataList.add(Shop("C:\\Users\\hyun\\AndroidStudioProjects\\IntentApplication02\\app\\src\\main\\res\\drawable\\rounded_rectangle_solid.xml","상호명4" ,   "가게소개4"))
        dataList.add(Shop("C:\\Users\\hyun\\AndroidStudioProjects\\IntentApplication02\\app\\src\\main\\res\\drawable\\rounded_rectangle_solid.xml","상호명5" ,   "가게소개5"))

        marketLv.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
//            val selectedItem = parent.getItemIdAtPosition(position) as String

            Toast.makeText(this,"${dataList[position].shopName}",Toast.LENGTH_SHORT).show()

            var uri= Uri.parse("https://www.naver.com")
            var uriIntent=Intent(Intent.ACTION_VIEW,uri)
            startActivity(uriIntent)
        }

    }
}
