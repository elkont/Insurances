public class Health extends Insurance{
		private int expense;
		public int count=0;
		private static Health[] array = new Health[10];
		private double cost;

		public void setExpense(int expense) {
						this.expense = expense;
						}
		public int getExpense(Customer customer, int duration){return this.expense;}


				public String toString(){
					return ("Expense " + expense);
			}

			//constructor
		public Health(int duration,Customer customer, int expense){
			super(duration, customer);
			this.expense = expense;
			while (count<=9){
				array[count]=this;
				count++;
				}
			}
			public double health_cost() {
			            if (this.getCustomer().getSex().equals("male")){
			                return super.InsuranceCost()+7*(2017-this.getCustomer().getYear())+50+2.5/100*this.expense;
			        		}
			        else {
			            return super.InsuranceCost()+7*(2017-this.getCustomer().getYear())+2.5/100*this.expense;
			        	}
					}
				}








