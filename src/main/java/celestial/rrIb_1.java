/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.rrqX_2;
import celestial.rrwU_2;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIb_1
extends rrwU_2 {
    private static String[] id_break;
    private static short[] id_byte;
    private static boolean[] id_protected;

    private static void id_byte() {
        id_break = new String[]{new String("staff_prefixes"), new String("prefix"), new String("prefixes"), new String("prefixes"), new String("prefixes"), new String("prefixes"), new String("prefixes"), new String("prefix")};
    }

    public rrIb_1() {
        super(id_break[0]);
    }

    static {
        rrIb_1.ntfClinit();
    }

    @Override
    public void id_class(JsonObject jsonObject) {
        super.id_class(jsonObject);
        if (!jsonObject.has(id_break[4])) {
            return;
        }
        JsonObject jsonObject2 = jsonObject.getAsJsonObject(id_break[5]);
        JsonArray jsonArray = jsonObject2.getAsJsonArray(id_break[6]);
        ((rrqX_2)rrqX_2.staticFields25cb0eac93bd35f999c477f8effd8890[id_byte[1]]).id_class(id_protected[0]);
        for (JsonElement jsonElement : jsonArray) {
            JsonObject jsonObject3 = jsonElement.getAsJsonObject();
            String string = jsonObject3.get(id_break[7]).getAsString();
            ((rrqX_2)rrqX_2.staticFields25cb0eac93bd35f999c477f8effd8890[id_byte[2]]).id_class(string, id_protected[1], id_protected[2]);
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x185D1263766590CDL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xCD33BD00;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{89, -52, 122, -97, 40, -42, 82, -116}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public void id_break(JsonObject jsonObject) {
        super.id_break(jsonObject);
        JsonObject jsonObject2 = new JsonObject();
        JsonArray jsonArray = new JsonArray();
        for (String string : ((rrqX_2)rrqX_2.staticFields25cb0eac93bd35f999c477f8effd8890[id_byte[0]]).id_byte()) {
            JsonObject jsonObject3 = new JsonObject();
            jsonObject3.addProperty(id_break[1], string);
            jsonArray.add((JsonElement)jsonObject3);
        }
        jsonObject2.add(id_break[2], (JsonElement)jsonArray);
        jsonObject.add(id_break[3], (JsonElement)jsonObject2);
    }

    private static void id_throws() {
        id_protected = new boolean[3];
    }

    private static /* synthetic */ void ntfClinit() {
        rrIb_1.id_throws();
        rrIb_1.id_byte();
        rrIb_1.id_protected();
    }

    private static void id_protected() {
        id_byte = new short[3];
    }
}

