/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Multimap
 */
package celestial;

import celestial.iJ_2;
import celestial.iQ_2;
import celestial.id_3;
import celestial.ix_3;
import celestial.rXQ;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rrfS_2;
import com.google.common.collect.Multimap;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Map;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfh_3
extends Enum<rrfh_3> {
    private static boolean[] booleansf0292b9e212f30cb8a14c2d16461fd94;
    public static Object[] staticFieldsf0292b9e212f30cb8a14c2d16461fd94;
    private static String[] stringsf0292b9e212f30cb8a14c2d16461fd94;
    private static double[] doublesf0292b9e212f30cb8a14c2d16461fd94;
    private static short[] shortsf0292b9e212f30cb8a14c2d16461fd94;
    private static byte[] bytesf0292b9e212f30cb8a14c2d16461fd94;
    public Object[] fieldsf0292b9e212f30cb8a14c2d16461fd94;

    private static void id_byte() {
        doublesf0292b9e212f30cb8a14c2d16461fd94 = new double[]{-4.0, 7.0, 0.1, 3.0, 2.0, 2.0, 4.0, -3.0, 2.0, 4.0, 0.1, 0.1, 2.0, -4.0, 2.0, -4.0, 5.0, 2.0, 0.15, 0.15, 1.5, 1.5, 2.5, 0.1};
    }

    private rrfh_3(rrfS_2 ... rrfS_2Array) {
        rrfS_2[] rrfS_2Array2;
        this.id_private();
        this.fieldsf0292b9e212f30cb8a14c2d16461fd94[rrfh_3.shortsf0292b9e212f30cb8a14c2d16461fd94[1]] = rrfS_2Array2 = rrfS_2Array;
    }

    static {
        rrfh_3.ntfClinit();
    }

    public static rrfh_3[] values() {
        return (rrfh_3[])((rrfh_3[])staticFieldsf0292b9e212f30cb8a14c2d16461fd94[shortsf0292b9e212f30cb8a14c2d16461fd94[0]]).clone();
    }

    public static rrfh_3 valueOf(String string) {
        return Enum.valueOf(rrfh_3.class, string);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-69, -1, 104, 109, -44, -123, -17, -89}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public rrfS_2[] id_class() {
        return (rrfS_2[])this.fieldsf0292b9e212f30cb8a14c2d16461fd94[shortsf0292b9e212f30cb8a14c2d16461fd94[3]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xA3E94905;
    }

    public static rrfh_3 id_class(rdn_3 rdn_32) {
        if (rdn_32.id_break() != rdy_3.kL) {
            return null;
        }
        rrfh_3[] rrfh_3Array = (rrfh_3[])staticFieldsf0292b9e212f30cb8a14c2d16461fd94[shortsf0292b9e212f30cb8a14c2d16461fd94[2]];
        int n = rrfh_3Array.length;
        for (int i = booleansf0292b9e212f30cb8a14c2d16461fd94[0]; i < n; ++i) {
            rrfh_3 rrfh_32 = rrfh_3Array[i];
            rrfS_2[] rrfS_2Array = rrfh_32.id_class();
            if (rrfS_2Array.length == 0) continue;
            boolean bl = booleansf0292b9e212f30cb8a14c2d16461fd94[1];
            rrfS_2[] rrfS_2Array2 = rrfS_2Array;
            int n2 = rrfS_2Array2.length;
            for (int j = booleansf0292b9e212f30cb8a14c2d16461fd94[2]; j < n2; ++j) {
                rrfS_2 rrfS_22 = rrfS_2Array2[j];
                iJ_2 iJ_22 = rrfS_22.id_class();
                ix_3 ix_32 = rrfS_22.id_byte();
                rXQ rXQ2 = rrfS_22.id_break();
                Multimap<iJ_2, ix_3> multimap = rdn_32.id_class(rXQ2);
                if (multimap.size() != rrfS_2Array.length) {
                    bl = booleansf0292b9e212f30cb8a14c2d16461fd94[3];
                    break;
                }
                if (multimap.containsKey((Object)iJ_22)) {
                    boolean bl2 = booleansf0292b9e212f30cb8a14c2d16461fd94[4];
                    for (Map.Entry entry : multimap.entries()) {
                        iJ_2 iJ_23 = (iJ_2)entry.getKey();
                        ix_3 ix_33 = (ix_3)entry.getValue();
                        if (ix_33.id_byte() != ix_32.id_byte() || ix_33.id_protected() != ix_32.id_protected() || !iJ_23.equals(iJ_22)) continue;
                        bl2 = booleansf0292b9e212f30cb8a14c2d16461fd94[5];
                        break;
                    }
                    if (bl2) continue;
                    bl = booleansf0292b9e212f30cb8a14c2d16461fd94[6];
                    break;
                }
                bl = booleansf0292b9e212f30cb8a14c2d16461fd94[7];
                break;
            }
            if (!bl) continue;
            return rrfh_32;
        }
        return null;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x51A889026CF9CA22L;
    }

    private static void id_break() {
        short[] sArray = new short[12];
        sArray[0] = 9;
        sArray[2] = 8;
        sArray[5] = 1;
        sArray[6] = 2;
        sArray[7] = 3;
        sArray[8] = 4;
        sArray[9] = 5;
        sArray[10] = 6;
        sArray[11] = 7;
        shortsf0292b9e212f30cb8a14c2d16461fd94 = sArray;
    }

    private static void id_throws() {
        stringsf0292b9e212f30cb8a14c2d16461fd94 = new String[]{new String("PUNISHER"), new String(""), new String(""), new String(""), new String("DESTROYER"), new String(""), new String(""), new String(""), new String(""), new String("DISCORD"), new String(""), new String(""), new String(""), new String(""), new String(""), new String("TYRANT"), new String(""), new String(""), new String(""), new String("RAGE"), new String(""), new String(""), new String("WHIRLWIND"), new String(""), new String(""), new String(""), new String("DARKNESS"), new String(""), new String(""), new String("DEMON"), new String(""), new String("")};
    }

    private static /* synthetic */ void ntfClinit() {
        rrfh_3.id_catch();
        rrfh_3.id_throws();
        rrfh_3.id_break();
        rrfh_3.id_byte();
        rrfh_3.id_implements();
        rrfh_3.id_case();
    }

    private static void id_catch() {
        boolean[] blArray = new boolean[31];
        blArray[1] = true;
        blArray[5] = true;
        blArray[9] = true;
        blArray[12] = true;
        blArray[14] = true;
        blArray[16] = true;
        blArray[17] = true;
        blArray[19] = true;
        blArray[21] = true;
        blArray[23] = true;
        blArray[25] = true;
        blArray[27] = true;
        blArray[29] = true;
        blArray[30] = true;
        booleansf0292b9e212f30cb8a14c2d16461fd94 = blArray;
    }

    private static void id_case() {
        Object[] objectArray = new Object[10];
        rrfS_2[] rrfS_2Array = new rrfS_2[]{new rrfS_2(iQ_2.id_class, new ix_3(new UUID(-9212241506230515135L, -4621443875574229328L), stringsf0292b9e212f30cb8a14c2d16461fd94[1], -4.0, id_3.ADDITION), rXQ.OFFHAND), new rrfS_2(iQ_2.id_case, new ix_3(stringsf0292b9e212f30cb8a14c2d16461fd94[2], 7.0, id_3.ADDITION), rXQ.OFFHAND), new rrfS_2(iQ_2.id_protected, new ix_3(stringsf0292b9e212f30cb8a14c2d16461fd94[3], 0.1, id_3.MULTIPLY_BASE), rXQ.OFFHAND)};
        objectArray[0] = new rrfh_3(rrfS_2Array);
        rrfS_2[] rrfS_2Array2 = new rrfS_2[]{new rrfS_2(iQ_2.id_case, new ix_3(stringsf0292b9e212f30cb8a14c2d16461fd94[5], 3.0, id_3.ADDITION), rXQ.OFFHAND), new rrfS_2(iQ_2.id_finally, new ix_3(stringsf0292b9e212f30cb8a14c2d16461fd94[6], 2.0, id_3.ADDITION), rXQ.OFFHAND), new rrfS_2(iQ_2.id_implements, new ix_3(stringsf0292b9e212f30cb8a14c2d16461fd94[7], 2.0, id_3.ADDITION), rXQ.OFFHAND), new rrfS_2(iQ_2.id_class, new ix_3(stringsf0292b9e212f30cb8a14c2d16461fd94[8], 4.0, id_3.ADDITION), rXQ.OFFHAND)};
        objectArray[1] = new rrfh_3(rrfS_2Array2);
        rrfS_2[] rrfS_2Array3 = new rrfS_2[]{new rrfS_2(iQ_2.id_implements, new ix_3(stringsf0292b9e212f30cb8a14c2d16461fd94[10], -3.0, id_3.ADDITION), rXQ.OFFHAND), new rrfS_2(iQ_2.id_class, new ix_3(stringsf0292b9e212f30cb8a14c2d16461fd94[11], 2.0, id_3.ADDITION), rXQ.OFFHAND), new rrfS_2(iQ_2.id_case, new ix_3(stringsf0292b9e212f30cb8a14c2d16461fd94[12], 4.0, id_3.ADDITION), rXQ.OFFHAND), new rrfS_2(iQ_2.id_protected, new ix_3(stringsf0292b9e212f30cb8a14c2d16461fd94[13], 0.1, id_3.MULTIPLY_BASE), rXQ.OFFHAND), new rrfS_2(iQ_2.id_private, new ix_3(stringsf0292b9e212f30cb8a14c2d16461fd94[14], 0.1, id_3.MULTIPLY_BASE), rXQ.OFFHAND)};
        objectArray[2] = new rrfh_3(rrfS_2Array3);
        rrfS_2[] rrfS_2Array4 = new rrfS_2[]{new rrfS_2(iQ_2.id_implements, new ix_3(stringsf0292b9e212f30cb8a14c2d16461fd94[16], 2.0, id_3.ADDITION), rXQ.OFFHAND), new rrfS_2(iQ_2.id_class, new ix_3(stringsf0292b9e212f30cb8a14c2d16461fd94[17], -4.0, id_3.ADDITION), rXQ.OFFHAND), new rrfS_2(iQ_2.id_case, new ix_3(stringsf0292b9e212f30cb8a14c2d16461fd94[18], 2.0, id_3.ADDITION), rXQ.OFFHAND)};
        objectArray[3] = new rrfh_3(rrfS_2Array4);
        rrfS_2[] rrfS_2Array5 = new rrfS_2[]{new rrfS_2(iQ_2.id_class, new ix_3(stringsf0292b9e212f30cb8a14c2d16461fd94[20], -4.0, id_3.ADDITION), rXQ.OFFHAND), new rrfS_2(iQ_2.id_case, new ix_3(stringsf0292b9e212f30cb8a14c2d16461fd94[21], 5.0, id_3.ADDITION), rXQ.OFFHAND)};
        objectArray[4] = new rrfh_3(rrfS_2Array5);
        rrfS_2[] rrfS_2Array6 = new rrfS_2[]{new rrfS_2(iQ_2.id_class, new ix_3(stringsf0292b9e212f30cb8a14c2d16461fd94[23], 2.0, id_3.ADDITION), rXQ.OFFHAND), new rrfS_2(iQ_2.id_protected, new ix_3(stringsf0292b9e212f30cb8a14c2d16461fd94[24], 0.15, id_3.MULTIPLY_BASE), rXQ.OFFHAND), new rrfS_2(iQ_2.id_private, new ix_3(stringsf0292b9e212f30cb8a14c2d16461fd94[25], 0.15, id_3.MULTIPLY_BASE), rXQ.OFFHAND)};
        objectArray[5] = new rrfh_3(rrfS_2Array6);
        rrfS_2[] rrfS_2Array7 = new rrfS_2[]{new rrfS_2(iQ_2.id_implements, new ix_3(stringsf0292b9e212f30cb8a14c2d16461fd94[27], 1.5, id_3.ADDITION), rXQ.OFFHAND), new rrfS_2(iQ_2.id_class, new ix_3(stringsf0292b9e212f30cb8a14c2d16461fd94[28], 1.5, id_3.ADDITION), rXQ.OFFHAND)};
        objectArray[6] = new rrfh_3(rrfS_2Array7);
        rrfS_2[] rrfS_2Array8 = new rrfS_2[]{new rrfS_2(iQ_2.id_case, new ix_3(stringsf0292b9e212f30cb8a14c2d16461fd94[30], 2.5, id_3.ADDITION), rXQ.OFFHAND), new rrfS_2(iQ_2.id_private, new ix_3(stringsf0292b9e212f30cb8a14c2d16461fd94[31], 0.1, id_3.MULTIPLY_BASE), rXQ.OFFHAND)};
        objectArray[7] = new rrfh_3(rrfS_2Array8);
        objectArray[8] = new rrfh_3[]{(rrfh_3)((Object)objectArray[0]), (rrfh_3)((Object)objectArray[1]), (rrfh_3)((Object)objectArray[2]), (rrfh_3)((Object)objectArray[3]), (rrfh_3)((Object)objectArray[4]), (rrfh_3)((Object)objectArray[5]), (rrfh_3)((Object)objectArray[6]), (rrfh_3)((Object)objectArray[7])};
        objectArray[9] = new rrfh_3[]{(rrfh_3)((Object)objectArray[0]), (rrfh_3)((Object)objectArray[1]), (rrfh_3)((Object)objectArray[2]), (rrfh_3)((Object)objectArray[3]), (rrfh_3)((Object)objectArray[4]), (rrfh_3)((Object)objectArray[5]), (rrfh_3)((Object)objectArray[6]), (rrfh_3)((Object)objectArray[7])};
        staticFieldsf0292b9e212f30cb8a14c2d16461fd94 = objectArray;
    }

    private static void id_implements() {
        bytesf0292b9e212f30cb8a14c2d16461fd94 = new byte[]{8, 2, 3, 4, 5, 6, 7, 3, 2, 4, 2, 3, 2, 5, 2, 3, 4, 2, 3, 3, 2, 3, 4, 2, 4, 5, 3, 2, 5, 6, 2, 6, 7, 2, 7, 9, 8, 10};
    }

    private static /* synthetic */ rrfh_3[] id_protected() {
        rrfh_3[] rrfh_3Array = new rrfh_3[bytesf0292b9e212f30cb8a14c2d16461fd94[0]];
        rrfh_3Array[rrfh_3.booleansf0292b9e212f30cb8a14c2d16461fd94[8]] = (rrfh_3)((Object)staticFieldsf0292b9e212f30cb8a14c2d16461fd94[shortsf0292b9e212f30cb8a14c2d16461fd94[4]]);
        rrfh_3Array[rrfh_3.booleansf0292b9e212f30cb8a14c2d16461fd94[9]] = (rrfh_3)((Object)staticFieldsf0292b9e212f30cb8a14c2d16461fd94[shortsf0292b9e212f30cb8a14c2d16461fd94[5]]);
        rrfh_3Array[rrfh_3.bytesf0292b9e212f30cb8a14c2d16461fd94[1]] = (rrfh_3)((Object)staticFieldsf0292b9e212f30cb8a14c2d16461fd94[shortsf0292b9e212f30cb8a14c2d16461fd94[6]]);
        rrfh_3Array[rrfh_3.bytesf0292b9e212f30cb8a14c2d16461fd94[2]] = (rrfh_3)((Object)staticFieldsf0292b9e212f30cb8a14c2d16461fd94[shortsf0292b9e212f30cb8a14c2d16461fd94[7]]);
        rrfh_3Array[rrfh_3.bytesf0292b9e212f30cb8a14c2d16461fd94[3]] = (rrfh_3)((Object)staticFieldsf0292b9e212f30cb8a14c2d16461fd94[shortsf0292b9e212f30cb8a14c2d16461fd94[8]]);
        rrfh_3Array[rrfh_3.bytesf0292b9e212f30cb8a14c2d16461fd94[4]] = (rrfh_3)((Object)staticFieldsf0292b9e212f30cb8a14c2d16461fd94[shortsf0292b9e212f30cb8a14c2d16461fd94[9]]);
        rrfh_3Array[rrfh_3.bytesf0292b9e212f30cb8a14c2d16461fd94[5]] = (rrfh_3)((Object)staticFieldsf0292b9e212f30cb8a14c2d16461fd94[shortsf0292b9e212f30cb8a14c2d16461fd94[10]]);
        rrfh_3Array[rrfh_3.bytesf0292b9e212f30cb8a14c2d16461fd94[6]] = (rrfh_3)((Object)staticFieldsf0292b9e212f30cb8a14c2d16461fd94[shortsf0292b9e212f30cb8a14c2d16461fd94[11]]);
        return rrfh_3Array;
    }

    private void id_private() {
        if (this.fieldsf0292b9e212f30cb8a14c2d16461fd94 == null) {
            this.fieldsf0292b9e212f30cb8a14c2d16461fd94 = new Object[1];
        }
    }
}

