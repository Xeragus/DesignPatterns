
public class EngineerFactory {
	public Engineer createEngineer(String engineerType) {
		if(engineerType.equalsIgnoreCase("electrical"))
			return new ElectricalEngineer();
		else if(engineerType.equalsIgnoreCase("computer"))
			return new ComputerEngineer();
		else if(engineerType.equalsIgnoreCase("mechanical"))
			return new MechanicalEngineer();
		return null;
	}
}
