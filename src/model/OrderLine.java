package model;

import exception.MissingObjectException;
import utilitary.Security;

import java.util.ArrayList;

public class OrderLine extends MagasinObjet {
    private Integer orderID;
    private Integer articleID;
    private Integer quantity;



    public OrderLine(Integer id, Integer orderID, Integer articleID, Integer quantity) throws MissingObjectException {
        super(id);
        setOrderID(orderID);
        setArticle(articleID);
        setQuantity(quantity);
    }

    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(Integer orderID) throws MissingObjectException{
        Security.MissingObjectTest("orderID", "OrderLine", orderID);
    }

    public Integer getArticleID() {
        return articleID;
    }

    public void setArticle(Integer article) throws MissingObjectException{
        Security.MissingObjectTest("article", "OrderLine", article);
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
