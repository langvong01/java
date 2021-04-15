package ADF2.Task06.DAO;

import ADF2.Task06.Bill;
import ADF2.Task06.DBUntils;
import ADF2.Task06.SQLCommand;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BillDaoImpl  implements  BillDAO {
    private Connection connection = null;
    private PreparedStatement preparedStatement = null;
    private CallableStatement caStatement = null;
    private ResultSet results = null;

    @Override
    public List<Bill> getAll() throws SQLException {
        List<Bill> bills = new ArrayList<>();
        Bill bill = null;
        try {
            connection = DBUntils.getInstance().getConnection();
            preparedStatement =
                    connection.prepareStatement(SQLCommand.BILL_QUERY_FIND_ALl);
            results = preparedStatement.executeQuery();
            while (results.next()) {
                bill = new Bill();

                bill.setBillCode(results.getString("bill_code").trim());
                bill.setCustomerName(results.getString("customer_name"));
                bill.setCreatDate(results.getString("created_date"));
                bill.setDiscount(results.getInt("discount"));
                bill.setTotalPrice(results.getDouble("total_Price"));
                bills.add(bill);
            }
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return bills;
    }

    @Override
    public boolean saveBill(Bill bill) throws SQLException {
        boolean check = false;
        try {
            connection = DBUntils.getInstance().getConnection();
            caStatement = connection.prepareCall(SQLCommand.BILL_QUERY_ADD);
            caStatement.setString(1, bill.getBillCode());
            caStatement.setString(2, bill.getCustomerName());
            caStatement.setString(3, bill.getCreatDate());
            caStatement.setFloat(4, bill.getDiscount());
            caStatement.registerOutParameter(5, Types.INTEGER);
            caStatement.execute();
            if (caStatement.getInt(5) == 1) {
                check = true;
            }
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
                if (caStatement != null) {
                    caStatement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return check;
    }

    public Bill findBillsByBillCode(final String billCode) throws SQLException {

        Bill bill = null;
        try {
            connection = DBUntils.getInstance().getConnection();
            preparedStatement =
                    connection.prepareStatement(SQLCommand.BILL_QUERY_FIND_BY_CODE);
            preparedStatement.setString(1, billCode);
            results = preparedStatement.executeQuery();
            if (results.next()) {
                bill = new Bill();
                bill.setBillCode(results.getString("Bill_Code").trim());
                bill.setCustomerName(results.getString("customer_name").trim());
                bill.setCreatDate(results.getString("created_date").trim());
                bill.setDiscount(results.getInt("discount"));
                // bill.setTotalPrice(results.getDouble("total_price"));
            }
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return bill;
    }

    /**
     * Excute a query to retrieve bills by its customer name
     *
     * @param customerName
     * @return list of bills
     * @method findBillsByCustomerName
     * @ throws SQl Exception
     */
    public List<Bill> findBillsByCustomerName(final String customerName) throws SQLException {
        List<Bill> bills = new ArrayList<>();
        Bill bill = null;
        try {
            connection = DBUntils.getInstance().getConnection();
            preparedStatement =
                    connection.prepareStatement(SQLCommand.BILL_QUERY_FIND_BY_CUSTOMER_NAME);
            preparedStatement.setString(1, customerName);
            results = preparedStatement.executeQuery();
            while (results.next()) {
                bill = new Bill();
                bill.setBillCode(results.getString("bill_code").trim());
                bill.setCustomerName(results.getString("customer_name"));
                bill.setCreatDate(results.getString("created_date"));
                bill.setDiscount(results.getInt("discount"));
                bill.setTotalPrice(results.getDouble("total_prce"));

                bills.add(bill);
            }
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return bills;
    }
}
