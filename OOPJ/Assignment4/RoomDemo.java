class Room{
	double height;
	double width;
	double breadth;
	public Room(double height, double width, double breadth){
	this.height = height;
	this.width = width;
	this.breadth = breadth;
	
	}
	public double volume(){
		return height*width*breadth;
	
	}

}

class RoomDemo{
	public static void main(String arhs[]){
		Room r = new Room(10.5,12.0,15.0);
		Room r1 = new Room(6.0,18.7,9.4);
		System.out.println("Volume of room: "+r.volume());
		System.out.println("Volume of room: "+r1.volume());
	}

}
