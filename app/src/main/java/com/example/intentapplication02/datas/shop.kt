package layout

import android.media.Image
import java.io.Serializable

class Shop(inputImg:String,inputName:String, inputComment:String):Serializable{
    var shopImg =inputImg
    var shopName = inputName
    var shopComment = inputComment

}