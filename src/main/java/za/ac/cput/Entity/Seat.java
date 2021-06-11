package za.ac.cput.Entity;

/* Wajedien Samuels
    216287820
 */

public class Seat {
    private String ClassCode;
    private int SeatNo;

    private Seat (Builder builder){
        this.ClassCode = builder.ClassCode;
        this.SeatNo = builder.SeatNo;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "ClassCode='" + ClassCode + '\'' +
                ", SeatNo=" + SeatNo +
                '}';
    }

    public static class Builder {
        private String ClassCode;
        private int SeatNo;

        public Builder setClassCode(String classCode) {
            this.ClassCode = classCode;

            return this;
        }

        public Builder setSeatNo(int seatNo) {
            this.SeatNo = seatNo;

            return this;
        }

        public Seat build() {

            return new Seat(this);
        }

        public Builder copy(Seat seat) {
            this.ClassCode = seat.ClassCode;
            this.SeatNo = seat.SeatNo;

            return this;
        }
    }
}