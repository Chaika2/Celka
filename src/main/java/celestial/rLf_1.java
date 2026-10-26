/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.objects.Object2BooleanMap
 *  it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap
 */
package celestial;

import celestial.Jo_1;
import celestial.QP;
import celestial.dN_2;
import celestial.dq_3;
import celestial.is_3;
import celestial.kZ_2;
import celestial.rLT;
import celestial.rLn_1;
import celestial.rLp_1;
import celestial.rLq_1;
import celestial.rLv_1;
import celestial.rRU;
import celestial.rRq_1;
import celestial.rXE;
import celestial.rXG;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfl_3;
import celestial.rfw_3;
import celestial.rjC_2;
import celestial.rjU_2;
import celestial.rlG_2;
import celestial.rls_3;
import celestial.rpB_2;
import celestial.rpr_3;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xn_3;
import celestial.xu_3;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.EnumSet;

public class rLf_1
extends rLn_1 {
    protected float id_finally;
    private final Long2ObjectMap<rLp_1> id_extends = new Long2ObjectOpenHashMap();
    private final Object2BooleanMap<rfl_3> id_native = new Object2BooleanOpenHashMap();

    protected rLp_1 id_class(rRq_1 rRq_12, boolean bl, boolean bl2, rfH_2 rfH_22, rLp_1 rLp_12) {
        if (rLp_12 == rLp_1.DOOR_WOOD_CLOSED && bl && bl2) {
            rLp_12 = rLp_1.WALKABLE_DOOR;
        }
        if (rLp_12 == rLp_1.DOOR_OPEN && !bl2) {
            rLp_12 = rLp_1.BLOCKED;
        }
        if (rLp_12 == rLp_1.RAIL && !(rRq_12.id_byte(rfH_22).id_break() instanceof Jo_1) && !(rRq_12.id_byte(rfH_22.id_break()).id_break() instanceof Jo_1)) {
            rLp_12 = rLp_1.UNPASSABLE_RAIL;
        }
        if (rLp_12 == rLp_1.LEAVES) {
            rLp_12 = rLp_1.BLOCKED;
        }
        return rLp_12;
    }

    private rLp_1 id_class(is_3 is_32, rfH_2 rfH_22) {
        return this.id_class(is_32, rfH_22.b_(), rfH_22.c_(), rfH_22.d_());
    }

    private rLp_1 id_class(is_3 is_32, int n, int n2, int n3) {
        return (rLp_1)((Object)this.id_extends.computeIfAbsent(rfH_2.id_throws(n, n2, n3), l -> this.id_class(this.id_class, n, n2, n3, is_32, this.id_protected, this.id_throws, this.id_case, this.id_protected(), this.id_byte())));
    }

    public rLp_1 id_class(rRq_1 rRq_12, int n, int n2, int n3, int n4, int n5, int n6, boolean bl, boolean bl2, EnumSet<rLp_1> enumSet, rLp_1 rLp_12, rfH_2 rfH_22) {
        for (int i = 0; i < n4; ++i) {
            for (int j = 0; j < n5; ++j) {
                for (int k = 0; k < n6; ++k) {
                    int n7 = i + n;
                    int n8 = j + n2;
                    int n9 = k + n3;
                    rLp_1 rLp_13 = this.id_class(rRq_12, n7, n8, n9);
                    rLp_13 = this.id_class(rRq_12, bl, bl2, rfH_22, rLp_13);
                    if (i == 0 && j == 0 && k == 0) {
                        rLp_12 = rLp_13;
                    }
                    enumSet.add(rLp_13);
                }
            }
        }
        return rLp_12;
    }

    @Override
    public rLp_1 id_class(rRq_1 rRq_12, int n, int n2, int n3, is_3 is_32, int n4, int n5, int n6, boolean bl, boolean bl2) {
        EnumSet<rLp_1> enumSet = EnumSet.noneOf(rLp_1.class);
        rLp_1 rLp_12 = rLp_1.BLOCKED;
        rfH_2 rfH_22 = is_32.Bs();
        rLp_12 = this.id_class(rRq_12, n, n2, n3, n4, n5, n6, bl, bl2, enumSet, rLp_12, rfH_22);
        if (enumSet.contains((Object)rLp_1.FENCE)) {
            return rLp_1.FENCE;
        }
        if (enumSet.contains((Object)rLp_1.UNPASSABLE_RAIL)) {
            return rLp_1.UNPASSABLE_RAIL;
        }
        rLp_1 rLp_13 = rLp_1.BLOCKED;
        for (rLp_1 rLp_14 : enumSet) {
            if (is_32.id_class(rLp_14) < 0.0f) {
                return rLp_14;
            }
            if (!(is_32.id_class(rLp_14) >= is_32.id_class(rLp_13))) continue;
            rLp_13 = rLp_14;
        }
        return rLp_12 == rLp_1.OPEN && is_32.id_class(rLp_13) == 0.0f && n4 <= 1 ? rLp_1.OPEN : rLp_13;
    }

    private boolean id_class(rfl_3 rfl_32) {
        return (Boolean)this.id_native.computeIfAbsent((Object)rfl_32, rfl_33 -> !this.id_class.a_(this.id_break, rfl_32));
    }

    private static boolean id_class(xc_3 xc_32) {
        return xc_32.id_class(rls_3.N) || xc_32.id_class(xu_3.id_instanceof) || xc_32.id_class(xu_3.bV) || xn_3.id_private(xc_32);
    }

    public static rLp_1 id_class(rRq_1 rRq_12, rfw_3 rfw_32, rLp_1 rLp_12) {
        int n = rfw_32.b_();
        int n2 = rfw_32.c_();
        int n3 = rfw_32.d_();
        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                for (int k = -1; k <= 1; ++k) {
                    if (i == 0 && k == 0) continue;
                    rfw_32.id_class(n + i, n2 + j, n3 + k);
                    xc_3 xc_32 = rRq_12.id_byte(rfw_32);
                    if (xc_32.id_class(xu_3.Pw)) {
                        return rLp_1.DANGER_CACTUS;
                    }
                    if (xc_32.id_class(xu_3.XJ)) {
                        return rLp_1.DANGER_OTHER;
                    }
                    if (rLf_1.id_class(xc_32)) {
                        return rLp_1.DANGER_FIRE;
                    }
                    if (!rRq_12.id_break(rfw_32).id_class(rlG_2.id_break)) continue;
                    return rLp_1.WATER_BORDER;
                }
            }
        }
        return rLp_12;
    }

    public static rLp_1 id_class(rRq_1 rRq_12, rfw_3 rfw_32) {
        int n = rfw_32.b_();
        int n2 = rfw_32.c_();
        int n3 = rfw_32.d_();
        rLp_1 rLp_12 = rLf_1.id_break(rRq_12, rfw_32);
        if (rLp_12 == rLp_1.OPEN && n2 >= 1) {
            rLp_1 rLp_13 = rLf_1.id_break(rRq_12, rfw_32.id_class(n, n2 - 1, n3));
            rLp_1 rLp_14 = rLp_12 = rLp_13 != rLp_1.WALKABLE && rLp_13 != rLp_1.OPEN && rLp_13 != rLp_1.WATER && rLp_13 != rLp_1.LAVA ? rLp_1.WALKABLE : rLp_1.OPEN;
            if (rLp_13 == rLp_1.DAMAGE_FIRE) {
                rLp_12 = rLp_1.DAMAGE_FIRE;
            }
            if (rLp_13 == rLp_1.DAMAGE_CACTUS) {
                rLp_12 = rLp_1.DAMAGE_CACTUS;
            }
            if (rLp_13 == rLp_1.DAMAGE_OTHER) {
                rLp_12 = rLp_1.DAMAGE_OTHER;
            }
            if (rLp_13 == rLp_1.STICKY_HONEY) {
                rLp_12 = rLp_1.STICKY_HONEY;
            }
        }
        if (rLp_12 == rLp_1.WALKABLE) {
            rLp_12 = rLf_1.id_class(rRq_12, rfw_32.id_class(n, n2, n3), rLp_12);
        }
        return rLp_12;
    }

    @Override
    public rLp_1 id_class(rRq_1 rRq_12, int n, int n2, int n3) {
        return rLf_1.id_class(rRq_12, new rfw_3(n, n2, n3));
    }

    private boolean id_class(rLq_1 rLq_12, rLq_1 rLq_13) {
        return rLq_12 != null && !rLq_12.id_implements && (rLq_12.id_extends >= 0.0f || rLq_13.id_extends < 0.0f);
    }

    @Override
    public int id_class(rLq_1[] rLq_1Array, rLq_1 rLq_12) {
        rLq_1 rLq_13;
        rLq_1 rLq_14;
        rLq_1 rLq_15;
        rLq_1 rLq_16;
        rLq_1 rLq_17;
        rLq_1 rLq_18;
        rLq_1 rLq_19;
        double d;
        rLq_1 rLq_110;
        int n = 0;
        int n2 = 0;
        rLp_1 rLp_12 = this.id_class(this.id_break, rLq_12.id_class, rLq_12.id_break + 1, rLq_12.id_byte);
        rLp_1 rLp_13 = this.id_class(this.id_break, rLq_12.id_class, rLq_12.id_break, rLq_12.id_byte);
        if (this.id_break.id_class(rLp_12) >= 0.0f && rLp_13 != rLp_1.STICKY_HONEY) {
            n2 = rfU_2.id_protected(Math.max(1.0f, ((Float)this.id_break.id_throws[37]).floatValue()));
        }
        if (this.id_class(rLq_110 = this.id_class(rLq_12.id_class, rLq_12.id_break, rLq_12.id_byte + 1, n2, d = rLf_1.id_class((rRq_1)this.id_class, new rfH_2(rLq_12.id_class, rLq_12.id_break, rLq_12.id_byte)), rpr_3.SOUTH, rLp_13), rLq_12)) {
            rLq_1Array[n++] = rLq_110;
        }
        if (this.id_class(rLq_19 = this.id_class(rLq_12.id_class - 1, rLq_12.id_break, rLq_12.id_byte, n2, d, rpr_3.WEST, rLp_13), rLq_12)) {
            rLq_1Array[n++] = rLq_19;
        }
        if (this.id_class(rLq_18 = this.id_class(rLq_12.id_class + 1, rLq_12.id_break, rLq_12.id_byte, n2, d, rpr_3.EAST, rLp_13), rLq_12)) {
            rLq_1Array[n++] = rLq_18;
        }
        if (this.id_class(rLq_17 = this.id_class(rLq_12.id_class, rLq_12.id_break, rLq_12.id_byte - 1, n2, d, rpr_3.NORTH, rLp_13), rLq_12)) {
            rLq_1Array[n++] = rLq_17;
        }
        if (this.id_class(rLq_12, rLq_19, rLq_17, rLq_16 = this.id_class(rLq_12.id_class - 1, rLq_12.id_break, rLq_12.id_byte - 1, n2, d, rpr_3.NORTH, rLp_13))) {
            rLq_1Array[n++] = rLq_16;
        }
        if (this.id_class(rLq_12, rLq_18, rLq_17, rLq_15 = this.id_class(rLq_12.id_class + 1, rLq_12.id_break, rLq_12.id_byte - 1, n2, d, rpr_3.NORTH, rLp_13))) {
            rLq_1Array[n++] = rLq_15;
        }
        if (this.id_class(rLq_12, rLq_19, rLq_110, rLq_14 = this.id_class(rLq_12.id_class - 1, rLq_12.id_break, rLq_12.id_byte + 1, n2, d, rpr_3.SOUTH, rLp_13))) {
            rLq_1Array[n++] = rLq_14;
        }
        if (this.id_class(rLq_12, rLq_18, rLq_110, rLq_13 = this.id_class(rLq_12.id_class + 1, rLq_12.id_break, rLq_12.id_byte + 1, n2, d, rpr_3.SOUTH, rLp_13))) {
            rLq_1Array[n++] = rLq_13;
        }
        return n;
    }

    @Override
    public rLv_1 id_class(double d, double d2, double d3) {
        return new rLv_1(this.id_class(rfU_2.id_byte(d), rfU_2.id_byte(d2), rfU_2.id_byte(d3)));
    }

    @Override
    public void id_class() {
        this.id_break.id_class(rLp_1.WATER, this.id_finally);
        this.id_extends.clear();
        this.id_native.clear();
        super.id_class();
    }

    @Override
    public void id_class(rRU rRU2, is_3 is_32) {
        super.id_class(rRU2, is_32);
        this.id_finally = is_32.id_class(rLp_1.WATER);
    }

    public static double id_class(rRq_1 rRq_12, rfH_2 rfH_22) {
        rfH_2 rfH_23 = rfH_22.id_break();
        rjC_2 rjC_22 = rRq_12.id_byte(rfH_23).id_extends(rRq_12, rfH_23);
        return (double)rfH_23.c_() + (rjC_22.id_break() ? 0.0 : rjC_22.id_byte(rpB_2.Y));
    }

    private rLq_1 id_class(int n, int n2, int n3, int n4, double d, rpr_3 rpr_32, rLp_1 rLp_12) {
        double d2;
        double d3;
        rfl_3 rfl_32;
        rLq_1 rLq_12 = null;
        rfw_3 rfw_32 = new rfw_3();
        double d4 = rLf_1.id_class((rRq_1)this.id_class, (rfH_2)rfw_32.id_class(n, n2, n3));
        if (d4 - d > 1.125) {
            return null;
        }
        rLp_1 rLp_13 = this.id_class(this.id_break, n, n2, n3);
        float f = this.id_break.id_class(rLp_13);
        double d5 = (double)this.id_break.PN() / 2.0;
        if (f >= 0.0f) {
            rLq_12 = this.id_class(n, n2, n3);
            rLq_12.id_native = rLp_13;
            rLq_12.id_extends = Math.max(rLq_12.id_extends, f);
        }
        if (rLp_12 == rLp_1.FENCE && rLq_12 != null && rLq_12.id_extends >= 0.0f && !this.id_class(rLq_12)) {
            rLq_12 = null;
        }
        if (rLp_13 == rLp_1.WALKABLE) {
            return rLq_12;
        }
        if ((rLq_12 == null || rLq_12.id_extends < 0.0f) && n4 > 0 && rLp_13 != rLp_1.FENCE && rLp_13 != rLp_1.UNPASSABLE_RAIL && rLp_13 != rLp_1.TRAPDOOR && (rLq_12 = this.id_class(n, n2 + 1, n3, n4 - 1, d, rpr_32, rLp_12)) != null && (rLq_12.id_native == rLp_1.OPEN || rLq_12.id_native == rLp_1.WALKABLE) && this.id_break.PN() < 1.0f && this.id_class(rfl_32 = new rfl_3((d3 = (double)(n - rpr_32.id_implements()) + 0.5) - d5, rLf_1.id_class((rRq_1)this.id_class, (rfH_2)rfw_32.id_break(d3, (double)(n2 + 1), d2 = (double)(n3 - rpr_32.id_extends()) + 0.5)) + 0.001, d2 - d5, d3 + d5, (double)this.id_break.Bm() + rLf_1.id_class((rRq_1)this.id_class, (rfH_2)rfw_32.id_break((double)rLq_12.id_class, (double)rLq_12.id_break, (double)rLq_12.id_byte)) - 0.002, d2 + d5))) {
            rLq_12 = null;
        }
        if (rLp_13 == rLp_1.WATER && !this.id_throws()) {
            if (this.id_class(this.id_break, n, n2 - 1, n3) != rLp_1.WATER) {
                return rLq_12;
            }
            while (n2 > 0) {
                if ((rLp_13 = this.id_class(this.id_break, n, --n2, n3)) != rLp_1.WATER) {
                    return rLq_12;
                }
                rLq_12 = this.id_class(n, n2, n3);
                rLq_12.id_native = rLp_13;
                rLq_12.id_extends = Math.max(rLq_12.id_extends, this.id_break.id_class(rLp_13));
            }
        }
        if (rLp_13 == rLp_1.OPEN) {
            int n5 = 0;
            int n6 = n2;
            while (rLp_13 == rLp_1.OPEN) {
                if (--n2 < 0) {
                    rLq_1 rLq_13 = this.id_class(n, n6, n3);
                    rLq_13.id_native = rLp_1.BLOCKED;
                    rLq_13.id_extends = -1.0f;
                    return rLq_13;
                }
                if (n5++ >= this.id_break.rp()) {
                    rLq_1 rLq_14 = this.id_class(n, n2, n3);
                    rLq_14.id_native = rLp_1.BLOCKED;
                    rLq_14.id_extends = -1.0f;
                    return rLq_14;
                }
                rLp_13 = this.id_class(this.id_break, n, n2, n3);
                f = this.id_break.id_class(rLp_13);
                if (rLp_13 != rLp_1.OPEN && f >= 0.0f) {
                    rLq_12 = this.id_class(n, n2, n3);
                    rLq_12.id_native = rLp_13;
                    rLq_12.id_extends = Math.max(rLq_12.id_extends, f);
                    break;
                }
                if (!(f < 0.0f)) continue;
                rLq_1 rLq_15 = this.id_class(n, n2, n3);
                rLq_15.id_native = rLp_1.BLOCKED;
                rLq_15.id_extends = -1.0f;
                return rLq_15;
            }
        }
        if (rLp_13 == rLp_1.FENCE) {
            rLq_12 = this.id_class(n, n2, n3);
            rLq_12.id_implements = true;
            rLq_12.id_native = rLp_13;
            rLq_12.id_extends = rLp_13.id_class();
        }
        return rLq_12;
    }

    private boolean id_class(rLq_1 rLq_12) {
        rjU_2 rjU_22 = new rjU_2((double)rLq_12.id_class - this.id_break.rx(), (double)rLq_12.id_break - this.id_break.re(), (double)rLq_12.id_byte - this.id_break.BO());
        rfl_3 rfl_32 = this.id_break.rN();
        int n = rfU_2.id_throws(rjU_22.id_case() / rfl_32.id_class());
        rjU_22 = rjU_22.id_class((double)(1.0f / (float)n));
        for (int i = 1; i <= n; ++i) {
            if (!this.id_class(rfl_32 = rfl_32.id_protected(rjU_22))) continue;
            return false;
        }
        return true;
    }

    private boolean id_class(rLq_1 rLq_12, rLq_1 rLq_13, rLq_1 rLq_14, rLq_1 rLq_15) {
        if (rLq_15 != null && rLq_14 != null && rLq_13 != null) {
            if (rLq_15.id_implements) {
                return false;
            }
            if (rLq_14.id_break <= rLq_12.id_break && rLq_13.id_break <= rLq_12.id_break) {
                if (rLq_13.id_native != rLp_1.WALKABLE_DOOR && rLq_14.id_native != rLp_1.WALKABLE_DOOR && rLq_15.id_native != rLp_1.WALKABLE_DOOR) {
                    boolean bl = rLq_14.id_native == rLp_1.FENCE && rLq_13.id_native == rLp_1.FENCE && (double)this.id_break.PN() < 0.5;
                    return rLq_15.id_extends >= 0.0f && (rLq_14.id_break < rLq_12.id_break || rLq_14.id_extends >= 0.0f || bl) && (rLq_13.id_break < rLq_12.id_break || rLq_13.id_extends >= 0.0f || bl);
                }
                return false;
            }
            return false;
        }
        return false;
    }

    protected static rLp_1 id_break(rRq_1 rRq_12, rfH_2 rfH_22) {
        xc_3 xc_32 = rRq_12.id_byte(rfH_22);
        xd_3 xd_32 = xc_32.id_break();
        QP qP = xc_32.id_byte();
        if (xc_32.id_catch()) {
            return rLp_1.OPEN;
        }
        if (!xc_32.id_class(rls_3.id_static) && !xc_32.id_class(xu_3.Sr)) {
            if (xc_32.id_class(xu_3.Pw)) {
                return rLp_1.DAMAGE_CACTUS;
            }
            if (xc_32.id_class(xu_3.XJ)) {
                return rLp_1.DAMAGE_OTHER;
            }
            if (xc_32.id_class(xu_3.Jh)) {
                return rLp_1.STICKY_HONEY;
            }
            if (xc_32.id_class(xu_3.Sx)) {
                return rLp_1.COCOA;
            }
            rXE rXE2 = rRq_12.id_break(rfH_22);
            if (rXE2.id_class(rlG_2.id_break)) {
                return rLp_1.WATER;
            }
            if (rXE2.id_class(rlG_2.id_byte)) {
                return rLp_1.LAVA;
            }
            if (rLf_1.id_class(xc_32)) {
                return rLp_1.DAMAGE_FIRE;
            }
            if (dN_2.id_implements(xc_32) && !xc_32.id_byte(dN_2.id_final).booleanValue()) {
                return rLp_1.DOOR_WOOD_CLOSED;
            }
            if (xd_32 instanceof dN_2 && qP == QP.id_static && !xc_32.id_byte(dN_2.id_final).booleanValue()) {
                return rLp_1.DOOR_IRON_CLOSED;
            }
            if (xd_32 instanceof dN_2 && xc_32.id_byte(dN_2.id_final).booleanValue()) {
                return rLp_1.DOOR_OPEN;
            }
            if (xd_32 instanceof Jo_1) {
                return rLp_1.RAIL;
            }
            if (xd_32 instanceof kZ_2) {
                return rLp_1.LEAVES;
            }
            if (!(xd_32.id_class(rls_3.id_default) || xd_32.id_class(rls_3.id_abstract) || xd_32 instanceof dq_3 && !xc_32.id_byte(dq_3.id_volatile).booleanValue())) {
                return !xc_32.id_class(rRq_12, rfH_22, rLT.LAND) ? rLp_1.BLOCKED : rLp_1.OPEN;
            }
            return rLp_1.FENCE;
        }
        return rLp_1.TRAPDOOR;
    }

    @Override
    public rLq_1 id_break() {
        Object object;
        rfH_2 rfH_22;
        int n;
        rfw_3 rfw_32;
        block11: {
            rfw_32 = new rfw_3();
            n = rfU_2.id_byte(this.id_break.re());
            xc_3 xc_32 = this.id_class.id_byte(rfw_32.id_break(this.id_break.rx(), (double)n, this.id_break.BO()));
            if (!this.id_break.id_class(xc_32.id_volatile().id_class())) {
                if (this.id_throws() && this.id_break.rT()) {
                    while (true) {
                        if (xc_32.id_break() != xu_3.id_try && xc_32.id_volatile() != rXG.id_byte.id_class(false)) {
                            --n;
                            break block11;
                        }
                        xc_32 = this.id_class.id_byte(rfw_32.id_break(this.id_break.rx(), (double)(++n), this.id_break.BO()));
                    }
                }
                if (this.id_break.BL()) {
                    n = rfU_2.id_byte(this.id_break.re() + 0.5);
                } else {
                    rfH_22 = this.id_break.Bs();
                    while ((this.id_class.id_byte(rfH_22).id_catch() || this.id_class.id_byte(rfH_22).id_class((rRq_1)this.id_class, rfH_22, rLT.LAND)) && rfH_22.c_() > 0) {
                        rfH_22 = rfH_22.id_break();
                    }
                    n = rfH_22.id_final().c_();
                }
            } else {
                while (this.id_break.id_class(xc_32.id_volatile().id_class())) {
                    xc_32 = this.id_class.id_byte(rfw_32.id_break(this.id_break.rx(), (double)(++n), this.id_break.BO()));
                }
                --n;
            }
        }
        rfH_22 = this.id_break.Bs();
        rLp_1 rLp_12 = this.id_class(this.id_break, rfH_22.b_(), n, rfH_22.d_());
        if (this.id_break.id_class(rLp_12) < 0.0f) {
            object = this.id_break.rN();
            if (this.id_break(rfw_32.id_break(((rfl_3)object).id_class, (double)n, ((rfl_3)object).id_byte)) || this.id_break(rfw_32.id_break(((rfl_3)object).id_class, (double)n, ((rfl_3)object).id_case)) || this.id_break(rfw_32.id_break(((rfl_3)object).id_protected, (double)n, ((rfl_3)object).id_byte)) || this.id_break(rfw_32.id_break(((rfl_3)object).id_protected, (double)n, ((rfl_3)object).id_case))) {
                rLq_1 rLq_12 = this.id_class(rfw_32);
                rLq_12.id_native = this.id_class(this.id_break, rLq_12.id_byte());
                rLq_12.id_extends = this.id_break.id_class(rLq_12.id_native);
                return rLq_12;
            }
        }
        object = this.id_class(rfH_22.b_(), n, rfH_22.d_());
        ((rLq_1)object).id_native = this.id_class(this.id_break, ((rLq_1)object).id_byte());
        ((rLq_1)object).id_extends = this.id_break.id_class(((rLq_1)object).id_native);
        return object;
    }

    private boolean id_break(rfH_2 rfH_22) {
        rLp_1 rLp_12 = this.id_class(this.id_break, rfH_22);
        return this.id_break.id_class(rLp_12) >= 0.0f;
    }
}

