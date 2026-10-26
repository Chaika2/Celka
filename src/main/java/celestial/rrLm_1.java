/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Om_1;
import celestial.rrQX;
import celestial.rrTi_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLm_1
extends Om_1 {
    public static Object[] id_class;
    private static short[] id_byte;
    private static boolean[] id_protected;
    public Object[] id_break;

    public rrLm_1() {
        this.id_break();
    }

    static {
        rrLm_1.ntfClinit();
    }

    public static rrLm_1 id_class(rrTi_1 rrTi_12) {
        rrLm_1 rrLm_12 = rrLm_1.id_break(rrTi_12);
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_byte[4]]).id_finally().id_class(rrLm_12);
        return rrLm_12;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x6F3A5E25;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-65, -14, 87, 17, 122, 46, 10, 98}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xFBF8AB91429209D4L;
    }

    public rrTi_1 id_class() {
        this.id_break();
        return (rrTi_1)this.id_break[id_byte[5]];
    }

    private void id_break() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_protected[2]];
        }
    }

    public static rrLm_1 id_break(rrTi_1 rrTi_12) {
        rrTi_1 rrTi_13 = rrTi_12;
        ((rrLm_1)rrLm_1.id_class[rrLm_1.id_byte[0]]).id_break[rrLm_1.id_byte[1]] = rrTi_13;
        ((rrLm_1)id_class[id_byte[2]]).id_class(id_protected[0]);
        return (rrLm_1)id_class[id_byte[3]];
    }

    private static void id_throws() {
        Object[] objectArray = new Object[]{new rrLm_1()};
        id_class = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrLm_1.id_protected();
        rrLm_1.id_case();
        rrLm_1.id_throws();
    }

    private static void id_case() {
        id_byte = new short[6];
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[4];
        blArray[2] = true;
        blArray[3] = true;
        id_protected = blArray;
    }
}

