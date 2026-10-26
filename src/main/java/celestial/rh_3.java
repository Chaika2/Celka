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

public class rh_3
implements PZ,
rP_2 {
    private static boolean[] id_break;
    private static int[] id_byte;
    private static String[] id_protected;
    private static byte[] id_throws;
    private static short[] id_case;
    public Object[] id_class;

    private static void id_byte() {
        boolean[] blArray = new boolean[15];
        blArray[0] = true;
        blArray[1] = true;
        blArray[3] = true;
        blArray[4] = true;
        blArray[6] = true;
        blArray[9] = true;
        blArray[12] = true;
        id_break = blArray;
    }

    public rh_3(rfH_2 rfH_22) {
        this(rfH_22.b_(), rfH_22.c_(), rfH_22.d_());
    }

    public rh_3(int n, int n2, int n3) {
        this.id_protected();
        Integer n4 = n;
        this.id_class[rh_3.id_case[0]] = n4;
        Integer n5 = n2;
        this.id_class[rh_3.id_case[1]] = n5;
        Integer n6 = n3;
        this.id_class[rh_3.id_case[2]] = n6;
    }

    static {
        rh_3.ntfClinit();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return id_break[4];
        }
        if (object == null || this.getClass() != object.getClass()) {
            return id_break[5];
        }
        rh_3 rh_32 = (rh_3)object;
        return ((Integer)this.id_class[id_case[13]]).intValue() == ((Integer)rh_32.id_class[id_case[14]]).intValue() && ((Integer)this.id_class[id_case[15]]).intValue() == ((Integer)rh_32.id_class[id_case[16]]).intValue() && ((Integer)this.id_class[id_case[17]]).intValue() == ((Integer)rh_32.id_class[id_case[18]]).intValue() ? id_break[6] : id_break[7];
    }

    public String toString() {
        Object[] objectArray = new Object[id_throws[0]];
        objectArray[rh_3.id_break[8]] = Pd_1.id_class((Integer)this.id_class[id_case[22]]);
        objectArray[rh_3.id_break[9]] = Pd_1.id_class((Integer)this.id_class[id_case[23]]);
        objectArray[rh_3.id_throws[1]] = Pd_1.id_class((Integer)this.id_class[id_case[24]]);
        return String.format(id_protected[0], objectArray);
    }

    public int hashCode() {
        return (int)rU_2.id_byte((Integer)this.id_class[id_case[19]], (Integer)this.id_class[id_case[20]], (Integer)this.id_class[id_case[21]]) * id_byte[0];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{77, 127, -104, -89, -49, 43, -77, 123}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x9DF6F26C;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x32F54A7474425C64L;
    }

    @Override
    public double id_class(int n, int n2, int n3) {
        int n4 = n - (Integer)this.id_class[id_case[7]];
        int n5 = n2 - (Integer)this.id_class[id_case[8]];
        int n6 = n3 - (Integer)this.id_class[id_case[9]];
        return rS_2.id_class(n4, n5 < 0 ? n5 + id_break[3] : n5, n6);
    }

    @Override
    public boolean id_break(int n, int n2, int n3) {
        return n == (Integer)this.id_class[id_case[3]] && (n2 == (Integer)this.id_class[id_case[4]] || n2 == (Integer)this.id_class[id_case[5]] - id_break[0]) && n3 == (Integer)this.id_class[id_case[6]] ? id_break[1] : id_break[2];
    }

    @Override
    public rfH_2 id_break() {
        return new rfH_2((Integer)this.id_class[id_case[10]], (Integer)this.id_class[id_case[11]], (Integer)this.id_class[id_case[12]]);
    }

    private static void id_throws() {
        id_throws = new byte[]{3, 2, 3, 2};
    }

    private static /* synthetic */ void ntfClinit() {
        rh_3.id_byte();
        rh_3.id_catch();
        rh_3.id_case();
        rh_3.id_throws();
        rh_3.id_private();
    }

    private static void id_catch() {
        id_protected = new String[]{new String("GoalTwoBlocks{x=%s,y=%s,z=%s}")};
    }

    private static void id_case() {
        short[] sArray = new short[25];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[4] = 1;
        sArray[5] = 1;
        sArray[6] = 2;
        sArray[8] = 1;
        sArray[9] = 2;
        sArray[11] = 1;
        sArray[12] = 2;
        sArray[15] = 1;
        sArray[16] = 1;
        sArray[17] = 2;
        sArray[18] = 2;
        sArray[20] = 1;
        sArray[21] = 2;
        sArray[23] = 1;
        sArray[24] = 2;
        id_case = sArray;
    }

    private void id_protected() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_throws[2]];
            objectArray[rh_3.id_break[10]] = id_break[11];
            objectArray[rh_3.id_break[12]] = id_break[13];
            objectArray[rh_3.id_throws[3]] = id_break[14];
        }
    }

    private static void id_private() {
        id_byte = new int[]{516508351};
    }
}

