/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.tuple.Pair
 */
package celestial;

import celestial.Ml_1;
import celestial.rrZl_1;
import celestial.rrtu_3;
import celestial.rrvJ;
import celestial.util.AnimValue;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class rrvx_1 {
    private static float[] id_break;
    private static boolean[] id_byte;
    private static short[] id_protected;
    public Object[] id_class;

    private static void id_byte() {
        id_break = new float[]{0.55f, 1.0f};
    }

    public rrvx_1() {
        this.id_break();
        AnimValue animValue = new AnimValue(id_break[0], id_byte[0]);
        this.id_class[rrvx_1.id_protected[0]] = animValue;
    }

    static {
        rrvx_1.ntfClinit();
    }

    public void id_class(Runnable runnable, Ml_1 ml_1, float f, float f2, float f3, float f4) {
        rrvJ.id_class(ml_1, f, f2, (int)f3, (int)f4);
        runnable.run();
        rrvJ.id_final();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x7F9EBD40;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x10E7818EDD0F1F44L;
    }

    public void id_class(Ml_1 ml_1, rrZl_1 rrZl_12, rrtu_3 rrtu_32, float f, float f2, int n, int n2, float f3, float f4, float f5, int n3, boolean bl) {
        int n4;
        AnimValue animValue = rrZl_12.id_package();
        float f6 = ((AnimValue)this.id_class[id_protected[1]]).id_byte();
        if (!rrZl_12.id_int() && f6 < id_break[1]) {
            int n5 = n4 = f5 > f4 ? id_byte[1] : id_byte[2];
            if (n4 != 0) {
                animValue.id_class();
            } else {
                animValue.id_extends();
            }
        }
        n4 = rrZl_12.id_int() ? (int)((float)n3 * f6) : (int)((float)n3 * animValue.id_byte() * f6);
        rrZl_12.id_class(ml_1, rrtu_32, f, f2, n, n2, f3, f5, f4, bl, n4);
    }

    public AnimValue id_class() {
        return (AnimValue)this.id_class[id_protected[2]];
    }

    public Pair<Float, Boolean> id_class(rrZl_1 rrZl_12) {
        AnimValue animValue = rrZl_12.id_package();
        return Pair.of((Object)Float.valueOf(animValue.id_byte()), (Object)animValue.id_case());
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{27, 27, -21, 73, 76, 24, -78, -35}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private void id_break() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[3]];
        }
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[4];
        blArray[0] = true;
        blArray[1] = true;
        blArray[3] = true;
        id_byte = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrvx_1.id_throws();
        rrvx_1.id_byte();
        rrvx_1.id_protected();
    }

    private static void id_protected() {
        id_protected = new short[3];
    }
}

