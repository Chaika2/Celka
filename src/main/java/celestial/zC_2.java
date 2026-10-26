/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 */
package celestial;

import celestial.JC;
import celestial.Jq_1;
import celestial.iB_2;
import celestial.kE_2;
import celestial.rCL;
import celestial.rCN;
import celestial.rCT;
import celestial.rCc_1;
import celestial.rCn_1;
import celestial.rRR;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rhd_3;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rpa_3;
import celestial.rpr_3;
import celestial.rqL_2;
import celestial.rqd_3;
import celestial.rqn_3;
import celestial.rrEm_1;
import celestial.rxx_3;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import celestial.zA_2;
import com.google.common.base.MoreObjects;
import java.util.Random;

public class zC_2
extends xd_3 {
    public static final rCc_1 id_volatile = kE_2.p;
    public static final rCN id_final = rCT.id_return;
    public static final rCN id_package = rCT.id_class;
    protected static final rjC_2 id_int = xd_3.id_class(5.0, 0.0, 10.0, 11.0, 10.0, 16.0);
    protected static final rjC_2 id_new = xd_3.id_class(5.0, 0.0, 0.0, 11.0, 10.0, 6.0);
    protected static final rjC_2 id_continue = xd_3.id_class(10.0, 0.0, 5.0, 16.0, 10.0, 11.0);
    protected static final rjC_2 id_super = xd_3.id_class(0.0, 0.0, 5.0, 6.0, 10.0, 11.0);

    @Override
    public boolean id_byte(xc_3 xc_32) {
        return true;
    }

    public zC_2(Jq_1 jq_1) {
        super(jq_1);
        this.id_extends((xc_3)((xc_3)((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_volatile, rpr_3.NORTH)).id_class(id_final, false)).id_class(id_package, false));
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        switch (xc_32.id_byte(id_volatile)) {
            default: {
                return id_super;
            }
            case WEST: {
                return id_continue;
            }
            case SOUTH: {
                return id_new;
            }
            case NORTH: 
        }
        return id_int;
    }

    @Override
    public int id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rpr_3 rpr_32) {
        return xc_32.id_byte(id_final) != false ? 15 : 0;
    }

    private void id_class(rYB rYB2, rfH_2 rfH_22, rpr_3 rpr_32) {
        rYB2.id_break(rfH_22, this);
        rYB2.id_break(rfH_22.id_break(rpr_32.id_case()), this);
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRR rRR2, rfH_2 rfH_22) {
        rpr_3 rpr_32 = xc_32.id_byte(id_volatile);
        rfH_2 rfH_23 = rfH_22.id_break(rpr_32.id_case());
        xc_3 xc_33 = rRR2.id_byte(rfH_23);
        return rpr_32.id_final().id_protected() && xc_33.id_protected(rRR2, rfH_23, rpr_32);
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rqd_3 rqd_32) {
        return (xc_3)xc_32.id_class(id_volatile, rqd_32.id_class(xc_32.id_byte(id_volatile)));
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpa_3 rpa_32) {
        return xc_32.id_class(rpa_32.id_class(xc_32.id_byte(id_volatile)));
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(id_volatile, id_final, id_package);
    }

    public void id_class(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32, boolean bl, boolean bl2, int n, xc_3 xc_33) {
        Object object;
        rfH_2 rfH_23;
        rpr_3 rpr_32 = xc_32.id_byte(id_volatile);
        boolean bl3 = xc_32.id_byte(id_package);
        boolean bl4 = xc_32.id_byte(id_final);
        boolean bl5 = !bl;
        boolean bl6 = false;
        int n2 = 0;
        xc_3[] xc_3Array = new xc_3[42];
        for (int i = 1; i < 42; ++i) {
            rfH_23 = rfH_22.id_class(rpr_32, i);
            object = rYB2.id_byte(rfH_23);
            if (((JC)object).id_class(xu_3.Sz)) {
                if (((rCn_1)object).id_byte(id_volatile) != rpr_32.id_case()) break;
                n2 = i;
                break;
            }
            if (!((JC)object).id_class(xu_3.SQ) && i != n) {
                xc_3Array[i] = null;
                bl5 = false;
                continue;
            }
            if (i == n) {
                object = (xc_3)MoreObjects.firstNonNull((Object)xc_33, (Object)object);
            }
            boolean bl7 = ((rCn_1)object).id_byte(zA_2.id_package) == false;
            boolean bl8 = ((rCn_1)object).id_byte(zA_2.id_volatile);
            bl6 |= bl7 && bl8;
            xc_3Array[i] = object;
            if (i != n) continue;
            rYB2.id_finally().id_class(rfH_22, this, 10);
            bl5 &= bl7;
        }
        xc_3 xc_34 = (xc_3)((xc_3)this.id_continue().id_class(id_package, bl5)).id_class(id_final, bl6 &= (bl5 &= n2 > 1));
        if (n2 > 0) {
            rfH_23 = rfH_22.id_class(rpr_32, n2);
            object = rpr_32.id_case();
            rYB2.id_class(rfH_23, (xc_3)xc_34.id_class(id_volatile, object), 3);
            this.id_class(rYB2, rfH_23, (rpr_3)object);
            this.id_class(rYB2, rfH_23, bl5, bl6, bl3, bl4);
        }
        this.id_class(rYB2, rfH_22, bl5, bl6, bl3, bl4);
        if (!bl) {
            rYB2.id_class(rfH_22, (xc_3)xc_34.id_class(id_volatile, rpr_32), 3);
            if (bl2) {
                this.id_class(rYB2, rfH_22, rpr_32);
            }
        }
        if (bl3 != bl5) {
            for (int i = 1; i < n2; ++i) {
                object = rfH_22.id_class(rpr_32, i);
                xc_3 xc_35 = xc_3Array[i];
                if (xc_35 == null) continue;
                rYB2.id_class((rfH_2)object, (xc_3)xc_35.id_class(id_package, bl5), 3);
                if (rYB2.id_byte((rfH_2)object).id_catch()) continue;
            }
        }
    }

    @Override
    public void id_class(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32, iB_2 iB_22, rdn_3 rdn_32) {
        this.id_class(rYB2, rfH_22, xc_32, false, false, -1, null);
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        rpr_3[] rpr_3Array;
        xc_3 xc_32 = (xc_3)((xc_3)this.id_continue().id_class(id_final, false)).id_class(id_package, false);
        rYB rYB2 = rxx_32.id_int();
        rfH_2 rfH_22 = rxx_32.id_class();
        for (rpr_3 rpr_32 : rpr_3Array = rxx_32.id_throws()) {
            rpr_3 rpr_33;
            if (!rpr_32.id_final().id_protected() || !(xc_32 = (xc_3)xc_32.id_class(id_volatile, rpr_33 = rpr_32.id_case())).id_class((rRR)rYB2, rfH_22)) continue;
            return xc_32;
        }
        return null;
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        return rpr_32.id_case() == xc_32.id_byte(id_volatile) && !xc_32.id_class(rRg_12, rfH_22) ? xu_3.id_class.id_continue() : super.id_class(xc_32, rpr_32, xc_33, rRg_12, rfH_22, rfH_23);
    }

    private void id_class(rYB rYB2, rfH_2 rfH_22, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        if (bl2 && !bl4) {
            rYB2.id_class((rhd_3)null, rfH_22, rqn_3.dN, rqL_2.BLOCKS, 0.4f, 0.6f);
        } else if (!bl2 && bl4) {
            rYB2.id_class((rhd_3)null, rfH_22, rqn_3.dQ, rqL_2.BLOCKS, 0.4f, 0.5f);
        } else if (bl && !bl3) {
            rYB2.id_class((rhd_3)null, rfH_22, rqn_3.dz, rqL_2.BLOCKS, 0.4f, 0.7f);
        } else if (!bl && bl3) {
            rYB2.id_class((rhd_3)null, rfH_22, rqn_3.dc, rqL_2.BLOCKS, 0.4f, 1.2f / (rYB2.id_int.nextFloat() * 0.2f + 0.9f));
        }
    }

    @Override
    public void id_break(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xc_3 xc_33, boolean bl) {
        if (!bl && !xc_32.id_class(xc_33.id_break())) {
            boolean bl2 = xc_32.id_byte(id_package);
            boolean bl3 = xc_32.id_byte(id_final);
            if (bl2 || bl3) {
                this.id_class(rYB2, rfH_22, xc_32, true, false, -1, null);
            }
            if (bl3) {
                rYB2.id_break(rfH_22, this);
                rYB2.id_break(rfH_22.id_break(xc_32.id_byte(id_volatile).id_case()), this);
            }
            super.id_break(xc_32, rYB2, rfH_22, xc_33, bl);
        }
    }

    @Override
    public int id_break(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rpr_3 rpr_32) {
        if (!xc_32.id_byte(id_final).booleanValue()) {
            return 0;
        }
        return xc_32.id_byte(id_volatile) == rpr_32 ? 15 : 0;
    }

    @Override
    public void id_break(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 rfH_22, Random random) {
        this.id_class(rrEm_12, rfH_22, xc_32, false, true, -1, null);
    }
}

