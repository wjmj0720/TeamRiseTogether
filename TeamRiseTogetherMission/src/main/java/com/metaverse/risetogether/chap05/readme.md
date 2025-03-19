# 문제 1: 상품 할인 가격 계산 시스템

## 요구사항 명세서

### 입력:
- `Discountable` 인터페이스를 구현한 `Product` 객체 배열.
- `Product` 클래스와 이를 상속한 `Electronics`와 `Clothing` 클래스 (각각 다른 할인 정책).

### 처리:
1. **`Discountable` 인터페이스 정의**
    - `getDiscountedPrice()` 메서드를 정의하여 상품의 할인 가격을 계산하는 기능을 제공.

2. **`Product` 클래스 정의**
    - `productId`, `name`, `price` 속성을 정의.
    - `getDiscountedPrice()` 메서드를 구현하여 상품의 할인 가격을 기본적으로 계산 (기본 가격을 그대로 반환할 수 있음).

3. **`Electronics` 클래스 정의**
    - `Product` 클래스를 상속하고, `getDiscountedPrice()` 메서드를 오버라이드하여 10% 할인 적용.

4. **`Clothing` 클래스 정의**
    - `Product` 클래스를 상속하고, `getDiscountedPrice()` 메서드를 오버라이드하여 15% 할인 적용.

5. **`ProductDiscountCalculator` 클래스 정의**
    - 제네릭 메서드 `calculateDiscountedPrices(T[] items)` 작성하여 할인 가격을 계산.
    - 총 할인 가격과 평균 할인 가격을 반환하는 기능을 구현.

### JUnit 테스트 환경:
- `@BeforeEach`, `@AfterEach`, `@Test` 어노테이션을 사용하여 각 클래스와 메서드에 대한 테스트 작성.

---

## 개발 순서

1. **`Discountable` 인터페이스 정의**
    - `double getDiscountedPrice()` 메서드를 선언하여, 할인된 가격을 반환하는 기능을 제공.

2. **`Product` 클래스 정의**
    - `productId`, `name`, `price` 속성을 정의.
    - `getDiscountedPrice()` 메서드를 기본적으로 구현하여 원래 가격을 반환.

3. **`Electronics` 클래스 정의**
    - `Product` 클래스를 상속받고, `getDiscountedPrice()` 메서드를 오버라이드하여 10% 할인 적용.

4. **`Clothing` 클래스 정의**
    - `Product` 클래스를 상속받고, `getDiscountedPrice()` 메서드를 오버라이드하여 15% 할인 적용.

5. **`ProductDiscountCalculator` 클래스 정의**
    - 제네릭 메서드 `calculateDiscountedPrices()` 작성. 이를 통해 할인 가격을 계산하고, 총 할인 금액과 평균 할인 금액을 반환하는 기능을 구현.

6. **JUnit 테스트 작성**
    - `@BeforeEach`, `@AfterEach`, `@Test` 어노테이션을 사용하여 각 클래스와 메서드에 대한 테스트 작성.

---

## 개발 순서도

```plaintext
1. Discountable 인터페이스 정의
2. Product 클래스 정의
   └─ productId, name, price 속성 정의
   └─ getDiscountedPrice() 기본 구현
3. Electronics 클래스 정의
   └─ getDiscountedPrice() 10% 할인 적용
4. Clothing 클래스 정의
   └─ getDiscountedPrice() 15% 할인 적용
5. ProductDiscountCalculator 클래스 정의
   └─ calculateDiscountedPrices() 메서드 작성
6. JUnit 테스트 작성
