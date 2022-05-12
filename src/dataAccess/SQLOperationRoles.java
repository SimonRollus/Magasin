/*
package dataAccess;

import exception.MissingObjectException;
import exception.StringLengthException;
import model.Role;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SQLOperationRoles extends AbstractSQLOperation<Role> {

    @Override
    String getTableName() {
        return "Role";
    }

    @Override
    Role resultSetToObject(ResultSet data) throws SQLException, MissingObjectException, StringLengthException {
            return new Role(data.getInt("id"), data.getString("title"));
    }
}
*/
