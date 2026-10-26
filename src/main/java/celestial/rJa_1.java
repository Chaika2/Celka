/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rFM;
import celestial.rJI;
import celestial.rJP;
import celestial.rJS;
import celestial.rJY;
import celestial.rWr_1;
import celestial.rXd_1;
import celestial.rXk_1;
import celestial.rXu_1;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rhN_2;
import celestial.rhd_3;
import celestial.rhz_3;
import celestial.rke_3;
import celestial.rkj_3;
import celestial.rkt_3;
import celestial.rkw_3;
import celestial.rpq_3;
import celestial.xu_3;
import java.util.Optional;

public class rJa_1
extends rJI<rXk_1> {
    private final rXk_1 id_class = new rXk_1(this, 3, 3);
    private final rXd_1 id_break = new rXd_1();
    private final rpq_3 id_byte;
    private final rhd_3 id_protected;

    @Override
    public int id_byte() {
        return this.id_class.id_protected();
    }

    public rJa_1(int n, rhz_3 rhz_32) {
        this(n, rhz_32, rpq_3.id_class);
    }

    public rJa_1(int n, rhz_3 rhz_32, rpq_3 rpq_32) {
        super(rJP.id_native, n);
        int n2;
        int n3;
        this.id_byte = rpq_32;
        this.id_protected = rhz_32.id_throws;
        this.id_break(new rJS(rhz_32.id_throws, this.id_class, this.id_break, 0, 124, 35));
        for (n3 = 0; n3 < 3; ++n3) {
            for (n2 = 0; n2 < 3; ++n2) {
                this.id_break(new rJY(this.id_class, n2 + n3 * 3, 30 + n2 * 18, 17 + n3 * 18));
            }
        }
        for (n3 = 0; n3 < 3; ++n3) {
            for (n2 = 0; n2 < 9; ++n2) {
                this.id_break(new rJY(rhz_32, n2 + n3 * 9 + 9, 8 + n2 * 18, 84 + n3 * 18));
            }
        }
        for (n3 = 0; n3 < 9; ++n3) {
            this.id_break(new rJY(rhz_32, n3, 8 + n3 * 18, 142));
        }
    }

    @Override
    public rdn_3 id_class(rhd_3 rhd_32, int n) {
        rdn_3 rdn_32 = rdn_3.id_break;
        rJY rJY2 = (rJY)this.id_throws.get(n);
        if (rJY2 != null && rJY2.id_break()) {
            rdn_3 rdn_33 = rJY2.id_class();
            rdn_32 = rdn_33.id_implements();
            if (n == 0) {
                this.id_byte.id_class((rYB rYB2, rfH_2 rfH_22) -> rdn_33.id_break().id_break(rdn_33, (rYB)rYB2, rhd_32));
                if (!this.id_class(rdn_33, 10, 46, true)) {
                    return rdn_3.id_break;
                }
                rJY2.id_class(rdn_33, rdn_32);
            } else if (n >= 10 && n < 46 ? !this.id_class(rdn_33, 1, 10, false) && (n < 37 ? !this.id_class(rdn_33, 37, 46, false) : !this.id_class(rdn_33, 10, 37, false)) : !this.id_class(rdn_33, 10, 46, false)) {
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
            rdn_3 rdn_34 = rJY2.id_class(rhd_32, rdn_33);
            if (n == 0) {
                rhd_32.id_class(rdn_34, false);
            }
        }
        return rdn_32;
    }

    @Override
    public boolean id_class(rdn_3 rdn_32, rJY rJY2) {
        return rJY2.id_byte != this.id_break && super.id_class(rdn_32, rJY2);
    }

    @Override
    public boolean id_class(rhd_3 rhd_32) {
        return rJa_1.id_class(this.id_byte, rhd_32, xu_3.PP);
    }

    @Override
    public void id_class(rWr_1 rWr_12) {
        this.id_class.id_class(rWr_12);
    }

    @Override
    public void id_class() {
        this.id_class.id_public();
        this.id_break.id_public();
    }

    @Override
    public void id_class(rXu_1 rXu_12) {
        this.id_byte.id_class((rYB rYB2, rfH_2 rfH_22) -> rJa_1.id_class(this.id_case, rYB2, this.id_protected, this.id_class, this.id_break));
    }

    @Override
    public boolean id_class(rkw_3<? super rXk_1> rkw_32) {
        return rkw_32.id_class(this.id_class, (rYB)this.id_protected.id_throws[7]);
    }

    protected static void id_class(int n, rYB rYB2, rhd_3 rhd_32, rXk_1 rXk_12, rXd_1 rXd_12) {
        if (!rYB2.id_continue) {
            rkt_3 rkt_32;
            rhN_2 rhN_22 = (rhN_2)rhd_32;
            rdn_3 rdn_32 = rdn_3.id_break;
            Optional<rkt_3> optional = rYB2.id_const().V().id_class(rkj_3.id_class, rXk_12, rYB2);
            if (optional.isPresent() && rXd_12.id_class(rYB2, rhN_22, rkt_32 = optional.get())) {
                rdn_32 = rkt_32.id_class(rXk_12);
            }
            rXd_12.id_break(0, rdn_32);
            rhN_22.id_class.id_class(new rFM(n, 0, rdn_32));
        }
    }

    @Override
    public void id_break(rhd_3 rhd_32) {
        super.id_break(rhd_32);
        this.id_byte.id_class((rYB rYB2, rfH_2 rfH_22) -> this.id_class(rhd_32, (rYB)rYB2, this.id_class));
    }

    @Override
    public int id_break() {
        return 0;
    }

    @Override
    public int id_throws() {
        return 10;
    }

    @Override
    public rke_3 id_implements() {
        return rke_3.CRAFTING;
    }

    @Override
    public int id_protected() {
        return this.id_class.id_byte();
    }
}

