
public class MVCPatternDemo {

	public static void main(String[] args) {
		PlayerView view = new PlayerView();
		Player model = createPlayer();
		Controller controller = new Controller(model, view);
		
		controller.viewModel();
		controller.setName("Aaron Ramsey");
		controller.setShirtNumber(8);
		controller.viewModel();;
	}
	
	public static Player createPlayer() {
		Player model = new Player();
		model.setName("Mesut Ozil");
		model.setShirtNumber(11);
		return model;
	}
}
