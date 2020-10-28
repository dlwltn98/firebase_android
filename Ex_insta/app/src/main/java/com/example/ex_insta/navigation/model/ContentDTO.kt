package com.example.ex_insta.navigation.model

data class ContentDTO(var explain : String? = null, //content 설명관리
                      var imageUrl : String? = null,
                      var uid : String? = null,
                      var userId : String? = null,   //올린 유저의 이미지 관리리
                      var timestamp : Long? = null,
                      var favoriteCount : Int = 0,
                      var favorites : MutableMap<String,Boolean> = HashMap()) {
    data class Comment(var uid: String? = null,     //댓글
                       var userId: String? = null,
                       var comment : String? =null,
                       var timestamp: Long? = null)
}