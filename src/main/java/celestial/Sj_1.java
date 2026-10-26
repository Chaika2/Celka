/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
package celestial;

import celestial.EF;
import celestial.Ja_1;
import celestial.MB;
import celestial.SV;
import celestial.St_1;
import celestial.bw_3;
import celestial.dI_2;
import celestial.du_3;
import celestial.rVM;
import celestial.rYB;
import celestial.rfH_2;
import celestial.ri_3;
import celestial.rjU_2;
import celestial.roJ_2;
import celestial.roQ_2;
import celestial.rqM_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import celestial.zc_3;
import com.google.common.collect.ImmutableSet;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Sj_1 {
    private static int[] id_class;
    private static short[] id_break;
    private static byte[] id_byte;
    private static double[] id_protected;
    private static boolean[] id_throws;

    private static void id_byte() {
        id_protected = new double[2];
    }

    private Sj_1() {
    }

    static {
        Sj_1.ntfClinit();
    }

    public static St_1 id_class(roJ_2 roJ_22) {
        int n;
        int n2;
        Object[] objectArray;
        HashMap<String, List<rfH_2>> hashMap = new HashMap<String, List<rfH_2>>();
        BitSet bitSet = new BitSet(id_class[0]);
        try {
            objectArray = roJ_22.id_byte();
            for (n2 = id_throws[0]; n2 < id_byte[0]; ++n2) {
                Object object = objectArray[n2];
                if (object == null) continue;
                rVM<xc_3> rVM2 = ((roQ_2)object).id_implements();
                n = n2 << id_byte[1];
                for (int i = id_throws[1]; i < id_byte[2]; ++i) {
                    int n3 = i | n;
                    for (int j = id_throws[2]; j < id_byte[3]; ++j) {
                        for (int k = id_throws[3]; k < id_byte[4]; ++k) {
                            int n4 = St_1.id_class(k, n3, j);
                            xc_3 xc_32 = rVM2.id_class(k, i, j);
                            boolean[] blArray = Sj_1.id_class(xc_32, roJ_22, k, n3, j).id_class();
                            bitSet.set(n4, blArray[id_throws[4]]);
                            bitSet.set(n4 + id_throws[5], blArray[id_throws[6]]);
                            xd_3 xd_32 = xc_32.id_break();
                            if (!((ImmutableSet)St_1.id_class[id_break[0]]).contains((Object)xd_32)) continue;
                            String string2 = ri_3.id_class(xd_32);
                            hashMap.computeIfAbsent(string2, string -> new ArrayList()).add(new rfH_2(k, n3, j));
                        }
                    }
                }
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        objectArray = new xc_3[id_break[1]];
        for (n2 = id_throws[7]; n2 < id_byte[5]; ++n2) {
            block7: for (int i = id_throws[8]; i < id_byte[6]; ++i) {
                for (int j = id_break[2]; j >= 0; --j) {
                    n = St_1.id_class(i, j, n2);
                    if (!bitSet.get(n) && !bitSet.get(n + id_throws[9])) continue;
                    objectArray[n2 << Sj_1.id_byte[7] | i] = bw_3.id_class(roJ_22, i, j, n2);
                    continue block7;
                }
                objectArray[n2 << Sj_1.id_byte[8] | i] = xu_3.id_class.id_continue();
            }
        }
        return new St_1(roJ_22.id_private().id_break, roJ_22.id_private().id_byte, bitSet, (xc_3[])objectArray, hashMap, System.currentTimeMillis());
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{79, -62, 0, -90, 22, 16, 90, 54}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static xc_3 id_class(MB mB, rqM_2<rYB> rqM_22) {
        switch (((int[])SV.id_class[id_break[11]])[mB.ordinal()]) {
            case 1: {
                return xu_3.id_class.id_continue();
            }
            case 2: {
                return xu_3.id_try.id_continue();
            }
            case 3: {
                return xu_3.id_instanceof.id_continue();
            }
            case 4: {
                if (rqM_22 == rYB.id_byte) {
                    return xu_3.id_break.id_continue();
                }
                if (rqM_22 == rYB.id_protected) {
                    return xu_3.PR.id_continue();
                }
                if (rqM_22 != rYB.id_throws) break;
                return xu_3.Sh.id_continue();
            }
        }
        return null;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xD4E29BAE;
    }

    private static MB id_class(xc_3 xc_32, roJ_2 roJ_22, int n, int n2, int n3) {
        xd_3 xd_32 = xc_32.id_break();
        if (EF.id_byte(xc_32)) {
            if (EF.id_protected(xc_32)) {
                return (MB)((Object)MB.staticFields66e4c6f8de393faf832676ed33680249[id_break[3]]);
            }
            if (n != id_byte[9] && EF.id_protected(bw_3.id_class(roJ_22, n + id_throws[10], n2, n3)) || n != 0 && EF.id_protected(bw_3.id_class(roJ_22, n - id_throws[11], n2, n3)) || n3 != id_byte[10] && EF.id_protected(bw_3.id_class(roJ_22, n, n2, n3 + id_throws[12])) || n3 != 0 && EF.id_protected(bw_3.id_class(roJ_22, n, n2, n3 - id_throws[13]))) {
                return (MB)((Object)MB.staticFields66e4c6f8de393faf832676ed33680249[id_break[4]]);
            }
            if (n == 0 || n == id_byte[11] || n3 == 0 || n3 == id_byte[12]) {
                rjU_2 rjU_22 = xc_32.id_volatile().id_byte(roJ_22.id_extends(), new rfH_2(n + (roJ_22.id_private().id_break << id_byte[13]), n2, n3 + (roJ_22.id_private().id_byte << id_byte[14])));
                if (rjU_22.id_break != id_protected[0] || rjU_22.id_protected != id_protected[1]) {
                    return (MB)((Object)MB.staticFields66e4c6f8de393faf832676ed33680249[id_break[5]]);
                }
                return (MB)((Object)MB.staticFields66e4c6f8de393faf832676ed33680249[id_break[6]]);
            }
            return (MB)((Object)MB.staticFields66e4c6f8de393faf832676ed33680249[id_break[7]]);
        }
        if (EF.id_throws(xc_32) || EF.id_break(xc_32)) {
            return (MB)((Object)MB.staticFields66e4c6f8de393faf832676ed33680249[id_break[8]]);
        }
        if (xd_32 instanceof Ja_1 || xd_32 instanceof zc_3 || xd_32 instanceof du_3 || xd_32 instanceof dI_2) {
            return (MB)((Object)MB.staticFields66e4c6f8de393faf832676ed33680249[id_break[9]]);
        }
        return (MB)((Object)MB.staticFields66e4c6f8de393faf832676ed33680249[id_break[10]]);
    }

    private static void id_class() {
        short[] sArray = new short[12];
        sArray[1] = 256;
        sArray[2] = 255;
        sArray[3] = 2;
        sArray[4] = 2;
        sArray[5] = 1;
        sArray[6] = 2;
        sArray[7] = 1;
        sArray[8] = 2;
        sArray[10] = 3;
        id_break = sArray;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xAC5138E02B12AC07L;
    }

    private static void id_break() {
        boolean[] blArray = new boolean[14];
        blArray[5] = true;
        blArray[6] = true;
        blArray[9] = true;
        blArray[10] = true;
        blArray[11] = true;
        blArray[12] = true;
        blArray[13] = true;
        id_throws = blArray;
    }

    private static void id_throws() {
        id_class = new int[]{131072};
    }

    private static /* synthetic */ void ntfClinit() {
        Sj_1.id_break();
        Sj_1.id_class();
        Sj_1.id_byte();
        Sj_1.id_protected();
        Sj_1.id_throws();
    }

    private static void id_protected() {
        id_byte = new byte[]{16, 4, 16, 16, 16, 16, 16, 4, 4, 15, 15, 15, 15, 4, 4};
    }
}

