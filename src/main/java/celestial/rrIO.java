/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.eX_2;
import celestial.rjU_2;
import celestial.rrjD_2;
import celestial.rrje_3;
import celestial.rrwU_2;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIO
extends rrwU_2 {
    private static short[] id_break;
    private static boolean[] id_byte;
    private static String[] id_protected;

    private static void id_byte() {
        id_break = new short[2];
    }

    public rrIO() {
        super(id_protected[0]);
    }

    static {
        rrIO.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xFFA32EB;
    }

    @Override
    public void id_class(JsonObject jsonObject) {
        super.id_class(jsonObject);
        if (!jsonObject.has(id_protected[8])) {
            return;
        }
        JsonObject jsonObject2 = jsonObject.getAsJsonObject(id_protected[9]);
        JsonArray jsonArray = jsonObject2.getAsJsonArray(id_protected[10]);
        for (JsonElement jsonElement : jsonArray) {
            JsonObject jsonObject3 = jsonElement.getAsJsonObject();
            String string = jsonObject3.get(id_protected[11]).getAsString();
            double d = jsonObject3.get(id_protected[12]).getAsDouble();
            double d2 = jsonObject3.get(id_protected[13]).getAsDouble();
            double d3 = jsonObject3.get(id_protected[14]).getAsDouble();
            String string2 = jsonObject3.get(id_protected[15]).getAsString();
            ((rrje_3)((Object)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[id_break[1]])).id_class(new rrjD_2(string, new rjU_2(d, d2, d3), string2), id_byte[0]);
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x53812E3ACE0A1F2DL;
    }

    @Override
    public void id_break(JsonObject jsonObject) {
        super.id_break(jsonObject);
        JsonObject jsonObject2 = new JsonObject();
        JsonArray jsonArray = new JsonArray();
        for (rrjD_2 rrjD_22 : ((rrje_3)((Object)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[id_break[0]])).id_byte()) {
            JsonObject jsonObject3 = new JsonObject();
            String string = rrjD_22.id_byte();
            eX_2 eX_22 = rrjD_22.id_break();
            String string2 = rrjD_22.id_protected();
            jsonObject3.addProperty(id_protected[1], string);
            jsonObject3.addProperty(id_protected[2], (Number)eX_22.id_class());
            jsonObject3.addProperty(id_protected[3], (Number)eX_22.id_break());
            jsonObject3.addProperty(id_protected[4], (Number)eX_22.id_byte());
            jsonObject3.addProperty(id_protected[5], string2);
            jsonArray.add((JsonElement)jsonObject3);
        }
        jsonObject2.add(id_protected[6], (JsonElement)jsonArray);
        jsonObject.add(id_protected[7], (JsonElement)jsonObject2);
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{93, 47, -53, 114, 1, -126, 5, -73}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_throws() {
        id_protected = new String[]{new String("waypoint"), new String("name"), new String("x"), new String("y"), new String("z"), new String("serverIP"), new String("waypoint"), new String("waypoint"), new String("waypoint"), new String("waypoint"), new String("waypoint"), new String("name"), new String("x"), new String("y"), new String("z"), new String("serverIP")};
    }

    private static /* synthetic */ void ntfClinit() {
        rrIO.id_protected();
        rrIO.id_throws();
        rrIO.id_byte();
    }

    private static void id_protected() {
        id_byte = new boolean[1];
    }
}

