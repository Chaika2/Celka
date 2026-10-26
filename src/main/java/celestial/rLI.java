/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jo_1;
import celestial.is_3;
import celestial.rLf_1;
import celestial.rLp_1;
import celestial.rLq_1;
import celestial.rLv_1;
import celestial.rRU;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfl_3;
import celestial.rfw_3;
import celestial.rjC_2;
import celestial.rls_3;
import celestial.rpB_2;
import celestial.rpr_3;
import celestial.xc_3;
import celestial.xu_3;

public class rLI
extends rLf_1 {
    private float id_extends;
    private float id_native;

    @Override
    public int id_class(rLq_1[] rLq_1Array, rLq_1 rLq_12) {
        rLq_1 rLq_13;
        boolean bl;
        int n = 0;
        boolean bl2 = true;
        rfH_2 rfH_22 = new rfH_2(rLq_12.id_class, rLq_12.id_break, rLq_12.id_byte);
        double d = this.id_break(rfH_22);
        rLq_1 rLq_14 = this.id_class(rLq_12.id_class, rLq_12.id_break, rLq_12.id_byte + 1, 1, d);
        rLq_1 rLq_15 = this.id_class(rLq_12.id_class - 1, rLq_12.id_break, rLq_12.id_byte, 1, d);
        rLq_1 rLq_16 = this.id_class(rLq_12.id_class + 1, rLq_12.id_break, rLq_12.id_byte, 1, d);
        rLq_1 rLq_17 = this.id_class(rLq_12.id_class, rLq_12.id_break, rLq_12.id_byte - 1, 1, d);
        rLq_1 rLq_18 = this.id_class(rLq_12.id_class, rLq_12.id_break + 1, rLq_12.id_byte, 0, d);
        rLq_1 rLq_19 = this.id_class(rLq_12.id_class, rLq_12.id_break - 1, rLq_12.id_byte, 1, d);
        if (rLq_14 != null && !rLq_14.id_implements) {
            rLq_1Array[n++] = rLq_14;
        }
        if (rLq_15 != null && !rLq_15.id_implements) {
            rLq_1Array[n++] = rLq_15;
        }
        if (rLq_16 != null && !rLq_16.id_implements) {
            rLq_1Array[n++] = rLq_16;
        }
        if (rLq_17 != null && !rLq_17.id_implements) {
            rLq_1Array[n++] = rLq_17;
        }
        if (rLq_18 != null && !rLq_18.id_implements) {
            rLq_1Array[n++] = rLq_18;
        }
        if (rLq_19 != null && !rLq_19.id_implements) {
            rLq_1Array[n++] = rLq_19;
        }
        boolean bl3 = rLq_17 == null || rLq_17.id_native == rLp_1.OPEN || rLq_17.id_extends != 0.0f;
        boolean bl4 = rLq_14 == null || rLq_14.id_native == rLp_1.OPEN || rLq_14.id_extends != 0.0f;
        boolean bl5 = rLq_16 == null || rLq_16.id_native == rLp_1.OPEN || rLq_16.id_extends != 0.0f;
        boolean bl6 = bl = rLq_15 == null || rLq_15.id_native == rLp_1.OPEN || rLq_15.id_extends != 0.0f;
        if (bl3 && bl && (rLq_13 = this.id_class(rLq_12.id_class - 1, rLq_12.id_break, rLq_12.id_byte - 1, 1, d)) != null && !rLq_13.id_implements) {
            rLq_1Array[n++] = rLq_13;
        }
        if (bl3 && bl5 && (rLq_13 = this.id_class(rLq_12.id_class + 1, rLq_12.id_break, rLq_12.id_byte - 1, 1, d)) != null && !rLq_13.id_implements) {
            rLq_1Array[n++] = rLq_13;
        }
        if (bl4 && bl && (rLq_13 = this.id_class(rLq_12.id_class - 1, rLq_12.id_break, rLq_12.id_byte + 1, 1, d)) != null && !rLq_13.id_implements) {
            rLq_1Array[n++] = rLq_13;
        }
        if (bl4 && bl5 && (rLq_13 = this.id_class(rLq_12.id_class + 1, rLq_12.id_break, rLq_12.id_byte + 1, 1, d)) != null && !rLq_13.id_implements) {
            rLq_1Array[n++] = rLq_13;
        }
        return n;
    }

    private rLq_1 id_class(int n, int n2, int n3, int n4, double d) {
        rLq_1 rLq_12 = null;
        rfH_2 rfH_22 = new rfH_2(n, n2, n3);
        double d2 = this.id_break(rfH_22);
        if (d2 - d > 1.125) {
            return null;
        }
        rLp_1 rLp_12 = this.id_class(this.id_class, n, n2, n3, this.id_break, this.id_protected, this.id_throws, this.id_case, false, false);
        float f = this.id_break.id_class(rLp_12);
        double d3 = (double)this.id_break.PN() / 2.0;
        if (f >= 0.0f) {
            rLq_12 = this.id_class(n, n2, n3);
            rLq_12.id_native = rLp_12;
            rLq_12.id_extends = Math.max(rLq_12.id_extends, f);
        }
        if (rLp_12 != rLp_1.WATER && rLp_12 != rLp_1.WALKABLE) {
            if (rLq_12 == null && n4 > 0 && rLp_12 != rLp_1.FENCE && rLp_12 != rLp_1.UNPASSABLE_RAIL && rLp_12 != rLp_1.TRAPDOOR) {
                rLq_12 = this.id_class(n, n2 + 1, n3, n4 - 1, d);
            }
            if (rLp_12 == rLp_1.OPEN) {
                rfl_3 rfl_32 = new rfl_3((double)n - d3 + 0.5, (double)n2 + 0.001, (double)n3 - d3 + 0.5, (double)n + d3 + 0.5, (float)n2 + this.id_break.Bm(), (double)n3 + d3 + 0.5);
                if (!((rYB)this.id_break.id_throws[7]).a_(this.id_break, rfl_32)) {
                    return null;
                }
                rLp_1 rLp_13 = this.id_class(this.id_class, n, n2 - 1, n3, this.id_break, this.id_protected, this.id_throws, this.id_case, false, false);
                if (rLp_13 == rLp_1.BLOCKED) {
                    rLq_12 = this.id_class(n, n2, n3);
                    rLq_12.id_native = rLp_1.WALKABLE;
                    rLq_12.id_extends = Math.max(rLq_12.id_extends, f);
                    return rLq_12;
                }
                if (rLp_13 == rLp_1.WATER) {
                    rLq_12 = this.id_class(n, n2, n3);
                    rLq_12.id_native = rLp_1.WATER;
                    rLq_12.id_extends = Math.max(rLq_12.id_extends, f);
                    return rLq_12;
                }
                int n5 = 0;
                while (n2 > 0 && rLp_12 == rLp_1.OPEN) {
                    --n2;
                    if (n5++ >= this.id_break.rp()) {
                        return null;
                    }
                    rLp_12 = this.id_class(this.id_class, n, n2, n3, this.id_break, this.id_protected, this.id_throws, this.id_case, false, false);
                    f = this.id_break.id_class(rLp_12);
                    if (rLp_12 != rLp_1.OPEN && f >= 0.0f) {
                        rLq_12 = this.id_class(n, n2, n3);
                        rLq_12.id_native = rLp_12;
                        rLq_12.id_extends = Math.max(rLq_12.id_extends, f);
                        break;
                    }
                    if (!(f < 0.0f)) continue;
                    return null;
                }
            }
            return rLq_12;
        }
        if (n2 < ((rYB)this.id_break.id_throws[7]).id_short() - 10 && rLq_12 != null) {
            rLq_12.id_extends += 1.0f;
        }
        return rLq_12;
    }

    @Override
    protected rLp_1 id_class(rRq_1 rRq_12, boolean bl, boolean bl2, rfH_2 rfH_22, rLp_1 rLp_12) {
        if (rLp_12 == rLp_1.RAIL && !(rRq_12.id_byte(rfH_22).id_break() instanceof Jo_1) && !(rRq_12.id_byte(rfH_22.id_break()).id_break() instanceof Jo_1)) {
            rLp_12 = rLp_1.UNPASSABLE_RAIL;
        }
        if (rLp_12 == rLp_1.DOOR_OPEN || rLp_12 == rLp_1.DOOR_WOOD_CLOSED || rLp_12 == rLp_1.DOOR_IRON_CLOSED) {
            rLp_12 = rLp_1.BLOCKED;
        }
        if (rLp_12 == rLp_1.LEAVES) {
            rLp_12 = rLp_1.BLOCKED;
        }
        return rLp_12;
    }

    @Override
    public rLp_1 id_class(rRq_1 rRq_12, int n, int n2, int n3) {
        rfw_3 rfw_32 = new rfw_3();
        rLp_1 rLp_12 = rLI.id_break(rRq_12, rfw_32.id_class(n, n2, n3));
        if (rLp_12 == rLp_1.WATER) {
            for (rpr_3 rpr_32 : rpr_3.values()) {
                rLp_1 rLp_13 = rLI.id_break(rRq_12, rfw_32.id_class(n, n2, n3).id_class(rpr_32));
                if (rLp_13 != rLp_1.BLOCKED) continue;
                return rLp_1.WATER_BORDER;
            }
            return rLp_1.WATER;
        }
        if (rLp_12 == rLp_1.OPEN && n2 >= 1) {
            xc_3 xc_32 = rRq_12.id_byte(new rfH_2(n, n2 - 1, n3));
            rLp_1 rLp_14 = rLI.id_break(rRq_12, rfw_32.id_class(n, n2 - 1, n3));
            rLp_12 = rLp_14 != rLp_1.WALKABLE && rLp_14 != rLp_1.OPEN && rLp_14 != rLp_1.LAVA ? rLp_1.WALKABLE : rLp_1.OPEN;
            if (rLp_14 == rLp_1.DAMAGE_FIRE || xc_32.id_class(xu_3.bV) || xc_32.id_class(rls_3.l)) {
                rLp_12 = rLp_1.DAMAGE_FIRE;
            }
            if (rLp_14 == rLp_1.DAMAGE_CACTUS) {
                rLp_12 = rLp_1.DAMAGE_CACTUS;
            }
            if (rLp_14 == rLp_1.DAMAGE_OTHER) {
                rLp_12 = rLp_1.DAMAGE_OTHER;
            }
        }
        if (rLp_12 == rLp_1.WALKABLE) {
            rLp_12 = rLI.id_class(rRq_12, rfw_32.id_class(n, n2, n3), rLp_12);
        }
        return rLp_12;
    }

    @Override
    public void id_class() {
        this.id_break.id_class(rLp_1.WALKABLE, this.id_extends);
        this.id_break.id_class(rLp_1.WATER_BORDER, this.id_native);
        super.id_class();
    }

    @Override
    public void id_class(rRU rRU2, is_3 is_32) {
        super.id_class(rRU2, is_32);
        is_32.id_class(rLp_1.WATER, 0.0f);
        this.id_extends = is_32.id_class(rLp_1.WALKABLE);
        is_32.id_class(rLp_1.WALKABLE, 6.0f);
        this.id_native = is_32.id_class(rLp_1.WATER_BORDER);
        is_32.id_class(rLp_1.WATER_BORDER, 4.0f);
    }

    @Override
    public rLv_1 id_class(double d, double d2, double d3) {
        return new rLv_1(this.id_class(rfU_2.id_byte(d), rfU_2.id_byte(d2 + 0.5), rfU_2.id_byte(d3)));
    }

    private double id_break(rfH_2 rfH_22) {
        if (!this.id_break.rT()) {
            rfH_2 rfH_23 = rfH_22.id_break();
            rjC_2 rjC_22 = this.id_class.id_byte(rfH_23).id_extends(this.id_class, rfH_23);
            return (double)rfH_23.c_() + (rjC_22.id_break() ? 0.0 : rjC_22.id_byte(rpB_2.Y));
        }
        return (double)rfH_22.c_() + 0.5;
    }

    @Override
    public rLq_1 id_break() {
        return this.id_class(rfU_2.id_byte(this.id_break.rN().id_class), rfU_2.id_byte(this.id_break.rN().id_break + 0.5), rfU_2.id_byte(this.id_break.rN().id_byte));
    }
}

