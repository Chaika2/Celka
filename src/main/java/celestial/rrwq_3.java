/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonParser
 */
package celestial;

import celestial.Ak_1;
import celestial.rrwT_2;
import celestial.rrwp_3;
import celestial.rrwt_3;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwq_3
extends Enum<rrwq_3> {
    private static boolean[] booleansd739829cf0613d349fc0bda49435f7f4;
    private static short[] shortsd739829cf0613d349fc0bda49435f7f4;
    public static Object[] staticFieldsd739829cf0613d349fc0bda49435f7f4;
    private static String[] stringsd739829cf0613d349fc0bda49435f7f4;
    public Object[] fieldsd739829cf0613d349fc0bda49435f7f4;
    private static byte[] bytesd739829cf0613d349fc0bda49435f7f4;

    public void id_byte() {
        if (((Boolean)this.fieldsd739829cf0613d349fc0bda49435f7f4[shortsd739829cf0613d349fc0bda49435f7f4[2]]).booleanValue()) {
            return;
        }
        CompletableFuture.runAsync(() -> {
            try {
                String string = this.id_extends();
                if (string != null && !string.isEmpty()) {
                    List<rrwt_3> list = this.id_break(string);
                    this.id_break(list);
                }
                Boolean bl = booleansd739829cf0613d349fc0bda49435f7f4[0];
                this.fieldsd739829cf0613d349fc0bda49435f7f4[rrwq_3.shortsd739829cf0613d349fc0bda49435f7f4[12]] = bl;
            }
            catch (Exception exception) {
                System.err.println("Failed to load servers: " + exception.getMessage());
                exception.printStackTrace();
            }
        });
    }

    private rrwq_3() {
        ArrayList arrayList;
        this.id_throws();
        this.fieldsd739829cf0613d349fc0bda49435f7f4[rrwq_3.shortsd739829cf0613d349fc0bda49435f7f4[1]] = arrayList = new ArrayList();
    }

    static {
        rrwq_3.ntfClinit();
    }

    public static rrwq_3[] values() {
        return (rrwq_3[])((rrwq_3[])staticFieldsd739829cf0613d349fc0bda49435f7f4[shortsd739829cf0613d349fc0bda49435f7f4[0]]).clone();
    }

    public static rrwq_3 valueOf(String string) {
        return Enum.valueOf(rrwq_3.class, string);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xFB630D54;
    }

    public void id_class(rrwp_3 rrwp_32) {
        LocalDateTime localDateTime = rrwp_32.id_finally();
        if (localDateTime != null && localDateTime.isBefore(LocalDateTime.now())) {
            return;
        }
        ((List)this.fieldsd739829cf0613d349fc0bda49435f7f4[shortsd739829cf0613d349fc0bda49435f7f4[7]]).add(rrwp_32);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-26, 125, -56, 122, 5, 69, -123, 84}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void id_class(List<Ak_1> list) {
        List list2 = (List)this.fieldsd739829cf0613d349fc0bda49435f7f4[shortsd739829cf0613d349fc0bda49435f7f4[8]];
        synchronized (list2) {
            for (rrwp_3 rrwp_32 : (List)this.fieldsd739829cf0613d349fc0bda49435f7f4[shortsd739829cf0613d349fc0bda49435f7f4[9]]) {
                list.add(rrwp_32.id_catch());
            }
        }
    }

    public List<rrwp_3> id_class() {
        return (List)this.fieldsd739829cf0613d349fc0bda49435f7f4[shortsd739829cf0613d349fc0bda49435f7f4[10]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x45E82E6DE65E695AL;
    }

    private List<rrwt_3> id_break(String string) {
        try {
            Gson gson = new GsonBuilder().registerTypeAdapter(LocalDateTime.class, (Object)new rrwT_2()).create();
            JsonParser jsonParser = new JsonParser();
            JsonArray jsonArray = jsonParser.parse(string).getAsJsonArray();
            ArrayList<rrwt_3> arrayList = new ArrayList<rrwt_3>();
            for (JsonElement jsonElement : jsonArray) {
                rrwt_3 rrwt_32 = (rrwt_3)gson.fromJson(jsonElement, rrwt_3.class);
                arrayList.add(rrwt_32);
            }
            return arrayList;
        }
        catch (Exception exception) {
            System.err.println("Error parsing JSON data: " + exception.getMessage());
            return new ArrayList<rrwt_3>();
        }
    }

    public boolean id_break() {
        return (Boolean)this.fieldsd739829cf0613d349fc0bda49435f7f4[shortsd739829cf0613d349fc0bda49435f7f4[11]];
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void id_break(List<rrwt_3> list) {
        List list2 = (List)this.fieldsd739829cf0613d349fc0bda49435f7f4[shortsd739829cf0613d349fc0bda49435f7f4[5]];
        synchronized (list2) {
            ((List)this.fieldsd739829cf0613d349fc0bda49435f7f4[shortsd739829cf0613d349fc0bda49435f7f4[6]]).clear();
            for (rrwt_3 rrwt_32 : list) {
                try {
                    rrwp_3 rrwp_32 = new rrwp_3(rrwt_32.id_throws, rrwt_32.id_byte, rrwt_32.id_class, rrwt_32.id_protected, rrwt_32.id_break);
                    this.id_class(rrwp_32);
                }
                catch (Exception exception) {
                    System.err.println("Error adding server " + (rrwt_32.id_throws != null ? rrwt_32.id_throws : stringsd739829cf0613d349fc0bda49435f7f4[2]) + ": " + exception.getMessage());
                }
            }
        }
    }

    private void id_throws() {
        if (this.fieldsd739829cf0613d349fc0bda49435f7f4 == null) {
            Object[] objectArray = this.fieldsd739829cf0613d349fc0bda49435f7f4 = new Object[bytesd739829cf0613d349fc0bda49435f7f4[1]];
            objectArray[rrwq_3.booleansd739829cf0613d349fc0bda49435f7f4[5]] = booleansd739829cf0613d349fc0bda49435f7f4[6];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrwq_3.id_finally();
        rrwq_3.id_native();
        rrwq_3.id_case();
        rrwq_3.id_private();
        rrwq_3.id_protected();
    }

    private static void id_finally() {
        boolean[] blArray = new boolean[8];
        blArray[0] = true;
        blArray[1] = true;
        blArray[5] = true;
        blArray[7] = true;
        booleansd739829cf0613d349fc0bda49435f7f4 = blArray;
    }

    private static /* synthetic */ rrwq_3[] id_catch() {
        rrwq_3[] rrwq_3Array = new rrwq_3[booleansd739829cf0613d349fc0bda49435f7f4[1]];
        rrwq_3Array[rrwq_3.booleansd739829cf0613d349fc0bda49435f7f4[2]] = (rrwq_3)((Object)staticFieldsd739829cf0613d349fc0bda49435f7f4[shortsd739829cf0613d349fc0bda49435f7f4[13]]);
        return rrwq_3Array;
    }

    private String id_extends() {
        String string;
        URL uRL = new URL(stringsd739829cf0613d349fc0bda49435f7f4[0]);
        HttpURLConnection httpURLConnection = (HttpURLConnection)uRL.openConnection();
        httpURLConnection.setRequestMethod(stringsd739829cf0613d349fc0bda49435f7f4[1]);
        httpURLConnection.setConnectTimeout(shortsd739829cf0613d349fc0bda49435f7f4[3]);
        httpURLConnection.setReadTimeout(shortsd739829cf0613d349fc0bda49435f7f4[4]);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
        try {
            String string2;
            StringBuilder stringBuilder = new StringBuilder();
            while ((string2 = bufferedReader.readLine()) != null) {
                stringBuilder.append(string2);
            }
            string = stringBuilder.toString();
        }
        catch (Throwable throwable) {
            try {
                try {
                    bufferedReader.close();
                }
                catch (Throwable throwable2) {
                    throwable.addSuppressed(throwable2);
                }
                throw throwable;
            }
            catch (Exception exception) {
                System.err.println("Error fetching data: " + exception.getMessage());
                return null;
            }
        }
        bufferedReader.close();
        return string;
    }

    private static void id_case() {
        short[] sArray = new short[14];
        sArray[0] = 2;
        sArray[2] = 1;
        sArray[3] = 5000;
        sArray[4] = 5000;
        sArray[11] = 1;
        sArray[12] = 1;
        shortsd739829cf0613d349fc0bda49435f7f4 = sArray;
    }

    private static void id_protected() {
        Object[] objectArray;
        objectArray = new Object[]{new rrwq_3(), stringsd739829cf0613d349fc0bda49435f7f4[4], new rrwq_3[]{(rrwq_3)((Object)objectArray[0])}};
        staticFieldsd739829cf0613d349fc0bda49435f7f4 = objectArray;
    }

    private static void id_private() {
        bytesd739829cf0613d349fc0bda49435f7f4 = new byte[]{2, 2, 3};
    }

    private static void id_native() {
        stringsd739829cf0613d349fc0bda49435f7f4 = new String[]{new String("https://pastebin.com/raw/wGRRZUVV"), new String("GET"), new String("unknown"), new String("INSTANCE"), new String("https://pastebin.com/raw/wGRRZUVV")};
    }
}

