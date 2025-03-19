문제 2: 직원 관리 시스템 (캡슐화 + 상속)
요구사항 명세서
Employee 클래스

필드
name: 직원 이름을 나타내는 private 필드.
id: 직원 ID를 나타내는 private 필드.
salary: 직원 급여를 나타내는 private 필드.
생성자
name, id, salary를 초기화하는 생성자를 정의한다.
메소드
getName(): 직원 이름을 반환하는 public 메소드.
getId(): 직원 ID를 반환하는 public 메소드.
getSalary(): 직원 급여를 반환하는 public 메소드.
Manager 클래스

상속
Employee 클래스를 상속받는다.
필드
department: 직원의 부서를 나타내는 private 필드.
메소드
getDepartment(): 직원 부서를 반환하는 public 메소드.
setDepartment(String department): 직원 부서를 설정하는 public 메소드.
Engineer 클래스

상속
Employee 클래스를 상속받는다.
필드
specialization: 직원의 기술 전문 분야를 나타내는 private 필드.
메소드
getSpecialization(): 직원의 기술 전문 분야를 반환하는 public 메소드.
setSpecialization(String specialization): 직원의 기술 전문 분야를 설정하는 public 메소드.
Main 클래스
Manager와 Engineer 객체를 각각 생성하고, 직원의 정보(이름, ID, 급여, 부서, 전문 분야)를 출력하는 프로그램을 작성한다.

예시 출력
Manager: Name: John Smith, ID: 101, Salary: 5000, Department: HR
Engineer: Name: Alice Brown, ID: 102, Salary: 4000, Specialization: Java Development
