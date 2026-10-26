/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrNd_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrNv_1 {
    public Object[] id_class;
    private static boolean[] id_break;
    private static long[] id_byte;
    private static byte[] id_protected;
    private static short[] id_throws;

    public List<rrNd_1> id_byte() {
        return (List)this.id_class[id_throws[0]];
    }

    public rrNv_1(List<rrNd_1> list, long l, boolean bl) {
        List<rrNd_1> list2;
        this.id_case();
        this.id_class[rrNv_1.id_throws[3]] = list2 = list;
        Long l2 = l;
        this.id_class[rrNv_1.id_throws[4]] = l2;
        Boolean bl2 = bl;
        this.id_class[rrNv_1.id_throws[5]] = bl2;
    }

    static {
        rrNv_1.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-65, -100, 115, 67, 22, 89, 86, -90}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xF8E2E942;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x2983E7E75F3D1420L;
    }

    public boolean id_class() {
        return (Boolean)this.id_class[id_throws[2]];
    }

    public long id_break() {
        return (Long)this.id_class[id_throws[1]];
    }

    private static void id_throws() {
        id_byte = new long[1];
    }

    private static /* synthetic */ void ntfClinit() {
        rrNv_1.id_private();
        rrNv_1.id_throws();
        rrNv_1.id_catch();
        rrNv_1.id_protected();
    }

    private static void id_catch() {
        short[] sArray = new short[6];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[4] = 1;
        sArray[5] = 2;
        id_throws = sArray;
    }

    private void id_case() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[0]];
            objectArray[rrNv_1.id_break[0]] = id_byte[0];
            objectArray[rrNv_1.id_protected[1]] = id_break[1];
        }
    }

    private static void id_protected() {
        id_protected = new byte[]{3, 2};
    }

    private static void id_private() {
        boolean[] blArray = new boolean[2];
        blArray[0] = true;
        id_break = blArray;
    }
}

