/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.AO;
import celestial.C_goto;
import celestial.C_super;
import celestial.Ps_1;
import celestial.rU_2;
import celestial.rVM;
import celestial.ra_3;
import celestial.rfH_2;
import celestial.rfj_3;
import celestial.roJ_2;
import celestial.roQ_2;
import celestial.roX_2;
import celestial.xc_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class So_1
extends Enum<So_1>
implements C_goto {
    private static boolean[] booleans4d15df505e473c14b11aa564ea558cfe;
    public static Object[] staticFields4d15df505e473c14b11aa564ea558cfe;
    private static String[] strings4d15df505e473c14b11aa564ea558cfe;
    private static short[] shorts4d15df505e473c14b11aa564ea558cfe;
    private static byte[] bytes4d15df505e473c14b11aa564ea558cfe;

    private static /* synthetic */ So_1[] id_byte() {
        So_1[] so_1Array = new So_1[booleans4d15df505e473c14b11aa564ea558cfe[20]];
        so_1Array[So_1.booleans4d15df505e473c14b11aa564ea558cfe[21]] = (So_1)staticFields4d15df505e473c14b11aa564ea558cfe[shorts4d15df505e473c14b11aa564ea558cfe[2]];
        return so_1Array;
    }

    static {
        So_1.ntfClinit();
    }

    public static So_1[] values() {
        return (So_1[])((So_1[])staticFields4d15df505e473c14b11aa564ea558cfe[shorts4d15df505e473c14b11aa564ea558cfe[0]]).clone();
    }

    public static So_1 valueOf(String string) {
        return Enum.valueOf(So_1.class, string);
    }

    @Override
    public List<rfH_2> id_class(Ps_1 ps_1, ra_3 ra_32, int n3, int n4, int n5) {
        ArrayList<rfH_2> arrayList = new ArrayList<rfH_2>();
        if (ra_32.id_class().isEmpty()) {
            return arrayList;
        }
        AO aO = (AO)ps_1.id_case().id_goto();
        int n6 = n5 * n5;
        int n7 = ps_1.id_volatile().b_() >> bytes4d15df505e473c14b11aa564ea558cfe[0];
        int n8 = ps_1.id_volatile().d_() >> bytes4d15df505e473c14b11aa564ea558cfe[1];
        int n9 = ps_1.id_volatile().c_();
        int n10 = n9 >> bytes4d15df505e473c14b11aa564ea558cfe[2];
        int[] nArray = IntStream.range(booleans4d15df505e473c14b11aa564ea558cfe[0], bytes4d15df505e473c14b11aa564ea558cfe[3]).boxed().sorted(Comparator.comparingInt(n2 -> Math.abs(n2 - n10))).mapToInt(n -> n).toArray();
        int n11 = booleans4d15df505e473c14b11aa564ea558cfe[1];
        boolean bl = booleans4d15df505e473c14b11aa564ea558cfe[2];
        while (true) {
            boolean bl2 = booleans4d15df505e473c14b11aa564ea558cfe[3];
            boolean bl3 = booleans4d15df505e473c14b11aa564ea558cfe[4];
            for (int i = -n11; i <= n11; ++i) {
                for (int j = -n11; j <= n11; ++j) {
                    int n12 = i * i + j * j;
                    if (n12 != n11) continue;
                    bl3 = booleans4d15df505e473c14b11aa564ea558cfe[5];
                    int n13 = i + n7;
                    int n14 = j + n8;
                    roJ_2 roJ_22 = aO.id_class(n13, n14, null, booleans4d15df505e473c14b11aa564ea558cfe[6]);
                    if (roJ_22 == null) continue;
                    bl2 = booleans4d15df505e473c14b11aa564ea558cfe[7];
                    if (!this.id_class(n13 << bytes4d15df505e473c14b11aa564ea558cfe[4], n14 << bytes4d15df505e473c14b11aa564ea558cfe[5], roJ_22, ra_32, arrayList, n3, n4, n9, nArray)) continue;
                    bl = booleans4d15df505e473c14b11aa564ea558cfe[8];
                }
            }
            if (bl2 && bl3 || arrayList.size() >= n3 && (n11 > n6 || n11 > booleans4d15df505e473c14b11aa564ea558cfe[9] && bl)) {
                return arrayList;
            }
            ++n11;
        }
    }

    @Override
    public int id_class(Ps_1 ps_1) {
        return this.id_class(ps_1, bytes4d15df505e473c14b11aa564ea558cfe[8]);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xDCF62476725E0F6EL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xEB20A535;
    }

    @Override
    public int id_class(Ps_1 ps_1, int n) {
        roX_2 roX_22 = ps_1.id_case().id_goto();
        C_super c_super = ps_1.id_package().id_break();
        rU_2 rU_22 = ps_1.id_volatile();
        int n2 = rU_22.b_() >> bytes4d15df505e473c14b11aa564ea558cfe[9];
        int n3 = rU_22.d_() >> bytes4d15df505e473c14b11aa564ea558cfe[10];
        int n4 = n2 - n;
        int n5 = n3 - n;
        int n6 = n2 + n;
        int n7 = n3 + n;
        int n8 = booleans4d15df505e473c14b11aa564ea558cfe[11];
        for (int i = n4; i <= n6; ++i) {
            for (int j = n5; j <= n7; ++j) {
                roJ_2 roJ_22 = roX_22.id_class(i, j, booleans4d15df505e473c14b11aa564ea558cfe[12]);
                if (roJ_22 == null || roJ_22.id_catch()) continue;
                ++n8;
                c_super.id_class(roJ_22);
            }
        }
        return n8;
    }

    private static void id_class() {
        short[] sArray = new short[3];
        sArray[0] = 2;
        sArray[1] = 1;
        shorts4d15df505e473c14b11aa564ea558cfe = sArray;
    }

    @Override
    public List<rfH_2> id_class(Ps_1 ps_1, ra_3 ra_32, rfj_3 rfj_32, int n, int n2) {
        if (ra_32.id_class().isEmpty()) {
            return Collections.emptyList();
        }
        AO aO = (AO)ps_1.id_case().id_goto();
        roJ_2 roJ_22 = aO.id_class(rfj_32.id_break, rfj_32.id_byte, null, booleans4d15df505e473c14b11aa564ea558cfe[10]);
        int n3 = ps_1.id_volatile().c_();
        if (roJ_22 == null || roJ_22.id_catch()) {
            return Collections.emptyList();
        }
        ArrayList<rfH_2> arrayList = new ArrayList<rfH_2>();
        this.id_class(rfj_32.id_break << bytes4d15df505e473c14b11aa564ea558cfe[6], rfj_32.id_byte << bytes4d15df505e473c14b11aa564ea558cfe[7], roJ_22, ra_32, arrayList, n, n2, n3, (int[])staticFields4d15df505e473c14b11aa564ea558cfe[shorts4d15df505e473c14b11aa564ea558cfe[1]]);
        return arrayList;
    }

    private boolean id_class(int n, int n2, roJ_2 roJ_22, ra_3 ra_32, Collection<rfH_2> collection, int n3, int n4, int n5, int[] nArray) {
        roQ_2[] roQ_2Array = roJ_22.id_byte();
        boolean bl = booleans4d15df505e473c14b11aa564ea558cfe[13];
        for (int i = booleans4d15df505e473c14b11aa564ea558cfe[14]; i < bytes4d15df505e473c14b11aa564ea558cfe[11]; ++i) {
            int n6 = nArray[i];
            roQ_2 roQ_22 = roQ_2Array[n6];
            if (roQ_22 == null || roQ_2.id_class(roQ_22)) continue;
            int n7 = n6 << bytes4d15df505e473c14b11aa564ea558cfe[12];
            rVM<xc_3> rVM2 = roQ_22.id_implements();
            for (int j = booleans4d15df505e473c14b11aa564ea558cfe[15]; j < bytes4d15df505e473c14b11aa564ea558cfe[13]; ++j) {
                for (int k = booleans4d15df505e473c14b11aa564ea558cfe[16]; k < bytes4d15df505e473c14b11aa564ea558cfe[14]; ++k) {
                    for (int i2 = booleans4d15df505e473c14b11aa564ea558cfe[17]; i2 < bytes4d15df505e473c14b11aa564ea558cfe[15]; ++i2) {
                        xc_3 xc_32 = rVM2.id_class(i2, j, k);
                        if (!ra_32.id_class(xc_32)) continue;
                        int n8 = n7 | j;
                        if (collection.size() >= n3) {
                            if (Math.abs(n8 - n5) < n4) {
                                bl = booleans4d15df505e473c14b11aa564ea558cfe[18];
                            } else if (bl) {
                                return booleans4d15df505e473c14b11aa564ea558cfe[19];
                            }
                        }
                        collection.add(new rfH_2(n | i2, n8, n2 | k));
                    }
                }
            }
        }
        return bl;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{84, -101, -99, 87, -128, -111, -23, -26}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        boolean[] blArray = new boolean[26];
        blArray[3] = true;
        blArray[5] = true;
        blArray[8] = true;
        blArray[9] = true;
        blArray[18] = true;
        blArray[19] = true;
        blArray[20] = true;
        blArray[25] = true;
        booleans4d15df505e473c14b11aa564ea558cfe = blArray;
    }

    private static void id_throws() {
        bytes4d15df505e473c14b11aa564ea558cfe = new byte[]{4, 4, 4, 16, 4, 4, 4, 4, 40, 4, 4, 16, 4, 16, 16, 16, 2, 16, 3};
    }

    private static /* synthetic */ void ntfClinit() {
        So_1.id_break();
        So_1.id_protected();
        So_1.id_class();
        So_1.id_throws();
        So_1.id_case();
    }

    private static void id_case() {
        Object[] objectArray = new Object[3];
        objectArray[0] = new So_1();
        int[] nArray = new int[16];
        nArray[1] = 1;
        nArray[2] = 2;
        nArray[3] = 3;
        nArray[4] = 4;
        nArray[5] = 5;
        nArray[6] = 6;
        nArray[7] = 7;
        nArray[8] = 8;
        nArray[9] = 9;
        nArray[10] = 10;
        nArray[11] = 11;
        nArray[12] = 12;
        nArray[13] = 13;
        nArray[14] = 14;
        nArray[15] = 15;
        objectArray[1] = nArray;
        objectArray[2] = new So_1[]{(So_1)objectArray[0]};
        staticFields4d15df505e473c14b11aa564ea558cfe = objectArray;
    }

    private static void id_protected() {
        strings4d15df505e473c14b11aa564ea558cfe = new String[]{new String("INSTANCE")};
    }
}

