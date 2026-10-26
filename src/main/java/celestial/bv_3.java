/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.bL_2;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rfl_3;
import celestial.rpr_3;
import celestial.rrki_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class bv_3 {
    private static byte[] id_break;
    private static boolean[] id_byte;
    public Object[] id_class;
    private static short[] id_protected;

    public bL_2 id_byte() {
        return (bL_2)this.id_class[id_protected[16]];
    }

    public bv_3(rfl_3 rfl_32, bL_2[] bL_2Array, int n) {
        bL_2[] bL_2Array2;
        this.id_extends();
        Integer n2 = n;
        this.id_class[bv_3.id_protected[0]] = n2;
        this.id_class[bv_3.id_protected[1]] = bL_2Array2 = bL_2Array;
        Integer n3 = bL_2Array.length;
        this.id_class[bv_3.id_protected[2]] = n3;
        bL_2 bL_22 = bL_2Array[id_byte[0]];
        this.id_class[bv_3.id_protected[3]] = bL_22;
        bL_2 bL_23 = bL_2Array[bL_2Array.length - id_byte[1]];
        this.id_class[bv_3.id_protected[4]] = bL_23;
        rfl_3 rfl_33 = rfl_32;
        this.id_class[bv_3.id_protected[5]] = rfl_33;
    }

    static {
        bv_3.ntfClinit();
    }

    public int id_class() {
        return (Integer)this.id_class[id_protected[14]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xFC2F22CA;
    }

    public boolean id_class(rYB rYB2, rfH_2 rfH_22) {
        return this.id_class(rYB2, rfH_22, null);
    }

    public int id_class(rfH_2 rfH_22) {
        if (rfH_22 == null || this.id_catch()) {
            return id_break[0];
        }
        for (int i = id_byte[19]; i < ((bL_2[])this.id_class[id_protected[11]]).length; ++i) {
            if (!((bL_2[])this.id_class[id_protected[12]])[i].equals(rfH_22)) continue;
            return i;
        }
        return id_break[1];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{93, -76, 49, 60, -46, 62, -77, 8}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public boolean id_class(rYB rYB2, rpr_3 rpr_32) {
        bL_2[] bL_2Array = (bL_2[])this.id_class[id_protected[7]];
        int n = bL_2Array.length;
        for (int i = id_byte[5]; i < n; ++i) {
            bL_2 bL_22 = bL_2Array[i];
            if (!rYB2.id_finally(bL_22.id_byte(rpr_32))) continue;
            return id_byte[6];
        }
        return id_byte[7];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x92AAA618048308F7L;
    }

    public boolean id_class(rYB rYB2) {
        bL_2[] bL_2Array = (bL_2[])this.id_class[id_protected[6]];
        int n = bL_2Array.length;
        for (int i = id_byte[2]; i < n; ++i) {
            bL_2 bL_22 = bL_2Array[i];
            if (!rYB2.id_finally(bL_22)) continue;
            return id_byte[3];
        }
        return id_byte[4];
    }

    public boolean id_class(rYB rYB2, rfH_2 rfH_22, rpr_3 rpr_32) {
        bL_2[] bL_2Array = (bL_2[])this.id_class[id_protected[9]];
        int n = bL_2Array.length;
        for (int i = id_byte[11]; i < n; ++i) {
            bL_2 bL_22 = bL_2Array[i];
            if (!bL_22.equals(rfH_22)) continue;
            if (rpr_32 != null) {
                bL_22 = bL_22.id_byte(rpr_32);
            }
            return !rYB2.id_finally(bL_22) ? id_byte[12] : id_byte[13];
        }
        return id_byte[14];
    }

    public boolean id_break(rfH_2 rfH_22) {
        if (rfH_22 == null || this.id_catch()) {
            return id_byte[15];
        }
        bL_2[] bL_2Array = (bL_2[])this.id_class[id_protected[10]];
        int n = bL_2Array.length;
        for (int i = id_byte[16]; i < n; ++i) {
            bL_2 bL_22 = bL_2Array[i];
            if (!bL_22.equals(rfH_22)) continue;
            return id_byte[17];
        }
        return id_byte[18];
    }

    public boolean id_break(rYB rYB2, rfH_2 rfH_22) {
        bL_2[] bL_2Array = (bL_2[])this.id_class[id_protected[8]];
        int n = bL_2Array.length;
        for (int i = id_byte[8]; i < n; ++i) {
            bL_2 bL_22 = bL_2Array[i];
            if (!rYB2.id_finally(bL_22.id_class(rfH_22))) continue;
            return id_byte[9];
        }
        return id_byte[10];
    }

    public rfl_3 id_break() {
        return (rfl_3)this.id_class[id_protected[18]];
    }

    public bL_2[] id_throws() {
        return (bL_2[])this.id_class[id_protected[15]];
    }

    private static /* synthetic */ void ntfClinit() {
        bv_3.id_implements();
        bv_3.id_private();
        bv_3.id_finally();
    }

    private static void id_finally() {
        id_break = new byte[]{-1, -1, 6, 5};
    }

    public boolean id_catch() {
        return rrki_1.id_break((bL_2[])this.id_class[id_protected[13]]);
    }

    private void id_extends() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[2]];
            objectArray[bv_3.id_byte[20]] = id_byte[21];
            objectArray[bv_3.id_break[3]] = id_byte[22];
        }
    }

    public int id_case() {
        return (Integer)this.id_class[id_protected[19]];
    }

    private static void id_implements() {
        boolean[] blArray = new boolean[23];
        blArray[1] = true;
        blArray[4] = true;
        blArray[7] = true;
        blArray[10] = true;
        blArray[12] = true;
        blArray[17] = true;
        id_byte = blArray;
    }

    public bL_2 id_protected() {
        return (bL_2)this.id_class[id_protected[17]];
    }

    private static void id_private() {
        short[] sArray = new short[20];
        sArray[1] = 1;
        sArray[2] = 5;
        sArray[3] = 2;
        sArray[4] = 3;
        sArray[5] = 4;
        sArray[6] = 1;
        sArray[7] = 1;
        sArray[8] = 1;
        sArray[9] = 1;
        sArray[10] = 1;
        sArray[11] = 1;
        sArray[12] = 1;
        sArray[13] = 1;
        sArray[15] = 1;
        sArray[16] = 2;
        sArray[17] = 3;
        sArray[18] = 4;
        sArray[19] = 5;
        id_protected = sArray;
    }
}

