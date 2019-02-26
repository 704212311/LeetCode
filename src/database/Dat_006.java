package database;

/**
 * 超过经理收入的员工
 */
public class Dat_006 {

	// 子查询的使用

	public static void main(String[] args) {
		// SELECT
		// em. NAME Employee
		// FROM
		// Employee em,
		// (
		// SELECT
		// Id,
		// Salary,
		// ManagerId
		// FROM
		// Employee
		// ) temp
		// WHERE
		// em.ManagerId = temp.Id
		// AND em.Salary > temp.Salary
	}
}
