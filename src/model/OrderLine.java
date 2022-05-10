package model;

import exception.MissingObjectException;
import exception.SecurityUtil;

public class OrderLine {
    private Integer id;
    private Order order;
    private Article article;
    private Integer quantity;

    public OrderLine(Integer id, Order order, Article article, Integer quantity) throws MissingObjectException {
        setId(id);
        setOrder(order);
        setArticle(article);
        setQuantity(quantity);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) throws MissingObjectException{
        SecurityUtil.MissingObjectTest("Order", "OrderLine", order);
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) throws MissingObjectException{
        SecurityUtil.MissingObjectTest("Article", "OrderLine", article);
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
