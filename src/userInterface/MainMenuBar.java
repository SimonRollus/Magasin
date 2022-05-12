package userInterface;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class MainMenuBar extends JMenuBar {
    private JMenu accountMenu, orderMenu, adminMenu;
    private JMenuItem logoff, edit, manage, track, stock;
    private MainWindow parentFrame;

    public MainMenuBar(MainWindow parentFrame) {

        this.parentFrame = parentFrame;

        //Account Menu

        accountMenu = new JMenu("Account");
        accountMenu.setMnemonic('A');
        this.add(accountMenu);

        logoff = new JMenuItem("Log off");
        accountMenu.add(logoff);

        edit = new JMenuItem("Edit");
        accountMenu.add(edit);

        //Order Menu

        orderMenu = new JMenu("Orders");
        orderMenu.setMnemonic('O');
        this.add(orderMenu);

        manage = new JMenuItem("Manage");
        orderMenu.add(manage);

        ChangePanelListener manageListener = new ChangePanelListener(parentFrame, "Manage");
        manage.addActionListener(manageListener);

        track = new JMenuItem("Track");
        orderMenu.add(track);

        ChangePanelListener trackListener = new ChangePanelListener(parentFrame, "Track");
        track.addActionListener(trackListener);

        // Admin Menu

        adminMenu = new JMenu("Admin");
        adminMenu.setMnemonic('a');
        this.add(adminMenu);

        stock = new JMenuItem("Stock");
        adminMenu.add(stock);

        ChangePanelListener stockListener = new ChangePanelListener(parentFrame, "Stock");
        stock.addActionListener(stockListener);






    }

    private class ChangePanelListener implements ActionListener {

        private MainWindow frameAffected;
        private String panelTargetName;

        public ChangePanelListener(MainWindow frameAffected, String panelTargetName) {
            this.frameAffected = frameAffected;
            this.panelTargetName = panelTargetName;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            //System.out.println(panelTargetName);
            frameAffected.setCurrentPanel(panelTargetName);
        }
    }
}
