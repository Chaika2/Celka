/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.rrfC_2;
import celestial.rrvZ;
import celestial.rrvm_1;
import celestial.rrwU_2;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIE
extends rrwU_2 {
    private static short[] id_break;
    private static String[] id_byte;
    private static boolean[] id_protected;

    private static void id_byte() {
        id_byte = new String[]{new String("macro"), new String("name"), new String("content"), new String("key"), new String("macro"), new String("macro"), new String("macro"), new String("macro"), new String("macro"), new String("name"), new String("content"), new String("key")};
    }

    public rrIE() {
        super(id_byte[0]);
    }

    static {
        rrIE.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x2C37BC76;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x7401E4D337CA08DAL;
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
            int n = jsonObject3.get(id_byte[11]).getAsInt();
            ((rrvZ)rrvZ.staticFieldse90af7ec3c763bb3bd1d99a27ea561d9[id_break[1]]).id_class(new rrvm_1(string, string2, rrfC_2.id_class(n)), id_protected[0]);
        }
    }

    @Override
    public void id_break(JsonObject jsonObject) {
        super.id_break(jsonObject);
        JsonObject jsonObject2 = new JsonObject();
        JsonArray jsonArray = new JsonArray();
        for (rrvm_1 rrvm_12 : ((rrvZ)rrvZ.staticFieldse90af7ec3c763bb3bd1d99a27ea561d9[id_break[0]]).id_byte()) {
            JsonObject jsonObject3 = new JsonObject();
            jsonObject3.addProperty(id_byte[1], rrvm_12.id_byte());
            jsonObject3.addProperty(id_byte[2], rrvm_12.id_break());
            jsonObject3.addProperty(id_byte[3], (Number)rrvm_12.id_class().id_byte());
            jsonArray.add((JsonElement)jsonObject3);
        }
        jsonObject2.add(id_byte[4], (JsonElement)jsonArray);
        jsonObject.add(id_byte[5], (JsonElement)jsonObject2);
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{92, 34, 66, 82, 63, -103, 21, -55}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_throws() {
        id_protected = new boolean[1];
    }

    private static /* synthetic */ void ntfClinit() {
        rrIE.id_throws();
        rrIE.id_byte();
        rrIE.id_protected();
    }

    private static void id_protected() {
        id_break = new short[2];
    }
}

