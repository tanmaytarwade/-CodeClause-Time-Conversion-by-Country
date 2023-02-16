public class Timezone {
	
	private int hourDiff;
	private String destination;
	private int index;
	

	public Timezone(int index, String destination, int hourDiff) {
		this.index = index;
		this.destination = destination;
		this.hourDiff = hourDiff;
	}
	


	public int getHourDiff() {
		return hourDiff;
	}


	public String getDestination() {
		return destination;
	}
	
	public int getIndex() {
		return index;
	}

}
