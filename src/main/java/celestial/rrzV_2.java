/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrzf_3;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Set;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrzV_2
extends InflaterInputStream {
    private static long[] id_break;
    private static String[] id_byte;
    private static int[] id_protected;
    private static short[] id_throws;
    private static byte[] id_case;
    public Object[] id_class;
    private static boolean[] id_catch;

    private static void id_byte() {
        id_case = new byte[]{-1, 4, 2};
    }

    public rrzV_2(rrzf_3 rrzf_32, InputStream inputStream, Inflater inflater, int n, long l) {
        super(inputStream, inflater, n);
        this.id_protected();
        rrzf_3 rrzf_33 = rrzf_32;
        this.id_class[rrzV_2.id_throws[0]] = rrzf_33;
        Long l2 = l;
        this.id_class[rrzV_2.id_throws[1]] = l2;
        Boolean bl = id_catch[0];
        this.id_class[rrzV_2.id_throws[2]] = bl;
    }

    static {
        rrzV_2.ntfClinit();
    }

    @Override
    public void fill() throws IOException {
        if (((Boolean)this.id_class[id_throws[8]]).booleanValue()) {
            throw new EOFException(id_byte[0]);
        }
        this.len = this.in.read(this.buf, id_catch[2], this.buf.length);
        if (this.len == id_case[0]) {
            this.buf[rrzV_2.id_catch[3]] = id_catch[4];
            this.len = id_catch[5];
            Boolean bl = id_catch[6];
            this.id_class[rrzV_2.id_throws[9]] = bl;
        }
        this.inf.setInput(this.buf, id_catch[7], this.len);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{11, -125, -123, -96, -56, 10, -6, 83}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x9E043F5FD69252B1L;
    }

    private static void id_class() {
        boolean[] blArray = new boolean[13];
        blArray[1] = true;
        blArray[5] = true;
        blArray[6] = true;
        blArray[11] = true;
        id_catch = blArray;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x898AE3AA;
    }

    @Override
    public void close() throws IOException {
        if (!((Boolean)this.id_class[id_throws[3]]).booleanValue()) {
            ((rrzf_3)this.id_class[id_throws[4]]).id_class(this.inf);
            this.in.close();
            Boolean bl = id_catch[1];
            this.id_class[rrzV_2.id_throws[5]] = bl;
            ((Set)((rrzf_3)this.id_class[rrzV_2.id_throws[6]]).id_break[id_throws[7]]).remove(this);
        }
    }

    @Override
    public int available() {
        if (((Boolean)this.id_class[id_throws[10]]).booleanValue()) {
            return id_catch[8];
        }
        long l = (Long)this.id_class[id_throws[11]] - this.inf.getBytesWritten();
        return l > id_break[0] ? id_protected[0] : (int)l;
    }

    private static void id_break() {
        id_protected = new int[]{Integer.MAX_VALUE};
    }

    private static void id_throws() {
        short[] sArray = new short[12];
        sArray[0] = 3;
        sArray[1] = 2;
        sArray[4] = 3;
        sArray[6] = 3;
        sArray[7] = 17;
        sArray[8] = 1;
        sArray[9] = 1;
        sArray[11] = 2;
        id_throws = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrzV_2.id_class();
        rrzV_2.id_case();
        rrzV_2.id_catch();
        rrzV_2.id_throws();
        rrzV_2.id_byte();
        rrzV_2.id_break();
    }

    private static void id_catch() {
        long[] lArray = new long[2];
        lArray[0] = Integer.MAX_VALUE;
        id_break = lArray;
    }

    private static void id_case() {
        id_byte = new String[]{new String("Unexpected end of ZLIB input stream")};
    }

    private void id_protected() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_case[1]];
            objectArray[rrzV_2.id_catch[9]] = id_catch[10];
            objectArray[rrzV_2.id_catch[11]] = id_catch[12];
            objectArray[rrzV_2.id_case[2]] = id_break[1];
        }
    }
}

