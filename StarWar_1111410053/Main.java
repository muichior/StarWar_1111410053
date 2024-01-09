package StarWar_1111410053;

import java.util.Arrays;

public class Main {
	 public static void main(String[] args) {
		
	 }
	class AirCraft
{
		
		private String Manufacturer  ;//屬性
		private String Model;
		private double Length; //長度
		private double AirSpeed ; //公里小時
		private String SpaceSpeed; //重力加速度
		private String StdandardEngine ;//引擎
		private String HyperSpaceEngine;
	    private int Passenger;//人員
	
		public String getManufacturer() {
			return Manufacturer;
		}

		public void setManufacturer(String manufacturer) {
			Manufacturer = manufacturer;
		}

		public String getModel() {
			return Model;
		}

		public void setModel(String model) {
			Model = model;
		}

		public double getLength() {
			return Length;
		}

		public void setLength(double length) {
			Length = length;
		}

		public double getAirSpeed() {
			return AirSpeed;
		}

		public void setAirSpeed(double airSpeed) {
			AirSpeed = airSpeed;
		}

		public String getSpaceSpeed() {
			return SpaceSpeed;
		}

		public void setSpaceSpeed(String spaceSpeed) {
			SpaceSpeed = spaceSpeed;
		}

		public String getStdandardEngine() {
			return StdandardEngine;
		}

		public void setStdandardEngine(String stdandardEngine) {
			StdandardEngine = stdandardEngine;
		}

		public String getHyperSpaceEngine() {
			return HyperSpaceEngine;
		}

		public void setHyperSpaceEngine(String hyperSpaceEngine) {
			HyperSpaceEngine = hyperSpaceEngine;
		}

		public int getPassenger() {
			return Passenger;
		}

		public void setPassenger(int passenger) {
			Passenger = passenger;
		}
		
	}
			
 class XWing extends AirCraft//(X 翼戰機)
	{
		void fight()
		{
		  System.out.println("攻擊");
		}
		
		String [] Weapon={"SFS L-s1 型雷射加農炮","SFS L-s1 型雷射加農炮"};//X戰機 
		double[] Weapon_power={1000,1000,1000,1000,5,5};
		private int Passenger;//人員
		String[] Shield = {"無護盾（升級版可選）"};
		String[] ShieldPower= {"無護盾（升級版可選）"};
		
		
	 @Override
		public String toString() {
			return "XWing [Weapon=" + Arrays.toString(Weapon) + ", Weapon_power=" + Arrays.toString(Weapon_power)
					+ ", Passenger=" + Passenger + ", Shield=" + Arrays.toString(Shield) + ", ShieldPower="
					+ Arrays.toString(ShieldPower) + "]";
		}


	class TieFighter extends AirCraft  //(鈦戰機)
	{
		void fight()
		{
		  System.out.println("攻擊");
		}
	}
}

 static final  String [] Weapon={ "Taim & Bak KX9 雷射加農炮"," Taim & Bak KX9 雷射加農炮", 
			       "Taim & Bak KX9 雷射加農炮"," Taim & Bak KX9 雷射加農炮", 
				   "Krupx MG7 質子魚雷發射器", "Krupx MG7 質子魚雷發射器"};//x翼戰機	
 static final double[]Weapon_power={1000,1000} ;
 static final String[] Shield = {"1.Chempat防禦者型偏轉幕發射器"
				+ "(\"Defender\" "+"Deflector-Screen"+"Projector)"
				+"2.Chempat 偏轉防護盾投射器(DeflectorShield Projector)","3.鈦合金加勁外殼"};
 static final String[] ShieldPower= {"1.2000"+ "2.3000 "+"3.1000"};
@Override
public String toString() {
	return "Main []";
}
}	


			
		
	
	
	
	
	
	

	

