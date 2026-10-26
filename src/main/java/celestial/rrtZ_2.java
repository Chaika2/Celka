/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrIF;
import celestial.rrIQ;
import celestial.rrIc_1;
import celestial.rrIk_1;
import celestial.rrIm_1;
import celestial.rrIu_1;
import celestial.rrIv_1;
import celestial.rrIz_1;
import celestial.rrtH_2;
import celestial.rrtN_2;
import celestial.rrtT_2;
import celestial.rrtV_2;
import celestial.rrtj_3;
import celestial.rrtl_3;
import celestial.rrtm_3;
import celestial.rrtp_3;
import celestial.rrtq_3;
import celestial.rrty_3;
import celestial.setting.ButtonSetting;
import celestial.setting.Setting;
import celestial.ui.clickgui.GuiList;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtZ_2 {
    private static short[] id_class;
    private static float[] id_break;
    private static byte[] id_byte;

    private static void id_byte() {
        short[] sArray = new short[2];
        sArray[0] = 1;
        id_class = sArray;
    }

    static {
        rrtZ_2.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-106, -58, -24, -91, 53, 122, -19, 116}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x36A1A9C251D80DBEL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x498C54AE;
    }

    private static void id_class() {
        float[] fArray = new float[42];
        fArray[0] = 5.0f;
        fArray[2] = 5.0f;
        fArray[3] = 5.0f;
        fArray[4] = 34.0f;
        fArray[5] = 5.0f;
        fArray[7] = 5.0f;
        fArray[8] = 5.0f;
        fArray[9] = 5.0f;
        fArray[11] = 5.0f;
        fArray[12] = 5.0f;
        fArray[13] = 22.0f;
        fArray[14] = 5.0f;
        fArray[16] = 5.0f;
        fArray[17] = 5.0f;
        fArray[18] = 22.0f;
        fArray[19] = 5.0f;
        fArray[21] = 5.0f;
        fArray[22] = 5.0f;
        fArray[23] = 22.0f;
        fArray[24] = 5.0f;
        fArray[26] = 5.0f;
        fArray[27] = 5.0f;
        fArray[28] = 23.0f;
        fArray[29] = 5.0f;
        fArray[31] = 5.0f;
        fArray[32] = 5.0f;
        fArray[33] = 5.0f;
        fArray[35] = 5.0f;
        fArray[36] = 5.0f;
        fArray[37] = 5.0f;
        fArray[39] = 5.0f;
        fArray[40] = 5.0f;
        fArray[41] = 20.0f;
        id_break = fArray;
    }

    public static rrtm_3 id_class(rrtN_2 rrtN_22, Setting<?> setting, float f) {
        if (setting instanceof rrIm_1) {
            rrIm_1 rrIm_12 = (rrIm_1)setting;
            return new rrtp_3(rrtN_22, rrIm_12, id_break[0], id_break[1], f - id_break[2] - id_break[3], id_break[4]);
        }
        if (setting instanceof rrIk_1) {
            rrIk_1 rrIk_12 = (rrIk_1)setting;
            return new rrtl_3(rrtN_22, rrIk_12, id_break[5], id_break[6], f - id_break[7] - id_break[8], id_byte[0] + rrIk_12.id_implements() * id_byte[1]);
        }
        if (setting instanceof rrIQ) {
            rrIQ rrIQ2 = (rrIQ)setting;
            return new rrtV_2(rrtN_22, rrIQ2, id_break[9], id_break[10], f - id_break[11] - id_break[12], id_break[13]);
        }
        if (setting instanceof rrIc_1) {
            rrIc_1 rrIc_12 = (rrIc_1)setting;
            if (rrIc_12.id_extends() == (rrIu_1)((Object)rrIu_1.staticFields10847edfe142316aa094e53a68b36f7b[id_class[0]])) {
                return new rrtj_3(rrtN_22, rrIc_12, id_break[14], id_break[15], f - id_break[16] - id_break[17], id_break[18]);
            }
            if (rrIc_12.id_extends() == (rrIu_1)((Object)rrIu_1.staticFields10847edfe142316aa094e53a68b36f7b[id_class[1]])) {
                return new GuiList(rrtN_22, rrIc_12, id_break[19], id_break[20], f - id_break[21] - id_break[22], id_break[23]);
            }
        } else {
            if (setting instanceof rrIv_1) {
                rrIv_1 rrIv_12 = (rrIv_1)setting;
                return new rrtq_3(rrtN_22, rrIv_12, id_break[24], id_break[25], f - id_break[26] - id_break[27], id_break[28]);
            }
            if (setting instanceof rrIF) {
                rrIF rrIF2 = (rrIF)setting;
                return new rrtT_2(rrtN_22, rrIF2, id_break[29], id_break[30], f - id_break[31] - id_break[32], id_byte[2] + rrIF2.id_implements() * id_byte[3]);
            }
            if (setting instanceof rrIz_1) {
                rrIz_1 rrIz_12 = (rrIz_1)setting;
                return new rrtH_2(rrtN_22, rrIz_12, id_break[33], id_break[34], f - id_break[35] - id_break[36], id_byte[4] + rrIz_12.id_implements() * id_byte[5]);
            }
            if (setting instanceof ButtonSetting) {
                ButtonSetting buttonSetting = (ButtonSetting)setting;
                return new rrty_3(rrtN_22, buttonSetting, id_break[37], id_break[38], f - id_break[39] - id_break[40], id_break[41]);
            }
        }
        return null;
    }

    private static void id_break() {
        id_byte = new byte[]{20, 9, 22, 9, 20, 9};
    }

    private static /* synthetic */ void ntfClinit() {
        rrtZ_2.id_class();
        rrtZ_2.id_byte();
        rrtZ_2.id_break();
    }
}

