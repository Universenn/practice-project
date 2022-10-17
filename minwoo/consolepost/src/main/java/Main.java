import controller.ConsolePostController;
import repository.ConsolePostRepository;
import service.ConsolePostService;
import view.ConsolePostView;

public class Main {
    public static void main(String[] args) {
        ConsolePostRepository repository = new ConsolePostRepository();
        ConsolePostService service = new ConsolePostService(repository);
        ConsolePostController controller = new ConsolePostController(service);
        ConsolePostView view = new ConsolePostView();
        ConsolePostApplication consolePostApplication = new ConsolePostApplication(view, controller);

        consolePostApplication.run();
    }
}
