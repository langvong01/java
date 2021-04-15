package ADF2.Task06.DAO;

import ADF2.Task06.Item;

import java.sql.SQLException;
import java.util.List;

public interface ItemDAO {
    /**
     * This method is for saving items to the database , using bathch
     *
     * @method addItem
     * @param  items
     * @return true if save success , else false
     * @throws java.sql.SQLException
     */
    boolean addItems(List<Item> items) throws SQLException;
    /**
      * This method is for deleting items from the database, using batch.
      *
     . * @method deleteItems
     . * @param items
     . * @return true if deletes success, else false
     . * @throws SQLException
     . */
    boolean deleteItems(List<Item> items) throws  SQLException;
    /**
     . * Execute a query to get all items of a specific bill, using batch.
     . *
     . * @method getAllByBillCode
     . * @param billCode
     . * @return list of items
     . * @throws SQLException
     . */
    List<Item> getAllByBillCode(String billCode) throws  SQLException;
/**
 . * Execute a query to check an item was exist or not.
 . *
 . * @method checkItemExist
 . * @param item
 . * @return true if exist, else false
 . * @throws SQLException
 . */
boolean checkITemExist(Item item) throws  SQLException;
}
