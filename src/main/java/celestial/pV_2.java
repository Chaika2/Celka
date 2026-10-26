/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HQ;
import celestial.Hx_1;
import celestial.Ml_1;
import celestial.QY;
import celestial.Qw_1;
import celestial.aI_2;
import celestial.an_3;
import celestial.cm_3;
import celestial.pg_3;
import celestial.rRo_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rfl_3;
import celestial.rgP_2;
import celestial.rjU_2;
import celestial.rjV_2;
import celestial.rqO_2;
import celestial.rrMa_1;
import celestial.rrQX;
import celestial.rrWQ;
import celestial.ryW_2;
import celestial.yt_3;

public abstract class pV_2<T extends an_3>
implements rrMa_1 {
    protected final pg_3 id_break;
    public float id_byte;
    protected float id_protected = 1.0f;
    private aI_2 id_class = null;
    private rqO_2 id_throws = null;

    @Override
    public rrWQ<aI_2, ryW_2> id_byte() {
        return this.id_class == null ? null : rrWQ.id_class(this.id_class);
    }

    protected pV_2(pg_3 pg_32) {
        this.id_break = pg_32;
    }

    public void id_class(T t, float f, float f2, Ml_1 ml_1, Hx_1 hx_1, int n) {
        if (this.id_break(t) && ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_private().id_double().id_class((an_3)t)) {
            this.id_class(t, ((an_3)t).L_(), ml_1, hx_1, n);
        }
    }

    public abstract rqO_2 id_class(T var1);

    protected void id_class(T t, rgP_2 rgP_22, Ml_1 ml_1, Hx_1 hx_1, int n) {
        boolean bl;
        double d = this.id_break.id_break((an_3)t);
        boolean bl2 = bl = !(d > 4096.0);
        if (bl) {
            boolean bl3 = !((an_3)t).Pw();
            float f = ((an_3)t).Bm() + 0.5f;
            ml_1.id_class();
            ml_1.id_class(0.0, (double)f, 0.0);
            ml_1.id_class(this.id_break.id_byte());
            ml_1.id_class(-0.025f, -0.025f, 0.025f);
            rjV_2 rjV_22 = ml_1.id_byte().id_class();
            cm_3 cm_32 = this.H_();
            float f2 = -cm_32.id_class(rgP_22) / 2;
            float f3 = ((Qw_1)QY.id_instanceof().id_class[20]).id_class(0.25f);
            int n2 = (int)(f3 * 255.0f) << 24;
            cm_32.id_class(rgP_22, f2, 0.0f, 0x20FFFFFF, false, rjV_22, hx_1, bl3, n2, n);
            if (bl3) {
                cm_32.id_class(rgP_22, f2, 0.0f, -1, false, rjV_22, hx_1, false, 0, n);
            }
            ml_1.id_break();
        }
    }

    @Override
    public void id_class(rqO_2 rqO_22) {
        this.id_throws = rqO_22;
    }

    @Override
    public void id_class(rrWQ<aI_2, ryW_2> rrWQ2) {
        this.id_class = rrWQ2.id_class().get();
    }

    public boolean id_class(T t, yt_3 yt_32, double d, double d2, double d3) {
        if (((Boolean)((an_3)t).id_throws[56]).booleanValue()) {
            return true;
        }
        if (!((an_3)t).id_final(d, d2, d3)) {
            return false;
        }
        rfl_3 rfl_32 = ((an_3)t).PE().id_class(0.5);
        if (rfl_32.id_throws() || rfl_32.id_class() == 0.0) {
            rfl_32 = new rfl_3(((an_3)t).rx() - 2.0, ((an_3)t).re() - 2.0, ((an_3)t).BO() - 2.0, ((an_3)t).rx() + 2.0, ((an_3)t).re() + 2.0, ((an_3)t).BO() + 2.0);
        }
        return yt_32.id_class(rfl_32);
    }

    public rjU_2 id_class(T t, float f) {
        return rjU_2.id_class;
    }

    protected int id_class(T t, rfH_2 rfH_22) {
        return ((an_3)t).Pz() ? 15 : ((rYB)((an_3)t).id_throws[7]).id_class(rRo_1.BLOCK, rfH_22);
    }

    public final int id_break(T t, float f) {
        rfH_2 rfH_22 = new rfH_2(((an_3)t).id_volatile(f));
        return HQ.id_class(this.id_class(t, rfH_22), this.id_break(t, rfH_22));
    }

    protected int id_break(T t, rfH_2 rfH_22) {
        return ((rYB)((an_3)t).id_throws[7]).id_class(rRo_1.SKY, rfH_22);
    }

    protected boolean id_break(T t) {
        return ((an_3)t).rJ() && ((an_3)t).Bk();
    }

    public pg_3 id_break() {
        return this.id_break;
    }

    @Override
    public rqO_2 id_protected() {
        return this.id_throws;
    }

    public cm_3 H_() {
        return this.id_break.id_protected();
    }
}

