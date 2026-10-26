/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.rrwU_2;
import celestial.rryd_1;
import celestial.rryk_1;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIS
extends rrwU_2 {
    private static short[] id_break;
    private static boolean[] id_byte;
    private static String[] id_protected;

    private static void id_byte() {
        id_byte = new boolean[4];
    }

    public rrIS() {
        super(id_protected[0]);
    }

    static {
        rrIS.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x29F4E415B888792FL;
    }

    @Override
    public void id_class(JsonObject jsonObject) {
        super.id_class(jsonObject);
        if (!jsonObject.has(id_protected[5])) {
            return;
        }
        JsonObject jsonObject2 = jsonObject.getAsJsonObject(id_protected[6]);
        JsonArray jsonArray = jsonObject2.getAsJsonArray(id_protected[7]);
        ((rryd_1)rryd_1.staticFields78f62b0b61073300aba99f31bcf5126e[id_break[1]]).id_class(id_byte[0]);
        for (int i = id_byte[1]; i < jsonArray.size(); ++i) {
            JsonObject jsonObject3 = jsonArray.get(i).getAsJsonObject();
            String string = jsonObject3.get(id_protected[8]).getAsString();
            String string2 = jsonObject3.has(id_protected[9]) ? jsonObject3.get(id_protected[10]).getAsString() : null;
            ((rryd_1)rryd_1.staticFields78f62b0b61073300aba99f31bcf5126e[id_break[2]]).id_class(string, string2, id_byte[2], id_byte[3]);
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x52D5155A;
    }

    @Override
    public void id_break(JsonObject jsonObject) {
        super.id_break(jsonObject);
        JsonObject jsonObject2 = new JsonObject();
        JsonArray jsonArray = new JsonArray();
        for (rryk_1 rryk_12 : ((rryd_1)rryd_1.staticFields78f62b0b61073300aba99f31bcf5126e[id_break[0]]).id_break()) {
            String string = rryk_12.id_break();
            String string2 = rryk_12.id_class();
            JsonObject jsonObject3 = new JsonObject();
            jsonObject3.addProperty(id_protected[1], string);
            if (string2 != null) {
                jsonObject3.addProperty(id_protected[2], string2);
            }
            jsonArray.add((JsonElement)jsonObject3);
        }
        jsonObject2.add(id_protected[3], (JsonElement)jsonArray);
        jsonObject.add(id_protected[4], (JsonElement)jsonObject2);
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-105, 19, 110, -59, 28, 70, -103, 98}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_throws() {
        id_break = new short[3];
    }

    private static /* synthetic */ void ntfClinit() {
        rrIS.id_byte();
        rrIS.id_protected();
        rrIS.id_throws();
    }

    private static void id_protected() {
        id_protected = new String[]{new String("duel_blacklist"), new String("name"), new String("note"), new String("names"), new String("names"), new String("names"), new String("names"), new String("names"), new String("name"), new String("note"), new String("note")};
    }
}

