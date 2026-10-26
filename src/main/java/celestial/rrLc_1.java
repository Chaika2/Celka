/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_break;
import celestial.Om_1;
import celestial.rrQX;
import celestial.rrTi_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLc_1
extends Om_1 {
    public static Object[] id_class;
    public Object[] id_break;
    private static boolean[] id_byte;
    private static short[] id_protected;

    public rrLc_1() {
        this.id_case();
    }

    static {
        rrLc_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x1D4D1E693617AD07L;
    }

    public rrTi_1 id_class() {
        this.id_case();
        return (rrTi_1)this.id_break[id_protected[6]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-27, 85, -35, -30, -53, 107, -8, 109}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x72528E3C;
    }

    public static rrLc_1 id_class(rrTi_1 rrTi_12) {
        rrTi_1 rrTi_13 = rrTi_12;
        ((rrLc_1)rrLc_1.id_class[rrLc_1.id_protected[0]]).id_break[rrLc_1.id_protected[1]] = rrTi_13;
        ((rrLc_1)id_class[id_protected[2]]).id_class(id_byte[0]);
        return (rrLc_1)id_class[id_protected[3]];
    }

    private static void id_break() {
        id_protected = new short[7];
    }

    public static rrLc_1 id_break(rrTi_1 rrTi_12) {
        rrLc_1 rrLc_12 = rrLc_1.id_class(rrTi_12);
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[4]]).id_finally().id_class(rrLc_12);
        ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[id_protected[5]]).id_class(rrLc_12);
        return rrLc_12;
    }

    private static void id_throws() {
        Object[] objectArray = new Object[]{new rrLc_1()};
        id_class = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrLc_1.id_protected();
        rrLc_1.id_break();
        rrLc_1.id_throws();
    }

    private void id_case() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_byte[2]];
        }
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[4];
        blArray[2] = true;
        blArray[3] = true;
        id_byte = blArray;
    }
}

