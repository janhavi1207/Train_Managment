package controller;

import dao.SeatDao;
import dao.SeatDaoImpl;
import model.Seat;
import model.enums.SeatType;

public class TestMain {

    public static void main(String[] args) {
        Seat seat = new Seat();
        seat.setId(101);
        seat.setType(SeatType.Lower);
        seat.setAvailability(true);

        SeatDao seatDao = new SeatDaoImpl();
        boolean res = seatDao.insert(seat);
        System.out.println(res);
    }
}
