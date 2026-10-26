/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.is_3;
import celestial.rJI;
import celestial.rJS;
import celestial.rJY;
import celestial.rJa_1;
import celestial.rJt_1;
import celestial.rJw_1;
import celestial.rWr_1;
import celestial.rXN;
import celestial.rXQ;
import celestial.rXd_1;
import celestial.rXk_1;
import celestial.rXu_1;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rhd_3;
import celestial.rhz_3;
import celestial.rke_3;
import celestial.rkw_3;
import celestial.rqO_2;

public class rJT
extends rJI<rXk_1> {
    public static final rqO_2 id_class = new rqO_2("textures/atlas/blocks.png");
    public static final rqO_2 id_break = new rqO_2("item/empty_armor_slot_helmet");
    public static final rqO_2 id_byte = new rqO_2("item/empty_armor_slot_chestplate");
    public static final rqO_2 id_protected = new rqO_2("item/empty_armor_slot_leggings");
    public static final rqO_2 id_catch = new rqO_2("item/empty_armor_slot_boots");
    public static final rqO_2 id_private = new rqO_2("item/empty_armor_slot_shield");
    public static final rqO_2[] id_implements = new rqO_2[]{id_catch, id_protected, id_byte, id_break};
    public static final rXQ[] id_finally = new rXQ[]{rXQ.HEAD, rXQ.CHEST, rXQ.LEGS, rXQ.FEET};
    private final rXk_1 id_native = new rXk_1(this, 2, 2);
    private final rXd_1 id_volatile = new rXd_1();
    public final boolean id_extends;
    private final rhd_3 id_final;

    @Override
    public int id_byte() {
        return this.id_native.id_protected();
    }

    public rJT(rhz_3 rhz_32, boolean bl, rhd_3 rhd_32) {
        super(null, 0);
        int n;
        this.id_extends = bl;
        this.id_final = rhd_32;
        this.id_break(new rJS(rhz_32.id_throws, this.id_native, this.id_volatile, 0, 154, 28));
        for (n = 0; n < 2; ++n) {
            for (int i = 0; i < 2; ++i) {
                this.id_break(new rJY(this.id_native, i + n * 2, 98 + i * 18, 18 + n * 18));
            }
        }
        for (n = 0; n < 4; ++n) {
            rXQ rXQ2 = id_finally[n];
            this.id_break(new rJt_1(this, rhz_32, 39 - n, 8, 8 + n * 18, rXQ2));
        }
        for (n = 0; n < 3; ++n) {
            for (int i = 0; i < 9; ++i) {
                this.id_break(new rJY(rhz_32, i + (n + 1) * 9, 8 + i * 18, 84 + n * 18));
            }
        }
        for (n = 0; n < 9; ++n) {
            this.id_break(new rJY(rhz_32, n, 8 + n * 18, 142));
        }
        this.id_break(new rJw_1(this, rhz_32, 40, 77, 62));
    }

    @Override
    public rdn_3 id_class(rhd_3 rhd_32, int n) {
        rdn_3 rdn_32 = rdn_3.id_break;
        rJY rJY2 = (rJY)this.id_throws.get(n);
        if (rJY2 != null && rJY2.id_break()) {
            int n2;
            rdn_3 rdn_33 = rJY2.id_class();
            rdn_32 = rdn_33.id_implements();
            rXQ rXQ2 = is_3.id_finally(rdn_32);
            if (n == 0) {
                if (!this.id_class(rdn_33, 9, 45, true)) {
                    return rdn_3.id_break;
                }
                rJY2.id_class(rdn_33, rdn_32);
            } else if (n >= 1 && n < 5 ? !this.id_class(rdn_33, 9, 45, false) : (n >= 5 && n < 9 ? !this.id_class(rdn_33, 9, 45, false) : (rXQ2.id_class() == rXN.ARMOR && !((rJY)this.id_throws.get(8 - rXQ2.id_break())).id_break() ? !this.id_class(rdn_33, n2 = 8 - rXQ2.id_break(), n2 + 1, false) : (rXQ2 == rXQ.OFFHAND && !((rJY)this.id_throws.get(45)).id_break() ? !this.id_class(rdn_33, 45, 46, false) : (n >= 9 && n < 36 ? !this.id_class(rdn_33, 36, 45, false) : (n >= 36 && n < 45 ? !this.id_class(rdn_33, 9, 36, false) : !this.id_class(rdn_33, 9, 45, false))))))) {
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
    public void id_class() {
        this.id_volatile.id_public();
        this.id_native.id_public();
    }

    @Override
    public boolean id_class(rdn_3 rdn_32, rJY rJY2) {
        return rJY2.id_byte != this.id_volatile && super.id_class(rdn_32, rJY2);
    }

    @Override
    public void id_class(rWr_1 rWr_12) {
        this.id_native.id_class(rWr_12);
    }

    @Override
    public boolean id_class(rkw_3<? super rXk_1> rkw_32) {
        return rkw_32.id_class(this.id_native, (rYB)this.id_final.id_throws[7]);
    }

    @Override
    public void id_class(rXu_1 rXu_12) {
        rJa_1.id_class(this.id_case, (rYB)this.id_final.id_throws[7], this.id_final, this.id_native, this.id_volatile);
    }

    @Override
    public boolean id_class(rhd_3 rhd_32) {
        return true;
    }

    @Override
    public int id_break() {
        return 0;
    }

    @Override
    public void id_break(rhd_3 rhd_32) {
        super.id_break(rhd_32);
        this.id_volatile.id_public();
        if (!((rYB)rhd_32.id_throws[7]).id_continue) {
            this.id_class(rhd_32, (rYB)rhd_32.id_throws[7], this.id_native);
        }
    }

    @Override
    public int id_throws() {
        return 5;
    }

    public rXk_1 id_case() {
        return this.id_native;
    }

    @Override
    public rke_3 id_implements() {
        return rke_3.CRAFTING;
    }

    @Override
    public int id_protected() {
        return this.id_native.id_byte();
    }
}

