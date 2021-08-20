package Calculator_MVC;

import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorControl implements ActionListener, KeyEventDispatcher {

    private CalculatorCore core;
    private CasioForm casio;

    private JTextField display;
    private JTextField display2;
    private JPanel panelBtnArea;

    public CalculatorControl() {
        casio = new CasioForm();
        casio.setVisible(true);
        display = casio.getSharedDisplay();
        display2 = casio.getSharedDisplay2();
        panelBtnArea = casio.getPanel();

        core = new CalculatorCore();
        core.setSharedDisplay(display);
        core.setSharedDisplay2(display2);

        for (Object obj : panelBtnArea.getComponents()) {
            if (obj instanceof JButton) {
                JButton btn = (JButton) obj;
                btn.addActionListener(this);
            }
        }
        KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String btnName = e.getActionCommand();
        switch (btnName) {
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
                core.setDigit(btnName);
                break;
            case "+":
                core.setOperator("+");
                break;
            case "-":
                core.setOperator("-");
                break;
            case "*":
                core.setOperator("*");
                break;
            case "/":
                core.setOperator("/");
                break;
            case ".":
                core.setDot();
                break;
            case "=":
                core.setOperator("=");
                break;
            case "CE":
                core.clearEntry();
                break;
            case "C":
                core.clearAll();
                break;
            case "±":
                core.negate();
                break;
            case "←":
                core.back();
                break;
        }
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent e) {
        if (e.getID() == KeyEvent.KEY_PRESSED) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                core.setOperator("=");
            }
        } else if (e.getID() == KeyEvent.KEY_TYPED) {
            String k = String.format("%c", e.getKeyChar());
            switch (k) {
                case "0":
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                case "7":
                case "8":
                case "9":
                    core.setDigit(k);
                    break;
                case "+":
                    core.setOperator("+");
                    break;
                case "-":
                    core.setOperator("-");
                    break;
                case "*":
                    core.setOperator("*");
                    break;
                case "/":
                    core.setOperator("/");
                    break;
                case ".":
                    core.setDot();
                    break;
                case "=":
                    core.setOperator("=");
                    break;
                case " ":
                    core.negate();
            }
        }
        return false;
    }

    public static void main(String[] args) {
        new CalculatorControl();
    }
}
