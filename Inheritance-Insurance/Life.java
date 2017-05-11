public class Life extends Insurance{
	private int invest;
	private static Life[] array = new Life[10];
	private int lc=0;
	int count=0;

	public void setInvest(int invest) {
				this.invest = invest;
				}
		public int getInvest(){return this.invest;}

		@Override
		public String toString(){
			return ("Invest: " + invest);
			}
		// constructor
		public Life(int duration, Customer customer, int invest){
			super(duration, customer);
			this.invest=invest;
			while(count<=9){
				array [lc]=this;
				lc++;
				}

			}

			public double cost_calculation(){
				double cost = 100 + 5*this.getDuration() + 0.05*this.invest;
				return cost;
				}
}