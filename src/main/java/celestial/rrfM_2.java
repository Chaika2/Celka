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

public class rrfM_2
extends Enum<rrfM_2> {
    private static short[] shorts869ba89e075331349de8f9288d544af1;
    public Object[] fields869ba89e075331349de8f9288d544af1;
    private static boolean[] booleans869ba89e075331349de8f9288d544af1;
    private static double[] doubles869ba89e075331349de8f9288d544af1;
    private static byte[] bytes869ba89e075331349de8f9288d544af1;
    public static Object[] staticFields869ba89e075331349de8f9288d544af1;
    private static String[] strings869ba89e075331349de8f9288d544af1;

    private static void id_byte() {
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
        shorts869ba89e075331349de8f9288d544af1 = sArray;
    }

    private rrfM_2(rrfS_2 ... rrfS_2Array) {
        rrfS_2[] rrfS_2Array2;
        this.id_throws();
        this.fields869ba89e075331349de8f9288d544af1[rrfM_2.shorts869ba89e075331349de8f9288d544af1[1]] = rrfS_2Array2 = rrfS_2Array;
    }

    static {
        rrfM_2.ntfClinit();
    }

    public static rrfM_2[] values() {
        return (rrfM_2[])((rrfM_2[])staticFields869ba89e075331349de8f9288d544af1[shorts869ba89e075331349de8f9288d544af1[0]]).clone();
    }

    public static rrfM_2 valueOf(String string) {
        return Enum.valueOf(rrfM_2.class, string);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-120, -30, 12, 90, -84, -113, 113, 70}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xC632348;
    }

    public rrfS_2[] id_class() {
        return (rrfS_2[])this.fields869ba89e075331349de8f9288d544af1[shorts869ba89e075331349de8f9288d544af1[3]];
    }

    public static rrfM_2 id_class(rdn_3 rdn_32) {
        if (rdn_32.id_break() != rdy_3.dJ) {
            return null;
        }
        rrfM_2[] rrfM_2Array = (rrfM_2[])staticFields869ba89e075331349de8f9288d544af1[shorts869ba89e075331349de8f9288d544af1[2]];
        int n = rrfM_2Array.length;
        for (int i = booleans869ba89e075331349de8f9288d544af1[0]; i < n; ++i) {
            rrfM_2 rrfM_22 = rrfM_2Array[i];
            rrfS_2[] rrfS_2Array = rrfM_22.id_class();
            if (rrfS_2Array.length == 0) continue;
            boolean bl = booleans869ba89e075331349de8f9288d544af1[1];
            rrfS_2[] rrfS_2Array2 = rrfS_2Array;
            int n2 = rrfS_2Array2.length;
            for (int j = booleans869ba89e075331349de8f9288d544af1[2]; j < n2; ++j) {
                rrfS_2 rrfS_22 = rrfS_2Array2[j];
                iJ_2 iJ_22 = rrfS_22.id_class();
                ix_3 ix_32 = rrfS_22.id_byte();
                rXQ rXQ2 = rrfS_22.id_break();
                Multimap<iJ_2, ix_3> multimap = rdn_32.id_class(rXQ2);
                if (multimap.size() != rrfS_2Array.length) {
                    bl = booleans869ba89e075331349de8f9288d544af1[3];
                    break;
                }
                if (multimap.containsKey((Object)iJ_22)) {
                    boolean bl2 = booleans869ba89e075331349de8f9288d544af1[4];
                    for (Map.Entry entry : multimap.entries()) {
                        iJ_2 iJ_23 = (iJ_2)entry.getKey();
                        ix_3 ix_33 = (ix_3)entry.getValue();
                        if (ix_33.id_byte() != ix_32.id_byte() || ix_33.id_protected() != ix_32.id_protected() || !iJ_23.equals(iJ_22)) continue;
                        bl2 = booleans869ba89e075331349de8f9288d544af1[5];
                        break;
                    }
                    if (bl2) continue;
                    bl = booleans869ba89e075331349de8f9288d544af1[6];
                    break;
                }
                bl = booleans869ba89e075331349de8f9288d544af1[7];
                break;
            }
            if (!bl) continue;
            return rrfM_22;
        }
        return null;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x6882EC730591036FL;
    }

    private static /* synthetic */ rrfM_2[] id_break() {
        rrfM_2[] rrfM_2Array = new rrfM_2[bytes869ba89e075331349de8f9288d544af1[0]];
        rrfM_2Array[rrfM_2.booleans869ba89e075331349de8f9288d544af1[8]] = (rrfM_2)((Object)staticFields869ba89e075331349de8f9288d544af1[shorts869ba89e075331349de8f9288d544af1[4]]);
        rrfM_2Array[rrfM_2.booleans869ba89e075331349de8f9288d544af1[9]] = (rrfM_2)((Object)staticFields869ba89e075331349de8f9288d544af1[shorts869ba89e075331349de8f9288d544af1[5]]);
        rrfM_2Array[rrfM_2.bytes869ba89e075331349de8f9288d544af1[1]] = (rrfM_2)((Object)staticFields869ba89e075331349de8f9288d544af1[shorts869ba89e075331349de8f9288d544af1[6]]);
        rrfM_2Array[rrfM_2.bytes869ba89e075331349de8f9288d544af1[2]] = (rrfM_2)((Object)staticFields869ba89e075331349de8f9288d544af1[shorts869ba89e075331349de8f9288d544af1[7]]);
        rrfM_2Array[rrfM_2.bytes869ba89e075331349de8f9288d544af1[3]] = (rrfM_2)((Object)staticFields869ba89e075331349de8f9288d544af1[shorts869ba89e075331349de8f9288d544af1[8]]);
        rrfM_2Array[rrfM_2.bytes869ba89e075331349de8f9288d544af1[4]] = (rrfM_2)((Object)staticFields869ba89e075331349de8f9288d544af1[shorts869ba89e075331349de8f9288d544af1[9]]);
        rrfM_2Array[rrfM_2.bytes869ba89e075331349de8f9288d544af1[5]] = (rrfM_2)((Object)staticFields869ba89e075331349de8f9288d544af1[shorts869ba89e075331349de8f9288d544af1[10]]);
        rrfM_2Array[rrfM_2.bytes869ba89e075331349de8f9288d544af1[6]] = (rrfM_2)((Object)staticFields869ba89e075331349de8f9288d544af1[shorts869ba89e075331349de8f9288d544af1[11]]);
        return rrfM_2Array;
    }

    private void id_throws() {
        if (this.fields869ba89e075331349de8f9288d544af1 == null) {
            this.fields869ba89e075331349de8f9288d544af1 = new Object[1];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrfM_2.id_catch();
        rrfM_2.id_protected();
        rrfM_2.id_byte();
        rrfM_2.id_implements();
        rrfM_2.id_case();
        rrfM_2.id_private();
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
        booleans869ba89e075331349de8f9288d544af1 = blArray;
    }

    private static void id_case() {
        bytes869ba89e075331349de8f9288d544af1 = new byte[]{8, 2, 3, 4, 5, 6, 7, 5, 2, 3, 4, 2, 2, 4, 2, 3, 2, 3, 3, 2, 3, 4, 2, 4, 5, 2, 5, 6, 2, 6, 7, 3, 2, 7, 9, 8, 10};
    }

    private static void id_implements() {
        doubles869ba89e075331349de8f9288d544af1 = new double[]{1.5, -4.0, 2.5, 0.07, 0.13, 2.0, 0.15, 1.0, 4.0, 0.1, 0.1, -2.0, -2.0, 6.0, 2.0, 4.0, 2.0, 2.0, 2.0, 1.0, 2.5, -0.15, 2.5};
    }

    private static void id_protected() {
        strings869ba89e075331349de8f9288d544af1 = new String[]{new String("CHAOS"), new String(""), new String(""), new String(""), new String(""), new String(""), new String("SATIRE"), new String(""), new String(""), new String("BEAST"), new String(""), new String(""), new String(""), new String(""), new String("ARES"), new String(""), new String(""), new String(""), new String("HYDRA"), new String(""), new String(""), new String("ICARUS"), new String(""), new String(""), new String("ERID"), new String(""), new String(""), new String("TITAN"), new String(""), new String(""), new String("")};
    }

    private static void id_private() {
        Object[] objectArray = new Object[10];
        rrfS_2[] rrfS_2Array = new rrfS_2[]{new rrfS_2(iQ_2.id_implements, new ix_3(new UUID(-9212241506230515135L, -4621443875574229328L), strings869ba89e075331349de8f9288d544af1[1], 1.5, id_3.ADDITION), rXQ.OFFHAND), new rrfS_2(iQ_2.id_class, new ix_3(strings869ba89e075331349de8f9288d544af1[2], -4.0, id_3.ADDITION), rXQ.OFFHAND), new rrfS_2(iQ_2.id_case, new ix_3(strings869ba89e075331349de8f9288d544af1[3], 2.5, id_3.ADDITION), rXQ.OFFHAND), new rrfS_2(iQ_2.id_protected, new ix_3(strings869ba89e075331349de8f9288d544af1[4], 0.07, id_3.MULTIPLY_BASE), rXQ.OFFHAND), new rrfS_2(iQ_2.id_private, new ix_3(strings869ba89e075331349de8f9288d544af1[5], 0.13, id_3.MULTIPLY_BASE), rXQ.OFFHAND)};
        objectArray[0] = new rrfM_2(rrfS_2Array);
        rrfS_2[] rrfS_2Array2 = new rrfS_2[]{new rrfS_2(iQ_2.id_case, new ix_3(strings869ba89e075331349de8f9288d544af1[7], 2.0, id_3.ADDITION), rXQ.OFFHAND), new rrfS_2(iQ_2.id_private, new ix_3(strings869ba89e075331349de8f9288d544af1[8], 0.15, id_3.MULTIPLY_BASE), rXQ.OFFHAND)};
        objectArray[1] = new rrfM_2(rrfS_2Array2);
        rrfS_2[] rrfS_2Array3 = new rrfS_2[]{new rrfS_2(iQ_2.id_implements, new ix_3(strings869ba89e075331349de8f9288d544af1[10], 1.0, id_3.ADDITION), rXQ.OFFHAND), new rrfS_2(iQ_2.id_class, new ix_3(strings869ba89e075331349de8f9288d544af1[11], 4.0, id_3.ADDITION), rXQ.OFFHAND), new rrfS_2(iQ_2.id_protected, new ix_3(strings869ba89e075331349de8f9288d544af1[12], 0.1, id_3.MULTIPLY_BASE), rXQ.OFFHAND), new rrfS_2(iQ_2.id_private, new ix_3(strings869ba89e075331349de8f9288d544af1[13], 0.1, id_3.MULTIPLY_BASE), rXQ.OFFHAND)};
        objectArray[2] = new rrfM_2(rrfS_2Array3);
        rrfS_2[] rrfS_2Array4 = new rrfS_2[]{new rrfS_2(iQ_2.id_implements, new ix_3(strings869ba89e075331349de8f9288d544af1[15], -2.0, id_3.ADDITION), rXQ.OFFHAND), new rrfS_2(iQ_2.id_class, new ix_3(strings869ba89e075331349de8f9288d544af1[16], -2.0, id_3.ADDITION), rXQ.OFFHAND), new rrfS_2(iQ_2.id_case, new ix_3(strings869ba89e075331349de8f9288d544af1[17], 6.0, id_3.ADDITION), rXQ.OFFHAND)};
        objectArray[3] = new rrfM_2(rrfS_2Array4);
        rrfS_2[] rrfS_2Array5 = new rrfS_2[]{new rrfS_2(iQ_2.id_implements, new ix_3(strings869ba89e075331349de8f9288d544af1[19], 2.0, id_3.ADDITION), rXQ.OFFHAND), new rrfS_2(iQ_2.id_class, new ix_3(strings869ba89e075331349de8f9288d544af1[20], 4.0, id_3.ADDITION), rXQ.OFFHAND)};
        objectArray[4] = new rrfM_2(rrfS_2Array5);
        rrfS_2[] rrfS_2Array6 = new rrfS_2[]{new rrfS_2(iQ_2.id_class, new ix_3(strings869ba89e075331349de8f9288d544af1[22], 2.0, id_3.ADDITION), rXQ.OFFHAND), new rrfS_2(iQ_2.id_case, new ix_3(strings869ba89e075331349de8f9288d544af1[23], 2.0, id_3.ADDITION), rXQ.OFFHAND)};
        objectArray[5] = new rrfM_2(rrfS_2Array6);
        rrfS_2[] rrfS_2Array7 = new rrfS_2[]{new rrfS_2(iQ_2.id_class, new ix_3(strings869ba89e075331349de8f9288d544af1[25], 2.0, id_3.ADDITION), rXQ.OFFHAND), new rrfS_2(iQ_2.id_extends, new ix_3(strings869ba89e075331349de8f9288d544af1[26], 1.0, id_3.ADDITION), rXQ.OFFHAND)};
        objectArray[6] = new rrfM_2(rrfS_2Array7);
        rrfS_2[] rrfS_2Array8 = new rrfS_2[]{new rrfS_2(iQ_2.id_implements, new ix_3(strings869ba89e075331349de8f9288d544af1[28], 2.5, id_3.ADDITION), rXQ.OFFHAND), new rrfS_2(iQ_2.id_protected, new ix_3(strings869ba89e075331349de8f9288d544af1[29], -0.15, id_3.MULTIPLY_BASE), rXQ.OFFHAND), new rrfS_2(iQ_2.id_finally, new ix_3(strings869ba89e075331349de8f9288d544af1[30], 2.5, id_3.ADDITION), rXQ.OFFHAND)};
        objectArray[7] = new rrfM_2(rrfS_2Array8);
        objectArray[8] = new rrfM_2[]{(rrfM_2)((Object)objectArray[0]), (rrfM_2)((Object)objectArray[1]), (rrfM_2)((Object)objectArray[2]), (rrfM_2)((Object)objectArray[3]), (rrfM_2)((Object)objectArray[4]), (rrfM_2)((Object)objectArray[5]), (rrfM_2)((Object)objectArray[6]), (rrfM_2)((Object)objectArray[7])};
        objectArray[9] = new rrfM_2[]{(rrfM_2)((Object)objectArray[0]), (rrfM_2)((Object)objectArray[1]), (rrfM_2)((Object)objectArray[2]), (rrfM_2)((Object)objectArray[3]), (rrfM_2)((Object)objectArray[4]), (rrfM_2)((Object)objectArray[5]), (rrfM_2)((Object)objectArray[6]), (rrfM_2)((Object)objectArray[7])};
        staticFields869ba89e075331349de8f9288d544af1 = objectArray;
    }
}

