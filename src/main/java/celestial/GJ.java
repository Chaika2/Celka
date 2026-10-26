/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.EF;
import celestial.Gx_1;
import celestial.bw_3;
import celestial.xc_3;
import celestial.xd_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GJ {
    private static byte[] id_byte;
    public Object[] id_class;
    private static short[] id_protected;
    private static boolean[] id_throws;
    public static Object[] id_break;

    private static void id_byte() {
        boolean[] blArray = new boolean[15];
        blArray[1] = true;
        blArray[2] = true;
        blArray[3] = true;
        blArray[5] = true;
        blArray[6] = true;
        blArray[8] = true;
        blArray[9] = true;
        blArray[11] = true;
        blArray[13] = true;
        blArray[14] = true;
        id_throws = blArray;
    }

    public boolean id_byte(bw_3 bw_32, int n, int n2, int n3, xc_3 xc_32) {
        int n4 = xd_3.id_char.id_class(xc_32);
        int n5 = ((int[])this.id_class[id_protected[9]])[n4];
        if ((n5 & id_throws[5]) == 0) {
            n5 = this.id_class(n4, xc_32);
        }
        if ((n5 & id_byte[8]) != 0) {
            return EF.id_throws(bw_32, n, n2, n3, xc_32);
        }
        return (n5 & id_byte[9]) != 0 ? id_throws[6] : id_throws[7];
    }

    public GJ() {
        this.id_class();
        int[] nArray = new int[xd_3.id_char.id_class()];
        this.id_class[GJ.id_protected[0]] = nArray;
    }

    static {
        GJ.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xCD88DA2C2A1FA420L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{17, 26, -7, 0, -13, 121, 89, -109}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x2E154F0E;
    }

    public boolean id_class(bw_3 bw_32, int n, int n2, int n3, xc_3 xc_32) {
        int n4 = xd_3.id_char.id_class(xc_32);
        int n5 = ((int[])this.id_class[id_protected[10]])[n4];
        if ((n5 & id_throws[8]) == 0) {
            n5 = this.id_class(n4, xc_32);
        }
        if ((n5 & id_byte[10]) != 0) {
            return EF.id_protected(bw_32, n, n2, n3, xc_32);
        }
        return (n5 & id_byte[11]) != 0 ? id_throws[9] : id_throws[10];
    }

    private int id_class(int n, xc_3 xc_32) {
        Gx_1 gx_1;
        Gx_1 gx_12;
        int n2 = id_throws[0];
        Gx_1 gx_13 = EF.id_implements(xc_32);
        if (gx_13 == (Gx_1)((Object)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[id_protected[1]])) {
            n2 |= id_byte[0];
        }
        if (gx_13 == (Gx_1)((Object)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[id_protected[2]])) {
            n2 |= id_byte[1];
        }
        if ((gx_12 = EF.id_private(xc_32)) == (Gx_1)((Object)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[id_protected[3]])) {
            n2 |= id_byte[2];
        }
        if (gx_12 == (Gx_1)((Object)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[id_protected[4]])) {
            n2 |= id_byte[3];
        }
        if ((gx_1 = EF.id_class(xc_32)) == (Gx_1)((Object)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[id_protected[5]])) {
            n2 |= id_byte[4];
        }
        if (gx_1 == (Gx_1)((Object)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[id_protected[6]])) {
            n2 |= id_byte[5];
        }
        ((int[])this.id_class[GJ.id_protected[7]])[n] = n2 |= id_throws[1];
        return n2;
    }

    private void id_class() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_throws[11]];
        }
    }

    private static void id_break() {
        short[] sArray = new short[11];
        sArray[2] = 1;
        sArray[4] = 1;
        sArray[6] = 1;
        id_protected = sArray;
    }

    public boolean id_break(bw_3 bw_32, int n, int n2, int n3, xc_3 xc_32) {
        int n4 = xd_3.id_char.id_class(xc_32);
        int n5 = ((int[])this.id_class[id_protected[8]])[n4];
        if ((n5 & id_throws[2]) == 0) {
            n5 = this.id_class(n4, xc_32);
        }
        if ((n5 & id_byte[6]) != 0) {
            return EF.id_catch(bw_32, n, n2, n3, xc_32);
        }
        return (n5 & id_byte[7]) != 0 ? id_throws[3] : id_throws[4];
    }

    private static void id_throws() {
        id_byte = new byte[]{2, 4, 8, 16, 32, 64, 4, 2, 16, 8, 64, 32, 7, 2, 2, 4, 3, 8, 4, 16, 5, 32, 6, 64};
    }

    private static /* synthetic */ void ntfClinit() {
        GJ.id_byte();
        GJ.id_break();
        GJ.id_throws();
        GJ.id_protected();
    }

    private static void id_protected() {
        Object[] objectArray = new Object[]{1, 2, 4, 8, 16, 32, 64};
        id_break = objectArray;
    }
}

