/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrzY_2;
import celestial.rrzf_3;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Objects;
import java.util.zip.CRC32;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrzU_2
extends FilterOutputStream {
    private static short[] id_break;
    private static String[] id_byte;
    public Object[] id_class;
    private static byte[] id_protected;
    private static boolean[] id_throws;
    private static long[] id_case;

    private static void id_byte() {
        id_protected = new byte[]{4, 2, 3};
    }

    public rrzU_2(rrzf_3 rrzf_32, rrzY_2 rrzY_22, OutputStream outputStream) {
        super(outputStream);
        this.id_protected();
        rrzY_2 rrzY_23 = Objects.requireNonNull(rrzY_22, id_byte[0]);
        this.id_class[rrzU_2.id_break[0]] = rrzY_23;
        CRC32 cRC32 = new CRC32();
        this.id_class[rrzU_2.id_break[1]] = cRC32;
    }

    static {
        rrzU_2.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{24, 27, 8, -9, 43, 68, 61, -40}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xFDB4C16E;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x8B6E62C1CF4C52FCL;
    }

    private static void id_class() {
        boolean[] blArray = new boolean[2];
        blArray[0] = true;
        id_throws = blArray;
    }

    @Override
    public void write(int n) throws IOException {
        this.out.write(n);
        ((CRC32)this.id_class[id_break[2]]).update(n);
        rrzU_2 rrzU_22 = this;
        Long l = (Long)rrzU_22.id_class[id_break[3]] + id_case[0];
        rrzU_22.id_class[rrzU_2.id_break[4]] = l;
    }

    @Override
    public void write(byte[] byArray, int n, int n2) throws IOException {
        this.out.write(byArray, n, n2);
        ((CRC32)this.id_class[id_break[5]]).update(byArray, n, n2);
        rrzU_2 rrzU_22 = this;
        Long l = (Long)rrzU_22.id_class[id_break[6]] + (long)n2;
        rrzU_22.id_class[rrzU_2.id_break[7]] = l;
    }

    @Override
    public void close() {
        if (((Boolean)this.id_class[id_break[8]]).booleanValue()) {
            return;
        }
        Boolean bl = id_throws[0];
        this.id_class[rrzU_2.id_break[9]] = bl;
        long l = (Long)this.id_class[id_break[12]];
        Long l2 = l;
        ((rrzY_2)this.id_class[rrzU_2.id_break[11]]).id_class[rrzU_2.id_break[13]] = l2;
        Long l3 = l;
        ((rrzY_2)this.id_class[rrzU_2.id_break[10]]).id_class[rrzU_2.id_break[14]] = l3;
        Long l4 = ((CRC32)this.id_class[id_break[16]]).getValue();
        ((rrzY_2)this.id_class[rrzU_2.id_break[15]]).id_class[rrzU_2.id_break[17]] = l4;
    }

    private static void id_break() {
        id_byte = new String[]{new String("Zip entry is null")};
    }

    private static void id_throws() {
        long[] lArray = new long[2];
        lArray[0] = 1L;
        id_case = lArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrzU_2.id_class();
        rrzU_2.id_break();
        rrzU_2.id_throws();
        rrzU_2.id_case();
        rrzU_2.id_byte();
    }

    private static void id_case() {
        short[] sArray = new short[18];
        sArray[0] = 1;
        sArray[3] = 2;
        sArray[4] = 2;
        sArray[6] = 2;
        sArray[7] = 2;
        sArray[8] = 3;
        sArray[9] = 3;
        sArray[10] = 1;
        sArray[11] = 1;
        sArray[12] = 2;
        sArray[13] = 11;
        sArray[14] = 12;
        sArray[15] = 1;
        sArray[17] = 10;
        id_break = sArray;
    }

    private void id_protected() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[0]];
            objectArray[rrzU_2.id_protected[1]] = id_case[1];
            objectArray[rrzU_2.id_protected[2]] = id_throws[1];
        }
    }
}

