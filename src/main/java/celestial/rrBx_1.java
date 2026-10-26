/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2IntMap
 *  it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap
 */
package celestial;

import celestial.rKA;
import celestial.rKV;
import celestial.rKg_1;
import celestial.rKj_1;
import celestial.rKp_1;
import celestial.rqR_2;
import celestial.rrBB;
import celestial.rrBE;
import celestial.rrBJ;
import celestial.rrBM;
import celestial.rrBN;
import celestial.rrBO;
import celestial.rrBP;
import celestial.rrBQ;
import celestial.rrBS;
import celestial.rrBW;
import celestial.rrBX;
import celestial.rrBZ;
import celestial.rrBb_1;
import celestial.rrBc_1;
import celestial.rrBd_1;
import celestial.rrBh_1;
import celestial.rrBk_1;
import celestial.rrBm_1;
import celestial.rrBn_1;
import celestial.rrBr_1;
import celestial.rrBs_1;
import celestial.rrBu_1;
import celestial.rrBv_1;
import celestial.rrBz_1;
import celestial.rrPi_1;
import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import java.util.function.LongFunction;

public class rrBx_1 {
    private static final Int2IntMap id_class = (Int2IntMap)rqR_2.id_class(new Int2IntOpenHashMap(), int2IntOpenHashMap -> {
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.BEACH, 16);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.BEACH, 26);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.DESERT, 2);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.DESERT, 17);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.DESERT, 130);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.EXTREME_HILLS, 131);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.EXTREME_HILLS, 162);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.EXTREME_HILLS, 20);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.EXTREME_HILLS, 3);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.EXTREME_HILLS, 34);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.FOREST, 27);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.FOREST, 28);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.FOREST, 29);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.FOREST, 157);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.FOREST, 132);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.FOREST, 4);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.FOREST, 155);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.FOREST, 156);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.FOREST, 18);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.ICY, 140);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.ICY, 13);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.ICY, 12);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.JUNGLE, 168);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.JUNGLE, 169);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.JUNGLE, 21);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.JUNGLE, 23);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.JUNGLE, 22);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.JUNGLE, 149);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.JUNGLE, 151);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.MESA, 37);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.MESA, 165);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.MESA, 167);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.MESA, 166);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.BADLANDS_PLATEAU, 39);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.BADLANDS_PLATEAU, 38);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.MUSHROOM, 14);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.MUSHROOM, 15);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.NONE, 25);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.OCEAN, 46);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.OCEAN, 49);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.OCEAN, 50);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.OCEAN, 48);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.OCEAN, 24);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.OCEAN, 47);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.OCEAN, 10);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.OCEAN, 45);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.OCEAN, 0);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.OCEAN, 44);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.PLAINS, 1);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.PLAINS, 129);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.RIVER, 11);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.RIVER, 7);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.SAVANNA, 35);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.SAVANNA, 36);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.SAVANNA, 163);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.SAVANNA, 164);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.SWAMP, 6);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.SWAMP, 134);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.TAIGA, 160);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.TAIGA, 161);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.TAIGA, 32);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.TAIGA, 33);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.TAIGA, 30);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.TAIGA, 31);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.TAIGA, 158);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.TAIGA, 5);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.TAIGA, 19);
        rrBx_1.id_class(int2IntOpenHashMap, rrBd_1.TAIGA, 133);
    });

    protected static boolean id_class(int n) {
        return n == 44 || n == 45 || n == 0 || n == 46 || n == 10 || n == 47 || n == 48 || n == 24 || n == 49 || n == 50;
    }

    private static void id_class(Int2IntOpenHashMap int2IntOpenHashMap, rrBd_1 rrBd_12, int n) {
        int2IntOpenHashMap.put(n, rrBd_12.ordinal());
    }

    private static <T extends rKj_1, C extends rKA<T>> rKV<T> id_class(boolean bl, int n, int n2, LongFunction<C> longFunction) {
        rKV rKV2 = rrBX.INSTANCE.id_class((rKA)longFunction.apply(1L));
        rKV2 = rrBv_1.FUZZY.id_class((rKA)longFunction.apply(2000L), rKV2);
        rKV2 = rrBr_1.INSTANCE.id_class((rKA)longFunction.apply(1L), rKV2);
        rKV2 = rrBv_1.NORMAL.id_class((rKA)longFunction.apply(2001L), rKV2);
        rKV2 = rrBr_1.INSTANCE.id_class((rKA)longFunction.apply(2L), rKV2);
        rKV2 = rrBr_1.INSTANCE.id_class((rKA)longFunction.apply(50L), rKV2);
        rKV2 = rrBr_1.INSTANCE.id_class((rKA)longFunction.apply(70L), rKV2);
        rKV2 = rrBN.INSTANCE.id_class((rKA)longFunction.apply(2L), rKV2);
        rKV rKV3 = rrBz_1.INSTANCE.id_class((rKA)longFunction.apply(2L));
        rKV3 = rrBx_1.id_class(2001L, rrBv_1.NORMAL, rKV3, 6, longFunction);
        rKV2 = rrBB.INSTANCE.id_class((rKA)longFunction.apply(2L), rKV2);
        rKV2 = rrBr_1.INSTANCE.id_class((rKA)longFunction.apply(3L), rKV2);
        rKV2 = rrBb_1.INSTANCE.id_class((rKA)longFunction.apply(2L), rKV2);
        rKV2 = rrBM.INSTANCE.id_class((rKA)longFunction.apply(2L), rKV2);
        rKV2 = rrBO.INSTANCE.id_class((rKA)longFunction.apply(3L), rKV2);
        rKV2 = rrBv_1.NORMAL.id_class((rKA)longFunction.apply(2002L), rKV2);
        rKV2 = rrBv_1.NORMAL.id_class((rKA)longFunction.apply(2003L), rKV2);
        rKV2 = rrBr_1.INSTANCE.id_class((rKA)longFunction.apply(4L), rKV2);
        rKV2 = rrBP.INSTANCE.id_class((rKA)longFunction.apply(5L), rKV2);
        rKV2 = rrBs_1.INSTANCE.id_class((rKA)longFunction.apply(4L), rKV2);
        rKV2 = rrBx_1.id_class(1000L, rrBv_1.NORMAL, rKV2, 0, longFunction);
        rKV rKV4 = rrBx_1.id_class(1000L, rrBv_1.NORMAL, rKV2, 0, longFunction);
        rKV4 = rrBZ.INSTANCE.id_class((rKA)longFunction.apply(100L), rKV4);
        rKV rKV5 = new rrBS(bl).id_class((rKA)longFunction.apply(200L), rKV2);
        rKV5 = rrPi_1.INSTANCE.id_class((rKA)longFunction.apply(1001L), rKV5);
        rKV5 = rrBx_1.id_class(1000L, rrBv_1.NORMAL, rKV5, 2, longFunction);
        rKV5 = rrBE.INSTANCE.id_class((rKA)longFunction.apply(1000L), rKV5);
        rKV rKV6 = rrBx_1.id_class(1000L, rrBv_1.NORMAL, rKV4, 2, longFunction);
        rKV5 = rrBh_1.INSTANCE.id_class((rKA)longFunction.apply(1000L), rKV5, rKV6);
        rKV4 = rrBx_1.id_class(1000L, rrBv_1.NORMAL, rKV4, 2, longFunction);
        rKV4 = rrBx_1.id_class(1000L, rrBv_1.NORMAL, rKV4, n2, longFunction);
        rKV4 = rrBc_1.INSTANCE.id_class((rKA)longFunction.apply(1L), rKV4);
        rKV4 = rrBm_1.INSTANCE.id_class((rKA)longFunction.apply(1000L), rKV4);
        rKV5 = rrBQ.INSTANCE.id_class((rKA)longFunction.apply(1001L), rKV5);
        for (int i = 0; i < n; ++i) {
            rKV5 = rrBv_1.NORMAL.id_class((rKA)longFunction.apply(1000 + i), rKV5);
            if (i == 0) {
                rKV5 = rrBr_1.INSTANCE.id_class((rKA)longFunction.apply(3L), rKV5);
            }
            if (i != 1 && n != 1) continue;
            rKV5 = rrBu_1.INSTANCE.id_class((rKA)longFunction.apply(1000L), rKV5);
        }
        rKV5 = rrBm_1.INSTANCE.id_class((rKA)longFunction.apply(1000L), rKV5);
        rKV5 = rrBW.INSTANCE.id_class((rKA)longFunction.apply(100L), rKV5, rKV4);
        return rrBk_1.INSTANCE.id_class((rKA)longFunction.apply(100L), rKV5, rKV3);
    }

    public static rrBJ id_class(long l, boolean bl, int n, int n2) {
        int n3 = 25;
        rKV<rKg_1> rKV2 = rrBx_1.id_class(bl, n, n2, l2 -> new rKp_1(25, l, l2));
        return new rrBJ(rKV2);
    }

    public static boolean id_class(int n, int n2) {
        if (n == n2) {
            return true;
        }
        return id_class.get(n) == id_class.get(n2);
    }

    private static <T extends rKj_1, C extends rKA<T>> rKV<T> id_class(long l, rrBn_1 rrBn_12, rKV<T> rKV2, int n, LongFunction<C> longFunction) {
        rKV<T> rKV3 = rKV2;
        for (int i = 0; i < n; ++i) {
            rKV3 = rrBn_12.id_class((rKA)longFunction.apply(l + (long)i), rKV3);
        }
        return rKV3;
    }

    protected static boolean id_break(int n) {
        return n == 44 || n == 45 || n == 0 || n == 46 || n == 10;
    }
}

