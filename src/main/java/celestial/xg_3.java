/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.rCL;
import celestial.rCT;
import celestial.rCZ;
import celestial.rCm_1;
import celestial.rRR;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rff_3;
import celestial.rhf_3;
import celestial.rlE_2;
import celestial.rpb_3;
import celestial.rpr_3;
import celestial.rrEm_1;
import celestial.xR_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import java.util.Random;

public class xg_3
extends xd_3 {
    public static final rCm_1 id_volatile = rCT.x;
    private final xR_2 id_final;

    protected xg_3(xR_2 xR_22, Jq_1 jq_1) {
        super(jq_1);
        this.id_final = xR_22;
        this.id_extends((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_volatile, 0));
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        if (rpr_32 != rpr_3.UP && !xc_32.id_class(rRg_12, rfH_22)) {
            rRg_12.id_finally().id_class(rfH_22, this, 1);
        }
        return super.id_class(xc_32, rpr_32, xc_33, rRg_12, rfH_22, rfH_23);
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(new rCZ[]{id_volatile});
    }

    public static void id_class(rRg_1 rRg_12, rfH_2 rfH_22, Random random, int n) {
        rRg_12.id_class(rfH_22, ((xR_2)xu_3.bC).id_class((rRq_1)rRg_12, rfH_22), 2);
        xg_3.id_class(rRg_12, rfH_22, random, rfH_22, n, 0);
    }

    private static void id_class(rRg_1 rRg_12, rfH_2 rfH_22, Random random, rfH_2 rfH_23, int n, int n2) {
        int n3;
        xR_2 xR_22 = (xR_2)xu_3.bC;
        int n4 = random.nextInt(4) + 1;
        if (n2 == 0) {
            ++n4;
        }
        for (n3 = 0; n3 < n4; ++n3) {
            rfH_2 rfH_24 = rfH_22.id_break(n3 + 1);
            if (!xg_3.id_break(rRg_12, rfH_24, (rpr_3)null)) {
                return;
            }
            rRg_12.id_class(rfH_24, xR_22.id_class((rRq_1)rRg_12, rfH_24), 2);
            rRg_12.id_class(rfH_24.id_break(), xR_22.id_class((rRq_1)rRg_12, rfH_24.id_break()), 2);
        }
        n3 = 0;
        if (n2 < 4) {
            int n5 = random.nextInt(4);
            if (n2 == 0) {
                ++n5;
            }
            for (int i = 0; i < n5; ++i) {
                rpr_3 rpr_32 = rpb_3.HORIZONTAL.id_class(random);
                rfH_2 rfH_25 = rfH_22.id_break(n4).id_break(rpr_32);
                if (Math.abs(rfH_25.b_() - rfH_23.b_()) >= n || Math.abs(rfH_25.d_() - rfH_23.d_()) >= n || !rRg_12.id_finally(rfH_25) || !rRg_12.id_finally(rfH_25.id_break()) || !xg_3.id_break(rRg_12, rfH_25, rpr_32.id_case())) continue;
                n3 = 1;
                rRg_12.id_class(rfH_25, xR_22.id_class((rRq_1)rRg_12, rfH_25), 2);
                rRg_12.id_class(rfH_25.id_break(rpr_32.id_case()), xR_22.id_class((rRq_1)rRg_12, rfH_25.id_break(rpr_32.id_case())), 2);
                xg_3.id_class(rRg_12, rfH_25, random, rfH_23, n, n2 + 1);
            }
        }
        if (n3 == 0) {
            rRg_12.id_class(rfH_22.id_break(n4), (xc_3)xu_3.bl.id_continue().id_class(id_volatile, 5), 2);
        }
    }

    @Override
    public void id_class(rYB rYB2, xc_3 xc_32, rff_3 rff_32, rhf_3 rhf_32) {
        if (rhf_32.BC().id_class(rlE_2.id_case)) {
            rfH_2 rfH_22 = rff_32.id_class();
            rYB2.id_class(rfH_22, true, rhf_32);
        }
    }

    @Override
    public void id_class(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 rfH_22, Random random) {
        int n;
        rfH_2 rfH_23 = rfH_22.id_final();
        if (rrEm_12.id_finally(rfH_23) && rfH_23.c_() < 256 && (n = xc_32.id_byte(id_volatile).intValue()) < 5) {
            int n2;
            int n3;
            boolean bl = false;
            boolean bl2 = false;
            xc_3 xc_33 = rrEm_12.id_byte(rfH_22.id_break());
            xd_3 xd_32 = xc_33.id_break();
            if (xd_32 == xu_3.Sh) {
                bl = true;
            } else if (xd_32 == this.id_final) {
                n3 = 1;
                for (n2 = 0; n2 < 4; ++n2) {
                    xd_3 xd_33 = rrEm_12.id_byte(rfH_22.id_catch(n3 + 1)).id_break();
                    if (xd_33 != this.id_final) {
                        if (xd_33 != xu_3.Sh) break;
                        bl2 = true;
                        break;
                    }
                    ++n3;
                }
                if (n3 < 2 || n3 <= random.nextInt(bl2 ? 5 : 4)) {
                    bl = true;
                }
            } else if (xc_33.id_catch()) {
                bl = true;
            }
            if (bl && xg_3.id_break(rrEm_12, rfH_23, (rpr_3)null) && rrEm_12.id_finally(rfH_22.id_break(2))) {
                rrEm_12.id_class(rfH_22, this.id_final.id_class((rRq_1)rrEm_12, rfH_22), 2);
                this.id_class((rYB)rrEm_12, rfH_23, n);
            } else if (n < 4) {
                n3 = random.nextInt(4);
                if (bl2) {
                    ++n3;
                }
                n2 = 0;
                for (int i = 0; i < n3; ++i) {
                    rpr_3 rpr_32 = rpb_3.HORIZONTAL.id_class(random);
                    rfH_2 rfH_24 = rfH_22.id_break(rpr_32);
                    if (!rrEm_12.id_finally(rfH_24) || !rrEm_12.id_finally(rfH_24.id_break()) || !xg_3.id_break(rrEm_12, rfH_24, rpr_32.id_case())) continue;
                    this.id_class((rYB)rrEm_12, rfH_24, n + 1);
                    n2 = 1;
                }
                if (n2 != 0) {
                    rrEm_12.id_class(rfH_22, this.id_final.id_class((rRq_1)rrEm_12, rfH_22), 2);
                } else {
                    this.id_class(rrEm_12, rfH_22);
                }
            } else {
                this.id_class(rrEm_12, rfH_22);
            }
        }
    }

    private void id_class(rYB rYB2, rfH_2 rfH_22) {
        rYB2.id_class(rfH_22, (xc_3)this.id_continue().id_class(id_volatile, 5), 2);
        rYB2.id_byte(1034, rfH_22, 0);
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRR rRR2, rfH_2 rfH_22) {
        xc_3 xc_33 = rRR2.id_byte(rfH_22.id_break());
        if (xc_33.id_break() != this.id_final && !xc_33.id_class(xu_3.Sh)) {
            if (!xc_33.id_catch()) {
                return false;
            }
            boolean bl = false;
            for (rpr_3 rpr_32 : rpb_3.HORIZONTAL) {
                xc_3 xc_34 = rRR2.id_byte(rfH_22.id_break(rpr_32));
                if (xc_34.id_class(this.id_final)) {
                    if (bl) {
                        return false;
                    }
                    bl = true;
                    continue;
                }
                if (xc_34.id_catch()) continue;
                return false;
            }
            return bl;
        }
        return true;
    }

    private void id_class(rYB rYB2, rfH_2 rfH_22, int n) {
        rYB2.id_class(rfH_22, (xc_3)this.id_continue().id_class(id_volatile, n), 2);
        rYB2.id_byte(1033, rfH_22, 0);
    }

    @Override
    public void id_break(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 rfH_22, Random random) {
        if (!xc_32.id_class((rRR)rrEm_12, rfH_22)) {
            rrEm_12.id_break(rfH_22, true);
        }
    }

    private static boolean id_break(rRR rRR2, rfH_2 rfH_22, rpr_3 rpr_32) {
        for (rpr_3 rpr_33 : rpb_3.HORIZONTAL) {
            if (rpr_33 == rpr_32 || rRR2.id_finally(rfH_22.id_break(rpr_33))) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean a_(xc_3 xc_32) {
        return xc_32.id_byte(id_volatile) < 5;
    }
}

