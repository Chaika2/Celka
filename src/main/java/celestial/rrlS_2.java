/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Aq_1;
import celestial.Y;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.module.movement.Speed;
import celestial.q_1;
import celestial.rmg_3;
import celestial.rqr_3;
import celestial.rqw_3;
import celestial.rrLZ;
import celestial.rrTF;
import celestial.rrfw_3;
import celestial.ruS_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayDeque;
import java.util.Queue;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrlS_2
extends rrTF<Speed> {
    public Object[] id_class;
    private static short[] id_break;
    private static float[] id_byte;
    private static double[] id_protected;
    private static byte[] id_case;
    private static boolean[] id_catch;

    private static void id_byte() {
        short[] sArray = new short[29];
        sArray[1] = 1;
        sArray[3] = 2;
        sArray[4] = 2;
        sArray[5] = 57;
        sArray[6] = 17;
        sArray[7] = 57;
        sArray[8] = 57;
        sArray[9] = 2;
        sArray[10] = 6;
        sArray[11] = 6;
        sArray[12] = 2;
        sArray[13] = 160;
        sArray[14] = 2;
        sArray[15] = 1;
        sArray[17] = 1;
        sArray[18] = 57;
        sArray[21] = 1;
        sArray[22] = 57;
        sArray[23] = 6;
        sArray[24] = 2;
        sArray[25] = 1;
        sArray[26] = 57;
        sArray[28] = 1;
        id_break = sArray;
    }

    public rrlS_2(Speed speed) {
        super(speed);
        ArrayDeque arrayDeque;
        this.id_private();
        rrfw_3 rrfw_32 = new rrfw_3();
        this.id_class[rrlS_2.id_break[0]] = rrfw_32;
        this.id_class[rrlS_2.id_break[1]] = arrayDeque = new ArrayDeque();
    }

    static {
        rrlS_2.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x47A1EA417DF02ACEL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xD459B2C7;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{117, 115, -17, 100, -72, -75, 58, -3}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @EventTarget
    public void id_class(rrLZ rrLZ2) {
        this.id_private();
        ruS_2<?> ruS_22 = rrLZ2.id_class();
        if (ruS_22 instanceof rmg_3) {
            rmg_3 rmg_32 = (rmg_3)ruS_22;
            ((Queue)this.id_class[id_break[21]]).add(rmg_32);
            rrLZ2.id_class(id_catch[2]);
        }
    }

    @EventTarget
    public void id_class(q_1 q_12) {
        this.id_private();
        if (q_12.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_break[2]])) {
            rrlS_2 rrlS_22 = this;
            Integer n = (Integer)rrlS_22.id_class[id_break[3]] + id_catch[0];
            rrlS_22.id_class[rrlS_2.id_break[4]] = n;
            if (!((rqr_3)((cb_3)rrlS_2.id_import.id_class[rrlS_2.id_break[5]]).id_break[rrlS_2.id_break[6]]).id_private && ((cb_3)rrlS_2.id_import.id_class[id_break[7]]).BL()) {
                ((cb_3)rrlS_2.id_import.id_class[id_break[8]]).sl();
            }
            if ((Integer)this.id_class[id_break[9]] < id_case[0]) {
                ((rqw_3)rrlS_2.id_import.id_class[id_break[10]]).id_class(id_byte[0]);
            } else {
                ((rqw_3)rrlS_2.id_import.id_class[id_break[11]]).id_class(id_byte[1]);
            }
            if ((Integer)this.id_class[id_break[12]] > id_break[13]) {
                Integer n2 = id_catch[1];
                this.id_class[rrlS_2.id_break[14]] = n2;
            }
            if (!((Queue)this.id_class[id_break[15]]).isEmpty() && ((rrfw_3)this.id_class[id_break[16]]).id_class(id_protected[0])) {
                ruS_2 ruS_22 = (ruS_2)((Queue)this.id_class[id_break[17]]).poll();
                if (ruS_22 != null) {
                    ((Aq_1)((cb_3)rrlS_2.id_import.id_class[rrlS_2.id_break[18]]).id_break[id_break[19]]).id_break(ruS_22);
                }
                ((rrfw_3)this.id_class[id_break[20]]).id_class();
            }
        }
    }

    private static void id_class() {
        id_case = new byte[]{5, 3, 2};
    }

    private void id_break() {
        this.id_private();
        ((rqw_3)rrlS_2.id_import.id_class[id_break[23]]).id_class(id_byte[2]);
        Integer n = id_catch[3];
        this.id_class[rrlS_2.id_break[24]] = n;
        while (!((Queue)this.id_class[id_break[25]]).isEmpty()) {
            ((Aq_1)((cb_3)rrlS_2.id_import.id_class[rrlS_2.id_break[26]]).id_break[id_break[27]]).id_break((ruS_2)((Queue)this.id_class[id_break[28]]).poll());
        }
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[5];
        blArray[0] = true;
        blArray[2] = true;
        id_catch = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrlS_2.id_throws();
        rrlS_2.id_byte();
        rrlS_2.id_protected();
        rrlS_2.id_case();
        rrlS_2.id_class();
    }

    private static void id_case() {
        id_protected = new double[]{500.0};
    }

    private static void id_protected() {
        id_byte = new float[]{0.1f, 1.3f, 1.0f};
    }

    private void id_private() {
        if (this.id_class == null) {
            this.id_class = new Object[3];
            this.id_class[2] = 0;
        }
    }

    @Override
    public boolean aK_() {
        if ((cb_3)rrlS_2.id_import.id_class[id_break[22]] != null) {
            this.id_break();
        }
        return super.aK_();
    }
}

