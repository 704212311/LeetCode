package test;

import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		// 年月日时分秒，统一规定格式为：yyyyMMddHHmmss
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		System.out.println(sdf.format(date));
		try {
			Date parse = sdf.parse("20190114145319");
			System.out.println(parse);
			System.out.println(sdf.format(parse));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		String test = "20190114145319;0;0;0;0;0;0;0;0;0;0;100;4;460;0;11;6280;56322;-68;6278;26741;-81;6280;53522;-84;6280;53521;-85;6280;56321;-87;4;shoujin2018;94:d9:b3:6d:a6:a0;-52;shsj;40:31:3c:05:5c:de;-56;shoujin2018;78:44:fd:27:55:ff;-66;shoujin2018;0c:4b:54:5f:73:27;-67";
		String[] split = test.split(";");
		System.out.println("length	" + split.length);
		for (String str : split) {
			System.out.println(str);
		}
	}

	@SuppressWarnings("unused")
	private void test() {
		// 4 + 4 + 4 + 2 + 8 + 4 + 2N + 4 + 4
		StringBuffer sb = new StringBuffer("f5f6001a005a000001000100013836363333333033303132323132390000f7f8");
		System.out.println(sb);
		int totalLength = sb.length();
		System.out.println("totalLength	" + totalLength);
		String head = sb.substring(0, 4);
		System.out.println("head	" + head);
		String length = sb.substring(4, 8);
		System.out.println("length	" + length);
		String serial = sb.substring(8, 12);
		System.out.println("serial	" + serial);
		String property = sb.substring(12, 14);
		System.out.println("property	" + property);
		String sub = sb.substring(14, 22);
		System.out.println("sub	" + sub);
		String id = sb.substring(22, 26);
		System.out.println("id	" + id);
		String data = sb.substring(26, totalLength - 8);
		System.out.println("dataASC	" + data);
		System.out.println("data	" + ASCIIUtil.convertAscToString(data));
		String CRC = sb.substring(totalLength - 8, totalLength - 4);
		System.out.println("CRC	" + CRC);
		String tail = sb.substring(totalLength - 4, totalLength);
		System.out.println("tail	" + tail);

		Packet packet = new Packet();
		packet.setSerial(serial);
		packet.setProperty(property);
		packet.setSub("00010001");
		packet.setId("A000");
		packet.setData(ASCIIUtil.convertStringToAsc("0"));
		packet.setCRC(CRC);
		Integer length2 = packet.computeLength();
		System.out.println("length2	" + length2);
		System.out.println(ASCIIUtil.get1WordHexStr(length2));
		packet.setLength(ASCIIUtil.get1WordHexStr(length2));

		String result = packet.toString();
		System.out.println("\n packet：");
		System.out.println("" + result);
	}
}
