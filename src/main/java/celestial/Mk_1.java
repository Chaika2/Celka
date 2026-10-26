/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.MM;
import celestial.rVL;
import celestial.rcd_3;
import celestial.rqO_2;
import celestial.rtK_2;
import celestial.xc_3;
import celestial.xd_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Mk_1
extends MM {
    private static short[] id_break;
    private static byte[] id_protected;
    private static String[] id_throws;
    private static boolean[] id_case;

    public Mk_1(rcd_3 rcd_32) {
        xc_3[][][] xc_3Array;
        int n;
        String string = rcd_32.id_native(id_throws[0]);
        if (!string.equals(id_throws[1])) {
            throw new IllegalStateException("bad schematic " + string);
        }
        Integer n2 = rcd_32.id_private(id_throws[2]);
        this.id_class[Mk_1.id_break[0]] = n2;
        Integer n3 = rcd_32.id_private(id_throws[3]);
        this.id_class[Mk_1.id_break[1]] = n3;
        Integer n4 = rcd_32.id_private(id_throws[4]);
        this.id_class[Mk_1.id_break[2]] = n4;
        byte[] byArray = rcd_32.id_volatile(id_throws[5]);
        byte[] byArray2 = null;
        if (rcd_32.id_throws(id_throws[6])) {
            byte[] byArray3 = rcd_32.id_volatile(id_throws[7]);
            byArray2 = new byte[byArray3.length * id_protected[0]];
            for (n = id_case[0]; n < byArray3.length; ++n) {
                byArray2[n * Mk_1.id_protected[1] + Mk_1.id_case[1]] = (byte)(byArray3[n] >> id_protected[2] & id_protected[3]);
                byArray2[n * Mk_1.id_protected[4] + Mk_1.id_case[2]] = (byte)(byArray3[n] >> id_case[3] & id_protected[5]);
            }
        }
        this.id_byte[Mk_1.id_break[6]] = xc_3Array = new xc_3[((Integer)this.id_class[id_break[3]]).intValue()][((Integer)this.id_class[id_break[4]]).intValue()][((Integer)this.id_class[id_break[5]]).intValue()];
        for (int i = id_case[4]; i < (Integer)this.id_class[id_break[7]]; ++i) {
            for (n = id_case[5]; n < (Integer)this.id_class[id_break[8]]; ++n) {
                for (int j = id_case[6]; j < (Integer)this.id_class[id_break[9]]; ++j) {
                    int n5 = (i * (Integer)this.id_class[id_break[10]] + n) * (Integer)this.id_class[id_break[11]] + j;
                    int n6 = byArray[n5] & id_break[12];
                    if (byArray2 != null) {
                        n6 |= byArray2[n5] << id_protected[6];
                    }
                    xd_3 xd_32 = rVL.id_strictfp.id_class(rqO_2.id_break(rtK_2.id_class(n6)));
                    ((xc_3[][][])this.id_byte[Mk_1.id_break[13]])[j][n][i] = xd_32.id_continue();
                }
            }
        }
    }

    static {
        Mk_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xF7D685D6EA335504L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xB6DCB764;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{14, -94, 9, 44, 18, -58, 89, 43}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[7];
        blArray[2] = true;
        id_case = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        Mk_1.id_throws();
        Mk_1.id_catch();
        Mk_1.id_case();
        Mk_1.id_private();
    }

    private static void id_catch() {
        id_throws = new String[]{new String("Materials"), new String("Alpha"), new String("Width"), new String("Height"), new String("Length"), new String("Blocks"), new String("AddBlocks"), new String("AddBlocks")};
    }

    private static void id_case() {
        short[] sArray = new short[14];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[4] = 2;
        sArray[5] = 1;
        sArray[7] = 1;
        sArray[8] = 2;
        sArray[10] = 2;
        sArray[12] = 255;
        id_break = sArray;
    }

    private static void id_private() {
        id_protected = new byte[]{2, 2, 4, 15, 2, 15, 8};
    }
}

