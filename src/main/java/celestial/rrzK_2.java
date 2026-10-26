/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrzA_2;
import celestial.rrzC_2;
import celestial.rrzY_2;
import celestial.rrzf_3;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrzK_2
extends rrzA_2 {
    private static byte[] id_protected;
    private static long[] id_throws;
    public Object[] id_byte;
    private static short[] id_case;
    private static boolean[] id_catch;

    public rrzK_2(rrzf_3 rrzf_32, rrzY_2 rrzY_22) {
        super((Long)rrzY_22.id_class[id_case[0]] > id_throws[0] ? (int)((Long)rrzY_22.id_class[id_case[1]]).longValue() : id_case[2], id_catch[0]);
        this.id_private();
        rrzf_3 rrzf_33 = rrzf_32;
        this.id_byte[rrzK_2.id_case[3]] = rrzf_33;
        rrzY_2 rrzY_23 = rrzY_22;
        this.id_byte[rrzK_2.id_case[4]] = rrzY_23;
        if ((Long)rrzY_22.id_class[id_case[5]] == id_throws[1]) {
            Long l = System.currentTimeMillis();
            rrzY_22.id_class[rrzK_2.id_case[6]] = l;
        }
        if ((Integer)rrzY_22.id_class[id_case[7]] == id_protected[0]) {
            Integer n = (int)((Integer)rrzf_32.id_break[id_case[8]]);
            rrzY_22.id_class[rrzK_2.id_case[9]] = n;
        }
        Integer n = id_protected[1];
        rrzY_22.id_class[rrzK_2.id_case[10]] = n;
        if (((rrzC_2)rrzf_32.id_break[id_case[11]]).id_class()) {
            rrzY_2 rrzY_24 = rrzY_22;
            Integer n2 = (Integer)rrzY_24.id_class[id_case[12]] | id_case[13];
            rrzY_24.id_class[rrzK_2.id_case[14]] = n2;
        }
    }

    static {
        rrzK_2.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x39ECBFC1;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xB0A8D4AC12A88420L;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void close() throws IOException {
        this.id_private();
        super.id_break();
        try {
            if (!this.isOpen()) {
                return;
            }
            try (OutputStream outputStream = ((rrzf_3)this.id_byte[id_case[15]]).id_break((rrzY_2)this.id_byte[id_case[16]]);){
                outputStream.write(this.id_class());
            }
            super.close();
        }
        finally {
            super.id_byte();
        }
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-35, -90, -23, -26, -104, -118, -24, 50}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_throws() {
        id_catch = new boolean[1];
    }

    private static /* synthetic */ void ntfClinit() {
        rrzK_2.id_throws();
        rrzK_2.id_catch();
        rrzK_2.id_case();
        rrzK_2.id_protected();
    }

    private static void id_catch() {
        long[] lArray = new long[2];
        lArray[1] = -1L;
        id_throws = lArray;
    }

    private static void id_case() {
        short[] sArray = new short[17];
        sArray[0] = 12;
        sArray[1] = 12;
        sArray[2] = 8192;
        sArray[3] = 1;
        sArray[5] = 7;
        sArray[6] = 7;
        sArray[7] = 6;
        sArray[8] = 10;
        sArray[9] = 6;
        sArray[10] = 4;
        sArray[11] = 2;
        sArray[12] = 4;
        sArray[13] = 2048;
        sArray[14] = 4;
        sArray[15] = 1;
        id_case = sArray;
    }

    private static void id_protected() {
        id_protected = new byte[]{-1, 8, 2};
    }

    private void id_private() {
        if (this.id_byte == null) {
            Object[] objectArray = this.id_byte = new Object[id_protected[2]];
        }
    }
}

