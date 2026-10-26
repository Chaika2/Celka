/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrzY_2;
import celestial.rrzf_3;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrza_3
extends OutputStream {
    private static boolean[] id_break;
    private static byte[] id_byte;
    private static long[] id_protected;
    public Object[] id_class;
    private static short[] id_throws;

    public byte[] id_byte() {
        return (ByteArrayOutputStream)this.id_class[id_throws[35]] == null ? null : ((ByteArrayOutputStream)this.id_class[id_throws[36]]).toByteArray();
    }

    public rrza_3(rrzf_3 rrzf_32, rrzY_2 rrzY_22) {
        this.id_catch();
        rrzf_3 rrzf_33 = rrzf_32;
        this.id_class[rrza_3.id_throws[0]] = rrzf_33;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(id_throws[1]);
        this.id_class[rrza_3.id_throws[2]] = byteArrayOutputStream;
        Long l = id_protected[0];
        this.id_class[rrza_3.id_throws[3]] = l;
        rrzY_2 rrzY_23 = rrzY_22;
        this.id_class[rrza_3.id_throws[4]] = rrzY_23;
    }

    static {
        rrza_3.ntfClinit();
    }

    @Override
    public void flush() throws IOException {
        if ((OutputStream)this.id_class[id_throws[15]] != null) {
            ((OutputStream)this.id_class[id_throws[16]]).flush();
        }
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-59, -66, 61, 100, 60, -40, 82, -127}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        id_byte = new byte[]{5, 3};
    }

    private void id_class(byte[] byArray, int n, int n2) throws IOException {
        ((OutputStream)this.id_class[id_throws[23]]).write(byArray, n, n2);
        rrza_3 rrza_32 = this;
        Long l = (Long)rrza_32.id_class[id_throws[24]] + (long)n2;
        rrza_32.id_class[rrza_3.id_throws[25]] = l;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x5FA4FBB011CA9ED3L;
    }

    private void id_class(int n) throws IOException {
        ((OutputStream)this.id_class[id_throws[20]]).write(n);
        rrza_3 rrza_32 = this;
        Long l = (Long)rrza_32.id_class[id_throws[21]] + id_protected[5];
        rrza_32.id_class[rrza_3.id_throws[22]] = l;
    }

    @Override
    public void write(byte[] byArray) throws IOException {
        this.write(byArray, id_break[0], byArray.length);
    }

    @Override
    public void write(int n) throws IOException {
        if ((OutputStream)this.id_class[id_throws[5]] != null) {
            this.id_class(n);
            return;
        }
        if ((Long)this.id_class[id_throws[6]] + id_protected[1] < id_protected[2]) {
            ((ByteArrayOutputStream)this.id_class[id_throws[7]]).write(n);
            rrza_3 rrza_32 = this;
            Long l = (Long)rrza_32.id_class[id_throws[8]] + id_protected[3];
            rrza_32.id_class[rrza_3.id_throws[9]] = l;
            return;
        }
        this.id_throws();
        this.id_class(n);
    }

    @Override
    public void write(byte[] byArray, int n, int n2) throws IOException {
        if ((OutputStream)this.id_class[id_throws[10]] != null) {
            this.id_class(byArray, n, n2);
            return;
        }
        if ((Long)this.id_class[id_throws[11]] + (long)n2 < id_protected[4]) {
            ((ByteArrayOutputStream)this.id_class[id_throws[12]]).write(byArray, n, n2);
            rrza_3 rrza_32 = this;
            Long l = (Long)rrza_32.id_class[id_throws[13]] + (long)n2;
            rrza_32.id_class[rrza_3.id_throws[14]] = l;
            return;
        }
        this.id_throws();
        this.id_class(byArray, n, n2);
    }

    @Override
    public void close() throws IOException {
        Object var5_1 = null;
        this.id_class[rrza_3.id_throws[17]] = var5_1;
        if ((OutputStream)this.id_class[id_throws[18]] != null) {
            ((OutputStream)this.id_class[id_throws[19]]).close();
        }
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xAB9F6208;
    }

    private static void id_break() {
        short[] sArray = new short[37];
        sArray[0] = 4;
        sArray[1] = 8192;
        sArray[3] = 3;
        sArray[4] = 1;
        sArray[5] = 2;
        sArray[6] = 3;
        sArray[8] = 3;
        sArray[9] = 3;
        sArray[10] = 2;
        sArray[11] = 3;
        sArray[13] = 3;
        sArray[14] = 3;
        sArray[15] = 2;
        sArray[16] = 2;
        sArray[18] = 2;
        sArray[19] = 2;
        sArray[20] = 2;
        sArray[21] = 3;
        sArray[22] = 3;
        sArray[23] = 2;
        sArray[24] = 3;
        sArray[25] = 3;
        sArray[26] = 1;
        sArray[27] = 4;
        sArray[28] = 1;
        sArray[29] = 1;
        sArray[30] = 1;
        sArray[31] = 2;
        sArray[33] = 2;
        id_throws = sArray;
    }

    private void id_throws() throws IOException {
        Path path = ((rrzf_3)this.id_class[id_throws[27]]).id_finally(null);
        ((rrzY_2)this.id_class[rrza_3.id_throws[26]]).id_class[rrza_3.id_throws[28]] = path;
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(Files.newOutputStream((Path)((rrzY_2)this.id_class[rrza_3.id_throws[29]]).id_class[id_throws[30]], new OpenOption[id_break[1]]));
        this.id_class[rrza_3.id_throws[31]] = bufferedOutputStream;
        ((ByteArrayOutputStream)this.id_class[id_throws[32]]).writeTo((OutputStream)this.id_class[id_throws[33]]);
        Object var7_3 = null;
        this.id_class[rrza_3.id_throws[34]] = var7_3;
    }

    private static /* synthetic */ void ntfClinit() {
        rrza_3.id_protected();
        rrza_3.id_case();
        rrza_3.id_break();
        rrza_3.id_class();
    }

    private void id_catch() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
            objectArray[rrza_3.id_byte[1]] = id_protected[6];
        }
    }

    private static void id_case() {
        long[] lArray = new long[7];
        lArray[1] = 1L;
        lArray[2] = 0xA00000L;
        lArray[3] = 1L;
        lArray[4] = 0xA00000L;
        lArray[5] = 1L;
        id_protected = lArray;
    }

    private static void id_protected() {
        id_break = new boolean[2];
    }
}

