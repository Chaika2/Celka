/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Pd_1;
import celestial.rE_2;
import celestial.rU_2;
import celestial.rfH_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GZ
extends rE_2 {
    private static byte[] id_byte;
    private static boolean[] id_protected;
    public Object[] id_break;
    private static short[] id_throws;
    private static int[] id_case;
    private static String[] id_catch;

    private static void id_byte() {
        id_catch = new String[]{new String("GoalAdjacent{x=%s,y=%s,z=%s}")};
    }

    public GZ(rfH_2 rfH_22, rfH_2 rfH_23, boolean bl) {
        super(rfH_22);
        this.id_catch();
        rfH_2 rfH_24 = rfH_23;
        this.id_break[GZ.id_throws[0]] = rfH_24;
        Boolean bl2 = bl;
        this.id_break[GZ.id_throws[1]] = bl2;
    }

    static {
        GZ.ntfClinit();
    }

    @Override
    public boolean equals(Object object) {
        this.id_catch();
        if (!super.equals(object)) {
            return id_protected[6];
        }
        GZ gZ = (GZ)object;
        return ((Boolean)this.id_break[id_throws[12]]).booleanValue() == ((Boolean)gZ.id_break[id_throws[13]]).booleanValue() && Objects.equals((rfH_2)this.id_break[id_throws[14]], (rfH_2)gZ.id_break[id_throws[15]]) ? id_protected[7] : id_protected[8];
    }

    @Override
    public String toString() {
        Object[] objectArray = new Object[id_byte[1]];
        objectArray[GZ.id_protected[9]] = Pd_1.id_class((Integer)this.id_class[id_throws[20]]);
        objectArray[GZ.id_protected[10]] = Pd_1.id_class((Integer)this.id_class[id_throws[21]]);
        objectArray[GZ.id_byte[2]] = Pd_1.id_class((Integer)this.id_class[id_throws[22]]);
        return String.format(id_catch[0], objectArray);
    }

    @Override
    public int hashCode() {
        this.id_catch();
        int n = id_case[0];
        n = n * id_case[1] + super.hashCode();
        n = n * id_case[2] + (int)rU_2.id_byte(((rfH_2)this.id_break[id_throws[16]]).b_(), ((rfH_2)this.id_break[id_throws[17]]).c_(), ((rfH_2)this.id_break[id_throws[18]]).d_());
        n = n * id_case[3] + ((Boolean)this.id_break[id_throws[19]] != false ? id_case[4] : id_case[5]);
        return n;
    }

    @Override
    public double id_class(int n, int n2, int n3) {
        return (double)((Integer)this.id_class[id_throws[11]] * id_byte[0]) + super.id_class(n, n2, n3);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x2C5C7C09;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xF39FFB1051666314L;
    }

    @Override
    public boolean id_break(int n, int n2, int n3) {
        this.id_catch();
        if (n == (Integer)this.id_class[id_throws[2]] && n2 == (Integer)this.id_class[id_throws[3]] && n3 == (Integer)this.id_class[id_throws[4]]) {
            return id_protected[0];
        }
        if (n == ((rfH_2)this.id_break[id_throws[5]]).b_() && n2 == ((rfH_2)this.id_break[id_throws[6]]).c_() && n3 == ((rfH_2)this.id_break[id_throws[7]]).d_()) {
            return id_protected[1];
        }
        if (!((Boolean)this.id_break[id_throws[8]]).booleanValue() && n2 == (Integer)this.id_class[id_throws[9]] - id_protected[2]) {
            return id_protected[3];
        }
        if (n2 < (Integer)this.id_class[id_throws[10]] - id_protected[4]) {
            return id_protected[5];
        }
        return super.id_break(n, n2, n3);
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{87, 23, -60, -9, 88, 11, -48, 33}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_throws() {
        id_byte = new byte[]{100, 3, 2, 2};
    }

    private static /* synthetic */ void ntfClinit() {
        GZ.id_private();
        GZ.id_byte();
        GZ.id_case();
        GZ.id_throws();
        GZ.id_protected();
    }

    private void id_catch() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_byte[3]];
            objectArray[GZ.id_protected[11]] = id_protected[12];
        }
    }

    private static void id_case() {
        short[] sArray = new short[23];
        sArray[0] = 1;
        sArray[3] = 1;
        sArray[4] = 2;
        sArray[5] = 1;
        sArray[6] = 1;
        sArray[7] = 1;
        sArray[9] = 1;
        sArray[10] = 1;
        sArray[11] = 1;
        sArray[14] = 1;
        sArray[15] = 1;
        sArray[16] = 1;
        sArray[17] = 1;
        sArray[18] = 1;
        sArray[21] = 1;
        sArray[22] = 2;
        id_throws = sArray;
    }

    private static void id_protected() {
        id_case = new int[]{806368046, 1412661222, 1730799370, 260592149, -1314802005, 1565710265};
    }

    private static void id_private() {
        boolean[] blArray = new boolean[13];
        blArray[2] = true;
        blArray[4] = true;
        blArray[7] = true;
        blArray[10] = true;
        id_protected = blArray;
    }
}

