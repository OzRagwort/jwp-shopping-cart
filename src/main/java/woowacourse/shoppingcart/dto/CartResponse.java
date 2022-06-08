package woowacourse.shoppingcart.dto;

import woowacourse.shoppingcart.domain.Cart;

public class CartResponse {

    private Long id;
    private Long productId;
    private String name;
    private int price;
    private String imageUrl;
    private long quantity;
    private boolean checked;

    private CartResponse() {
    }

    public CartResponse(Long id, Long productId, String name, int price, String imageUrl, long quantity, boolean checked) {
        this.id = id;
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.imageUrl = imageUrl;
        this.quantity = quantity;
        this.checked = checked;
    }

    public Long getId() {
        return id;
    }

    public Long getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public long getQuantity() {
        return quantity;
    }

    public boolean isChecked() {
        return checked;
    }
}
