--=== history 객체
사용자의 웹사이트 사용 내역

history.length : 히스토리 목록에 포함된 url의 수
history.back() : 뒤로 이동
history.forward() : 앞으로 이동
history.go(2) : 현재 url 위치에서 2만큼 앞으로 이동 (음수 => 뒤로 빽, 양수 => 앞으로)

--== Location 객체
현재 윈도우의 url 주소에 대한 정보 제공 객체

location.host : 호스트 이름과 포트번호(url로 부터 분리하여 제공) // 호스트이름 : www.naver.com / 포트번호 : 그 후반의
    번호들.. 생략가능하다. 이게 열려야 상대쪽 서버가 오픈해서 내 컴에 다운로드가 다 되면 통신이 가능해진다. 외부와 통신하기 위한 문.

location.hostname : url 주소에 대한 호스트 이름
location.href : 하이퍼 링크로 주소 지정
location.pathname : 디렉토리 위치 (호스트)
location.port : 호스트 포트번호
location.protocol : 프로토콜 종류
location.reload() : 문서 다시 읽기. 다시 불러오기
window.location.assign (url 주소) : url로 이동(방문기록 저장)
window.location.replace( url ) : url로 이동(방문기록을 덮어서 쓴다!)

--====== navigater 객체

웹브라우저의 특성 정보를 가지는 객체

navigator.appName : 사용중인 브라우저 종류
navigator.appCodeName : 사용중인 웹브라우저 이름
navigator.appVersion : 브라우저 버전 및 os 이름
navigator.plaform : 운영체제 환경
navigator.userAgent : 웹브라우저 종류와 버전
nabigator.plugins : 설치 된 플러그인 정보
navigator.mimeTypes : 브라우저에서 지원되는 mime 타입 
    - mime 타입의 종류: text, image, audio, video.application (비디오), message, multiprot

    image = gif, jpeg (다른 이미지를 쓸 거면? / 직접 프로그램짜던가<ㅋㅋㅋ/ 다른 사람들은 다른 일을 맡아야한다.)
    video = mpeg
    application = stream, script