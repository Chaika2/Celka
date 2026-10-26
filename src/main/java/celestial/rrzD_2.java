/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrzY_2;
import celestial.rrza_3;
import celestial.rrzf_3;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrzD_2
extends FilterOutputStream {
    private static long[] id_break;
    private static byte[] id_byte;
    public Object[] id_class;
    private static boolean[] id_protected;
    private static short[] id_throws;
    private static String[] id_case;

    private static void id_byte() {
        id_byte = new byte[]{4, 2};
    }

    public rrzD_2(rrzf_3 rrzf_32, rrzY_2 rrzY_22, OutputStream outputStream) {
        super(outputStream);
        this.id_case();
        rrzf_3 rrzf_33 = rrzf_32;
        this.id_class[rrzD_2.id_throws[0]] = rrzf_33;
        rrzY_2 rrzY_23 = Objects.requireNonNull(rrzY_22, id_case[0]);
        this.id_class[rrzD_2.id_throws[1]] = rrzY_23;
    }

    static {
        rrzD_2.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{85, 49, 34, 114, 86, -92, 44, 121}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        id_case = new String[]{new String("Zip entry is null")};
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x100AEF0BDE45AB2BL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xC8BAB594;
    }

    @Override
    public synchronized void write(int n) throws IOException {
        this.out.write(n);
        rrzD_2 rrzD_22 = this;
        Long l = (Long)rrzD_22.id_class[id_throws[2]] + id_break[0];
        rrzD_22.id_class[rrzD_2.id_throws[3]] = l;
    }

    @Override
    public synchronized void write(byte[] byArray, int n, int n2) throws IOException {
        this.out.write(byArray, n, n2);
        rrzD_2 rrzD_22 = this;
        Long l = (Long)rrzD_22.id_class[id_throws[4]] + (long)n2;
        rrzD_22.id_class[rrzD_2.id_throws[5]] = l;
    }

    @Override
    public synchronized void close() throws IOException {
        if (((Boolean)this.id_class[id_throws[6]]).booleanValue()) {
            return;
        }
        Boolean bl = id_protected[0];
        this.id_class[rrzD_2.id_throws[7]] = bl;
        Long l = (long)((Long)this.id_class[id_throws[9]]);
        ((rrzY_2)this.id_class[rrzD_2.id_throws[8]]).id_class[rrzD_2.id_throws[10]] = l;
        OutputStream outputStream = this.out;
        if (outputStream instanceof rrza_3) {
            rrza_3 rrza_32 = (rrza_3)outputStream;
            if ((OutputStream)rrza_32.id_class[id_throws[11]] == null) {
                byte[] byArray = rrza_32.id_byte();
                ((rrzY_2)this.id_class[rrzD_2.id_throws[12]]).id_class[rrzD_2.id_throws[13]] = byArray;
            }
        }
        super.close();
        ((rrzf_3)this.id_class[id_throws[14]]).id_class((rrzY_2)this.id_class[id_throws[15]]);
    }

    private static void id_break() {
        long[] lArray = new long[2];
        lArray[0] = 1L;
        id_break = lArray;
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[3];
        blArray[0] = true;
        blArray[1] = true;
        id_protected = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrzD_2.id_throws();
        rrzD_2.id_class();
        rrzD_2.id_break();
        rrzD_2.id_protected();
        rrzD_2.id_byte();
    }

    private void id_case() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
            objectArray[rrzD_2.id_protected[1]] = id_break[1];
            objectArray[rrzD_2.id_byte[1]] = id_protected[2];
        }
    }

    private static void id_protected() {
        short[] sArray = new short[16];
        sArray[0] = 3;
        sArray[2] = 1;
        sArray[3] = 1;
        sArray[4] = 1;
        sArray[5] = 1;
        sArray[6] = 2;
        sArray[7] = 2;
        sArray[9] = 1;
        sArray[10] = 12;
        sArray[11] = 2;
        sArray[14] = 3;
        id_throws = sArray;
    }
}

