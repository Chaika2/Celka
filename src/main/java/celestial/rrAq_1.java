/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_break;
import celestial.rJY;
import celestial.rJr_1;
import celestial.rdn_3;
import celestial.rrQX;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAq_1 {
    private static boolean[] id_byte;
    private static short[] id_protected;
    private static byte[] id_throws;
    public static Object[] id_class;
    public Object[] id_break;

    public rdn_3 id_byte() {
        return (rdn_3)this.id_break[id_protected[11]];
    }

    public rrAq_1() {
        this.id_throws();
    }

    static {
        rrAq_1.ntfClinit();
    }

    public rJY id_class() {
        return (rJY)this.id_break[id_protected[10]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{52, -22, -72, 54, 81, 68, -16, -101}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x24474FADADFC46B4L;
    }

    public static rrAq_1 id_class(rJr_1 rJr_12, rJY rJY2, rdn_3 rdn_32) {
        rJr_1 rJr_13 = rJr_12;
        ((rrAq_1)rrAq_1.id_class[rrAq_1.id_protected[0]]).id_break[rrAq_1.id_protected[1]] = rJr_13;
        rJY rJY3 = rJY2;
        ((rrAq_1)rrAq_1.id_class[rrAq_1.id_protected[2]]).id_break[rrAq_1.id_protected[3]] = rJY3;
        rdn_3 rdn_33 = rdn_32;
        ((rrAq_1)rrAq_1.id_class[rrAq_1.id_protected[4]]).id_break[rrAq_1.id_protected[5]] = rdn_33;
        return (rrAq_1)id_class[id_protected[6]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x9E44E52;
    }

    public rJr_1 id_break() {
        return (rJr_1)this.id_break[id_protected[9]];
    }

    public static void id_break(rJr_1 rJr_12, rJY rJY2, rdn_3 rdn_32) {
        rrAq_1 rrAq_12 = rrAq_1.id_class(rJr_12, rJY2, rdn_32);
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[7]]).id_finally().id_class(rrAq_12);
        ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[id_protected[8]]).id_class(rrAq_12);
    }

    private void id_throws() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_throws[0]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrAq_1.id_catch();
        rrAq_1.id_case();
        rrAq_1.id_protected();
        rrAq_1.id_private();
    }

    private static void id_catch() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_byte = blArray;
    }

    private static void id_case() {
        short[] sArray = new short[12];
        sArray[3] = 1;
        sArray[5] = 2;
        sArray[10] = 1;
        sArray[11] = 2;
        id_protected = sArray;
    }

    private static void id_protected() {
        id_throws = new byte[]{3};
    }

    private static void id_private() {
        Object[] objectArray = new Object[]{new rrAq_1()};
        id_class = objectArray;
    }
}

