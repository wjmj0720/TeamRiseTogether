# 문제 2: 쇼핑몰 상품 관리 시스템

## 요구사항 명세서

### 입력:
- `Product` 객체 배열을 관리하는 `List<Product>` 객체.

### 처리:
1. **`Product` 클래스 정의**
    - `productId`, `name`, `price` 속성 정의.

2. **`ProductManager` 클래스 정의**
    - `addProduct(Product product)` 메서드로 상품을 추가.
    - `getProductDetails(String productId)` 메서드로 상품 정보를 조회.
    - `getAllProducts()` 메서드로 상품 목록을 출력.

### JUnit 테스트 환경:
- `@BeforeEach`, `@AfterEach`, `@Test` 어노테이션을 사용하여 각 클래스와 메서드에 대한 테스트 작성.

---

## 개발 순서

1. **`Product` 클래스 정의**
    - `productId`, `name`, `price` 속성을 정의하여 상품의 기본 정보를 관리.

2. **`ProductManager` 클래스 정의**
    - `addProduct(Product product)` 메서드 작성하여 상품을 `List<Product>`에 추가.
    - `getProductDetails(String productId)` 메서드 작성하여 `productId`를 기준으로 상품 정보를 조회.
    - `getAllProducts()` 메서드 작성하여 모든 상품 목록을 출력.

3. **JUnit 테스트 작성**
    - `@BeforeEach`, `@AfterEach`, `@Test` 어노테이션을 사용하여 각 메서드가 올바르게 동작하는지 테스트.

---

## 개발 순서도

```plaintext
1. Product 클래스 정의
   └─ productId, name, price 속성 정의
2. ProductManager 클래스 정의
   └─ addProduct() 메서드 작성 (상품 추가)
   └─ getProductDetails() 메서드 작성 (상품 정보 조회)
   └─ getAllProducts() 메서드 작성 (상품 목록 출력)
3. JUnit 테스트 작성
   └─ 각 메서드에 대한 단위 테스트 작성
