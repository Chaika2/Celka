/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.EQ;
import celestial.Ec_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class EN
implements Ec_1 {
    public Object[] id_class;
    private static short[] id_byte;
    public static Object[] id_break;
    private static byte[] id_protected;
    private static boolean[] id_throws;

    @Override
    public boolean id_byte() {
        return (Integer)this.id_class[id_byte[24]] == 0 ? id_throws[7] : id_throws[8];
    }

    public EN(int n) {
        EQ[] eQArray;
        this.id_catch();
        Integer n2 = id_throws[0];
        this.id_class[EN.id_byte[1]] = n2;
        this.id_class[EN.id_byte[2]] = eQArray = new EQ[n];
    }

    public EN() {
        this(id_byte[0]);
    }

    static {
        EN.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xEA3F9199D303EDDDL;
    }

    @Override
    public void id_class(EQ eQ) {
        if ((Integer)this.id_class[id_byte[4]] >= ((EQ[])this.id_class[id_byte[5]]).length - id_throws[1]) {
            EQ[] eQArray;
            this.id_class[EN.id_byte[8]] = eQArray = Arrays.copyOf((EQ[])this.id_class[id_byte[6]], ((EQ[])this.id_class[id_byte[7]]).length << id_throws[2]);
        }
        EN eN = this;
        Integer n = (Integer)eN.id_class[id_byte[9]] + id_throws[3];
        eN.id_class[EN.id_byte[10]] = n;
        Integer n2 = (int)((Integer)this.id_class[id_byte[11]]);
        eQ.id_class[EN.id_byte[12]] = n2;
        ((EQ[])this.id_class[EN.id_byte[13]])[((Integer)this.id_class[EN.id_byte[14]]).intValue()] = eQ;
        this.id_break(eQ);
    }

    public int id_class() {
        return (Integer)this.id_class[id_byte[3]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x3A598A91;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-34, 33, -81, -22, 123, -117, 19, 121}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public EQ id_break() {
        EQ eQ;
        if ((Integer)this.id_class[id_byte[25]] == 0) {
            throw new IllegalStateException();
        }
        EQ eQ2 = ((EQ[])this.id_class[id_byte[26]])[id_throws[9]];
        ((EQ[])this.id_class[EN.id_byte[29]])[EN.id_throws[10]] = eQ = ((EQ[])this.id_class[id_byte[27]])[(Integer)this.id_class[id_byte[28]]];
        Integer n = id_throws[11];
        eQ.id_class[EN.id_byte[30]] = n;
        ((EQ[])this.id_class[EN.id_byte[31]])[((Integer)this.id_class[EN.id_byte[32]]).intValue()] = null;
        EN eN = this;
        Integer n2 = (Integer)eN.id_class[id_byte[33]] - id_throws[12];
        eN.id_class[EN.id_byte[34]] = n2;
        Integer n3 = id_protected[0];
        eQ2.id_class[EN.id_byte[35]] = n3;
        if ((Integer)this.id_class[id_byte[36]] < id_protected[1]) {
            return eQ2;
        }
        int n4 = id_throws[13];
        int n5 = id_protected[2];
        double d = (Double)eQ.id_class[id_byte[37]];
        do {
            EQ eQ3 = ((EQ[])this.id_class[id_byte[38]])[n5];
            double d2 = (Double)eQ3.id_class[id_byte[39]];
            if (n5 < (Integer)this.id_class[id_byte[40]]) {
                EQ eQ4 = ((EQ[])this.id_class[id_byte[41]])[n5 + id_throws[14]];
                double d3 = (Double)eQ4.id_class[id_byte[42]];
                if (d2 > d3) {
                    ++n5;
                    d2 = d3;
                    eQ3 = eQ4;
                }
            }
            if (d <= d2) break;
            ((EQ[])this.id_class[EN.id_byte[43]])[n4] = eQ3;
            ((EQ[])this.id_class[EN.id_byte[44]])[n5] = eQ;
            Integer n6 = n5;
            eQ.id_class[EN.id_byte[45]] = n6;
            Integer n7 = n4;
            eQ3.id_class[EN.id_byte[46]] = n7;
            n4 = n5;
        } while ((n5 <<= id_throws[15]) <= (Integer)this.id_class[id_byte[47]]);
        return eQ2;
    }

    @Override
    public void id_break(EQ eQ) {
        int n = (Integer)eQ.id_class[id_byte[15]];
        int n2 = n >>> id_throws[4];
        double d = (Double)eQ.id_class[id_byte[16]];
        EQ eQ2 = ((EQ[])this.id_class[id_byte[17]])[n2];
        while (n > id_throws[5] && (Double)eQ2.id_class[id_byte[18]] > d) {
            ((EQ[])this.id_class[EN.id_byte[19]])[n] = eQ2;
            ((EQ[])this.id_class[EN.id_byte[20]])[n2] = eQ;
            Integer n3 = n2;
            eQ.id_class[EN.id_byte[21]] = n3;
            Integer n4 = n;
            eQ2.id_class[EN.id_byte[22]] = n4;
            n = n2;
            n2 = n >>> id_throws[6];
            eQ2 = ((EQ[])this.id_class[id_byte[23]])[n2];
        }
    }

    private static void id_throws() {
        short[] sArray = new short[49];
        sArray[0] = 1024;
        sArray[1] = 1;
        sArray[3] = 1;
        sArray[4] = 1;
        sArray[9] = 1;
        sArray[10] = 1;
        sArray[11] = 1;
        sArray[12] = 7;
        sArray[14] = 1;
        sArray[15] = 7;
        sArray[16] = 5;
        sArray[18] = 5;
        sArray[21] = 7;
        sArray[22] = 7;
        sArray[24] = 1;
        sArray[25] = 1;
        sArray[28] = 1;
        sArray[30] = 7;
        sArray[32] = 1;
        sArray[33] = 1;
        sArray[34] = 1;
        sArray[35] = 7;
        sArray[36] = 1;
        sArray[37] = 5;
        sArray[39] = 5;
        sArray[40] = 1;
        sArray[42] = 5;
        sArray[45] = 7;
        sArray[46] = 7;
        sArray[47] = 1;
        sArray[48] = 1024;
        id_byte = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        EN.id_case();
        EN.id_throws();
        EN.id_protected();
        EN.id_private();
    }

    private void id_catch() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[3]];
            objectArray[EN.id_throws[16]] = id_throws[17];
        }
    }

    private static void id_case() {
        boolean[] blArray = new boolean[20];
        blArray[1] = true;
        blArray[2] = true;
        blArray[3] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[6] = true;
        blArray[7] = true;
        blArray[9] = true;
        blArray[10] = true;
        blArray[11] = true;
        blArray[12] = true;
        blArray[13] = true;
        blArray[14] = true;
        blArray[15] = true;
        blArray[16] = true;
        blArray[18] = true;
        id_throws = blArray;
    }

    private static void id_protected() {
        id_protected = new byte[]{-1, 2, 2, 2};
    }

    private static void id_private() {
        Object[] objectArray = new Object[]{1024};
        id_break = objectArray;
    }
}

