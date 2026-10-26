/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.BN;
import celestial.Bk_1;
import celestial.C_throws;
import celestial.QY;
import celestial.aI_2;
import celestial.aZ_2;
import celestial.ai_3;
import celestial.an_3;
import celestial.cb_3;
import celestial.iB_2;
import celestial.rAB;
import celestial.rAS;
import celestial.rLR;
import celestial.rLY;
import celestial.rLi_1;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rff_3;
import celestial.rfl_3;
import celestial.rfo_3;
import celestial.rhV_2;
import celestial.rhd_3;
import celestial.rjG_2;
import celestial.rjM_2;
import celestial.rls_3;
import celestial.rpb_3;
import celestial.rpr_3;
import celestial.rrFi_1;
import celestial.rrLD;
import celestial.rye_3;
import celestial.xc_3;
import celestial.xn_3;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class rhI_2
extends rhV_2
implements ai_3 {
    public static final Predicate<iB_2> id_class = iB_2::BU;

    public rhI_2(rYB rYB2, double d, double d2, double d3) {
        super((aI_2<? extends rhV_2>)aI_2.V, d, d2, d3, rYB2);
    }

    public rhI_2(rYB rYB2, iB_2 iB_22) {
        super((aI_2<? extends rhV_2>)aI_2.V, iB_22, rYB2);
    }

    public rhI_2(aI_2<? extends rhI_2> aI_22, rYB rYB2) {
        super((aI_2<? extends rhV_2>)aI_22, rYB2);
    }

    private void id_class(rfH_2 rfH_22, rpr_3 rpr_32) {
        xc_3 xc_32 = ((rYB)this.id_throws[7]).id_byte(rfH_22);
        if (xc_32.id_class(rls_3.N)) {
            ((rYB)this.id_throws[7]).id_class(rfH_22, false);
        } else if (xn_3.id_private(xc_32)) {
            ((rYB)this.id_throws[7]).id_class((rhd_3)null, 1009, rfH_22, 0);
            xn_3.id_byte((rYB)this.id_throws[7], rfH_22, xc_32);
            ((rYB)this.id_throws[7]).id_break(rfH_22, (xc_3)xc_32.id_class(xn_3.id_final, false));
        }
    }

    private void id_class(rdn_3 rdn_32, rLi_1 rLi_12) {
        aZ_2 aZ_22 = new aZ_2((rYB)this.id_throws[7], this.rx(), this.re(), this.BO());
        an_3 an_32 = this.id_else();
        if (an_32 instanceof iB_2) {
            aZ_22.id_class((iB_2)an_32);
        }
        aZ_22.id_byte(3.0f);
        aZ_22.id_protected(-0.5f);
        aZ_22.id_byte(10);
        aZ_22.id_catch(-aZ_22.id_protected() / (float)aZ_22.id_private());
        aZ_22.id_class(rLi_12);
        for (rLY rLY2 : rAB.id_break(rdn_32)) {
            aZ_22.id_class(new rLY(rLY2));
        }
        rcd_3 rcd_32 = rdn_32.id_package();
        if (rcd_32 != null && rcd_32.id_byte("CustomPotionColor", 99)) {
            aZ_22.id_class(rcd_32.id_private("CustomPotionColor"));
        }
        ((rYB)this.id_throws[7]).a_(aZ_22);
    }

    @Override
    protected void id_class(rjG_2 rjG_22) {
        boolean bl;
        List<rLY> list;
        rdn_3 rdn_32;
        Object object;
        super.id_class(rjG_22);
        rdn_3 rdn_33 = this.id_class();
        if (((rYB)this.id_throws[7]).id_continue) {
            object = rrFi_1.id_class(rdn_33, rAB.id_class(rdn_33));
            rdn_32 = ((rrFi_1)object).id_class();
            list = ((rrFi_1)object).id_break();
        } else {
            rdn_32 = rdn_33;
            list = rAB.id_class(rdn_32);
        }
        object = rAB.id_protected(rdn_32);
        boolean bl2 = bl = object == rAS.id_break && list.isEmpty();
        if (bl) {
            if (!((rYB)this.id_throws[7]).id_continue) {
                this.id_catch();
            }
        } else if (this.id_private()) {
            if (!((rYB)this.id_throws[7]).id_continue && !list.isEmpty()) {
                this.id_class(rdn_32, (rLi_1)object);
            }
        } else {
            this.id_class(list, rdn_32, rjG_22.id_byte() == rjM_2.ENTITY ? ((rfo_3)rjG_22).id_class() : null);
        }
        if (!((rYB)this.id_throws[7]).id_continue) {
            int n = ((rLi_1)object).id_break() ? 2007 : 2002;
            ((rYB)this.id_throws[7]).id_byte(n, this.Bs(), rAB.id_byte(rdn_32));
        }
        this.PD();
    }

    @Override
    protected void id_class(rff_3 rff_32) {
        super.id_class(rff_32);
        if (!((rYB)this.id_throws[7]).id_continue) {
            rdn_3 rdn_32 = this.id_class();
            rLi_1 rLi_12 = rAB.id_protected(rdn_32);
            List<rLY> list = rAB.id_class(rdn_32);
            boolean bl = rLi_12 == rAS.id_break && list.isEmpty();
            rpr_3 rpr_32 = rff_32.id_break();
            rfH_2 rfH_22 = rff_32.id_class();
            rfH_2 rfH_23 = rfH_22.id_break(rpr_32);
            if (bl) {
                this.id_class(rfH_23, rpr_32);
                this.id_class(rfH_23.id_break(rpr_32.id_case()), rpr_32);
                for (rpr_3 rpr_33 : rpb_3.HORIZONTAL) {
                    this.id_class(rfH_23.id_break(rpr_33), rpr_33);
                }
            }
        }
    }

    private void id_class(List<rLY> list, rdn_3 rdn_32, an_3 an_32) {
        rfl_3 rfl_32 = this.rN().id_byte(4.0, 2.0, 4.0);
        List<iB_2> list2 = ((rYB)this.id_throws[7]).id_class(iB_2.class, rfl_32);
        if (!list2.isEmpty()) {
            Bk_1 bk_1 = C_throws.id_byte().id_boolean();
            ArrayList<BN> arrayList = new ArrayList<BN>();
            boolean bl = list.isEmpty() && bk_1.id_class();
            for (iB_2 iB_22 : list2) {
                double d;
                if (!iB_22.SL() || !((d = this.id_int(iB_22)) < 16.0)) continue;
                double d2 = 1.0 - Math.sqrt(d) / 4.0;
                if (iB_22 == an_32) {
                    d2 = 1.0;
                }
                ArrayList<rLY> arrayList2 = new ArrayList<rLY>();
                for (rLY rLY2 : list) {
                    rLR rLR2 = rLY2.id_class();
                    if (rLR2.id_class()) {
                        if (((rYB)this.id_throws[7]).id_continue) continue;
                        rLR2.id_class(this, this.id_else(), iB_22, rLY2.id_byte(), d2);
                        continue;
                    }
                    int n = (int)(d2 * (double)rLY2.id_break() + 0.5);
                    if (n <= 20) continue;
                    rLY rLY3 = new rLY(rLR2, n, rLY2.id_byte(), rLY2.id_protected(), rLY2.id_throws());
                    arrayList2.add(rLY3);
                    if (iB_22 == (cb_3)QY.id_instanceof().id_class[57] || iB_22.BC() != aI_2.rM) continue;
                    iB_22.id_break(rLY3);
                }
                if (!((rYB)this.id_throws[7]).id_continue) continue;
                if (!bl) {
                    if (arrayList2.isEmpty()) continue;
                    rrLD.id_class(iB_22, rdn_32, arrayList2, d2);
                    continue;
                }
                arrayList.add(new BN(iB_22, d2));
            }
            if (((rYB)this.id_throws[7]).id_continue && bl && !arrayList.isEmpty()) {
                bk_1.id_class(an_32, this.Ps(), rdn_32, arrayList);
            }
        }
    }

    @Override
    public float id_throws() {
        return 0.05f;
    }

    private void id_catch() {
        rfl_3 rfl_32 = this.rN().id_byte(4.0, 2.0, 4.0);
        List<iB_2> list = ((rYB)this.id_throws[7]).id_class(iB_2.class, rfl_32, id_class);
        if (!list.isEmpty()) {
            for (iB_2 iB_22 : list) {
                double d = this.id_int(iB_22);
                if (!(d < 16.0) || !iB_22.BU()) continue;
                iB_22.id_break(rye_3.id_byte(iB_22, this.id_else()), 1.0f);
            }
        }
    }

    @Override
    protected rdb_3 id_protected() {
        return rdy_3.kk;
    }

    private boolean id_private() {
        return this.id_class().id_break() == rdy_3.kQ;
    }
}

