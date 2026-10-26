/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package celestial;

import celestial.manager.ThemeManager;
import celestial.module.Module;
import celestial.rrQX;
import celestial.rrfC_2;
import celestial.rrnZ_2;
import celestial.rrwj_3;
import celestial.rrww_3;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIx_1
implements rrwj_3 {
    private static String[] id_class;
    private static boolean[] id_break;
    private static short[] id_byte;

    private static void id_byte() {
        id_break = new boolean[4];
    }

    static {
        rrIx_1.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-122, -1, -16, -52, 9, -90, 51, -120}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public void id_class(JsonObject jsonObject) {
        if (jsonObject.has(id_class[3])) {
            JsonObject jsonObject2 = jsonObject.getAsJsonObject(id_class[4]);
            for (Module module : ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[2]]).id_private().g()) {
                String string = module.id_synchronized();
                if (!jsonObject2.has(string)) continue;
                JsonObject jsonObject3 = jsonObject2.getAsJsonObject(string);
                JsonObject jsonObject4 = jsonObject3.getAsJsonObject(id_class[5]);
                rrIx_1.id_class(jsonObject3, module);
                rrww_3.id_class(module, jsonObject4);
                module.id_byte();
            }
        }
        if (jsonObject.has(id_class[6])) {
            ((ThemeManager)((Object)ThemeManager.staticFieldsc3c8b26240a53959b0b3ce0fbbe0f311[id_byte[3]])).id_break(jsonObject.get(id_class[7]).getAsString());
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x1607B2E28C33E58DL;
    }

    private static void id_class() {
        id_class = new String[]{new String("modulesettings"), new String("modules"), new String("Theme"), new String("modules"), new String("modules"), new String("modulesettings"), new String("Theme"), new String("Theme"), new String("enabled"), new String("key"), new String("flag"), new String("enabled"), new String("enabled"), new String("key"), new String("key"), new String("flag"), new String("flag")};
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xD0331DF9;
    }

    private static void id_class(JsonObject jsonObject, Module module) {
        if (jsonObject.has(id_class[11])) {
            boolean bl = jsonObject.get(id_class[12]).getAsBoolean();
            try {
                if (bl) {
                    module.id_break(id_break[0]);
                } else if (module.aJ_()) {
                    module.id_byte(id_break[1]);
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        if (jsonObject.has(id_class[13])) {
            module.id_class(rrfC_2.id_class(jsonObject.get(id_class[14]).getAsInt()), id_break[2]);
        }
        if (jsonObject.has(id_class[15])) {
            module.id_class(jsonObject.get(id_class[16]).getAsBoolean(), id_break[3]);
        }
    }

    @Override
    public void id_break(JsonObject jsonObject) {
        JsonObject jsonObject2 = new JsonObject();
        for (Module module : ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[0]]).id_private().g()) {
            JsonObject jsonObject3 = new JsonObject();
            JsonObject jsonObject4 = new JsonObject();
            rrww_3.id_break(module, jsonObject4);
            rrIx_1.id_break(jsonObject3, module);
            jsonObject3.add(id_class[0], (JsonElement)jsonObject4);
            jsonObject2.add(module.id_synchronized(), (JsonElement)jsonObject3);
            module.id_finally();
        }
        jsonObject.add(id_class[1], (JsonElement)jsonObject2);
        jsonObject.addProperty(id_class[2], ((ThemeManager)((Object)ThemeManager.staticFieldsc3c8b26240a53959b0b3ce0fbbe0f311[id_byte[1]])).id_break().id_byte());
    }

    private static void id_break(JsonObject jsonObject, Module module) {
        jsonObject.addProperty(id_class[8], Boolean.valueOf(module.aJ_()));
        jsonObject.addProperty(id_class[9], (Number)module.id_package().id_byte());
        if (module instanceof rrnZ_2) {
            jsonObject.addProperty(id_class[10], Boolean.valueOf(module.id_implements()));
        }
    }

    private static void id_break() {
        id_byte = new short[4];
    }

    private static /* synthetic */ void ntfClinit() {
        rrIx_1.id_byte();
        rrIx_1.id_class();
        rrIx_1.id_break();
    }
}

