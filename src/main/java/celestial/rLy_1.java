/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
package celestial;

import celestial.an_3;
import celestial.eX_2;
import celestial.iQ_2;
import celestial.is_3;
import celestial.rLC;
import celestial.rLf_1;
import celestial.rLl_1;
import celestial.rLn_1;
import celestial.rLq_1;
import celestial.rRU;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rjU_2;
import celestial.rja_3;
import celestial.rqR_2;
import celestial.rrTj_1;
import celestial.ruP_2;
import celestial.xc_3;
import celestial.xu_3;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class rLy_1 {
    protected final is_3 id_break;
    protected final rYB id_byte;
    protected rLC id_protected;
    protected double id_throws;
    protected int id_case;
    protected int id_catch;
    protected rjU_2 id_private = rjU_2.id_class;
    protected rja_3 id_implements = rja_3.id_case;
    protected long id_finally;
    protected long id_extends;
    protected double id_native;
    protected float id_volatile = 0.5f;
    protected boolean id_final;
    protected long id_package;
    protected rLn_1 id_int;
    private rfH_2 id_class;
    private int id_new;
    private float id_continue = 1.0f;
    private final rLl_1 id_super;
    private boolean id_this;

    public void id_byte(boolean bl) {
        this.id_int.id_byte(bl);
    }

    protected abstract rjU_2 id_byte();

    public rLn_1 id_int() {
        return this.id_int;
    }

    public rLy_1(is_3 is_32, rYB rYB2) {
        this.id_break = is_32;
        this.id_byte = rYB2;
        int n = rfU_2.id_byte(is_32.id_class(iQ_2.id_break) * 16.0);
        this.id_super = this.id_class(n);
    }

    public void id_class() {
        ++this.id_case;
        if (this.id_final) {
            this.id_implements();
        }
        if (!this.id_native()) {
            rrTj_1 rrTj_12;
            rjU_2 rjU_22;
            if (this.id_break()) {
                this.id_extends();
            } else if (this.id_protected != null && !this.id_protected.id_byte()) {
                rjU_22 = this.id_byte();
                rrTj_12 = this.id_protected.id_class(this.id_break);
                if (rjU_22.id_byte > ((rjU_2)rrTj_12).id_byte && !this.id_break.BL() && rfU_2.id_byte(rjU_22.id_break) == rfU_2.id_byte(((rjU_2)rrTj_12).id_break) && rfU_2.id_byte(rjU_22.id_protected) == rfU_2.id_byte(((rjU_2)rrTj_12).id_protected)) {
                    this.id_protected.id_class();
                }
            }
            ruP_2.id_class(this.id_byte, this.id_break, this.id_protected, this.id_volatile);
            if (!this.id_native()) {
                rjU_22 = this.id_protected.id_class(this.id_break);
                rrTj_12 = new rfH_2(rjU_22);
                this.id_break.id_super().id_class(rjU_22.id_break, this.id_byte.id_byte(((rfH_2)rrTj_12).id_break()).id_catch() ? rjU_22.id_byte : rLf_1.id_class((rRq_1)this.id_byte, (rfH_2)rrTj_12), rjU_22.id_protected, this.id_throws);
            }
        }
    }

    public boolean id_class(rLC rLC2, double d) {
        if (rLC2 == null) {
            this.id_protected = null;
            return false;
        }
        if (!rLC2.id_class(this.id_protected)) {
            this.id_protected = rLC2;
        }
        if (this.id_native()) {
            return false;
        }
        this.id_protected();
        if (this.id_protected.id_throws() <= 0) {
            return false;
        }
        this.id_throws = d;
        rjU_2 rjU_22 = this.id_byte();
        this.id_catch = this.id_case;
        this.id_private = rjU_22;
        return true;
    }

    public boolean id_class(an_3 an_32, double d) {
        rLC rLC2 = this.id_class(an_32, 1);
        return rLC2 != null && this.id_class(rLC2, d);
    }

    public boolean id_class(double d, double d2, double d3, double d4) {
        return this.id_class(this.id_class(d, d2, d3, 1), d4);
    }

    public rLC id_class(an_3 an_32, int n) {
        return this.id_class((Set<rfH_2>)ImmutableSet.of((Object)an_32.Bs()), 16, true, n);
    }

    protected rLC id_class(Set<rfH_2> set, int n, boolean bl, int n2) {
        float f;
        int n3;
        if (set.isEmpty()) {
            return null;
        }
        if (this.id_break.re() < 0.0) {
            return null;
        }
        if (!this.id_break()) {
            return null;
        }
        if (this.id_protected != null && !this.id_protected.id_byte() && set.contains(this.id_class)) {
            return this.id_protected;
        }
        rfH_2 rfH_22 = bl ? this.id_break.Bs().id_final() : this.id_break.Bs();
        rRU rRU2 = new rRU(this.id_byte, rfH_22.id_break(-(n3 = (int)((f = (float)this.id_break.id_class(iQ_2.id_break)) + (float)n)), -n3, -n3), rfH_22.id_break(n3, n3, n3));
        rLC rLC2 = this.id_super.id_class(rRU2, this.id_break, set, f, n2, this.id_continue);
        if (rLC2 != null && rLC2.id_volatile() != null) {
            this.id_class = rLC2.id_volatile();
            this.id_new = n2;
            this.id_super();
        }
        return rLC2;
    }

    protected abstract boolean id_class(rjU_2 var1, rjU_2 var2, int var3, int var4, int var5);

    protected void id_class(rjU_2 rjU_22) {
        if (this.id_case - this.id_catch > 100) {
            if (rjU_22.id_implements(this.id_private) < 2.25) {
                this.id_this = true;
                this.id_final();
            } else {
                this.id_this = false;
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
                double d = rjU_22.id_case(rjU_2.id_protected(this.id_implements));
                double d2 = this.id_native = this.id_break.sB() > 0.0f ? d / (double)this.id_break.sB() * 1000.0 : 0.0;
            }
            if (this.id_native > 0.0 && (double)this.id_finally > this.id_native * 3.0) {
                this.id_throws();
            }
            this.id_extends = rqR_2.id_break();
        }
    }

    public boolean id_class(rfH_2 rfH_22) {
        rfH_2 rfH_23 = rfH_22.id_break();
        return this.id_byte.id_byte(rfH_23).id_implements(this.id_byte, rfH_23);
    }

    public rLC id_class(Stream<rfH_2> stream, int n) {
        return this.id_class(stream.collect(Collectors.toSet()), 8, false, n);
    }

    public final rLC id_class(double d, double d2, double d3, int n) {
        return this.id_class(new rfH_2(d, d2, d3), n);
    }

    protected abstract rLl_1 id_class(int var1);

    public void id_class(double d) {
        this.id_throws = d;
    }

    public rLC id_class(rfH_2 rfH_22, int n) {
        return this.id_class((Set<rfH_2>)ImmutableSet.of((Object)rfH_22), 8, false, n);
    }

    public rLC id_class(Set<rfH_2> set, int n) {
        return this.id_class(set, 8, false, n);
    }

    public void id_class(float f) {
        this.id_continue = f;
    }

    public void id_break(rfH_2 rfH_22) {
        if (this.id_protected != null && !this.id_protected.id_byte() && this.id_protected.id_throws() != 0) {
            rLq_1 rLq_12 = this.id_protected.id_protected();
            rjU_2 rjU_22 = new rjU_2(((double)rLq_12.id_class + this.id_break.rx()) / 2.0, ((double)rLq_12.id_break + this.id_break.re()) / 2.0, ((double)rLq_12.id_byte + this.id_break.BO()) / 2.0);
            if (rfH_22.id_class((eX_2)rjU_22, (double)(this.id_protected.id_throws() - this.id_protected.id_case()))) {
                this.id_implements();
            }
        }
    }

    protected abstract boolean id_break();

    private boolean id_break(rjU_2 rjU_22) {
        rjU_2 rjU_23;
        if (this.id_protected.id_case() + 1 >= this.id_protected.id_throws()) {
            return false;
        }
        rjU_2 rjU_24 = rjU_2.id_protected(this.id_protected.id_catch());
        if (!rjU_22.id_class((eX_2)rjU_24, 2.0)) {
            return false;
        }
        rjU_2 rjU_25 = rjU_2.id_protected(this.id_protected.id_protected(this.id_protected.id_case() + 1));
        rjU_2 rjU_26 = rjU_25.id_protected(rjU_24);
        return rjU_26.id_break(rjU_23 = rjU_22.id_protected(rjU_24)) > 0.0;
    }

    private void id_throws() {
        this.id_super();
        this.id_final();
    }

    public rLC id_finally() {
        return this.id_protected;
    }

    public rfH_2 id_catch() {
        return this.id_class;
    }

    protected void id_extends() {
        boolean bl;
        rjU_2 rjU_22 = this.id_byte();
        this.id_volatile = this.id_break.PN() > 0.75f ? this.id_break.PN() / 2.0f : 0.75f - this.id_break.PN() / 2.0f;
        rfH_2 rfH_22 = this.id_protected.id_catch();
        double d = Math.abs(this.id_break.rx() - ((double)rfH_22.b_() + 0.5));
        double d2 = Math.abs(this.id_break.re() - (double)rfH_22.c_());
        double d3 = Math.abs(this.id_break.BO() - ((double)rfH_22.d_() + 0.5));
        boolean bl2 = bl = d < (double)this.id_volatile && d3 < (double)this.id_volatile && d2 < 1.0;
        if (bl || this.id_break.id_break(this.id_protected.id_private().id_native) && this.id_break(rjU_22)) {
            this.id_protected.id_class();
        }
        this.id_class(rjU_22);
    }

    public void id_case() {
        this.id_continue = 1.0f;
    }

    public boolean id_continue() {
        return this.id_this;
    }

    public void id_implements() {
        if (this.id_byte.r() - this.id_package > 20L) {
            if (this.id_class != null) {
                this.id_protected = null;
                this.id_protected = this.id_class(this.id_class, this.id_new);
                this.id_package = this.id_byte.r();
                this.id_final = false;
            }
        } else {
            this.id_final = true;
        }
    }

    public boolean id_new() {
        return this.id_int.id_throws();
    }

    protected boolean id_package() {
        return this.id_break.Pa() || this.id_break.ry();
    }

    private void id_super() {
        this.id_implements = rja_3.id_case;
        this.id_finally = 0L;
        this.id_native = 0.0;
        this.id_this = false;
    }

    protected void id_protected() {
        if (this.id_protected != null) {
            for (int i = 0; i < this.id_protected.id_throws(); ++i) {
                rLq_1 rLq_12 = this.id_protected.id_class(i);
                rLq_1 rLq_13 = i + 1 < this.id_protected.id_throws() ? this.id_protected.id_class(i + 1) : null;
                xc_3 xc_32 = this.id_byte.id_byte(new rfH_2(rLq_12.id_class, rLq_12.id_break, rLq_12.id_byte));
                if (!xc_32.id_class(xu_3.Sb)) continue;
                this.id_protected.id_class(i, rLq_12.id_class(rLq_12.id_class, rLq_12.id_break + 1, rLq_12.id_byte));
                if (rLq_13 == null || rLq_12.id_break < rLq_13.id_break) continue;
                this.id_protected.id_class(i + 1, rLq_12.id_class(rLq_13.id_class, rLq_12.id_break + 1, rLq_13.id_byte));
            }
        }
    }

    public boolean id_private() {
        return this.id_final;
    }

    public void id_final() {
        this.id_protected = null;
    }

    public boolean id_volatile() {
        return !this.id_native();
    }

    public boolean id_native() {
        return this.id_protected == null || this.id_protected.id_byte();
    }
}

