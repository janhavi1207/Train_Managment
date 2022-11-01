package dao;

import connection.Connect;
import model.Coach;
import model.Seat;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class SeatDaoImpl implements SeatDao{

    @Override
    public boolean insert(Seat seat) {
        Connection con=null;
        PreparedStatement ps=null;
        con= Connect.dataConnection();
        String sql;
        sql="insert into seat values(?,?,?)";
        try
        {
            ps=con.prepareStatement(sql);
            ps.setInt(1, seat.getId());
            ps.setString(2, String.valueOf(seat.getType()));
            ps.setBoolean(3, seat.getAvailability());

            int n;
            n=ps.executeUpdate();
            return (n>0);

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return false;
    }


    @Override
    public boolean update(Seat seat) {
//        Connection con=null;
//        PreparedStatement ps=null;
//        con=Connect.dataConnection();
//        String sql;
//        sql="update blooddonor set availability=? where donor_id=?";
//        try
//        {
//            ps=con.prepareStatement(sql);
//            ps.setString(1, status);
//            ps.setInt(2, id);
//            int n;
//            n=ps.executeUpdate();
//            if(n>0)
//                return true;
//        }
//        catch(Exception e)
//        {
//            System.out.println(e);
//        }
        return false;
    }

    @Override
    public boolean delete(Seat seat) {
//            Connection con=null;
//            PreparedStatement ps=null;
//            con=Connect.dataConnection();
//            int n=0;
//            String sql;
//            try
//            {
//                sql="delete from student where sid=?";
//                ps=con.prepareStatement(sql);
//                ps.setInt(1, rno);
//                n=ps.executeUpdate();
//                if(n>0)
//                    return true;
//            }
//            catch(SQLException e)
//            {
//                System.out.println(e);
//            }
            return false;
        }



    @Override
    public Seat getByID(int seatId) {
        return null;
    }

    @Override
    public List<Seat> getAll() {
        return null;
    }
}
