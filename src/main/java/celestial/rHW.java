/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.mutable.MutableInt
 */
package celestial;

import celestial.eX_2;
import celestial.iB_2;
import celestial.il_3;
import celestial.rHf_1;
import celestial.rLD;
import celestial.rLQ;
import celestial.rLY;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfl_3;
import celestial.rhd_3;
import celestial.rlE_2;
import celestial.rpr_3;
import celestial.rqL_2;
import celestial.rqn_3;
import celestial.ryO_2;
import celestial.ryW_2;
import celestial.ryj_3;
import java.util.List;
import org.apache.commons.lang3.mutable.MutableInt;

public class rHW
extends ryO_2
implements rHf_1 {
    private long id_protected;
    public int id_class;
    public boolean id_break;
    public rpr_3 id_byte;
    private List<iB_2> id_throws;
    private boolean id_case;
    private int id_catch;

    public rHW() {
        super(ryW_2.id_interface);
    }

    private void id_class(rYB rYB2) {
        if (!rYB2.id_continue) {
            this.id_throws.stream().filter(this::id_class).forEach(this::id_break);
        }
    }

    private boolean id_class(iB_2 iB_22) {
        return iB_22.BM() && (Boolean)iB_22.id_throws[27] == false && this.id_char().id_class((eX_2)iB_22.Ps(), 48.0) && iB_22.BC().id_class(rlE_2.id_byte);
    }

    public void id_class(rpr_3 rpr_32) {
        rfH_2 rfH_22 = this.id_char();
        this.id_byte = rpr_32;
        if (this.id_break) {
            this.id_class = 0;
        } else {
            this.id_break = true;
        }
        this.id_extends.id_class(rfH_22, this.id_abstract().id_break(), 1, rpr_32.id_byte());
    }

    private void id_break(iB_2 iB_22) {
        iB_22.id_break(new rLY(rLD.id_public, 60));
    }

    private void id_break(rYB rYB2) {
        if (rYB2.id_continue) {
            rfH_2 rfH_22 = this.id_char();
            MutableInt mutableInt = new MutableInt(16700985);
            int n = (int)this.id_throws.stream().filter(iB_22 -> rfH_22.id_class((eX_2)iB_22.Ps(), 48.0)).count();
            this.id_throws.stream().filter(this::id_class).forEach(iB_22 -> {
                float f = 1.0f;
                float f2 = rfU_2.id_class((iB_22.rx() - (double)rfH_22.b_()) * (iB_22.rx() - (double)rfH_22.b_()) + (iB_22.BO() - (double)rfH_22.d_()) * (iB_22.BO() - (double)rfH_22.d_()));
                double d = (double)((float)rfH_22.b_() + 0.5f) + (double)(1.0f / f2) * (iB_22.rx() - (double)rfH_22.b_());
                double d2 = (double)((float)rfH_22.d_() + 0.5f) + (double)(1.0f / f2) * (iB_22.BO() - (double)rfH_22.d_());
                int n2 = rfU_2.id_class((n - 21) / -2, 3, 15);
                for (int i = 0; i < n2; ++i) {
                    int n3 = mutableInt.addAndGet(5);
                    double d3 = (double)ryj_3.id_break(n3) / 255.0;
                    double d4 = (double)ryj_3.id_byte(n3) / 255.0;
                    double d5 = (double)ryj_3.id_protected(n3) / 255.0;
                    rYB2.id_class(rLQ.id_else, d, (double)((float)rfH_22.c_() + 0.5f), d2, d3, d4, d5);
                }
            });
        }
    }

    @Override
    public void id_throws() {
        if (this.id_break) {
            ++this.id_class;
        }
        if (this.id_class >= 50) {
            this.id_break = false;
            this.id_class = 0;
        }
        if (this.id_class >= 5 && this.id_catch == 0 && this.id_finally()) {
            this.id_case = true;
            this.id_catch();
        }
        if (this.id_case) {
            if (this.id_catch < 40) {
                ++this.id_catch;
            } else {
                this.id_class(this.id_extends);
                this.id_break(this.id_extends);
                this.id_case = false;
            }
        }
    }

    private boolean id_finally() {
        rfH_2 rfH_22 = this.id_char();
        for (iB_2 iB_22 : this.id_throws) {
            if (!iB_22.BM() || ((Boolean)iB_22.id_throws[27]).booleanValue() || !rfH_22.id_class((eX_2)iB_22.Ps(), 32.0) || !iB_22.BC().id_class(rlE_2.id_byte)) continue;
            return true;
        }
        return false;
    }

    private void id_catch() {
        this.id_extends.id_class((rhd_3)null, this.id_char(), rqn_3.g, rqL_2.BLOCKS, 1.0f, 1.0f);
    }

    private void id_private() {
        rfH_2 rfH_22 = this.id_char();
        if (this.id_extends.r() > this.id_protected + 60L || this.id_throws == null) {
            this.id_protected = this.id_extends.r();
            rfl_3 rfl_32 = new rfl_3(rfH_22).id_class(48.0);
            this.id_throws = this.id_extends.id_class(iB_2.class, rfl_32);
        }
        if (!this.id_extends.id_continue) {
            for (iB_2 iB_22 : this.id_throws) {
                if (!iB_22.BM() || ((Boolean)iB_22.id_throws[27]).booleanValue() || !rfH_22.id_class((eX_2)iB_22.Ps(), 32.0)) continue;
                iB_22.SF().id_class(il_3.id_throw, Long.valueOf(this.id_extends.r()));
            }
        }
    }

    @Override
    public boolean a_(int n, int n2) {
        if (n == 1) {
            this.id_private();
            this.id_catch = 0;
            this.id_byte = rpr_3.id_class(n2);
            this.id_class = 0;
            this.id_break = true;
            return true;
        }
        return super.a_(n, n2);
    }
}

