//package test;
//
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.MediaType;
//import org.springframework.web.client.RestTemplate;
//
//public class RequestTest {
//
//	public static void main(String[] args) {
//		String url = "http://127.0.0.1:8080/appserver/web/api/dt/glu/create";
//		// String url = "http://192.168.2.240:10237/web/api/dt/glu/create";
//		String postRequest = postRequest(url);
//		System.out.println(postRequest);
//	}
//
//	public static String postRequest(String url) {
//		HttpHeaders headers = new HttpHeaders();
//		MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
//		headers.setContentType(type);
//		headers.add("Accept", MediaType.APPLICATION_JSON.toString());
//		HttpEntity<String> formEntity = new HttpEntity<>(getJson(), headers);
//
//		RestTemplate restTemplate = new RestTemplate();
//
//		String postForObject = restTemplate.postForObject(url, formEntity, String.class);
//
//		return postForObject;
//	}
//
//	public static String getJson() {
//		return "{\"custCode\":\"0001\",\"pIdCard\":\"610322199103110018\",\"dIdCard\":\"0001\",\"deviceId\":\"0001\",\"bmi\":\"\",\"glu\":\"{'detectDate':'2017-12-27 16:45:04','glu':111.2,'beforeOrAtter':2}\",\"nibp\":\"\",\"spo2\":\"\"}";
//	}
//	
//}
