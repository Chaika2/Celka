/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iJ_2;
import celestial.ix_3;
import celestial.rXQ;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfS_2 {
    private static byte[] id_break;
    private static short[] id_byte;
    public Object[] id_class;

    public ix_3 id_byte() {
        return (ix_3)this.id_class[id_byte[1]];
    }

    public rrfS_2(iJ_2 iJ_22, ix_3 ix_32, rXQ rXQ2) {
        this.id_throws();
        iJ_2 iJ_23 = iJ_22;
        this.id_class[rrfS_2.id_byte[3]] = iJ_23;
        ix_3 ix_33 = ix_32;
        this.id_class[rrfS_2.id_byte[4]] = ix_33;
        rXQ rXQ3 = rXQ2;
        this.id_class[rrfS_2.id_byte[5]] = rXQ3;
    }

    static {
        rrfS_2.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xE7DD1D69;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x11A4F0BE59B48E25L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-9, -100, 29, 47, -25, 74, 87, 11}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public iJ_2 id_class() {
        return (iJ_2)this.id_class[id_byte[0]];
    }

    public rXQ id_break() {
        return (rXQ)((Object)this.id_class[id_byte[2]]);
    }

    private void id_throws() {
        if (this.id_class == null) {
            this.id_class = new Object[3];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrfS_2.id_case();
        rrfS_2.id_protected();
    }

    private static void id_case() {
        short[] sArray = new short[6];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[4] = 1;
        sArray[5] = 2;
        id_byte = sArray;
    }

    private static void id_protected() {
        id_break = new byte[]{3};
    }
}

