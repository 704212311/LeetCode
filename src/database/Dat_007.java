package database;

/**
 * 从不订购的客户
 */
public class Dat_007 {

	public static void main(String[] args) {
		// SELECT
		// NAME AS Customers
		// FROM
		// Customers
		// WHERE
		// Id NOT IN (
		// SELECT
		// c.Id
		// FROM
		// Customers c,
		// Orders o
		// WHERE
		// c.Id = o.CustomerId
		// )
	}
}
