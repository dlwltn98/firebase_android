package com.example.ex_insta.navigation.model

data class AlarmDTO(
    var destinationUid : String? = null,
    var userId : String? = null,
    var uid : String? = null,
    var kind : Int? = null,
    var message : String? = null,
    var timestamp : Long? = null
)
// 0 : like alarm
// 1 : comment alarm
// 2 : follow alarm
