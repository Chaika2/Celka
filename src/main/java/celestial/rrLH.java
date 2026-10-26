/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Om_1;
import celestial.rfH_2;
import celestial.rrLy_1;
import celestial.xc_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLH
extends Om_1 {
    private static byte[] id_byte;
    private static boolean[] id_protected;
    public Object[] id_class;
    private static short[] id_throws;
    public static Object[] id_break;

    public rrLH() {
        this.id_throws();
    }

    static {
        rrLH.ntfClinit();
    }

    public xc_3 id_class() {
        this.id_throws();
        return (xc_3)this.id_class[id_throws[8]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{3, 52, 83, -94, -81, -18, 110, 58}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static rrLH id_class(rfH_2 rfH_22, xc_3 xc_32, rrLy_1 rrLy_12) {
        rfH_2 rfH_23 = rfH_22;
        ((rrLH)rrLH.id_break[rrLH.id_throws[0]]).id_class[rrLH.id_throws[1]] = rfH_23;
        xc_3 xc_33 = xc_32;
        ((rrLH)rrLH.id_break[rrLH.id_throws[2]]).id_class[rrLH.id_throws[3]] = xc_33;
        rrLy_1 rrLy_13 = rrLy_12;
        ((rrLH)rrLH.id_break[rrLH.id_throws[4]]).id_class[rrLH.id_throws[5]] = rrLy_13;
        return (rrLH)id_break[id_throws[6]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xE3344D4A;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xD78E9D7571B3D940L;
    }

    public rfH_2 id_break() {
        this.id_throws();
        return (rfH_2)this.id_class[id_throws[7]];
    }

    private void id_throws() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrLH.id_catch();
        rrLH.id_case();
        rrLH.id_implements();
        rrLH.id_private();
    }

    private static void id_catch() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_protected = blArray;
    }

    private static void id_case() {
        short[] sArray = new short[10];
        sArray[3] = 1;
        sArray[5] = 2;
        sArray[8] = 1;
        sArray[9] = 2;
        id_throws = sArray;
    }

    private static void id_implements() {
        id_byte = new byte[]{3};
    }

    public rrLy_1 id_protected() {
        this.id_throws();
        return (rrLy_1)((Object)this.id_class[id_throws[9]]);
    }

    private static void id_private() {
        Object[] objectArray = new Object[]{new rrLH()};
        id_break = objectArray;
    }
}

