/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonPrimitive
 */
package celestial;

import celestial.rrIF;
import celestial.rrIQ;
import celestial.rrIc_1;
import celestial.rrIk_1;
import celestial.rrIm_1;
import celestial.rrIv_1;
import celestial.rrIz_1;
import celestial.rrfC_2;
import celestial.rrwI_2;
import celestial.setting.GroupSetting;
import celestial.setting.KeyBind;
import celestial.setting.Setting;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrww_3 {
    private static short[] id_class;
    private static boolean[] id_break;

    static {
        rrww_3.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x37B3EF932EA51E48L;
    }

    public static void id_class(JsonObject jsonObject, Setting<?> setting) {
        rrIF rrIF2;
        if (setting instanceof rrIk_1) {
            rrIk_1 rrIk_13 = (rrIk_1)setting;
            jsonObject.add(setting.id_throws(), (JsonElement)new JsonPrimitive(rrIk_13.id_class()));
        } else if (setting instanceof rrIQ) {
            rrIQ rrIQ2 = (rrIQ)setting;
            jsonObject.add(setting.id_throws(), (JsonElement)new JsonPrimitive((String)rrIQ2.id_byte()));
        } else if (setting instanceof rrIm_1) {
            rrIm_1 rrIm_12 = (rrIm_1)setting;
            jsonObject.add(setting.id_throws(), (JsonElement)new JsonPrimitive((Number)rrIm_12.id_byte()));
        } else if (setting instanceof rrIz_1) {
            rrIz_1 rrIz_12 = (rrIz_1)setting;
            jsonObject.add(setting.id_throws(), (JsonElement)new JsonPrimitive((Number)rrIz_12.id_byte()));
        } else if (setting instanceof rrIv_1) {
            rrIv_1 rrIv_12 = (rrIv_1)setting;
            jsonObject.add(setting.id_throws(), (JsonElement)new JsonPrimitive(rrIv_12.id_extends()));
        } else if (setting instanceof rrIF && (rrIF2 = (rrIF)setting).id_finally() != (KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[id_class[0]]) {
            jsonObject.add(setting.id_throws(), (JsonElement)new JsonPrimitive((Number)rrIF2.id_finally().id_byte()));
        } else if (setting instanceof rrIc_1) {
            rrIc_1 rrIc_12 = (rrIc_1)setting;
            JsonObject jsonObject2 = new JsonObject();
            rrIc_12.id_class().forEach(rrIk_12 -> jsonObject2.add(rrIk_12.id_throws(), (JsonElement)new JsonPrimitive(rrIk_12.id_class())));
            jsonObject.add(setting.id_throws(), (JsonElement)jsonObject2);
        }
    }

    public static void id_class(JsonElement jsonElement, Setting<?> setting) {
        if (setting instanceof rrIk_1) {
            rrIk_1 rrIk_13 = (rrIk_1)setting;
            rrIk_13.id_class(jsonElement.getAsBoolean(), id_break[0], id_break[1]);
        } else if (setting instanceof rrIQ) {
            rrIQ rrIQ2 = (rrIQ)setting;
            rrIQ2.id_class(jsonElement.getAsString(), id_break[2]);
        } else if (setting instanceof rrIm_1) {
            rrIm_1 rrIm_12 = (rrIm_1)setting;
            rrIm_12.id_class(Float.valueOf(jsonElement.getAsFloat()), id_break[3], id_break[4]);
        } else if (setting instanceof rrIz_1) {
            rrIz_1 rrIz_12 = (rrIz_1)setting;
            rrIz_12.id_class(jsonElement.getAsInt(), id_break[5], id_break[6]);
        } else if (setting instanceof rrIF) {
            rrIF rrIF2 = (rrIF)setting;
            rrIF2.id_class(rrfC_2.id_class(jsonElement.getAsInt()), id_break[7], id_break[8]);
        } else if (setting instanceof rrIv_1) {
            rrIv_1 rrIv_12 = (rrIv_1)setting;
            String string = jsonElement.getAsString();
            rrIv_12.id_class(string, id_break[9], id_break[10]);
            rrIv_12.id_class((Object)string);
        } else if (setting instanceof rrIc_1) {
            rrIc_1 rrIc_12 = (rrIc_1)setting;
            if (jsonElement.isJsonObject()) {
                JsonObject jsonObject = jsonElement.getAsJsonObject();
                rrIc_12.id_class().stream().filter(rrIk_12 -> jsonObject.has(rrIk_12.id_throws())).forEach(rrIk_12 -> rrIk_12.id_class(jsonObject.get(rrIk_12.id_throws()).getAsBoolean(), id_break[11], id_break[12]));
            }
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x514F518D;
    }

    private static void id_class() {
        id_class = new short[1];
    }

    public static void id_class(rrwI_2 rrwI_22, JsonObject jsonObject) {
        for (Setting<?> setting : rrwI_22.b()) {
            if (setting == null || jsonObject == null || !jsonObject.has(setting.id_throws())) continue;
            JsonElement jsonElement = jsonObject.get(setting.id_throws());
            if (setting instanceof GroupSetting) {
                GroupSetting groupSetting = (GroupSetting)setting;
                List list = (List)groupSetting.id_byte();
                JsonObject jsonObject2 = jsonElement.getAsJsonObject();
                for (Setting setting2 : list) {
                    JsonElement jsonElement2;
                    if (setting2 == null || (jsonElement2 = jsonObject2.get(setting2.id_throws())) == null) continue;
                    rrww_3.id_class(jsonElement2, setting2);
                }
                continue;
            }
            rrww_3.id_class(jsonElement, setting);
        }
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{73, 117, -108, 18, 8, 87, -21, -1}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        id_break = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true};
    }

    public static JsonObject id_break(rrwI_2 rrwI_22, JsonObject jsonObject) {
        for (Setting<?> setting : rrwI_22.b()) {
            if (setting == null) continue;
            if (setting instanceof GroupSetting) {
                GroupSetting groupSetting = (GroupSetting)setting;
                List list = (List)groupSetting.id_byte();
                JsonObject jsonObject2 = new JsonObject();
                for (Setting setting2 : list) {
                    if (setting2 == null) continue;
                    rrww_3.id_class(jsonObject2, setting2);
                }
                jsonObject.add(groupSetting.id_throws(), (JsonElement)jsonObject2);
                continue;
            }
            rrww_3.id_class(jsonObject, setting);
        }
        return jsonObject;
    }

    private static /* synthetic */ void ntfClinit() {
        rrww_3.id_break();
        rrww_3.id_class();
    }
}

