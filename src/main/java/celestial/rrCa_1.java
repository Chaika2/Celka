/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Y;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.module.movement.NoSlow;
import celestial.q_1;
import celestial.rhz_3;
import celestial.rpm_3;
import celestial.rrAA;
import celestial.rrAB;
import celestial.rrAl_1;
import celestial.rrTF;
import celestial.rrfo_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrCa_1
extends rrTF<NoSlow> {
    private static short[] id_break;
    private static float[] id_byte;
    private static byte[] id_protected;
    private static boolean[] id_case;
    public Object[] id_class;

    private static void id_byte() {
        boolean[] blArray = new boolean[22];
        blArray[0] = true;
        blArray[1] = true;
        blArray[2] = true;
        blArray[3] = true;
        blArray[6] = true;
        blArray[7] = true;
        blArray[9] = true;
        blArray[10] = true;
        blArray[11] = true;
        blArray[18] = true;
        id_case = blArray;
    }

    public rrCa_1(NoSlow noSlow) {
        super(noSlow);
        this.id_break();
        Integer n = id_protected[0];
        this.id_class[rrCa_1.id_break[0]] = n;
    }

    static {
        rrCa_1.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{83, 109, -35, 11, -83, 49, -108, 70}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x446256CA;
    }

    @EventTarget
    public void id_class(q_1 q_12) {
        this.id_break();
        if (q_12.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_break[5]])) {
            if (((Boolean)this.id_class[id_break[6]]).booleanValue()) {
                rrCa_1 rrCa_12 = this;
                int n = (Integer)rrCa_12.id_class[id_break[7]] + id_case[2];
                Integer n2 = n;
                rrCa_12.id_class[rrCa_1.id_break[8]] = n2;
                if (n > id_protected[1]) {
                    Integer n3 = ((rhz_3)((cb_3)rrCa_1.id_import.id_class[rrCa_1.id_break[9]]).id_implements[rrCa_1.id_break[10]]).id_protected;
                    this.id_class[rrCa_1.id_break[11]] = n3;
                    rrfo_3.id_class(((rhz_3)((cb_3)rrCa_1.id_import.id_class[rrCa_1.id_break[12]]).id_implements[rrCa_1.id_break[13]]).id_protected % id_protected[2] + id_case[3]);
                    Integer n4 = id_case[4];
                    this.id_class[rrCa_1.id_break[14]] = n4;
                    Boolean bl = id_case[5];
                    this.id_class[rrCa_1.id_break[15]] = bl;
                }
            }
            if ((Integer)this.id_class[id_break[16]] != id_protected[3]) {
                rrCa_1 rrCa_13 = this;
                int n = (Integer)rrCa_13.id_class[id_break[17]] + id_case[6];
                Integer n5 = n;
                rrCa_13.id_class[rrCa_1.id_break[18]] = n5;
                if (n > id_case[7]) {
                    rrfo_3.id_class((Integer)this.id_class[id_break[19]]);
                    Integer n6 = id_protected[4];
                    this.id_class[rrCa_1.id_break[20]] = n6;
                    Integer n7 = id_case[8];
                    this.id_class[rrCa_1.id_break[21]] = n7;
                }
            }
        }
    }

    @EventTarget
    public void id_class(rrAA rrAA2) {
        this.id_break();
        if (rrAA2.id_protected() == rpm_3.OFF_HAND && rrAA2.id_class().id_class().id_byte()) {
            Boolean bl = id_case[0];
            this.id_class[rrCa_1.id_break[1]] = bl;
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x419A26AE26AB8B6EL;
    }

    private boolean id_class() {
        if (((cb_3)rrCa_1.id_import.id_class[id_break[28]]).P() == rpm_3.OFF_HAND && ((cb_3)rrCa_1.id_import.id_class[id_break[29]]).Sw() < id_protected[6]) {
            return id_case[10];
        }
        return ((cb_3)rrCa_1.id_import.id_class[id_break[30]]).P() == rpm_3.MAIN_HAND && !((cb_3)rrCa_1.id_import.id_class[id_break[31]]).PZ() ? id_case[11] : id_case[12];
    }

    @EventTarget
    public void id_class(rrAB rrAB2) {
        if (((cb_3)rrCa_1.id_import.id_class[id_break[22]]).P() == rpm_3.MAIN_HAND && ((cb_3)rrCa_1.id_import.id_class[id_break[23]]).PZ()) {
            return;
        }
        if (this.id_class()) {
            this.id_break(rrAB2);
            return;
        }
        rrAB2.id_class(id_case[9]);
    }

    @EventTarget
    public void id_class(rrAl_1 rrAl_12) {
        this.id_break();
        if (rrAl_12.id_class() < id_byte[0] && ((cb_3)rrCa_1.id_import.id_class[id_break[2]]).id_return() && ((cb_3)rrCa_1.id_import.id_class[id_break[3]]).P() == rpm_3.OFF_HAND) {
            Boolean bl = id_case[1];
            this.id_class[rrCa_1.id_break[4]] = bl;
        }
    }

    private float id_class(float f) {
        return ((cb_3)rrCa_1.id_import.id_class[id_break[32]]).Sw() < id_protected[7] ? id_byte[5] : f;
    }

    private void id_break(rrAB rrAB2) {
        if (((cb_3)rrCa_1.id_import.id_class[id_break[24]]).Se() < id_protected[5] || !((cb_3)rrCa_1.id_import.id_class[id_break[25]]).BL()) {
            rrAB2.id_break(id_byte[1]);
        } else {
            float f = ((Float)((cb_3)rrCa_1.id_import.id_class[rrCa_1.id_break[26]]).id_private[id_break[27]]).floatValue() == id_byte[2] ? id_byte[3] : id_byte[4];
            rrAB2.id_break(this.id_class(f));
        }
    }

    private void id_break() {
        if (this.id_class == null) {
            this.id_class = new Object[4];
            this.id_class[0] = false;
            this.id_class[1] = 0;
            this.id_class[2] = 0;
            this.id_class[3] = 0;
        }
    }

    private static void id_throws() {
        id_protected = new byte[]{-1, 3, 8, -1, -1, 2, 2, 2, -1, 4, 2, 3};
    }

    private static /* synthetic */ void ntfClinit() {
        rrCa_1.id_byte();
        rrCa_1.id_protected();
        rrCa_1.id_case();
        rrCa_1.id_throws();
    }

    private static void id_case() {
        float[] fArray = new float[6];
        fArray[0] = 10.0f;
        fArray[1] = 0.205f;
        fArray[3] = 0.538f;
        fArray[4] = 0.38f;
        fArray[5] = 0.2f;
        id_byte = fArray;
    }

    private static void id_protected() {
        short[] sArray = new short[37];
        sArray[0] = 2;
        sArray[2] = 57;
        sArray[3] = 57;
        sArray[7] = 1;
        sArray[8] = 1;
        sArray[9] = 57;
        sArray[10] = 1;
        sArray[11] = 2;
        sArray[12] = 57;
        sArray[13] = 1;
        sArray[14] = 1;
        sArray[16] = 2;
        sArray[17] = 3;
        sArray[18] = 3;
        sArray[19] = 2;
        sArray[20] = 2;
        sArray[21] = 3;
        sArray[22] = 57;
        sArray[23] = 57;
        sArray[24] = 57;
        sArray[25] = 57;
        sArray[26] = 57;
        sArray[27] = 42;
        sArray[28] = 57;
        sArray[29] = 57;
        sArray[30] = 57;
        sArray[31] = 57;
        sArray[32] = 57;
        sArray[34] = 1;
        sArray[35] = 3;
        sArray[36] = 2;
        id_break = sArray;
    }

    @Override
    public boolean aK_() {
        this.id_break();
        Boolean bl = id_case[13];
        this.id_class[rrCa_1.id_break[33]] = bl;
        Integer n = id_case[14];
        this.id_class[rrCa_1.id_break[34]] = n;
        Integer n2 = id_case[15];
        this.id_class[rrCa_1.id_break[35]] = n2;
        Integer n3 = id_protected[8];
        this.id_class[rrCa_1.id_break[36]] = n3;
        return super.aK_();
    }
}

