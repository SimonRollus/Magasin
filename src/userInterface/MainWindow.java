package userInterface;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    private Container frameContainer;
    private JPanel currentPanel;

    public MainWindow(){

        super("Magasin");
        setBounds(100, 100, 1500, 800);

        frameContainer = this.getContentPane();

        frameContainer.setLayout(new BorderLayout());

        MainMenuBar menu = new MainMenuBar();
        setJMenuBar(menu);

        currentPanel = new TrackPanel();

        frameContainer.add(currentPanel, BorderLayout.CENTER);

        this.setVisible(true);
    }
}
