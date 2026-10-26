/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
package celestial;

import celestial.is_3;
import celestial.rLf_1;
import celestial.rLp_1;
import celestial.rLq_1;
import celestial.rLv_1;
import celestial.rRU;
import celestial.rRq_1;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfw_3;
import celestial.rls_3;
import celestial.xc_3;
import celestial.xu_3;
import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.HashSet;

public class rLF
extends rLf_1 {
    @Override
    public rLp_1 id_class(rRq_1 rRq_12, int n, int n2, int n3, is_3 is_32, int n4, int n5, int n6, boolean bl, boolean bl2) {
        EnumSet<rLp_1> enumSet = EnumSet.noneOf(rLp_1.class);
        rLp_1 rLp_12 = rLp_1.BLOCKED;
        rfH_2 rfH_22 = is_32.Bs();
        rLp_12 = this.id_class(rRq_12, n, n2, n3, n4, n5, n6, bl, bl2, enumSet, rLp_12, rfH_22);
        if (enumSet.contains((Object)rLp_1.FENCE)) {
            return rLp_1.FENCE;
        }
        rLp_1 rLp_13 = rLp_1.BLOCKED;
        for (rLp_1 rLp_14 : enumSet) {
            if (is_32.id_class(rLp_14) < 0.0f) {
                return rLp_14;
            }
            if (!(is_32.id_class(rLp_14) >= is_32.id_class(rLp_13))) continue;
            rLp_13 = rLp_14;
        }
        return rLp_12 == rLp_1.OPEN && is_32.id_class(rLp_13) == 0.0f ? rLp_1.OPEN : rLp_13;
    }

    @Override
    protected rLq_1 id_class(int n, int n2, int n3) {
        rLq_1 rLq_12 = null;
        rLp_1 rLp_12 = this.id_class(this.id_break, n, n2, n3);
        float f = this.id_break.id_class(rLp_12);
        if (f >= 0.0f) {
            rLq_12 = super.id_class(n, n2, n3);
            rLq_12.id_native = rLp_12;
            rLq_12.id_extends = Math.max(rLq_12.id_extends, f);
            if (rLp_12 == rLp_1.WALKABLE) {
                rLq_12.id_extends += 1.0f;
            }
        }
        return rLp_12 != rLp_1.OPEN && rLp_12 != rLp_1.WALKABLE ? rLq_12 : rLq_12;
    }

    private boolean id_class(rLq_1 rLq_12) {
        return rLq_12 != null && rLq_12.id_extends >= 0.0f;
    }

    @Override
    public rLp_1 id_class(rRq_1 rRq_12, int n, int n2, int n3) {
        rfw_3 rfw_32 = new rfw_3();
        rLp_1 rLp_12 = rLF.id_break(rRq_12, rfw_32.id_class(n, n2, n3));
        if (rLp_12 == rLp_1.OPEN && n2 >= 1) {
            xc_3 xc_32 = rRq_12.id_byte(rfw_32.id_class(n, n2 - 1, n3));
            rLp_1 rLp_13 = rLF.id_break(rRq_12, rfw_32.id_class(n, n2 - 1, n3));
            rLp_12 = rLp_13 != rLp_1.DAMAGE_FIRE && !xc_32.id_class(xu_3.bV) && rLp_13 != rLp_1.LAVA && !xc_32.id_class(rls_3.l) ? (rLp_13 == rLp_1.DAMAGE_CACTUS ? rLp_1.DAMAGE_CACTUS : (rLp_13 == rLp_1.DAMAGE_OTHER ? rLp_1.DAMAGE_OTHER : (rLp_13 == rLp_1.COCOA ? rLp_1.COCOA : (rLp_13 == rLp_1.FENCE ? rLp_1.FENCE : (rLp_13 != rLp_1.WALKABLE && rLp_13 != rLp_1.OPEN && rLp_13 != rLp_1.WATER ? rLp_1.WALKABLE : rLp_1.OPEN))))) : rLp_1.DAMAGE_FIRE;
        }
        if (rLp_12 == rLp_1.WALKABLE || rLp_12 == rLp_1.OPEN) {
            rLp_12 = rLF.id_class(rRq_12, rfw_32.id_class(n, n2, n3), rLp_12);
        }
        return rLp_12;
    }

    private rLp_1 id_class(is_3 is_32, rfH_2 rfH_22) {
        return this.id_class(is_32, rfH_22.b_(), rfH_22.c_(), rfH_22.d_());
    }

    private rLp_1 id_class(is_3 is_32, int n, int n2, int n3) {
        return this.id_class(this.id_class, n, n2, n3, is_32, this.id_protected, this.id_throws, this.id_case, this.id_protected(), this.id_byte());
    }

    @Override
    public void id_class() {
        this.id_break.id_class(rLp_1.WATER, this.id_finally);
        super.id_class();
    }

    @Override
    public rLv_1 id_class(double d, double d2, double d3) {
        return new rLv_1(super.id_class(rfU_2.id_byte(d), rfU_2.id_byte(d2), rfU_2.id_byte(d3)));
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
        rLq_1 rLq_110;
        rLq_1 rLq_111;
        rLq_1 rLq_112;
        rLq_1 rLq_113;
        rLq_1 rLq_114;
        rLq_1 rLq_115;
        rLq_1 rLq_116;
        rLq_1 rLq_117;
        rLq_1 rLq_118;
        rLq_1 rLq_119;
        rLq_1 rLq_120;
        rLq_1 rLq_121;
        rLq_1 rLq_122;
        rLq_1 rLq_123;
        rLq_1 rLq_124;
        rLq_1 rLq_125;
        rLq_1 rLq_126;
        rLq_1 rLq_127;
        int n = 0;
        rLq_1 rLq_128 = this.id_class(rLq_12.id_class, rLq_12.id_break, rLq_12.id_byte + 1);
        if (this.id_break(rLq_128)) {
            rLq_1Array[n++] = rLq_128;
        }
        if (this.id_break(rLq_127 = this.id_class(rLq_12.id_class - 1, rLq_12.id_break, rLq_12.id_byte))) {
            rLq_1Array[n++] = rLq_127;
        }
        if (this.id_break(rLq_126 = this.id_class(rLq_12.id_class + 1, rLq_12.id_break, rLq_12.id_byte))) {
            rLq_1Array[n++] = rLq_126;
        }
        if (this.id_break(rLq_125 = this.id_class(rLq_12.id_class, rLq_12.id_break, rLq_12.id_byte - 1))) {
            rLq_1Array[n++] = rLq_125;
        }
        if (this.id_break(rLq_124 = this.id_class(rLq_12.id_class, rLq_12.id_break + 1, rLq_12.id_byte))) {
            rLq_1Array[n++] = rLq_124;
        }
        if (this.id_break(rLq_123 = this.id_class(rLq_12.id_class, rLq_12.id_break - 1, rLq_12.id_byte))) {
            rLq_1Array[n++] = rLq_123;
        }
        if (this.id_break(rLq_122 = this.id_class(rLq_12.id_class, rLq_12.id_break + 1, rLq_12.id_byte + 1)) && this.id_class(rLq_128) && this.id_class(rLq_124)) {
            rLq_1Array[n++] = rLq_122;
        }
        if (this.id_break(rLq_121 = this.id_class(rLq_12.id_class - 1, rLq_12.id_break + 1, rLq_12.id_byte)) && this.id_class(rLq_127) && this.id_class(rLq_124)) {
            rLq_1Array[n++] = rLq_121;
        }
        if (this.id_break(rLq_120 = this.id_class(rLq_12.id_class + 1, rLq_12.id_break + 1, rLq_12.id_byte)) && this.id_class(rLq_126) && this.id_class(rLq_124)) {
            rLq_1Array[n++] = rLq_120;
        }
        if (this.id_break(rLq_119 = this.id_class(rLq_12.id_class, rLq_12.id_break + 1, rLq_12.id_byte - 1)) && this.id_class(rLq_125) && this.id_class(rLq_124)) {
            rLq_1Array[n++] = rLq_119;
        }
        if (this.id_break(rLq_118 = this.id_class(rLq_12.id_class, rLq_12.id_break - 1, rLq_12.id_byte + 1)) && this.id_class(rLq_128) && this.id_class(rLq_123)) {
            rLq_1Array[n++] = rLq_118;
        }
        if (this.id_break(rLq_117 = this.id_class(rLq_12.id_class - 1, rLq_12.id_break - 1, rLq_12.id_byte)) && this.id_class(rLq_127) && this.id_class(rLq_123)) {
            rLq_1Array[n++] = rLq_117;
        }
        if (this.id_break(rLq_116 = this.id_class(rLq_12.id_class + 1, rLq_12.id_break - 1, rLq_12.id_byte)) && this.id_class(rLq_126) && this.id_class(rLq_123)) {
            rLq_1Array[n++] = rLq_116;
        }
        if (this.id_break(rLq_115 = this.id_class(rLq_12.id_class, rLq_12.id_break - 1, rLq_12.id_byte - 1)) && this.id_class(rLq_125) && this.id_class(rLq_123)) {
            rLq_1Array[n++] = rLq_115;
        }
        if (this.id_break(rLq_114 = this.id_class(rLq_12.id_class + 1, rLq_12.id_break, rLq_12.id_byte - 1)) && this.id_class(rLq_125) && this.id_class(rLq_126)) {
            rLq_1Array[n++] = rLq_114;
        }
        if (this.id_break(rLq_113 = this.id_class(rLq_12.id_class + 1, rLq_12.id_break, rLq_12.id_byte + 1)) && this.id_class(rLq_128) && this.id_class(rLq_126)) {
            rLq_1Array[n++] = rLq_113;
        }
        if (this.id_break(rLq_112 = this.id_class(rLq_12.id_class - 1, rLq_12.id_break, rLq_12.id_byte - 1)) && this.id_class(rLq_125) && this.id_class(rLq_127)) {
            rLq_1Array[n++] = rLq_112;
        }
        if (this.id_break(rLq_111 = this.id_class(rLq_12.id_class - 1, rLq_12.id_break, rLq_12.id_byte + 1)) && this.id_class(rLq_128) && this.id_class(rLq_127)) {
            rLq_1Array[n++] = rLq_111;
        }
        if (this.id_break(rLq_110 = this.id_class(rLq_12.id_class + 1, rLq_12.id_break + 1, rLq_12.id_byte - 1)) && this.id_class(rLq_114) && this.id_class(rLq_125) && this.id_class(rLq_126) && this.id_class(rLq_124) && this.id_class(rLq_119) && this.id_class(rLq_120)) {
            rLq_1Array[n++] = rLq_110;
        }
        if (this.id_break(rLq_19 = this.id_class(rLq_12.id_class + 1, rLq_12.id_break + 1, rLq_12.id_byte + 1)) && this.id_class(rLq_113) && this.id_class(rLq_128) && this.id_class(rLq_126) && this.id_class(rLq_124) && this.id_class(rLq_122) && this.id_class(rLq_120)) {
            rLq_1Array[n++] = rLq_19;
        }
        if (this.id_break(rLq_18 = this.id_class(rLq_12.id_class - 1, rLq_12.id_break + 1, rLq_12.id_byte - 1)) && this.id_class(rLq_112) && this.id_class(rLq_125) && this.id_class(rLq_127) & this.id_class(rLq_124) && this.id_class(rLq_119) && this.id_class(rLq_121)) {
            rLq_1Array[n++] = rLq_18;
        }
        if (this.id_break(rLq_17 = this.id_class(rLq_12.id_class - 1, rLq_12.id_break + 1, rLq_12.id_byte + 1)) && this.id_class(rLq_111) && this.id_class(rLq_128) && this.id_class(rLq_127) & this.id_class(rLq_124) && this.id_class(rLq_122) && this.id_class(rLq_121)) {
            rLq_1Array[n++] = rLq_17;
        }
        if (this.id_break(rLq_16 = this.id_class(rLq_12.id_class + 1, rLq_12.id_break - 1, rLq_12.id_byte - 1)) && this.id_class(rLq_114) && this.id_class(rLq_125) && this.id_class(rLq_126) && this.id_class(rLq_123) && this.id_class(rLq_115) && this.id_class(rLq_116)) {
            rLq_1Array[n++] = rLq_16;
        }
        if (this.id_break(rLq_15 = this.id_class(rLq_12.id_class + 1, rLq_12.id_break - 1, rLq_12.id_byte + 1)) && this.id_class(rLq_113) && this.id_class(rLq_128) && this.id_class(rLq_126) && this.id_class(rLq_123) && this.id_class(rLq_118) && this.id_class(rLq_116)) {
            rLq_1Array[n++] = rLq_15;
        }
        if (this.id_break(rLq_14 = this.id_class(rLq_12.id_class - 1, rLq_12.id_break - 1, rLq_12.id_byte - 1)) && this.id_class(rLq_112) && this.id_class(rLq_125) && this.id_class(rLq_127) && this.id_class(rLq_123) && this.id_class(rLq_115) && this.id_class(rLq_117)) {
            rLq_1Array[n++] = rLq_14;
        }
        if (this.id_break(rLq_13 = this.id_class(rLq_12.id_class - 1, rLq_12.id_break - 1, rLq_12.id_byte + 1)) && this.id_class(rLq_111) && this.id_class(rLq_128) && this.id_class(rLq_127) && this.id_class(rLq_123) && this.id_class(rLq_118) && this.id_class(rLq_117)) {
            rLq_1Array[n++] = rLq_13;
        }
        return n;
    }

    @Override
    public void id_class(rRU rRU2, is_3 is_32) {
        super.id_class(rRU2, is_32);
        this.id_finally = is_32.id_class(rLp_1.WATER);
    }

    private boolean id_break(rLq_1 rLq_12) {
        return rLq_12 != null && !rLq_12.id_implements;
    }

    @Override
    public rLq_1 id_break() {
        Object object;
        rfH_2 rfH_22;
        int n;
        if (this.id_throws() && this.id_break.rT()) {
            n = rfU_2.id_byte(this.id_break.re());
            rfH_22 = new rfw_3(this.id_break.rx(), (double)n, this.id_break.BO());
            object = this.id_class.id_byte(rfH_22).id_break();
            while (object == xu_3.id_try) {
                ((rfw_3)rfH_22).id_break(this.id_break.rx(), (double)(++n), this.id_break.BO());
                object = this.id_class.id_byte(rfH_22).id_break();
            }
        } else {
            n = rfU_2.id_byte(this.id_break.re() + 0.5);
        }
        if (this.id_break.id_class((rLp_1)((Object)(object = this.id_class(this.id_break, (rfH_22 = this.id_break.Bs()).b_(), n, rfH_22.d_())))) < 0.0f) {
            HashSet hashSet = Sets.newHashSet();
            hashSet.add(new rfH_2(this.id_break.rN().id_class, (double)n, this.id_break.rN().id_byte));
            hashSet.add(new rfH_2(this.id_break.rN().id_class, (double)n, this.id_break.rN().id_case));
            hashSet.add(new rfH_2(this.id_break.rN().id_protected, (double)n, this.id_break.rN().id_byte));
            hashSet.add(new rfH_2(this.id_break.rN().id_protected, (double)n, this.id_break.rN().id_case));
            for (rfH_2 rfH_23 : hashSet) {
                rLp_1 rLp_12 = this.id_class(this.id_break, rfH_23);
                if (!(this.id_break.id_class(rLp_12) >= 0.0f)) continue;
                return super.id_class(rfH_23.b_(), rfH_23.c_(), rfH_23.d_());
            }
        }
        return super.id_class(rfH_22.b_(), n, rfH_22.d_());
    }
}

