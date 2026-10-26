/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_break;
import celestial.rgP_2;
import celestial.rnB_2;
import celestial.rrQX;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLv_1 {
    public static Object[] id_class;
    private static byte[] id_byte;
    private static boolean[] id_protected;
    private static short[] id_throws;
    public Object[] id_break;

    private static void id_byte() {
        short[] sArray = new short[10];
        sArray[1] = 1;
        sArray[8] = 1;
        sArray[9] = 1;
        id_throws = sArray;
    }

    public rrLv_1() {
        this.id_case();
    }

    static {
        rrLv_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x73A6C70919FE0505L;
    }

    public void id_class(rgP_2 rgP_22) {
        rgP_2 rgP_23 = rgP_22;
        this.id_break[rrLv_1.id_throws[9]] = rgP_23;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x2D4C4B3;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-93, -58, 54, -88, 94, -42, -111, -65}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public rgP_2 id_class() {
        return (rgP_2)this.id_break[id_throws[8]];
    }

    public static rrLv_1 id_class(rnB_2 rnB_22, rgP_2 rgP_22) {
        rrLv_1 rrLv_12 = rrLv_1.id_break(rnB_22, rgP_22);
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_throws[5]]).id_finally().id_class(rrLv_12);
        ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[id_throws[6]]).id_class(rrLv_12);
        return rrLv_12;
    }

    public static rrLv_1 id_break(rnB_2 rnB_22, rgP_2 rgP_22) {
        rgP_2 rgP_23 = rgP_22;
        ((rrLv_1)rrLv_1.id_class[rrLv_1.id_throws[0]]).id_break[rrLv_1.id_throws[1]] = rgP_23;
        rnB_2 rnB_23 = rnB_22;
        ((rrLv_1)rrLv_1.id_class[rrLv_1.id_throws[2]]).id_break[rrLv_1.id_throws[3]] = rnB_23;
        return (rrLv_1)id_class[id_throws[4]];
    }

    public rnB_2 id_break() {
        return (rnB_2)this.id_break[id_throws[7]];
    }

    private static void id_throws() {
        Object[] objectArray = new Object[]{new rrLv_1()};
        id_class = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrLv_1.id_catch();
        rrLv_1.id_byte();
        rrLv_1.id_protected();
        rrLv_1.id_throws();
    }

    private static void id_catch() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_protected = blArray;
    }

    private void id_case() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_byte[0]];
        }
    }

    private static void id_protected() {
        id_byte = new byte[]{2};
    }
}

