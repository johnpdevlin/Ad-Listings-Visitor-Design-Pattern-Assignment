package assignment3OOP;

public class Car implements AdsOnline{
	
	/* 
	 * Class created to avoid duplication of variables specific to a car, should the same car model be listed
	 */
	
	// VARIABLES //
	private String make;
	private String model;
	private String engineSize;
	// VARIABLES // END //
	
	public Car(String make, String model, String engineSize) {
		// TODO Auto-generated constructor stub
		this.make = make;
		this.model = model;
		this.engineSize = engineSize;
	}

	public void accept(Visitor visitor) {
		// Asks the visitor to perform its operation
		visitor.visit(this);
	}

	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}

	/**
	 * @param make the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}

	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the engineSize
	 */
	public String getEngineSize() {
		return engineSize;
	}

	/**
	 * @param engineSize the engineSize to set
	 */
	public void setEngineSize(String engineSize) {
		this.engineSize = engineSize;
	}
}
