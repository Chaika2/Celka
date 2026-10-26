/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 */
package celestial;

import celestial.rfH_2;
import celestial.rfw_3;
import celestial.rpB_2;
import celestial.rpG_2;
import celestial.rpr_3;
import celestial.rqT_2;
import celestial.rqq_3;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import java.util.function.Predicate;

public class rqp_3 {
    public static Pair<rqq_3, Integer> id_class(int[] nArray) {
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        IntArrayList intArrayList = new IntArrayList();
        intArrayList.push(0);
        for (int i = 1; i <= nArray.length; ++i) {
            int n4;
            int n5 = n4 = i == nArray.length ? 0 : nArray[i];
            while (!intArrayList.isEmpty()) {
                int n6 = nArray[intArrayList.topInt()];
                if (n4 >= n6) {
                    intArrayList.push(i);
                    break;
                }
                intArrayList.popInt();
                int n7 = intArrayList.isEmpty() ? 0 : intArrayList.topInt() + 1;
                if (n6 * (i - n7) <= n3 * (n2 - n)) continue;
                n2 = i;
                n = n7;
                n3 = n6;
            }
            if (!intArrayList.isEmpty()) continue;
            intArrayList.push(i);
        }
        return new Pair((Object)new rqq_3(n, n2 - 1), (Object)n3);
    }

    private static int id_class(Predicate<rfH_2> predicate, rfw_3 rfw_32, rpr_3 rpr_32, int n) {
        int n2;
        for (n2 = 0; n2 < n && predicate.test(rfw_32.id_class(rpr_32)); ++n2) {
        }
        return n2;
    }

    public static rqT_2 id_class(rfH_2 rfH_22, rpB_2 rpB_22, int n, rpB_2 rpB_23, int n2, Predicate<rfH_2> predicate) {
        rqq_3 rqq_32;
        int n3;
        rfw_3 rfw_32 = rfH_22.id_new();
        rpr_3 rpr_32 = rpr_3.id_class(rpG_2.NEGATIVE, rpB_22);
        rpr_3 rpr_33 = rpr_32.id_case();
        rpr_3 rpr_34 = rpr_3.id_class(rpG_2.NEGATIVE, rpB_23);
        rpr_3 rpr_35 = rpr_34.id_case();
        int n4 = rqp_3.id_class(predicate, rfw_32.id_class(rfH_22), rpr_32, n);
        int n5 = rqp_3.id_class(predicate, rfw_32.id_class(rfH_22), rpr_33, n);
        int n6 = n4;
        rqq_3[] rqq_3Array = new rqq_3[n4 + 1 + n5];
        rqq_3Array[n4] = new rqq_3(rqp_3.id_class(predicate, rfw_32.id_class(rfH_22), rpr_34, n2), rqp_3.id_class(predicate, rfw_32.id_class(rfH_22), rpr_35, n2));
        int n7 = rqq_3Array[n4].id_class;
        for (n3 = 1; n3 <= n4; ++n3) {
            rqq_32 = rqq_3Array[n6 - (n3 - 1)];
            rqq_3Array[n6 - n3] = new rqq_3(rqp_3.id_class(predicate, rfw_32.id_class(rfH_22).id_byte(rpr_32, n3), rpr_34, rqq_32.id_class), rqp_3.id_class(predicate, rfw_32.id_class(rfH_22).id_byte(rpr_32, n3), rpr_35, rqq_32.id_break));
        }
        for (n3 = 1; n3 <= n5; ++n3) {
            rqq_32 = rqq_3Array[n6 + n3 - 1];
            rqq_3Array[n6 + n3] = new rqq_3(rqp_3.id_class(predicate, rfw_32.id_class(rfH_22).id_byte(rpr_33, n3), rpr_34, rqq_32.id_class), rqp_3.id_class(predicate, rfw_32.id_class(rfH_22).id_byte(rpr_33, n3), rpr_35, rqq_32.id_break));
        }
        n3 = 0;
        int n8 = 0;
        int n9 = 0;
        int n10 = 0;
        int[] nArray = new int[rqq_3Array.length];
        for (int i = n7; i >= 0; --i) {
            int n11;
            int n12;
            rqq_3 rqq_33;
            for (int j = 0; j < rqq_3Array.length; ++j) {
                rqq_33 = rqq_3Array[j];
                n12 = n7 - rqq_33.id_class;
                n11 = n7 + rqq_33.id_break;
                nArray[j] = i >= n12 && i <= n11 ? n11 + 1 - i : 0;
            }
            Pair<rqq_3, Integer> pair = rqp_3.id_class(nArray);
            rqq_33 = (rqq_3)pair.getFirst();
            n12 = 1 + rqq_33.id_break - rqq_33.id_class;
            n11 = (Integer)pair.getSecond();
            if (n12 * n11 <= n9 * n10) continue;
            n3 = rqq_33.id_class;
            n8 = i;
            n9 = n12;
            n10 = n11;
        }
        return new rqT_2(rfH_22.id_class(rpB_22, n3 - n6).id_class(rpB_23, n8 - n7), n9, n10);
    }
}

