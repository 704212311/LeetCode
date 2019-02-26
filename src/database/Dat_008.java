package database;

/**
 * 删除重复的电子邮箱
 */
public class Dat_008 {

	// 子查询嵌套

	public static void main(String[] args) {
		// DELETE
		// FROM
		// Person
		// WHERE
		// Id NOT IN (
		// SELECT
		// temp.min
		// FROM
		// (
		// SELECT
		// MIN(Id) min
		// FROM
		// Person
		// GROUP BY
		// Email
		// ) temp
		// )
	}
}
