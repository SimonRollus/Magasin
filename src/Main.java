import business.MagasinManager;
import dataAccess.AbstractAllGetter;
import dataAccess.AllGetterCategories;
import dataAccess.AllGetterUsers;
import model.Category;
import model.User;
import userInterface.MainWindow;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //MainWindow mainWindow = new MainWindow();

        AbstractAllGetter gc = new AllGetterCategories();

        ArrayList<Category> collection = gc.getAll();

        MagasinManager manager = new MagasinManager();

        manager.displayArrayList(collection);



    }
}
