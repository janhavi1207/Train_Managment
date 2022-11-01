
package model;

import java.util.List;
import model.enums.CoachType;

public class Coach {
   private int id;
   private List<Seat> seats;
   private CoachType Ctype;

    @Override
    public String toString() {
        return "Coach{" + "id=" + id + ", seats=" + seats + ", Ctype=" + Ctype + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    public CoachType getCtype() {
        return Ctype;
    }

    public void setCtype(CoachType Ctype) {
        this.Ctype = Ctype;
    }

}

