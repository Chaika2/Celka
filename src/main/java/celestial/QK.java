/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rAh_1;
import celestial.rAt_1;
import celestial.rrGP;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class QK
implements AutoCloseable {
    private static short[] id_break;
    public Object[] id_class;
    private static byte[] id_byte;

    public rrGP id_byte() {
        return (rrGP)this.id_class[id_break[5]];
    }

    public QK(rAt_1 rAt_12, rAh_1 rAh_12, rrGP rrGP2) {
        this.id_protected();
        rAt_1 rAt_13 = rAt_12;
        this.id_class[QK.id_break[0]] = rAt_13;
        rAh_1 rAh_13 = rAh_12;
        this.id_class[QK.id_break[1]] = rAh_13;
        rrGP rrGP3 = rrGP2;
        this.id_class[QK.id_break[2]] = rrGP3;
    }

    static {
        QK.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-122, 15, -17, 47, -98, 44, 27, 110}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x69806A262960E26L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xB8B73E46;
    }

    public rAt_1 id_class() {
        return (rAt_1)this.id_class[id_break[3]];
    }

    @Override
    public void close() {
        ((rAt_1)this.id_class[id_break[6]]).close();
        ((rAh_1)this.id_class[id_break[7]]).close();
    }

    public rAh_1 id_break() {
        return (rAh_1)this.id_class[id_break[4]];
    }

    private static void id_throws() {
        short[] sArray = new short[8];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[4] = 1;
        sArray[5] = 2;
        sArray[7] = 1;
        id_break = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        QK.id_throws();
        QK.id_case();
    }

    private static void id_case() {
        id_byte = new byte[]{3};
    }

    private void id_protected() {
        if (this.id_class == null) {
            this.id_class = new Object[3];
        }
    }
}

