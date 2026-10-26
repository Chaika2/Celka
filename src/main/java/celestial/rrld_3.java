/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.module.movement.WaterSpeed;
import celestial.rmD_2;
import celestial.rmU_2;
import celestial.rqr_3;
import celestial.rrAB;
import celestial.rrAo_1;
import celestial.rrIa_1;
import celestial.rrIi_1;
import celestial.rrLZ;
import celestial.rrLj_1;
import celestial.rrLk_1;
import celestial.rrLz_1;
import celestial.rrTF;
import celestial.rrfj_3;
import celestial.rrfo_3;
import celestial.ruS_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrld_3
extends rrTF<WaterSpeed> {
    private static byte[] id_break;
    private static double[] id_byte;
    private static short[] id_protected;
    private static float[] id_case;
    public Object[] id_class;
    private static boolean[] id_catch;

    private static void id_byte() {
        short[] sArray = new short[28];
        sArray[1] = 1;
        sArray[2] = 57;
        sArray[3] = 57;
        sArray[4] = 57;
        sArray[5] = 23;
        sArray[6] = 57;
        sArray[9] = 57;
        sArray[10] = 17;
        sArray[11] = 57;
        sArray[12] = 17;
        sArray[13] = 1;
        sArray[15] = 1;
        sArray[16] = 57;
        sArray[17] = 41;
        sArray[18] = 57;
        sArray[19] = 42;
        sArray[20] = 57;
        sArray[21] = 44;
        sArray[24] = 1;
        sArray[25] = 57;
        sArray[27] = 1;
        id_protected = sArray;
    }

    public rrld_3(WaterSpeed waterSpeed) {
        super(waterSpeed);
        this.id_throws();
        rrIa_1 rrIa_12 = new rrIa_1();
        this.id_class[rrld_3.id_protected[0]] = rrIa_12;
    }

    static {
        rrld_3.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x738FD14D57FE39B4L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-7, -66, 119, 64, -68, 12, -46, -114}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @EventTarget
    public void id_class(rrLj_1 rrLj_12) {
        this.id_throws();
        if (rrLj_12.id_break() || !rrLj_12.id_class()) {
            ((rrIa_1)this.id_class[id_protected[23]]).id_class();
        }
    }

    @EventTarget
    public void id_class(rrLZ rrLZ2) {
        this.id_throws();
        ruS_2<?> ruS_22 = rrLZ2.id_class();
        if (ruS_22 instanceof rmD_2) {
            rmD_2 rmD_22 = (rmD_2)ruS_22;
            if (rmD_22.id_break() == rmU_2.STOP_SPRINTING) {
                rrLZ2.id_class(id_catch[3]);
            } else if (rmD_22.id_break() == rmU_2.RELEASE_SHIFT_KEY && ((Float)((cb_3)rrld_3.id_import.id_class[rrld_3.id_protected[18]]).id_private[id_protected[19]]).floatValue() != id_case[2] && ((Float)((cb_3)rrld_3.id_import.id_class[rrld_3.id_protected[20]]).id_private[id_protected[21]]).floatValue() == id_case[3]) {
                ((rrIa_1)this.id_class[id_protected[22]]).id_class();
            }
        }
    }

    @EventTarget
    public void id_class(rrLk_1 rrLk_12) {
        rrLk_12.id_class(id_byte[6]);
    }

    @EventTarget
    public void id_class(rrLz_1 rrLz_12) {
        this.id_throws();
        Boolean bl = id_catch[0];
        this.id_class[rrld_3.id_protected[1]] = bl;
        float f = rrIi_1.id_class(this.id_case());
        float f2 = rrfj_3.id_class();
        boolean bl2 = rrfo_3.id_break(id_catch[1]);
        if (((cb_3)rrld_3.id_import.id_class[id_protected[2]]).PZ() && (((cb_3)rrld_3.id_import.id_class[id_protected[3]]).Pj() || bl2)) {
            if (((Boolean)((cb_3)rrld_3.id_import.id_class[rrld_3.id_protected[4]]).id_throws[id_protected[5]]).booleanValue()) {
                return;
            }
            if (bl2 && f2 == id_case[0] && !((cb_3)rrld_3.id_import.id_class[id_protected[6]]).Pj()) {
                rrLz_12.id_catch().id_byte = id_byte[0];
            }
            if (!rrfj_3.id_catch()) {
                ((rrIa_1)this.id_class[id_protected[7]]).id_class();
            }
            rrLz_12.id_class(((rrIa_1)this.id_class[id_protected[8]]).id_class(f, id_case[1]));
            rrLz_12.id_catch().id_byte = rrLz_12.id_catch().id_byte + (((rqr_3)((cb_3)rrld_3.id_import.id_class[rrld_3.id_protected[9]]).id_break[rrld_3.id_protected[10]]).id_implements ? id_byte[1] : (((rqr_3)((cb_3)rrld_3.id_import.id_class[rrld_3.id_protected[11]]).id_break[rrld_3.id_protected[12]]).id_private ? id_byte[2] : id_byte[3]));
            Boolean bl3 = id_catch[2];
            this.id_class[rrld_3.id_protected[13]] = bl3;
        } else {
            ((rrIa_1)this.id_class[id_protected[14]]).id_class();
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x5A12ABB4;
    }

    @EventTarget
    public void id_class(rrAo_1 rrAo_12) {
        this.id_throws();
        if (((Boolean)this.id_class[id_protected[15]]).booleanValue()) {
            rrAo_12.id_protected(rrAo_12.id_catch() + ((Integer)((cb_3)rrld_3.id_import.id_class[rrld_3.id_protected[16]]).id_throws[id_protected[17]] % id_break[0] == 0 ? id_byte[4] : id_byte[5]));
        }
    }

    private static void id_class() {
        boolean[] blArray = new boolean[8];
        blArray[1] = true;
        blArray[2] = true;
        blArray[3] = true;
        blArray[6] = true;
        id_catch = blArray;
    }

    @EventTarget
    public void id_class(rrAB rrAB2) {
        this.id_throws();
        if (((Boolean)this.id_class[id_protected[24]]).booleanValue()) {
            rrAB2.id_class(id_catch[4]);
        }
    }

    private static void id_break() {
        id_break = new byte[]{2, 2};
    }

    private void id_throws() {
        if (this.id_class == null) {
            this.id_class = new Object[2];
            this.id_class[1] = false;
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrld_3.id_class();
        rrld_3.id_byte();
        rrld_3.id_private();
        rrld_3.id_protected();
        rrld_3.id_break();
    }

    private float id_case() {
        if (((cb_3)rrld_3.id_import.id_class[id_protected[25]]).BL()) {
            return id_case[4];
        }
        return id_case[5];
    }

    private static void id_protected() {
        double[] dArray = new double[7];
        dArray[1] = -0.2f;
        dArray[2] = 0.06f;
        dArray[4] = 0.02;
        dArray[5] = 0.001;
        id_byte = dArray;
    }

    private static void id_private() {
        float[] fArray = new float[6];
        fArray[1] = 0.15f;
        fArray[4] = 0.29f;
        fArray[5] = 0.67f;
        id_case = fArray;
    }

    @Override
    public boolean aK_() {
        this.id_throws();
        ((rrIa_1)this.id_class[id_protected[26]]).id_class();
        Boolean bl = id_catch[5];
        this.id_class[rrld_3.id_protected[27]] = bl;
        return super.aK_();
    }
}

