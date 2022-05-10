package dataAccess;

import model.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MagasinDBAccess {

    public ArrayList<User> getAllUsers() {

        ArrayList<User> allUsers = new ArrayList<>();



        User user;

        try {
            Connection connection = SingletonConnection.getInstance();

            String sql = "select * from `User`";

            PreparedStatement statement = connection.prepareStatement(sql);

            ResultSet data = statement.executeQuery();

            while (data.next()) {
                try {

                    ArrayList<Role> allRoles = getAllRoles();

                    user = new User(data.getInt("id"),
                            data.getString("userName"),
                            allRoles.get(data.getInt("roleID")-1),
                            data.getString("password"),
                            data.getString("firstName"),
                            data.getString("lastName"),
                            data.getString("phoneNumber"));

                     allUsers.add(user);
                } catch (Exception exception) {
                    System.out.println(exception.getMessage());
                }

            }

        } catch (SQLException exception) {
            System.out.println("Gestion des exception à implémenter");
        }
        return allUsers;
    }

    public ArrayList<Role> getAllRoles() {
        ArrayList<Role> allRoles = new ArrayList<>();

        Role role;

        try {
            Connection connection = SingletonConnection.getInstance();

            String sql = "select * from `Role` ORDER BY `id` ASC";

            PreparedStatement statement = connection.prepareStatement(sql);

            ResultSet data = statement.executeQuery();

            while (data.next()) {
                try {
                    role = new Role(data.getString("title"));
                    allRoles.add(role);
                } catch (Exception exception) {
                    System.out.println(exception.getMessage());
                }

            }

        } catch (SQLException exception) {
            System.out.println("Gestion des exception à implémenter");
        }
        return allRoles;
    }

    public ArrayList<Category> getAllCategories() {
        ArrayList<Category> allCategories = new ArrayList<>();

        Category category;

        try {
            Connection connection = SingletonConnection.getInstance();

            String sql = "select * from `category` ORDER BY `id` ASC";

            PreparedStatement statement = connection.prepareStatement(sql);

            ResultSet data = statement.executeQuery();

            while (data.next()) {
                try {
                    category = new Category(data.getString("label"));
                    allCategories.add(category);
                } catch (Exception exception) {
                    System.out.println(exception.getMessage());
                }

            }

        } catch (SQLException exception) {
            System.out.println("Gestion des exception à implémenter");
        }
        return allCategories;
    }

    public ArrayList<Status> getAllStatus() {
        ArrayList<Status> allStatuses = new ArrayList<>();

        Status status;

        try {
            Connection connection = SingletonConnection.getInstance();

            String sql = "select * from `Status` ORDER BY `id` ASC";

            PreparedStatement statement = connection.prepareStatement(sql);

            ResultSet data = statement.executeQuery();

            while (data.next()) {
                try {
                    status = new Status(data.getString("title"));
                    allStatuses.add(status);
                } catch (Exception exception) {
                    System.out.println(exception.getMessage());
                }

            }

        } catch (SQLException exception) {
            System.out.println("Gestion des exception à implémenter");
        }
        return allStatuses;
    }
}
