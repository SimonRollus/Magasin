package userInterface;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

public class MainWindow extends JFrame {

    final private Container frameContainer;
    final private HashMap<String, JPanel> panels;
    private JPanel currentPanel;

    public MainWindow(String defaultPanelName){

        super("Magasin");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1500, 800);

        frameContainer = this.getContentPane();

        frameContainer.setLayout(new BorderLayout());

        MainMenuBar menu = new MainMenuBar(this);
        setJMenuBar(menu);

        panels = new HashMap<>();

        panels.put("Manage", new ManagePanel());
        panels.put("Track", new TrackPanel());
        panels.put("Stock", new StockPanel());

        setCurrentPanel(defaultPanelName);

        this.setVisible(true);
    }

    public void setCurrentPanel(String panelName) {
        if (panels.containsKey(panelName)) {
            System.out.println("Hello tu es dans MainWindow + currentPanel = " + panelName);
            if (currentPanel != null)
                frameContainer.remove(currentPanel);

            currentPanel = panels.get(panelName);
            frameContainer.add(currentPanel);
            frameContainer.repaint();
            this.setVisible(true);
        }
    }
}
