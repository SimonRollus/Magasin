package userInterface;

import javax.swing.*;

public class MainWindow extends JFrame {
    public MainWindow(){

        super("Magasin");

        setBounds(100, 100, 1000, 600);
        setVisible(true);

        MainMenuBar menu = new MainMenuBar();

        setJMenuBar(menu);
    }
}
