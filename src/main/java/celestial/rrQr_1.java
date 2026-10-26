/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrzi_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrQr_1
extends rrzi_3 {
    private static boolean[] id_break;
    public Object[] id_class;
    private static short[] id_throws;
    private static byte[] id_case;

    private static void id_byte() {
        id_case = new byte[]{31};
    }

    public rrQr_1() {
        this.id_protected();
    }

    static {
        rrQr_1.ntfClinit();
    }

    @Override
    public boolean equals(Object object) {
        this.id_protected();
        if (!(object instanceof rrzi_3)) {
            return id_break[2];
        }
        byte[] byArray = (byte[])((rrzi_3)object).id_protected[id_throws[3]];
        return Arrays.equals((byte[])this.id_protected[id_throws[4]], id_break[3], (int)((Integer)this.id_class[id_throws[5]]), byArray, id_break[4], byArray.length);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xFF3006A4;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xC72228CA377E8212L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-36, 95, 90, -122, -21, -91, -117, -78}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        boolean[] blArray = new boolean[8];
        blArray[0] = true;
        blArray[5] = true;
        id_break = blArray;
    }

    public rrQr_1 id_class(byte[] byArray, int n) {
        this.id_break(byArray, n);
        return this;
    }

    private static void id_break() {
        short[] sArray = new short[6];
        sArray[2] = 1;
        id_throws = sArray;
    }

    public void id_break(byte[] byArray, int n) {
        this.id_protected();
        byte[] byArray2 = byArray;
        this.id_protected[rrQr_1.id_throws[0]] = byArray2;
        Integer n2 = n;
        this.id_class[rrQr_1.id_throws[1]] = n2;
        int n3 = id_break[0];
        for (int i = id_break[1]; i < n; ++i) {
            n3 = id_case[0] * n3 + byArray[i];
        }
        Integer n4 = n3;
        this.id_protected[rrQr_1.id_throws[2]] = n4;
    }

    private static /* synthetic */ void ntfClinit() {
        rrQr_1.id_class();
        rrQr_1.id_break();
        rrQr_1.id_byte();
    }

    private void id_protected() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[5]];
            objectArray[rrQr_1.id_break[6]] = id_break[7];
        }
    }
}

