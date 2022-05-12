package dataAccess;

import exception.MissingObjectException;
import exception.StringLengthException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public abstract class AbstractSQLOperation<T> {
    public ArrayList<T> getAll() throws SQLException, StringLengthException, MissingObjectException {

        ArrayList<T> allElements = new ArrayList<>();
        
        T element;

        Connection connection = SingletonConnection.getInstance();

        String sql = "select * from "+ getTableName() + " ORDER BY `id` ASC";

        PreparedStatement statement = connection.prepareStatement(sql);

        ResultSet data = statement.executeQuery();

        while (data.next()) {
            element = resultSetToObject(data);
            allElements.add(element);
        }

        return allElements;
    }

    public T getElementByID(Integer targetID) throws SQLException, MissingObjectException, StringLengthException {

        T element;



        Connection connection = SingletonConnection.getInstance();

        String sql = "select * from "+ getTableName() + " WHERE `id` = ?";

        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setInt(1, targetID);

        ResultSet data = statement.executeQuery();

        data.next();

        element = resultSetToObject(data);

        return element;
    }

    public void deleteElementByID(Integer targetID) throws SQLException {

        Connection connection = SingletonConnection.getInstance();

        String sql = "DELETE FROM "+ getTableName() + " WHERE `id` = ?";

        PreparedStatement statement = connection.prepareStatement(sql);

        //statement.setString(1, getTableName());

        statement.setInt(1, targetID);

        statement.executeUpdate();

    }

    public void insertElement(T elementTargeted) throws SQLException {

        Connection connection = SingletonConnection.getInstance();

        PreparedStatement statement = getInsertStatement(connection, elementTargeted);

        statement.executeUpdate();

    }

    abstract PreparedStatement getInsertStatement(Connection connection, T elementTargeted) throws SQLException;
    abstract String getTableName();
    abstract T resultSetToObject(ResultSet data) throws SQLException, MissingObjectException, StringLengthException;

}
