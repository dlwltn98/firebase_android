package com.example.ex_insta.navigation

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ex_insta.R
import com.example.ex_insta.navigation.model.ContentDTO
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.UploadTask
import kotlinx.android.synthetic.main.activity_add_photo.*
import java.text.SimpleDateFormat
import java.util.*

class addPhotoActivity : AppCompatActivity() {
    var PICK_IMAGE_FROM_ALBUM = 0
    var storage : FirebaseStorage? = null
    var photoUri : Uri? = null
    var auth : FirebaseAuth? = null
    var firestore : FirebaseFirestore? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_photo)

        //스토리지 초기화
        storage = FirebaseStorage.getInstance()
        auth = FirebaseAuth.getInstance()
        firestore = FirebaseFirestore.getInstance()

        //앨범 열기
        var photoPickerIntent = Intent(Intent.ACTION_PICK)
        photoPickerIntent.type = "image/*"
        startActivityForResult(photoPickerIntent,PICK_IMAGE_FROM_ALBUM)

        //add photo upload event
        addphoto_btn_upload.setOnClickListener {
            contentUpload()
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == PICK_IMAGE_FROM_ALBUM) {
            if (resultCode == Activity.RESULT_OK) {
                //사진을 선택 했을떄 이미지의 경로가 여기로 넘어온다
                photoUri = data?.data
                addphoto_image.setImageURI(photoUri)
            } else {
                //취소버튼을 눌렀을때 작동하는 부분
                finish()
            }
        }
    }
    fun contentUpload() {
        //파일 이름을 만든다.
        var timestamp = SimpleDateFormat("YYYYMMdd_HHmmss").format(Date())
        var imageFIleName = "IMAGE_" + timestamp + "_.png"

        var storageRef = storage?.reference?.child("images")?.child(imageFIleName)

        /*파일 업로드 방식 2개
            *callback method
            *promise method
        */
        storageRef?.putFile(photoUri!!)?.continueWithTask { task: Task<UploadTask.TaskSnapshot> ->
            return@continueWithTask storageRef.downloadUrl
        }?.addOnSuccessListener { uri ->
            var contentDTO = ContentDTO()

            // insert downloadUrl of image
            contentDTO.imageUrl = uri.toString()

            //insert uid of user
            contentDTO.uid = auth?.currentUser?.uid

            // insert userId
            contentDTO.userId = auth?.currentUser?.email

            //insert explain of content
            contentDTO.explain = addphoto_image_explain.text.toString()

            //insert timestamp
            contentDTO.timestamp = System.currentTimeMillis()

            firestore?.collection("images")?.document()?.set(contentDTO)

            setResult(Activity.RESULT_OK)

            finish()
        }
       /* //callbackmethod
        storageRef?.putFile(photoUri!!)?.addOnSuccessListener {
            storageRef.downloadUrl.addOnSuccessListener { uri ->
                var contentDTO = contentDTO()

                // insert downloadUrl of image
                contentDTO.imageUrl = uri.toString()

                //insert uid of user
                contentDTO.uid = auth?.currentUser?.uid

                // insert userId
                contentDTO.userId = auth?.currentUser?.email

                //insert explain of content
                contentDTO.explain = addphoto_image_explain.text.toString()

                //insert timestamp
                contentDTO.timestamp = System.currentTimeMillis()

                firestore.collection("images")?.document()?.set(contentDTO)

                setResult(Activity.RESULT_OK)

                finish()
            }
        }*/
    }
}
