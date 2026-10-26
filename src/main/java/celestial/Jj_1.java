/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.WB;
import celestial.Wa_1;
import celestial.an_3;
import celestial.dt_3;
import celestial.rLQ;
import celestial.rRR;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rfw_3;
import celestial.rhd_3;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rpB_2;
import celestial.rpb_3;
import celestial.rpr_3;
import celestial.rqL_2;
import celestial.rqn_3;
import celestial.rxx_3;
import celestial.rye_3;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import java.util.Optional;
import java.util.Random;

public abstract class Jj_1
extends xd_3 {
    private final float id_final;
    protected static final rjC_2 id_volatile = xd_3.id_class(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);

    public Jj_1(Jq_1 jq_1, float f) {
        super(jq_1);
        this.id_final = f;
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xc_3 xc_33, boolean bl) {
        if (!xc_33.id_class(xc_32.id_break())) {
            Optional<WB> optional;
            if (Jj_1.id_class(rYB2) && (optional = WB.id_class(rYB2, rfH_22, rpB_2.X)).isPresent()) {
                optional.get().id_break();
                return;
            }
            if (!xc_32.id_class((rRR)rYB2, rfH_22)) {
                rYB2.id_class(rfH_22, false);
            }
        }
    }

    private static boolean id_class(rYB rYB2) {
        return rYB2.E() == rYB.id_byte || rYB2.E() == rYB.id_protected;
    }

    @Override
    public void id_class(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32, rhd_3 rhd_32) {
        if (!rYB2.id_import()) {
            rYB2.id_class((rhd_3)null, 1009, rfH_22, 0);
        }
    }

    public static boolean id_class(rYB rYB2, rfH_2 rfH_22, rpr_3 rpr_32) {
        xc_3 xc_32 = rYB2.id_byte(rfH_22);
        if (!xc_32.id_catch()) {
            return false;
        }
        return Jj_1.id_class(rYB2, rfH_22).id_class((rRR)rYB2, rfH_22) || Jj_1.id_break(rYB2, rfH_22, rpr_32);
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, an_3 an_32) {
        if (!an_32.q()) {
            an_32.id_protected(an_32.ru() + 1);
            if (an_32.ru() == 0) {
                an_32.id_case(8);
            }
            an_32.id_break(rye_3.id_class, this.id_final);
        }
        super.id_class(xc_32, rYB2, rfH_22, an_32);
    }

    public static xc_3 id_class(rRq_1 rRq_12, rfH_2 rfH_22) {
        rfH_2 rfH_23 = rfH_22.id_break();
        xc_3 xc_32 = rRq_12.id_byte(rfH_23);
        return Wa_1.id_class(xc_32.id_break()) ? xu_3.rK.id_continue() : ((dt_3)xu_3.ro).id_break(rRq_12, rfH_22);
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return id_volatile;
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, Random random) {
        block12: {
            block11: {
                double d;
                double d2;
                double d3;
                int n;
                rfH_2 rfH_23;
                xc_3 xc_33;
                if (random.nextInt(24) == 0) {
                    rYB2.id_class((double)rfH_22.b_() + 0.5, (double)rfH_22.c_() + 0.5, (double)rfH_22.d_() + 0.5, rqn_3.Sd, rqL_2.BLOCKS, 1.0f + random.nextFloat(), random.nextFloat() * 0.7f + 0.3f, false);
                }
                if (this.id_catch(xc_33 = rYB2.id_byte(rfH_23 = rfH_22.id_break())) || xc_33.id_protected(rYB2, rfH_23, rpr_3.UP)) break block11;
                if (this.id_catch(rYB2.id_byte(rfH_22.id_byte()))) {
                    for (n = 0; n < 2; ++n) {
                        d3 = (double)rfH_22.b_() + random.nextDouble() * (double)0.1f;
                        d2 = (double)rfH_22.c_() + random.nextDouble();
                        d = (double)rfH_22.d_() + random.nextDouble();
                        rYB2.id_class(rLQ.id_short, d3, d2, d, 0.0, 0.0, 0.0);
                    }
                }
                if (this.id_catch(rYB2.id_byte(rfH_22.id_extends()))) {
                    for (n = 0; n < 2; ++n) {
                        d3 = (double)(rfH_22.b_() + 1) - random.nextDouble() * (double)0.1f;
                        d2 = (double)rfH_22.c_() + random.nextDouble();
                        d = (double)rfH_22.d_() + random.nextDouble();
                        rYB2.id_class(rLQ.id_short, d3, d2, d, 0.0, 0.0, 0.0);
                    }
                }
                if (this.id_catch(rYB2.id_byte(rfH_22.id_private()))) {
                    for (n = 0; n < 2; ++n) {
                        d3 = (double)rfH_22.b_() + random.nextDouble();
                        d2 = (double)rfH_22.c_() + random.nextDouble();
                        d = (double)rfH_22.d_() + random.nextDouble() * (double)0.1f;
                        rYB2.id_class(rLQ.id_short, d3, d2, d, 0.0, 0.0, 0.0);
                    }
                }
                if (this.id_catch(rYB2.id_byte(rfH_22.id_protected()))) {
                    for (n = 0; n < 2; ++n) {
                        d3 = (double)rfH_22.b_() + random.nextDouble();
                        d2 = (double)rfH_22.c_() + random.nextDouble();
                        d = (double)(rfH_22.d_() + 1) - random.nextDouble() * (double)0.1f;
                        rYB2.id_class(rLQ.id_short, d3, d2, d, 0.0, 0.0, 0.0);
                    }
                }
                if (!this.id_catch(rYB2.id_byte(rfH_22.id_final()))) break block12;
                for (n = 0; n < 2; ++n) {
                    d3 = (double)rfH_22.b_() + random.nextDouble();
                    d2 = (double)(rfH_22.c_() + 1) - random.nextDouble() * (double)0.1f;
                    d = (double)rfH_22.d_() + random.nextDouble();
                    rYB2.id_class(rLQ.id_short, d3, d2, d, 0.0, 0.0, 0.0);
                }
                break block12;
            }
            for (int i = 0; i < 3; ++i) {
                double d = (double)rfH_22.b_() + random.nextDouble();
                double d4 = (double)rfH_22.c_() + random.nextDouble() * 0.5 + 0.5;
                double d5 = (double)rfH_22.d_() + random.nextDouble();
                rYB2.id_class(rLQ.id_short, d, d4, d5, 0.0, 0.0, 0.0);
            }
        }
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        return Jj_1.id_class(rxx_32.id_int(), rxx_32.id_class());
    }

    private static boolean id_break(rYB rYB2, rfH_2 rfH_22, rpr_3 rpr_32) {
        if (!Jj_1.id_class(rYB2)) {
            return false;
        }
        rfw_3 rfw_32 = rfH_22.id_new();
        boolean bl = false;
        for (rpr_3 rpr_33 : rpr_3.values()) {
            if (!rYB2.id_byte(rfw_32.id_class(rfH_22).id_class(rpr_33)).id_class(xu_3.rg)) continue;
            bl = true;
            break;
        }
        if (!bl) {
            return false;
        }
        rpB_2 rpB_22 = rpr_32.id_final().id_protected() ? rpr_32.id_private().id_final() : rpb_3.HORIZONTAL.id_break(rYB2.id_int);
        return WB.id_class(rYB2, rfH_22, rpB_22).isPresent();
    }

    protected abstract boolean id_catch(xc_3 var1);
}

