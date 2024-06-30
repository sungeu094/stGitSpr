
## Maven VS Gradle

둘 다 프로젝트 관리 및 생성 도구로써 사용하는 것이다.

Maven : LifeCycle 이용해 라이브러리 관리, 프로젝트를 Build한다. 해당 작업은 porm.xml에서 일어나는 것으로 POM(Project Object Model)을 정의해서 사용하는 것이다.
기본적으로 LifeCycle이란 'validate(빌드 가능한 프로젝트인지) -> compile(프로젝트 소스 코드 컴파일) -> test(적절한 단위 테스트 프레임워크를 사용해 컴파일된 코드에 대해 테스트) -> package(컴파일된 코드를 jar,war과 같은 배포할 수 있는 형식으로 패키징) -> verify(품질 기준 만족여부 확인) -> install(패키징한 파일 로컬 저장소 배포) -> deploy(패키징한 파일 원격 저장소에 배포)'를 의미한다.

Maven에 의존성을 더해주기 위해서는 Maven Project에서 원하는 의존성을 xml 형식으로 뽑아와서 porm.xml에 넣어주면 된다.
Porm.xml의 plugin은 Maven을 작동시켜주는 하나의 프레임워크와 같다고 보면 된다. (자바 프로젝트를 만들기 위해서 사용하는 프레임워크가 SpringBoot인 것처럼 작동을 위한 도구라고 판단하면 될 것 같다.) Plugin 각각은 하나 이상의 goal(lifecycle의 section)을 포함하고 있다고 보면 된다. 현재 porm.xml에 존재하는 것은 build에 사용할 플러그인이라는 것을 보여주는 것이다.

--> 하지만 이것은 의존성(dependency) 관리에 있어서 상속하는 형식으로 하기 때문에 설정을 주입받아서 의존성을 관리하는 Gradle보다 복잡하고, 시간도 많이 걸린다.

Gradle : Maven보다 상용화가 늦게 된 것 말고는 장점뿐인 빌드 도구로써 'Compile -> Test -> Packaging -> Deploy/Run' 의 과정을 가진다. 위의 Maven은 porm.xml 파일로 관리하였지만 Gradle은 Groovy 문법을 이용한 간결한 스크립트를 이용한다. 또한 설정 주입하는 방법을 사용하기 때문에 빌드 속도도 확실히 빠르다.


  