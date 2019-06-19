
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.apache.commons.io.IOUtils;
import org.json.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

public class Login {

    public static String result,nombreUsuario, claveAPI;

    public static void main(String[] args) {
        Login.Login_JSON();
    }

    public static void Login_JSON() {
        String query_url = "http://35.231.65.179/~ajarab/webservice/usuarios/login";
        String json = "{\n"
                + "  \"contrasena\":" + "\"" + GUI_Login.contrasena + "\",\n"
                + "  \"correo\":" + "\"" + GUI_Login.correo + "\"\n"
                + "}";
        try {
            URL url = new URL(query_url);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setConnectTimeout(5000);
            conn.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setRequestMethod("POST");
            OutputStream os = conn.getOutputStream();
            os.write(json.getBytes("UTF-8"));
            os.close();
            // read the response
            InputStream in = new BufferedInputStream(conn.getInputStream());
            String result = IOUtils.toString(in, "UTF-8");
            System.out.println(result);
            System.out.println("Información: ");
            JSONObject myResponse = new JSONObject(result);
            JSONObject usuario = (JSONObject)myResponse.getJSONObject("usuario");
            
            nombreUsuario = (String)usuario.getString("nombre");
            claveAPI = (String)usuario.getString("claveApi");
            System.out.println("Nombre del usuario: "+nombreUsuario);
            System.out.println("Clave API: "+claveAPI);
            
            
            in.close();
            conn.disconnect();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
