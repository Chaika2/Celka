/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.tuple.Pair
 */
package celestial;

import celestial.PJ;
import celestial.PX;
import celestial.an_3;
import celestial.cb_3;
import celestial.rfU_2;
import celestial.rfl_3;
import celestial.rhj_3;
import celestial.rjU_2;
import celestial.rrTA;
import celestial.rrTH;
import celestial.rrTR;
import celestial.rrTT;
import celestial.rrTV;
import celestial.rrTf_1;
import celestial.rrTj_1;
import celestial.rrTn_1;
import celestial.rrTp_1;
import celestial.rrTq_1;
import celestial.util.MinecraftAccessor;
import celestial.xc_3;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.tuple.Pair;

public interface rrnF_2
extends MinecraftAccessor {
    default public boolean id_class(xc_3 xc_32) {
        return false;
    }

    default public Pair<rrTA, rrTA> id_class(an_3 an_32, PX pX) {
        ((List)rrTT.id_break[1]).clear();
        List<rrTA> list = this.id_class(an_32, an_32.rN());
        ((List)rrTT.id_break[1]).addAll(list);
        rrTA rrTA2 = new rrTn_1(an_32.id_new(1.0f));
        PX pX2 = pX.id_byte();
        double d = Double.MAX_VALUE;
        for (rrTA rrTA3 : list) {
            PX pX3 = PJ.id_class(rrTA3);
            double d2 = 0.0;
            d2 += PJ.id_class(pX.id_protected(), pX3.id_protected());
            if (!((d2 += PJ.id_break(pX.id_throws(), pX3.id_throws())) < d)) continue;
            d = d2;
            rrTA2 = rrTA3;
        }
        return Pair.of((Object)rrTA2, (Object)rrTA2);
    }

    default public float id_class(rjU_2 rjU_22, rjU_2 rjU_23) {
        double d = rjU_23.id_break - rjU_22.id_break;
        double d2 = rjU_23.id_protected - rjU_22.id_protected;
        return (float)(Math.atan2(d2, d) * 180.0 / Math.PI - 90.0);
    }

    default public Pair<rrTA, rrTA> id_class(rrTV rrTV2, PX pX) {
        ((List)rrTT.id_break[1]).clear();
        rfl_3 rfl_32 = rrTV2.id_class();
        List<rrTA> list = this.id_class(rrTV2, rfl_32);
        rrTA rrTA2 = new rrTn_1(rfl_32.id_case());
        ((List)rrTT.id_break[1]).addAll(list);
        double d = Double.MAX_VALUE;
        for (rrTA rrTA3 : list) {
            double d2 = 0.0;
            if (!(d2 < d)) continue;
            d = d2;
            rrTA2 = rrTA3;
        }
        return Pair.of((Object)rrTA2, (Object)rrTA2);
    }

    default public boolean id_class(PX pX) {
        return true;
    }

    default public List<rrTA> id_class(an_3 an_32, rfl_3 rfl_32) {
        Object object;
        rrTR rrTR2;
        ArrayList<rrTA> arrayList = new ArrayList<rrTA>();
        rjU_2 rjU_22 = ((cb_3)rrnF_2.id_import.id_class[57]).id_new(1.0f);
        float f = 0.08f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        double d = rfl_32.id_class + (double)f;
        double d2 = rfl_32.id_protected - (double)f;
        double d3 = rfl_32.id_byte + (double)f;
        double d4 = rfl_32.id_case - (double)f;
        double d5 = d2 - d;
        double d6 = d5 / 2.0;
        double d7 = (rfl_32.id_throws - rfl_32.id_break) / 12.0;
        for (double d8 = rfl_32.id_break; d8 < rfl_32.id_throws; d8 += d7) {
            if (d8 < an_32.re() + (double)f3 || d8 > rfl_32.id_throws - (double)f2) continue;
            for (double d9 = 0.0; d9 < d5; d9 += d6) {
                rrTA rrTA3 = new rrTn_1(new rjU_2(d, d8, d3 + d9));
                arrayList.add(rrTA3);
                rrTR2 = new rrTn_1(new rjU_2(d2, d8, d3 + d9));
                arrayList.add((rrTA)rrTR2);
                object = new rrTn_1(new rjU_2(d + d9, d8, d3));
                arrayList.add((rrTA)object);
                rrTn_1 rrTn_12 = new rrTn_1(new rjU_2(d + d9, d8, d4));
                arrayList.add(rrTn_12);
            }
            rrTn_1 rrTn_13 = new rrTn_1(new rjU_2(d2, d8, d4));
            arrayList.add(rrTn_13);
        }
        ArrayList<rrTA> arrayList2 = new ArrayList<rrTA>();
        boolean bl = this.aC_();
        boolean bl2 = !bl || arrayList.stream().anyMatch(rrTA2 -> rrTA2.id_class(rjU_22, an_32, (xc_3 xc_32) -> !this.id_class((xc_3)xc_32)));
        for (rrTA rrTA3 : arrayList) {
            rrTR2 = rrTA3.rr();
            if (bl && bl2 && !rrTA3.id_class(rjU_22, an_32, (xc_3 xc_32) -> !this.id_class((xc_3)xc_32)) || (object = rhj_3.id_class((cb_3)rrnF_2.id_import.id_class[57], an_32, rjU_22, rrTR2, 3.0)) == null) continue;
            arrayList2.add(rrTA3);
        }
        if (arrayList2.isEmpty()) {
            return arrayList;
        }
        return arrayList2;
    }

    default public List<rrTA> id_class(rrTV rrTV2, rfl_3 rfl_32) {
        ArrayList<rrTA> arrayList = new ArrayList<rrTA>();
        rjU_2 rjU_22 = ((cb_3)rrnF_2.id_import.id_class[57]).id_new(1.0f);
        float f = 0.08f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        double d = rfl_32.id_class + (double)f;
        double d2 = rfl_32.id_protected - (double)f;
        double d3 = rfl_32.id_byte + (double)f;
        double d4 = rfl_32.id_case - (double)f;
        double d5 = d2 - d;
        double d6 = d5 / 2.0;
        double d7 = (rfl_32.id_throws - rfl_32.id_break) / 12.0;
        for (double d8 = rfl_32.id_break; d8 < rfl_32.id_throws; d8 += d7) {
            if (d8 < rfl_32.id_break + (double)f3 || d8 > rfl_32.id_throws - (double)f2) continue;
            for (double d9 = 0.0; d9 < d5; d9 += d6) {
                rrTA rrTA3 = new rrTn_1(new rjU_2(d, d8, d3 + d9));
                arrayList.add(rrTA3);
                rrTn_1 rrTn_12 = new rrTn_1(new rjU_2(d2, d8, d3 + d9));
                arrayList.add(rrTn_12);
                rrTn_1 rrTn_13 = new rrTn_1(new rjU_2(d + d9, d8, d3));
                arrayList.add(rrTn_13);
                rrTn_1 rrTn_14 = new rrTn_1(new rjU_2(d + d9, d8, d4));
                arrayList.add(rrTn_14);
            }
            rrTn_1 rrTn_15 = new rrTn_1(new rjU_2(d2, d8, d4));
            arrayList.add(rrTn_15);
        }
        ArrayList<rrTA> arrayList2 = new ArrayList<rrTA>();
        boolean bl = this.aC_();
        boolean bl2 = !bl || arrayList.stream().anyMatch(rrTA2 -> rrTA2.id_class(rjU_22, rrTV2, (xc_3 xc_32) -> !this.id_class((xc_3)xc_32)));
        for (rrTA rrTA3 : arrayList) {
            if (bl && bl2 && !rrTA3.id_class(rjU_22, rrTV2, (xc_3 xc_32) -> !this.id_class((xc_3)xc_32))) continue;
            arrayList2.add(rrTA3);
        }
        if (arrayList2.isEmpty()) {
            return arrayList;
        }
        return arrayList2;
    }

    default public boolean id_break(PX pX) {
        return true;
    }

    public float id_break();

    default public float id_break(rjU_2 rjU_22, rjU_2 rjU_23) {
        double d = rjU_23.id_break - rjU_22.id_break;
        double d2 = rjU_23.id_byte - rjU_22.id_byte;
        double d3 = rjU_23.id_protected - rjU_22.id_protected;
        return (float)(-Math.atan2(d2, Math.sqrt(d * d + d3 * d3)) * 180.0 / Math.PI);
    }

    public rrTp_1 id_catch();

    public float id_private();

    default public boolean az_() {
        return false;
    }

    default public rrTH aE_() {
        return this.aA_();
    }

    default public rrTf_1 aL_() {
        return null;
    }

    default public boolean aC_() {
        return true;
    }

    default public boolean aG_() {
        return false;
    }

    default public float aD_() {
        return 1.0f;
    }

    default public rrTq_1 aB_() {
        return null;
    }

    default public rrTj_1 aF_() {
        return null;
    }

    default public rrTH aA_() {
        return (f, f2, f3) -> {
            float f4 = rfU_2.id_catch(f2 - f);
            if (f4 > f3) {
                return f + f3;
            }
            if (f4 < -f3) {
                return f - f3;
            }
            return f2;
        };
    }
}

