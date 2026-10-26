/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Aw_1;
import celestial.aI_2;
import celestial.an_3;
import celestial.cG_2;
import celestial.cb_3;
import celestial.rrZW;
import celestial.rrjZ_2;
import celestial.setting.CheckGroup;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrff_3
implements MinecraftAccessor {
    private static boolean[] id_class;
    private static short[] id_break;

    static {
        rrff_3.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-10, 64, -42, 30, -86, -14, -76, -14}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x97CA72B5;
    }

    public static boolean id_class(cG_2 cG_22) {
        return cG_22 != (cb_3)rrff_3.id_import.id_class[id_break[1]] && !cG_22.sc() && !((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[id_break[2]]).id_class(cG_22) && cG_22.Pu() ? id_class[3] : id_class[4];
    }

    public static boolean id_class(an_3 an_32) {
        return an_32.BC().id_catch();
    }

    public static boolean id_class(Aw_1 aw_1) {
        return !aw_1.id_class().equals((Object)((cb_3)rrff_3.id_import.id_class[id_break[3]]).sv()) && !aw_1.id_super() && !((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[id_break[4]]).id_class(aw_1) ? id_class[5] : id_class[6];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xE8CA90118AA85FF7L;
    }

    private static void id_class() {
        boolean[] blArray = new boolean[7];
        blArray[1] = true;
        blArray[3] = true;
        blArray[5] = true;
        id_class = blArray;
    }

    public static boolean id_class(an_3 an_32, CheckGroup checkGroup) {
        if (!checkGroup.id_catch() && an_32.Pp()) {
            return id_class[0];
        }
        if (an_32.BC() == aI_2.id_short) {
            return checkGroup.id_class();
        }
        if (an_32.BC() == aI_2.f) {
            return checkGroup.id_extends();
        }
        if (an_32.BC().id_case()) {
            if (an_32 instanceof cG_2) {
                cG_2 cG_22 = (cG_2)an_32;
                if (((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[id_break[0]]).id_class(cG_22)) {
                    return checkGroup.id_implements();
                }
                if (checkGroup.id_throws()) {
                    if (cG_22.sc()) {
                        return checkGroup.id_private();
                    }
                    if (!rrjZ_2.id_byte(cG_22)) {
                        return checkGroup.id_finally();
                    }
                    return id_class[1];
                }
            } else {
                if (rrjZ_2.id_class(an_32)) {
                    return checkGroup.id_break();
                }
                if (rrjZ_2.id_break(an_32)) {
                    return checkGroup.id_case();
                }
            }
        }
        return id_class[2];
    }

    private static void id_break() {
        short[] sArray = new short[5];
        sArray[1] = 57;
        sArray[3] = 57;
        id_break = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrff_3.id_class();
        rrff_3.id_break();
    }
}

