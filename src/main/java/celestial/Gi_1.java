/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Pd_1;
import celestial.rS_2;
import celestial.rfH_2;
import celestial.rh_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Gi_1
extends rh_3 {
    private static String[] id_break;
    private static int[] id_byte;
    private static short[] id_protected;
    private static boolean[] id_throws;
    private static byte[] id_case;

    private static void id_byte() {
        short[] sArray = new short[11];
        sArray[1] = 1;
        sArray[2] = 1;
        sArray[3] = 1;
        sArray[4] = 2;
        sArray[6] = 1;
        sArray[7] = 2;
        sArray[9] = 1;
        sArray[10] = 2;
        id_protected = sArray;
    }

    public Gi_1(rfH_2 rfH_22) {
        super(rfH_22);
    }

    static {
        Gi_1.ntfClinit();
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }

    @Override
    public String toString() {
        Object[] objectArray = new Object[id_case[4]];
        objectArray[Gi_1.id_throws[4]] = Pd_1.id_class((Integer)this.id_class[id_protected[8]]);
        objectArray[Gi_1.id_throws[5]] = Pd_1.id_class((Integer)this.id_class[id_protected[9]]);
        objectArray[Gi_1.id_case[5]] = Pd_1.id_class((Integer)this.id_class[id_protected[10]]);
        return String.format(id_break[0], objectArray);
    }

    @Override
    public int hashCode() {
        return super.hashCode() * id_byte[0];
    }

    @Override
    public double id_class(int n, int n2, int n3) {
        int n4 = n - (Integer)this.id_class[id_protected[5]];
        int n5 = n2 - (Integer)this.id_class[id_protected[6]];
        int n6 = n3 - (Integer)this.id_class[id_protected[7]];
        return rS_2.id_class(n4, n5 < id_case[1] ? n5 + id_case[2] : (n5 == id_case[3] ? id_throws[3] : n5), n6);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xC18D06DB;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x50EA1E4514CEA323L;
    }

    @Override
    public boolean id_break(int n, int n2, int n3) {
        return n == (Integer)this.id_class[id_protected[0]] && (n2 == (Integer)this.id_class[id_protected[1]] || n2 == (Integer)this.id_class[id_protected[2]] - id_throws[0] || n2 == (Integer)this.id_class[id_protected[3]] - id_case[0]) && n3 == (Integer)this.id_class[id_protected[4]] ? id_throws[1] : id_throws[2];
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{119, 2, -75, -78, -110, -19, -70, -32}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_throws() {
        id_break = new String[]{new String("GoalThreeBlocks{x=%s,y=%s,z=%s}")};
    }

    private static /* synthetic */ void ntfClinit() {
        Gi_1.id_protected();
        Gi_1.id_throws();
        Gi_1.id_byte();
        Gi_1.id_catch();
        Gi_1.id_case();
    }

    private static void id_catch() {
        id_case = new byte[]{2, -1, 2, -1, 3, 2};
    }

    private static void id_case() {
        id_byte = new int[]{393857768};
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[6];
        blArray[0] = true;
        blArray[1] = true;
        blArray[5] = true;
        id_throws = blArray;
    }
}

