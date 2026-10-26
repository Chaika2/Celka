/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.manager.FontManager;
import celestial.rrZF;
import celestial.rrfD_2;
import celestial.rrtN_2;
import celestial.util.ColorHelper;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvg_1 {
    private static boolean[] id_class;
    private static short[] id_break;
    private static float[] id_byte;

    private static void id_byte() {
        float[] fArray = new float[9];
        fArray[0] = 225.0f;
        fArray[2] = 90.0f;
        fArray[3] = 270.0f;
        fArray[4] = 180.0f;
        fArray[5] = 2.0f;
        fArray[6] = 1.0f;
        fArray[7] = 2.0f;
        fArray[8] = 255.0f;
        id_byte = fArray;
    }

    static {
        rrvg_1.ntfClinit();
    }

    private static void id_class(rrtN_2 rrtN_22, Ml_1 ml_1, float f, float f2) {
        float f3 = rrtN_22.id_long();
        int n = (int)(id_byte[0] * f3);
        int n2 = ColorHelper.id_class(id_byte[1], n);
        int n3 = ColorHelper.id_class(id_byte[2], n);
        int n4 = ColorHelper.id_class(id_byte[3], n);
        int n5 = ColorHelper.id_class(id_byte[4], n);
        float f4 = rrtN_22.id_implements();
        float f5 = rrtN_22.ao_();
        rrfD_2.id_class(ml_1, f, f2, f4, f5, n, n2, n3, n4, n5, id_class[0]);
        ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_break[0]]).id_protected().id_byte(ml_1, rrtN_22.id_byte(), f + f4 / id_byte[5] + id_byte[6], f2 + id_byte[7], ColorHelper.id_break(rrZF.d_, (int)(id_byte[8] * f3)), id_class[1]);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xE14EE0FC;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x461ED5B011CD42AFL;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{74, 54, -25, 90, -89, -96, -15, 30}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static void id_class(rrtN_2 rrtN_22, Ml_1 ml_1, Runnable runnable) {
        rrvg_1.id_class(rrtN_22, ml_1, rrtN_22.id_default(), rrtN_22.id_abstract());
        runnable.run();
    }

    private static void id_class() {
        id_break = new short[1];
    }

    private static void id_break() {
        boolean[] blArray = new boolean[2];
        blArray[0] = true;
        id_class = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrvg_1.id_break();
        rrvg_1.id_byte();
        rrvg_1.id_class();
    }
}

