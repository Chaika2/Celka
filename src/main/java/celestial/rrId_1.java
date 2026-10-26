/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.rrtN_2;
import celestial.rrtu_3;
import celestial.rrvj_1;
import celestial.rrwE_2;
import celestial.rrwM_2;
import celestial.rrwj_3;
import celestial.rrww_3;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrId_1
implements rrwj_3 {
    private static String[] id_class;
    private static short[] id_break;
    private static boolean[] id_byte;

    private static void id_byte() {
        boolean[] blArray = new boolean[3];
        blArray[0] = true;
        blArray[1] = true;
        id_byte = blArray;
    }

    static {
        rrId_1.ntfClinit();
    }

    private static void id_class(JsonObject jsonObject, rrtN_2 rrtN_22) {
        rrwM_2 rrwM_22 = rrtN_22.id_const();
        if (rrwM_22 != null) {
            jsonObject.addProperty(id_class[5], rrwM_22.id_break().name());
            jsonObject.addProperty(id_class[6], (Number)Float.valueOf(rrwM_22.id_class()));
            jsonObject.addProperty(id_class[7], (Number)Float.valueOf(rrwM_22.id_byte()));
        } else {
            jsonObject.addProperty(id_class[8], (Number)Float.valueOf(rrtN_22.id_default()));
            jsonObject.addProperty(id_class[9], (Number)Float.valueOf(rrtN_22.id_abstract()));
        }
        if (rrtN_22 instanceof rrvj_1) {
            rrvj_1 rrvj_12 = (rrvj_1)rrtN_22;
            jsonObject.addProperty(id_class[10], Boolean.valueOf(rrvj_12.id_continue()));
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x34795EE195413971L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-93, 24, 73, 75, 62, -102, -10, -1}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        id_class = new String[]{new String("popupsettings"), new String("popups"), new String("popups"), new String("popups"), new String("popupsettings"), new String("Anchor"), new String("OffsetX"), new String("OffsetY"), new String("PositionX"), new String("PositionY"), new String("Pinned"), new String("Anchor"), new String("OffsetX"), new String("OffsetY"), new String("Anchor"), new String("OffsetX"), new String("OffsetY"), new String("PositionX"), new String("PositionY"), new String("PositionX"), new String("PositionY"), new String("Pinned"), new String("Pinned")};
    }

    @Override
    public void id_class(JsonObject jsonObject) {
        if (!jsonObject.has(id_class[2])) {
            return;
        }
        JsonObject jsonObject2 = jsonObject.getAsJsonObject(id_class[3]);
        for (rrtN_2 rrtN_22 : Arrays.stream(rrtu_3.id_byte()).flatMap(rrtu_32 -> rrtu_32.id_class().stream()).toList()) {
            String string = rrtN_22.id_synchronized();
            if (!jsonObject2.has(string)) continue;
            rrtN_22.id_byte(id_byte[0]);
            JsonObject jsonObject3 = jsonObject2.getAsJsonObject(string);
            JsonObject jsonObject4 = jsonObject3.getAsJsonObject(id_class[4]);
            rrId_1.id_break(jsonObject3, rrtN_22);
            rrww_3.id_class(rrtN_22, jsonObject4);
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x80619716;
    }

    private static void id_break() {
        id_break = new short[1];
    }

    @Override
    public void id_break(JsonObject jsonObject) {
        JsonObject jsonObject2 = new JsonObject();
        for (rrtN_2 rrtN_22 : Arrays.stream(rrtu_3.id_byte()).flatMap(rrtu_32 -> rrtu_32.id_class().stream()).toList()) {
            JsonObject jsonObject3 = new JsonObject();
            JsonObject jsonObject4 = new JsonObject();
            rrww_3.id_break(rrtN_22, jsonObject4);
            rrId_1.id_class(jsonObject3, rrtN_22);
            jsonObject3.add(id_class[0], (JsonElement)jsonObject4);
            jsonObject2.add(rrtN_22.id_synchronized(), (JsonElement)jsonObject3);
        }
        jsonObject.add(id_class[1], (JsonElement)jsonObject2);
    }

    private static void id_break(JsonObject jsonObject, rrtN_2 rrtN_22) {
        Object object;
        if (jsonObject.has(id_class[11]) && jsonObject.has(id_class[12]) && jsonObject.has(id_class[13])) {
            try {
                object = rrwE_2.valueOf(jsonObject.get(id_class[14]).getAsString());
                rrtN_22.id_class((rrwE_2)((Object)object), jsonObject.get(id_class[15]).getAsFloat(), jsonObject.get(id_class[16]).getAsFloat());
            }
            catch (IllegalArgumentException illegalArgumentException) {}
        } else if (jsonObject.has(id_class[17]) && jsonObject.has(id_class[18])) {
            rrtN_22.id_class((float)jsonObject.get(id_class[19]).getAsInt(), (float)jsonObject.get(id_class[20]).getAsInt());
        }
        if (rrtN_22 instanceof rrvj_1) {
            object = (rrvj_1)rrtN_22;
            boolean bl = jsonObject.has(id_class[21]) && jsonObject.get(id_class[22]).getAsBoolean() ? id_byte[1] : id_byte[2];
            ((rrvj_1)object).id_class(bl);
            if (!bl && rrtN_22.id_const() != null) {
                float f = rrtN_22.id_default();
                float f2 = rrtN_22.id_abstract();
                rrtN_22.id_class((rrwE_2)((Object)rrwE_2.staticFields6648a4467c4f300f966c59969d37f426[id_break[0]]), f, f2);
            }
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrId_1.id_byte();
        rrId_1.id_class();
        rrId_1.id_break();
    }
}

