import controllers.MainController;
import services.AutheService;
import views.MainView;

public class MainApp {
    public static void main(String[] args) {
        AutheService autheService = new AutheService();
        MainView mainView = new MainView();
        MainController mainController = new MainController(mainView, autheService);
        mainController.start();
    }
}
