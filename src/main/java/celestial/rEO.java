/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aA_2;
import celestial.aI_2;
import celestial.iB_2;
import celestial.iQ_2;
import celestial.is_3;
import celestial.iz_3;
import celestial.rBA;
import celestial.rBC;
import celestial.rBI;
import celestial.rBT;
import celestial.rBc_1;
import celestial.rEh_1;
import celestial.rEi_1;
import celestial.rLQ;
import celestial.rLp_1;
import celestial.rSk_1;
import celestial.rYB;
import celestial.rhd_3;
import celestial.rjU_2;
import celestial.rmE_2;
import celestial.rqA_2;
import celestial.rqn_3;
import celestial.rut_3;
import celestial.ruw_3;
import celestial.rye_3;
import java.util.Random;

public class rEO
extends rEi_1 {
    private float id_class = 0.5f;
    private int id_break;
    private static final rut_3<Byte> id_protected = rmE_2.id_class(rEO.class, ruw_3.id_class);

    @Override
    protected rqA_2 id_byte(rye_3 rye_32) {
        return rqn_3.K;
    }

    @Override
    protected void id_double() {
        iB_2 iB_22;
        --this.id_break;
        if (this.id_break <= 0) {
            this.id_break = 100;
            this.id_class = 0.5f + (float)((Random)this.id_throws[40]).nextGaussian() * 3.0f;
        }
        if ((iB_22 = this.I_()) != null && iB_22.rH() > this.rH() + (double)this.id_class && this.id_catch(iB_22)) {
            rjU_2 rjU_22 = this.rv();
            this.id_byte(this.rv().id_break(0.0, ((double)0.3f - rjU_22.id_byte) * (double)0.3f, 0.0));
            Boolean bl = true;
            this.id_throws[57] = bl;
        }
        super.id_double();
    }

    public rEO(aI_2<? extends rEO> aI_22, rYB rYB2) {
        super((aI_2<? extends rEi_1>)aI_22, rYB2);
        this.id_class(rLp_1.WATER, -1.0f);
        this.id_class(rLp_1.LAVA, 8.0f);
        this.id_class(rLp_1.DANGER_FIRE, 0.0f);
        this.id_class(rLp_1.DAMAGE_FIRE, 0.0f);
        this.id_finally = 10;
    }

    public void id_this(boolean bl) {
        byte by = ((rmE_2)this.id_throws[49]).id_class(id_protected);
        by = bl ? (byte)(by | 1) : (byte)(by & 0xFFFFFFFE);
        ((rmE_2)this.id_throws[49]).id_break(id_protected, by);
    }

    @Override
    public boolean id_class(float f, float f2) {
        return false;
    }

    @Override
    public void id_default() {
        if (!((Boolean)this.id_throws[20]).booleanValue() && this.rv().id_byte < 0.0) {
            this.id_byte(this.rv().id_throws(1.0, 0.6, 1.0));
        }
        if (((rYB)this.id_throws[7]).id_continue) {
            if (((Random)this.id_throws[40]).nextInt(24) == 0 && !this.BF()) {
                ((rYB)this.id_throws[7]).id_class(this.rx() + 0.5, this.re() + 0.5, this.BO() + 0.5, rqn_3.Y, this.Pr(), 1.0f + ((Random)this.id_throws[40]).nextFloat(), ((Random)this.id_throws[40]).nextFloat() * 0.7f + 0.3f, false);
            }
            for (int i = 0; i < 2; ++i) {
                ((rYB)this.id_throws[7]).id_class(rLQ.id_short, this.id_break(0.5), this.Ph(), this.id_protected(0.5), 0.0, 0.0, 0.0);
            }
        }
        super.id_default();
    }

    public static iz_3 id_throws() {
        return rEi_1.sm().id_class(iQ_2.id_case, 6.0).id_class(iQ_2.id_protected, 0.23f).id_class(iQ_2.id_break, 48.0);
    }

    private boolean L() {
        return (((rmE_2)this.id_throws[49]).id_class(id_protected) & 1) != 0;
    }

    @Override
    protected rqA_2 id_static() {
        return rqn_3.R;
    }

    @Override
    protected void id_final() {
        this.id_package.id_class(4, new rEh_1(this));
        this.id_package.id_class(5, new rBT(this, 1.0));
        this.id_package.id_class(7, new rSk_1((aA_2)this, 1.0, 0.0f));
        this.id_package.id_class(8, new rBA(this, rhd_3.class, 8.0f));
        this.id_package.id_class(8, new rBC(this));
        this.id_int.id_class(1, new rBc_1(this, new Class[0]).id_class(new Class[0]));
        this.id_int.id_class(2, new rBI<rhd_3>((is_3)this, rhd_3.class, true));
    }

    @Override
    public boolean Pz() {
        return this.L();
    }

    @Override
    public float rX() {
        return 1.0f;
    }

    @Override
    protected rqA_2 Bt() {
        return rqn_3.o;
    }

    @Override
    public boolean BU() {
        return true;
    }

    @Override
    protected void m_() {
        super.m_();
        ((rmE_2)this.id_throws[49]).id_class(id_protected, (byte)0);
    }
}

