/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Om_1;
import celestial.rvs_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLn_1
extends Om_1 {
    private static short[] id_byte;
    public Object[] id_class;
    private static boolean[] id_protected;
    public static Object[] id_break;

    public rrLn_1() {
        this.id_throws();
    }

    static {
        rrLn_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xD516B96752AE63BBL;
    }

    public rvs_3 id_class() {
        this.id_throws();
        return (rvs_3)this.id_class[id_byte[4]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x9C870D72;
    }

    public static rrLn_1 id_class(rvs_3 rvs_32) {
        rvs_3 rvs_33 = rvs_32;
        ((rrLn_1)rrLn_1.id_break[rrLn_1.id_byte[0]]).id_class[rrLn_1.id_byte[1]] = rvs_33;
        ((rrLn_1)id_break[id_byte[2]]).id_class(id_protected[0]);
        return (rrLn_1)id_break[id_byte[3]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-60, 52, -7, -2, 102, -79, 39, 124}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        id_byte = new short[5];
    }

    private void id_throws() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[2]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrLn_1.id_case();
        rrLn_1.id_break();
        rrLn_1.id_protected();
    }

    private static void id_case() {
        boolean[] blArray = new boolean[4];
        blArray[2] = true;
        blArray[3] = true;
        id_protected = blArray;
    }

    private static void id_protected() {
        Object[] objectArray = new Object[]{new rrLn_1()};
        id_break = objectArray;
    }
}

