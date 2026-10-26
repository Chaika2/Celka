/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.mojang.util.UUIDTypeAdapter
 */
package celestial;

import celestial.rrQQ;
import celestial.rrQW;
import celestial.rrQd_1;
import celestial.rrQk_1;
import celestial.rrQx_1;
import celestial.rrQz_1;
import celestial.rrwU_2;
import celestial.rrwi_3;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.util.UUIDTypeAdapter;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwa_3
extends rrwU_2 {
    private static String[] id_break;
    private static boolean[] id_byte;
    private static short[] id_protected;

    private static void id_byte() {
        id_break = new String[]{new String("account"), new String("account"), new String("account"), new String("lastAccount"), new String("account"), new String("account"), new String("account"), new String("uuid"), new String("name"), new String("authType"), new String("lastAccount"), new String("lastAccount"), new String("uuid"), new String("name"), new String("authType"), new String("accessToken"), new String("password"), new String("uuid"), new String("name"), new String("authType"), new String("accessToken"), new String("password")};
    }

    public rrwa_3() {
        super(id_break[0]);
    }

    static {
        rrwa_3.ntfClinit();
    }

    private static rrQx_1 id_class(rrQd_1 rrQd_12, JsonObject jsonObject, String string, UUID uUID) {
        return switch (((int[])rrwi_3.id_class[id_protected[4]])[rrQd_12.ordinal()]) {
            case 1, 2 -> new rrQQ(string, uUID, rrQd_12);
            case 3 -> new rrQW(string, jsonObject.get(id_break[15]).getAsString(), uUID, rrQd_12);
            case 4 -> new rrQz_1(string, jsonObject.get(id_break[16]).getAsString(), uUID, rrQd_12);
            default -> null;
        };
    }

    @Override
    public void id_class(JsonObject jsonObject) {
        Object object;
        Object object2;
        Object object3;
        JsonObject jsonObject2;
        super.id_class(jsonObject);
        if (jsonObject.has(id_break[4])) {
            jsonObject2 = jsonObject.getAsJsonObject(id_break[5]);
            object3 = jsonObject2.getAsJsonArray(id_break[6]);
            for (Object object4 : object3) {
                rrQx_1 rrQx_12;
                object2 = object4.getAsJsonObject();
                object = object2.get(id_break[7]).getAsString();
                UUID uUID = UUIDTypeAdapter.fromString((String)object);
                String string = object2.get(id_break[8]).getAsString();
                rrQd_1 rrQd_12 = rrQd_1.id_class(object2.get(id_break[9]).getAsString());
                if (rrQd_12 == null || (rrQx_12 = rrwa_3.id_class(rrQd_12, object2, string, uUID)) == null) continue;
                ((rrQk_1)rrQk_1.staticFields9c4062aebf3b3e0dbb68c82ac08880ac[id_protected[2]]).id_class(rrQx_12, id_byte[0], id_byte[1]);
            }
        }
        if (jsonObject.has(id_break[10])) {
            Object object4;
            jsonObject2 = jsonObject.getAsJsonObject(id_break[11]);
            object3 = jsonObject2.get(id_break[12]).getAsString();
            UUID uUID = UUIDTypeAdapter.fromString((String)object3);
            object4 = jsonObject2.get(id_break[13]).getAsString();
            object2 = rrQd_1.id_class(jsonObject2.get(id_break[14]).getAsString());
            if (object2 == null) {
                return;
            }
            object = rrwa_3.id_class((rrQd_1)((Object)object2), jsonObject2, (String)object4, uUID);
            if (object != null) {
                ((rrQk_1)rrQk_1.staticFields9c4062aebf3b3e0dbb68c82ac08880ac[id_protected[3]]).id_class((rrQx_1)object);
            }
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xCB77158D;
    }

    private static void id_class(rrQx_1 rrQx_12, JsonObject jsonObject, rrQd_1 rrQd_12) {
        jsonObject.addProperty(id_break[17], UUIDTypeAdapter.fromUUID((UUID)rrQx_12.id_protected()));
        jsonObject.addProperty(id_break[18], rrQx_12.id_class());
        jsonObject.addProperty(id_break[19], rrQd_12.id_class());
        if (rrQx_12 instanceof rrQW) {
            rrQW rrQW2 = (rrQW)rrQx_12;
            jsonObject.addProperty(id_break[20], rrQW2.id_case());
        } else if (rrQx_12 instanceof rrQz_1) {
            rrQz_1 rrQz_12 = (rrQz_1)rrQx_12;
            jsonObject.addProperty(id_break[21], rrQz_12.id_case());
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xD13C0894840A5670L;
    }

    @Override
    public void id_break(JsonObject jsonObject) {
        Object object;
        super.id_break(jsonObject);
        JsonObject jsonObject2 = new JsonObject();
        JsonArray jsonArray = new JsonArray();
        for (rrQx_1 rrQx_12 : ((rrQk_1)rrQk_1.staticFields9c4062aebf3b3e0dbb68c82ac08880ac[id_protected[0]]).id_class()) {
            object = new JsonObject();
            rrQd_1 rrQd_12 = rrQx_12.id_break();
            rrwa_3.id_class(rrQx_12, object, rrQd_12);
            jsonArray.add((JsonElement)object);
        }
        jsonObject2.add(id_break[1], (JsonElement)jsonArray);
        jsonObject.add(id_break[2], (JsonElement)jsonObject2);
        rrQx_1 rrQx_13 = ((rrQk_1)rrQk_1.staticFields9c4062aebf3b3e0dbb68c82ac08880ac[id_protected[1]]).id_protected();
        if (rrQx_13 != null) {
            rrQx_1 rrQx_12;
            rrQx_12 = new JsonObject();
            object = rrQx_13.id_break();
            rrwa_3.id_class(rrQx_13, (JsonObject)rrQx_12, (rrQd_1)((Object)object));
            jsonObject.add(id_break[3], (JsonElement)rrQx_12);
        }
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{35, 22, 45, -86, -105, -5, -98, 77}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_throws() {
        id_protected = new short[5];
    }

    private static /* synthetic */ void ntfClinit() {
        rrwa_3.id_protected();
        rrwa_3.id_byte();
        rrwa_3.id_throws();
    }

    private static void id_protected() {
        id_byte = new boolean[2];
    }
}

