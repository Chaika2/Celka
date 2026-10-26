/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.SZ;
import celestial.rfl_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnN_2 {
    private static short[] id_byte;
    private static boolean[] id_protected;
    private static byte[] id_throws;
    public static Object[] id_class;
    public Object[] id_break;

    private void id_byte() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_throws[0]];
        }
    }

    public rrnN_2() {
        this.id_byte();
    }

    static {
        rrnN_2.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xE932B758CB2AF136L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-80, 29, 38, 5, -74, -41, 34, -81}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x6F58E0DB;
    }

    public static rrnN_2 id_class(SZ sZ, rfl_3 rfl_32) {
        SZ sZ2 = sZ;
        ((rrnN_2)rrnN_2.id_class[rrnN_2.id_byte[0]]).id_break[rrnN_2.id_byte[1]] = sZ2;
        rfl_3 rfl_33 = rfl_32;
        ((rrnN_2)rrnN_2.id_class[rrnN_2.id_byte[2]]).id_break[rrnN_2.id_byte[3]] = rfl_33;
        return (rrnN_2)id_class[id_byte[4]];
    }

    public SZ id_class() {
        return (SZ)this.id_break[id_byte[5]];
    }

    public rfl_3 id_break() {
        return (rfl_3)this.id_break[id_byte[6]];
    }

    private static void id_throws() {
        id_throws = new byte[]{2};
    }

    private static /* synthetic */ void ntfClinit() {
        rrnN_2.id_case();
        rrnN_2.id_protected();
        rrnN_2.id_throws();
        rrnN_2.id_catch();
    }

    private static void id_catch() {
        Object[] objectArray = new Object[]{new rrnN_2()};
        id_class = objectArray;
    }

    private static void id_case() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_protected = blArray;
    }

    private static void id_protected() {
        short[] sArray = new short[7];
        sArray[3] = 1;
        sArray[6] = 1;
        id_byte = sArray;
    }
}

