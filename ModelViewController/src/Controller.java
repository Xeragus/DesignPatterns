// the controller
public class Controller {
	private Player model;
	private PlayerView view;
	
	public Controller(Player model, PlayerView view) {
		this.model = model;
		this.view = view;
	}
	
	public void setName(String name) {
		model.setName(name);
	}
	
	public void setShirtNumber(int shirtNumber) {
		model.setShirtNumber(shirtNumber);
	}
	
	public String getName() {
		return model.getName();
	}
	
	public int getShirtNumber() {
		return model.getShirtNumber();
	}
	
	public void viewModel() {
		view.showModel(model.getName(), model.getShirtNumber());
	}
}
