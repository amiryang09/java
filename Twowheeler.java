package assignment;

public class Twowheeler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Twowheeler obj1 = new Twowheeler();
		
		int noofWheels = obj1.noofWheels();
		System.out.println(noofWheels);
		
		short noofMirrors = obj1.noofMirrors();
		System.out.println(noofMirrors);
		
		long Number = obj1.Number();
		System.out.println(Number);
		
		boolean isPunctured = obj1.isPunctured();
		System.out.println(isPunctured);
		
		double runningKM = obj1.runningKM();
		System.out.println(runningKM);
		
		obj1.bikename();		
	}
        public int noofWheels() {
        int Wheels = 200;
        return Wheels;
        }
        
        public short noofMirrors() {
        short Mirrors = 10;
        return Mirrors;
        }
        
        public long Number() {
        long num = 11111111111111111L;
        return num;
        }
        
        private boolean isPunctured() {
        boolean Punctured = true;
        return Punctured;
        }
        
        private double runningKM() {
        double kms = 13.49181213301;
        return kms;
        }
        
        String bikename() {
        String nameofbike = "duke";
        System.out.println(nameofbike);
        return nameofbike;
        }
          
}


















