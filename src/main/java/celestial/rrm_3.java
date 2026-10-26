/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.dO_2;
import celestial.dy_3;
import celestial.eX_2;
import celestial.iB_2;
import celestial.iC_2;
import celestial.iH_2;
import celestial.il_3;
import celestial.rPm_1;
import celestial.rRu_1;
import celestial.rXA;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rfI_2;
import celestial.rfw_3;
import celestial.rhd_3;
import celestial.rqL_2;
import celestial.rqn_3;
import celestial.rrEm_1;
import celestial.rsT_2;
import celestial.rsq_3;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Map;

public class rrm_3
extends rPm_1<rsq_3> {
    private rfH_2 id_class;
    private long id_byte;
    private int id_protected;
    private final List<rfH_2> id_throws = Lists.newArrayList();

    @Override
    protected void id_byte(rrEm_1 rrEm_12, rsq_3 rsq_32, long l) {
        if (this.id_class == null || this.id_class.id_class((eX_2)rsq_32.Ps(), 1.0)) {
            if (this.id_class != null && l > this.id_byte) {
                xc_3 xc_32 = rrEm_12.id_byte(this.id_class);
                xd_3 xd_32 = xc_32.id_break();
                xd_3 xd_33 = rrEm_12.id_byte(this.id_class.id_break()).id_break();
                if (xd_32 instanceof dO_2 && ((dO_2)xd_32).id_implements(xc_32)) {
                    rrEm_12.id_class(this.id_class, true, rsq_32);
                }
                if (xc_32.id_catch() && xd_33 instanceof dy_3 && rsq_32.sF()) {
                    rXA rXA2 = rsq_32.sd();
                    for (int i = 0; i < rXA2.id_else(); ++i) {
                        rdn_3 rdn_32 = rXA2.id_extends(i);
                        boolean bl = false;
                        if (!rdn_32.id_class()) {
                            if (rdn_32.id_break() == rdy_3.hP) {
                                rrEm_12.id_class(this.id_class, xu_3.PB.id_continue(), 3);
                                bl = true;
                            } else if (rdn_32.id_break() == rdy_3.dE) {
                                rrEm_12.id_class(this.id_class, xu_3.sP.id_continue(), 3);
                                bl = true;
                            } else if (rdn_32.id_break() == rdy_3.ds) {
                                rrEm_12.id_class(this.id_class, xu_3.sr.id_continue(), 3);
                                bl = true;
                            } else if (rdn_32.id_break() == rdy_3.kJ) {
                                rrEm_12.id_class(this.id_class, xu_3.bT.id_continue(), 3);
                                bl = true;
                            }
                        }
                        if (!bl) continue;
                        rrEm_12.id_class((rhd_3)null, (double)this.id_class.b_(), (double)this.id_class.c_(), (double)this.id_class.d_(), rqn_3.PZ, rqL_2.BLOCKS, 1.0f, 1.0f);
                        rdn_32.id_catch(1);
                        if (!rdn_32.id_class()) break;
                        rXA2.id_break(i, rdn_3.id_break);
                        break;
                    }
                }
                if (xd_32 instanceof dO_2 && !((dO_2)xd_32).id_implements(xc_32)) {
                    this.id_throws.remove(this.id_class);
                    this.id_class = this.id_class(rrEm_12);
                    if (this.id_class != null) {
                        this.id_byte = l + 20L;
                        rsq_32.SF().id_class(il_3.id_volatile, new iH_2(new rfI_2(this.id_class), 0.5f, 1));
                        rsq_32.SF().id_class(il_3.id_final, new rfI_2(this.id_class));
                    }
                }
            }
            ++this.id_protected;
        }
    }

    public rrm_3() {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of(il_3.id_final, (Object)((Object)iC_2.VALUE_ABSENT), il_3.id_volatile, (Object)((Object)iC_2.VALUE_ABSENT), il_3.id_case, (Object)((Object)iC_2.VALUE_PRESENT)));
    }

    private rfH_2 id_class(rrEm_1 rrEm_12) {
        return this.id_throws.isEmpty() ? null : this.id_throws.get(rrEm_12.id_long().nextInt(this.id_throws.size()));
    }

    @Override
    protected /* synthetic */ boolean id_class(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        return this.id_protected(rrEm_12, (rsq_3)iB_22, l);
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, rsq_3 rsq_32) {
        if (!rrEm_12.B().id_break(rRu_1.id_break)) {
            return false;
        }
        if (rsq_32.su().id_break() != rsT_2.id_case) {
            return false;
        }
        rfw_3 rfw_32 = rsq_32.Bs().id_new();
        this.id_throws.clear();
        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                for (int k = -1; k <= 1; ++k) {
                    rfw_32.id_break(rsq_32.rx() + (double)i, rsq_32.re() + (double)j, rsq_32.BO() + (double)k);
                    if (!this.id_class(rfw_32, rrEm_12)) continue;
                    this.id_throws.add(new rfH_2(rfw_32));
                }
            }
        }
        this.id_class = this.id_class(rrEm_12);
        return this.id_class != null;
    }

    private boolean id_class(rfH_2 rfH_22, rrEm_1 rrEm_12) {
        xc_3 xc_32 = rrEm_12.id_byte(rfH_22);
        xd_3 xd_32 = xc_32.id_break();
        xd_3 xd_33 = rrEm_12.id_byte(rfH_22.id_break()).id_break();
        return xd_32 instanceof dO_2 && ((dO_2)xd_32).id_implements(xc_32) || xc_32.id_catch() && xd_33 instanceof dy_3;
    }

    protected void id_class(rrEm_1 rrEm_12, rsq_3 rsq_32, long l) {
        if (l > this.id_byte && this.id_class != null) {
            rsq_32.SF().id_class(il_3.id_final, new rfI_2(this.id_class));
            rsq_32.SF().id_class(il_3.id_volatile, new iH_2(new rfI_2(this.id_class), 0.5f, 1));
        }
    }

    @Override
    protected void id_break(rrEm_1 rrEm_12, rsq_3 rsq_32, long l) {
        rsq_32.SF().id_break(il_3.id_final);
        rsq_32.SF().id_break(il_3.id_volatile);
        this.id_protected = 0;
        this.id_byte = l + 40L;
    }

    @Override
    protected /* synthetic */ void id_protected(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        this.id_class(rrEm_12, (rsq_3)iB_22, l);
    }

    protected boolean id_protected(rrEm_1 rrEm_12, rsq_3 rsq_32, long l) {
        return this.id_protected < 200;
    }
}

