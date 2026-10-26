/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Om_1;
import celestial.rjU_2;
import celestial.xd_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAb_1
extends Om_1 {
    private static byte[] id_byte;
    private static boolean[] id_protected;
    public Object[] id_class;
    public static Object[] id_break;
    private static short[] id_throws;

    public rrAb_1() {
        this.id_throws();
    }

    static {
        rrAb_1.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-68, -66, -94, 25, 66, 98, -124, 73}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static rrAb_1 id_class(xd_3 xd_32, rjU_2 rjU_22) {
        ((rrAb_1)id_break[id_throws[0]]).id_class(xd_32);
        ((rrAb_1)id_break[id_throws[1]]).id_class(rjU_22);
        ((rrAb_1)id_break[id_throws[2]]).id_class(id_protected[0]);
        return (rrAb_1)id_break[id_throws[3]];
    }

    public xd_3 id_class() {
        this.id_throws();
        return (xd_3)this.id_class[id_throws[4]];
    }

    public void id_class(rjU_2 rjU_22) {
        this.id_throws();
        rjU_2 rjU_23 = rjU_22;
        this.id_class[rrAb_1.id_throws[7]] = rjU_23;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x80AAC703723C1279L;
    }

    public void id_class(xd_3 xd_32) {
        this.id_throws();
        xd_3 xd_33 = xd_32;
        this.id_class[rrAb_1.id_throws[6]] = xd_33;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xEFA29AA2;
    }

    public rjU_2 id_break() {
        this.id_throws();
        return (rjU_2)this.id_class[id_throws[5]];
    }

    private void id_throws() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrAb_1.id_private();
        rrAb_1.id_protected();
        rrAb_1.id_catch();
        rrAb_1.id_case();
    }

    private static void id_catch() {
        id_byte = new byte[]{2};
    }

    private static void id_case() {
        Object[] objectArray = new Object[]{new rrAb_1()};
        id_break = objectArray;
    }

    private static void id_protected() {
        short[] sArray = new short[8];
        sArray[5] = 1;
        sArray[7] = 1;
        id_throws = sArray;
    }

    private static void id_private() {
        boolean[] blArray = new boolean[3];
        blArray[2] = true;
        id_protected = blArray;
    }
}

