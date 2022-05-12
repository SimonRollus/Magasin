package userInterface;

import javax.swing.*;
import java.awt.*;

public class StockPanel extends JPanel {
    private ListPlusMoins list;
    public StockPanel() {

        setBackground(Color.GREEN);

        list = new ListPlusMoins();

        setLayout(new BorderLayout());

        add(list, BorderLayout.WEST);
    }


}
