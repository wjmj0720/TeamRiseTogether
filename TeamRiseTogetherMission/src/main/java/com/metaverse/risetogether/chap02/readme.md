학생 관리 시스템 (캡슐화 + 상속)
요구사항 명세서
1. Student 클래스

필드
name: 학생의 이름을 나타내는 private 필드.
age: 학생의 나이를 나타내는 private 필드.
생성자
name과 age를 초기화하는 생성자를 정의한다.
메소드
getName(): 학생의 이름을 반환하는 public 메소드.
getAge(): 학생의 나이를 반환하는 public 메소드.
2. GradeStudent 클래스

상속
Student 클래스를 상속받는다.
필드
grade: 학생의 성적을 나타내는 private 필드.
메소드
setGrade(int grade): 성적을 설정하는 public 메소드.
getGrade(): 성적을 반환하는 public 메소드.
printStudentInfo(): 학생의 이름, 나이, 성적을 출력하는 public 메소드.
3. Main 클래스

GradeStudent 객체를 생성하고, setGrade() 메소드로 성적을 입력하고, printStudentInfo() 메소드를 호출하여 정보를 출력한다.
입력 예시:

이름: John, 나이: 20, 성적: 85
출력 예시:

Name: John, Age: 20, Grade: 85