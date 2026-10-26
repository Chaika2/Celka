/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Aw_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFp_1 {
    public Object[] id_class;
    public static Object[] id_break;
    private static short[] id_byte;
    private static boolean[] id_protected;

    private static void id_byte() {
        boolean[] blArray = new boolean[3];
        blArray[1] = true;
        blArray[2] = true;
        id_protected = blArray;
    }

    public rrFp_1() {
        this.id_protected();
    }

    static {
        rrFp_1.ntfClinit();
    }

    public static rrFp_1 id_class(Aw_1 aw_1) {
        Aw_1 aw_12 = aw_1;
        ((rrFp_1)rrFp_1.id_break[rrFp_1.id_byte[0]]).id_class[rrFp_1.id_byte[1]] = aw_12;
        return (rrFp_1)id_break[id_byte[2]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xC684271E;
    }

    public Aw_1 id_class() {
        return (Aw_1)this.id_class[id_byte[3]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xCF77971102F5C63CL;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-108, 66, 127, -75, -86, 109, 9, -5}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        id_byte = new short[4];
    }

    private static void id_throws() {
        Object[] objectArray = new Object[]{new rrFp_1()};
        id_break = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrFp_1.id_byte();
        rrFp_1.id_break();
        rrFp_1.id_throws();
    }

    private void id_protected() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[1]];
        }
    }
}

