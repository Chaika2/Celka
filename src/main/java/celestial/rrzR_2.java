/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrQO;
import celestial.rrzH_2;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrzR_2 {
    private static byte[] id_break;
    private static int[] id_byte;
    private static boolean[] id_protected;
    private static long[] id_throws;
    public Object[] id_class;
    private static short[] id_case;

    private void id_byte() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[2]];
            objectArray[rrzR_2.id_protected[6]] = id_protected[7];
            objectArray[rrzR_2.id_protected[8]] = id_throws[11];
            objectArray[rrzR_2.id_break[3]] = id_throws[12];
            objectArray[rrzR_2.id_break[4]] = id_throws[13];
        }
    }

    public rrzR_2() {
        this.id_byte();
    }

    static {
        rrzR_2.ntfClinit();
    }

    public void id_class(OutputStream outputStream, long l, boolean bl) throws IOException {
        int n;
        boolean bl2 = bl;
        long l2 = (Long)this.id_class[id_case[0]];
        long l3 = (Long)this.id_class[id_case[1]];
        if (l2 >= id_throws[0]) {
            l2 = id_throws[1];
            bl2 = id_protected[0];
        }
        if (l3 >= id_throws[2]) {
            l3 = id_throws[3];
            bl2 = id_protected[1];
        }
        if ((n = ((Integer)this.id_class[id_case[2]]).intValue()) >= id_byte[0]) {
            n = id_byte[1];
            bl2 = id_protected[2];
        }
        if (bl2) {
            rrQO.id_break(outputStream, id_throws[4]);
            rrQO.id_class(outputStream, id_throws[5]);
            rrQO.id_class(outputStream, (int)id_break[0]);
            rrQO.id_class(outputStream, (int)id_break[1]);
            rrQO.id_break(outputStream, id_throws[6]);
            rrQO.id_break(outputStream, id_throws[7]);
            rrQO.id_class(outputStream, (long)((Integer)this.id_class[id_case[3]]).intValue());
            rrQO.id_class(outputStream, (long)((Integer)this.id_class[id_case[4]]).intValue());
            rrQO.id_class(outputStream, (Long)this.id_class[id_case[5]]);
            rrQO.id_class(outputStream, (Long)this.id_class[id_case[6]]);
            rrQO.id_break(outputStream, id_throws[8]);
            rrQO.id_break(outputStream, id_throws[9]);
            rrQO.id_class(outputStream, l);
            rrQO.id_break(outputStream, id_throws[10]);
        }
        rrQO.id_break(outputStream, (Long)rrzH_2.id_class[id_case[7]]);
        rrQO.id_class(outputStream, id_protected[3]);
        rrQO.id_class(outputStream, id_protected[4]);
        rrQO.id_class(outputStream, n);
        rrQO.id_class(outputStream, n);
        rrQO.id_break(outputStream, l2);
        rrQO.id_break(outputStream, l3);
        rrQO.id_class(outputStream, id_protected[5]);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xAFFCB035440DE0AFL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x532FB88B;
    }

    private static void id_class() {
        long[] lArray = new long[14];
        lArray[0] = 0xFFFFFFFFL;
        lArray[1] = 0xFFFFFFFFL;
        lArray[2] = 0xFFFFFFFFL;
        lArray[3] = 0xFFFFFFFFL;
        lArray[4] = 101075792L;
        lArray[5] = 44L;
        lArray[8] = 117853008L;
        lArray[10] = 1L;
        id_throws = lArray;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{108, 114, -27, 19, 109, 83, -84, -7}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        id_break = new byte[]{45, 45, 4, 2, 3};
    }

    private static void id_throws() {
        id_byte = new int[]{65535, 65535};
    }

    private static /* synthetic */ void ntfClinit() {
        rrzR_2.id_protected();
        rrzR_2.id_class();
        rrzR_2.id_case();
        rrzR_2.id_break();
        rrzR_2.id_throws();
    }

    private static void id_case() {
        short[] sArray = new short[8];
        sArray[0] = 1;
        sArray[1] = 2;
        sArray[5] = 1;
        sArray[6] = 2;
        sArray[7] = 13;
        id_case = sArray;
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[9];
        blArray[0] = true;
        blArray[1] = true;
        blArray[2] = true;
        blArray[8] = true;
        id_protected = blArray;
    }
}

