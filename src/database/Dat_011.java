package database;

/**
 * 第二高的薪水
 */
public class Dat_011 {

	// IFNULL函数的用法，LIMIT的用法，返回整个NULL而不是单个字段为null

	public static void main(String[] args) {
		// SELECT
		// IFNULL(
		// (
		// SELECT
		// Salary
		// FROM
		// Employee
		// GROUP BY
		// Salary
		// ORDER BY
		// Salary DESC
		// LIMIT 1,
		// 1
		// ),
		// NULL
		// ) SecondHighestSalary
	}

	// 非最优解，用上了 Select @xxx:= 0 查询时添加自增列

	// SELECT
	// IFNULL(
	// (
	// SELECT
	// Salary
	// FROM
	// (
	// SELECT
	// (@row_number :=@row_number + 1) AS num,
	// Salary
	// FROM
	// (
	// SELECT
	// emp.Id,
	// emp.Salary
	// FROM
	// Employee emp
	// GROUP BY
	// emp.Salary
	// ORDER BY
	// emp.Salary DESC
	// ) temp,
	// (SELECT @row_number := 0) AS t
	// ) temp2
	// WHERE
	// temp2.num = 2
	// ),
	// NULL
	// ) AS SecondHighestSalary
}
