class LightBulb{
	private boolean ison = false;
	
	void SwitchOn(){
	if(!ison){
		ison = true;
		System.out.println("LightBulb is on");
		else{
		
		System.out.println("LightBulb is off");
		}
	
	
	}
	
	void Switchoff(){
		if(ison){
			ison = false;
			System.out.println("LightBulb is off");
			
			}
		else{
			System.out.println("LightBulb is already off");
		
		}
		}
		
		void Checkstate(){
			if(ison){
				System.out.println("LightBulb is currently on");
			
			}
			else {
				System.out.println("LightBulb is currently off");
			
			}
		
		}
		public static void main(String args[]){
			
			LightBulb bulb = new LightBulb();
			bulb.checkstate();
			bulb.SwitchOn();
			bulb.Switchon();
			bulb.Switchoff();
			bulb.Checkstate();
		}
	}
	
	}




}