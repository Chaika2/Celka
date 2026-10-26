/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.du_3;
import celestial.rBW;
import celestial.rCf_1;
import celestial.rYB;
import celestial.rbF_2;
import celestial.rbq_3;
import celestial.rfH_2;
import celestial.rfw_3;
import celestial.rjU_2;
import celestial.rls_3;
import celestial.rqn_3;
import celestial.xc_3;
import celestial.xu_3;
import java.util.EnumSet;
import java.util.Optional;
import java.util.function.Predicate;

public class rbT_2
extends rbq_3 {
    private final Predicate<xc_3> id_byte;
    private int id_protected;
    private int id_throws;
    private boolean id_case;
    private rjU_2 id_catch;
    private int id_private;
    public final /* synthetic */ rbF_2 id_class;

    @Override
    public void id_byte() {
        this.id_protected = 0;
        this.id_private = 0;
        this.id_throws = 0;
        this.id_case = true;
        this.id_class.sJ();
    }

    public rbT_2(rbF_2 rbF_22) {
        this.id_class = rbF_22;
        super(rbF_22);
        this.id_byte = xc_32 -> {
            if (xc_32.id_class(rls_3.id_const)) {
                if (xc_32.id_class(xu_3.Gr)) {
                    return xc_32.id_byte(du_3.id_volatile) == rCf_1.UPPER;
                }
                return true;
            }
            return xc_32.id_class(rls_3.id_import);
        };
        this.id_protected = 0;
        this.id_throws = 0;
        this.id_private = 0;
        this.id_class(EnumSet.of(rBW.MOVE));
    }

    private Optional<rfH_2> id_class(Predicate<xc_3> predicate, double d) {
        rfH_2 rfH_22 = this.id_class.Bs();
        rfw_3 rfw_32 = new rfw_3();
        int n = 0;
        while ((double)n <= d) {
            int n2 = 0;
            while ((double)n2 < d) {
                int n3 = 0;
                while (n3 <= n2) {
                    int n4;
                    int n5 = n4 = n3 < n2 && n3 > -n2 ? n2 : 0;
                    while (n4 <= n2) {
                        rfw_32.id_class(rfH_22, n3, n - 1, n4);
                        if (rfH_22.id_class(rfw_32, d) && predicate.test(((rYB)this.id_class.id_throws[7]).id_byte(rfw_32))) {
                            return Optional.of(rfw_32);
                        }
                        n4 = n4 > 0 ? -n4 : 1 - n4;
                    }
                    n3 = n3 > 0 ? -n3 : 1 - n3;
                }
                ++n2;
            }
            n = n > 0 ? -n : 1 - n;
        }
        return Optional.empty();
    }

    @Override
    public void id_throws() {
        ++this.id_private;
        if (this.id_private > 600) {
            this.id_class.id_char = null;
        } else {
            rjU_2 rjU_22 = rjU_2.id_protected(this.id_class.id_char).id_break(0.0, 0.6f, 0.0);
            if (rjU_22.id_case(this.id_class.Ps()) > 1.0) {
                this.id_catch = rjU_22;
                this.id_volatile();
            } else {
                if (this.id_catch == null) {
                    this.id_catch = rjU_22;
                }
                boolean bl = this.id_class.Ps().id_case(this.id_catch) <= 0.1;
                boolean bl2 = true;
                if (!bl && this.id_private > 600) {
                    this.id_class.id_char = null;
                } else {
                    if (bl) {
                        boolean bl3;
                        boolean bl4 = bl3 = rbF_2.id_this(this.id_class).nextInt(25) == 0;
                        if (bl3) {
                            this.id_catch = new rjU_2(rjU_22.id_class() + (double)this.id_final(), rjU_22.id_break(), rjU_22.id_byte() + (double)this.id_final());
                            rbF_2.id_else(this.id_class).id_final();
                        } else {
                            bl2 = false;
                        }
                        this.id_class.id_continue().id_class(rjU_22.id_class(), rjU_22.id_break(), rjU_22.id_byte());
                    }
                    if (bl2) {
                        this.id_volatile();
                    }
                    ++this.id_protected;
                    if (rbF_2.id_synchronized(this.id_class).nextFloat() < 0.05f && this.id_protected > this.id_throws + 60) {
                        this.id_throws = this.id_protected;
                        this.id_class.id_class(rqn_3.T, 1.0f, 1.0f);
                    }
                }
            }
        }
    }

    private boolean id_finally() {
        return this.id_protected > 400;
    }

    @Override
    public boolean id_catch() {
        if (this.id_class.id_interface > 0) {
            return false;
        }
        if (this.id_class.sc()) {
            return false;
        }
        if (((rYB)this.id_class.id_throws[7]).s()) {
            return false;
        }
        if (rbF_2.id_int(this.id_class).nextFloat() < 0.7f) {
            return false;
        }
        Optional<rfH_2> optional = this.id_package();
        if (optional.isPresent()) {
            this.id_class.id_char = optional.get();
            rbF_2.id_new(this.id_class).id_class((double)this.id_class.id_char.b_() + 0.5, (double)this.id_class.id_char.c_() + 0.5, (double)this.id_class.id_char.d_() + 0.5, 1.2f);
            return true;
        }
        return false;
    }

    public boolean id_extends() {
        return this.id_case;
    }

    private Optional<rfH_2> id_package() {
        return this.id_class(this.id_byte, 5.0);
    }

    @Override
    public void id_protected() {
        if (this.id_finally()) {
            this.id_class.id_this(true);
        }
        this.id_case = false;
        rbF_2.id_super(this.id_class).id_final();
        this.id_class.id_interface = 200;
    }

    @Override
    public boolean id_private() {
        if (!this.id_case) {
            return false;
        }
        if (!this.id_class.n()) {
            return false;
        }
        if (((rYB)this.id_class.id_throws[7]).s()) {
            return false;
        }
        if (this.id_finally()) {
            return rbF_2.id_continue(this.id_class).nextFloat() < 0.2f;
        }
        if ((Integer)this.id_class.id_throws[41] % 20 == 0 && !this.id_class.id_volatile(this.id_class.id_char)) {
            this.id_class.id_char = null;
            return false;
        }
        return true;
    }

    private float id_final() {
        return (rbF_2.id_return(this.id_class).nextFloat() * 2.0f - 1.0f) * 0.33333334f;
    }

    private void id_volatile() {
        this.id_class.id_super().id_class(this.id_catch.id_class(), this.id_catch.id_break(), this.id_catch.id_byte(), 0.35f);
    }

    public void id_native() {
        this.id_case = false;
    }
}

