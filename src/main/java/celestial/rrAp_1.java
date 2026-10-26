/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Om_1;
import celestial.rdn_3;
import celestial.rhd_3;
import celestial.rrQX;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAp_1
extends Om_1 {
    public static Object[] id_class;
    public Object[] id_break;
    private static boolean[] id_byte;
    private static byte[] id_protected;
    private static short[] id_throws;

    public rrAp_1() {
        this.id_case();
    }

    static {
        rrAp_1.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xA1354836;
    }

    public static void id_class(rhd_3 rhd_32, rdn_3 rdn_32) {
        rrAp_1 rrAp_12 = rrAp_1.id_break(rhd_32, rdn_32);
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_throws[6]]).id_finally().id_class(rrAp_12);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xC8021C84B6504301L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-55, -9, 124, 118, -12, 49, 89, 71}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public rdn_3 id_class() {
        this.id_case();
        return (rdn_3)this.id_break[id_throws[8]];
    }

    private static rrAp_1 id_break(rhd_3 rhd_32, rdn_3 rdn_32) {
        rhd_3 rhd_33 = rhd_32;
        ((rrAp_1)rrAp_1.id_class[rrAp_1.id_throws[0]]).id_break[rrAp_1.id_throws[1]] = rhd_33;
        rdn_3 rdn_33 = rdn_32;
        ((rrAp_1)rrAp_1.id_class[rrAp_1.id_throws[2]]).id_break[rrAp_1.id_throws[3]] = rdn_33;
        ((rrAp_1)id_class[id_throws[4]]).id_class(id_byte[0]);
        return (rrAp_1)id_class[id_throws[5]];
    }

    public rhd_3 id_break() {
        this.id_case();
        return (rhd_3)this.id_break[id_throws[7]];
    }

    private static void id_throws() {
        short[] sArray = new short[9];
        sArray[3] = 1;
        sArray[8] = 1;
        id_throws = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrAp_1.id_catch();
        rrAp_1.id_throws();
        rrAp_1.id_protected();
        rrAp_1.id_private();
    }

    private static void id_catch() {
        boolean[] blArray = new boolean[3];
        blArray[2] = true;
        id_byte = blArray;
    }

    private void id_case() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_protected[0]];
        }
    }

    private static void id_protected() {
        id_protected = new byte[]{2};
    }

    private static void id_private() {
        Object[] objectArray = new Object[]{new rrAp_1()};
        id_class = objectArray;
    }
}

