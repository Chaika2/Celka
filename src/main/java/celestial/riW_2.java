/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
package celestial;

import celestial.aI_2;
import celestial.aU_2;
import celestial.iO_2;
import celestial.rEc_1;
import celestial.rRI;
import celestial.rRq_1;
import celestial.raF_2;
import celestial.rcd_3;
import celestial.rfH_2;
import celestial.rfi_3;
import celestial.riz_3;
import celestial.rpr_3;
import celestial.rrrn_1;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import com.google.common.collect.ImmutableSet;
import java.util.Set;

public abstract class riW_2
extends rrrn_1 {
    protected static final xc_3 id_class = xu_3.Em.id_continue();
    protected static final xc_3 id_break = xu_3.EZ.id_continue();
    protected static final xc_3 id_byte = xu_3.Ev.id_continue();
    protected static final xc_3 id_protected = id_break;
    protected static final xc_3 id_throws = xu_3.EH.id_continue();
    protected static final xc_3 id_case = xu_3.id_try.id_continue();
    protected static final Set<xd_3> id_catch = ImmutableSet.builder().add((Object)xu_3.PT).add((Object)xu_3.Ei).add((Object)xu_3.hP).add((Object)id_case.id_break()).build();
    protected static final int id_private = riW_2.id_break(2, 0, 0);
    protected static final int id_implements = riW_2.id_break(2, 2, 0);
    protected static final int id_finally = riW_2.id_break(0, 1, 0);
    protected static final int id_extends = riW_2.id_break(4, 1, 0);
    protected riz_3 id_native;

    protected riW_2(raF_2 raF_22, int n, rpr_3 rpr_32, riz_3 riz_32, int n2, int n3, int n4) {
        super(raF_22, n);
        this.id_class(rpr_32);
        this.id_native = riz_32;
        int n5 = riz_32.id_class;
        int n6 = n5 % 5;
        int n7 = n5 / 5 % 5;
        int n8 = n5 / 25;
        this.id_final = rpr_32 != rpr_3.NORTH && rpr_32 != rpr_3.SOUTH ? new rfi_3(0, 0, 0, n4 * 8 - 1, n3 * 4 - 1, n2 * 8 - 1) : new rfi_3(0, 0, 0, n2 * 8 - 1, n3 * 4 - 1, n4 * 8 - 1);
        switch (rpr_32) {
            case NORTH: {
                this.id_final.id_class(n6 * 8, n8 * 4, -(n7 + n4) * 8 + 1);
                break;
            }
            case SOUTH: {
                this.id_final.id_class(n6 * 8, n8 * 4, n7 * 8);
                break;
            }
            case WEST: {
                this.id_final.id_class(-(n7 + n4) * 8 + 1, n8 * 4, n6 * 8);
                break;
            }
            default: {
                this.id_final.id_class(n7 * 8, n8 * 4, n6 * 8);
            }
        }
    }

    public riW_2(raF_2 raF_22, rpr_3 rpr_32, rfi_3 rfi_32) {
        super(raF_22, 1);
        this.id_class(rpr_32);
        this.id_final = rfi_32;
    }

    public riW_2(raF_2 raF_22, int n) {
        super(raF_22, n);
    }

    public riW_2(raF_2 raF_22, rcd_3 rcd_32) {
        super(raF_22, rcd_32);
    }

    protected boolean id_class(rRI rRI2, rfi_3 rfi_32, int n, int n2, int n3) {
        int n4;
        int n5;
        int n6 = this.id_class(n, n3);
        if (rfi_32.id_break(new rfH_2(n6, n5 = this.id_class(n2), n4 = this.id_break(n, n3)))) {
            rEc_1 rEc_12 = aI_2.id_continue.id_class(rRI2.id_byte());
            rEc_12.id_protected(rEc_12.SK());
            rEc_12.id_class((double)n6 + 0.5, (double)n5, (double)n4 + 0.5, 0.0f, 0.0f);
            rEc_12.id_class(rRI2, rRI2.id_throws(rEc_12.Bs()), iO_2.STRUCTURE, (aU_2)null, (rcd_3)null);
            rRI2.id_class(rEc_12);
            return true;
        }
        return false;
    }

    protected boolean id_class(rfi_3 rfi_32, int n, int n2, int n3, int n4) {
        int n5 = this.id_class(n, n2);
        int n6 = this.id_break(n, n2);
        int n7 = this.id_class(n3, n4);
        int n8 = this.id_break(n3, n4);
        return rfi_32.id_class(Math.min(n5, n7), Math.min(n6, n8), Math.max(n5, n7), Math.max(n6, n8));
    }

    protected void id_class(rRI rRI2, rfi_3 rfi_32, int n, int n2, int n3, int n4, int n5, int n6, xc_3 xc_32) {
        for (int i = n2; i <= n5; ++i) {
            for (int j = n; j <= n4; ++j) {
                for (int k = n3; k <= n6; ++k) {
                    if (this.id_class((rRq_1)rRI2, j, i, k, rfi_32) != id_case) continue;
                    this.id_class(rRI2, xc_32, j, i, k, rfi_32);
                }
            }
        }
    }

    @Override
    protected void id_class(rcd_3 rcd_32) {
    }

    protected void id_class(rRI rRI2, rfi_3 rfi_32, int n, int n2, int n3, int n4, int n5, int n6) {
        for (int i = n2; i <= n5; ++i) {
            for (int j = n; j <= n4; ++j) {
                for (int k = n3; k <= n6; ++k) {
                    xc_3 xc_32 = this.id_class((rRq_1)rRI2, j, i, k, rfi_32);
                    if (id_catch.contains(xc_32.id_break())) continue;
                    if (this.id_class(i) >= rRI2.id_short() && xc_32 != id_case) {
                        this.id_class(rRI2, xu_3.id_class.id_continue(), j, i, k, rfi_32);
                        continue;
                    }
                    this.id_class(rRI2, id_case, j, i, k, rfi_32);
                }
            }
        }
    }

    protected void id_class(rRI rRI2, rfi_3 rfi_32, int n, int n2, boolean bl) {
        if (bl) {
            this.id_class(rRI2, rfi_32, n + 0, 0, n2 + 0, n + 2, 0, n2 + 8 - 1, id_class, id_class, false);
            this.id_class(rRI2, rfi_32, n + 5, 0, n2 + 0, n + 8 - 1, 0, n2 + 8 - 1, id_class, id_class, false);
            this.id_class(rRI2, rfi_32, n + 3, 0, n2 + 0, n + 4, 0, n2 + 2, id_class, id_class, false);
            this.id_class(rRI2, rfi_32, n + 3, 0, n2 + 5, n + 4, 0, n2 + 8 - 1, id_class, id_class, false);
            this.id_class(rRI2, rfi_32, n + 3, 0, n2 + 2, n + 4, 0, n2 + 2, id_break, id_break, false);
            this.id_class(rRI2, rfi_32, n + 3, 0, n2 + 5, n + 4, 0, n2 + 5, id_break, id_break, false);
            this.id_class(rRI2, rfi_32, n + 2, 0, n2 + 3, n + 2, 0, n2 + 4, id_break, id_break, false);
            this.id_class(rRI2, rfi_32, n + 5, 0, n2 + 3, n + 5, 0, n2 + 4, id_break, id_break, false);
        } else {
            this.id_class(rRI2, rfi_32, n + 0, 0, n2 + 0, n + 8 - 1, 0, n2 + 8 - 1, id_class, id_class, false);
        }
    }

    protected static final int id_break(int n, int n2, int n3) {
        return n2 * 25 + n3 * 5 + n;
    }
}

