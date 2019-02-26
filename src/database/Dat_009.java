package database;

/**
 * 上升的温度
 */
public class Dat_009 {

	// Date类型不能直接使用数字相加减，DATE_SUB函数的使用

	public static void main(String[] args) {
		// SELECT
		// tomorrow.Id
		// FROM
		// (
		// SELECT
		// Id,
		// RecordDate,
		// Temperature
		// FROM
		// Weather
		// ) AS tomorrow,
		// Weather w
		// WHERE
		// tomorrow.RecordDate = DATE_SUB(w.RecordDate, INTERVAL - 1 DAY)
		// AND tomorrow.Temperature > w.Temperature
	}
}
