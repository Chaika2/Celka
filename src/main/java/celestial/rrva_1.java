/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_class;
import celestial.Pv_1;
import celestial.rrAM;
import celestial.rrtN_2;
import celestial.rrtu_3;
import celestial.rrvV;
import celestial.rrvi_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrva_1
extends Pv_1 {
    private static short[] id_break;

    public rrva_1(C_class c_class) {
        super(c_class);
    }

    static {
        rrva_1.id_class();
    }

    private static void id_class() {
        id_break = new short[1];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x48E87125;
    }

    @Override
    public void id_class(rrAM rrAM2) {
        for (rrtN_2 rrtN_22 : ((rrtu_3)rrvV.id_break[id_break[0]]).id_class()) {
            if (!(rrtN_22 instanceof rrvi_1)) continue;
            rrvi_1 rrvi_12 = (rrvi_1)rrtN_22;
            rrvi_12.id_class(rrAM2);
            break;
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x46C092012F8377F1L;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-2, 5, -59, 9, 60, -88, -55, 84}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }
}

