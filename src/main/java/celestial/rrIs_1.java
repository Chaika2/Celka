/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.rrZW;
import celestial.rrZk_1;
import celestial.rrwU_2;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIs_1
extends rrwU_2 {
    private static short[] id_break;
    private static boolean[] id_byte;
    private static String[] id_protected;

    private static void id_byte() {
        id_byte = new boolean[1];
    }

    public rrIs_1() {
        super(id_protected[0]);
    }

    static {
        rrIs_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xFAF2195AC8262F50L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x336ED49F;
    }

    @Override
    public void id_class(JsonObject jsonObject) {
        super.id_class(jsonObject);
        if (!jsonObject.has(id_protected[4])) {
            return;
        }
        JsonObject jsonObject2 = jsonObject.getAsJsonObject(id_protected[5]);
        JsonArray jsonArray = jsonObject2.getAsJsonArray(id_protected[6]);
        for (JsonElement jsonElement : jsonArray) {
            JsonObject jsonObject3 = jsonElement.getAsJsonObject();
            String string = jsonObject3.get(id_protected[7]).getAsString();
            ((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[id_break[1]]).id_class(new rrZk_1(string), id_byte[0]);
        }
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-45, -89, 97, -37, -112, -125, -69, -79}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public void id_break(JsonObject jsonObject) {
        super.id_break(jsonObject);
        JsonObject jsonObject2 = new JsonObject();
        JsonArray jsonArray = new JsonArray();
        for (rrZk_1 rrZk_12 : ((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[id_break[0]]).id_class().values()) {
            JsonObject jsonObject3 = new JsonObject();
            jsonObject3.addProperty(id_protected[1], rrZk_12.id_class());
            jsonArray.add((JsonElement)jsonObject3);
        }
        jsonObject2.add(id_protected[2], (JsonElement)jsonArray);
        jsonObject.add(id_protected[3], (JsonElement)jsonObject2);
    }

    private static void id_throws() {
        id_break = new short[2];
    }

    private static /* synthetic */ void ntfClinit() {
        rrIs_1.id_byte();
        rrIs_1.id_protected();
        rrIs_1.id_throws();
    }

    private static void id_protected() {
        id_protected = new String[]{new String("friend"), new String("name"), new String("friend"), new String("friend"), new String("friend"), new String("friend"), new String("friend"), new String("name")};
    }
}

