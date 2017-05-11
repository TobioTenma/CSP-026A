class ParkingTicket extends ParkingMeter {


    private double fine;
    private double hoursParked;
    private double totalFine;
    
    public ParkingTicket(double boughtTime, double fine, double hours){
    
    super.boughtTime = boughtTime;
    fine = fine;
    hoursParked = hoursParked;
    
    }
    
    //calculating fine
        public void calculateFine() {

        fine = boughtTime - hoursParked;

        if (fine > 0) {
            totalFine = fine * 25;
        }

    }
    
    
    
    
}
