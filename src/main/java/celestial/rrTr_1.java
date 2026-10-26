/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.ints.IntOpenHashSet
 */
package celestial;

import celestial.Hz_1;
import celestial.IJ;
import celestial.Ml_1;
import celestial.QY;
import celestial.Wp_1;
import celestial.module.render.ShulkerPreview;
import celestial.rdn_3;
import celestial.rjV_2;
import celestial.rji_3;
import celestial.rpL_2;
import celestial.rrTP;
import celestial.rrfa_3;
import celestial.rrjm_3;
import celestial.rsE_2;
import celestial.rxJ_2;
import celestial.util.MinecraftAccessor;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTr_1
implements MinecraftAccessor {
    private static byte[] id_byte;
    private static double[] id_protected;
    public Object[] id_class;
    public static Object[] id_break;
    private static short[] id_throws;
    private static float[] id_case;
    private static boolean[] id_catch;

    public void id_byte() {
        if (!((Int2ObjectMap)this.id_class[id_throws[17]]).isEmpty()) {
            ((Int2ObjectMap)this.id_class[id_throws[18]]).keySet().removeIf(n -> !((Int2ObjectMap)this.id_class[id_throws[41]]).containsKey(n) ? id_catch[20] : id_catch[21]);
        }
        if (!((Int2ObjectMap)this.id_class[id_throws[19]]).isEmpty()) {
            ((Int2ObjectMap)this.id_class[id_throws[20]]).keySet().removeIf(n -> !((Int2ObjectMap)this.id_class[id_throws[40]]).containsKey(n) ? id_catch[18] : id_catch[19]);
        }
    }

    private static int id_byte(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x512D4D92;
    }

    public rrTr_1() {
        ArrayList arrayList;
        this.id_final();
        Int2ObjectOpenHashMap int2ObjectOpenHashMap = new Int2ObjectOpenHashMap();
        this.id_class[rrTr_1.id_throws[0]] = int2ObjectOpenHashMap;
        Int2ObjectOpenHashMap int2ObjectOpenHashMap2 = new Int2ObjectOpenHashMap();
        this.id_class[rrTr_1.id_throws[1]] = int2ObjectOpenHashMap2;
        Int2ObjectOpenHashMap int2ObjectOpenHashMap3 = new Int2ObjectOpenHashMap();
        this.id_class[rrTr_1.id_throws[2]] = int2ObjectOpenHashMap3;
        this.id_class[rrTr_1.id_throws[3]] = arrayList = new ArrayList();
        IntOpenHashSet intOpenHashSet = new IntOpenHashSet();
        this.id_class[rrTr_1.id_throws[4]] = intOpenHashSet;
    }

    static {
        rrTr_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x4763275D40CDDC76L;
    }

    private void id_class(List<Integer> list, int n, float f, float f2, float f3, float f4, int n2) {
        int n3 = id_catch[8];
        int n4 = id_catch[9];
        while (n3 < n) {
            int n5 = Math.min(n2 - n4, n - n3);
            float f5 = f2 - (float)n4 * (f4 + id_case[16]);
            this.id_class(list, n3, n5, f, f5, f3);
            n3 += n5;
            ++n4;
        }
    }

    private static boolean id_class(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        return f + f5 + f7 > f3 && f3 + f5 + f7 > f && f2 + f6 + f7 > f4 && f4 + f6 + f7 > f2 ? id_catch[14] : id_catch[15];
    }

    private void id_class(List<Integer> list, int n, int n2, float f, float f2, float f3) {
        float f4 = (float)n2 * f3 + (float)(n2 - id_catch[12]) * id_case[18];
        float f5 = f - f4 * id_case[19];
        for (int i = id_catch[13]; i < n2; ++i) {
            int n3 = list.get(n + i);
            float f6 = f5 + (float)i * (f3 + id_case[20]);
            rrTP rrTP2 = (rrTP)((List)this.id_class[id_throws[38]]).get(n3);
            ((List)this.id_class[id_throws[39]]).set(n3, new rrTP(rrTP2.id_protected(), f6, f2, rrTP2.id_throws(), rrTP2.id_class(), rrTP2.id_case(), rrTP2.id_byte(), rrTP2.id_catch()));
        }
    }

    public boolean id_class(int n) {
        return ((IntOpenHashSet)this.id_class[id_throws[14]]).contains(n);
    }

    private static int id_class(int[] nArray, int n) {
        while (nArray[n] != n) {
            nArray[n] = nArray[nArray[n]];
            n = nArray[n];
        }
        return n;
    }

    public void id_class(rsE_2 rsE_22) {
        ((Int2ObjectMap)this.id_class[id_throws[5]]).put(rsE_22.V(), (Object)rsE_22);
    }

    private List<List<Integer>> id_class(float f, float f2) {
        int n2;
        int n3 = ((List)this.id_class[id_throws[34]]).size();
        int[] nArray = new int[n3];
        for (n2 = id_catch[4]; n2 < n3; ++n2) {
            nArray[n2] = n2;
        }
        for (n2 = id_catch[5]; n2 < n3; ++n2) {
            rrTP rrTP2 = (rrTP)((List)this.id_class[id_throws[35]]).get(n2);
            for (int i = n2 + id_catch[6]; i < n3; ++i) {
                rrTP rrTP3 = (rrTP)((List)this.id_class[id_throws[36]]).get(i);
                if (!rrTr_1.id_class(rrTP2.id_private(), rrTP2.id_break(), rrTP3.id_private(), rrTP3.id_break(), f, f2, id_case[12])) continue;
                rrTr_1.id_class(nArray, n2, i);
            }
        }
        Int2ObjectOpenHashMap int2ObjectOpenHashMap = new Int2ObjectOpenHashMap();
        for (int i = id_catch[7]; i < n3; ++i) {
            ((List)int2ObjectOpenHashMap.computeIfAbsent(rrTr_1.id_class(nArray, i), n -> new ArrayList())).add(i);
        }
        return new ArrayList<List<Integer>>((Collection<List<Integer>>)int2ObjectOpenHashMap.values());
    }

    private void id_class(List<Integer> list, float f, float f2) {
        int n3;
        int n2 = list.size();
        float f3 = id_case[13];
        float f4 = id_case[14];
        for (int n3 : list) {
            rrTP rrTP2 = (rrTP)((List)this.id_class[id_throws[37]]).get(n3);
            f3 += rrTP2.id_private();
            if (!(rrTP2.id_break() > f4)) continue;
            f4 = rrTP2.id_break();
        }
        float f5 = f3 / (float)n2 + f * id_case[15];
        n3 = (int)Math.ceil((id_protected[0] + Math.sqrt(id_protected[1] + id_protected[2] * (double)n2)) / id_protected[3]);
        if (n3 <= id_byte[1]) {
            this.id_class(list, n2, f5, f4, f, f2, n3);
        } else {
            this.id_break(list, n2, f5, f4, f, f2, id_byte[2]);
        }
    }

    public void id_class(Ml_1 ml_1) {
        if (!((List)this.id_class[id_throws[23]]).isEmpty()) {
            ShulkerPreview.id_class(ml_1, (List)this.id_class[id_throws[24]]);
            ((List)this.id_class[id_throws[25]]).clear();
        }
    }

    private IJ[] id_class(int n, List<rdn_3> list) {
        IJ[] iJArray = (IJ[])((Int2ObjectMap)this.id_class[id_throws[31]]).get(n);
        if (iJArray != null && iJArray.length == list.size()) {
            return iJArray;
        }
        Hz_1 hz_1 = QY.id_instanceof().id_float();
        IJ[] iJArray2 = new IJ[list.size()];
        for (int i = id_catch[2]; i < iJArray2.length; ++i) {
            rdn_3 rdn_32 = list.get(i);
            if (rdn_32 == null || rdn_32.id_class()) continue;
            iJArray2[i] = hz_1.id_class(rdn_32, null, null);
        }
        ((Int2ObjectMap)this.id_class[id_throws[32]]).put(n, (Object)iJArray2);
        return iJArray2;
    }

    public void id_class(rjV_2 rjV_22, float f) {
        ((List)this.id_class[id_throws[15]]).clear();
        this.id_break(rjV_22, f);
        this.id_private();
        ((List)this.id_class[id_throws[16]]).sort(Comparator.comparingInt(rrTP::id_case));
        this.id_extends();
    }

    public void id_class() {
        ((IntOpenHashSet)this.id_class[id_throws[12]]).clear();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-27, -110, 29, 53, 101, -56, -84, -6}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class(int[] nArray, int n, int n2) {
        int n3;
        int n4 = rrTr_1.id_class(nArray, n);
        if (n4 != (n3 = rrTr_1.id_class(nArray, n2))) {
            nArray[n4] = n3;
        }
    }

    private void id_break(List<Integer> list, int n, float f, float f2, float f3, float f4, int n2) {
        int n3 = id_catch[10];
        int n4 = id_catch[11];
        while (n3 < n) {
            int n5 = Math.min(n2, n - n3);
            float f5 = f2 - (float)n4 * (f4 + id_case[17]);
            this.id_class(list, n3, n5, f, f5, f3);
            n3 += n5;
            ++n4;
        }
    }

    public void id_break() {
        ((Int2ObjectMap)this.id_class[id_throws[6]]).clear();
    }

    private void id_break(rjV_2 rjV_22, float f) {
        float f2 = id_case[2];
        float f3 = id_case[3];
        for (rsE_2 rsE_22 : ((Int2ObjectMap)this.id_class[id_throws[26]]).values()) {
            rji_3 rji_32;
            rxJ_2 rxJ_22;
            rdn_3 rdn_32 = rsE_22.id_protected();
            rpL_2 rpL_22 = rdn_32.id_break();
            if (!(rpL_22 instanceof rxJ_2) || !((rpL_22 = (rxJ_22 = (rxJ_2)rpL_22).id_catch()) instanceof Wp_1)) continue;
            Wp_1 wp_1 = (Wp_1)rpL_22;
            int n = rsE_22.V();
            List<rdn_3> list = (List<rdn_3>)((Int2ObjectMap)this.id_class[id_throws[27]]).get(n);
            if (list == null) {
                list = rrjm_3.id_class(rdn_32);
                ((Int2ObjectMap)this.id_class[id_throws[28]]).put(n, list);
            }
            if (list.isEmpty() || (rji_32 = rrfa_3.id_class(rjV_22, rsE_22, f)).id_class() == id_case[4] || rji_32.id_byte() == id_case[5]) continue;
            float f4 = (rji_32.id_class() + rji_32.id_byte()) * id_case[6] - f2 * id_case[7];
            float f5 = rji_32.id_break() - f3 - id_case[8];
            ((IntOpenHashSet)this.id_class[id_throws[29]]).add(n);
            float[] fArray = ShulkerPreview.id_class(wp_1.id_break());
            IJ[] iJArray = this.id_class(n, list);
            ((List)this.id_class[id_throws[30]]).add(new rrTP(list, f4, f5, fArray, id_case[9], n, rdn_32.id_continue(), iJArray));
        }
    }

    public boolean id_throws() {
        return !((Int2ObjectMap)this.id_class[id_throws[13]]).isEmpty() ? id_catch[0] : id_catch[1];
    }

    private static /* synthetic */ void ntfClinit() {
        rrTr_1.id_volatile();
        rrTr_1.id_finally();
        rrTr_1.id_catch();
        rrTr_1.id_case();
        rrTr_1.id_native();
        rrTr_1.id_implements();
    }

    private static void id_finally() {
        short[] sArray = new short[42];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[3] = 3;
        sArray[4] = 4;
        sArray[8] = 1;
        sArray[9] = 2;
        sArray[10] = 3;
        sArray[11] = 4;
        sArray[12] = 4;
        sArray[14] = 4;
        sArray[15] = 3;
        sArray[16] = 3;
        sArray[17] = 1;
        sArray[18] = 1;
        sArray[19] = 2;
        sArray[20] = 2;
        sArray[21] = 3;
        sArray[22] = 3;
        sArray[23] = 3;
        sArray[24] = 3;
        sArray[25] = 3;
        sArray[27] = 1;
        sArray[28] = 1;
        sArray[29] = 4;
        sArray[30] = 3;
        sArray[31] = 2;
        sArray[32] = 2;
        sArray[33] = 3;
        sArray[34] = 3;
        sArray[35] = 3;
        sArray[36] = 3;
        sArray[37] = 3;
        sArray[38] = 3;
        sArray[39] = 3;
        id_throws = sArray;
    }

    private static void id_catch() {
        float[] fArray = new float[26];
        fArray[0] = 88.0f;
        fArray[1] = 39.0f;
        fArray[2] = 88.0f;
        fArray[3] = 39.0f;
        fArray[4] = Float.MAX_VALUE;
        fArray[5] = Float.MIN_VALUE;
        fArray[6] = 0.5f;
        fArray[7] = 0.5f;
        fArray[8] = 2.0f;
        fArray[9] = 0.5f;
        fArray[10] = 88.0f;
        fArray[11] = 39.0f;
        fArray[12] = 2.0f;
        fArray[14] = Float.NEGATIVE_INFINITY;
        fArray[15] = 0.5f;
        fArray[16] = 2.0f;
        fArray[17] = 2.0f;
        fArray[18] = 2.0f;
        fArray[19] = 0.5f;
        fArray[20] = 2.0f;
        fArray[23] = 0.5f;
        fArray[24] = 2.0f;
        fArray[25] = 2.0f;
        id_case = fArray;
    }

    private void id_extends() {
        int n = ((List)this.id_class[id_throws[33]]).size();
        if (n < id_byte[0]) {
            return;
        }
        float f = id_case[10];
        float f2 = id_case[11];
        for (List<Integer> list : this.id_class(f, f2)) {
            if (list.size() <= id_catch[3]) continue;
            this.id_class(list, f, f2);
        }
    }

    private static void id_case() {
        id_protected = new double[]{-1.0, 1.0, 8.0, 2.0};
    }

    private static void id_implements() {
        Object[] objectArray = new Object[]{Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), 4};
        id_break = objectArray;
    }

    public void id_protected() {
        ((Int2ObjectMap)this.id_class[id_throws[7]]).clear();
        ((Int2ObjectMap)this.id_class[id_throws[8]]).clear();
        ((Int2ObjectMap)this.id_class[id_throws[9]]).clear();
        ((List)this.id_class[id_throws[10]]).clear();
        ((IntOpenHashSet)this.id_class[id_throws[11]]).clear();
    }

    private void id_private() {
        if (((List)this.id_class[id_throws[21]]).isEmpty()) {
            return;
        }
        float f = id_case[0];
        float f2 = id_case[1];
        float f3 = id_import.id_else().id_volatile();
        float f4 = id_import.id_else().id_final();
        ((List)this.id_class[id_throws[22]]).removeIf(rrTP2 -> rrTP2.id_private() + f < id_case[21] || rrTP2.id_private() > f3 || rrTP2.id_break() + f2 < id_case[22] || rrTP2.id_break() > f4 ? id_catch[16] : id_catch[17]);
    }

    private void id_final() {
        if (this.id_class == null) {
            this.id_class = new Object[5];
        }
    }

    private static void id_volatile() {
        boolean[] blArray = new boolean[24];
        blArray[0] = true;
        blArray[3] = true;
        blArray[6] = true;
        blArray[12] = true;
        blArray[14] = true;
        blArray[16] = true;
        blArray[18] = true;
        blArray[20] = true;
        blArray[23] = true;
        id_catch = blArray;
    }

    private static void id_native() {
        id_byte = new byte[]{2, 4, 4, 5, 4, 2, 3, 4};
    }
}

