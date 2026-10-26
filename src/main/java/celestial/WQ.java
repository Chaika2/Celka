/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.Jq_1;
import celestial.WN;
import celestial.rCL;
import celestial.rCN;
import celestial.rCT;
import celestial.rCZ;
import celestial.rLc_1;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rpr_3;
import celestial.rrEm_1;
import celestial.xc_3;
import celestial.xd_3;
import celestial.zZ_2;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.WeakHashMap;

public class WQ
extends zZ_2 {
    public static final rCN id_volatile = rCT.id_continue;
    private static final Map<rRq_1, List<WN>> id_final = new WeakHashMap<rRq_1, List<WN>>();

    @Override
    public boolean id_byte(xc_3 xc_32) {
        return true;
    }

    protected WQ(Jq_1 jq_1) {
        super(jq_1, rLc_1.id_class);
        this.id_extends((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_volatile, true));
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xc_3 xc_33, boolean bl) {
        for (rpr_3 rpr_32 : rpr_3.values()) {
            rYB2.id_break(rfH_22.id_break(rpr_32), this);
        }
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, Random random) {
        if (xc_32.id_byte(id_volatile).booleanValue()) {
            double d = (double)rfH_22.b_() + 0.5 + (random.nextDouble() - 0.5) * 0.2;
            double d2 = (double)rfH_22.c_() + 0.7 + (random.nextDouble() - 0.5) * 0.2;
            double d3 = (double)rfH_22.d_() + 0.5 + (random.nextDouble() - 0.5) * 0.2;
            rYB2.id_class(this.id_new, d, d2, d3, 0.0, 0.0, 0.0);
        }
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(new rCZ[]{id_volatile});
    }

    private static boolean id_class(rYB rYB2, rfH_2 rfH_22, boolean bl) {
        List list = id_final.computeIfAbsent(rYB2, rRq_12 -> Lists.newArrayList());
        if (bl) {
            list.add(new WN(rfH_22.id_int(), rYB2.r()));
        }
        int n = 0;
        for (int i = 0; i < list.size(); ++i) {
            WN wN = (WN)list.get(i);
            if (!wN.id_class.equals(rfH_22) || ++n < 8) continue;
            return true;
        }
        return false;
    }

    @Override
    public int id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rpr_3 rpr_32) {
        return xc_32.id_byte(id_volatile) != false && rpr_3.UP != rpr_32 ? 15 : 0;
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xd_3 xd_32, rfH_2 rfH_23, boolean bl) {
        if (xc_32.id_byte(id_volatile).booleanValue() == this.id_class(rYB2, rfH_22, xc_32) && !rYB2.id_finally().id_break(rfH_22, this)) {
            rYB2.id_finally().id_class(rfH_22, this, 2);
        }
    }

    protected boolean id_class(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32) {
        return rYB2.id_break(rfH_22.id_break(), rpr_3.DOWN);
    }

    @Override
    public int id_break(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rpr_3 rpr_32) {
        return rpr_32 == rpr_3.DOWN ? xc_32.id_break(rRq_12, rfH_22, rpr_32) : 0;
    }

    @Override
    public void id_break(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xc_3 xc_33, boolean bl) {
        if (!bl) {
            for (rpr_3 rpr_32 : rpr_3.values()) {
                rYB2.id_break(rfH_22.id_break(rpr_32), this);
            }
        }
    }

    @Override
    public void id_break(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 rfH_22, Random random) {
        boolean bl = this.id_class((rYB)rrEm_12, rfH_22, xc_32);
        List<WN> list = id_final.get(rrEm_12);
        while (list != null && !list.isEmpty() && rrEm_12.r() - list.get((int)0).id_break > 60L) {
            list.remove(0);
        }
        if (xc_32.id_byte(id_volatile).booleanValue()) {
            if (bl) {
                rrEm_12.id_class(rfH_22, (xc_3)xc_32.id_class(id_volatile, false), 3);
                if (WQ.id_class((rYB)rrEm_12, rfH_22, true)) {
                    rrEm_12.id_byte(1502, rfH_22, 0);
                    rrEm_12.id_synchronized().id_class(rfH_22, rrEm_12.id_byte(rfH_22).id_break(), 160);
                }
            }
        } else if (!bl && !WQ.id_class((rYB)rrEm_12, rfH_22, false)) {
            rrEm_12.id_class(rfH_22, (xc_3)xc_32.id_class(id_volatile, true), 3);
        }
    }
}

