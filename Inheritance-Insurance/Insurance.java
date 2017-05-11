public class Insurance{
	private Customer customer;
	private int duration;
	private static Insurance [] array = new Insurance[10];
	private int ic=0;

	public void setDuration(int duration) {
				this.duration = duration;
				}
		public int getDuration(){return this.duration;}

		public String toString(){
			return "Customer: "+customer+ "Duration"+duration;
			}
		public Insurance(int duration, Customer customer){
			this.duration = duration;
			this.customer = customer;
			while (ic<=9){
				array [ic]=this;
				ic++;
				}
			}
		public String insurance_cost(){
			return ("A fixed price of 100 euro:");

			}
	}