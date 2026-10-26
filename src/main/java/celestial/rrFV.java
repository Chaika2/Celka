/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrqP_2;
import celestial.rrqS_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFV {
    private static short[] id_byte;
    public Object[] id_class;
    public static Object[] id_break;
    private static byte[] id_protected;
    private static boolean[] id_throws;

    public rrqP_2 id_byte() {
        return (rrqP_2)this.id_class[id_byte[7]];
    }

    public rrFV() {
        this.id_private();
    }

    static {
        rrFV.ntfClinit();
    }

    public static rrFV id_class(rrqP_2 rrqP_22, rrqS_2 rrqS_22, rrqS_2 rrqS_23) {
        rrqP_2 rrqP_23 = rrqP_22;
        ((rrFV)rrFV.id_break[rrFV.id_byte[0]]).id_class[rrFV.id_byte[1]] = rrqP_23;
        rrqS_2 rrqS_24 = rrqS_22;
        ((rrFV)rrFV.id_break[rrFV.id_byte[2]]).id_class[rrFV.id_byte[3]] = rrqS_24;
        rrqS_2 rrqS_25 = rrqS_23;
        ((rrFV)rrFV.id_break[rrFV.id_byte[4]]).id_class[rrFV.id_byte[5]] = rrqS_25;
        return (rrFV)id_break[id_byte[6]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{41, -76, 43, -5, -66, -106, -62, 124}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public rrqS_2 id_class() {
        return (rrqS_2)((Object)this.id_class[id_byte[9]]);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x7A1C8F82E2695B94L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x38028C26;
    }

    public rrqS_2 id_break() {
        return (rrqS_2)((Object)this.id_class[id_byte[8]]);
    }

    private static void id_throws() {
        id_protected = new byte[]{3};
    }

    private static /* synthetic */ void ntfClinit() {
        rrFV.id_catch();
        rrFV.id_protected();
        rrFV.id_throws();
        rrFV.id_case();
    }

    private static void id_catch() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_throws = blArray;
    }

    private static void id_case() {
        Object[] objectArray = new Object[]{new rrFV()};
        id_break = objectArray;
    }

    private static void id_protected() {
        short[] sArray = new short[10];
        sArray[3] = 1;
        sArray[5] = 2;
        sArray[8] = 1;
        sArray[9] = 2;
        id_byte = sArray;
    }

    private void id_private() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[0]];
        }
    }
}

