/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrzH_2;
import celestial.rrzY_2;
import celestial.rrzf_3;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Set;
import java.util.zip.ZipException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrzo_3
extends InputStream {
    private static long[] id_break;
    private static byte[] id_byte;
    private static boolean[] id_protected;
    public Object[] id_class;
    private static int[] id_throws;
    private static short[] id_case;

    private static void id_byte() {
        boolean[] blArray = new boolean[9];
        blArray[1] = true;
        blArray[3] = true;
        blArray[4] = true;
        blArray[8] = true;
        id_protected = blArray;
    }

    public rrzo_3(rrzf_3 rrzf_32, rrzY_2 rrzY_22) throws IOException {
        this.id_case();
        rrzf_3 rrzf_33 = rrzf_32;
        this.id_class[rrzo_3.id_case[0]] = rrzf_33;
        Long l = (long)((Long)rrzY_22.id_class[id_case[1]]);
        this.id_class[rrzo_3.id_case[2]] = l;
        Long l2 = (long)((Long)rrzY_22.id_class[id_case[3]]);
        this.id_class[rrzo_3.id_case[4]] = l2;
        if ((Long)this.id_class[id_case[5]] == id_break[0]) {
            rrzY_2 rrzY_23 = rrzf_32.id_private((byte[])rrzY_22.id_protected[id_case[6]]);
            if (rrzY_23 == null) {
                throw new ZipException("invalid loc for entry <" + rrzf_32.id_throws((byte[])rrzY_22.id_protected[id_case[7]]) + ">");
            }
            Long l3 = (long)((Long)rrzY_23.id_class[id_case[8]]);
            this.id_class[rrzo_3.id_case[9]] = l3;
        }
        Long l4 = -((Long)this.id_class[id_case[10]]).longValue();
        this.id_class[rrzo_3.id_case[11]] = l4;
    }

    static {
        rrzo_3.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xDC3C23216870EE19L;
    }

    private static void id_class() {
        id_throws = new int[]{Integer.MAX_VALUE};
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x1EAD80FC;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-101, -21, -3, -36, -20, -60, 94, 56}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public int read(byte[] byArray, int n, int n2) throws IOException {
        ((rrzf_3)this.id_class[id_case[12]]).id_continue();
        this.id_protected();
        if ((Long)this.id_class[id_case[13]] == id_break[1]) {
            return id_byte[0];
        }
        if (n2 <= 0) {
            return id_protected[0];
        }
        if ((long)n2 > (Long)this.id_class[id_case[14]]) {
            n2 = (int)((Long)this.id_class[id_case[15]]).longValue();
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        byteBuffer.position(n);
        byteBuffer.limit(n + n2);
        long l = ((rrzf_3)this.id_class[id_case[16]]).id_class(byteBuffer, (Long)this.id_class[id_case[17]]);
        if (l > id_break[2]) {
            rrzo_3 rrzo_32 = this;
            Long l2 = (Long)rrzo_32.id_class[id_case[18]] + l;
            rrzo_32.id_class[rrzo_3.id_case[19]] = l2;
            rrzo_3 rrzo_33 = this;
            Long l3 = (Long)rrzo_33.id_class[id_case[20]] - l;
            rrzo_33.id_class[rrzo_3.id_case[21]] = l3;
        }
        if ((Long)this.id_class[id_case[22]] == id_break[3]) {
            this.close();
        }
        return (int)l;
    }

    @Override
    public int read() throws IOException {
        byte[] byArray = new byte[id_protected[1]];
        if (this.read(byArray, id_protected[2], id_protected[3]) == id_protected[4]) {
            return byArray[id_protected[5]] & id_case[23];
        }
        return id_byte[1];
    }

    @Override
    public void close() {
        Long l = id_break[6];
        this.id_class[rrzo_3.id_case[34]] = l;
        ((Set)((rrzf_3)this.id_class[rrzo_3.id_case[35]]).id_break[id_case[36]]).remove(this);
    }

    @Override
    public long skip(long l) {
        ((rrzf_3)this.id_class[id_case[24]]).id_continue();
        if (l > (Long)this.id_class[id_case[25]]) {
            l = (Long)this.id_class[id_case[26]];
        }
        rrzo_3 rrzo_32 = this;
        Long l2 = (Long)rrzo_32.id_class[id_case[27]] + l;
        rrzo_32.id_class[rrzo_3.id_case[28]] = l2;
        rrzo_3 rrzo_33 = this;
        Long l3 = (Long)rrzo_33.id_class[id_case[29]] - l;
        rrzo_33.id_class[rrzo_3.id_case[30]] = l3;
        if ((Long)this.id_class[id_case[31]] == id_break[4]) {
            this.close();
        }
        return l;
    }

    @Override
    public int available() {
        return (Long)this.id_class[id_case[32]] > id_break[5] ? id_throws[0] : (int)((Long)this.id_class[id_case[33]]).longValue();
    }

    private static void id_break() {
        id_byte = new byte[]{-1, -1, 30, 30, 3};
    }

    private static void id_throws() {
        long[] lArray = new long[11];
        lArray[0] = -1L;
        lArray[5] = Integer.MAX_VALUE;
        lArray[8] = 30L;
        id_break = lArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrzo_3.id_byte();
        rrzo_3.id_throws();
        rrzo_3.id_catch();
        rrzo_3.id_break();
        rrzo_3.id_class();
    }

    private static void id_catch() {
        short[] sArray = new short[47];
        sArray[0] = 2;
        sArray[1] = 11;
        sArray[2] = 1;
        sArray[3] = 14;
        sArray[8] = 14;
        sArray[12] = 2;
        sArray[13] = 1;
        sArray[14] = 1;
        sArray[15] = 1;
        sArray[16] = 2;
        sArray[20] = 1;
        sArray[21] = 1;
        sArray[22] = 1;
        sArray[23] = 255;
        sArray[24] = 2;
        sArray[25] = 1;
        sArray[26] = 1;
        sArray[29] = 1;
        sArray[30] = 1;
        sArray[31] = 1;
        sArray[32] = 1;
        sArray[33] = 1;
        sArray[34] = 1;
        sArray[35] = 2;
        sArray[36] = 17;
        sArray[39] = 2;
        sArray[40] = 23;
        sArray[42] = 2;
        id_case = sArray;
    }

    private void id_case() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[4]];
            objectArray[rrzo_3.id_protected[7]] = id_break[9];
            objectArray[rrzo_3.id_protected[8]] = id_break[10];
        }
    }

    private void id_protected() throws IOException {
        if ((Long)this.id_class[id_case[37]] <= id_break[7]) {
            Long l = -((Long)this.id_class[id_case[38]]).longValue() + (Long)((rrzf_3)this.id_class[rrzo_3.id_case[39]]).id_break[id_case[40]];
            this.id_class[rrzo_3.id_case[41]] = l;
            byte[] byArray = new byte[id_byte[2]];
            if (((rrzf_3)this.id_class[id_case[42]]).id_class(byArray, id_protected[6], byArray.length, (Long)this.id_class[id_case[43]]) != id_break[8]) {
                throw new ZipException("invalid loc " + (Long)this.id_class[id_case[44]] + " for entry reading");
            }
            rrzo_3 rrzo_32 = this;
            Long l2 = (Long)rrzo_32.id_class[id_case[45]] + (long)(id_byte[3] + rrzH_2.id_extends(byArray) + rrzH_2.id_volatile(byArray));
            rrzo_32.id_class[rrzo_3.id_case[46]] = l2;
        }
    }
}

