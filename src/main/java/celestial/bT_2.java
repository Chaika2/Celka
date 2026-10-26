/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_throws;
import celestial.PP;
import celestial.Ps_1;
import celestial.rff_3;
import celestial.rjG_2;
import celestial.rjM_2;
import celestial.rpm_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bT_2
implements PP {
    private static short[] id_throws;
    private static boolean[] id_case;
    public static Object[] id_class;
    public Object[] id_break;
    private static byte[] id_catch;

    private void id_byte() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_catch[0]];
            objectArray[bT_2.id_case[12]] = id_case[13];
            objectArray[bT_2.id_catch[1]] = id_case[14];
        }
    }

    public bT_2(Ps_1 ps_1) {
        this.id_byte();
        Integer n = id_case[0];
        this.id_break[bT_2.id_throws[0]] = n;
        Ps_1 ps_12 = ps_1;
        this.id_break[bT_2.id_throws[1]] = ps_12;
    }

    static {
        bT_2.ntfClinit();
    }

    public void id_class(int n) {
        Integer n2 = n;
        this.id_break[bT_2.id_throws[27]] = n2;
    }

    public void id_class(boolean bl) {
        boolean bl2;
        if ((Integer)this.id_break[id_throws[7]] > 0) {
            bT_2 bT_22 = this;
            Integer n = (Integer)bT_22.id_break[id_throws[8]] - id_case[3];
            bT_22.id_break[bT_2.id_throws[9]] = n;
            return;
        }
        rjG_2 rjG_22 = ((Ps_1)this.id_break[id_throws[10]]).id_byte();
        boolean bl3 = bl2 = rjG_22 != null && rjG_22.id_byte() == rjM_2.BLOCK ? id_case[4] : id_case[5];
        if (bl && bl2) {
            ((Ps_1)this.id_break[id_throws[11]]).id_native().id_class((Boolean)this.id_break[id_throws[12]]);
            if (((Ps_1)this.id_break[id_throws[13]]).id_native().id_protected()) {
                ((Ps_1)this.id_break[id_throws[14]]).id_native().id_class();
                ((Ps_1)this.id_break[id_throws[15]]).id_native().id_break(((rff_3)rjG_22).id_class(), ((rff_3)rjG_22).id_break());
                ((Ps_1)this.id_break[id_throws[16]]).id_catch().id_class(rpm_3.MAIN_HAND);
            } else {
                if (((Ps_1)this.id_break[id_throws[17]]).id_native().id_class(((rff_3)rjG_22).id_class(), ((rff_3)rjG_22).id_break())) {
                    ((Ps_1)this.id_break[id_throws[18]]).id_catch().id_class(rpm_3.MAIN_HAND);
                }
                if (((Ps_1)this.id_break[id_throws[19]]).id_native().id_protected()) {
                    Integer n = (Integer)C_throws.id_break().Pg.id_class[id_throws[20]] - id_case[6];
                    this.id_break[bT_2.id_throws[21]] = n;
                    ((Ps_1)this.id_break[id_throws[22]]).id_native().id_break(id_case[7]);
                }
            }
            Boolean bl4 = !((Ps_1)this.id_break[id_throws[23]]).id_native().id_protected() ? id_case[8] : id_case[9];
            this.id_break[bT_2.id_throws[24]] = bl4;
            ((Ps_1)this.id_break[id_throws[25]]).id_native().id_class(id_case[10]);
        } else {
            Boolean bl5 = id_case[11];
            this.id_break[bT_2.id_throws[26]] = bl5;
        }
    }

    public void id_class() {
        if (((Ps_1)this.id_break[id_throws[2]]).id_catch() != null && ((Boolean)this.id_break[id_throws[3]]).booleanValue()) {
            ((Ps_1)this.id_break[id_throws[4]]).id_native().id_class(id_case[1]);
            ((Ps_1)this.id_break[id_throws[5]]).id_native().id_break();
            Boolean bl = id_case[2];
            this.id_break[bT_2.id_throws[6]] = bl;
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x589799072E162C35L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-114, -17, 3, 71, 81, -91, 66, -50}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x84888FB1;
    }

    private static void id_break() {
        short[] sArray = new short[28];
        sArray[0] = 2;
        sArray[3] = 1;
        sArray[6] = 1;
        sArray[7] = 2;
        sArray[8] = 2;
        sArray[9] = 2;
        sArray[12] = 1;
        sArray[21] = 2;
        sArray[24] = 1;
        sArray[26] = 1;
        sArray[27] = 2;
        id_throws = sArray;
    }

    private static void id_throws() {
        Object[] objectArray = new Object[]{1};
        id_class = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        bT_2.id_protected();
        bT_2.id_break();
        bT_2.id_case();
        bT_2.id_throws();
    }

    private static void id_case() {
        id_catch = new byte[]{3, 2};
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[18];
        blArray[3] = true;
        blArray[4] = true;
        blArray[6] = true;
        blArray[8] = true;
        blArray[12] = true;
        blArray[15] = true;
        blArray[17] = true;
        id_case = blArray;
    }
}

