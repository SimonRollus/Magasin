package userInterface;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ListPlusMoins extends JPanel {
    private JList list;
    private JButton plus, minus;
    public ListPlusMoins() {

        setBackground(Color.CYAN);

        setLayout(new BorderLayout());

        String values[] = {"Simon", "Rollus", "Olivier", "Didier", "Test", "Simon"};

        list = new JList(values);

        list.setPreferredSize(new Dimension(500, 500));

        add(list, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();

        buttonPanel.setPreferredSize(new Dimension(250, 25));

        plus = new JButton("+");
        minus = new JButton("-");

        plus.setPreferredSize(new Dimension(250, 25));
        minus.setPreferredSize(new Dimension(250, 25));

        buttonPanel.setLayout(new GridLayout(1, 2));

        buttonPanel.add(plus);
        buttonPanel.add(minus);

        add(buttonPanel, BorderLayout.CENTER);




    }
}
