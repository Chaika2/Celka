/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Y;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.gm_3;
import celestial.module.movement.Speed;
import celestial.q_1;
import celestial.rjU_2;
import celestial.rqr_3;
import celestial.rrTF;
import celestial.rrfo_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrls_3
extends rrTF<Speed> {
    private static float[] id_class;
    private static short[] id_break;
    private static double[] id_byte;

    private static void id_byte() {
        id_byte = new double[2];
    }

    public rrls_3(Speed speed) {
        super(speed);
    }

    static {
        rrls_3.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{120, 110, 126, 76, 126, 90, 3, 11}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @EventTarget
    public void id_class(q_1 q_12) {
        if (q_12.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_break[0]])) {
            if (((cb_3)rrls_3.id_import.id_class[id_break[1]]).Y() || ((cb_3)rrls_3.id_import.id_class[id_break[2]]).Pe() || ((cb_3)rrls_3.id_import.id_class[id_break[3]]).o_() || ((cb_3)rrls_3.id_import.id_class[id_break[4]]).PZ()) {
                return;
            }
            if (((cb_3)rrls_3.id_import.id_class[id_break[5]]).BL() && !((rqr_3)((cb_3)rrls_3.id_import.id_class[rrls_3.id_break[6]]).id_break[rrls_3.id_break[7]]).id_private) {
                ((cb_3)rrls_3.id_import.id_class[id_break[8]]).sl();
                return;
            }
            rjU_2 rjU_22 = ((cb_3)rrls_3.id_import.id_class[id_break[9]]).rv();
            if (!((cb_3)rrls_3.id_import.id_class[id_break[10]]).BL() && rrfo_3.id_byte() && !((gm_3)rrls_3.id_import.id_class[id_break[11]]).a_((cb_3)rrls_3.id_import.id_class[id_break[12]], ((cb_3)rrls_3.id_import.id_class[id_break[13]]).rN().id_protected(id_byte[0], rjU_22.id_byte, id_byte[1]))) {
                float f = id_class[0];
                rjU_22.id_break *= (double)f;
                rjU_22.id_protected *= (double)f;
            }
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x77844E21;
    }

    private static void id_class() {
        short[] sArray = new short[14];
        sArray[1] = 57;
        sArray[2] = 57;
        sArray[3] = 57;
        sArray[4] = 57;
        sArray[5] = 57;
        sArray[6] = 57;
        sArray[7] = 17;
        sArray[8] = 57;
        sArray[9] = 57;
        sArray[10] = 57;
        sArray[11] = 56;
        sArray[12] = 57;
        sArray[13] = 57;
        id_break = sArray;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x2CAFA8F4751AAB22L;
    }

    private static void id_break() {
        id_class = new float[]{2.0f};
    }

    private static /* synthetic */ void ntfClinit() {
        rrls_3.id_class();
        rrls_3.id_byte();
        rrls_3.id_break();
    }
}

