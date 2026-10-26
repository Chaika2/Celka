/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.xd_3;
import celestial.xu_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrHh_1
extends HashMap<xd_3, Integer> {
    private static boolean[] id_class;
    private static byte[] id_break;

    public rrHh_1() {
        this.put(xu_3.Jx, Integer.valueOf(id_break[0]));
        this.put(xu_3.ri, Integer.valueOf(id_break[1]));
        this.put(xu_3.Sk, Integer.valueOf(id_break[2]));
        this.put(xu_3.id_abstract, Integer.valueOf(id_break[3]));
        this.put(xu_3.id_long, Integer.valueOf(id_break[4]));
        this.put(xu_3.m, Integer.valueOf(id_break[5]));
        this.put(xu_3.Pl, id_class[0]);
        this.put(xu_3.id_float, id_class[1]);
    }

    static {
        rrHh_1.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x96CCB5EB;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-60, -28, -77, -65, 124, -89, -10, 37}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xDF715713300F136EL;
    }

    private static void id_class() {
        boolean[] blArray = new boolean[2];
        blArray[0] = true;
        id_class = blArray;
    }

    private static void id_break() {
        id_break = new byte[]{7, 6, 5, 4, 3, 2};
    }

    private static /* synthetic */ void ntfClinit() {
        rrHh_1.id_class();
        rrHh_1.id_break();
    }
}

