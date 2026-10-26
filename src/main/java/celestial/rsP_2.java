/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.an_3;
import celestial.eA_2;
import celestial.eY_2;
import celestial.iG_2;
import celestial.rFO;
import celestial.rXQ;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rhd_3;
import celestial.rjU_2;
import celestial.rlG_2;
import celestial.rqn_3;
import celestial.ruS_2;
import celestial.rye_3;
import java.util.Map;
import java.util.Random;

public class rsP_2
extends an_3 {
    public int id_class;
    public int id_break;
    public int id_protected;
    private int id_catch = 5;
    private int id_private;
    private rhd_3 id_implements;
    private int id_finally;

    private int id_byte(int n) {
        return n * 2;
    }

    public rsP_2(rYB rYB2, double d, double d2, double d3, int n) {
        this((aI_2<? extends rsP_2>)aI_2.id_goto, rYB2);
        this.id_new(d, d2, d3);
        Float f = Float.valueOf((float)(((Random)this.id_throws[40]).nextDouble() * 360.0));
        this.id_throws[15] = f;
        this.id_catch((((Random)this.id_throws[40]).nextDouble() * (double)0.2f - (double)0.1f) * 2.0, ((Random)this.id_throws[40]).nextDouble() * 0.2 * 2.0, (((Random)this.id_throws[40]).nextDouble() * (double)0.2f - (double)0.1f) * 2.0);
        this.id_private = n;
    }

    public rsP_2(aI_2<? extends rsP_2> aI_22, rYB rYB2) {
        super(aI_22, rYB2);
    }

    @Override
    public void id_this() {
        rjU_2 rjU_22;
        double d;
        super.id_this();
        if (this.id_protected > 0) {
            --this.id_protected;
        }
        Double d2 = this.rx();
        this.id_throws[8] = d2;
        Double d3 = this.re();
        this.id_throws[9] = d3;
        Double d4 = this.BO();
        this.id_throws[10] = d4;
        if (this.id_class(rlG_2.id_break)) {
            this.id_case();
        } else if (!this.rw()) {
            this.id_byte(this.rv().id_break(0.0, -0.03, 0.0));
        }
        if (((rYB)this.id_throws[7]).id_break(this.Bs()).id_class(rlG_2.id_byte)) {
            this.id_catch((((Random)this.id_throws[40]).nextFloat() - ((Random)this.id_throws[40]).nextFloat()) * 0.2f, 0.2f, (((Random)this.id_throws[40]).nextFloat() - ((Random)this.id_throws[40]).nextFloat()) * 0.2f);
            this.id_class(rqn_3.Sf, 0.4f, 2.0f + ((Random)this.id_throws[40]).nextFloat() * 0.4f);
        }
        if (!((rYB)this.id_throws[7]).id_break(this.rN())) {
            this.id_protected(this.rx(), (this.rN().id_break + this.rN().id_throws) / 2.0, this.BO());
        }
        double d5 = 8.0;
        if (this.id_finally < this.id_class - 20 + this.V() % 100) {
            if (this.id_implements == null || this.id_implements.id_int(this) > 64.0) {
                this.id_implements = ((rYB)this.id_throws[7]).id_class((an_3)this, 8.0);
            }
            this.id_finally = this.id_class;
        }
        if (this.id_implements != null && this.id_implements.id_native()) {
            this.id_implements = null;
        }
        if (this.id_implements != null && (d = (rjU_22 = new rjU_2(this.id_implements.rx() - this.rx(), this.id_implements.re() + (double)this.id_implements.Bx() / 2.0 - this.re(), this.id_implements.BO() - this.BO())).id_catch()) < 64.0) {
            double d6 = 1.0 - Math.sqrt(d) / 8.0;
            this.id_byte(this.rv().id_throws(rjU_22.id_protected().id_class(d6 * d6 * 0.1)));
        }
        this.id_class(iG_2.SELF, this.rv());
        float f = 0.98f;
        if (((Boolean)this.id_throws[20]).booleanValue()) {
            f = ((rYB)this.id_throws[7]).id_byte(new rfH_2(this.rx(), this.re() - 1.0, this.BO())).id_break().id_final() * 0.98f;
        }
        this.id_byte(this.rv().id_throws(f, 0.98, f));
        if (((Boolean)this.id_throws[20]).booleanValue()) {
            this.id_byte(this.rv().id_throws(1.0, -0.9, 1.0));
        }
        ++this.id_class;
        ++this.id_break;
        if (this.id_break >= 6000) {
            this.PD();
        }
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        rcd_32.id_class("Health", (short)this.id_catch);
        rcd_32.id_class("Age", (short)this.id_break);
        rcd_32.id_class("Value", (short)this.id_private);
    }

    public static int id_class(int n) {
        if (n >= 2477) {
            return 2477;
        }
        if (n >= 1237) {
            return 1237;
        }
        if (n >= 617) {
            return 617;
        }
        if (n >= 307) {
            return 307;
        }
        if (n >= 149) {
            return 149;
        }
        if (n >= 73) {
            return 73;
        }
        if (n >= 37) {
            return 37;
        }
        if (n >= 17) {
            return 17;
        }
        if (n >= 7) {
            return 7;
        }
        return n >= 3 ? 3 : 1;
    }

    @Override
    protected void U() {
    }

    private int id_break(int n) {
        return n / 2;
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        this.id_catch = rcd_32.id_catch("Health");
        this.id_break = rcd_32.id_catch("Age");
        this.id_private = rcd_32.id_catch("Value");
    }

    @Override
    public boolean id_break(rye_3 rye_32, float f) {
        if (this.id_class(rye_32)) {
            return false;
        }
        this.rf();
        this.id_catch = (int)((float)this.id_catch - f);
        if (this.id_catch <= 0) {
            this.PD();
        }
        return false;
    }

    public int id_throws() {
        if (this.id_private >= 2477) {
            return 10;
        }
        if (this.id_private >= 1237) {
            return 9;
        }
        if (this.id_private >= 617) {
            return 8;
        }
        if (this.id_private >= 307) {
            return 7;
        }
        if (this.id_private >= 149) {
            return 6;
        }
        if (this.id_private >= 73) {
            return 5;
        }
        if (this.id_private >= 37) {
            return 4;
        }
        if (this.id_private >= 17) {
            return 3;
        }
        if (this.id_private >= 7) {
            return 2;
        }
        return this.id_private >= 3 ? 1 : 0;
    }

    @Override
    public boolean rt() {
        return false;
    }

    private void id_case() {
        rjU_2 rjU_22 = this.rv();
        this.id_catch(rjU_22.id_break * (double)0.99f, Math.min(rjU_22.id_byte + (double)5.0E-4f, (double)0.06f), rjU_22.id_protected * (double)0.99f);
    }

    public int id_protected() {
        return this.id_private;
    }

    @Override
    protected boolean PK() {
        return false;
    }

    @Override
    protected void m_() {
    }

    @Override
    public ruS_2<?> p_() {
        return new rFO(this);
    }

    @Override
    public void c_(rhd_3 rhd_32) {
        if (!((rYB)this.id_throws[7]).id_continue && this.id_protected == 0 && (Integer)rhd_32.id_implements[9] == 0) {
            rdn_3 rdn_32;
            Integer n = 2;
            rhd_32.id_implements[9] = n;
            rhd_32.id_class((an_3)this, 1);
            Map.Entry<rXQ, rdn_3> entry = eA_2.id_class(eY_2.id_import, rhd_32, rdn_3::id_case);
            if (entry != null && !(rdn_32 = entry.getValue()).id_class() && rdn_32.id_case()) {
                int n2 = Math.min(this.id_byte(this.id_private), rdn_32.id_catch());
                this.id_private -= this.id_break(n2);
                rdn_32.id_break(rdn_32.id_catch() - n2);
            }
            if (this.id_private > 0) {
                rhd_32.id_this(this.id_private);
            }
            this.PD();
        }
    }
}

