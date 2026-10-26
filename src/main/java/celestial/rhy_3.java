/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.ai_3;
import celestial.an_3;
import celestial.iB_2;
import celestial.iG_2;
import celestial.rFJ;
import celestial.rLQ;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rcy_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rff_3;
import celestial.rfo_3;
import celestial.rhd_3;
import celestial.rhf_3;
import celestial.rhj_3;
import celestial.rjB_2;
import celestial.rjG_2;
import celestial.rjM_2;
import celestial.rjS_2;
import celestial.rjU_2;
import celestial.rjs_3;
import celestial.rmE_2;
import celestial.rqL_2;
import celestial.rqn_3;
import celestial.rrLJ;
import celestial.rrQX;
import celestial.ruS_2;
import celestial.rut_3;
import celestial.ruw_3;
import celestial.rye_3;
import java.util.OptionalInt;
import java.util.Random;

public class rhy_3
extends rhf_3
implements ai_3 {
    private static final rut_3<rdn_3> id_class = rmE_2.id_class(rhy_3.class, ruw_3.id_catch);
    private static final rut_3<OptionalInt> id_break = rmE_2.id_class(rhy_3.class, ruw_3.id_continue);
    private static final rut_3<Boolean> id_protected = rmE_2.id_class(rhy_3.class, ruw_3.id_implements);
    private int id_catch;
    private int id_private;
    private iB_2 id_implements;

    public rhy_3(rYB rYB2, rdn_3 rdn_32, an_3 an_32, double d, double d2, double d3, boolean bl) {
        this(rYB2, rdn_32, d, d2, d3, bl);
        this.id_break(an_32);
    }

    public rhy_3(rYB rYB2, rdn_3 rdn_32, double d, double d2, double d3, boolean bl) {
        this(rYB2, d, d2, d3, rdn_32);
        ((rmE_2)this.id_throws[49]).id_break(id_protected, bl);
    }

    public rhy_3(rYB rYB2, rdn_3 rdn_32, iB_2 iB_22) {
        this(rYB2, iB_22, iB_22.rx(), iB_22.re(), iB_22.BO(), rdn_32);
        ((rmE_2)this.id_throws[49]).id_break(id_break, OptionalInt.of(iB_22.V()));
        this.id_implements = iB_22;
    }

    public rhy_3(aI_2<? extends rhy_3> aI_22, rYB rYB2) {
        super((aI_2<? extends rhf_3>)aI_22, rYB2);
    }

    public rhy_3(rYB rYB2, double d, double d2, double d3, rdn_3 rdn_32) {
        super((aI_2<? extends rhf_3>)aI_2.id_instanceof, rYB2);
        this.id_catch = 0;
        this.id_new(d, d2, d3);
        int n = 1;
        if (!rdn_32.id_class() && rdn_32.id_final()) {
            ((rmE_2)this.id_throws[49]).id_break(id_class, rdn_32.id_implements());
            n += rdn_32.id_class("Fireworks").id_case("Flight");
        }
        this.id_catch(((Random)this.id_throws[40]).nextGaussian() * 0.001, 0.05, ((Random)this.id_throws[40]).nextGaussian() * 0.001);
        this.id_private = 10 * n + ((Random)this.id_throws[40]).nextInt(6) + ((Random)this.id_throws[40]).nextInt(7);
    }

    public rhy_3(rYB rYB2, an_3 an_32, double d, double d2, double d3, rdn_3 rdn_32) {
        this(rYB2, d, d2, d3, rdn_32);
        this.id_break(an_32);
    }

    @Override
    public void id_this() {
        Object object;
        super.id_this();
        if (this.id_private()) {
            if (this.id_implements == null) {
                ((rmE_2)this.id_throws[49]).id_class(id_break).ifPresent(n -> {
                    an_3 an_32 = ((rYB)this.id_throws[7]).id_break(n);
                    if (an_32 instanceof iB_2) {
                        this.id_implements = (iB_2)an_32;
                    }
                });
            }
            if (this.id_implements != null) {
                if (this.id_implements.Sy()) {
                    object = this.id_implements.m();
                    rjU_2 rjU_22 = this.id_implements.rv();
                    rrLJ rrLJ2 = rrLJ.id_class(this.id_implements, 1.5, 1.5, 1.5);
                    ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrLJ2);
                    if (!rrLJ2.id_byte()) {
                        double d = rrLJ2.id_protected();
                        double d2 = rrLJ2.id_break();
                        double d3 = rrLJ2.id_throws();
                        this.id_implements.id_byte(rjU_22.id_break(((rjU_2)object).id_break * 0.1 + (((rjU_2)object).id_break * d - rjU_22.id_break) * 0.5, ((rjU_2)object).id_byte * 0.1 + (((rjU_2)object).id_byte * d2 - rjU_22.id_byte) * 0.5, ((rjU_2)object).id_protected * 0.1 + (((rjU_2)object).id_protected * d3 - rjU_22.id_protected) * 0.5));
                    }
                }
                this.id_new(this.id_implements.rx(), this.id_implements.re(), this.id_implements.BO());
                this.id_byte(this.id_implements.rv());
            }
        } else {
            if (!this.id_protected()) {
                double d = (Boolean)this.id_throws[23] != false ? 1.0 : 1.15;
                this.id_byte(this.rv().id_throws(d, 1.0, d).id_break(0.0, 0.04, 0.0));
            }
            object = this.rv();
            this.id_class(iG_2.SELF, (rjU_2)object);
            this.id_byte((rjU_2)object);
        }
        object = rhj_3.id_class((an_3)this, this::id_class);
        if (!((Boolean)this.id_throws[38]).booleanValue()) {
            this.id_class((rjG_2)object);
            Boolean bl = true;
            this.id_throws[57] = bl;
        }
        this.id_return();
        if (this.id_catch == 0 && !this.BF()) {
            ((rYB)this.id_throws[7]).id_class((rhd_3)null, this.rx(), this.re(), this.BO(), rqn_3.Sh, rqL_2.AMBIENT, 3.0f, 1.0f);
        }
        ++this.id_catch;
        if (((rYB)this.id_throws[7]).id_continue && this.id_catch % 2 < 2) {
            ((rYB)this.id_throws[7]).id_class(rLQ.id_goto, this.rx(), this.re() - 0.3, this.BO(), ((Random)this.id_throws[40]).nextGaussian() * 0.05, -this.rv().id_byte * 0.5, ((Random)this.id_throws[40]).nextGaussian() * 0.05);
        }
        if (!((rYB)this.id_throws[7]).id_continue && this.id_catch > this.id_private) {
            this.id_throws();
        }
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_break("Life", this.id_catch);
        rcd_32.id_break("LifeTime", this.id_private);
        rdn_3 rdn_32 = ((rmE_2)this.id_throws[49]).id_class(id_class);
        if (!rdn_32.id_class()) {
            rcd_32.id_class("FireworksItem", rdn_32.id_break(new rcd_3()));
        }
        rcd_32.id_class("ShotAtAngle", ((rmE_2)this.id_throws[49]).id_class(id_protected));
    }

    @Override
    protected void id_class(rff_3 rff_32) {
        rfH_2 rfH_22 = new rfH_2(rff_32.id_class());
        ((rYB)this.id_throws[7]).id_byte(rfH_22).id_class((rYB)this.id_throws[7], rfH_22, (an_3)this);
        if (!((rYB)this.id_throws[7]).id_import() && this.id_case()) {
            this.id_throws();
        }
        super.id_class(rff_32);
    }

    @Override
    public void id_class(byte by) {
        if (by == 17 && ((rYB)this.id_throws[7]).id_continue) {
            if (!this.id_case()) {
                for (int i = 0; i < ((Random)this.id_throws[40]).nextInt(3) + 2; ++i) {
                    ((rYB)this.id_throws[7]).id_class(rLQ.id_boolean, this.rx(), this.re(), this.BO(), ((Random)this.id_throws[40]).nextGaussian() * 0.05, 0.005, ((Random)this.id_throws[40]).nextGaussian() * 0.05);
                }
            } else {
                rdn_3 rdn_32 = ((rmE_2)this.id_throws[49]).id_class(id_class);
                rcd_3 rcd_32 = rdn_32.id_class() ? null : rdn_32.id_break("Fireworks");
                rjU_2 rjU_22 = this.rv();
                ((rYB)this.id_throws[7]).id_class(this.rx(), this.re(), this.BO(), rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected, rcd_32);
            }
        }
        super.id_class(by);
    }

    @Override
    public rdn_3 id_class() {
        rdn_3 rdn_32 = ((rmE_2)this.id_throws[49]).id_class(id_class);
        return rdn_32.id_class() ? new rdn_3(rdy_3.dc) : rdn_32;
    }

    @Override
    protected void id_class(rfo_3 rfo_32) {
        super.id_class(rfo_32);
        if (!((rYB)this.id_throws[7]).id_continue) {
            this.id_throws();
        }
    }

    @Override
    public boolean id_class(double d) {
        return d < 4096.0 && !this.id_private();
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        super.id_break(rcd_32);
        this.id_catch = rcd_32.id_private("Life");
        this.id_private = rcd_32.id_private("LifeTime");
        rdn_3 rdn_32 = rdn_3.id_class(rcd_32.id_int("FireworksItem"));
        if (!rdn_32.id_class()) {
            ((rmE_2)this.id_throws[49]).id_break(id_class, rdn_32);
        }
        if (rcd_32.id_throws("ShotAtAngle")) {
            ((rmE_2)this.id_throws[49]).id_break(id_protected, rcd_32.id_new("ShotAtAngle"));
        }
    }

    private void id_throws() {
        ((rYB)this.id_throws[7]).id_class((an_3)this, (byte)17);
        this.id_catch();
        this.PD();
    }

    @Override
    public boolean rt() {
        return false;
    }

    private void id_catch() {
        rcy_3 rcy_32;
        float f = 0.0f;
        rdn_3 rdn_32 = ((rmE_2)this.id_throws[49]).id_class(id_class);
        rcd_3 rcd_32 = rdn_32.id_class() ? null : rdn_32.id_break("Fireworks");
        rcy_3 rcy_33 = rcy_32 = rcd_32 != null ? rcd_32.id_protected("Explosions", 10) : null;
        if (rcy_32 != null && !rcy_32.isEmpty()) {
            f = 5.0f + (float)(rcy_32.size() * 2);
        }
        if (f > 0.0f) {
            if (this.id_implements != null) {
                this.id_implements.id_break(rye_3.id_class(this, this.id_else()), 5.0f + (float)(rcy_32.size() * 2));
            }
            double d = 5.0;
            rjU_2 rjU_22 = this.Ps();
            for (iB_2 iB_22 : ((rYB)this.id_throws[7]).id_class(iB_2.class, this.rN().id_class(5.0))) {
                if (iB_22 == this.id_implements || this.id_int(iB_22) > 25.0) continue;
                boolean bl = false;
                for (int i = 0; i < 2; ++i) {
                    rjU_2 rjU_23 = new rjU_2(iB_22.rx(), iB_22.id_byte(0.5 * (double)i), iB_22.BO());
                    rff_3 rff_32 = ((rYB)this.id_throws[7]).id_class(new rjB_2(rjU_22, rjU_23, rjS_2.COLLIDER, rjs_3.NONE, this));
                    if (((rjG_2)rff_32).id_byte() != rjM_2.MISS) continue;
                    bl = true;
                    break;
                }
                if (!bl) continue;
                float f2 = f * (float)Math.sqrt((5.0 - (double)this.id_implements(iB_22)) / 5.0);
                iB_22.id_break(rye_3.id_class(this, this.id_else()), f2);
            }
        }
    }

    private boolean id_case() {
        rdn_3 rdn_32 = ((rmE_2)this.id_throws[49]).id_class(id_class);
        rcd_3 rcd_32 = rdn_32.id_class() ? null : rdn_32.id_break("Fireworks");
        rcy_3 rcy_32 = rcd_32 != null ? rcd_32.id_protected("Explosions", 10) : null;
        return rcy_32 != null && !rcy_32.isEmpty();
    }

    public boolean id_protected() {
        return ((rmE_2)this.id_throws[49]).id_class(id_protected);
    }

    private boolean id_private() {
        return ((rmE_2)this.id_throws[49]).id_class(id_break).isPresent();
    }

    @Override
    public boolean id_final(double d, double d2, double d3) {
        return super.id_final(d, d2, d3) && !this.id_private();
    }

    @Override
    protected void m_() {
        ((rmE_2)this.id_throws[49]).id_class(id_class, rdn_3.id_break);
        ((rmE_2)this.id_throws[49]).id_class(id_break, OptionalInt.empty());
        ((rmE_2)this.id_throws[49]).id_class(id_protected, false);
    }

    @Override
    public ruS_2<?> p_() {
        return new rFJ(this);
    }
}

