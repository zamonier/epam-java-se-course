package unit2.lambdas;

import javax.swing.*;
import java.util.function.BiFunction;

/**
 * Created by Eugene on 18.02.17.
 */
public class Example1 {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton();
        final Integer d = 6;
        button.addActionListener((event ->
                System.out.println(d)));
        button.setText("Hello");
        frame.add(button);
        frame.pack();
        frame.setVisible(true);

        BiFunction<Integer, Integer, Integer> e = (x, y) -> x + y;
    }
}
