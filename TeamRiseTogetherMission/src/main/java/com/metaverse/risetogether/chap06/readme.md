# 문제 2: 학생 성적 관리 시스템

## 요구사항 명세서

### 입력:
- `Graded` 인터페이스를 구현한 `Student` 객체 배열.

### 처리:
1. **`Graded` 인터페이스 정의**
    - `getGrade()` 메서드를 정의하여 학생의 평균 성적을 반환하는 기능을 제공.

2. **`Student` 클래스 정의**
    - `studentId`, `name`, `grades` 속성을 정의.
    - `getGrade()` 메서드를 구현하여 학생의 평균 성적을 반환.

3. **`StudentManager` 클래스 정의**
    - 제네릭 메서드 `calculateAverageGrades(T[] students)` 작성하여 학생들의 평균 성적을 계산하고 출력하는 기능을 구현.

### JUnit 테스트 환경:
- `@BeforeEach`, `@AfterEach`, `@Test` 어노테이션을 사용하여 각 클래스와 메서드에 대한 테스트 작성.

---

## 개발 순서

1. **`Graded` 인터페이스 정의**
    - `double getGrade()` 메서드를 선언하여, 학생의 평균 성적을 반환하는 기능을 제공.

2. **`Student` 클래스 정의**
    - `studentId`, `name`, `grades` 속성을 정의.
    - `getGrade()` 메서드를 구현하여 학생의 평균 성적을 계산.

3. **`StudentManager` 클래스 정의**
    - 제네릭 메서드 `calculateAverageGrades()` 작성. 이를 통해 학생들의 평균 성적을 계산하고 출력하는 기능을 구현.

4. **JUnit 테스트 작성**
    - `@BeforeEach`, `@AfterEach`, `@Test` 어노테이션을 사용하여 각 클래스와 메서드에 대한 테스트 작성.

---

## 개발 순서도

```plaintext
1. Graded 인터페이스 정의
2. Student 클래스 정의
   └─ studentId, name, grades 속성 정의
   └─ getGrade() 메서드 구현 (학생의 평균 성적 반환)
3. StudentManager 클래스 정의
   └─ calculateAverageGrades() 메서드 작성 (학생들의 평균 성적 계산)
4. JUnit 테스트 작성
