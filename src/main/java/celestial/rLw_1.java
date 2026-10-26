/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.is_3;
import celestial.rLl_1;
import celestial.rLt_1;
import celestial.rLy_1;
import celestial.rYB;
import celestial.rbo_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rjB_2;
import celestial.rjM_2;
import celestial.rjS_2;
import celestial.rjU_2;
import celestial.rja_3;
import celestial.rjs_3;
import celestial.rqR_2;
import celestial.ruP_2;

public class rLw_1
extends rLy_1 {
    private boolean id_class;

    @Override
    public void id_byte(boolean bl) {
    }

    @Override
    protected rjU_2 id_byte() {
        return new rjU_2(this.id_break.rx(), this.id_break.id_byte(0.5), this.id_break.BO());
    }

    public rLw_1(is_3 is_32, rYB rYB2) {
        super(is_32, rYB2);
    }

    @Override
    protected boolean id_class(rjU_2 rjU_22, rjU_2 rjU_23, int n, int n2, int n3) {
        rjU_2 rjU_24 = new rjU_2(rjU_23.id_break, rjU_23.id_byte + (double)this.id_break.Bm() * 0.5, rjU_23.id_protected);
        return this.id_byte.id_class(new rjB_2(rjU_22, rjU_24, rjS_2.COLLIDER, rjs_3.NONE, this.id_break)).id_byte() == rjM_2.MISS;
    }

    @Override
    public boolean id_class(rfH_2 rfH_22) {
        return !this.id_byte.id_byte(rfH_22).id_implements(this.id_byte, rfH_22);
    }

    @Override
    protected rLl_1 id_class(int n) {
        this.id_class = this.id_break instanceof rbo_3;
        this.id_int = new rLt_1(this.id_class);
        return new rLl_1(this.id_int, n);
    }

    @Override
    public void id_class() {
        ++this.id_case;
        if (this.id_final) {
            this.id_implements();
        }
        if (!this.id_native()) {
            rjU_2 rjU_22;
            if (this.id_break()) {
                this.id_extends();
            } else if (this.id_protected != null && !this.id_protected.id_byte()) {
                rjU_22 = this.id_protected.id_class(this.id_break);
                if (rfU_2.id_byte(this.id_break.rx()) == rfU_2.id_byte(rjU_22.id_break) && rfU_2.id_byte(this.id_break.re()) == rfU_2.id_byte(rjU_22.id_byte) && rfU_2.id_byte(this.id_break.BO()) == rfU_2.id_byte(rjU_22.id_protected)) {
                    this.id_protected.id_class();
                }
            }
            ruP_2.id_class(this.id_byte, this.id_break, this.id_protected, this.id_volatile);
            if (!this.id_native()) {
                rjU_22 = this.id_protected.id_class(this.id_break);
                this.id_break.id_super().id_class(rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected, this.id_throws);
            }
        }
    }

    @Override
    protected void id_class(rjU_2 rjU_22) {
        if (this.id_case - this.id_catch > 100) {
            if (rjU_22.id_implements(this.id_private) < 2.25) {
                this.id_final();
            }
            this.id_catch = this.id_case;
            this.id_private = rjU_22;
        }
        if (this.id_protected != null && !this.id_protected.id_byte()) {
            rfH_2 rfH_22 = this.id_protected.id_catch();
            if (rfH_22.equals(this.id_implements)) {
                this.id_finally += rqR_2.id_break() - this.id_extends;
            } else {
                this.id_implements = rfH_22;
                double d = rjU_22.id_case(rjU_2.id_class(this.id_implements));
                double d2 = this.id_native = this.id_break.sB() > 0.0f ? d / (double)this.id_break.sB() * 100.0 : 0.0;
            }
            if (this.id_native > 0.0 && (double)this.id_finally > this.id_native * 2.0) {
                this.id_implements = rja_3.id_case;
                this.id_finally = 0L;
                this.id_native = 0.0;
                this.id_final();
            }
            this.id_extends = rqR_2.id_break();
        }
    }

    @Override
    protected boolean id_break() {
        return this.id_class || this.id_package();
    }

    @Override
    protected void id_extends() {
        if (this.id_protected != null) {
            rjU_2 rjU_22 = this.id_byte();
            float f = this.id_break.PN();
            float f2 = f > 0.75f ? f / 2.0f : 0.75f - f / 2.0f;
            rjU_2 rjU_23 = this.id_break.rv();
            if (Math.abs(rjU_23.id_break) > 0.2 || Math.abs(rjU_23.id_protected) > 0.2) {
                f2 = (float)((double)f2 * rjU_23.id_case() * 6.0);
            }
            int n = 6;
            rjU_2 rjU_24 = rjU_2.id_protected(this.id_protected.id_catch());
            if (Math.abs(this.id_break.rx() - rjU_24.id_break) < (double)f2 && Math.abs(this.id_break.BO() - rjU_24.id_protected) < (double)f2 && Math.abs(this.id_break.re() - rjU_24.id_byte) < (double)(f2 * 2.0f)) {
                this.id_protected.id_class();
            }
            for (int i = Math.min(this.id_protected.id_case() + 6, this.id_protected.id_throws() - 1); i > this.id_protected.id_case(); --i) {
                rjU_24 = this.id_protected.id_class(this.id_break, i);
                if (rjU_24.id_implements(rjU_22) > 36.0 || !this.id_class(rjU_22, rjU_24, 0, 0, 0)) continue;
                this.id_protected.id_byte(i);
                break;
            }
            this.id_class(rjU_22);
        }
    }
}

