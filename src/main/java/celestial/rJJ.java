/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.eA_2;
import celestial.ev_3;
import celestial.rJP;
import celestial.rJW;
import celestial.rJY;
import celestial.rJd_1;
import celestial.rJf_1;
import celestial.rJk_1;
import celestial.rJr_1;
import celestial.rJx_1;
import celestial.rXd_1;
import celestial.rXu_1;
import celestial.rYB;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rhd_3;
import celestial.rhz_3;
import celestial.rpq_3;
import celestial.xu_3;
import java.util.Map;
import java.util.stream.Collectors;

public class rJJ
extends rJr_1 {
    private final rXu_1 id_class = new rXd_1();
    public final rXu_1 id_break = new rJx_1(this, 2);
    private final rpq_3 id_byte;

    public rJJ(int n, rhz_3 rhz_32) {
        this(n, rhz_32, rpq_3.id_class);
    }

    public rJJ(int n, rhz_3 rhz_32, rpq_3 rpq_32) {
        super(rJP.id_package, n);
        int n2;
        this.id_byte = rpq_32;
        this.id_break(new rJd_1(this, this.id_break, 0, 49, 19));
        this.id_break(new rJk_1(this, this.id_break, 1, 49, 40));
        this.id_break(new rJW(this, this.id_class, 2, 129, 34, rpq_32));
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
            rdn_32 = rdn_33.id_implements();
            rdn_3 rdn_34 = this.id_break.id_extends(0);
            rdn_3 rdn_35 = this.id_break.id_extends(1);
            if (n == 2) {
                if (!this.id_class(rdn_33, 3, 39, true)) {
                    return rdn_3.id_break;
                }
                rJY2.id_class(rdn_33, rdn_32);
            } else if (n != 0 && n != 1 ? (!rdn_34.id_class() && !rdn_35.id_class() ? (n >= 3 && n < 30 ? !this.id_class(rdn_33, 30, 39, false) : n >= 30 && n < 39 && !this.id_class(rdn_33, 3, 30, false)) : !this.id_class(rdn_33, 0, 2, false)) : !this.id_class(rdn_33, 3, 39, false)) {
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
    public boolean id_class(rhd_3 rhd_32) {
        return rJJ.id_class(this.id_byte, rhd_32, xu_3.XS);
    }

    private void id_class() {
        boolean bl;
        rdn_3 rdn_32 = this.id_break.id_extends(0);
        rdn_3 rdn_33 = this.id_break.id_extends(1);
        boolean bl2 = !rdn_32.id_class() || !rdn_33.id_class();
        boolean bl3 = bl = !rdn_32.id_class() && !rdn_33.id_class();
        if (!bl2) {
            this.id_class.id_break(0, rdn_3.id_break);
        } else {
            rdn_3 rdn_34;
            int n;
            boolean bl4;
            boolean bl5 = bl4 = !rdn_32.id_class() && rdn_32.id_break() != rdy_3.dm && !rdn_32.id_public() || !rdn_33.id_class() && rdn_33.id_break() != rdy_3.dm && !rdn_33.id_public();
            if (rdn_32.id_char() > 1 || rdn_33.id_char() > 1 || !bl && bl4) {
                this.id_class.id_break(0, rdn_3.id_break);
                this.id_native();
                return;
            }
            int n2 = 1;
            if (bl) {
                if (rdn_32.id_break() != rdn_33.id_break()) {
                    this.id_class.id_break(0, rdn_3.id_break);
                    this.id_native();
                    return;
                }
                rdb_3 rdb_32 = rdn_32.id_break();
                int n3 = rdb_32.id_finally() - rdn_32.id_catch();
                int n4 = rdb_32.id_finally() - rdn_33.id_catch();
                int n5 = n3 + n4 + rdb_32.id_finally() * 5 / 100;
                n = Math.max(rdb_32.id_finally() - n5, 0);
                rdn_34 = this.id_break(rdn_32, rdn_33);
                if (!rdn_34.id_throws()) {
                    if (!rdn_3.id_break(rdn_32, rdn_33)) {
                        this.id_class.id_break(0, rdn_3.id_break);
                        this.id_native();
                        return;
                    }
                    n2 = 2;
                }
            } else {
                boolean bl6 = !rdn_32.id_class();
                n = bl6 ? rdn_32.id_catch() : rdn_33.id_catch();
                rdn_34 = bl6 ? rdn_32 : rdn_33;
            }
            this.id_class.id_break(0, this.id_class(rdn_34, n, n2));
        }
        this.id_native();
    }

    private rdn_3 id_class(rdn_3 rdn_32, int n, int n2) {
        rdn_3 rdn_33 = rdn_32.id_implements();
        rdn_33.id_byte("Enchantments");
        rdn_33.id_byte("StoredEnchantments");
        if (n > 0) {
            rdn_33.id_break(n);
        } else {
            rdn_33.id_byte("Damage");
        }
        rdn_33.id_throws(n2);
        Map<ev_3, Integer> map = eA_2.id_class(rdn_32).entrySet().stream().filter(entry -> ((ev_3)entry.getKey()).id_byte()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        eA_2.id_class(map, rdn_33);
        rdn_33.id_byte(0);
        if (rdn_33.id_break() == rdy_3.dm && map.size() == 0) {
            rdn_33 = new rdn_3(rdy_3.XM);
            if (rdn_32.id_this()) {
                rdn_33.id_class(rdn_32.id_continue());
            }
        }
        for (int i = 0; i < map.size(); ++i) {
            rdn_33.id_byte(rJf_1.id_protected(rdn_33.id_instanceof()));
        }
        return rdn_33;
    }

    @Override
    public void id_class(rXu_1 rXu_12) {
        super.id_class(rXu_12);
        if (rXu_12 == this.id_break) {
            this.id_class();
        }
    }

    @Override
    public void id_break(rhd_3 rhd_32) {
        super.id_break(rhd_32);
        this.id_byte.id_class((rYB rYB2, rfH_2 rfH_22) -> this.id_class(rhd_32, (rYB)rYB2, this.id_break));
    }

    private rdn_3 id_break(rdn_3 rdn_32, rdn_3 rdn_33) {
        rdn_3 rdn_34 = rdn_32.id_implements();
        Map<ev_3, Integer> map = eA_2.id_class(rdn_33);
        for (Map.Entry<ev_3, Integer> entry : map.entrySet()) {
            ev_3 ev_32 = entry.getKey();
            if (ev_32.id_byte() && eA_2.id_class(ev_32, rdn_34) != 0) continue;
            rdn_34.id_class(ev_32, entry.getValue());
        }
        return rdn_34;
    }
}

