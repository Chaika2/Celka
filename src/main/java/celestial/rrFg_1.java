/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Lu_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFg_1 {
    public Object[] id_class;
    private static byte[] id_byte;
    private static boolean[] id_protected;
    public static Object[] id_break;
    private static short[] id_throws;

    private static void id_byte() {
        short[] sArray = new short[7];
        sArray[3] = 1;
        sArray[6] = 1;
        id_throws = sArray;
    }

    public rrFg_1() {
        this.id_catch();
    }

    static {
        rrFg_1.ntfClinit();
    }

    public Lu_1 id_class() {
        return (Lu_1)this.id_class[id_throws[5]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{26, -126, 125, 47, -91, -56, -104, 10}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x9B5A0948B44F5BD6L;
    }

    public static rrFg_1 id_class(Lu_1 lu_1, String string) {
        Lu_1 lu_12 = lu_1;
        ((rrFg_1)rrFg_1.id_break[rrFg_1.id_throws[0]]).id_class[rrFg_1.id_throws[1]] = lu_12;
        String string2 = string;
        ((rrFg_1)rrFg_1.id_break[rrFg_1.id_throws[2]]).id_class[rrFg_1.id_throws[3]] = string2;
        return (rrFg_1)id_break[id_throws[4]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x161AFCCE;
    }

    public String id_break() {
        return (String)this.id_class[id_throws[6]];
    }

    private static void id_throws() {
        id_byte = new byte[]{2};
    }

    private static /* synthetic */ void ntfClinit() {
        rrFg_1.id_protected();
        rrFg_1.id_byte();
        rrFg_1.id_throws();
        rrFg_1.id_case();
    }

    private void id_catch() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
        }
    }

    private static void id_case() {
        Object[] objectArray = new Object[]{new rrFg_1()};
        id_break = objectArray;
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_protected = blArray;
    }
}

