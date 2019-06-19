
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.apache.commons.io.IOUtils;
import org.json.JSONObject;

public class Register {

    public static void main(String[] args) {
        Register.Post_JSON();
    }

    public static void Post_JSON() {
        String query_url = "http://35.231.65.179/~ajarab/webservice/usuarios/registro";
        String json = "{\n"
                + "  \"nombre\":" + "\"" + GUI_Register.nombre + "\",\n"
                + "  \"contrasena\":" + "\"" + GUI_Register.contrasena + "\",\n"
                + "  \"correo\":" + "\"" + GUI_Register.correo + "\"\n"
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
            JSONObject myResponse = new JSONObject(result);
            GUI_Register.mensaje = myResponse.getString("mensaje");
            System.out.println(GUI_Register.mensaje);

            in.close();
            conn.disconnect();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
