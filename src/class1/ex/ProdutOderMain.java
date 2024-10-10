package class1.ex;
/* 상품 주문 시스템 개발 */
public class ProdutOderMain {

    public static void main(String[] args) {
        ProductOrder product1 = new ProductOrder();
        product1.productName = "두부";
        product1.price = 2000;
        product1.quantity = 2;

        ProductOrder product2 = new ProductOrder();
        product2.productName = "김치";
        product2.price = 5000;
        product2.quantity = 1;

        ProductOrder product3 = new ProductOrder();
        product3.productName = "김치";
        product3.price = 5000;
        product3.quantity = 2;

        ProductOrder[] orders = new ProductOrder[]{product1, product2, product3};

        int totalPrice = 0;
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
            totalPrice += order.price * order.quantity;
        }

        System.out.println("총 결제 금액: " + totalPrice);
    }
}
