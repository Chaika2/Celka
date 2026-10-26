/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfi_3;
import celestial.ril_3;
import celestial.rin_3;
import celestial.rip_3;
import celestial.rpa_3;
import celestial.rqO_2;
import celestial.rqR_2;
import celestial.rqd_3;
import celestial.rrPl_1;
import celestial.rrPt_1;
import celestial.rrrn_1;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class riC_2 {
    private static final rqO_2[] id_class = new rqO_2[]{new rqO_2("underwater_ruin/warm_1"), new rqO_2("underwater_ruin/warm_2"), new rqO_2("underwater_ruin/warm_3"), new rqO_2("underwater_ruin/warm_4"), new rqO_2("underwater_ruin/warm_5"), new rqO_2("underwater_ruin/warm_6"), new rqO_2("underwater_ruin/warm_7"), new rqO_2("underwater_ruin/warm_8")};
    private static final rqO_2[] id_break = new rqO_2[]{new rqO_2("underwater_ruin/brick_1"), new rqO_2("underwater_ruin/brick_2"), new rqO_2("underwater_ruin/brick_3"), new rqO_2("underwater_ruin/brick_4"), new rqO_2("underwater_ruin/brick_5"), new rqO_2("underwater_ruin/brick_6"), new rqO_2("underwater_ruin/brick_7"), new rqO_2("underwater_ruin/brick_8")};
    private static final rqO_2[] id_byte = new rqO_2[]{new rqO_2("underwater_ruin/cracked_1"), new rqO_2("underwater_ruin/cracked_2"), new rqO_2("underwater_ruin/cracked_3"), new rqO_2("underwater_ruin/cracked_4"), new rqO_2("underwater_ruin/cracked_5"), new rqO_2("underwater_ruin/cracked_6"), new rqO_2("underwater_ruin/cracked_7"), new rqO_2("underwater_ruin/cracked_8")};
    private static final rqO_2[] id_protected = new rqO_2[]{new rqO_2("underwater_ruin/mossy_1"), new rqO_2("underwater_ruin/mossy_2"), new rqO_2("underwater_ruin/mossy_3"), new rqO_2("underwater_ruin/mossy_4"), new rqO_2("underwater_ruin/mossy_5"), new rqO_2("underwater_ruin/mossy_6"), new rqO_2("underwater_ruin/mossy_7"), new rqO_2("underwater_ruin/mossy_8")};
    private static final rqO_2[] id_throws = new rqO_2[]{new rqO_2("underwater_ruin/big_brick_1"), new rqO_2("underwater_ruin/big_brick_2"), new rqO_2("underwater_ruin/big_brick_3"), new rqO_2("underwater_ruin/big_brick_8")};
    private static final rqO_2[] id_case = new rqO_2[]{new rqO_2("underwater_ruin/big_mossy_1"), new rqO_2("underwater_ruin/big_mossy_2"), new rqO_2("underwater_ruin/big_mossy_3"), new rqO_2("underwater_ruin/big_mossy_8")};
    private static final rqO_2[] id_catch = new rqO_2[]{new rqO_2("underwater_ruin/big_cracked_1"), new rqO_2("underwater_ruin/big_cracked_2"), new rqO_2("underwater_ruin/big_cracked_3"), new rqO_2("underwater_ruin/big_cracked_8")};
    private static final rqO_2[] id_private = new rqO_2[]{new rqO_2("underwater_ruin/big_warm_4"), new rqO_2("underwater_ruin/big_warm_5"), new rqO_2("underwater_ruin/big_warm_6"), new rqO_2("underwater_ruin/big_warm_7")};

    private static void id_class(rrPt_1 rrPt_12, rfH_2 rfH_22, rqd_3 rqd_32, List<rrrn_1> list, Random random, rin_3 rin_32, boolean bl, float f) {
        if (rin_32.id_break == rip_3.WARM) {
            rqO_2 rqO_22 = bl ? riC_2.id_break(random) : riC_2.id_class(random);
            list.add(new ril_3(rrPt_12, rqO_22, rfH_22, rqd_32, f, rin_32.id_break, bl));
        } else if (rin_32.id_break == rip_3.COLD) {
            rqO_2[] rqO_2Array = bl ? id_throws : id_break;
            rqO_2[] rqO_2Array2 = bl ? id_catch : id_byte;
            rqO_2[] rqO_2Array3 = bl ? id_case : id_protected;
            int n = random.nextInt(rqO_2Array.length);
            list.add(new ril_3(rrPt_12, rqO_2Array[n], rfH_22, rqd_32, f, rin_32.id_break, bl));
            list.add(new ril_3(rrPt_12, rqO_2Array2[n], rfH_22, rqd_32, 0.7f, rin_32.id_break, bl));
            list.add(new ril_3(rrPt_12, rqO_2Array3[n], rfH_22, rqd_32, 0.5f, rin_32.id_break, bl));
        }
    }

    private static void id_class(rrPt_1 rrPt_12, Random random, rqd_3 rqd_32, rfH_2 rfH_22, rin_3 rin_32, List<rrrn_1> list) {
        int n = rfH_22.b_();
        int n2 = rfH_22.d_();
        rfH_2 rfH_23 = rrPl_1.id_class(new rfH_2(15, 0, 15), rpa_3.NONE, rqd_32, rfH_2.id_protected).id_break(n, 0, n2);
        rfi_3 rfi_32 = rfi_3.id_class(n, 0, n2, rfH_23.b_(), 0, rfH_23.d_());
        rfH_2 rfH_24 = new rfH_2(Math.min(n, rfH_23.b_()), 0, Math.min(n2, rfH_23.d_()));
        List<rfH_2> list2 = riC_2.id_class(random, rfH_24.b_(), rfH_24.d_());
        int n3 = rfU_2.id_class(random, 4, 8);
        for (int i = 0; i < n3; ++i) {
            rqd_3 rqd_33;
            rfH_2 rfH_25;
            int n4;
            int n5;
            rfH_2 rfH_26;
            int n6;
            rfi_3 rfi_33;
            if (list2.isEmpty() || (rfi_33 = rfi_3.id_class(n6 = (rfH_26 = list2.remove(n5 = random.nextInt(list2.size()))).b_(), 0, n4 = rfH_26.d_(), (rfH_25 = rrPl_1.id_class(new rfH_2(5, 0, 6), rpa_3.NONE, rqd_33 = rqd_3.id_class(random), rfH_2.id_protected).id_break(n6, 0, n4)).b_(), 0, rfH_25.d_())).id_class(rfi_32)) continue;
            riC_2.id_class(rrPt_12, rfH_26, rqd_33, list, random, rin_32, false, 0.8f);
        }
    }

    private static rqO_2 id_class(Random random) {
        return rqR_2.id_class(id_class, random);
    }

    public static void id_class(rrPt_1 rrPt_12, rfH_2 rfH_22, rqd_3 rqd_32, List<rrrn_1> list, Random random, rin_3 rin_32) {
        boolean bl = random.nextFloat() <= rin_32.id_byte;
        float f = bl ? 0.9f : 0.8f;
        riC_2.id_class(rrPt_12, rfH_22, rqd_32, list, random, rin_32, bl, f);
        if (bl && random.nextFloat() <= rin_32.id_protected) {
            riC_2.id_class(rrPt_12, random, rqd_32, rfH_22, rin_32, list);
        }
    }

    private static List<rfH_2> id_class(Random random, int n, int n2) {
        ArrayList arrayList = Lists.newArrayList();
        arrayList.add(new rfH_2(n - 16 + rfU_2.id_class(random, 1, 8), 90, n2 + 16 + rfU_2.id_class(random, 1, 7)));
        arrayList.add(new rfH_2(n - 16 + rfU_2.id_class(random, 1, 8), 90, n2 + rfU_2.id_class(random, 1, 7)));
        arrayList.add(new rfH_2(n - 16 + rfU_2.id_class(random, 1, 8), 90, n2 - 16 + rfU_2.id_class(random, 4, 8)));
        arrayList.add(new rfH_2(n + rfU_2.id_class(random, 1, 7), 90, n2 + 16 + rfU_2.id_class(random, 1, 7)));
        arrayList.add(new rfH_2(n + rfU_2.id_class(random, 1, 7), 90, n2 - 16 + rfU_2.id_class(random, 4, 6)));
        arrayList.add(new rfH_2(n + 16 + rfU_2.id_class(random, 1, 7), 90, n2 + 16 + rfU_2.id_class(random, 3, 8)));
        arrayList.add(new rfH_2(n + 16 + rfU_2.id_class(random, 1, 7), 90, n2 + rfU_2.id_class(random, 1, 7)));
        arrayList.add(new rfH_2(n + 16 + rfU_2.id_class(random, 1, 7), 90, n2 - 16 + rfU_2.id_class(random, 4, 8)));
        return arrayList;
    }

    private static rqO_2 id_break(Random random) {
        return rqR_2.id_class(id_private, random);
    }
}

