/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.tuple.Pair
 */
package celestial;

import celestial.an_3;
import celestial.iB_2;
import celestial.rYB;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfU_2;
import celestial.rfl_3;
import celestial.rfo_3;
import celestial.rhF_2;
import celestial.rhm_3;
import celestial.rjB_2;
import celestial.rjG_2;
import celestial.rjM_2;
import celestial.rjS_2;
import celestial.rjU_2;
import celestial.rjs_3;
import celestial.rpm_3;
import celestial.rpr_3;
import celestial.rxb_3;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import org.apache.commons.lang3.tuple.Pair;

public final class rhj_3 {
    public static void id_class(an_3 an_32, float f) {
        rjU_2 rjU_22 = an_32.rv();
        if (rjU_22.id_catch() != 0.0) {
            float f2 = rfU_2.id_class(an_3.id_case(rjU_22));
            Float f3 = Float.valueOf((float)(rfU_2.id_protected(rjU_22.id_protected, rjU_22.id_break) * 57.2957763671875) + 90.0f);
            an_32.id_throws[15] = f3;
            Float f4 = Float.valueOf((float)(rfU_2.id_protected((double)f2, rjU_22.id_byte) * 57.2957763671875) - 90.0f);
            an_32.id_throws[16] = f4;
            while (((Float)an_32.id_throws[16]).floatValue() - ((Float)an_32.id_throws[18]).floatValue() < -180.0f) {
                an_3 an_33 = an_32;
                Float f5 = Float.valueOf(((Float)an_33.id_throws[18]).floatValue() - 360.0f);
                an_33.id_throws[18] = f5;
            }
            while (((Float)an_32.id_throws[16]).floatValue() - ((Float)an_32.id_throws[18]).floatValue() >= 180.0f) {
                an_3 an_34 = an_32;
                Float f6 = Float.valueOf(((Float)an_34.id_throws[18]).floatValue() + 360.0f);
                an_34.id_throws[18] = f6;
            }
            while (((Float)an_32.id_throws[15]).floatValue() - ((Float)an_32.id_throws[17]).floatValue() < -180.0f) {
                an_3 an_35 = an_32;
                Float f7 = Float.valueOf(((Float)an_35.id_throws[17]).floatValue() - 360.0f);
                an_35.id_throws[17] = f7;
            }
            while (((Float)an_32.id_throws[15]).floatValue() - ((Float)an_32.id_throws[17]).floatValue() >= 180.0f) {
                an_3 an_36 = an_32;
                Float f8 = Float.valueOf(((Float)an_36.id_throws[17]).floatValue() + 360.0f);
                an_36.id_throws[17] = f8;
            }
            Float f9 = Float.valueOf(rfU_2.id_catch(f, ((Float)an_32.id_throws[18]).floatValue(), ((Float)an_32.id_throws[16]).floatValue()));
            an_32.id_throws[16] = f9;
            Float f10 = Float.valueOf(rfU_2.id_catch(f, ((Float)an_32.id_throws[17]).floatValue(), ((Float)an_32.id_throws[15]).floatValue()));
            an_32.id_throws[15] = f10;
        }
    }

    public static rfo_3 id_class(rYB rYB2, Class<? extends iB_2> clazz, rjU_2 rjU_22, rjU_2 rjU_23, rfl_3 rfl_32, Predicate<an_3> predicate, float f) {
        double d = Double.MAX_VALUE;
        an_3 an_32 = null;
        Pair<rpr_3, rjU_2> pair = Pair.of((Object)rpr_3.UP, (Object)rjU_22);
        for (an_3 an_33 : rYB2.id_class(clazz, rfl_32, predicate)) {
            double d2;
            rfl_3 rfl_33 = an_33.rN().id_class(f);
            Optional<Pair<rpr_3, rjU_2>> optional = rfl_33.id_byte(rjU_22, rjU_23);
            pair = optional.orElse(pair);
            if (!optional.isPresent() || !((d2 = rjU_22.id_implements((rjU_2)optional.get().getRight())) < d)) continue;
            an_32 = an_33;
            d = d2;
        }
        return an_32 == null ? null : new rfo_3(an_32, (rpr_3)pair.getLeft(), (rjU_2)pair.getRight());
    }

    public static rfo_3 id_class(rYB rYB2, an_3 an_32, rjU_2 rjU_22, rjU_2 rjU_23, rfl_3 rfl_32, Predicate<an_3> predicate) {
        double d = Double.MAX_VALUE;
        an_3 an_33 = null;
        for (an_3 an_34 : rYB2.id_break(an_32, rfl_32, predicate)) {
            double d2;
            rfl_3 rfl_33 = an_34.rN().id_class(0.3f);
            Optional<rjU_2> optional = rfl_33.id_break(rjU_22, rjU_23);
            if (!optional.isPresent() || !((d2 = rjU_22.id_implements(optional.get())) < d)) continue;
            an_33 = an_34;
            d = d2;
        }
        return an_33 == null ? null : new rfo_3(an_33);
    }

    public static rpm_3 id_class(iB_2 iB_22, rdb_3 rdb_32) {
        return iB_22.ss().id_break() == rdb_32 ? rpm_3.MAIN_HAND : rpm_3.OFF_HAND;
    }

    public static rhm_3 id_class(iB_2 iB_22, rdn_3 rdn_32, float f) {
        rxb_3 rxb_32 = (rxb_3)(rdn_32.id_break() instanceof rxb_3 ? rdn_32.id_break() : rdy_3.OO);
        rhm_3 rhm_32 = rxb_32.id_class((rYB)iB_22.id_throws[7], rdn_32, iB_22);
        rhm_32.id_class(iB_22, f);
        if (rdn_32.id_break() == rdy_3.kz && rhm_32 instanceof rhF_2) {
            ((rhF_2)rhm_32).id_break(rdn_32);
        }
        return rhm_32;
    }

    public static rjG_2 id_class(an_3 an_32, Predicate<an_3> predicate) {
        return rhj_3.id_class(an_32, predicate, an_32.rN().id_break(an_32.rv()).id_class(1.0));
    }

    public static rjG_2 id_class(an_3 an_32, Predicate<an_3> predicate, rfl_3 rfl_32) {
        rfo_3 rfo_32;
        rjU_2 rjU_22;
        rjU_2 rjU_23 = an_32.rv();
        rYB rYB2 = (rYB)an_32.id_throws[7];
        rjU_2 rjU_24 = an_32.Ps();
        rjG_2 rjG_22 = rYB2.id_class(new rjB_2(rjU_24, rjU_22 = rjU_24.id_throws(rjU_23), rjS_2.COLLIDER, rjs_3.NONE, an_32));
        if (((rjG_2)rjG_22).id_byte() != rjM_2.MISS) {
            rjU_22 = rjG_22.id_case();
        }
        if ((rfo_32 = rhj_3.id_class(rYB2, an_32, rjU_24, rjU_22, rfl_32, predicate)) != null) {
            rjG_22 = rfo_32;
        }
        return rjG_22;
    }

    public static rfo_3 id_class(an_3 an_32, rjU_2 rjU_22, rjU_2 rjU_23, rfl_3 rfl_32, Predicate<an_3> predicate, double d) {
        rYB rYB2 = (rYB)an_32.id_throws[7];
        double d2 = d;
        an_3 an_33 = null;
        rjU_2 rjU_24 = null;
        List<an_3> list = rYB2.id_break(an_32, rfl_32, predicate);
        for (an_3 an_34 : list) {
            ArrayList<rfl_3> arrayList = new ArrayList<rfl_3>();
            arrayList.add(an_34.rN().id_class(an_34.f()));
            for (rfl_3 rfl_33 : arrayList) {
                rjU_2 rjU_25;
                double d3;
                Optional<rjU_2> optional = rfl_33.id_break(rjU_22, rjU_23);
                if (rfl_33.id_case(rjU_22)) {
                    if (!(d2 >= 0.0)) continue;
                    an_33 = an_34;
                    rjU_24 = optional.orElse(rjU_22);
                    d2 = 0.0;
                    continue;
                }
                if (!optional.isPresent() || !((d3 = rjU_22.id_implements(rjU_25 = optional.get())) < d2) && d2 != 0.0) continue;
                if (an_34.PO() == an_32.PO()) {
                    if (d2 != 0.0) continue;
                    an_33 = an_34;
                    rjU_24 = rjU_25;
                    continue;
                }
                an_33 = an_34;
                rjU_24 = rjU_25;
                d2 = d3;
            }
        }
        return an_33 == null ? null : new rfo_3(an_33, rjU_24);
    }

    public static rfo_3 id_class(an_3 an_32, an_3 an_33, rjU_2 rjU_22, rjU_2 rjU_23, double d) {
        rjU_2 rjU_24;
        double d2;
        double d3 = d * d;
        an_3 an_34 = null;
        rjU_2 rjU_25 = null;
        rfl_3 rfl_32 = an_33.rN().id_class(an_33.f());
        Optional<rjU_2> optional = rfl_32.id_break(rjU_22, rjU_23);
        if (rfl_32.id_case(rjU_22)) {
            if (d3 >= 0.0) {
                an_34 = an_33;
                rjU_25 = optional.orElse(rjU_22);
            }
        } else if (optional.isPresent() && ((d2 = rjU_22.id_implements(rjU_24 = optional.get())) < d3 || d3 == 0.0)) {
            if (an_33.PO() == an_32.PO()) {
                if (d3 == 0.0) {
                    an_34 = an_33;
                    rjU_25 = rjU_24;
                }
            } else {
                an_34 = an_33;
                rjU_25 = rjU_24;
            }
        }
        return an_34 == null ? null : new rfo_3(an_34, rjU_25);
    }
}

