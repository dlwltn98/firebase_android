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
<img src="https://user-images.githubusercontent.com/68541650/97737829-dddbb900-1b20-11eb-99de-b6ec251ce40c.png" width="40%" height="30%" title="px(픽셀) 크기 설정" alt="firestore"></img>
<img src="https://user-images.githubusercontent.com/68541650/97737862-ea601180-1b20-11eb-9865-74818161ec92.png" width="40%" height="30%" title="px(픽셀) 크기 설정" alt="Storage"></img><br/>

## 결과 화면 (App)
<img src="https://user-images.githubusercontent.com/68541650/97738565-df59b100-1b21-11eb-86c7-2890c7da41c7.png" width="20%" height="30%" title="px(픽셀) 크기 설정" alt="home"></img>
<img src="https://user-images.githubusercontent.com/68541650/97738568-dff24780-1b21-11eb-9c73-67a77c01ed47.png" width="20%" height="30%" title="px(픽셀) 크기 설정" alt="search"></img>
<img src="https://user-images.githubusercontent.com/68541650/97738556-de288400-1b21-11eb-9b13-d1acd2cde7f4.png" width="20%" height="30%" title="px(픽셀) 크기 설정" alt="mypage"></img><br/>
<img src="https://user-images.githubusercontent.com/68541650/97738539-d8cb3980-1b21-11eb-8474-217ca7a505cf.png" width="20%" height="30%" title="px(픽셀) 크기 설정" alt="photoUpload"></img>
<img src="https://user-images.githubusercontent.com/68541650/97738573-e08ade00-1b21-11eb-96b8-954243c4b3e3.png" width="20%" height="30%" title="px(픽셀) 크기 설정" alt="Comments"></img>
<img src="https://user-images.githubusercontent.com/68541650/97738574-e08ade00-1b21-11eb-9515-95d02927fb2e.png" width="20%" height="30%" title="px(픽셀) 크기 설정" alt="favorit"></img>

강의 출처 : 인프런 - [하울의 안드로이드 인스타그램 클론 만들기](https://www.inflearn.com/course/%EC%9D%B8%EC%8A%A4%ED%83%80%EA%B7%B8%EB%9E%A8%EB%A7%8C%EB%93%A4%EA%B8%B0-%EC%95%88%EB%93%9C%EB%A1%9C%EC%9D%B4%EB%93%9C/dashboard)
