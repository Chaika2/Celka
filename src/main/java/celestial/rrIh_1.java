/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.ri_3;
import celestial.rrqQ_2;
import celestial.rrqz_3;
import celestial.rrwU_2;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIh_1
extends rrwU_2 {
    private static String[] id_break;
    private static boolean[] id_byte;
    private static short[] id_protected;

    private static void id_byte() {
        id_break = new String[]{new String("xray"), new String("name"), new String("color"), new String("xray"), new String("xray"), new String("xray"), new String("xray"), new String("xray"), new String("name"), new String("color")};
    }

    public rrIh_1() {
        super(id_break[0]);
    }

    static {
        rrIh_1.ntfClinit();
    }

    @Override
    public void id_class(JsonObject jsonObject) {
        super.id_class(jsonObject);
        if (!jsonObject.has(id_break[5])) {
            return;
        }
        JsonObject jsonObject2 = jsonObject.getAsJsonObject(id_break[6]);
        JsonArray jsonArray = jsonObject2.getAsJsonArray(id_break[7]);
        for (JsonElement jsonElement : jsonArray) {
            JsonObject jsonObject3 = jsonElement.getAsJsonObject();
            String string = jsonObject3.get(id_break[8]).getAsString();
            int n = jsonObject3.get(id_break[9]).getAsInt();
            ((rrqQ_2)rrqQ_2.staticFieldsaf585ffa18e23930a314cd0048f74bf2[id_protected[1]]).id_class(new rrqz_3(ri_3.id_class(string), n), string, id_byte[0]);
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x6747B3EA;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x796DDFAA73A9E94L;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-34, -25, -67, 97, 109, -109, 95, 88}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public void id_break(JsonObject jsonObject) {
        super.id_break(jsonObject);
        JsonObject jsonObject2 = new JsonObject();
        JsonArray jsonArray = new JsonArray();
        for (rrqz_3 rrqz_32 : ((rrqQ_2)rrqQ_2.staticFieldsaf585ffa18e23930a314cd0048f74bf2[id_protected[0]]).id_break()) {
            JsonObject jsonObject3 = new JsonObject();
            jsonObject3.addProperty(id_break[1], rrqz_32.id_break());
            jsonObject3.addProperty(id_break[2], (Number)rrqz_32.id_class());
            jsonArray.add((JsonElement)jsonObject3);
        }
        jsonObject2.add(id_break[3], (JsonElement)jsonArray);
        jsonObject.add(id_break[4], (JsonElement)jsonObject2);
    }

    private static void id_throws() {
        id_byte = new boolean[1];
    }

    private static /* synthetic */ void ntfClinit() {
        rrIh_1.id_throws();
        rrIh_1.id_byte();
        rrIh_1.id_protected();
    }

    private static void id_protected() {
        id_protected = new short[2];
    }
}

