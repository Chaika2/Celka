/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rgP_2;
import celestial.rrNC;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrNy_1
implements rrNC {
    private static boolean[] id_break;
    private static long[] id_byte;
    private static short[] id_protected;
    private static byte[] id_throws;
    public Object[] id_class;

    public long id_byte() {
        return (Long)this.id_class[id_protected[1]];
    }

    public rrNy_1(rgP_2 rgP_22, long l, long l2) {
        this.id_protected();
        rgP_2 rgP_23 = rgP_22;
        this.id_class[rrNy_1.id_protected[3]] = rgP_23;
        Long l3 = l;
        this.id_class[rrNy_1.id_protected[4]] = l3;
        Long l4 = l2;
        this.id_class[rrNy_1.id_protected[5]] = l4;
    }

    static {
        rrNy_1.ntfClinit();
    }

    @Override
    public rgP_2 id_class() {
        return (rgP_2)this.id_class[id_protected[0]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xA16F3E9B6AF326ADL;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{42, 63, -34, -8, -30, -70, 43, 45}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xC66B28A0;
    }

    public long id_break() {
        return (Long)this.id_class[id_protected[2]];
    }

    private static void id_throws() {
        id_byte = new long[2];
    }

    private static /* synthetic */ void ntfClinit() {
        rrNy_1.id_private();
        rrNy_1.id_throws();
        rrNy_1.id_case();
        rrNy_1.id_catch();
    }

    private static void id_catch() {
        id_throws = new byte[]{3, 2};
    }

    private static void id_case() {
        short[] sArray = new short[6];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[4] = 1;
        sArray[5] = 2;
        id_protected = sArray;
    }

    private void id_protected() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_throws[0]];
            objectArray[rrNy_1.id_break[0]] = id_byte[0];
            objectArray[rrNy_1.id_throws[1]] = id_byte[1];
        }
    }

    private static void id_private() {
        id_break = new boolean[]{true};
    }
}

