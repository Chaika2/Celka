/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_class;
import celestial.D;
import celestial.Ml_1;
import celestial.T;
import celestial.bj_3;
import celestial.by_3;
import celestial.rY_2;
import celestial.rfl_3;
import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bp_3
implements D,
bj_3 {
    private static short[] id_catch;
    private static double[] id_private;
    public static Object[] id_class;
    private static boolean[] id_implements;
    public Object[] id_break;

    private void id_byte() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_implements[9]];
        }
    }

    public bp_3(C_class c_class, by_3 by_32) {
        this.id_byte();
        by_3 by_33 = by_32;
        this.id_break[bp_3.id_catch[0]] = by_33;
        c_class.s().id_class(this);
    }

    static {
        bp_3.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x6672D23324063233L;
    }

    public static void id_class(Ml_1 ml_1, rY_2[] rY_2Array) {
        rY_2 rY_22;
        int n;
        float f = ((Float)bp_3.id_protected.id_super.id_class[id_catch[1]]).floatValue();
        boolean bl = (Boolean)bp_3.id_protected.id_package.id_class[id_catch[2]];
        float f2 = ((Float)bp_3.id_protected.PT.id_class[id_catch[3]]).floatValue();
        if (!((Boolean)bp_3.id_protected.J.id_class[id_catch[4]]).booleanValue()) {
            return;
        }
        bj_3.id_class((Color)bp_3.id_protected.id_try.id_class[id_catch[5]], f, f2, bl);
        rY_2[] rY_2Array2 = rY_2Array;
        int n2 = rY_2Array2.length;
        for (n = id_implements[0]; n < n2; ++n) {
            rY_22 = rY_2Array2[n];
            bj_3.id_class(ml_1, rY_22.id_break(), id_private[0]);
        }
        if (((Boolean)bp_3.id_protected.Pw.id_class[id_catch[6]]).booleanValue()) {
            bj_3.id_class((Color)bp_3.id_protected.id_short.id_class[id_catch[7]], f);
            rY_2Array2 = rY_2Array;
            n2 = rY_2Array2.length;
            for (n = id_implements[1]; n < n2; ++n) {
                rY_22 = rY_2Array2[n];
                bj_3.id_class(ml_1, new rfl_3(rY_22.id_byte(), rY_22.id_byte().id_class(id_implements[2], id_implements[3], id_implements[4])));
            }
            bj_3.id_class((Color)bp_3.id_protected.id_float.id_class[id_catch[8]], f);
            rY_2Array2 = rY_2Array;
            n2 = rY_2Array2.length;
            for (n = id_implements[5]; n < n2; ++n) {
                rY_22 = rY_2Array2[n];
                bj_3.id_class(ml_1, new rfl_3(rY_22.id_case(), rY_22.id_case().id_class(id_implements[6], id_implements[7], id_implements[8])));
            }
        }
        bj_3.id_class(bl);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xBCFFEFEB;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-105, 49, -43, 123, -67, 100, -2, 65}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        id_catch = new short[10];
    }

    @Override
    public void id_class(T t) {
        bp_3.id_class(t.id_byte(), ((by_3)this.id_break[id_catch[9]]).id_byte());
    }

    private static void id_break() {
        boolean[] blArray = new boolean[12];
        blArray[2] = true;
        blArray[3] = true;
        blArray[4] = true;
        blArray[6] = true;
        blArray[7] = true;
        blArray[8] = true;
        blArray[9] = true;
        blArray[10] = true;
        id_implements = blArray;
    }

    private static void id_throws() {
        Object[] objectArray = new Object[]{0.005};
        id_class = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        bp_3.id_break();
        bp_3.id_class();
        bp_3.id_protected();
        bp_3.id_throws();
    }

    private static void id_protected() {
        id_private = new double[]{0.005, 0.005};
    }
}

