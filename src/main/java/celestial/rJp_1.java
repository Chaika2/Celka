/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.ib_3;
import celestial.rJP;
import celestial.rJY;
import celestial.rJq_1;
import celestial.rJr_1;
import celestial.rXl_1;
import celestial.rXu_1;
import celestial.rYB;
import celestial.rdI_2;
import celestial.rdf_3;
import celestial.rdn_3;
import celestial.rhN_2;
import celestial.rhd_3;
import celestial.rhz_3;
import celestial.rqL_2;
import celestial.rsA_2;

public class rJp_1
extends rJr_1 {
    private final rsA_2 id_class;
    private final rXl_1 id_break;
    private int id_byte;
    private boolean id_protected;
    private boolean id_catch;

    public int id_byte() {
        return this.id_byte;
    }

    public rJp_1(int n, rhz_3 rhz_32) {
        this(n, rhz_32, new ib_3(rhz_32.id_throws));
    }

    public rJp_1(int n, rhz_3 rhz_32, rsA_2 rsA_22) {
        super(rJP.id_super, n);
        int n2;
        this.id_class = rsA_22;
        this.id_break = new rXl_1(rsA_22);
        this.id_break(new rJY(this.id_break, 0, 136, 37));
        this.id_break(new rJY(this.id_break, 1, 162, 37));
        this.id_break(new rJq_1(rhz_32.id_throws, rsA_22, this.id_break, 2, 220, 37));
        for (n2 = 0; n2 < 3; ++n2) {
            for (int i = 0; i < 9; ++i) {
                this.id_break(new rJY(rhz_32, i + n2 * 9 + 9, 108 + i * 18, 84 + n2 * 18));
            }
        }
        for (n2 = 0; n2 < 9; ++n2) {
            this.id_break(new rJY(rhz_32, n2, 108 + n2 * 18, 142));
        }
    }

    public int id_class() {
        return this.id_class.id_protected();
    }

    @Override
    public rdn_3 id_class(rhd_3 rhd_32, int n) {
        rdn_3 rdn_32 = rdn_3.id_break;
        rJY rJY2 = (rJY)this.id_throws.get(n);
        if (rJY2 != null && rJY2.id_break()) {
            rdn_3 rdn_33 = rJY2.id_class();
            rdn_32 = rdn_33.id_implements();
            if (n == 2) {
                if (!this.id_class(rdn_33, 3, 39, true)) {
                    return rdn_3.id_break;
                }
                rJY2.id_class(rdn_33, rdn_32);
                this.id_catch();
            } else if (n != 0 && n != 1 ? (n >= 3 && n < 30 ? !this.id_class(rdn_33, 30, 39, false) : n >= 30 && n < 39 && !this.id_class(rdn_33, 3, 30, false)) : !this.id_class(rdn_33, 3, 39, false)) {
                return rdn_3.id_break;
            }
            if (rdn_33.id_class()) {
                rJY2.id_break(rdn_3.id_break);
            } else {
                rJY2.id_byte();
            }
            if (rdn_33.id_char() == rdn_32.id_char()) {
                return rdn_3.id_break;
            }
            rJY2.id_class(rhd_32, rdn_33);
        }
        return rdn_32;
    }

    @Override
    public boolean id_class(rdn_3 rdn_32, rJY rJY2) {
        return false;
    }

    public void id_class(boolean bl) {
        this.id_protected = bl;
    }

    @Override
    public void id_class(rXu_1 rXu_12) {
        this.id_break.id_byte();
        super.id_class(rXu_12);
    }

    public void id_class(rdf_3 rdf_32) {
        this.id_class.id_class(rdf_32);
    }

    @Override
    public boolean id_class(rhd_3 rhd_32) {
        return this.id_class.id_class() == rhd_32;
    }

    private void id_break(int n, rdn_3 rdn_32) {
        if (!rdn_32.id_class()) {
            for (int i = 3; i < 39; ++i) {
                rdn_3 rdn_33 = ((rJY)this.id_throws.get(i)).id_class();
                if (rdn_33.id_class() || !this.id_break(rdn_32, rdn_33)) continue;
                rdn_3 rdn_34 = this.id_break.id_extends(n);
                int n2 = rdn_34.id_class() ? 0 : rdn_34.id_char();
                int n3 = Math.min(rdn_32.id_byte() - n2, rdn_33.id_char());
                rdn_3 rdn_35 = rdn_33.id_implements();
                int n4 = n2 + n3;
                rdn_33.id_catch(n3);
                rdn_35.id_throws(n4);
                this.id_break.id_break(n, rdn_35);
                if (n4 >= rdn_32.id_byte()) break;
            }
        }
    }

    private boolean id_break(rdn_3 rdn_32, rdn_3 rdn_33) {
        return rdn_32.id_break() == rdn_33.id_break() && rdn_3.id_class(rdn_32, rdn_33);
    }

    @Override
    public void id_break(rhd_3 rhd_32) {
        super.id_break(rhd_32);
        this.id_class.id_class((rhd_3)null);
        if (!this.id_class.id_byte().id_continue) {
            if (!rhd_32.BM() || rhd_32 instanceof rhN_2 && ((rhN_2)rhd_32).id_int()) {
                rdn_3 rdn_32 = this.id_break.id_native(0);
                if (!rdn_32.id_class()) {
                    rhd_32.id_class(rdn_32, false);
                }
                if (!(rdn_32 = this.id_break.id_native(1)).id_class()) {
                    rhd_32.id_class(rdn_32, false);
                }
            } else {
                ((rhz_3)rhd_32.id_implements[1]).id_class((rYB)rhd_32.id_throws[7], this.id_break.id_native(0));
                ((rhz_3)rhd_32.id_implements[1]).id_class((rYB)rhd_32.id_throws[7], this.id_break.id_native(1));
            }
        }
    }

    public int id_break() {
        return this.id_break.id_throws();
    }

    public void id_break(boolean bl) {
        this.id_catch = bl;
    }

    public rdf_3 id_throws() {
        return this.id_class.id_break();
    }

    public void id_throws(int n) {
        this.id_class.id_class(n);
    }

    public void id_catch(int n) {
        if (this.id_throws().size() > n) {
            rdn_3 rdn_32;
            rdn_3 rdn_33 = this.id_break.id_extends(0);
            if (!rdn_33.id_class()) {
                if (!this.id_class(rdn_33, 3, 39, true)) {
                    return;
                }
                this.id_break.id_break(0, rdn_33);
            }
            if (!(rdn_32 = this.id_break.id_extends(1)).id_class()) {
                if (!this.id_class(rdn_32, 3, 39, true)) {
                    return;
                }
                this.id_break.id_break(1, rdn_32);
            }
            if (this.id_break.id_extends(0).id_class() && this.id_break.id_extends(1).id_class()) {
                rdn_3 rdn_34 = ((rdI_2)this.id_throws().get(n)).id_break();
                this.id_break(0, rdn_34);
                rdn_3 rdn_35 = ((rdI_2)this.id_throws().get(n)).id_byte();
                this.id_break(1, rdn_35);
            }
        }
    }

    private void id_catch() {
        if (!this.id_class.id_byte().id_continue) {
            an_3 an_32 = (an_3)((Object)this.id_class);
            this.id_class.id_byte().id_class(an_32.rx(), an_32.re(), an_32.BO(), this.id_class.id_case(), rqL_2.NEUTRAL, 1.0f, 1.0f, false);
        }
    }

    public void id_case(int n) {
        this.id_byte = n;
    }

    public boolean id_case() {
        return this.id_protected;
    }

    public void id_protected(int n) {
        this.id_break.id_class(n);
    }

    public boolean id_protected() {
        return this.id_catch;
    }
}

