/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.rJP;
import celestial.rJU;
import celestial.rJY;
import celestial.rJe_1;
import celestial.rJr_1;
import celestial.rWu_1;
import celestial.rXA;
import celestial.rXd_1;
import celestial.rXu_1;
import celestial.rYB;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rhd_3;
import celestial.rhz_3;
import celestial.rkj_3;
import celestial.rpj_3;
import celestial.rpq_3;
import celestial.xu_3;
import com.google.common.collect.Lists;
import java.util.List;

public class rJD
extends rJr_1 {
    private final rpq_3 id_protected;
    private final rpj_3 id_catch = rpj_3.id_class();
    private final rYB id_private;
    private List<rWu_1> id_implements = Lists.newArrayList();
    private rdn_3 id_finally = rdn_3.id_break;
    public long id_extends;
    public final rJY id_class;
    public final rJY id_break;
    public Runnable id_native = () -> {};
    public final rXu_1 id_byte = new rJU(this, 1);
    public final rXd_1 id_volatile = new rXd_1();

    public int id_byte() {
        return this.id_implements.size();
    }

    public rJD(int n, rhz_3 rhz_32) {
        this(n, rhz_32, rpq_3.id_class);
    }

    public rJD(int n, rhz_3 rhz_32, rpq_3 rpq_32) {
        super(rJP.id_public, n);
        int n2;
        this.id_protected = rpq_32;
        this.id_private = (rYB)rhz_32.id_throws.id_throws[7];
        this.id_class = this.id_break(new rJY(this.id_byte, 0, 20, 33));
        this.id_break = this.id_break(new rJe_1(this, this.id_volatile, 1, 143, 33, rpq_32));
        for (n2 = 0; n2 < 3; ++n2) {
            for (int i = 0; i < 9; ++i) {
                this.id_break(new rJY(rhz_32, i + n2 * 9 + 9, 8 + i * 18, 84 + n2 * 18));
            }
        }
        for (n2 = 0; n2 < 9; ++n2) {
            this.id_break(new rJY(rhz_32, n2, 8 + n2 * 18, 142));
        }
        this.id_class(this.id_catch);
    }

    public void id_class(Runnable runnable) {
        this.id_native = runnable;
    }

    @Override
    public void id_class(rXu_1 rXu_12) {
        rdn_3 rdn_32 = this.id_class.id_class();
        if (rdn_32.id_break() != this.id_finally.id_break()) {
            this.id_finally = rdn_32.id_implements();
            this.id_class(rXu_12, rdn_32);
        }
    }

    private void id_class(rXu_1 rXu_12, rdn_3 rdn_32) {
        this.id_implements.clear();
        this.id_catch.id_class(-1);
        this.id_break.id_break(rdn_3.id_break);
        if (!rdn_32.id_class()) {
            this.id_implements = this.id_private.id_implements().id_break(rkj_3.id_case, rXu_12, this.id_private);
        }
    }

    @Override
    public boolean id_class(rdn_3 rdn_32, rJY rJY2) {
        return rJY2.id_byte != this.id_volatile && super.id_class(rdn_32, rJY2);
    }

    @Override
    public rdn_3 id_class(rhd_3 rhd_32, int n) {
        rdn_3 rdn_32 = rdn_3.id_break;
        rJY rJY2 = (rJY)this.id_throws.get(n);
        if (rJY2 != null && rJY2.id_break()) {
            rdn_3 rdn_33 = rJY2.id_class();
            rdb_3 rdb_32 = rdn_33.id_break();
            rdn_32 = rdn_33.id_implements();
            if (n == 1) {
                rdb_32.id_break(rdn_33, (rYB)rhd_32.id_throws[7], rhd_32);
                if (!this.id_class(rdn_33, 2, 38, true)) {
                    return rdn_3.id_break;
                }
                rJY2.id_class(rdn_33, rdn_32);
            } else if (n == 0 ? !this.id_class(rdn_33, 2, 38, false) : (this.id_private.id_implements().id_class(rkj_3.id_case, new rXA(rdn_33), this.id_private).isPresent() ? !this.id_class(rdn_33, 0, 1, false) : (n >= 2 && n < 29 ? !this.id_class(rdn_33, 29, 38, false) : n >= 29 && n < 38 && !this.id_class(rdn_33, 2, 29, false)))) {
                return rdn_3.id_break;
            }
            if (rdn_33.id_class()) {
                rJY2.id_break(rdn_3.id_break);
            }
            rJY2.id_byte();
            if (rdn_33.id_char() == rdn_32.id_char()) {
                return rdn_3.id_break;
            }
            rJY2.id_class(rhd_32, rdn_33);
            this.id_native();
        }
        return rdn_32;
    }

    public int id_class() {
        return this.id_catch.id_break();
    }

    @Override
    public boolean id_class(rhd_3 rhd_32) {
        return rJD.id_class(this.id_protected, rhd_32, xu_3.XG);
    }

    @Override
    public boolean id_break(rhd_3 rhd_32, int n) {
        if (this.id_protected(n)) {
            this.id_catch.id_class(n);
            this.id_throws();
        }
        return true;
    }

    @Override
    public void id_break(rhd_3 rhd_32) {
        super.id_break(rhd_32);
        this.id_volatile.id_native(1);
        this.id_protected.id_class((rYB rYB2, rfH_2 rfH_22) -> this.id_class(rhd_32, (rYB)rhd_32.id_throws[7], this.id_byte));
    }

    public List<rWu_1> id_break() {
        return this.id_implements;
    }

    public void id_throws() {
        if (!this.id_implements.isEmpty() && this.id_protected(this.id_catch.id_break())) {
            rWu_1 rWu_12 = this.id_implements.get(this.id_catch.id_break());
            this.id_volatile.id_class(rWu_12);
            this.id_break.id_break(rWu_12.id_class(this.id_byte));
        } else {
            this.id_break.id_break(rdn_3.id_break);
        }
        this.id_native();
    }

    @Override
    public rJP<?> id_finally() {
        return rJP.id_public;
    }

    private boolean id_protected(int n) {
        return n >= 0 && n < this.id_implements.size();
    }

    public boolean id_protected() {
        return this.id_class.id_break() && !this.id_implements.isEmpty();
    }
}

