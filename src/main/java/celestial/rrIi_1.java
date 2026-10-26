/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Aq_1;
import celestial.cb_3;
import celestial.rZh_1;
import celestial.rrfB_2;
import celestial.rrfr_3;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIi_1
implements MinecraftAccessor {
    private static boolean[] id_class;
    private static float[] id_break;
    private static byte[] id_byte;
    private static short[] id_protected;
    private static double[] id_throws;

    private static void id_byte() {
        boolean[] blArray = new boolean[15];
        blArray[1] = true;
        blArray[2] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[7] = true;
        blArray[8] = true;
        blArray[10] = true;
        blArray[11] = true;
        blArray[13] = true;
        blArray[14] = true;
        id_class = blArray;
    }

    static {
        rrIi_1.ntfClinit();
    }

    public static float id_class(float f) {
        return (Integer)((cb_3)rrIi_1.id_import.id_class[rrIi_1.id_protected[29]]).id_throws[id_protected[30]] % id_byte[5] == 0 ? f - id_break[0] : f;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{86, 111, -122, -2, 42, 109, 121, -112}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static void id_class(rrfB_2 rrfB_22, double d, double d2, double d3) {
        switch (((int[])rrfr_3.id_class[id_protected[0]])[rrfB_22.ordinal()]) {
            case 1: {
                int n;
                for (n = id_class[0]; n < id_byte[0]; ++n) {
                    ((Aq_1)((cb_3)rrIi_1.id_import.id_class[rrIi_1.id_protected[1]]).id_break[id_protected[2]]).id_break(new rZh_1(d, d2, d3, id_class[1]));
                    ((Aq_1)((cb_3)rrIi_1.id_import.id_class[rrIi_1.id_protected[3]]).id_break[id_protected[4]]).id_break(new rZh_1(d, d2 + id_throws[0], d3, id_class[2]));
                }
                for (n = id_class[3]; n < id_byte[1]; ++n) {
                    ((Aq_1)((cb_3)rrIi_1.id_import.id_class[rrIi_1.id_protected[5]]).id_break[id_protected[6]]).id_break(new rZh_1(((cb_3)rrIi_1.id_import.id_class[id_protected[7]]).rx(), d2, ((cb_3)rrIi_1.id_import.id_class[id_protected[8]]).BO(), id_class[4]));
                    ((Aq_1)((cb_3)rrIi_1.id_import.id_class[rrIi_1.id_protected[9]]).id_break[id_protected[10]]).id_break(new rZh_1(((cb_3)rrIi_1.id_import.id_class[id_protected[11]]).rx(), d2 + id_throws[1], ((cb_3)rrIi_1.id_import.id_class[id_protected[12]]).BO(), id_class[5]));
                }
                break;
            }
            case 2: 
            case 3: {
                int n;
                for (n = id_class[6]; n < id_byte[2]; ++n) {
                    ((Aq_1)((cb_3)rrIi_1.id_import.id_class[rrIi_1.id_protected[13]]).id_break[id_protected[14]]).id_break(new rZh_1(d, d2, d3, id_class[7]));
                    ((Aq_1)((cb_3)rrIi_1.id_import.id_class[rrIi_1.id_protected[15]]).id_break[id_protected[16]]).id_break(new rZh_1(d, d2 + id_throws[2], d3, id_class[8]));
                }
                for (n = id_class[9]; n < id_byte[3]; ++n) {
                    ((Aq_1)((cb_3)rrIi_1.id_import.id_class[rrIi_1.id_protected[17]]).id_break[id_protected[18]]).id_break(new rZh_1(((cb_3)rrIi_1.id_import.id_class[id_protected[19]]).rx(), d2, ((cb_3)rrIi_1.id_import.id_class[id_protected[20]]).BO(), id_class[10]));
                    ((Aq_1)((cb_3)rrIi_1.id_import.id_class[rrIi_1.id_protected[21]]).id_break[id_protected[22]]).id_break(new rZh_1(((cb_3)rrIi_1.id_import.id_class[id_protected[23]]).rx(), d2 + id_throws[3], ((cb_3)rrIi_1.id_import.id_class[id_protected[24]]).BO(), id_class[11]));
                }
                for (n = id_class[12]; n < id_byte[4]; ++n) {
                    ((Aq_1)((cb_3)rrIi_1.id_import.id_class[rrIi_1.id_protected[25]]).id_break[id_protected[26]]).id_break(new rZh_1(d, d2, d3, id_class[13]));
                    ((Aq_1)((cb_3)rrIi_1.id_import.id_class[rrIi_1.id_protected[27]]).id_break[id_protected[28]]).id_break(new rZh_1(d, d2, d3, id_class[14]));
                }
                break;
            }
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x42F97563;
    }

    private static void id_class() {
        id_byte = new byte[]{12, 12, 12, 12, 12, 2};
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x441FF46BCC1468BFL;
    }

    private static void id_break() {
        id_break = new float[]{1.0E-4f};
    }

    private static void id_throws() {
        short[] sArray = new short[31];
        sArray[1] = 57;
        sArray[3] = 57;
        sArray[5] = 57;
        sArray[7] = 57;
        sArray[8] = 57;
        sArray[9] = 57;
        sArray[11] = 57;
        sArray[12] = 57;
        sArray[13] = 57;
        sArray[15] = 57;
        sArray[17] = 57;
        sArray[19] = 57;
        sArray[20] = 57;
        sArray[21] = 57;
        sArray[23] = 57;
        sArray[24] = 57;
        sArray[25] = 57;
        sArray[27] = 57;
        sArray[29] = 57;
        sArray[30] = 41;
        id_protected = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrIi_1.id_byte();
        rrIi_1.id_throws();
        rrIi_1.id_protected();
        rrIi_1.id_break();
        rrIi_1.id_class();
    }

    private static void id_protected() {
        id_throws = new double[]{0.1f, 0.1f, 0.1f, 0.1f};
    }
}

