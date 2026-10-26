/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.raP_2;
import celestial.rar_3;
import celestial.reU_2;
import celestial.rea_3;
import celestial.ree_3;
import celestial.rei_3;
import celestial.rfH_2;
import celestial.rqd_3;
import celestial.rqj_3;
import celestial.rrPG;
import celestial.rrPN;
import celestial.rrPt_1;
import celestial.rrrn_1;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class reD_2 {
    public static final rrPN id_class = new rrPN().id_class(true).id_class(rrPG.id_break);
    public static final rrPN id_break = new rrPN().id_class(true).id_class(rrPG.id_protected);
    public static final raP_2 id_byte = new reU_2();
    public static final List<rqj_3<rqd_3, rfH_2>> id_protected = Lists.newArrayList((Object[])new rqj_3[]{new rqj_3<rqd_3, rfH_2>(rqd_3.NONE, new rfH_2(1, -1, 0)), new rqj_3<rqd_3, rfH_2>(rqd_3.CLOCKWISE_90, new rfH_2(6, -1, 1)), new rqj_3<rqd_3, rfH_2>(rqd_3.COUNTERCLOCKWISE_90, new rfH_2(0, -1, 5)), new rqj_3<rqd_3, rfH_2>(rqd_3.CLOCKWISE_180, new rfH_2(5, -1, 6))});
    public static final raP_2 id_throws = new ree_3();
    public static final raP_2 id_case = new rea_3();
    public static final List<rqj_3<rqd_3, rfH_2>> id_catch = Lists.newArrayList((Object[])new rqj_3[]{new rqj_3<rqd_3, rfH_2>(rqd_3.NONE, new rfH_2(4, -1, 0)), new rqj_3<rqd_3, rfH_2>(rqd_3.CLOCKWISE_90, new rfH_2(12, -1, 4)), new rqj_3<rqd_3, rfH_2>(rqd_3.COUNTERCLOCKWISE_90, new rfH_2(0, -1, 8)), new rqj_3<rqd_3, rfH_2>(rqd_3.CLOCKWISE_180, new rfH_2(8, -1, 12))});
    public static final raP_2 id_private = new rei_3();

    public static rar_3 id_class(List<rrrn_1> list, rar_3 rar_32) {
        list.add(rar_32);
        return rar_32;
    }

    public static boolean id_class(rrPt_1 rrPt_12, raP_2 raP_22, int n, rar_3 rar_32, rfH_2 rfH_22, List<rrrn_1> list, Random random) {
        if (n > 8) {
            return false;
        }
        ArrayList arrayList = Lists.newArrayList();
        if (raP_22.id_class(rrPt_12, n, rar_32, rfH_22, arrayList, random)) {
            boolean bl = false;
            int n2 = random.nextInt();
            for (rrrn_1 rrrn_12 : arrayList) {
                rrrn_12.id_package = n2;
                rrrn_1 rrrn_13 = rrrn_1.id_class(list, rrrn_12.id_catch());
                if (rrrn_13 == null || rrrn_13.id_package == rar_32.id_package) continue;
                bl = true;
                break;
            }
            if (!bl) {
                list.addAll(arrayList);
                return true;
            }
        }
        return false;
    }

    public static rar_3 id_class(rrPt_1 rrPt_12, rar_3 rar_32, rfH_2 rfH_22, String string, rqd_3 rqd_32, boolean bl) {
        rar_3 rar_33 = new rar_3(rrPt_12, string, rar_32.id_byte, rqd_32, bl);
        rfH_2 rfH_23 = rar_32.id_class.id_class(rar_32.id_break, rfH_22, rar_33.id_break, rfH_2.id_protected);
        rar_33.id_class(rfH_23.b_(), rfH_23.c_(), rfH_23.d_());
        return rar_33;
    }

    public static void id_class(rrPt_1 rrPt_12, rfH_2 rfH_22, rqd_3 rqd_32, List<rrrn_1> list, Random random) {
        id_private.id_class();
        id_byte.id_class();
        id_case.id_class();
        id_throws.id_class();
        rar_3 rar_32 = reD_2.id_class(list, new rar_3(rrPt_12, "base_floor", rfH_22, rqd_32, true));
        rar_32 = reD_2.id_class(list, reD_2.id_class(rrPt_12, rar_32, new rfH_2(-1, 0, -1), "second_floor_1", rqd_32, false));
        rar_32 = reD_2.id_class(list, reD_2.id_class(rrPt_12, rar_32, new rfH_2(-1, 4, -1), "third_floor_1", rqd_32, false));
        rar_32 = reD_2.id_class(list, reD_2.id_class(rrPt_12, rar_32, new rfH_2(-1, 8, -1), "third_roof", rqd_32, true));
        reD_2.id_class(rrPt_12, id_throws, 1, rar_32, null, list, random);
    }
}

