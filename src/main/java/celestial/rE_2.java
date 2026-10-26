/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.PZ;
import celestial.Pd_1;
import celestial.rP_2;
import celestial.rS_2;
import celestial.rU_2;
import celestial.rfH_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rE_2
implements PZ,
rP_2 {
    private static int[] id_break;
    private static byte[] id_byte;
    public Object[] id_class;
    private static String[] id_protected;
    private static boolean[] id_throws;
    private static short[] id_case;

    private void id_byte() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[2]];
            objectArray[rE_2.id_throws[11]] = id_throws[12];
            objectArray[rE_2.id_throws[13]] = id_throws[14];
            objectArray[rE_2.id_byte[3]] = id_throws[15];
        }
    }

    public rE_2(rfH_2 rfH_22) {
        this.id_byte();
        Integer n = rfH_22.b_();
        this.id_class[rE_2.id_case[0]] = n;
        Integer n2 = rfH_22.c_();
        this.id_class[rE_2.id_case[1]] = n2;
        Integer n3 = rfH_22.d_();
        this.id_class[rE_2.id_case[2]] = n3;
    }

    static {
        rE_2.ntfClinit();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return id_throws[5];
        }
        if (object == null || this.getClass() != object.getClass()) {
            return id_throws[6];
        }
        rE_2 rE_22 = (rE_2)object;
        return ((Integer)this.id_class[id_case[12]]).intValue() == ((Integer)rE_22.id_class[id_case[13]]).intValue() && ((Integer)this.id_class[id_case[14]]).intValue() == ((Integer)rE_22.id_class[id_case[15]]).intValue() && ((Integer)this.id_class[id_case[16]]).intValue() == ((Integer)rE_22.id_class[id_case[17]]).intValue() ? id_throws[7] : id_throws[8];
    }

    public String toString() {
        Object[] objectArray = new Object[id_byte[0]];
        objectArray[rE_2.id_throws[9]] = Pd_1.id_class((Integer)this.id_class[id_case[21]]);
        objectArray[rE_2.id_throws[10]] = Pd_1.id_class((Integer)this.id_class[id_case[22]]);
        objectArray[rE_2.id_byte[1]] = Pd_1.id_class((Integer)this.id_class[id_case[23]]);
        return String.format(id_protected[0], objectArray);
    }

    public int hashCode() {
        return (int)rU_2.id_byte((Integer)this.id_class[id_case[18]], (Integer)this.id_class[id_case[19]], (Integer)this.id_class[id_case[20]]) * id_break[0];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x69D3050A;
    }

    @Override
    public double id_class(int n, int n2, int n3) {
        int n4 = n - (Integer)this.id_class[id_case[9]];
        int n5 = n2 - (Integer)this.id_class[id_case[10]];
        int n6 = n3 - (Integer)this.id_class[id_case[11]];
        return rS_2.id_class(n4, n5 < 0 ? n5 + id_throws[4] : n5, n6);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{2, 60, -92, -2, -98, -51, 18, 42}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xA02893BE355028BAL;
    }

    @Override
    public boolean id_break(int n, int n2, int n3) {
        int n4 = n - (Integer)this.id_class[id_case[6]];
        int n5 = n2 - (Integer)this.id_class[id_case[7]];
        int n6 = n3 - (Integer)this.id_class[id_case[8]];
        return Math.abs(n4) + Math.abs(n5 < 0 ? n5 + id_throws[0] : n5) + Math.abs(n6) <= id_throws[1] ? id_throws[2] : id_throws[3];
    }

    @Override
    public rfH_2 id_break() {
        return new rfH_2((Integer)this.id_class[id_case[3]], (Integer)this.id_class[id_case[4]], (Integer)this.id_class[id_case[5]]);
    }

    private static void id_throws() {
        id_break = new int[]{-49639096};
    }

    private static /* synthetic */ void ntfClinit() {
        rE_2.id_protected();
        rE_2.id_case();
        rE_2.id_catch();
        rE_2.id_private();
        rE_2.id_throws();
    }

    private static void id_catch() {
        short[] sArray = new short[24];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[4] = 1;
        sArray[5] = 2;
        sArray[7] = 1;
        sArray[8] = 2;
        sArray[10] = 1;
        sArray[11] = 2;
        sArray[14] = 1;
        sArray[15] = 1;
        sArray[16] = 2;
        sArray[17] = 2;
        sArray[19] = 1;
        sArray[20] = 2;
        sArray[22] = 1;
        sArray[23] = 2;
        id_case = sArray;
    }

    private static void id_case() {
        id_protected = new String[]{new String("GoalGetToBlock{x=%s,y=%s,z=%s}")};
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[16];
        blArray[0] = true;
        blArray[1] = true;
        blArray[2] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[7] = true;
        blArray[10] = true;
        blArray[13] = true;
        id_throws = blArray;
    }

    private static void id_private() {
        id_byte = new byte[]{3, 2, 3, 2};
    }
}

