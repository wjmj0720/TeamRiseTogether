# 문제 1: 중복 없는 학생 목록 관리 시스템

## 요구사항 명세서

### 입력:
- `Set<Student>` 객체를 사용하여 중복 없는 학생 정보를 관리.

### 처리:
1. **`Student` 클래스 정의**
    - `studentId`, `name`, `age` 속성 정의.

2. **`StudentManager` 클래스 정의**
    - `addStudent(Student student)` 메서드로 학생을 추가.
    - `getAllStudents()` 메서드로 학생 목록을 출력.
    - `removeStudent(String studentId)` 메서드로 특정 학생을 삭제.

### JUnit 테스트 환경:
- `@BeforeEach`, `@AfterEach`, `@Test` 어노테이션을 사용하여 각 클래스와 메서드에 대한 테스트 작성.

---

## 개발 순서

1. **`Student` 클래스 정의**
    - `studentId`, `name`, `age` 속성을 정의하여 학생 정보를 저장.

2. **`StudentManager` 클래스 정의**
    - `addStudent(Student student)` 메서드 작성하여 학생을 `Set<Student>`에 추가.
    - `getAllStudents()` 메서드 작성하여 학생 목록을 출력.
    - `removeStudent(String studentId)` 메서드 작성하여 특정 학생을 삭제.

3. **JUnit 테스트 작성**
    - `@BeforeEach`, `@AfterEach`, `@Test` 어노테이션을 사용하여 각 메서드가 정상적으로 작동하는지 확인하는 단위 테스트 작성.

---

## 개발 순서도

```plaintext
1. Student 클래스 정의
   └─ studentId, name, age 속성 정의
2. StudentManager 클래스 정의
   └─ addStudent() 메서드 작성 (학생 추가)
   └─ getAllStudents() 메서드 작성 (학생 목록 출력)
   └─ removeStudent() 메서드 작성 (학생 삭제)
3. JUnit 테스트 작성
   └─ 각 메서드에 대한 단위 테스트 작성
