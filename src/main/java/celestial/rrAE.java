/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Om_1;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rrjc_3;
import celestial.xd_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAE
extends Om_1 {
    private static byte[] id_byte;
    public static Object[] id_class;
    public Object[] id_break;
    private static short[] id_protected;
    private static boolean[] id_throws;

    public rrAE() {
        this.id_private();
    }

    static {
        rrAE.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xCDE6C308;
    }

    public xd_3 id_class() {
        this.id_private();
        return (xd_3)this.id_break[id_protected[10]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xFB9C8C0ADDF5B0A2L;
    }

    public static rrAE id_class(rfH_2 rfH_22, rdn_3 rdn_32) {
        rdn_3 rdn_33 = rdn_32;
        ((rrAE)rrAE.id_class[rrAE.id_protected[0]]).id_break[rrAE.id_protected[1]] = rdn_33;
        rfH_2 rfH_23 = rfH_22;
        ((rrAE)rrAE.id_class[rrAE.id_protected[2]]).id_break[rrAE.id_protected[3]] = rfH_23;
        xd_3 xd_32 = rrjc_3.id_protected(rfH_22);
        ((rrAE)rrAE.id_class[rrAE.id_protected[4]]).id_break[rrAE.id_protected[5]] = xd_32;
        ((rrAE)id_class[id_protected[6]]).id_class(id_throws[0]);
        return (rrAE)id_class[id_protected[7]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-69, 91, 55, -119, 23, -82, -61, 100}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public rfH_2 id_break() {
        this.id_private();
        return (rfH_2)this.id_break[id_protected[9]];
    }

    private static void id_throws() {
        id_byte = new byte[]{3};
    }

    private static /* synthetic */ void ntfClinit() {
        rrAE.id_case();
        rrAE.id_implements();
        rrAE.id_throws();
        rrAE.id_catch();
    }

    private static void id_catch() {
        Object[] objectArray = new Object[]{new rrAE()};
        id_class = objectArray;
    }

    private static void id_case() {
        boolean[] blArray = new boolean[3];
        blArray[2] = true;
        id_throws = blArray;
    }

    private static void id_implements() {
        short[] sArray = new short[11];
        sArray[3] = 1;
        sArray[5] = 2;
        sArray[9] = 1;
        sArray[10] = 2;
        id_protected = sArray;
    }

    public rdn_3 id_protected() {
        this.id_private();
        return (rdn_3)this.id_break[id_protected[8]];
    }

    private void id_private() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_byte[0]];
        }
    }
}

