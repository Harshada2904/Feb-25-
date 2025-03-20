class Box{
	private double height;
	private double width;
	private double breadth;
	
	
	 Box(double height,double width, double breadth){
		this.height = height;
		this.width = width;
		this.breadth = breadth;
	
	
	}
	double getVolume(){
		return height*width*breadth;
	
	}

	double getArea(){
		return 2*(width*breadth + breadth*height + width*height); 
	
	}
	
	public static void main(String args[]){
		Box b = new Box(2.5,4.2,6.9);
		Box b1 = new Box(9,5,3);
		System.out.println("Volume of the box is: "+b.getVolume());
		System.out.println("Surface area if the box is: "+b1.getArea());
	}
}