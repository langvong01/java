package ADF2.Task06.DAO;

import ADF2.Task06.Bill;

import java.sql.SQLException;
import java.util.List;

public interface BillDAO {
    /**
     * @method getALL
     * @return list of bills
     * @throw SQL Exception
     */
    List<Bill> getAll() throws SQLException;
    /**
     * Call a stored procedure to save a bill to database
     * @method saveBill
     * @param bill
     * @return true if insert success to database , else false
     * @throws SQLException
     */

    boolean saveBill(Bill bill) throws  SQLException;
    /**
     * Excute a query to retrieve a bill by its code
     *
     * @method findBillByBillCode
     * @param  billCode
     * @return bill if found, else null
     * @throws SQLException
     */
    Bill findBillsByBillCode(String billCode) throws  SQLException;
    /**
     * Excute a query to retrive bills by its customer name
     *
     * @method findBillsBYCustomerName
     * @param    customerName
     * @return list of bills
     * @throws SQLException
     */
    List<Bill> findBillsByCustomerName(String customerName) throws  SQLException;
}
