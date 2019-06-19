import java.io.File;
import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

//com.googlecode.json-simple
public class LeerJSON {

	public static void main(String[] args) {
		ClassLoader classLoader = new LeerJSON().getClass().getClassLoader();
		String fileName = "myJSON.json";
		File file = new File(classLoader.getResource(fileName).getFile());

		JSONParser parser = new JSONParser();
		try {
			FileReader reader = new FileReader(file.getAbsolutePath());
			Object obj = parser.parse(reader);
			JSONObject jsonObj = (JSONObject) obj;
			JSONObject usuario  = (JSONObject)jsonObj.get("usuario");
			System.out.println("Usuario :"+usuario.toJSONString());
			
			String studentName = (String)usuario.get("nombre");
			System.out.println(""
                                + "Nombre del Usuario :"+studentName);
			
			/*JSONArray subjects = (JSONArray)usuario.get("subjects");
			System.out.println("Subject List :"+subjects);*/
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}