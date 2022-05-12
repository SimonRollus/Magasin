import dataAccess.SQLOperationUsers;
import model.User;
import userInterface.MainWindow;

public class Main {
    public static void main(String[] args) {

        //MainWindow mainWindow = new MainWindow("Stock");



        try {
            User u1 = new User(5, "jackmich", 1, "s", "Jack", "Mich", "0498 26 25 96");

            SQLOperationUsers operationUsers = new SQLOperationUsers();

            User result = operationUsers.getElementByID(7);

            System.out.println(result);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

//        AbstractAllGetter gc = new AllGetterCategories();
//
//        ArrayList<Category> collection = gc.getAll();
//
//        MagasinManager manager = new MagasinManager();
//
//        manager.displayArrayList(collection);



    }
}
