/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Pd_1;
import celestial.rS_2;
import celestial.rfH_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GF
extends rS_2 {
    private static boolean[] id_break;
    private static int[] id_byte;
    private static String[] id_protected;
    private static byte[] id_throws;
    private static short[] id_case;

    private static void id_byte() {
        id_byte = new int[]{1910811835};
    }

    public GF(rfH_2 rfH_22) {
        super(rfH_22.id_final());
    }

    static {
        GF.ntfClinit();
    }

    @Override
    public String toString() {
        Object[] objectArray = new Object[id_throws[1]];
        objectArray[GF.id_break[0]] = Pd_1.id_class((Integer)this.id_class[id_case[1]]);
        objectArray[GF.id_break[1]] = Pd_1.id_class((Integer)this.id_class[id_case[2]]);
        objectArray[GF.id_throws[2]] = Pd_1.id_class((Integer)this.id_class[id_case[3]]);
        return String.format(id_protected[0], objectArray);
    }

    @Override
    public int hashCode() {
        return super.hashCode() * id_byte[0];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x3389B2EE;
    }

    @Override
    public double id_class(int n, int n2, int n3) {
        return (double)((Integer)this.id_class[id_case[0]] * id_throws[0]) + super.id_class(n, n2, n3);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x4B87398C13D34D67L;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-24, -87, 6, -49, -44, 89, -115, -65}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_throws() {
        id_throws = new byte[]{100, 3, 2};
    }

    private static /* synthetic */ void ntfClinit() {
        GF.id_catch();
        GF.id_protected();
        GF.id_case();
        GF.id_throws();
        GF.id_byte();
    }

    private static void id_catch() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_break = blArray;
    }

    private static void id_case() {
        short[] sArray = new short[4];
        sArray[0] = 1;
        sArray[2] = 1;
        sArray[3] = 2;
        id_case = sArray;
    }

    private static void id_protected() {
        id_protected = new String[]{new String("GoalPlace{x=%s,y=%s,z=%s}")};
    }
}

