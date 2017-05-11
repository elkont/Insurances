public class Customer{
	private int code;
	private String name;
	private int year;
	private String sex;
	private static Customer [] array = new Customer[10];
	private int id=0;

	public void setName(String name) {
			this.name = name;
			}
		public String getName(){return this.name;}

	public void setYear(int year) {
		this.year = year;
		}
		public int getYear(){return this.year;}

	public void setSex(String code) {
			this.sex = sex;
			}
		public String getSex(){return this.sex;}

		//constructor
		public Customer(String name, int year,String sex){
			this.name = name;
			this.year = year;
			this.sex = sex;
			while (id<=9){
				array[id]=this;
				id++;
				}
			}

	public String toString(){
		return ("Customer name: "+name+" Year: "+year+" Sex: "+sex);
		}

}