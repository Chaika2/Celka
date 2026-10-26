/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.Oo_1;
import celestial.rEB;
import celestial.rLD;
import celestial.rRJ;
import celestial.rRP;
import celestial.rRr_1;
import celestial.rRu_1;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rcy_3;
import celestial.rfH_2;
import celestial.rgU_2;
import celestial.rhN_2;
import celestial.rhd_3;
import celestial.rjU_2;
import celestial.rlB_2;
import celestial.rrEm_1;
import celestial.rrEr_1;
import celestial.rrGc_1;
import celestial.ruP_2;
import celestial.rvQ_2;
import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class rrEs_1
extends rrGc_1 {
    private final Map<Integer, rrEr_1> id_class = Maps.newHashMap();
    private final rrEm_1 id_break;
    private int id_byte;
    private int id_protected;

    @Override
    public rcd_3 id_byte(rcd_3 rcd_32) {
        rcd_32.id_break("NextAvailableID", this.id_byte);
        rcd_32.id_break("Tick", this.id_protected);
        rcy_3 rcy_32 = new rcy_3();
        for (rrEr_1 rrEr_12 : this.id_class.values()) {
            rcd_3 rcd_33 = new rcd_3();
            rrEr_12.id_class(rcd_33);
            rcy_32.add(rcd_33);
        }
        rcd_32.id_class("Raids", rcy_32);
        return rcd_32;
    }

    public rrEs_1(rrEm_1 rrEm_12) {
        super(rrEs_1.id_class(rrEm_12.id_default()));
        this.id_break = rrEm_12;
        this.id_byte = 1;
        this.id_byte();
    }

    private rrEr_1 id_class(rrEm_1 rrEm_12, rfH_2 rfH_22) {
        rrEr_1 rrEr_12 = rrEm_12.id_interface(rfH_22);
        return rrEr_12 != null ? rrEr_12 : new rrEr_1(this.id_break(), rrEm_12, rfH_22);
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        this.id_byte = rcd_32.id_private("NextAvailableID");
        this.id_protected = rcd_32.id_private("Tick");
        rcy_3 rcy_32 = rcd_32.id_protected("Raids", 10);
        for (int i = 0; i < rcy_32.size(); ++i) {
            rcd_3 rcd_33 = rcy_32.id_class(i);
            rrEr_1 rrEr_12 = new rrEr_1(this.id_break, rcd_33);
            this.id_class.put(rrEr_12.id_super(), rrEr_12);
        }
    }

    public rrEr_1 id_class(rfH_2 rfH_22, int n) {
        rrEr_1 rrEr_12 = null;
        double d = n;
        for (rrEr_1 rrEr_13 : this.id_class.values()) {
            double d2 = rrEr_13.id_continue().id_private(rfH_22);
            if (!rrEr_13.id_this() || !(d2 < d)) continue;
            rrEr_12 = rrEr_13;
            d = d2;
        }
        return rrEr_12;
    }

    public static String id_class(rRJ rRJ2) {
        return "raids" + rRJ2.id_class();
    }

    public rrEr_1 id_class(int n) {
        return this.id_class.get(n);
    }

    public void id_class() {
        ++this.id_protected;
        Iterator<rrEr_1> iterator = this.id_class.values().iterator();
        while (iterator.hasNext()) {
            rrEr_1 rrEr_12 = iterator.next();
            if (this.id_break.B().id_break(rRu_1.id_public)) {
                rrEr_12.id_native();
            }
            if (rrEr_12.id_protected()) {
                iterator.remove();
                this.id_byte();
                continue;
            }
            rrEr_12.id_volatile();
        }
        if (this.id_protected % 200 == 0) {
            this.id_byte();
        }
        ruP_2.id_class(this.id_break, this.id_class.values());
    }

    public static boolean id_class(rEB rEB2, rrEr_1 rrEr_12) {
        if (rEB2 != null && rrEr_12 != null && rrEr_12.id_catch() != null) {
            return rEB2.BM() && rEB2.L() && rEB2.BI() <= 2400 && ((rYB)rEB2.id_throws[7]).id_default() == rrEr_12.id_catch().id_default();
        }
        return false;
    }

    public rrEr_1 id_class(rhN_2 rhN_22) {
        Object object;
        Object object22;
        if (rhN_22.id_native()) {
            return null;
        }
        if (this.id_break.B().id_break(rRu_1.id_public)) {
            return null;
        }
        rRJ rRJ2 = ((rYB)rhN_22.id_throws[7]).id_default();
        if (!rRJ2.id_finally()) {
            return null;
        }
        rfH_2 rfH_22 = rhN_22.Bs();
        List list = this.id_break.d().id_byte(rRP.id_break, rfH_22, 64, rRr_1.IS_OCCUPIED).collect(Collectors.toList());
        int n = 0;
        rjU_2 rjU_22 = rjU_2.id_class;
        for (Object object22 : list) {
            rfH_2 rfH_23 = ((rgU_2)object22).id_throws();
            rjU_22 = rjU_22.id_break(rfH_23.b_(), rfH_23.c_(), rfH_23.d_());
            ++n;
        }
        if (n > 0) {
            rjU_22 = rjU_22.id_class(1.0 / (double)n);
            object = new rfH_2(rjU_22);
        } else {
            object = rfH_22;
        }
        object22 = this.id_class(rhN_22.id_continue(), (rfH_2)object);
        boolean bl = false;
        if (!((rrEr_1)object22).id_private()) {
            if (!this.id_class.containsKey(((rrEr_1)object22).id_super())) {
                this.id_class.put(((rrEr_1)object22).id_super(), (rrEr_1)object22);
            }
            bl = true;
        } else if (((rrEr_1)object22).id_extends() < ((rrEr_1)object22).id_finally()) {
            bl = true;
        } else {
            rhN_22.id_protected(rLD.id_char);
            rhN_22.id_class.id_class(new rvQ_2(rhN_22, 43));
        }
        if (bl) {
            ((rrEr_1)object22).id_class((rhd_3)rhN_22);
            rhN_22.id_class.id_class(new rvQ_2(rhN_22, 43));
            if (!((rrEr_1)object22).id_byte()) {
                rhN_22.id_break(rlB_2.H);
                Oo_1.id_void.id_class(rhN_22);
            }
        }
        this.id_byte();
        return object22;
    }

    private int id_break() {
        return ++this.id_byte;
    }
}

