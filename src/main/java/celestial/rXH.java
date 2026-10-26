/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rHS;
import celestial.rJI;
import celestial.rJP;
import celestial.rJX;
import celestial.rJY;
import celestial.rJh_1;
import celestial.rWG;
import celestial.rWr_1;
import celestial.rXA;
import celestial.rXZ;
import celestial.rXu_1;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rhN_2;
import celestial.rhd_3;
import celestial.rhz_3;
import celestial.rke_3;
import celestial.rkj_3;
import celestial.rkv_3;
import celestial.rkw_3;
import celestial.rpF_2;
import celestial.rpI_2;

public abstract class rXH
extends rJI<rXu_1> {
    private final rXu_1 id_break;
    private final rpF_2 id_byte;
    protected final rYB id_class;
    private final rkj_3<? extends rkv_3> id_protected;
    private final rke_3 id_catch;

    @Override
    public int id_byte() {
        return 1;
    }

    protected rXH(rJP<?> rJP2, rkj_3<? extends rkv_3> rkj_32, rke_3 rke_32, int n, rhz_3 rhz_32) {
        this(rJP2, rkj_32, rke_32, n, rhz_32, new rXA(3), new rpI_2(4));
    }

    protected rXH(rJP<?> rJP2, rkj_3<? extends rkv_3> rkj_32, rke_3 rke_32, int n, rhz_3 rhz_32, rXu_1 rXu_12, rpF_2 rpF_22) {
        super(rJP2, n);
        int n2;
        this.id_protected = rkj_32;
        this.id_catch = rke_32;
        rXH.id_class(rXu_12, 3);
        rXH.id_class(rpF_22, 4);
        this.id_break = rXu_12;
        this.id_byte = rpF_22;
        this.id_class = (rYB)rhz_32.id_throws.id_throws[7];
        this.id_break(new rJY(rXu_12, 0, 56, 17));
        this.id_break(new rJh_1(this, rXu_12, 1, 56, 53));
        this.id_break(new rJX(rhz_32.id_throws, rXu_12, 2, 116, 35));
        for (n2 = 0; n2 < 3; ++n2) {
            for (int i = 0; i < 9; ++i) {
                this.id_break(new rJY(rhz_32, i + n2 * 9 + 9, 8 + i * 18, 84 + n2 * 18));
            }
        }
        for (n2 = 0; n2 < 9; ++n2) {
            this.id_break(new rJY(rhz_32, n2, 8 + n2 * 18, 142));
        }
        this.id_class(rpF_22);
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
            } else if (n != 1 && n != 0 ? (this.id_class(rdn_33) ? !this.id_class(rdn_33, 0, 1, false) : (this.id_break(rdn_33) ? !this.id_class(rdn_33, 1, 2, false) : (n >= 3 && n < 30 ? !this.id_class(rdn_33, 30, 39, false) : n >= 30 && n < 39 && !this.id_class(rdn_33, 3, 30, false)))) : !this.id_class(rdn_33, 3, 39, false)) {
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

    protected boolean id_class(rdn_3 rdn_32) {
        return this.id_class.id_implements().id_class(this.id_protected, new rXA(rdn_32), this.id_class).isPresent();
    }

    @Override
    public boolean id_class(rhd_3 rhd_32) {
        return this.id_break.id_byte(rhd_32);
    }

    @Override
    public void id_class(rWr_1 rWr_12) {
        if (this.id_break instanceof rXZ) {
            ((rXZ)((Object)this.id_break)).id_class(rWr_12);
        }
    }

    @Override
    public void id_class() {
        this.id_break.id_public();
    }

    @Override
    public boolean id_class(rkw_3<? super rXu_1> rkw_32) {
        return rkw_32.id_class(this.id_break, this.id_class);
    }

    @Override
    public void id_class(boolean bl, rkw_3<?> rkw_32, rhN_2 rhN_22) {
        new rWG<rXu_1>(this).id_class(rhN_22, rkw_32, bl);
    }

    @Override
    public int id_break() {
        return 2;
    }

    protected boolean id_break(rdn_3 rdn_32) {
        return rHS.id_break(rdn_32);
    }

    @Override
    public int id_throws() {
        return 3;
    }

    public int id_catch() {
        int n = this.id_byte.id_class(1);
        if (n == 0) {
            n = 200;
        }
        return this.id_byte.id_class(0) * 13 / n;
    }

    public int id_case() {
        int n = this.id_byte.id_class(2);
        int n2 = this.id_byte.id_class(3);
        return n2 != 0 && n != 0 ? n * 24 / n2 : 0;
    }

    @Override
    public rke_3 id_implements() {
        return this.id_catch;
    }

    @Override
    public int id_protected() {
        return 1;
    }

    public boolean id_private() {
        return this.id_byte.id_class(0) > 0;
    }
}

