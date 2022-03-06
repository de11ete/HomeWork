/**
 * Java 1.Home Work #8
 *
 * @author Ivan
 * @version 05.03.2022
 */
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

class CounterApp extends JFrame {

    private int value;

    public static void main(String[] args) {
        new CounterApp(0);
    }
        
    CounterApp(final int initialValue) {
        setTitle("Simple Counter");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        Font font = new Font("Arial", Font.BOLD, 40);

        value = initialValue;

        JLabel counterValueView = new JLabel();
        counterValueView.setFont(font);
        counterValueView.setHorizontalAlignment(SwingConstants.CENTER);
        add(counterValueView, BorderLayout.CENTER);

        counterValueView.setText(String.valueOf(value));

        JButton decrementButton = new JButton("<");
        decrementButton.setFont(font);
        decrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                value--;
                counterValueView.setText(String.valueOf(value));
            }
        });
        add(decrementButton, BorderLayout.WEST);
        
        JButton incrementButton = new JButton(">");
        incrementButton.setFont(font);
        incrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                value++;
                counterValueView.setText(String.valueOf(value));
            }
        });
        add(incrementButton, BorderLayout.EAST);

        setVisible(true);
    }
}
