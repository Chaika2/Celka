/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 */
package celestial;

import celestial.MB;
import celestial.Sj_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.ri_3;
import celestial.rqM_2;
import celestial.xc_3;
import celestial.xu_3;
import com.google.common.collect.ImmutableSet;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class St_1 {
    private static short[] id_byte;
    private static byte[] id_protected;
    private static boolean[] id_throws;
    public static Object[] id_class;
    private static long[] id_case;
    public Object[] id_break;
    private static String[] id_catch;
    private static int[] id_private;

    public byte[] id_byte() {
        return ((BitSet)this.id_break[id_byte[31]]).toByteArray();
    }

    public St_1(int n, int n2, BitSet bitSet, xc_3[] xc_3Array, Map<String, List<rfH_2>> map, long l) {
        Map<String, List<rfH_2>> map2;
        xc_3[] xc_3Array2;
        this.id_private();
        St_1.id_class(bitSet);
        Integer n3 = n;
        this.id_break[St_1.id_byte[0]] = n3;
        Integer n4 = n2;
        this.id_break[St_1.id_byte[1]] = n4;
        BitSet bitSet2 = bitSet;
        this.id_break[St_1.id_byte[2]] = bitSet2;
        this.id_break[St_1.id_byte[3]] = xc_3Array2 = xc_3Array;
        int[] nArray = new int[id_byte[4]];
        this.id_break[St_1.id_byte[5]] = nArray;
        this.id_break[St_1.id_byte[6]] = map2 = map;
        Long l2 = l;
        this.id_break[St_1.id_byte[7]] = l2;
        if (map.isEmpty()) {
            Object var19_14 = null;
            this.id_break[St_1.id_byte[8]] = var19_14;
        } else {
            Int2ObjectOpenHashMap int2ObjectOpenHashMap = new Int2ObjectOpenHashMap();
            this.id_break[St_1.id_byte[9]] = int2ObjectOpenHashMap;
            this.id_protected();
        }
        this.id_extends();
    }

    static {
        St_1.ntfClinit();
    }

    public xc_3 id_class(int n, int n2, int n3, rqM_2<rYB> rqM_22) {
        String string;
        int n4 = St_1.id_class(n, n2, n3);
        MB mB = this.id_break(n4);
        int n5 = n3 << id_protected[0] | n;
        if (((int[])this.id_break[id_byte[12]])[n5] == n2 && mB != (MB)((Object)MB.staticFields66e4c6f8de393faf832676ed33680249[id_byte[13]])) {
            return ((xc_3[])this.id_break[id_byte[14]])[n5];
        }
        if ((Int2ObjectOpenHashMap)this.id_break[id_byte[15]] != null && (string = (String)((Int2ObjectOpenHashMap)this.id_break[id_byte[16]]).get(n4)) != null) {
            return ri_3.id_break(string).id_continue();
        }
        if (mB == (MB)((Object)MB.staticFields66e4c6f8de393faf832676ed33680249[id_byte[17]])) {
            if (n2 == id_protected[1] && rqM_22 == rYB.id_protected) {
                return xu_3.id_while.id_continue();
            }
            if (n2 < id_protected[2] && rqM_22 == rYB.id_byte) {
                return xu_3.rg.id_continue();
            }
        }
        return Sj_1.id_class(mB, rqM_22);
    }

    public static int id_class(int n, int n2, int n3) {
        return n << id_throws[5] | n3 << id_protected[8] | n2 << id_protected[9];
    }

    public xc_3[] id_class() {
        return (xc_3[])this.id_break[id_byte[25]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x2D7AC5D8;
    }

    private static void id_class(BitSet bitSet) {
        if (bitSet.size() > id_private[0]) {
            throw new IllegalArgumentException(id_catch[0]);
        }
    }

    public ArrayList<rfH_2> id_class(String string) {
        if (((Map)this.id_break[id_byte[27]]).get(string) == null) {
            return null;
        }
        ArrayList<rfH_2> arrayList = new ArrayList<rfH_2>();
        for (rfH_2 rfH_22 : (List)((Map)this.id_break[id_byte[28]]).get(string)) {
            arrayList.add(new rfH_2(rfH_22.b_() + (Integer)this.id_break[id_byte[29]] * id_protected[6], rfH_22.c_(), rfH_22.d_() + (Integer)this.id_break[id_byte[30]] * id_protected[7]));
        }
        return arrayList;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xB7405BD34E213711L;
    }

    public Map<String, List<rfH_2>> id_break() {
        return (Map)this.id_break[id_byte[26]];
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{12, 15, 64, -36, 121, -45, 79, 114}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private MB id_break(int n) {
        return MB.id_class(((BitSet)this.id_break[id_byte[18]]).get(n), ((BitSet)this.id_break[id_byte[19]]).get(n + id_throws[0]));
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[14];
        blArray[0] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[7] = true;
        blArray[11] = true;
        blArray[13] = true;
        id_throws = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        St_1.id_throws();
        St_1.id_volatile();
        St_1.id_case();
        St_1.id_finally();
        St_1.id_native();
        St_1.id_catch();
        St_1.id_implements();
    }

    private static void id_finally() {
        short[] sArray = new short[33];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[3] = 4;
        sArray[4] = 256;
        sArray[5] = 5;
        sArray[6] = 6;
        sArray[7] = 7;
        sArray[8] = 3;
        sArray[9] = 3;
        sArray[10] = 6;
        sArray[11] = 3;
        sArray[12] = 5;
        sArray[13] = 2;
        sArray[14] = 4;
        sArray[15] = 3;
        sArray[16] = 3;
        sArray[17] = 3;
        sArray[18] = 2;
        sArray[19] = 2;
        sArray[20] = 5;
        sArray[21] = 256;
        sArray[22] = 2;
        sArray[23] = 2;
        sArray[24] = 5;
        sArray[25] = 4;
        sArray[26] = 6;
        sArray[27] = 6;
        sArray[28] = 6;
        sArray[30] = 1;
        sArray[31] = 2;
        sArray[32] = 16384;
        id_byte = sArray;
    }

    private static void id_catch() {
        id_private = new int[]{131072, 131072};
    }

    private void id_extends() {
        for (int i = id_throws[1]; i < id_protected[3]; ++i) {
            block1: for (int j = id_throws[2]; j < id_protected[4]; ++j) {
                int n = i << id_protected[5] | j;
                ((int[])this.id_break[St_1.id_byte[20]])[n] = id_throws[3];
                for (int k = id_byte[21]; k >= 0; --k) {
                    int n2 = St_1.id_class(j, k, i);
                    if (!((BitSet)this.id_break[id_byte[22]]).get(n2) && !((BitSet)this.id_break[id_byte[23]]).get(n2 + id_throws[4])) continue;
                    ((int[])this.id_break[St_1.id_byte[24]])[n] = k;
                    continue block1;
                }
            }
        }
    }

    private static void id_case() {
        id_case = new long[1];
    }

    private static void id_implements() {
        Object[] objectArray = new Object[3];
        Object[] objectArray2 = new Object[]{xu_3.SW, xu_3.Ps, xu_3.re, xu_3.sZ, xu_3.SM, xu_3.SO, xu_3.rD, xu_3.Ec, xu_3.bK, xu_3.bU, xu_3.be, xu_3.ba, xu_3.bi, xu_3.Mr, xu_3.MP, xu_3.MB, xu_3.MS, xu_3.Ms, xu_3.ME, xu_3.MG, xu_3.Mb, xu_3.MM, xu_3.MO, xu_3.Mh, xu_3.MX, xu_3.Pi, xu_3.sl, xu_3.Sv, xu_3.SG, xu_3.sW, xu_3.sz, xu_3.sQ, xu_3.sN, xu_3.sd, xu_3.sk, xu_3.sJ, xu_3.sx, xu_3.sM, xu_3.sO, xu_3.sh, xu_3.sX, xu_3.SE, xu_3.sc, xu_3.C, xu_3.l, xu_3.H, xu_3.y, xu_3.p, xu_3.q, xu_3.T, xu_3.t, xu_3.w, xu_3.I, xu_3.f, xu_3.j, xu_3.V, xu_3.g, xu_3.R, xu_3.Y, xu_3.SX, xu_3.Pj, xu_3.bw, xu_3.U, xu_3.Ss, xu_3.PJ, xu_3.BD};
        objectArray[0] = ImmutableSet.copyOf((Object[])objectArray2);
        objectArray[1] = 131072;
        objectArray[2] = 16384;
        id_class = objectArray;
    }

    private final void id_protected() {
        for (Map.Entry entry : ((Map)this.id_break[id_byte[10]]).entrySet()) {
            for (rfH_2 rfH_22 : (List)entry.getValue()) {
                ((Int2ObjectOpenHashMap)this.id_break[id_byte[11]]).put(St_1.id_class(rfH_22.b_(), rfH_22.c_(), rfH_22.d_()), (Object)((String)entry.getKey()));
            }
        }
    }

    private void id_private() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_protected[69]];
            objectArray[St_1.id_throws[9]] = id_throws[10];
            objectArray[St_1.id_throws[11]] = id_throws[12];
            objectArray[St_1.id_protected[70]] = id_case[0];
        }
    }

    private static void id_volatile() {
        id_catch = new String[]{new String("BitSet of invalid length provided")};
    }

    private static void id_native() {
        id_protected = new byte[]{4, 127, 5, 16, 16, 4, 16, 16, 5, 9, 60, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 8, 7, 3, 2};
    }
}

