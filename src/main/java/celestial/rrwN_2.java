/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  org.apache.commons.io.FileUtils
 */
package celestial;

import celestial.rrQX;
import celestial.rrwZ_2;
import celestial.rrwc_3;
import celestial.rrwu_3;
import celestial.util.MinecraftAccessor;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.io.FileUtils;

public class rrwN_2
implements MinecraftAccessor {
    public Object[] id_class;
    private static short[] id_byte;
    private static boolean[] id_protected;
    public static Object[] id_break;
    private static String[] id_throws;
    private static byte[] id_case;

    private static void id_byte() {
        boolean[] blArray = new boolean[3];
        blArray[1] = true;
        blArray[2] = true;
        id_protected = blArray;
    }

    public rrwN_2() {
        this.id_protected();
        String string = new File(((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[0]]).id_break().id_class(id_throws[0]), id_throws[1]).getAbsolutePath();
        this.id_class[rrwN_2.id_byte[1]] = string;
    }

    static {
        rrwN_2.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x8297269C;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xAE9F35943EC8D9FEL;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{127, -85, 61, 32, 60, -24, -32, -116}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public void id_class() {
        try {
            JsonElement jsonElement = new Gson().toJsonTree((Object)((HashMap)id_break[id_byte[8]]));
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty(id_throws[8], Boolean.valueOf((Boolean)rrwZ_2.id_class[id_byte[9]]));
            jsonObject.add(id_throws[9], jsonElement);
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            FileUtils.write((File)new File((String)this.id_class[id_byte[10]]), (CharSequence)gson.toJson((JsonElement)jsonObject), (Charset)StandardCharsets.UTF_8);
        }
        catch (IOException iOException) {
            System.out.println(id_throws[10]);
            iOException.printStackTrace();
        }
    }

    public static void id_class(rrwu_3 rrwu_32) {
        ((HashMap)id_break[id_byte[7]]).put(id_throws[7], rrwu_32);
    }

    public void id_break() {
        File file = new File((String)this.id_class[id_byte[2]]);
        try {
            if (!file.exists()) {
                if (!file.createNewFile()) {
                    System.out.println(id_throws[2]);
                }
                return;
            }
            String string = FileUtils.readFileToString((File)file, (String)id_throws[3]);
            if (!string.isEmpty()) {
                JsonObject jsonObject = new JsonParser().parse(string).getAsJsonObject();
                Boolean bl = jsonObject.get(id_throws[4]).getAsBoolean();
                rrwZ_2.id_class[rrwN_2.id_byte[3]] = bl;
                Type type = new rrwc_3(this).getType();
                HashMap hashMap = (HashMap)new Gson().fromJson(jsonObject.get(id_throws[5]), type);
                rrwN_2.id_break[rrwN_2.id_byte[4]] = hashMap;
                if ((HashMap)id_break[id_byte[5]] == null) {
                    HashMap hashMap2;
                    rrwN_2.id_break[rrwN_2.id_byte[6]] = hashMap2 = new HashMap();
                }
            }
        }
        catch (Exception exception) {
            System.out.println(id_throws[6]);
            exception.printStackTrace();
        }
    }

    private static void id_throws() {
        id_throws = new String[]{new String("proxy"), new String("proxies.json"), new String("Error creating proxies.json file"), new String("UTF-8"), new String("proxy-enabled"), new String("accounts"), new String("Error reading proxies.json file"), new String(""), new String("proxy-enabled"), new String("accounts"), new String("Error writing proxies.json file"), new String("")};
    }

    private static /* synthetic */ void ntfClinit() {
        rrwN_2.id_byte();
        rrwN_2.id_throws();
        rrwN_2.id_case();
        rrwN_2.id_private();
        rrwN_2.id_catch();
    }

    private static void id_catch() {
        Object[] objectArray = new Object[]{new HashMap(), id_throws[11]};
        id_break = objectArray;
    }

    private static void id_case() {
        id_byte = new short[11];
    }

    private void id_protected() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[2]];
        }
    }

    private static void id_private() {
        id_case = new byte[]{2};
    }
}

