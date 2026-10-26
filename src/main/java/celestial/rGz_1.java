/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.an_3;
import celestial.ap_3;
import celestial.iB_2;
import celestial.iG_2;
import celestial.iM_2;
import celestial.iQ_2;
import celestial.id_3;
import celestial.is_3;
import celestial.ix_3;
import celestial.iz_3;
import celestial.kD_2;
import celestial.ka_3;
import celestial.rBA;
import celestial.rBC;
import celestial.rBc_1;
import celestial.rEK;
import celestial.rGN;
import celestial.rGQ;
import celestial.rGc_1;
import celestial.rGm_1;
import celestial.rGu_1;
import celestial.rMu_1;
import celestial.rPf_1;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfl_3;
import celestial.rhd_3;
import celestial.rhm_3;
import celestial.rjU_2;
import celestial.rmE_2;
import celestial.rpr_3;
import celestial.rqA_2;
import celestial.rqL_2;
import celestial.rqZ_2;
import celestial.rqn_3;
import celestial.rut_3;
import celestial.ruw_3;
import celestial.rxL_2;
import celestial.rye_3;
import celestial.xc_3;
import celestial.xu_3;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;

public class rGz_1
extends rMu_1
implements rEK {
    private static final UUID id_this = UUID.fromString("7E0292F2-9434-48D5-A29F-9583AF7DF27F");
    private static final ix_3 id_else = new ix_3(id_this, "Covered armor bonus", 20.0, id_3.ADDITION);
    protected static final rut_3<rpr_3> id_class = rmE_2.id_class(rGz_1.class, ruw_3.id_final);
    protected static final rut_3<Optional<rfH_2>> id_break = rmE_2.id_class(rGz_1.class, ruw_3.id_volatile);
    protected static final rut_3<Byte> id_protected = rmE_2.id_class(rGz_1.class, ruw_3.id_class);
    protected static final rut_3<Byte> id_super = rmE_2.id_class(rGz_1.class, ruw_3.id_class);
    private float id_synchronized;
    private float id_return;
    private rfH_2 id_public = null;
    private int id_goto;

    @Override
    protected rqA_2 id_byte(rye_3 rye_32) {
        return this.sQ() ? rqn_3.JW : rqn_3.Jk;
    }

    public static /* synthetic */ Random id_byte(rGz_1 rGz_12) {
        return (Random)rGz_12.id_throws[40];
    }

    @Override
    public void id_byte(an_3 an_32) {
    }

    @Override
    public void id_long() {
        if (!this.sQ()) {
            super.id_long();
        }
    }

    public rGz_1(aI_2<? extends rGz_1> aI_22, rYB rYB2) {
        super((aI_2<? extends rMu_1>)aI_22, rYB2);
        this.id_finally = 5;
    }

    @Override
    public int S() {
        return 180;
    }

    @Override
    public void id_this() {
        float f;
        super.id_this();
        rfH_2 rfH_22 = ((rmE_2)this.id_throws[49]).id_class(id_break).orElse(null);
        if (rfH_22 == null && !((rYB)this.id_throws[7]).id_continue) {
            rfH_22 = this.Bs();
            ((rmE_2)this.id_throws[49]).id_break(id_break, Optional.of(rfH_22));
        }
        if (this.Pm()) {
            rfH_22 = null;
            f = ((Float)this.ra().id_throws[15]).floatValue();
            Float f2 = Float.valueOf(f);
            this.id_throws[15] = f2;
            Float f3 = Float.valueOf(f);
            this.id_private[23] = f3;
            Float f4 = Float.valueOf(f);
            this.id_private[24] = f4;
            this.id_goto = 0;
        } else if (!((rYB)this.id_throws[7]).id_continue) {
            rpr_3 rpr_32;
            xc_3 xc_32 = ((rYB)this.id_throws[7]).id_byte(rfH_22);
            if (!xc_32.id_catch()) {
                if (xc_32.id_class(xu_3.rc)) {
                    rpr_32 = xc_32.id_byte(kD_2.id_volatile);
                    if (((rYB)this.id_throws[7]).id_finally(rfH_22.id_break(rpr_32))) {
                        rfH_22 = rfH_22.id_break(rpr_32);
                        ((rmE_2)this.id_throws[49]).id_break(id_break, Optional.of(rfH_22));
                    } else {
                        this.L();
                    }
                } else if (xc_32.id_class(xu_3.rS)) {
                    rpr_32 = xc_32.id_byte(ka_3.id_volatile);
                    if (((rYB)this.id_throws[7]).id_finally(rfH_22.id_break(rpr_32))) {
                        rfH_22 = rfH_22.id_break(rpr_32);
                        ((rmE_2)this.id_throws[49]).id_break(id_break, Optional.of(rfH_22));
                    } else {
                        this.L();
                    }
                } else {
                    this.L();
                }
            }
            if (!this.id_class(rfH_22, rpr_32 = this.n())) {
                rpr_3 rpr_33 = this.id_implements(rfH_22);
                if (rpr_33 != null) {
                    ((rmE_2)this.id_throws[49]).id_break(id_class, rpr_33);
                } else {
                    this.L();
                }
            }
        }
        f = (float)this.sx() * 0.01f;
        this.id_synchronized = this.id_return;
        if (this.id_return > f) {
            this.id_return = rfU_2.id_class(this.id_return - 0.05f, f, 1.0f);
        } else if (this.id_return < f) {
            this.id_return = rfU_2.id_class(this.id_return + 0.05f, 0.0f, f);
        }
        if (rfH_22 != null) {
            List<an_3> list;
            if (((rYB)this.id_throws[7]).id_continue) {
                if (this.id_goto > 0 && this.id_public != null) {
                    --this.id_goto;
                } else {
                    this.id_public = rfH_22;
                }
            }
            this.id_native((double)rfH_22.b_() + 0.5, rfH_22.c_(), (double)rfH_22.d_() + 0.5);
            double d = 0.5 - (double)rfU_2.id_class((0.5f + this.id_return) * (float)Math.PI) * 0.5;
            double d2 = 0.5 - (double)rfU_2.id_class((0.5f + this.id_synchronized) * (float)Math.PI) * 0.5;
            rpr_3 rpr_34 = this.n().id_case();
            this.id_class(new rfl_3(this.rx() - 0.5, this.re(), this.BO() - 0.5, this.rx() + 0.5, this.re() + 1.0, this.BO() + 0.5).id_break((double)rpr_34.id_implements() * d, (double)rpr_34.id_finally() * d, (double)rpr_34.id_extends() * d));
            double d3 = d - d2;
            if (d3 > 0.0 && !(list = ((rYB)this.id_throws[7]).id_class((an_3)this, this.rN())).isEmpty()) {
                for (an_3 an_32 : list) {
                    if (an_32 instanceof rGz_1 || ((Boolean)an_32.id_throws[38]).booleanValue()) continue;
                    an_32.id_class(iG_2.SHULKER, new rjU_2(d3 * (double)rpr_34.id_implements(), d3 * (double)rpr_34.id_finally(), d3 * (double)rpr_34.id_extends()));
                }
            }
        }
    }

    public rpr_3 n() {
        return ((rmE_2)this.id_throws[49]).id_class(id_class);
    }

    @Override
    public float f() {
        return 0.0f;
    }

    @Override
    public void id_class(iG_2 iG_22, rjU_2 rjU_22) {
        if (iG_22 == iG_2.SHULKER_BOX) {
            this.L();
        } else {
            super.id_class(iG_22, rjU_22);
        }
    }

    public static /* synthetic */ Random id_class(rGz_1 rGz_12) {
        return (Random)rGz_12.id_throws[40];
    }

    private boolean id_class(rfH_2 rfH_22, rpr_3 rpr_32) {
        return ((rYB)this.id_throws[7]).id_class(rfH_22.id_break(rpr_32), (an_3)this, rpr_32.id_case()) && ((rYB)this.id_throws[7]).a_(this, rqZ_2.id_class(rfH_22, rpr_32.id_case()));
    }

    @Override
    public void id_class(rut_3<?> rut_32) {
        rfH_2 rfH_22;
        if (id_break.equals(rut_32) && ((rYB)this.id_throws[7]).id_continue && !this.Pm() && (rfH_22 = this.sJ()) != null) {
            if (this.id_public == null) {
                this.id_public = rfH_22;
            } else {
                this.id_goto = 6;
            }
            this.id_native((double)rfH_22.b_() + 0.5, rfH_22.c_(), (double)rfH_22.d_() + 0.5);
        }
        super.id_class(rut_32);
    }

    @Override
    public void id_class(double d, double d2, double d3, float f, float f2, int n, boolean bl) {
        Integer n2 = 0;
        this.id_private[45] = n2;
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_class("AttachFace", (byte)((rmE_2)this.id_throws[49]).id_class(id_class).id_byte());
        rcd_32.id_class("Peek", ((rmE_2)this.id_throws[49]).id_class(id_protected));
        rcd_32.id_class("Color", ((rmE_2)this.id_throws[49]).id_class(id_super));
        rfH_2 rfH_22 = this.sJ();
        if (rfH_22 != null) {
            rcd_32.id_break("APX", rfH_22.b_());
            rcd_32.id_break("APY", rfH_22.c_());
            rcd_32.id_break("APZ", rfH_22.d_());
        }
    }

    public void id_class(int n) {
        if (!((rYB)this.id_throws[7]).id_continue) {
            this.id_byte(iQ_2.id_implements).id_protected(id_else);
            if (n == 0) {
                this.id_byte(iQ_2.id_implements).id_byte(id_else);
                this.id_class(rqn_3.Jx, 1.0f, 1.0f);
            } else {
                this.id_class(rqn_3.Jz, 1.0f, 1.0f);
            }
        }
        ((rmE_2)this.id_throws[49]).id_break(id_protected, (byte)n);
    }

    @Override
    public void id_default() {
        super.id_default();
        this.id_byte(rjU_2.id_class);
        if (!this.c()) {
            Float f = Float.valueOf(0.0f);
            this.id_private[24] = f;
            Float f2 = Float.valueOf(0.0f);
            this.id_private[23] = f2;
        }
    }

    public int sd() {
        return this.id_goto;
    }

    @Override
    public int r() {
        return 180;
    }

    @Override
    protected float id_break(iM_2 iM_22, ap_3 ap_32) {
        return 0.5f;
    }

    @Override
    public boolean id_break(rye_3 rye_32, float f) {
        an_3 an_32;
        if (this.sQ() && (an_32 = rye_32.id_finally()) instanceof rhm_3) {
            return false;
        }
        if (super.id_break(rye_32, f)) {
            if ((double)this.Ss() < (double)this.SK() * 0.5 && ((Random)this.id_throws[40]).nextInt(4) == 0) {
                this.L();
            }
            return true;
        }
        return false;
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        super.id_break(rcd_32);
        ((rmE_2)this.id_throws[49]).id_break(id_class, rpr_3.id_class(rcd_32.id_case("AttachFace")));
        ((rmE_2)this.id_throws[49]).id_break(id_protected, rcd_32.id_case("Peek"));
        ((rmE_2)this.id_throws[49]).id_break(id_super, rcd_32.id_case("Color"));
        if (rcd_32.id_throws("APX")) {
            int n = rcd_32.id_private("APX");
            int n2 = rcd_32.id_private("APY");
            int n3 = rcd_32.id_private("APZ");
            ((rmE_2)this.id_throws[49]).id_break(id_break, Optional.of(new rfH_2(n, n2, n3)));
        } else {
            ((rmE_2)this.id_throws[49]).id_break(id_break, Optional.empty());
        }
    }

    public static /* synthetic */ Random id_break(rGz_1 rGz_12) {
        return (Random)rGz_12.id_throws[40];
    }

    public static /* synthetic */ Random id_throws(rGz_1 rGz_12) {
        return (Random)rGz_12.id_throws[40];
    }

    public static iz_3 id_throws() {
        return is_3.id_package().id_class(iQ_2.id_class, 30.0);
    }

    protected boolean L() {
        if (!this.c() && this.BM()) {
            rfH_2 rfH_22 = this.Bs();
            for (int i = 0; i < 5; ++i) {
                rpr_3 rpr_32;
                rfH_2 rfH_23 = rfH_22.id_break(8 - ((Random)this.id_throws[40]).nextInt(17), 8 - ((Random)this.id_throws[40]).nextInt(17), 8 - ((Random)this.id_throws[40]).nextInt(17));
                if (rfH_23.c_() <= 0 || !((rYB)this.id_throws[7]).id_finally(rfH_23) || !((rYB)this.id_throws[7]).id_instanceof().id_class(rfH_23) || !((rYB)this.id_throws[7]).a_(this, new rfl_3(rfH_23)) || (rpr_32 = this.id_implements(rfH_23)) == null) continue;
                ((rmE_2)this.id_throws[49]).id_break(id_class, rpr_32);
                this.id_class(rqn_3.JN, 1.0f, 1.0f);
                ((rmE_2)this.id_throws[49]).id_break(id_break, Optional.of(rfH_23));
                ((rmE_2)this.id_throws[49]).id_break(id_protected, (byte)0);
                this.id_byte((iB_2)null);
                return true;
            }
            return false;
        }
        return true;
    }

    public int sx() {
        return ((rmE_2)this.id_throws[49]).id_class(id_protected).byteValue();
    }

    public rfH_2 sk() {
        return this.id_public;
    }

    public void id_finally(rfH_2 rfH_22) {
        ((rmE_2)this.id_throws[49]).id_break(id_break, Optional.ofNullable(rfH_22));
    }

    protected rpr_3 id_implements(rfH_2 rfH_22) {
        for (rpr_3 rpr_32 : rpr_3.values()) {
            if (!this.id_class(rfH_22, rpr_32)) continue;
            return rpr_32;
        }
        return null;
    }

    @Override
    protected rPf_1 id_new() {
        return new rGc_1(this, this);
    }

    @Override
    public void id_new(double d, double d2, double d3) {
        super.id_new(d, d2, d3);
        if ((rmE_2)this.id_throws[49] != null && (Integer)this.id_throws[41] != 0) {
            Optional<rfH_2> optional = ((rmE_2)this.id_throws[49]).id_class(id_break);
            Optional<rfH_2> optional2 = Optional.of(new rfH_2(d, d2, d3));
            if (!optional2.equals(optional)) {
                ((rmE_2)this.id_throws[49]).id_break(id_break, optional2);
                ((rmE_2)this.id_throws[49]).id_break(id_protected, (byte)0);
                Boolean bl = true;
                this.id_throws[57] = bl;
            }
        }
    }

    public float id_throw(float f) {
        return rfU_2.id_catch(f, this.id_synchronized, this.id_return);
    }

    @Override
    protected rqA_2 id_static() {
        return rqn_3.JM;
    }

    public static /* synthetic */ Random id_protected(rGz_1 rGz_12) {
        return (Random)rGz_12.id_throws[40];
    }

    @Override
    protected void id_final() {
        this.id_package.id_class(1, new rBA(this, rhd_3.class, 8.0f));
        this.id_package.id_class(4, new rGQ(this));
        this.id_package.id_class(7, new rGm_1(this));
        this.id_package.id_class(8, new rBC(this));
        this.id_int.id_class(1, new rBc_1(this, new Class[0]).id_class(new Class[0]));
        this.id_int.id_class(2, new rGN(this, this));
        this.id_int.id_class(3, new rGu_1(this));
    }

    public rxL_2 sz() {
        Byte by = ((rmE_2)this.id_throws[49]).id_class(id_super);
        return by != 16 && by <= 15 ? rxL_2.id_class(by.byteValue()) : null;
    }

    @Override
    public rqL_2 Pr() {
        return rqL_2.HOSTILE;
    }

    @Override
    public boolean PU() {
        return this.BM();
    }

    @Override
    protected boolean PK() {
        return false;
    }

    @Override
    protected rqA_2 Bt() {
        return rqn_3.Jd;
    }

    public rfH_2 sJ() {
        return ((rmE_2)this.id_throws[49]).id_class(id_break).orElse(null);
    }

    public boolean sW() {
        return this.id_public != null && this.sJ() != null;
    }

    private boolean sQ() {
        return this.sx() == 0;
    }

    @Override
    protected void m_() {
        super.m_();
        ((rmE_2)this.id_throws[49]).id_class(id_class, rpr_3.DOWN);
        ((rmE_2)this.id_throws[49]).id_class(id_break, Optional.empty());
        ((rmE_2)this.id_throws[49]).id_class(id_protected, (byte)0);
        ((rmE_2)this.id_throws[49]).id_class(id_super, (byte)16);
    }
}

