**미션 2: 대출/반납 기록을 로그 파일로 저장하는 기능 구현**

- **입력:**
    - 대출 또는 반납 거래 기록을 나타내는 문자열
  
- **기능:**
    1. 입력받은 거래 기록을 로그 파일(예: "transaction.log")에 추가(append) 모드로 저장한다.
    2. 파일 입출력 과정에서 발생할 수 있는 예외를 처리하며, 잘못된 파일 경로 등의 예외 상황에 대해 assertThrows를 이용한 테스트를 진행한다.

- **출력 예:**
    - "transaction.log" 파일에 대출/반납 기록이 추가되어 저장됨


**미션 2 (대출/반납 로그 파일 저장):**
1. `LogManager` 클래스를 정의하여:
    - `logTransaction(String record, String filePath)` 메서드 구현
    - 파일 입출력 시 발생하는 IOException을 try-catch로 처리한다.
2. main() 메서드에서 샘플 거래 기록을 이용하여 로그 파일 저장 기능을 시연한다.

## 나의 접근 방법
2. LogManager 클래스 정의 
3. record와 filePath를 매개변수로 갖는 메서드 
logTransaction에 try-catch 구문을 사용해서 입출력 예외 메시지 출력 >> 대출하는 책 이름 + 메시지 (""책 대출)
///////----txt로 원하는 값 넣기-----/////
스캐너를 활용해서 반납 대출 구성
4. while문을 사용해서 Scanner를 계속 호출
5. 반납/대출 -> 회원 ID -> 책이름 -> 대출/반납 성공!
++가능하다면 책 이름에서 리스트를 사용해서 있는 책이라면 대출 가능 없을시 불가 