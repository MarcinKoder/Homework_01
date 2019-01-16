package pl.coderslab.beans;

import pl.coderslab.dao.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DbCustomerLogDAO {
    private static final String sqlInsert = "INSERT INTO logs(datetime,message) VALUES (?,?)";
    private static final String sqlUpdate = "UPDATE logs SET datetime=?, message=? WHERE id<5";
    private static final String sqlDelete = "DELETE FROM logs WHERE id<5";

    public static void saveToDb(DbCustomerLog log)throws SQLException {
        Connection connection = DbUtil.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(sqlInsert);
        preparedStatement.setTimestamp(1, log.getDatetime());
        preparedStatement.setString(2,log.getMessage());
        preparedStatement.executeUpdate();
    }
}
