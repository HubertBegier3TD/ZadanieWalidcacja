import javax.swing.*;
public class GController {
    private UModel model;
    private GView view;
    public GController(UModel model, GView view) {
        this.model = model;
        this.view = view;
        view.loginButton.addActionListener(e -> zaloguj());
    }
    private void zaloguj() {
        String user = view.userField.getText();
        String pass = new String(view.passField.getPassword());
        view.loginButton.setEnabled(false);
        view.statusLabel.setText("Trwa weryfikacja danych...");
        new SwingWorker<Boolean, Void>() {
            @Override
            protected Boolean doInBackground() {
                return model.walidujLogowanie(user, pass);
            }
            @Override
            protected void done() {
                try {
                    if (get()) {
                        view.statusLabel.setText("Logowanie pomyślne!");
                    } else {
                        view.statusLabel.setText("Błędny login lub hasło!");
                    }
                } catch (Exception e) {
                    view.statusLabel.setText("Błąd systemu!");
                }
                view.loginButton.setEnabled(true);
            }
        }.execute();
    }
}
