/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_class;
import celestial.Pv_1;
import celestial.rrAM;
import celestial.rrFJ;
import celestial.rrFK;
import celestial.rrLf_1;
import celestial.rrtN_2;
import celestial.rrtu_3;
import celestial.rrvV;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFM
extends Pv_1 {
    private static short[] id_break;

    public rrFM(C_class c_class) {
        super(c_class);
    }

    static {
        rrFM.id_class();
    }

    @Override
    public void id_class(rrAM rrAM2) {
        for (rrtN_2 rrtN_22 : ((rrtu_3)rrvV.id_break[id_break[1]]).id_class()) {
            if (!(rrtN_22 instanceof rrFJ)) continue;
            rrFJ rrFJ2 = (rrFJ)rrtN_22;
            rrFJ2.id_class(rrAM2);
            break;
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x123ABEA2;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x516B67828D415DD9L;
    }

    @Override
    public void id_class(rrLf_1 rrLf_12) {
        for (rrtN_2 rrtN_22 : ((rrtu_3)rrvV.id_break[id_break[0]]).id_class()) {
            if (!(rrtN_22 instanceof rrFJ)) continue;
            rrFJ rrFJ2 = (rrFJ)rrtN_22;
            rrFJ2.id_class(rrLf_12);
            break;
        }
    }

    @Override
    public void id_class(rrFK rrFK2) {
        for (rrtN_2 rrtN_22 : ((rrtu_3)rrvV.id_break[id_break[2]]).id_class()) {
            if (!(rrtN_22 instanceof rrFJ)) continue;
            rrFJ rrFJ2 = (rrFJ)rrtN_22;
            rrFJ2.id_class(rrFK2);
            break;
        }
    }

    private static void id_class() {
        id_break = new short[3];
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-73, 107, 6, -59, -5, 103, 112, 57}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }
}

