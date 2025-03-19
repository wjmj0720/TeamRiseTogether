# 문제 1: 사용자 정보 관리 시스템

## 요구사항 명세서

### 입력:
- `User` 객체와 `HashMap<String, User>`를 사용하여 사용자 정보를 관리.

### 처리:
1. **`User` 클래스 정의**
    - `userId`, `name`, `email` 속성 정의.

2. **`UserManager` 클래스 정의**
    - `addUser(String userId, User user)` 메서드로 사용자를 추가.
    - `getUserById(String userId)` 메서드로 사용자를 조회.
    - `displayAllUsers()` 메서드로 모든 사용자의 정보를 출력.

### JUnit 테스트 환경:
- `@BeforeEach`, `@AfterEach`, `@Test` 어노테이션을 사용하여 각 클래스와 메서드에 대한 테스트 작성.

---

## 개발 순서

1. **`User` 클래스 정의**
    - `userId`, `name`, `email` 속성을 정의하여 사용자 정보를 저장.

2. **`UserManager` 클래스 정의**
    - `addUser(String userId, User user)` 메서드 작성하여 `HashMap<String, User>`에 사용자를 추가.
    - `getUserById(String userId)` 메서드 작성하여 `userId`를 기준으로 사용자를 조회.
    - `displayAllUsers()` 메서드 작성하여 모든 사용자 정보를 출력.

3. **JUnit 테스트 작성**
    - `@BeforeEach`, `@AfterEach`, `@Test` 어노테이션을 사용하여 각 메서드가 정상적으로 작동하는지 확인하는 단위 테스트 작성.

---

## 개발 순서도

```plaintext
1. User 클래스 정의
   └─ userId, name, email 속성 정의
2. UserManager 클래스 정의
   └─ addUser() 메서드 작성 (사용자 추가)
   └─ getUserById() 메서드 작성 (사용자 조회)
   └─ displayAllUsers() 메서드 작성 (모든 사용자 정보 출력)
3. JUnit 테스트 작성
   └─ 각 메서드에 대한 단위 테스트 작성
# 문제 1: 사용자 정보 관리 시스템

## 요구사항 명세서

### 입력:
- `User` 객체와 `HashMap<String, User>`를 사용하여 사용자 정보를 관리.

### 처리:
1. **`User` 클래스 정의**
    - `userId`, `name`, `email` 속성 정의.

2. **`UserManager` 클래스 정의**
    - `addUser(String userId, User user)` 메서드로 사용자를 추가.
    - `getUserById(String userId)` 메서드로 사용자를 조회.
    - `displayAllUsers()` 메서드로 모든 사용자의 정보를 출력.

### JUnit 테스트 환경:
- `@BeforeEach`, `@AfterEach`, `@Test` 어노테이션을 사용하여 각 클래스와 메서드에 대한 테스트 작성.

---

## 개발 순서

1. **`User` 클래스 정의**
    - `userId`, `name`, `email` 속성을 정의하여 사용자 정보를 저장.

2. **`UserManager` 클래스 정의**
    - `addUser(String userId, User user)` 메서드 작성하여 `HashMap<String, User>`에 사용자를 추가.
    - `getUserById(String userId)` 메서드 작성하여 `userId`를 기준으로 사용자를 조회.
    - `displayAllUsers()` 메서드 작성하여 모든 사용자 정보를 출력.

3. **JUnit 테스트 작성**
    - `@BeforeEach`, `@AfterEach`, `@Test` 어노테이션을 사용하여 각 메서드가 정상적으로 작동하는지 확인하는 단위 테스트 작성.

---

## 개발 순서도

```plaintext
1. User 클래스 정의
   └─ userId, name, email 속성 정의
2. UserManager 클래스 정의
   └─ addUser() 메서드 작성 (사용자 추가)
   └─ getUserById() 메서드 작성 (사용자 조회)
   └─ displayAllUsers() 메서드 작성 (모든 사용자 정보 출력)
3. JUnit 테스트 작성
   └─ 각 메서드에 대한 단위 테스트 작성
