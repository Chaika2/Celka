/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
package celestial;

import celestial.an_3;
import celestial.rYP;
import celestial.rfj_3;
import celestial.rhN_2;
import celestial.rjU_2;
import celestial.rjh_3;
import celestial.rrEG;
import celestial.rrEx_1;
import celestial.ruS_2;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class rrEW {
    public final rYP id_break;
    public final an_3 id_byte;
    private final int id_protected;
    public rjh_3 id_throws;
    private final Set<rhN_2> id_case = Sets.newHashSet();
    public final /* synthetic */ rrEx_1 id_class;

    public rrEW(rrEx_1 rrEx_12, an_3 an_32, int n, int n2, boolean bl) {
        this.id_class = rrEx_12;
        this.id_break = new rYP(rrEx_12.id_private, an_32, n2, bl, this::id_class);
        this.id_byte = an_32;
        this.id_protected = n;
        this.id_throws = rjh_3.id_class(an_32);
    }

    public boolean equals(Object object) {
        if (object instanceof rrEW) {
            return ((rrEW)object).id_byte.V() == this.id_byte.V();
        }
        return false;
    }

    public int hashCode() {
        return this.id_byte.V();
    }

    public void id_class(rhN_2 rhN_22) {
        if (this.id_case.remove(rhN_22)) {
            this.id_break.id_class(rhN_22);
        }
    }

    private int id_class(int n) {
        return this.id_class.id_private.id_const().id_break(n);
    }

    public void id_class(List<rhN_2> list) {
        for (rhN_2 rhN_22 : list) {
            this.id_break(rhN_22);
        }
    }

    public void id_class(ruS_2<?> ruS_22) {
        for (rhN_2 rhN_22 : this.id_case) {
            rhN_22.id_class.id_class(ruS_22);
        }
    }

    public void id_class() {
        for (rhN_2 rhN_22 : this.id_case) {
            this.id_break.id_class(rhN_22);
        }
    }

    public void id_break(ruS_2<?> ruS_22) {
        this.id_class(ruS_22);
        if (this.id_byte instanceof rhN_2) {
            ((rhN_2)this.id_byte).id_class.id_class(ruS_22);
        }
    }

    private int id_break() {
        Collection<an_3> collection = this.id_byte.PP();
        int n = this.id_protected;
        for (an_3 an_32 : collection) {
            int n2 = an_32.BC().id_final() * 16;
            if (n2 <= n) continue;
            n = n2;
        }
        return this.id_class(n);
    }

    public void id_break(rhN_2 rhN_22) {
        if (rhN_22 != this.id_byte) {
            boolean bl;
            rjU_2 rjU_22 = rhN_22.Ps().id_protected(this.id_break.id_break());
            int n = Math.min(this.id_break(), (this.id_class.id_instanceof - 1) * 16);
            boolean bl2 = bl = rjU_22.id_break >= (double)(-n) && rjU_22.id_break <= (double)n && rjU_22.id_protected >= (double)(-n) && rjU_22.id_protected <= (double)n && this.id_byte.id_byte(rhN_22);
            if (bl) {
                rfj_3 rfj_32;
                rrEG rrEG2;
                boolean bl3 = (Boolean)this.id_byte.id_throws[6];
                if (!bl3 && (rrEG2 = this.id_class.id_break((rfj_32 = new rfj_3((Integer)this.id_byte.id_throws[51], (Integer)this.id_byte.id_throws[53])).id_class())) != null && rrEG2.id_protected() != null) {
                    boolean bl4 = bl3 = rrEx_1.id_class(rfj_32, rhN_22, false) <= this.id_class.id_instanceof;
                }
                if (bl3 && this.id_case.add(rhN_22)) {
                    this.id_break.id_break(rhN_22);
                }
            } else if (this.id_case.remove(rhN_22)) {
                this.id_break.id_class(rhN_22);
            }
        }
    }
}

