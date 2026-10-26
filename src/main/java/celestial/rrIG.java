/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.rrqM_2;
import celestial.rrwU_2;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIG
extends rrwU_2 {
    private static boolean[] id_break;
    private static String[] id_byte;
    private static short[] id_protected;

    private static void id_byte() {
        id_protected = new short[3];
    }

    public rrIG() {
        super(id_byte[0]);
    }

    static {
        rrIG.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xD97CB438;
    }

    @Override
    public void id_class(JsonObject jsonObject) {
        super.id_class(jsonObject);
        if (!jsonObject.has(id_byte[4])) {
            return;
        }
        JsonObject jsonObject2 = jsonObject.getAsJsonObject(id_byte[5]);
        JsonArray jsonArray = jsonObject2.getAsJsonArray(id_byte[6]);
        ((rrqM_2)rrqM_2.staticFields360b36d126ee3c45b942181ce786df43[id_protected[1]]).id_class(id_break[0]);
        for (JsonElement jsonElement : jsonArray) {
            JsonObject jsonObject3 = jsonElement.getAsJsonObject();
            String string = jsonObject3.get(id_byte[7]).getAsString();
            ((rrqM_2)rrqM_2.staticFields360b36d126ee3c45b942181ce786df43[id_protected[2]]).id_class(string, id_break[1], id_break[2]);
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x99096BA352EEADDEL;
    }

    @Override
    public void id_break(JsonObject jsonObject) {
        super.id_break(jsonObject);
        JsonObject jsonObject2 = new JsonObject();
        JsonArray jsonArray = new JsonArray();
        for (String string : ((rrqM_2)rrqM_2.staticFields360b36d126ee3c45b942181ce786df43[id_protected[0]]).id_byte()) {
            JsonObject jsonObject3 = new JsonObject();
            jsonObject3.addProperty(id_byte[1], string);
            jsonArray.add((JsonElement)jsonObject3);
        }
        jsonObject2.add(id_byte[2], (JsonElement)jsonArray);
        jsonObject.add(id_byte[3], (JsonElement)jsonObject2);
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{78, -10, 96, 66, -85, -30, 126, 124}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_throws() {
        id_break = new boolean[3];
    }

    private static /* synthetic */ void ntfClinit() {
        rrIG.id_throws();
        rrIG.id_protected();
        rrIG.id_byte();
    }

    private static void id_protected() {
        id_byte = new String[]{new String("staff"), new String("name"), new String("staff"), new String("staff"), new String("staff"), new String("staff"), new String("staff"), new String("name")};
    }
}

