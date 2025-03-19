# 문제 2: 주문 관리 시스템

## 요구사항 명세서

### 입력:
- `Order` 객체와 `HashMap<String, Order>`를 사용하여 주문 정보를 관리.

### 처리:
1. **`Order` 클래스 정의**
    - `orderId`, `customerName`, `totalAmount` 속성 정의.

2. **`OrderManager` 클래스 정의**
    - `addOrder(String orderId, Order order)` 메서드로 주문을 추가.
    - `getOrderById(String orderId)` 메서드로 주문을 조회.
    - `getAllOrders()` 메서드를 정의하여 모든 주문 정보를 출력.

### JUnit 테스트 환경:
- `@BeforeEach`, `@AfterEach`, `@Test` 어노테이션을 사용하여 각 클래스와 메서드에 대한 테스트 작성.

---

## 개발 순서

1. **`Order` 클래스 정의**
    - `orderId`, `customerName`, `totalAmount` 속성을 정의하여 주문 정보를 저장.

2. **`OrderManager` 클래스 정의**
    - `addOrder(String orderId, Order order)` 메서드 작성하여 `HashMap<String, Order>`에 주문을 추가.
    - `getOrderById(String orderId)` 메서드 작성하여 `orderId`에 맞는 주문을 조회.
    - `getAllOrders()` 메서드 작성하여 모든 주문 정보를 출력.

3. **JUnit 테스트 작성**
    - `@BeforeEach`, `@AfterEach`, `@Test` 어노테이션을 사용하여 각 메서드가 정상적으로 작동하는지 확인하는 단위 테스트 작성.

---

## 개발 순서도

```plaintext
1. Order 클래스 정의
   └─ orderId, customerName, totalAmount 속성 정의
2. OrderManager 클래스 정의
   └─ addOrder() 메서드 작성 (주문 추가)
   └─ getOrderById() 메서드 작성 (주문 조회)
   └─ getAllOrders() 메서드 작성 (모든 주문 정보 출력)
3. JUnit 테스트 작성
   └─ 각 메서드에 대한 단위 테스트 작성
