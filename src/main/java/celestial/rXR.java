/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rJP;
import celestial.rJY;
import celestial.rJr_1;
import celestial.rXD;
import celestial.rXK;
import celestial.rXU;
import celestial.rXY;
import celestial.rXd_1;
import celestial.rXo_1;
import celestial.rXu_1;
import celestial.rYB;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rhd_3;
import celestial.rhz_3;
import celestial.rpq_3;
import celestial.rrGb_1;
import celestial.rxI_2;
import celestial.xu_3;

public class rXR
extends rJr_1 {
    private final rpq_3 id_break;
    public long id_byte;
    public final rXu_1 id_class = new rXY(this, 2);
    private final rXd_1 id_protected = new rXo_1(this);

    public rXR(int n, rhz_3 rhz_32) {
        this(n, rhz_32, rpq_3.id_class);
    }

    public rXR(int n, rhz_3 rhz_32, rpq_3 rpq_32) {
        super(rJP.id_return, n);
        int n2;
        this.id_break = rpq_32;
        this.id_break(new rXK(this, this.id_class, 0, 15, 15));
        this.id_break(new rXD(this, this.id_class, 1, 15, 52));
        this.id_break(new rXU(this, this.id_protected, 2, 145, 39, rpq_32));
        for (n2 = 0; n2 < 3; ++n2) {
            for (int i = 0; i < 9; ++i) {
                this.id_break(new rJY(rhz_32, i + n2 * 9 + 9, 8 + i * 18, 84 + n2 * 18));
            }
        }
        for (n2 = 0; n2 < 9; ++n2) {
            this.id_break(new rJY(rhz_32, n2, 8 + n2 * 18, 142));
        }
    }

    @Override
    public rdn_3 id_class(rhd_3 rhd_32, int n) {
        rdn_3 rdn_32 = rdn_3.id_break;
        rJY rJY2 = (rJY)this.id_throws.get(n);
        if (rJY2 != null && rJY2.id_break()) {
            rdn_3 rdn_33 = rJY2.id_class();
            rdb_3 rdb_32 = rdn_33.id_break();
            rdn_32 = rdn_33.id_implements();
            if (n == 2) {
                rdb_32.id_break(rdn_33, (rYB)rhd_32.id_throws[7], rhd_32);
                if (!this.id_class(rdn_33, 3, 39, true)) {
                    return rdn_3.id_break;
                }
                rJY2.id_class(rdn_33, rdn_32);
            } else if (n != 1 && n != 0 ? (rdb_32 == rdy_3.JX ? !this.id_class(rdn_33, 0, 1, false) : (rdb_32 != rdy_3.Xb && rdb_32 != rdy_3.dM && rdb_32 != rdy_3.BD ? (n >= 3 && n < 30 ? !this.id_class(rdn_33, 30, 39, false) : n >= 30 && n < 39 && !this.id_class(rdn_33, 3, 30, false)) : !this.id_class(rdn_33, 1, 2, false))) : !this.id_class(rdn_33, 3, 39, false)) {
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

    @Override
    public boolean id_class(rdn_3 rdn_32, rJY rJY2) {
        return rJY2.id_byte != this.id_protected && super.id_class(rdn_32, rJY2);
    }

    @Override
    public boolean id_class(rhd_3 rhd_32) {
        return rXR.id_class(this.id_break, rhd_32, xu_3.XP);
    }

    @Override
    public void id_class(rXu_1 rXu_12) {
        rdn_3 rdn_32 = this.id_class.id_extends(0);
        rdn_3 rdn_33 = this.id_class.id_extends(1);
        rdn_3 rdn_34 = this.id_protected.id_extends(2);
        if (rdn_34.id_class() || !rdn_32.id_class() && !rdn_33.id_class()) {
            if (!rdn_32.id_class() && !rdn_33.id_class()) {
                this.id_class(rdn_32, rdn_33, rdn_34);
            }
        } else {
            this.id_protected.id_native(2);
        }
    }

    private void id_class(rdn_3 rdn_32, rdn_3 rdn_33, rdn_3 rdn_34) {
        this.id_break.id_class((rYB rYB2, rfH_2 rfH_22) -> {
            rdb_3 rdb_32 = rdn_33.id_break();
            rrGb_1 rrGb_12 = rxI_2.id_class(rdn_32, rYB2);
            if (rrGb_12 != null) {
                rdn_3 rdn_35;
                if (rdb_32 == rdy_3.Xb && !rrGb_12.id_private && rrGb_12.id_case < 4) {
                    rdn_35 = rdn_32.id_implements();
                    rdn_35.id_throws(1);
                    rdn_35.id_int().id_break("map_scale_direction", 1);
                    this.id_native();
                } else if (rdb_32 == rdy_3.BD && !rrGb_12.id_private) {
                    rdn_35 = rdn_32.id_implements();
                    rdn_35.id_throws(1);
                    rdn_35.id_int().id_class("map_to_lock", true);
                    this.id_native();
                } else {
                    if (rdb_32 != rdy_3.dM) {
                        this.id_protected.id_native(2);
                        this.id_native();
                        return;
                    }
                    rdn_35 = rdn_32.id_implements();
                    rdn_35.id_throws(2);
                    this.id_native();
                }
                if (!rdn_3.id_break(rdn_35, rdn_34)) {
                    this.id_protected.id_break(2, rdn_35);
                    this.id_native();
                }
            }
        });
    }

    @Override
    public void id_break(rhd_3 rhd_32) {
        super.id_break(rhd_32);
        this.id_protected.id_native(2);
        this.id_break.id_class((rYB rYB2, rfH_2 rfH_22) -> this.id_class(rhd_32, (rYB)rhd_32.id_throws[7], this.id_class));
    }
}

