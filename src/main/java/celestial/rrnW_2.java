/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfH_2;
import celestial.rfj_3;
import celestial.xc_3;
import celestial.xd_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnW_2 {
    private static short[] id_break;
    public Object[] id_class;
    private static byte[] id_byte;

    public rfj_3 id_byte() {
        return (rfj_3)this.id_class[id_break[3]];
    }

    public rrnW_2(rfH_2 rfH_22, xc_3 xc_32, xd_3 xd_32, rfj_3 rfj_32) {
        this.id_catch();
        rfH_2 rfH_23 = rfH_22;
        this.id_class[rrnW_2.id_break[4]] = rfH_23;
        xc_3 xc_33 = xc_32;
        this.id_class[rrnW_2.id_break[5]] = xc_33;
        xd_3 xd_33 = xd_32;
        this.id_class[rrnW_2.id_break[6]] = xd_33;
        rfj_3 rfj_33 = rfj_32;
        this.id_class[rrnW_2.id_break[7]] = rfj_33;
    }

    static {
        rrnW_2.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x5181F141;
    }

    public xd_3 id_class() {
        return (xd_3)this.id_class[id_break[2]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-51, -44, -17, -42, 3, -11, 38, 114}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xFA19F4BFCBC66008L;
    }

    public rfH_2 id_break() {
        return (rfH_2)this.id_class[id_break[0]];
    }

    private static void id_throws() {
        id_byte = new byte[]{4};
    }

    private static /* synthetic */ void ntfClinit() {
        rrnW_2.id_case();
        rrnW_2.id_throws();
    }

    private void id_catch() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
        }
    }

    private static void id_case() {
        short[] sArray = new short[8];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[3] = 3;
        sArray[5] = 1;
        sArray[6] = 2;
        sArray[7] = 3;
        id_break = sArray;
    }

    public xc_3 id_protected() {
        return (xc_3)this.id_class[id_break[1]];
    }
}

