/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.aL_2;
import celestial.ap_3;
import celestial.iB_2;
import celestial.iM_2;
import celestial.is_3;
import celestial.rLD;
import celestial.rLY;
import celestial.rOj_1;
import celestial.rOp_1;
import celestial.rYB;
import celestial.rZY;
import celestial.rcd_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rhN_2;
import celestial.rhd_3;
import celestial.rmE_2;
import celestial.rqA_2;
import celestial.rqn_3;
import celestial.rut_3;
import celestial.ruw_3;
import celestial.rye_3;
import java.util.function.Predicate;

public class rOf_1
extends rOp_1 {
    private static final rut_3<Integer> id_class = rmE_2.id_class(rOf_1.class, ruw_3.id_break);
    public int id_break;
    public int id_protected;
    public static final Predicate<iB_2> id_super = iB_22 -> {
        if (iB_22 == null) {
            return false;
        }
        if (!(iB_22 instanceof rhd_3) || !iB_22.id_native() && !((rhd_3)iB_22).id_implements()) {
            return iB_22.sG() != aL_2.id_throws;
        }
        return false;
    };

    @Override
    protected rqA_2 id_byte(rye_3 rye_32) {
        return rqn_3.XP;
    }

    public rOf_1(aI_2<? extends rOf_1> aI_22, rYB rYB2) {
        super((aI_2<? extends rOp_1>)aI_22, rYB2);
    }

    @Override
    public void id_this() {
        if (!((rYB)this.id_throws[7]).id_continue && this.BM() && this.id_try()) {
            if (this.id_break > 0) {
                if (this.sx() == 0) {
                    this.id_class(rqn_3.ha, this.Si(), this.SN());
                    this.id_break(1);
                } else if (this.id_break > 40 && this.sx() == 1) {
                    this.id_class(rqn_3.ha, this.Si(), this.SN());
                    this.id_break(2);
                }
                ++this.id_break;
            } else if (this.sx() != 0) {
                if (this.id_protected > 60 && this.sx() == 2) {
                    this.id_class(rqn_3.he, this.Si(), this.SN());
                    this.id_break(1);
                } else if (this.id_protected > 100 && this.sx() == 1) {
                    this.id_class(rqn_3.he, this.Si(), this.SN());
                    this.id_break(0);
                }
                ++this.id_protected;
            }
        }
        super.id_this();
    }

    private static float id_this(int n) {
        switch (n) {
            case 0: {
                return 0.5f;
            }
            case 1: {
                return 0.7f;
            }
        }
        return 1.0f;
    }

    private void id_class(is_3 is_32) {
        int n = this.sx();
        if (is_32.id_break(rye_3.id_byte(this), (float)(1 + n))) {
            is_32.id_break(new rLY(rLD.id_super, 60 * n, 0));
            this.id_class(rqn_3.XB, 1.0f, 1.0f);
        }
    }

    @Override
    public void id_class(rut_3<?> rut_32) {
        if (id_class.equals(rut_32)) {
            this.q_();
        }
        super.id_class(rut_32);
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_break("PuffState", this.sx());
    }

    @Override
    public void id_default() {
        super.id_default();
        if (this.BM() && this.sx() > 0) {
            for (is_3 is_32 : ((rYB)this.id_throws[7]).id_class(is_3.class, this.rN().id_class(0.3), id_super)) {
                if (!is_32.BM()) continue;
                this.id_class(is_32);
            }
        }
    }

    public void id_break(int n) {
        ((rmE_2)this.id_throws[49]).id_break(id_class, n);
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        super.id_break(rcd_32);
        this.id_break(rcd_32.id_private("PuffState"));
    }

    @Override
    protected rdn_3 L() {
        return new rdn_3(rdy_3.Xr);
    }

    public int sx() {
        return ((rmE_2)this.id_throws[49]).id_class(id_class);
    }

    @Override
    protected rqA_2 id_static() {
        return rqn_3.hU;
    }

    @Override
    protected void id_final() {
        super.id_final();
        this.id_package.id_class(1, new rOj_1(this));
    }

    @Override
    protected rqA_2 Bt() {
        return rqn_3.hi;
    }

    @Override
    protected rqA_2 sJ() {
        return rqn_3.Xr;
    }

    @Override
    public ap_3 a_(iM_2 iM_22) {
        return super.a_(iM_22).id_class(rOf_1.id_this(this.sx()));
    }

    @Override
    protected void m_() {
        super.m_();
        ((rmE_2)this.id_throws[49]).id_class(id_class, 0);
    }

    @Override
    public void c_(rhd_3 rhd_32) {
        int n = this.sx();
        if (rhd_32 instanceof rhN_2 && n > 0 && rhd_32.id_break(rye_3.id_byte(this), (float)(1 + n))) {
            if (!this.BF()) {
                ((rhN_2)rhd_32).id_class.id_class(new rZY(rZY.id_finally, 0.0f));
            }
            rhd_32.id_break(new rLY(rLD.id_super, 60 * n, 0));
        }
    }
}

