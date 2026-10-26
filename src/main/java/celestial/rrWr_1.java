/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.QY;
import celestial.gm_3;
import celestial.rRR;
import celestial.rRp_1;
import celestial.rVL;
import celestial.rVy_1;
import celestial.rYB;
import celestial.rYG;
import celestial.rYL;
import celestial.rYl_1;
import celestial.rfH_2;
import celestial.rqM_2;
import celestial.rqO_2;
import celestial.rrJI;
import celestial.rrMk_1;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

public class rrWr_1 {
    private static rVL<rYG> id_protected = rrWr_1.id_break((gm_3)QY.id_instanceof().id_class[56]);
    public static rYG id_class = rrWr_1.id_class(id_protected, rYl_1.id_break, () -> rYL.id_class(false));
    public static rYG id_break = rrWr_1.id_class(id_protected, rYl_1.id_catch, () -> rYL.id_protected(-0.2f, 0.1f, false));
    public static rYG id_byte = rrWr_1.id_class(id_protected, rYl_1.X, () -> rYL.id_protected(-0.1f, 0.3f, true));

    public static List<rYG> id_byte() {
        return Lists.newArrayList(id_protected);
    }

    public static rYG id_byte(rqO_2 rqO_22) {
        return rrWr_1.id_class().id_class(rqO_22);
    }

    public static int id_class(rqO_2 rqO_22) {
        rYG rYG2 = rrWr_1.id_byte(rqO_22);
        return rrWr_1.id_class().id_class(rYG2);
    }

    public static List<rrMk_1> id_class(Collection<rqO_2> collection) {
        ArrayList<rrMk_1> arrayList = new ArrayList<rrMk_1>();
        for (rqO_2 rqO_22 : collection) {
            rrMk_1 rrMk_12 = rrMk_1.id_class(rqO_22);
            if (rrMk_12 == null) continue;
            arrayList.add(rrMk_12);
        }
        return arrayList;
    }

    private static rYG id_class(rVL<rYG> rVL2, rqM_2<rYG> rqM_22, Supplier<rYG> supplier) {
        rYG rYG2 = rVL2.id_class(rqM_22);
        if (rYG2 == null) {
            rYG2 = supplier.get();
        }
        return rYG2;
    }

    public static void id_class(rYB rYB2) {
        id_protected = rrWr_1.id_break(rYB2);
        id_class = rrWr_1.id_class(id_protected, rYl_1.id_break, () -> rYL.id_class(false));
        id_break = rrWr_1.id_class(id_protected, rYl_1.id_catch, () -> rYL.id_protected(-0.2f, 0.1f, false));
        id_byte = rrWr_1.id_class(id_protected, rYl_1.X, () -> rYL.id_protected(-0.1f, 0.3f, true));
    }

    public static rVL<rYG> id_class() {
        return id_protected;
    }

    public static rqO_2 id_class(rYG rYG2) {
        return rrWr_1.id_class().id_break(rYG2);
    }

    public static rYG id_class(rRp_1 rRp_12, rfH_2 rfH_22) {
        rYG rYG2 = id_class;
        if (rRp_12 instanceof rrJI) {
            rYG2 = ((rrJI)rRp_12).id_throws(rfH_22);
        } else if (rRp_12 instanceof rRR) {
            rYG2 = ((rRR)rRp_12).id_implements(rfH_22);
        }
        return rYG2;
    }

    public static rVL<rYG> id_break(rYB rYB2) {
        return rYB2 != null ? rYB2.id_new().id_break(rVL.n) : rVy_1.id_implements;
    }

    public static int id_break(rYG rYG2) {
        return rrWr_1.id_class().id_class(rYG2);
    }

    public static rrMk_1 id_break(rqO_2 rqO_22) {
        return rrMk_1.id_class(rqO_22);
    }

    public static Set<rqO_2> id_break() {
        return rrWr_1.id_class().id_protected();
    }

    public static List<rrMk_1> id_protected() {
        return rrWr_1.id_class(rrWr_1.id_break());
    }
}

