/*
package dataAccess;

import exception.MissingObjectException;
import exception.StringLengthException;
import model.Category;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SQLOperationCategories extends AbstractSQLOperation<Category> {

    @Override
    String getTableName() {
        return "Category";
    }

    @Override
    Category resultSetToObject(ResultSet data) throws SQLException, MissingObjectException, StringLengthException {
        return new Category(data.getInt("id"), data.getString("label"));
    }
}
*/
