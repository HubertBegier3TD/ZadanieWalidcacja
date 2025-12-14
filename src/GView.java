import javax.swing.*;
public class GView extends JFrame {
    JTextField userField = new JTextField();
    JPasswordField passField = new JPasswordField();
    JButton loginButton = new JButton("Zaloguj");
    JLabel statusLabel = new JLabel("");
    public GView() {
        setTitle("Logowanie");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        add(new JLabel("Login:")).setBounds(20, 20, 60, 25);
        add(new JLabel("Hasło:")).setBounds(20, 55, 60, 25);
        userField.setBounds(80, 20, 150, 25);
        passField.setBounds(80, 55, 150, 25);
        loginButton.setBounds(80, 90, 150, 30);
        statusLabel.setBounds(40, 130, 220, 25);
        add(userField);
        add(passField);
        add(loginButton);
        add(statusLabel);
    }
}
