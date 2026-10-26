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
import celestial.rrqU_2;
import celestial.rrqY_2;
import celestial.rrwU_2;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIB
extends rrwU_2 {
    private static boolean[] id_break;
    private static short[] id_byte;
    private static String[] id_protected;

    private static void id_byte() {
        id_protected = new String[]{new String("blockesp"), new String("name"), new String("color"), new String("blockesp"), new String("blockesp"), new String("blockesp"), new String("blockesp"), new String("blockesp"), new String("name"), new String("color")};
    }

    public rrIB() {
        super(id_protected[0]);
    }

    static {
        rrIB.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x464E1370;
    }

    @Override
    public void id_class(JsonObject jsonObject) {
        super.id_class(jsonObject);
        if (!jsonObject.has(id_protected[5])) {
            return;
        }
        JsonObject jsonObject2 = jsonObject.getAsJsonObject(id_protected[6]);
        JsonArray jsonArray = jsonObject2.getAsJsonArray(id_protected[7]);
        for (JsonElement jsonElement : jsonArray) {
            JsonObject jsonObject3 = jsonElement.getAsJsonObject();
            String string = jsonObject3.get(id_protected[8]).getAsString();
            int n = jsonObject3.get(id_protected[9]).getAsInt();
            ((rrqY_2)rrqY_2.staticFields0d81573182c03565b5bb298419afe0b7[id_byte[1]]).id_class(new rrqU_2(ri_3.id_class(string), n), string, id_break[0]);
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xF32C0B54668A91F2L;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{5, -31, -69, 38, -56, -27, -121, 101}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public void id_break(JsonObject jsonObject) {
        super.id_break(jsonObject);
        JsonObject jsonObject2 = new JsonObject();
        JsonArray jsonArray = new JsonArray();
        for (rrqU_2 rrqU_22 : ((rrqY_2)rrqY_2.staticFields0d81573182c03565b5bb298419afe0b7[id_byte[0]]).id_byte()) {
            JsonObject jsonObject3 = new JsonObject();
            jsonObject3.addProperty(id_protected[1], rrqU_22.id_byte());
            jsonObject3.addProperty(id_protected[2], (Number)rrqU_22.id_class());
            jsonArray.add((JsonElement)jsonObject3);
        }
        jsonObject2.add(id_protected[3], (JsonElement)jsonArray);
        jsonObject.add(id_protected[4], (JsonElement)jsonObject2);
    }

    private static void id_throws() {
        id_byte = new short[2];
    }

    private static /* synthetic */ void ntfClinit() {
        rrIB.id_protected();
        rrIB.id_byte();
        rrIB.id_throws();
    }

    private static void id_protected() {
        id_break = new boolean[1];
    }
}

