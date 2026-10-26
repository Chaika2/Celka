/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrzY_2;
import celestial.rrzf_3;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Objects;
import java.util.zip.CRC32;
import java.util.zip.DeflaterOutputStream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrze_3
extends DeflaterOutputStream {
    private static byte[] id_break;
    private static short[] id_byte;
    private static String[] id_protected;
    public Object[] id_class;
    private static boolean[] id_throws;

    private static void id_byte() {
        boolean[] blArray = new boolean[2];
        blArray[0] = true;
        id_throws = blArray;
    }

    public rrze_3(rrzf_3 rrzf_32, rrzY_2 rrzY_22, OutputStream outputStream) {
        super(outputStream, rrzf_32.id_while());
        this.id_class();
        rrzf_3 rrzf_33 = rrzf_32;
        this.id_class[rrze_3.id_byte[0]] = rrzf_33;
        rrzY_2 rrzY_23 = Objects.requireNonNull(rrzY_22, id_protected[0]);
        this.id_class[rrze_3.id_byte[1]] = rrzY_23;
        CRC32 cRC32 = new CRC32();
        this.id_class[rrze_3.id_byte[2]] = cRC32;
    }

    static {
        rrze_3.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xECAC4584;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xC74EB935604C1D4DL;
    }

    private void id_class() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
            objectArray[rrze_3.id_break[1]] = id_throws[1];
        }
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{127, -63, 47, 36, 81, 15, 41, -54}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public void write(byte[] byArray, int n, int n2) throws IOException {
        super.write(byArray, n, n2);
        ((CRC32)this.id_class[id_byte[3]]).update(byArray, n, n2);
    }

    @Override
    public void close() throws IOException {
        if (((Boolean)this.id_class[id_byte[4]]).booleanValue()) {
            return;
        }
        Boolean bl = id_throws[0];
        this.id_class[rrze_3.id_byte[5]] = bl;
        this.finish();
        Long l = this.def.getBytesRead();
        ((rrzY_2)this.id_class[rrze_3.id_byte[6]]).id_class[rrze_3.id_byte[7]] = l;
        Long l2 = this.def.getBytesWritten();
        ((rrzY_2)this.id_class[rrze_3.id_byte[8]]).id_class[rrze_3.id_byte[9]] = l2;
        Long l3 = ((CRC32)this.id_class[id_byte[11]]).getValue();
        ((rrzY_2)this.id_class[rrze_3.id_byte[10]]).id_class[rrze_3.id_byte[12]] = l3;
        ((rrzf_3)this.id_class[id_byte[13]]).id_class(this.def);
    }

    private static void id_break() {
        id_break = new byte[]{4, 2};
    }

    private static void id_throws() {
        id_protected = new String[]{new String("Zip entry is null")};
    }

    private static /* synthetic */ void ntfClinit() {
        rrze_3.id_byte();
        rrze_3.id_throws();
        rrze_3.id_protected();
        rrze_3.id_break();
    }

    private static void id_protected() {
        short[] sArray = new short[14];
        sArray[0] = 3;
        sArray[1] = 1;
        sArray[4] = 2;
        sArray[5] = 2;
        sArray[6] = 1;
        sArray[7] = 12;
        sArray[8] = 1;
        sArray[9] = 11;
        sArray[10] = 1;
        sArray[12] = 10;
        sArray[13] = 3;
        id_byte = sArray;
    }
}

