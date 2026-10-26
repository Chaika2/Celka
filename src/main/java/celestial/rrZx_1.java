/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrZd_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZx_1 {
    private static short[] id_byte;
    public Object[] id_class;
    private static byte[] id_protected;
    public static Object[] id_break;
    private static boolean[] id_throws;

    private static void id_byte() {
        short[] sArray = new short[24];
        sArray[1] = 1;
        sArray[3] = 1;
        sArray[4] = 1;
        sArray[5] = 1;
        sArray[7] = 1;
        sArray[8] = 1;
        sArray[11] = 1;
        sArray[12] = 167;
        sArray[13] = 8470;
        sArray[14] = 183;
        sArray[15] = 169;
        sArray[16] = 187;
        sArray[17] = 171;
        sArray[18] = 1072;
        sArray[19] = 1103;
        sArray[20] = 1040;
        sArray[21] = 1071;
        sArray[22] = 1025;
        sArray[23] = 1105;
        id_byte = sArray;
    }

    public rrZx_1() {
        ArrayList arrayList;
        this.id_throws();
        this.id_class[rrZx_1.id_byte[0]] = arrayList = new ArrayList();
        Integer n = id_throws[0];
        this.id_class[rrZx_1.id_byte[1]] = n;
    }

    public rrZx_1(int n, int n2) {
        ArrayList arrayList;
        this.id_throws();
        this.id_class[rrZx_1.id_byte[2]] = arrayList = new ArrayList();
        Integer n3 = id_throws[1];
        this.id_class[rrZx_1.id_byte[3]] = n3;
        this.id_class(n, n2);
    }

    static {
        rrZx_1.ntfClinit();
    }

    public rrZx_1 id_class(rrZx_1 ... rrZx_1Array) {
        rrZx_1[] rrZx_1Array2 = rrZx_1Array;
        int n = rrZx_1Array2.length;
        for (int i = id_throws[4]; i < n; ++i) {
            rrZx_1 rrZx_12 = rrZx_1Array2[i];
            for (rrZd_1 rrZd_12 : rrZx_12.id_class()) {
                this.id_class(rrZd_12.id_break(), rrZd_12.id_class());
            }
        }
        return this;
    }

    public rrZx_1 id_class(int ... nArray) {
        int[] nArray2 = nArray;
        int n = nArray2.length;
        for (int i = id_throws[3]; i < n; ++i) {
            int n2 = nArray2[i];
            this.id_class(n2);
        }
        return this;
    }

    public rrZx_1 id_class(int n) {
        rrZx_1 rrZx_12 = this;
        Integer n2 = (Integer)rrZx_12.id_class[id_byte[7]] + id_throws[2];
        rrZx_12.id_class[rrZx_1.id_byte[8]] = n2;
        ((List)this.id_class[id_byte[9]]).add(new rrZd_1(n, n));
        return this;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-32, 27, -17, -97, -119, 70, 20, -25}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public rrZx_1 id_class(int n, int n2) {
        rrZd_1 rrZd_12 = new rrZd_1(n, n2);
        rrZx_1 rrZx_12 = this;
        Integer n3 = (Integer)rrZx_12.id_class[id_byte[4]] + rrZx_1.id_class(rrZd_12);
        rrZx_12.id_class[rrZx_1.id_byte[5]] = n3;
        ((List)this.id_class[id_byte[6]]).add(rrZd_12);
        return this;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xE2FEA49DE5F7AD5CL;
    }

    public static int id_class(rrZd_1 rrZd_12) {
        return rrZd_12.id_class() - rrZd_12.id_break() + id_throws[5];
    }

    public List<rrZd_1> id_class() {
        return (List)this.id_class[id_byte[10]];
    }

    public int id_break() {
        return (Integer)this.id_class[id_byte[11]];
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x4B82A311;
    }

    private void id_throws() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[23]];
            objectArray[rrZx_1.id_throws[12]] = id_throws[13];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrZx_1.id_catch();
        rrZx_1.id_byte();
        rrZx_1.id_protected();
        rrZx_1.id_case();
    }

    private static void id_catch() {
        boolean[] blArray = new boolean[14];
        blArray[2] = true;
        blArray[5] = true;
        blArray[7] = true;
        blArray[10] = true;
        blArray[11] = true;
        blArray[12] = true;
        id_throws = blArray;
    }

    private static void id_case() {
        Object[] objectArray = new Object[5];
        objectArray[0] = new rrZx_1(48, 57);
        objectArray[1] = new rrZx_1().id_class(33, 47).id_class(58, 64).id_class(91, 96).id_class(167).id_class(123, 126).id_class(8470).id_class(32).id_class(183).id_class(169).id_class(187).id_class(171);
        objectArray[2] = new rrZx_1(97, 122).id_class(65, 90);
        objectArray[3] = new rrZx_1(1072, 1103).id_class(1040, 1071).id_class(1025).id_class(1105);
        rrZx_1[] rrZx_1Array = new rrZx_1[]{new rrZx_1(48, 57), new rrZx_1().id_class(33, 47).id_class(58, 64).id_class(91, 96).id_class(167).id_class(123, 126).id_class(8470).id_class(32).id_class(183).id_class(169).id_class(187).id_class(171), new rrZx_1(97, 122).id_class(65, 90), new rrZx_1(1072, 1103).id_class(1040, 1071).id_class(1025).id_class(1105)};
        objectArray[4] = new rrZx_1().id_class(rrZx_1Array);
        id_break = objectArray;
    }

    private static void id_protected() {
        id_protected = new byte[]{48, 57, 33, 47, 58, 64, 91, 96, 123, 126, 32, 97, 122, 65, 90, 2, 3, 4, 2, 2, 3, 3, 4, 2, 5};
    }
}

