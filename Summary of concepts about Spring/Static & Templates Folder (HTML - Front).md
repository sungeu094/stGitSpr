기본적으로 서버에 접속할 때는 static파일의 index.html로 이동하게 된다. 기본 진입점으로 index.html이 선택되어 있기 때문에 만약에 원하면 application.properties에서 설정해주면 된다.

만약 static 폴더에 index.html 파일이 있는 경우가 아니면 Error Page(404) - "클라이언트의 잘못된 요청" 발생한다. 내가 만약 static 폴더 내에 member라는 폴더를 만들고(static/member) 해당 폴더 내에 index.html이라는 파일을 만들 경우(static/member/index.html) HTTP에 'localhost:8080/member/'라고 입력을 하더라도 해당 폴더의 index.html에 접근하는게 아닌 것은 알아야 한다.

현재 경우에는 template 영역에 있는 파일들에는 접근할 수 없다. 그렇기 때문에 Template 폴더에 있는 html 파일(정적 파일이 아닌 데이터를 받고 줄 수 있는 파일)을 찾아갈 수 있도록 해주려면 Thymeleaf(html이 확장자) 또는 Mustache(mustache가 확장자) 의존성을 추가해 주는 것도 하나의 방법이다.

***
## Thymeleaf (JSP 대신 사용하는 Template Engine)

template 영역의 폴더를 사용하기 위한 하나의 Template Engine이다. 해당 확장자는 .html이고 templates 폴더에는 관련 파일들만 동작한다.

#### 경로 설정 : spring.thymeleaf.prefix = classpath:/templates/.../
#### 확장자 설정 : spring.thymeleaf.suffix = .html
#### thymeleaf 템플릿에 대한 캐시 여부 : spring.thymeleaf.cache = false
#### spring.thymeleaf.check-template-location = true : templates dir에 파일 있는지 없는지 체크하고 없으면 에러를 발생
#### html 작성에 있어서 틀린 부분에 대한 확인을 정확하게 하기 위해서는 spring.thymeleaf.mode = LEGACYHTML5 (+ net.sourceforge.nekohtml:nekohtml)



