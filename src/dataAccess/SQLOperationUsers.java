package dataAccess;
import exception.MissingObjectException;
import exception.StringLengthException;
import model.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SQLOperationUsers extends AbstractSQLOperation<User> {

    @Override
    PreparedStatement getInsertStatement(Connection connection, User elementTargeted) throws SQLException {
        String sql = "INSERT INTO User (userName, password, firstName, lastName, phoneNumber, roleID) value (?, ?, ?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setString(1, elementTargeted.getUsername());
        statement.setString(2, elementTargeted.getPassword());
        statement.setString(3, elementTargeted.getFirstName());
        statement.setString(4, elementTargeted.getLastName());
        statement.setString(5, elementTargeted.getPhoneNumber());
        statement.setInt(   6, elementTargeted.getRoleID());
        return statement;
    }

    @Override
    String getTableName() {
        return "User";
    }

    @Override
    User resultSetToObject(ResultSet data) throws SQLException, MissingObjectException, StringLengthException {

        System.out.println(data.getString("phoneNumber"));

        return new User(data.getInt("id"),
                data.getString("userName"),
                data.getInt("roleID"),
                data.getString("password"),
                data.getString("firstName"),
                data.getString("lastName"),
                data.getString("phoneNumber"));
    }
}
