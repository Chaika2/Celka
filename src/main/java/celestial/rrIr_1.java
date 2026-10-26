/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.module.util.AutoAuth;
import celestial.rrHc_1;
import celestial.rrwU_2;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIr_1
extends rrwU_2 {
    private static short[] id_break;
    private static String[] id_byte;

    private static void id_byte() {
        id_byte = new String[]{new String("autoauth"), new String("username"), new String("server"), new String("password"), new String("account"), new String("account"), new String("account"), new String("account"), new String("account"), new String("username"), new String("server"), new String("password")};
    }

    public rrIr_1() {
        super(id_byte[0]);
    }

    static {
        rrIr_1.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x2C7F3CCF;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x32CA937C4D4B20E4L;
    }

    @Override
    public void id_class(JsonObject jsonObject) {
        super.id_class(jsonObject);
        if (!jsonObject.has(id_byte[6])) {
            return;
        }
        JsonObject jsonObject2 = jsonObject.getAsJsonObject(id_byte[7]);
        JsonArray jsonArray = jsonObject2.getAsJsonArray(id_byte[8]);
        for (JsonElement jsonElement : jsonArray) {
            JsonObject jsonObject3 = jsonElement.getAsJsonObject();
            String string = jsonObject3.get(id_byte[9]).getAsString();
            String string2 = jsonObject3.get(id_byte[10]).getAsString();
            String string3 = jsonObject3.get(id_byte[11]).getAsString();
            ((Set)AutoAuth.id_break[id_break[1]]).add(new rrHc_1(string, string2, string3));
        }
    }

    @Override
    public void id_break(JsonObject jsonObject) {
        super.id_break(jsonObject);
        JsonObject jsonObject2 = new JsonObject();
        JsonArray jsonArray = new JsonArray();
        for (rrHc_1 rrHc_12 : (Set)AutoAuth.id_break[id_break[0]]) {
            JsonObject jsonObject3 = new JsonObject();
            jsonObject3.addProperty(id_byte[1], rrHc_12.id_byte());
            jsonObject3.addProperty(id_byte[2], rrHc_12.id_break());
            jsonObject3.addProperty(id_byte[3], rrHc_12.id_class());
            jsonArray.add((JsonElement)jsonObject3);
        }
        jsonObject2.add(id_byte[4], (JsonElement)jsonArray);
        jsonObject.add(id_byte[5], (JsonElement)jsonObject2);
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{127, -124, 120, -117, 48, -65, 60, -47}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        rrIr_1.id_byte();
        rrIr_1.id_protected();
    }

    private static void id_protected() {
        id_break = new short[2];
    }
}

