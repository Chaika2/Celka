/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_break;
import celestial.rjU_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnd_3 {
    public static Object[] id_class;
    private static short[] id_byte;
    private static boolean[] id_protected;
    private static byte[] id_throws;
    public Object[] id_break;

    private static void id_byte() {
        id_throws = new byte[]{2};
    }

    public rrnd_3() {
        this.id_throws();
    }

    static {
        rrnd_3.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{81, -124, -56, 58, -25, 18, 15, 76}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static void id_class(rjU_2 rjU_22, int n) {
        rrnd_3 rrnd_32 = rrnd_3.id_break(rjU_22, n);
        ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[id_byte[5]]).id_class(rrnd_32);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x653FC767;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x5B7E30C59B24565AL;
    }

    public int id_class() {
        return (Integer)this.id_break[id_byte[7]];
    }

    private static rrnd_3 id_break(rjU_2 rjU_22, int n) {
        rjU_2 rjU_23 = rjU_22;
        ((rrnd_3)rrnd_3.id_class[rrnd_3.id_byte[0]]).id_break[rrnd_3.id_byte[1]] = rjU_23;
        Integer n2 = n;
        ((rrnd_3)rrnd_3.id_class[rrnd_3.id_byte[2]]).id_break[rrnd_3.id_byte[3]] = n2;
        return (rrnd_3)id_class[id_byte[4]];
    }

    public rjU_2 id_break() {
        return (rjU_2)this.id_break[id_byte[6]];
    }

    private void id_throws() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_throws[0]];
            objectArray[rrnd_3.id_protected[1]] = id_protected[2];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrnd_3.id_catch();
        rrnd_3.id_protected();
        rrnd_3.id_byte();
        rrnd_3.id_case();
    }

    private static void id_catch() {
        boolean[] blArray = new boolean[4];
        blArray[1] = true;
        blArray[3] = true;
        id_protected = blArray;
    }

    private static void id_case() {
        Object[] objectArray = new Object[]{new rrnd_3()};
        id_class = objectArray;
    }

    private static void id_protected() {
        short[] sArray = new short[8];
        sArray[3] = 1;
        sArray[7] = 1;
        id_byte = sArray;
    }
}

