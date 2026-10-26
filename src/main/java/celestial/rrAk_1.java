/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Om_1;
import celestial.rff_3;
import celestial.rjB_2;
import celestial.xc_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAk_1
extends Om_1 {
    private static boolean[] id_byte;
    public static Object[] id_class;
    public Object[] id_break;
    private static byte[] id_protected;
    private static short[] id_throws;

    public rrAk_1() {
        this.id_private();
    }

    static {
        rrAk_1.ntfClinit();
    }

    public void id_class(xc_3 xc_32) {
        this.id_private();
        xc_3 xc_33 = xc_32;
        this.id_break[rrAk_1.id_throws[12]] = xc_33;
    }

    public xc_3 id_class() {
        this.id_private();
        return (xc_3)this.id_break[id_throws[9]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-12, -49, 79, 70, -29, 66, -51, -86}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x48CEFBB1EB13DD96L;
    }

    public void id_class(rjB_2 rjB_22) {
        this.id_private();
        rjB_2 rjB_23 = rjB_22;
        this.id_break[rrAk_1.id_throws[11]] = rjB_23;
    }

    public static rrAk_1 id_class(rff_3 rff_32, rjB_2 rjB_22, xc_3 xc_32) {
        rff_3 rff_33 = rff_32;
        ((rrAk_1)rrAk_1.id_class[rrAk_1.id_throws[0]]).id_break[rrAk_1.id_throws[1]] = rff_33;
        rjB_2 rjB_23 = rjB_22;
        ((rrAk_1)rrAk_1.id_class[rrAk_1.id_throws[2]]).id_break[rrAk_1.id_throws[3]] = rjB_23;
        xc_3 xc_33 = xc_32;
        ((rrAk_1)rrAk_1.id_class[rrAk_1.id_throws[4]]).id_break[rrAk_1.id_throws[5]] = xc_33;
        return (rrAk_1)id_class[id_throws[6]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xDAD0990C;
    }

    public void id_class(rff_3 rff_32) {
        this.id_private();
        rff_3 rff_33 = rff_32;
        this.id_break[rrAk_1.id_throws[10]] = rff_33;
    }

    public rff_3 id_break() {
        this.id_private();
        return (rff_3)this.id_break[id_throws[7]];
    }

    private static void id_throws() {
        short[] sArray = new short[13];
        sArray[3] = 1;
        sArray[5] = 2;
        sArray[8] = 1;
        sArray[9] = 2;
        sArray[11] = 1;
        sArray[12] = 2;
        id_throws = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrAk_1.id_catch();
        rrAk_1.id_throws();
        rrAk_1.id_implements();
        rrAk_1.id_case();
    }

    private static void id_catch() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_byte = blArray;
    }

    private static void id_case() {
        Object[] objectArray = new Object[]{new rrAk_1()};
        id_class = objectArray;
    }

    private static void id_implements() {
        id_protected = new byte[]{3};
    }

    public rjB_2 id_protected() {
        this.id_private();
        return (rjB_2)this.id_break[id_throws[8]];
    }

    private void id_private() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_protected[0]];
        }
    }
}

