/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rvs_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLA {
    public static Object[] id_class;
    private static short[] id_byte;
    public Object[] id_break;
    private static boolean[] id_protected;

    private void id_byte() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_protected[1]];
        }
    }

    public rrLA() {
        this.id_byte();
    }

    static {
        rrLA.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xD2847103659A642DL;
    }

    public rvs_3 id_class() {
        return (rvs_3)this.id_break[id_byte[3]];
    }

    public static rrLA id_class(rvs_3 rvs_32) {
        rvs_3 rvs_33 = rvs_32;
        ((rrLA)rrLA.id_class[rrLA.id_byte[0]]).id_break[rrLA.id_byte[1]] = rvs_33;
        return (rrLA)id_class[id_byte[2]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{86, 59, 83, -37, 103, -80, -46, 119}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xCE2BF814;
    }

    private static void id_break() {
        id_byte = new short[4];
    }

    private static void id_throws() {
        Object[] objectArray = new Object[]{new rrLA()};
        id_class = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrLA.id_protected();
        rrLA.id_break();
        rrLA.id_throws();
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[3];
        blArray[1] = true;
        blArray[2] = true;
        id_protected = blArray;
    }
}

