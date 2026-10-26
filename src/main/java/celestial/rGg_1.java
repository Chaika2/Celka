/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.aU_2;
import celestial.iG_2;
import celestial.iO_2;
import celestial.iQ_2;
import celestial.is_3;
import celestial.iz_3;
import celestial.rBA;
import celestial.rBI;
import celestial.rBc_1;
import celestial.rEB;
import celestial.rEi_1;
import celestial.rGK;
import celestial.rGR;
import celestial.rGY;
import celestial.rGo_1;
import celestial.rPY;
import celestial.rRf_1;
import celestial.rRh_1;
import celestial.rSb_1;
import celestial.rXQ;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rhd_3;
import celestial.rjU_2;
import celestial.rmE_2;
import celestial.rqA_2;
import celestial.rqn_3;
import celestial.rut_3;
import celestial.ruw_3;
import celestial.rye_3;
import java.util.Random;

public class rGg_1
extends rEi_1 {
    protected static final rut_3<Byte> id_class = rmE_2.id_class(rGg_1.class, ruw_3.id_class);
    public is_3 id_break;
    private rfH_2 id_protected;
    private boolean id_super;
    private int id_this;

    @Override
    protected rqA_2 id_byte(rye_3 rye_32) {
        return rqn_3.de;
    }

    public static /* synthetic */ rPY id_byte(rGg_1 rGg_12) {
        return rGg_12.id_native;
    }

    public rGg_1(aI_2<? extends rGg_1> aI_22, rYB rYB2) {
        super((aI_2<? extends rEi_1>)aI_22, rYB2);
        this.id_native = new rGo_1(this, this);
        this.id_finally = 3;
    }

    public void id_this(boolean bl) {
        this.id_class(1, bl);
    }

    @Override
    public void id_this() {
        Boolean bl = true;
        this.id_throws[38] = bl;
        super.id_this();
        Boolean bl2 = false;
        this.id_throws[38] = bl2;
        this.id_finally(true);
        if (this.id_super && --this.id_this <= 0) {
            this.id_this = 20;
            this.id_break(rye_3.id_implements, 1.0f);
        }
    }

    public static /* synthetic */ Random id_class(rGg_1 rGg_12) {
        return (Random)rGg_12.id_throws[40];
    }

    public void id_class(is_3 is_32) {
        this.id_break = is_32;
    }

    @Override
    protected void id_class(rRh_1 rRh_12) {
        this.id_class(rXQ.MAINHAND, new rdn_3(rdy_3.Oy));
        this.id_class(rXQ.MAINHAND, 0.0f);
    }

    private void id_class(int n, boolean bl) {
        int n2 = ((rmE_2)this.id_throws[49]).id_class(id_class).byteValue();
        n2 = bl ? (n2 |= n) : (n2 &= ~n);
        ((rmE_2)this.id_throws[49]).id_break(id_class, (byte)(n2 & 0xFF));
    }

    public void id_class(int n) {
        this.id_super = true;
        this.id_this = n;
    }

    @Override
    public aU_2 id_class(rRf_1 rRf_12, rRh_1 rRh_12, iO_2 iO_22, aU_2 aU_22, rcd_3 rcd_32) {
        this.id_class(rRh_12);
        this.id_break(rRh_12);
        return super.id_class(rRf_12, rRh_12, iO_22, aU_22, rcd_32);
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        if (this.id_protected != null) {
            rcd_32.id_break("BoundX", this.id_protected.b_());
            rcd_32.id_break("BoundY", this.id_protected.c_());
            rcd_32.id_break("BoundZ", this.id_protected.d_());
        }
        if (this.id_super) {
            rcd_32.id_break("LifeTicks", this.id_this);
        }
    }

    @Override
    public void id_class(iG_2 iG_22, rjU_2 rjU_22) {
        super.id_class(iG_22, rjU_22);
        this.Px();
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        super.id_break(rcd_32);
        if (rcd_32.id_throws("BoundX")) {
            this.id_protected = new rfH_2(rcd_32.id_private("BoundX"), rcd_32.id_private("BoundY"), rcd_32.id_private("BoundZ"));
        }
        if (rcd_32.id_throws("LifeTicks")) {
            this.id_class(rcd_32.id_private("LifeTicks"));
        }
    }

    public static /* synthetic */ rPY id_break(rGg_1 rGg_12) {
        return rGg_12.id_native;
    }

    private boolean id_break(int n) {
        byte by = ((rmE_2)this.id_throws[49]).id_class(id_class);
        return (by & n) != 0;
    }

    public static /* synthetic */ Random id_throws(rGg_1 rGg_12) {
        return (Random)rGg_12.id_throws[40];
    }

    public static iz_3 id_throws() {
        return rEi_1.sm().id_class(iQ_2.id_class, 14.0).id_class(iQ_2.id_case, 4.0);
    }

    public is_3 L() {
        return this.id_break;
    }

    public boolean sx() {
        return this.id_break(1);
    }

    public static /* synthetic */ Random id_catch(rGg_1 rGg_12) {
        return (Random)rGg_12.id_throws[40];
    }

    public static /* synthetic */ Random id_case(rGg_1 rGg_12) {
        return (Random)rGg_12.id_throws[40];
    }

    public void id_implements(rfH_2 rfH_22) {
        this.id_protected = rfH_22;
    }

    @Override
    protected rqA_2 id_static() {
        return rqn_3.dK;
    }

    public static /* synthetic */ Random id_protected(rGg_1 rGg_12) {
        return (Random)rGg_12.id_throws[40];
    }

    public static /* synthetic */ rPY id_private(rGg_1 rGg_12) {
        return rGg_12.id_native;
    }

    @Override
    protected void id_final() {
        super.id_final();
        this.id_package.id_class(0, new rSb_1(this));
        this.id_package.id_class(4, new rGR(this));
        this.id_package.id_class(8, new rGK(this));
        this.id_package.id_class(9, new rBA(this, rhd_3.class, 3.0f, 1.0f));
        this.id_package.id_class(10, new rBA(this, is_3.class, 8.0f));
        this.id_int.id_class(1, new rBc_1(this, rEB.class).id_class(new Class[0]));
        this.id_int.id_class(2, new rGY(this, this));
        this.id_int.id_class(3, new rBI<rhd_3>((is_3)this, rhd_3.class, true));
    }

    @Override
    public float rX() {
        return 1.0f;
    }

    @Override
    protected rqA_2 Bt() {
        return rqn_3.dU;
    }

    public rfH_2 sJ() {
        return this.id_protected;
    }

    @Override
    protected void m_() {
        super.m_();
        ((rmE_2)this.id_throws[49]).id_class(id_class, (byte)0);
    }
}

