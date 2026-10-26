/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.QY;
import celestial.rrbb_3;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

public class rrJA {
    private static String id_byte = null;
    public static final String id_class = "http://s.optifine.net";
    public static final String id_break = "http://optifine.net";

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static byte[] id_class(String string) throws IOException {
        byte[] byArray;
        HttpURLConnection httpURLConnection = null;
        try {
            int n;
            URL uRL = new URL(string);
            httpURLConnection = (HttpURLConnection)uRL.openConnection(QY.id_instanceof().W());
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(false);
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() / 100 != 2) {
                if (httpURLConnection.getErrorStream() != null) {
                    rrbb_3.id_byte(httpURLConnection.getErrorStream());
                }
                throw new IOException("HTTP response: " + httpURLConnection.getResponseCode());
            }
            InputStream inputStream = httpURLConnection.getInputStream();
            byte[] byArray2 = new byte[httpURLConnection.getContentLength()];
            int n2 = 0;
            do {
                if ((n = inputStream.read(byArray2, n2, byArray2.length - n2)) >= 0) continue;
                throw new IOException("Input stream closed: " + string);
            } while ((n2 += n) < byArray2.length);
            byArray = byArray2;
        }
        finally {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        }
        return byArray;
    }

    public static synchronized String id_class() {
        if (id_byte == null) {
            try {
                boolean bl = rrbb_3.id_class(System.getProperty("player.models.local"), false);
                if (bl) {
                    File file = (File)QY.id_instanceof().id_class[24];
                    File file2 = new File(file, "playermodels");
                    id_byte = file2.toURI().toURL().toExternalForm();
                }
            }
            catch (Exception exception) {
                rrbb_3.id_protected(exception.getClass().getName() + ": " + exception.getMessage());
            }
            if (id_byte == null) {
                id_byte = id_class;
            }
        }
        return id_byte;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static String id_class(String string, Map map, byte[] byArray) throws IOException {
        String string2;
        HttpURLConnection httpURLConnection = null;
        try {
            String string3;
            Object object;
            Object object22;
            URL uRL = new URL(string);
            httpURLConnection = (HttpURLConnection)uRL.openConnection(QY.id_instanceof().W());
            httpURLConnection.setRequestMethod("POST");
            if (map != null) {
                for (Object object22 : map.keySet()) {
                    object = "" + map.get(object22);
                    httpURLConnection.setRequestProperty((String)object22, (String)object);
                }
            }
            httpURLConnection.setRequestProperty("Content-Type", "text/plain");
            httpURLConnection.setRequestProperty("Content-Length", "" + byArray.length);
            httpURLConnection.setRequestProperty("Content-Language", "en-US");
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(byArray);
            outputStream.flush();
            outputStream.close();
            object22 = httpURLConnection.getInputStream();
            object = new InputStreamReader((InputStream)object22, "ASCII");
            BufferedReader bufferedReader = new BufferedReader((Reader)object);
            StringBuffer stringBuffer = new StringBuffer();
            while ((string3 = bufferedReader.readLine()) != null) {
                stringBuffer.append(string3);
                stringBuffer.append('\r');
            }
            bufferedReader.close();
            string2 = stringBuffer.toString();
        }
        finally {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        }
        return string2;
    }
}

