package CarBooking.Model.dao;
import java.sql.*;

public abstract class DB {
    protected String driver = "org.sqlite.JDBC";
    protected String url = "jdbc:sqlite:D:\\Github repo\\Parking-Management\\ASD_DB.db";
    protected Connection conn;
}