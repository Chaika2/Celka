/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.iB_2;
import celestial.rBk_1;
import celestial.rYB;
import celestial.rbf_3;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfl_3;
import celestial.rfw_3;
import celestial.rhd_3;
import celestial.rls_3;
import celestial.rrEm_1;
import celestial.rsE_2;
import celestial.rzL_2;
import celestial.rzP_2;
import celestial.rzQ_2;
import celestial.rzl_3;
import celestial.rzz_3;
import celestial.xb_3;
import celestial.xc_3;
import java.util.Random;

public class rbV_2
extends rBk_1 {
    private final rbf_3 id_class;
    private rhd_3 id_break;
    private rfH_2 id_byte;
    private int id_protected;

    @Override
    public void id_byte() {
        if (this.id_byte != null) {
            this.id_class.id_public(false);
            this.id_class.id_public().id_class((double)this.id_byte.b_(), (double)this.id_byte.c_(), (double)this.id_byte.d_(), 1.1f);
        }
    }

    public rbV_2(rbf_3 rbf_32) {
        this.id_class = rbf_32;
    }

    @Override
    public boolean id_class() {
        if (!this.id_class.sZ()) {
            return false;
        }
        if (this.id_class.sL()) {
            return false;
        }
        iB_2 iB_22 = this.id_class.sF();
        if (iB_22 instanceof rhd_3) {
            this.id_break = (rhd_3)iB_22;
            if (!iB_22.Sc()) {
                return false;
            }
            if (this.id_class.id_int(this.id_break) > 100.0) {
                return false;
            }
            rfH_2 rfH_22 = this.id_break.Bs();
            xc_3 xc_32 = ((rYB)this.id_class.id_throws[7]).id_byte(rfH_22);
            if (xc_32.id_break().id_class(rls_3.id_short)) {
                this.id_byte = xc_32.id_protected(xb_3.p).map(rpr_32 -> rfH_22.id_break(rpr_32.id_case())).orElseGet(() -> new rfH_2(rfH_22));
                return !this.id_catch();
            }
        }
        return false;
    }

    @Override
    public boolean id_break() {
        return this.id_class.sZ() && !this.id_class.sL() && this.id_break != null && this.id_break.Sc() && this.id_byte != null && !this.id_catch();
    }

    @Override
    public void id_throws() {
        if (this.id_break != null && this.id_byte != null) {
            this.id_class.id_public(false);
            this.id_class.id_public().id_class((double)this.id_byte.b_(), (double)this.id_byte.c_(), (double)this.id_byte.d_(), 1.1f);
            if (this.id_class.id_int(this.id_break) < 2.5) {
                ++this.id_protected;
                if (this.id_protected > 16) {
                    this.id_class.id_this(true);
                    this.id_class.id_else(false);
                } else {
                    this.id_class.id_class((an_3)this.id_break, 45.0f, 45.0f);
                    this.id_class.id_else(true);
                }
            } else {
                this.id_class.id_this(false);
            }
        }
    }

    private boolean id_catch() {
        for (rbf_3 rbf_32 : ((rYB)this.id_class.id_throws[7]).id_class(rbf_3.class, new rfl_3(this.id_byte).id_class(2.0))) {
            if (rbf_32 == this.id_class || !rbf_32.sJ() && !rbf_32.sx()) continue;
            return true;
        }
        return false;
    }

    @Override
    public void id_protected() {
        this.id_class.id_this(false);
        float f = ((rYB)this.id_class.id_throws[7]).id_protected(1.0f);
        if (this.id_break.su() >= 100 && (double)f > 0.77 && (double)f < 0.8 && (double)((rYB)this.id_class.id_throws[7]).id_long().nextFloat() < 0.7) {
            this.id_private();
        }
        this.id_protected = 0;
        this.id_class.id_else(false);
        this.id_class.id_public().id_final();
    }

    private void id_private() {
        Random random = this.id_class.Sa();
        rfw_3 rfw_32 = new rfw_3();
        rfw_32.id_class(this.id_class.Bs());
        this.id_class.id_class((double)(rfw_32.b_() + random.nextInt(11) - 5), (double)(rfw_32.c_() + random.nextInt(5) - 2), (double)(rfw_32.d_() + random.nextInt(11) - 5), false);
        rfw_32.id_class(this.id_class.Bs());
        rzL_2 rzL_22 = ((rYB)this.id_class.id_throws[7]).id_const().o().id_class(rzl_3.W);
        rzP_2 rzP_22 = new rzP_2((rrEm_1)((rYB)this.id_class.id_throws[7])).id_class(rzQ_2.id_case, this.id_class.Ps()).id_class(rzQ_2.id_class, this.id_class).id_class(random);
        for (rdn_3 rdn_32 : rzL_22.id_class(rzP_22.id_class(rzz_3.id_catch))) {
            ((rYB)this.id_class.id_throws[7]).a_(new rsE_2((rYB)this.id_class.id_throws[7], (double)rfw_32.b_() - (double)rfU_2.id_class(((Float)this.id_class.id_private[23]).floatValue() * ((float)Math.PI / 180)), rfw_32.c_(), (double)rfw_32.d_() + (double)rfU_2.id_break(((Float)this.id_class.id_private[23]).floatValue() * ((float)Math.PI / 180)), rdn_32));
        }
    }
}

