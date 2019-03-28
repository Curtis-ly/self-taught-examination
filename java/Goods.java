package experiment;

class Goods {
	
	private String name;
	private double cost;
	private String place;
	private double weight;
	
	public Goods(String name,double cost,String place,double weight) {
		this.name = name;
		this.cost = cost;
		this.place = place;
		this.weight = weight;
	}

	public String getName(){
		return name;
	}
	
	public double getCost(){
		return cost;
	}
	
	public String getPlace(){
		return place;
	}
	
	public double getWeight(){
		return weight;
	}
	
	
	
}
