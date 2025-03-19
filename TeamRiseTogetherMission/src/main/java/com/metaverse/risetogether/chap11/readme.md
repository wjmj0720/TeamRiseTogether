# 문제 2: 중복 없는 상품 목록 관리 시스템

## 요구사항 명세서

### 입력:
- `Set<Product>` 객체를 사용하여 중복 없는 상품 정보를 관리.

### 처리:
1. **`Product` 클래스 정의**
    - `productId`, `name`, `price` 속성 정의.

2. **`ProductManager` 클래스 정의**
    - `addProduct(Product product)` 메서드로 상품을 `Set<Product>`에 추가.
    - `getAllProducts()` 메서드로 상품 목록을 출력.
    - `removeProduct(String productId)` 메서드로 특정 상품을 삭제.

### JUnit 테스트 환경:
- `@BeforeEach`, `@AfterEach`, `@Test` 어노테이션을 사용하여 각 클래스와 메서드에 대한 테스트 작성.

---

## 개발 순서

1. **`Product` 클래스 정의**
    - `productId`, `name`, `price` 속성을 정의하여 상품 정보를 저장.

2. **`ProductManager` 클래스 정의**
    - `addProduct(Product product)` 메서드 작성하여 상품을 `Set<Product>`에 추가.
    - `getAllProducts()` 메서드 작성하여 상품 목록을 출력.
    - `removeProduct(String productId)` 메서드 작성하여 특정 상품을 삭제.

3. **JUnit 테스트 작성**
    - `@BeforeEach`, `@AfterEach`, `@Test` 어노테이션을 사용하여 각 메서드가 정상적으로 작동하는지 확인하는 단위 테스트 작성.

---

## 개발 순서도

```plaintext
1. Product 클래스 정의
   └─ productId, name, price 속성 정의
2. ProductManager 클래스 정의
   └─ addProduct() 메서드 작성 (상품 추가)
   └─ getAllProducts() 메서드 작성 (상품 목록 출력)
   └─ removeProduct() 메서드 작성 (상품 삭제)
3. JUnit 테스트 작성
   └─ 각 메서드에 대한 단위 테스트 작성
