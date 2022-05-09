package userInterface;

import javax.swing.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class MainMenuBar extends JMenuBar {
    private JMenu accountMenu, orderMenu;
    private JMenuItem logoff, edit, manage, track;

    public MainMenuBar() {

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

        track = new JMenuItem("Track");
        orderMenu.add(track);


    }
}
