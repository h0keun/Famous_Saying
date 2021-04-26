### Famous_Saying

+ Firebase Remote Config
+ ViewPager2(PageTrasnformer : 스와이프할때 흐려지는 효과, 무한스크롤)

### Remote Config [👉](https://firebase.google.com/docs/remote-config)
간단하게 말하면 앱을 업데이트하지 않아도 앱의 동작과 모양을 변결할 수 있는 클라우드 서비스  
+ Firebase 원격 구성 로딩 전략
  1. 로드 시 가져와서 활성화  
  ```
  앱을 처음 시작할 때 fetchAndActivate()를 호출하여 원격구성에서 새 값을 가져와  
  로드가 완료되는 즉시 활성화(UI가 크게 변경되지 않는 선에서 적합)
  ```  
  2. 로딩 화면 뒤에서 활성화  
  ```
  전략 1에서 발생할 수 있는 잠재적인 UI문제를 해결하기위해 앱을 즉시 실행하지 않고  
  로딩화면을 만들고 핸들러에서 fetchAndActivate()를 호출 이후 사용자는 로딩화면을 닫고 앱과 상호작용
  ```  
  3. 다음 시작 시 새 값 로드  
  ```
  앱의 다음 시작 시 활성화
  ```

diffUtil 이란??
