class Dimension {
	 private int x, y; 
	 Dimension (int x, int y) {
		 this.x = x;
		 this.y = y;
	 }
     public void set(int x, int y) {
    	 this.x=x;
    	 this.y=y;
     }
     public int getx() {
    	 return x;
     }

     public int gety() {
    	 return y;
     }
     public boolean compare(Dimension second) {
    	 if (x == second.getx() && y == second.gety()) {
    		 return true;
    	 }
    	 else {
    		 return false;
    	 }
     }
}