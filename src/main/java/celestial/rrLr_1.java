/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrtO_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLr_1 {
    public static Object[] id_class;
    private static boolean[] id_byte;
    public Object[] id_break;
    private static short[] id_protected;

    private static void id_byte() {
        Object[] objectArray = new Object[]{new rrLr_1()};
        id_class = objectArray;
    }

    public rrLr_1() {
        this.id_throws();
    }

    static {
        rrLr_1.ntfClinit();
    }

    public static rrLr_1 id_class(rrtO_2 rrtO_22) {
        rrtO_2 rrtO_23 = rrtO_22;
        ((rrLr_1)rrLr_1.id_class[rrLr_1.id_protected[0]]).id_break[rrLr_1.id_protected[1]] = rrtO_23;
        return (rrLr_1)id_class[id_protected[2]];
    }

    public rrtO_2 id_class() {
        return (rrtO_2)this.id_break[id_protected[3]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xDEBB23AD;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x66888BE6D14760DDL;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{61, 107, 51, -13, 27, -4, -37, -87}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        boolean[] blArray = new boolean[3];
        blArray[1] = true;
        blArray[2] = true;
        id_byte = blArray;
    }

    private void id_throws() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_byte[1]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrLr_1.id_break();
        rrLr_1.id_protected();
        rrLr_1.id_byte();
    }

    private static void id_protected() {
        id_protected = new short[4];
    }
}

