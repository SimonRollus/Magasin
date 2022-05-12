package model;

import exception.MissingObjectException;
import utilitary.Security;

public class MagasinObjet {

    private Integer id;

    public MagasinObjet(Integer id) throws MissingObjectException {
        setId(id);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) throws MissingObjectException {
        Security.MissingObjectTest("id", this.getClass().getSimpleName(), id);
        this.id = id;
    }


}
