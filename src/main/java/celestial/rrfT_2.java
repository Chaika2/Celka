/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 */
package celestial;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfT_2 {
    private static String[] id_class;
    private static short[] id_break;

    private static void id_byte() {
        id_class = new String[]{new String("hh:mm a"), new String("http://ip-api.com/json/"), new String("GET"), new String("User-Agent"), new String("Mozilla/5.0"), new String("dd.MM.yyyy HH:mm:ss")};
    }

    static {
        rrfT_2.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xD4176708;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x4538B376532CFD17L;
    }

    public static String id_class(String string) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(id_class[5]);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone(string));
        return simpleDateFormat.format(date);
    }

    public static String id_class() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(id_class[0]);
        LocalTime localTime = LocalTime.now();
        return dateTimeFormatter.format(localTime);
    }

    public static JsonObject id_break() {
        String string = id_class[1];
        try {
            URL uRL = new URL(string);
            HttpURLConnection httpURLConnection = (HttpURLConnection)uRL.openConnection();
            httpURLConnection.setRequestMethod(id_class[2]);
            httpURLConnection.setRequestProperty(id_class[3], id_class[4]);
            int n = httpURLConnection.getResponseCode();
            if (n == id_break[0]) {
                String string2;
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                StringBuilder stringBuilder = new StringBuilder();
                while ((string2 = bufferedReader.readLine()) != null) {
                    stringBuilder.append(string2);
                }
                bufferedReader.close();
                return new JsonParser().parse(stringBuilder.toString()).getAsJsonObject();
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return null;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{111, 51, -66, 70, 19, 115, 65, -89}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        rrfT_2.id_byte();
        rrfT_2.id_protected();
    }

    private static void id_protected() {
        id_break = new short[]{200};
    }
}

