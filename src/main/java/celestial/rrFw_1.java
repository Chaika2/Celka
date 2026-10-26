/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrFI;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFw_1 {
    public static Object[] id_class;
    private static boolean[] id_byte;
    public Object[] id_break;
    private static short[] id_protected;

    private static void id_byte() {
        boolean[] blArray = new boolean[3];
        blArray[1] = true;
        blArray[2] = true;
        id_byte = blArray;
    }

    public rrFw_1() {
        this.id_throws();
    }

    static {
        rrFw_1.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{35, 88, -52, 33, -117, -39, 15, 122}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static rrFw_1 id_class(rrFI rrFI2) {
        rrFI rrFI3 = rrFI2;
        ((rrFw_1)rrFw_1.id_class[rrFw_1.id_protected[0]]).id_break[rrFw_1.id_protected[1]] = rrFI3;
        return (rrFw_1)id_class[id_protected[2]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x57F0A12AFF243688L;
    }

    public rrFI id_class() {
        return (rrFI)((Object)this.id_break[id_protected[3]]);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x45026420;
    }

    private static void id_break() {
        id_protected = new short[4];
    }

    private void id_throws() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_byte[1]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrFw_1.id_byte();
        rrFw_1.id_break();
        rrFw_1.id_protected();
    }

    private static void id_protected() {
        Object[] objectArray = new Object[]{new rrFw_1()};
        id_class = objectArray;
    }
}

