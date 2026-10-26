/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.rdb_3;
import celestial.rrNd_1;
import celestial.rrNh_1;
import celestial.rrwU_2;
import celestial.rrww_3;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIP
extends rrwU_2 {
    private static short[] id_break;
    private static boolean[] id_byte;
    private static String[] id_protected;

    private static void id_byte() {
        id_byte = new boolean[]{true};
    }

    public rrIP() {
        super(id_protected[0]);
    }

    static {
        rrIP.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x97779D78F60DF96FL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xCD8A31C7;
    }

    @Override
    public void id_class(JsonObject jsonObject) {
        super.id_class(jsonObject);
        if (!jsonObject.has(id_protected[10])) {
            return;
        }
        JsonObject jsonObject2 = jsonObject.getAsJsonObject(id_protected[11]);
        JsonArray jsonArray = jsonObject2.getAsJsonArray(id_protected[12]);
        for (JsonElement jsonElement : jsonArray) {
            JsonObject jsonObject3 = jsonElement.getAsJsonObject();
            if (!jsonObject3.has(id_protected[13])) continue;
            ((rrNh_1)((Object)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[id_break[1]])).id_break(jsonObject3.get(id_protected[14]).getAsString()).ifPresent(rrNd_12 -> {
                if (jsonObject3.has(id_protected[15])) {
                    rrNd_12.id_break(jsonObject3.get(id_protected[16]).getAsBoolean());
                }
                if (jsonObject3.has(id_protected[17])) {
                    rrNd_12.id_break(jsonObject3.get(id_protected[18]).getAsInt());
                }
                if (jsonObject3.has(id_protected[19])) {
                    rrNd_12.id_class(jsonObject3.get(id_protected[20]).getAsBoolean());
                }
                if (jsonObject3.has(id_protected[21])) {
                    rrNd_12.id_byte(jsonObject3.get(id_protected[22]).getAsBoolean());
                }
                if (jsonObject3.has(id_protected[23])) {
                    rrNd_12.id_byte(jsonObject3.get(id_protected[24]).getAsInt());
                }
                if (jsonObject3.has(id_protected[25])) {
                    rrNd_12.id_class(jsonObject3.get(id_protected[26]).getAsInt());
                }
                rrww_3.id_class(rrNd_12, jsonObject3);
            });
        }
    }

    @Override
    public void id_break(JsonObject jsonObject) {
        super.id_break(jsonObject);
        JsonObject jsonObject2 = new JsonObject();
        JsonArray jsonArray = new JsonArray();
        for (rrNd_1 rrNd_12 : ((rrNh_1)((Object)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[id_break[0]])).id_extends()) {
            JsonObject jsonObject3 = new JsonObject();
            rdb_3 rdb_32 = rrNd_12.id_catch();
            jsonObject3.addProperty(id_protected[1], rrNd_12.id_volatile());
            jsonObject3.addProperty(id_protected[2], Boolean.valueOf(rrNd_12.id_while()));
            jsonObject3.addProperty(id_protected[3], (Number)rrNd_12.id_else());
            jsonObject3.addProperty(id_protected[4], Boolean.valueOf(rrNd_12.id_class()));
            if (rdb_32.id_extends()) {
                jsonObject3.addProperty(id_protected[5], Boolean.valueOf(rrNd_12.id_return()));
                jsonObject3.addProperty(id_protected[6], (Number)rrNd_12.id_public());
            }
            if (rdb_32.id_implements() > id_byte[0]) {
                jsonObject3.addProperty(id_protected[7], (Number)rrNd_12.id_native());
            }
            rrww_3.id_break(rrNd_12, jsonObject3);
            jsonArray.add((JsonElement)jsonObject3);
        }
        jsonObject2.add(id_protected[8], (JsonElement)jsonArray);
        jsonObject.add(id_protected[9], (JsonElement)jsonObject2);
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{0, 117, 11, 46, 0, 69, -35, 59}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_throws() {
        id_break = new short[2];
    }

    private static /* synthetic */ void ntfClinit() {
        rrIP.id_byte();
        rrIP.id_protected();
        rrIP.id_throws();
    }

    private static void id_protected() {
        id_protected = new String[]{new String("autobuy"), new String("custom_name"), new String("enabled"), new String("max_price"), new String("can_be_parsed"), new String("check_durability"), new String("min_durability"), new String("min_count"), new String("items"), new String("items"), new String("items"), new String("items"), new String("items"), new String("custom_name"), new String("custom_name"), new String("enabled"), new String("enabled"), new String("max_price"), new String("max_price"), new String("can_be_parsed"), new String("can_be_parsed"), new String("check_durability"), new String("check_durability"), new String("min_durability"), new String("min_durability"), new String("min_count"), new String("min_count")};
    }
}

