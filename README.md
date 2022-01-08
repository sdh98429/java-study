# java-study

21/01/01

repo 제작



21/01/02

자바 기초 프로그래밍 강좌 1강 - Hello World!

#### JDK

> 자바의 기본적인 개발을 가능하게 해주는 개발 환경



#### JDK 환경 변수 설정

> javac 명령은 자바 파일을 컴파일하여 실행하기 위해서 필요한 명령
>
> JDK 설치 후 환경 변수 설정을 제대로 하면 CMD(명령프롬프트)에서 javac 입력시 정상적으로 컴파일 관련 옵션이 출력됨
>
> 환경 변수 서정이 되어있지 않으면 javac 기능이 인지 안되기 때문에 환경변수 설정에서 경로 지정이 중요



#### Eclipse

> 자바를 개발할 때 더욱 효율적인 개발을 가능하게 해주는 개발 환경
>
> Java 개발자용 IDE 선택



JDK 설치

환경변수 설정

Eclipse 설치

```java
System.out.println("Hello World!")
// "" 대신 ''는 에러 뜸 System.out.println('Hello World!')
```



21/01/06

자바 기초 프로그래밍 강좌 2강 - 변수(Variable)

#### 변수

프로그램이 실행되는 동안 저장된 값이 변경될 수 있는 공간



#### 상수

한 번 정해지면 값을 변경할 필요가 없는 데이터



final - 한 번 선언시 절대 바뀌지 않음 (상수)

static - 하나의 class에서 공유하는 자원

오버플로 - 



21/01/08

자바 기초 프로그래밍 강좌 3강 - 자료형(Data Type)

#### 변수 관련 상식

- 변수 초기화를 하지 않으면 사용할 수 없음
- 정수 타입 여러개 short, int, long
- 정수 변수 안에 실수를 넣으면 정수 부분만 변수에 저장됨
- 실수 값 반올림할 때 변수에 0.5를 더한 뒤 정수형으로 형변화
- 반올림한 값 = (int) (실수 + 0.5)



#### 자료형 - 데이터 타입

- C언어와 차이 Boolean, String
- Primitive 원시형은 자바에서 기본적으로 사용되는 것, Non-Primitive (String, Array, etc.)는 char 등 다른 것들을 사용하여 만들어진 타입
- String은 내부적으로 substring 등의 함수 제공



자바 기초 프로그래밍 강좌 3강 - 자료형(Data Type)



#### 자료형

- 정수를 나타낸 자료형이 많은 이유는 `각 자료형이 차지하는 메모리 공간의 크기가 다르기 때문`
- double형이더라도 과도하게 큰 수 저장하고자 하면 잘못된 계산 결과
- 소수점 표기를 지수 형식으로 출력하고 싶으면 `%e`를 이용하면 됨
- 자바에서 String은 내부적으로 char의 배열로 되어있는데, String의 자바에서의 최대 크기는 4G라고 함
- 자바 String은 클래스 기반의 비원시적인 자료형



#### 연산자

- +, -, *, /, %

숫자가 피연산자 +가 연산자



- ++, -- 증감연산자

- %연산자 (modular)

- == > < &&(and) ||(or) !

- 삼항연산자 = 조건 ? 참 : 거짓
  - 함수 : 반환형, 함수이름, 매개 변수 (static은 main 함수에서 쓰기 위함)

- pow()
  - double a = Math.pow(3.0, 20.0)
  - (int) a



자바 기초 프로그래밍 강좌 5강 - 조건문 & 반복문 ①

#### 연산자 팁

- i++와 ++i는 단순 값 증가 목적이라면 기능이 동일
  - 하지만 출력에선 다름
- 100 < x < 200은 잘못됨 (100 < x) && (x < 200)로 표현
- i++는 i += 1, i = i +1 모두 1 증가로 동일



#### 조건문 & 반복문

if while for

- if

  - if (a.contains("Love")){
  - }else{
  - }

- String

  - 		// 자바는 String을 비교할 때 equals()을 이용한다.
    		// 그 이유는 String은 다른 자료형과 다른 문자열 자료형이기 때문

  - a.equals()

  - equalsIgnoreCase

    - 대소문자 무시

- while(){}

- for

  - for 문 : 초기화 부분, 조건 부분, 연산 부분
    - for (int i = N; i > 0; i--)
  - println 대신 print 쓰면 줄바꿈 없음





자바 기초 프로그래밍 강좌 7강 - 기본 입출력(Input & Output)

#### 조건문 & 반복문 Tip

- 하나의 비교 연산자는 true 혹은 false 반환
- 모든 조건, 반복문은 무조건 괄호 적용이 좋음
- for, while문 중첩 가능
- for(;;)는 while(true)와 똑같이 무한 루프라는 의미로 동작
- break;을 이용하여 반복문을 즉시 빠져나올 수 있음



#### 기본 입출력

> 자바에서는 대표적으로 `Scanner()` 클래스를 이용하여 사용자와 상호작용할 수 있음
>
> 일반적으로 Scanner sc = new Scanner(System.in); 으로 클래스 객체를 생성한 후에
>
> sc.nextInt(); 와 같은 방법으로 int 형을 입력 받을 수 있음
>
> 프로그램 입출력이 잘 지원된다는 것은 사용자 인터페이스가 뛰어나다는 의미

- Scanner 그냥 쓰면 좌측에 에러가 뜬다. 그러므로 왼쪽 에러 클릭하고 Scanner import해주면 됨

  - //		Scanner sc = new Scanner(System.in); (사용자 입력)
    //		System.out.print("정수를 입력하세요: ");
    //		int i = sc.nextInt();
    //		sc.close();

- 끝난 후 sc.close()로 안정성을 키워줌

- 		File file = new File ("input.txt");
  		Scanner sc = new Scanner(file);

  - 빨간 줄은 input.txt 없을 때 예외 사항 없어서임
    - catch/try 사용하면 됨

- 		File file = new File ("input.txt");
  		try {
  			Scanner sc = new Scanner(file);
  			while(sc.hasNextInt()) {
  				System.out.println(sc.nextInt() * 100);
  			}
  			sc.close();
  		} catch (FileNotFoundException e) {
  			System.out.println("파일을 읽어오는 도중에 오류 발생");
  		}

  - hasNextInt()
    - 다음에 읽어올 정수가 있는지 확인

- Scanner로 문자열을 입력 받고 싶을 때에는 `next()` 함수와 `nextLine()`를 사용



자바 기초 프로그래밍 강좌 9강 - 사용자 정의 함수 ①

> 객체 지향 프로그래밍의 꽃 자바

#### 자바 객체지향 프로그래밍

동적 웹 애플리케이션 구현시 JSP와 같은 자바 기반의 프로그래밍을 할 수 있음

객체지향 프로그래밍의 장점을 살린 MVC 모델을 이용한 구축이 이루어짐

현실세계를 표현

