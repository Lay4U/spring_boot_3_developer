# 스프링 부트 3 백엔드 개발자 되기
- JWT 쿠키 생성및 제거시 CookieUtil로 깔끔하게 사용 가능
- JwtFactory 현재 코드랑 비교해서 가져갈거는 가져가기. 이쪽 코드가 더 깔끔,
- JwtProperties라는 클래스로 yaml파일에 있는 값을 @Value 대신 사용 장단점 확인 필요.
- 인증 성공 핸들러의 기본이 되는 SimpleUrlAuthenticationSuccessHandler를 OAuth2SuccessHandler로 구성. 인증 성공시 사용자에게 인증 권한 부여 및 쿠키 발행.
- Controller에서 Principal 객체를 파라미터로 받아오면 인증된 사용자의 정보를 가져올 수 있음. (Context로부터 가져오는것과 장단점 확인 필요)
- 테스트 코드에 Mockito로 주입을 받는데 이게 맞는건가?
