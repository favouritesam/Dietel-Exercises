package airline;

public class FavzyAir {
    private boolean[] seats;
    private final int firstClassTicketCategory = 1;

    public FavzyAir() {
        int numberOfSeatsOnPlan = 10;
        this.seats = new boolean[numberOfSeatsOnPlan];
    }

    public boolean[] getSeats() {
        return seats;
    }

    public void bookedTicket(int bookingCategory) {
        if (bookingCategory == firstClassTicketCategory) {
            for (int counter = 0; counter < seats.length - 5; counter++) {
                boolean isOccupiedSeat = seats[counter];
                if (!isOccupiedSeat) {
                    seats[counter] = true;
                    break;
                }
            }
        }else {
            for (int counter = 5; counter < seats.length; counter++) {
                boolean isOccupiedSeat = seats[counter];
                if(!isOccupiedSeat){
                    seats[counter]=true;
                    break;
                }

            }
        }
    }
}











