import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GView view = new GView();
            UModel model = new UModel();
            new GController(model, view);
            view.setVisible(true);
        });
    }
}
