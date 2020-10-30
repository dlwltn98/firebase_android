# Firebase 기반으로 만든 이미지 저장 어플
> Firebase 와 Kotlin을 공부할 목적으로 강의를 보며 실습

## 개발
* 개발 언어 - Kotlin
* Android Studio
* google -Firebase 이용

## 기능, 설명
* Firebase의 Authentication을 이용
  > google, facebook 계정으로 로그인하기
* 네비게이션 탭바를 이용하여 화면 구성
  > 사진 업로드 - Storage 이용  
  > 이미지 url, 토큰, user정보 등 - FireStore 이용
* 좋아요 버튼, 댓글 기능
* Follower, Following 기능
* 알람 기능
* 프로필 이미지 설정 가능

## 문제해결
* 문제
  > Android : Cannot fit requested classes in a single dex file 오류
* 해결
  > multiDex 추가
  
## 결과 화면 (Firebase)
<img src="https://user-images.githubusercontent.com/68541650/97737829-dddbb900-1b20-11eb-99de-b6ec251ce40c.png" width="450px" height="300px" title="px(픽셀) 크기 설정" alt="firestore"></img>
<img src="https://user-images.githubusercontent.com/68541650/97737862-ea601180-1b20-11eb-9865-74818161ec92.png" width="450px" height="200px" title="px(픽셀) 크기 설정" alt="Storage"></img><br/>

## 결과 화면 (App)
