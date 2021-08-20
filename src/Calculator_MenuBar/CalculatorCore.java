package Calculator_MenuBar;

import java.text.DecimalFormat;
import javax.swing.JTextField;

public class CalculatorCore {

    private JTextField display;
    private JTextField display2;

    private boolean start = true;
    private boolean dot = true;
    private double total = 0;
    private char previous_operator = '=';
    private final int PRECISION = 10;
    private final DecimalFormat formatter = new DecimalFormat();

    public CalculatorCore() {
        formatter.setMaximumFractionDigits(PRECISION);
        formatter.setGroupingUsed(false);
    }

    public void setSharedDisplay(JTextField display) {
        this.display = display;
    }

    public void setSharedDisplay2(JTextField display2) {
        this.display2 = display2;
    }

    public void setDigit(String digit) {
        if (start) {
            display.setText(digit);
            start = false;
        } else {
            display.setText(display.getText() + digit);
        }
    }

    public void setOperator(String opr) {
        double number = Double.parseDouble(display.getText());
        display2.setText(display2.getText() + display.getText());
        switch (previous_operator) {
            case '+':
                total += number;
                break;
            case '-':
                total -= number;
                break;
            case '*':
                total *= number;
                break;
            case '/':
                total /= number;
                break;
            case '=':
                total = number;
                break;
        }
        display.setText(formatter.format(total));
        start = true;
        dot = true;
        if (opr.equals("=")) {
            display2.setText("");
        } else {
            display2.setText(display2.getText() + opr);
        }
        previous_operator = opr.charAt(0);
    }

    public void setDot() {
        if (dot) {
            dot = false;
            if (start) {
                display.setText("0.");
                start = false;
            } else {
                display.setText(display.getText() + ".");
            }
        }
    }

    public void clearEntry() {
        display.setText("0");
        start = true;
        dot = true;
    }

    public void clearAll() {
        display.setText("0");
        display2.setText("");
        start = true;
        dot = true;
        previous_operator = '=';
        total = 0;
    }

    public void back() {
        String d = display.getText();
        if (".".equals(d.substring(d.length() - 1))) {
            dot = true;
        }
        d = d.substring(0, d.length() - 1);
        if (d.length() == 0 || "-".equals(d)) {
            display.setText("0");
            start = true;
        } else {
            display.setText(d);
        }
    }

    public void negate() {
        double d = Double.parseDouble(display.getText());
        d *= -1;
        display.setText(formatter.format(d));
    }
}
