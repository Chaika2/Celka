/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.eA_2;
import celestial.eY_2;
import celestial.ee_3;
import celestial.iB_2;
import celestial.rYB;
import celestial.rdO_2;
import celestial.rdS_2;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rhZ_2;
import celestial.rhd_3;
import celestial.rhm_3;
import celestial.rhx_3;
import celestial.rhz_3;
import celestial.rkB_2;
import celestial.rkc_3;
import celestial.rlB_2;
import celestial.rpm_3;
import celestial.rqL_2;
import celestial.rqn_3;
import celestial.rxb_3;
import celestial.rxm_3;
import celestial.rym_3;
import java.util.function.Predicate;

public class rxQ_2
extends rkB_2
implements ee_3,
rdS_2 {
    @Override
    public rkc_3 id_byte(rdn_3 rdn_32) {
        return rkc_3.BOW;
    }

    @Override
    public Predicate<rdn_3> id_byte() {
        return id_break;
    }

    public rxQ_2(rdO_2 rdO_22) {
        super(rdO_22);
    }

    @Override
    public String id_class(rhd_3 rhd_32, rdn_3 rdn_32) {
        if (rhd_32.id_implements()) {
            return "Inf";
        }
        int n = 0;
        for (int i = 0; i < 45; ++i) {
            rdn_3 rdn_33 = ((rhz_3)rhd_32.id_implements[1]).id_extends(i);
            if (!(rdn_33.id_break() instanceof rxb_3)) continue;
            n += rdn_33.id_char();
        }
        return "" + n;
    }

    @Override
    public rym_3<rdn_3> id_class(rYB rYB2, rhd_3 rhd_32, rpm_3 rpm_32) {
        boolean bl;
        rdn_3 rdn_32 = rhd_32.id_protected(rpm_32);
        boolean bl2 = bl = !rhd_32.id_case(rdn_32).id_class();
        if (!((rhx_3)rhd_32.id_implements[18]).id_protected && !bl) {
            return rym_3.id_protected(rdn_32);
        }
        rhd_32.id_break(rpm_32);
        return rym_3.id_break(rdn_32);
    }

    @Override
    public void id_class(rdn_3 rdn_32, rYB rYB2, iB_2 iB_22, int n) {
        if (iB_22 instanceof rhd_3) {
            rhd_3 rhd_32 = (rhd_3)iB_22;
            boolean bl = ((rhx_3)rhd_32.id_implements[18]).id_protected || eA_2.id_class(eY_2.id_try, rdn_32) > 0;
            rdn_3 rdn_33 = rhd_32.id_case(rdn_32);
            if (!rdn_33.id_class() || bl) {
                int n2;
                float f;
                if (rdn_33.id_class()) {
                    rdn_33 = new rdn_3(rdy_3.OO);
                }
                if (!((double)(f = rxQ_2.id_class(n2 = this.id_break(rdn_32) - n)) < 0.1)) {
                    boolean bl2;
                    boolean bl3 = bl2 = bl && rdn_33.id_break() == rdy_3.OO;
                    if (!rYB2.id_continue) {
                        int n3;
                        int n4;
                        rxb_3 rxb_32 = (rxb_3)(rdn_33.id_break() instanceof rxb_3 ? rdn_33.id_break() : rdy_3.OO);
                        rhm_3 rhm_32 = rxb_32.id_class(rYB2, rdn_33, (iB_2)rhd_32);
                        rhm_32.id_class(rhd_32, ((Float)rhd_32.id_throws[16]).floatValue(), ((Float)rhd_32.id_throws[15]).floatValue(), 0.0f, f * 3.0f, 1.0f);
                        if (f == 1.0f) {
                            rhm_32.id_class(true);
                        }
                        if ((n4 = eA_2.id_class(eY_2.id_public, rdn_32)) > 0) {
                            rhm_32.id_private(rhm_32.id_private() + (double)n4 * 0.5 + 0.5);
                        }
                        if ((n3 = eA_2.id_class(eY_2.id_goto, rdn_32)) > 0) {
                            rhm_32.id_class(n3);
                        }
                        if (eA_2.id_class(eY_2.id_while, rdn_32) > 0) {
                            rhm_32.id_case(100);
                        }
                        rdn_32.id_class(1, rhd_32, (T rhd_33) -> rhd_33.id_byte(rhd_32.P()));
                        if (bl2 || ((rhx_3)rhd_32.id_implements[18]).id_protected && (rdn_33.id_break() == rdy_3.kW || rdn_33.id_break() == rdy_3.kz)) {
                            rhm_32.id_protected = rhZ_2.CREATIVE_ONLY;
                        }
                        rYB2.a_(rhm_32);
                    }
                    rYB2.id_class(null, rhd_32.rx(), rhd_32.re(), rhd_32.BO(), rqn_3.s, rqL_2.PLAYERS, 1.0f, 1.0f / (id_private.nextFloat() * 0.4f + 1.2f) + f * 0.5f);
                    if (!bl2 && !((rhx_3)rhd_32.id_implements[18]).id_protected) {
                        rdn_33.id_catch(1);
                        if (rdn_33.id_class()) {
                            ((rhz_3)rhd_32.id_implements[1]).id_catch(rdn_33);
                        }
                    }
                    rhd_32.id_class(rlB_2.id_byte.id_break(this));
                }
            }
        }
    }

    public static float id_class(float f) {
        float f2 = f / 20.0f;
        if ((f2 = (f2 * f2 + f2 * 2.0f) / 3.0f) > 1.0f) {
            f2 = 1.0f;
        }
        return f2;
    }

    public static float id_class(int n) {
        return rxQ_2.id_class((float)n);
    }

    @Override
    public int id_break(rdn_3 rdn_32) {
        return 72000;
    }

    @Override
    public int id_throws() {
        return 15;
    }

    @Override
    public rdn_3 id_catch() {
        return rxm_3.id_class;
    }
}

