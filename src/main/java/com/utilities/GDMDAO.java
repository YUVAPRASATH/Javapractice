package com.utilities;

import java.sql.*;
import java.util.*;

public class GDMDAO {

    private static String DB_URL = "jdbc:postgresql://172.19.0.2:5432/gdmdb";
    private static String DB_USERNAME = "gdmuser";
    private static String DB_PASSWORD = "gdmuser";
    private static Connection connection;
    private static PreparedStatement stmt;
    private static ResultSet rs;
    private static String OP_ID = "748";
    private static String query = "select count(*) from prod_rounds_748 pr ";

    public static void main(String args[]) throws Exception {
        System.out.println("DB Query Detailf for Opertor ID :" + OP_ID);
        getConnection();

        getTotalCount();
        getIndividualStateCount();

        // To get Round Id of Particular State
        //  List<String> roundList = getRoundIds_ParticularState("5");

        // To update data from temp table to Main table including state
        // updateMainTable();

        close();

    }

    public static void getConnection() throws SQLException {
        connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
    }

    public static void close() throws SQLException {
        rs.close();
        stmt.close();
        connection.close();
    }

    public static void getTotalCount() throws SQLException {
        String query = "select count(*) from prod_rounds_" + OP_ID;
        stmt = connection.prepareStatement(query);
        rs = stmt.executeQuery();
        rs.next();
        System.out.println("Total Count :" + rs.getString(1));
    }

    public static void getIndividualStateCount() throws SQLException {
        for (int i = 0; i <= 10; i++) {
            String query = "select count(*) from prod_rounds_" + OP_ID + " where state = " + i;
            //  System.out.println(query);
            stmt = connection.prepareStatement(query);
            rs = stmt.executeQuery();
            rs.next();
            System.out.println("Total Count of State=" + i + "-->" + rs.getString(1));
        }
    }

    public static void getCurrentData() throws SQLException {
        String query = "select round_id from prod_rounds_" + OP_ID + " where state not in (1,2,10)";
        List currentRoundIds = new ArrayList<String>();
        stmt = connection.prepareStatement(query);
        rs = stmt.executeQuery();
        while (rs.next()) {
            currentRoundIds.add(rs.getString(1));
        }
        System.out.println("Total Round ID =" + currentRoundIds.size());
    }

    public static List<String> getRoundIds_ParticularState(String state) throws SQLException {
        String query = "select round_id from prod_rounds_" + OP_ID + " where state not in (" + state + ")";
        List currentRoundIds = new ArrayList<String>();
        stmt = connection.prepareStatement(query);
        rs = stmt.executeQuery();
        while (rs.next()) {
            currentRoundIds.add(rs.getString(1));
        }
        System.out.println("Total Round ID =" + currentRoundIds.size());
        return currentRoundIds;
    }

    public static List<String> getRoundIds_NotClosed() throws SQLException {
        String query = "select round_id from prod_rounds_" + OP_ID + " where state not in (1,2,10)";
        List currentRoundIds = new ArrayList<String>();
        stmt = connection.prepareStatement(query);
        rs = stmt.executeQuery();
        while (rs.next()) {
            currentRoundIds.add(rs.getString(1));
        }
        System.out.println("Total Round ID =" + currentRoundIds.size());
        return currentRoundIds;
    }

    public static void updateMainTable() throws SQLException {
        //Getting round ids that are not close in main Table
        List<String> main_roundIdList = getRoundIds_NotClosed();
        String roundIdString = main_roundIdList.toString();
        roundIdString = roundIdString.substring(1, roundIdString.length() - 1);

        // Get latest Round from Main Table
        String query = "select round_id from prod_rounds_" + OP_ID + " order by round_id desc limit 1";
        stmt = connection.prepareStatement(query);
        rs = stmt.executeQuery();
        rs.next();
        String lastestRound = rs.getString(1);

        //Insert Record from Temp Table to Main Table
        String query2 = "insert into prod_rounds_" + OP_ID + "(round_id ,state ,game_id ,gp_operator_id ,player_id ,created_at ,updated_at ,now ) " +
                "(select round_id ,state ,game_id ,gp_operator_id ,player_id ,created_at ,updated_at ,now  from prod_rounds_" + OP_ID + "_temp pr where pr.round_id >" + lastestRound + ")";

        System.out.println(query2);
        stmt = connection.prepareStatement(query2);
        int insertCount = stmt.executeUpdate();
        System.out.println("Total Count :" + insertCount);

        //update the Main Table
        String query3 = "UPDATE prod_rounds_" + OP_ID +
                " SET state=prod_rounds_" + OP_ID + "_temp.state " +
                " FROM prod_rounds_" + OP_ID + "_temp " +
                " WHERE prod_rounds_" + OP_ID + ".round_id=prod_rounds_748_temp.round_id " +
                " and prod_rounds_" + OP_ID + "_temp.round_id in (" + roundIdString + ")";
        stmt = connection.prepareStatement(query3);
        System.out.println(query3);
        int count = stmt.executeUpdate();
        System.out.println("Total Count :" + count);
    }

}
