/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrzn_3
extends InputStream {
    public Object[] id_class;
    public static Object[] id_break;
    private static byte[] id_byte;
    private static boolean[] id_protected;
    private static short[] id_throws;
    private static long[] id_case;

    private static void id_byte() {
        Object[] objectArray = new Object[]{2048};
        id_break = objectArray;
    }

    public rrzn_3(InputStream inputStream, byte[] byArray) {
        this.id_break();
        InputStream inputStream2 = inputStream;
        this.id_class[rrzn_3.id_throws[0]] = inputStream2;
        byte[] byArray2 = byArray;
        this.id_class[rrzn_3.id_throws[1]] = byArray2;
    }

    static {
        rrzn_3.ntfClinit();
    }

    @Override
    public synchronized void reset() throws IOException {
        ((InputStream)this.id_class[id_throws[5]]).reset();
    }

    private int id_class(int n) throws IOException {
        int n2;
        if (n == 0) {
            return id_protected[1];
        }
        int n3 = ((InputStream)this.id_class[id_throws[14]]).read();
        rrzn_3 rrzn_32 = this;
        Integer n4 = (Integer)rrzn_32.id_class[id_throws[15]] + id_protected[2];
        rrzn_32.id_class[rrzn_3.id_throws[16]] = n4;
        if (n3 == id_byte[1]) {
            return id_byte[2];
        }
        try {
            for (n2 = id_protected[3]; n2 < n; ++n2) {
                n3 = ((InputStream)this.id_class[id_throws[17]]).read();
                rrzn_3 rrzn_33 = this;
                Integer n5 = (Integer)rrzn_33.id_class[id_throws[18]] + id_protected[4];
                rrzn_33.id_class[rrzn_3.id_throws[19]] = n5;
                if (n3 != id_byte[3]) {
                    continue;
                }
                break;
            }
        }
        catch (IOException iOException) {
            // empty catch block
        }
        return n2;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xF39B6E9248BED6CAL;
    }

    private static void id_class() {
        boolean[] blArray = new boolean[8];
        blArray[0] = true;
        blArray[2] = true;
        blArray[3] = true;
        blArray[4] = true;
        blArray[6] = true;
        id_protected = blArray;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{66, 78, -58, 119, -43, -33, 26, 33}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public int read() throws IOException {
        int n = ((InputStream)this.id_class[id_throws[7]]).read();
        rrzn_3 rrzn_32 = this;
        Integer n2 = (Integer)rrzn_32.id_class[id_throws[8]] + id_protected[0];
        rrzn_32.id_class[rrzn_3.id_throws[9]] = n2;
        if (n == id_byte[0]) {
            return n;
        }
        return (n ^ ((byte[])this.id_class[id_throws[10]])[(Integer)this.id_class[id_throws[11]] % ((byte[])this.id_class[id_throws[12]]).length]) & id_throws[13];
    }

    @Override
    public void close() throws IOException {
        ((InputStream)this.id_class[id_throws[3]]).close();
    }

    @Override
    public synchronized void mark(int n) {
        ((InputStream)this.id_class[id_throws[6]]).mark(n);
    }

    @Override
    public long skip(long l) throws IOException {
        int n;
        long l2;
        if (l <= id_case[0]) {
            return id_case[1];
        }
        int n2 = (int)Math.min(id_case[2], l2);
        for (l2 = l; l2 > id_case[3] && (n = this.id_class((int)Math.min((long)n2, l2))) >= 0; l2 -= (long)n) {
        }
        return l - l2;
    }

    @Override
    public int available() throws IOException {
        return ((InputStream)this.id_class[id_throws[2]]).available();
    }

    @Override
    public boolean markSupported() {
        return ((InputStream)this.id_class[id_throws[4]]).markSupported();
    }

    private void id_break() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[4]];
            objectArray[rrzn_3.id_byte[5]] = id_protected[5];
        }
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x465359DD;
    }

    private static void id_throws() {
        id_byte = new byte[]{-1, -1, -1, -1, 3, 2};
    }

    private static /* synthetic */ void ntfClinit() {
        rrzn_3.id_class();
        rrzn_3.id_protected();
        rrzn_3.id_case();
        rrzn_3.id_throws();
        rrzn_3.id_byte();
    }

    private static void id_case() {
        short[] sArray = new short[21];
        sArray[1] = 1;
        sArray[8] = 2;
        sArray[9] = 2;
        sArray[10] = 1;
        sArray[11] = 2;
        sArray[12] = 1;
        sArray[13] = 255;
        sArray[15] = 2;
        sArray[16] = 2;
        sArray[18] = 2;
        sArray[19] = 2;
        sArray[20] = 2048;
        id_throws = sArray;
    }

    private static void id_protected() {
        long[] lArray = new long[4];
        lArray[2] = 2048L;
        id_case = lArray;
    }
}

