/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFH {
    public static Object[] id_class;
    private static byte[] id_byte;
    private static short[] id_protected;
    private static boolean[] id_throws;
    public Object[] id_break;

    private static void id_byte() {
        short[] sArray = new short[7];
        sArray[3] = 1;
        sArray[6] = 1;
        id_protected = sArray;
    }

    public rrFH() {
        this.id_case();
    }

    static {
        rrFH.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xE7444AE1;
    }

    public static rrFH id_class(String string, String string2) {
        String string3 = string;
        ((rrFH)rrFH.id_class[rrFH.id_protected[0]]).id_break[rrFH.id_protected[1]] = string3;
        String string4 = string2;
        ((rrFH)rrFH.id_class[rrFH.id_protected[2]]).id_break[rrFH.id_protected[3]] = string4;
        return (rrFH)id_class[id_protected[4]];
    }

    public String id_class() {
        return (String)this.id_break[id_protected[5]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-20, -67, -103, 20, 27, -80, 53, -24}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xA0391D0426B91301L;
    }

    public String id_break() {
        return (String)this.id_break[id_protected[6]];
    }

    private static void id_throws() {
        Object[] objectArray = new Object[]{new rrFH()};
        id_class = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrFH.id_catch();
        rrFH.id_byte();
        rrFH.id_protected();
        rrFH.id_throws();
    }

    private static void id_catch() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_throws = blArray;
    }

    private void id_case() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_byte[0]];
        }
    }

    private static void id_protected() {
        id_byte = new byte[]{2};
    }
}

