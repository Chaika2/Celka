/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rHE;
import celestial.rJA;
import celestial.rJC;
import celestial.rJH;
import celestial.rJP;
import celestial.rJY;
import celestial.rJl_1;
import celestial.rJn_1;
import celestial.rJr_1;
import celestial.rJy_1;
import celestial.rXu_1;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rcy_3;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rhd_3;
import celestial.rhz_3;
import celestial.rpj_3;
import celestial.rpq_3;
import celestial.rxA_2;
import celestial.rxL_2;
import celestial.rxO_2;
import celestial.rxh_3;
import celestial.xu_3;

public class rJL
extends rJr_1 {
    private final rpq_3 id_class;
    public final rpj_3 id_break = rpj_3.id_class();
    public Runnable id_byte = () -> {};
    public final rJY id_protected;
    public final rJY id_catch;
    private final rJY id_private;
    private final rJY id_implements;
    public long id_finally;
    private final rXu_1 id_extends = new rJA(this, 3);
    private final rXu_1 id_native = new rJn_1(this, 1);

    public rJY id_byte() {
        return this.id_catch;
    }

    public rJL(int n, rhz_3 rhz_32) {
        this(n, rhz_32, rpq_3.id_class);
    }

    public rJL(int n, rhz_3 rhz_32, rpq_3 rpq_32) {
        super(rJP.id_continue, n);
        int n2;
        this.id_class = rpq_32;
        this.id_protected = this.id_break(new rJC(this, this.id_extends, 0, 13, 26));
        this.id_catch = this.id_break(new rJl_1(this, this.id_extends, 1, 33, 26));
        this.id_private = this.id_break(new rJH(this, this.id_extends, 2, 23, 45));
        this.id_implements = this.id_break(new rJy_1(this, this.id_native, 0, 143, 58, rpq_32));
        for (n2 = 0; n2 < 3; ++n2) {
            for (int i = 0; i < 9; ++i) {
                this.id_break(new rJY(rhz_32, i + n2 * 9 + 9, 8 + i * 18, 84 + n2 * 18));
            }
        }
        for (n2 = 0; n2 < 9; ++n2) {
            this.id_break(new rJY(rhz_32, n2, 8 + n2 * 18, 142));
        }
        this.id_class(this.id_break);
    }

    @Override
    public void id_class(rXu_1 rXu_12) {
        rdn_3 rdn_32 = this.id_protected.id_class();
        rdn_3 rdn_33 = this.id_catch.id_class();
        rdn_3 rdn_34 = this.id_private.id_class();
        rdn_3 rdn_35 = this.id_implements.id_class();
        if (rdn_35.id_class() || !rdn_32.id_class() && !rdn_33.id_class() && this.id_break.id_break() > 0 && (this.id_break.id_break() < rHE.BANNER_PATTERNS_COUNT - rHE.BANNERS_WITH_ITEMS || !rdn_34.id_class())) {
            if (!rdn_34.id_class() && rdn_34.id_break() instanceof rxh_3) {
                boolean bl;
                rcd_3 rcd_32 = rdn_32.id_class("BlockEntityTag");
                boolean bl2 = bl = rcd_32.id_byte("Patterns", 9) && !rdn_32.id_class() && rcd_32.id_protected("Patterns", 10).size() >= 6;
                if (bl) {
                    this.id_break.id_class(0);
                } else {
                    this.id_break.id_class(((rxh_3)rdn_34.id_break()).id_byte().ordinal());
                }
            }
        } else {
            this.id_implements.id_break(rdn_3.id_break);
            this.id_break.id_class(0);
        }
        this.id_case();
        this.id_native();
    }

    public void id_class(Runnable runnable) {
        this.id_byte = runnable;
    }

    @Override
    public rdn_3 id_class(rhd_3 rhd_32, int n) {
        rdn_3 rdn_32 = rdn_3.id_break;
        rJY rJY2 = (rJY)this.id_throws.get(n);
        if (rJY2 != null && rJY2.id_break()) {
            rdn_3 rdn_33 = rJY2.id_class();
            rdn_32 = rdn_33.id_implements();
            if (n == this.id_implements.id_protected) {
                if (!this.id_class(rdn_33, 4, 40, true)) {
                    return rdn_3.id_break;
                }
                rJY2.id_class(rdn_33, rdn_32);
            } else if (n != this.id_catch.id_protected && n != this.id_protected.id_protected && n != this.id_private.id_protected ? (rdn_33.id_break() instanceof rxO_2 ? !this.id_class(rdn_33, this.id_protected.id_protected, this.id_protected.id_protected + 1, false) : (rdn_33.id_break() instanceof rxA_2 ? !this.id_class(rdn_33, this.id_catch.id_protected, this.id_catch.id_protected + 1, false) : (rdn_33.id_break() instanceof rxh_3 ? !this.id_class(rdn_33, this.id_private.id_protected, this.id_private.id_protected + 1, false) : (n >= 4 && n < 31 ? !this.id_class(rdn_33, 31, 40, false) : n >= 31 && n < 40 && !this.id_class(rdn_33, 4, 31, false))))) : !this.id_class(rdn_33, 4, 40, false)) {
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

    public int id_class() {
        return this.id_break.id_break();
    }

    @Override
    public boolean id_class(rhd_3 rhd_32) {
        return rJL.id_class(this.id_class, rhd_32, xu_3.he);
    }

    public rJY id_break() {
        return this.id_protected;
    }

    @Override
    public boolean id_break(rhd_3 rhd_32, int n) {
        if (n > 0 && n <= rHE.PATTERN_ITEM_INDEX) {
            this.id_break.id_class(n);
            this.id_case();
            return true;
        }
        return false;
    }

    @Override
    public void id_break(rhd_3 rhd_32) {
        super.id_break(rhd_32);
        this.id_class.id_class((rYB rYB2, rfH_2 rfH_22) -> this.id_class(rhd_32, (rYB)rhd_32.id_throws[7], this.id_extends));
    }

    public rJY id_throws() {
        return this.id_implements;
    }

    private void id_case() {
        if (this.id_break.id_break() > 0) {
            rdn_3 rdn_32 = this.id_protected.id_class();
            rdn_3 rdn_33 = this.id_catch.id_class();
            rdn_3 rdn_34 = rdn_3.id_break;
            if (!rdn_32.id_class() && !rdn_33.id_class()) {
                rcy_3 rcy_32;
                rdn_34 = rdn_32.id_implements();
                rdn_34.id_throws(1);
                rHE rHE2 = rHE.values()[this.id_break.id_break()];
                rxL_2 rxL_22 = ((rxA_2)rdn_33.id_break()).id_byte();
                rcd_3 rcd_32 = rdn_34.id_class("BlockEntityTag");
                if (rcd_32.id_byte("Patterns", 9)) {
                    rcy_32 = rcd_32.id_protected("Patterns", 10);
                } else {
                    rcy_32 = new rcy_3();
                    rcd_32.id_class("Patterns", rcy_32);
                }
                rcd_3 rcd_33 = new rcd_3();
                rcd_33.id_class("Pattern", rHE2.id_break());
                rcd_33.id_break("Color", rxL_22.id_break());
                rcy_32.add(rcd_33);
            }
            if (!rdn_3.id_break(rdn_34, this.id_implements.id_class())) {
                this.id_implements.id_break(rdn_34);
            }
        }
    }

    public rJY id_protected() {
        return this.id_private;
    }
}

