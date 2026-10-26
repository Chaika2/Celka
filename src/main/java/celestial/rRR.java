/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rKv_1;
import celestial.rRJ;
import celestial.rRT;
import celestial.rRp_1;
import celestial.rRq_1;
import celestial.rYA;
import celestial.rYG;
import celestial.rYn_1;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfl_3;
import celestial.rfw_3;
import celestial.rlG_2;
import celestial.roC_2;
import celestial.roN_2;
import celestial.rpr_3;
import celestial.rrsC_2;
import celestial.xc_3;
import java.util.stream.Stream;

public interface rRR
extends rRT,
rRp_1,
rYn_1 {
    default public Stream<xc_3> id_byte(rfl_3 rfl_32) {
        int n;
        int n2 = rfU_2.id_byte(rfl_32.id_class);
        int n3 = rfU_2.id_byte(rfl_32.id_protected);
        int n4 = rfU_2.id_byte(rfl_32.id_break);
        int n5 = rfU_2.id_byte(rfl_32.id_throws);
        int n6 = rfU_2.id_byte(rfl_32.id_byte);
        return this.id_class(n2, n4, n6, n3, n5, n = rfU_2.id_byte(rfl_32.id_case)) ? this.id_class(rfl_32) : Stream.empty();
    }

    @Override
    default public rRq_1 id_byte(int n, int n2) {
        return this.id_class(n, n2, roN_2.id_class, false);
    }

    public rYG id_byte(int var1, int var2, int var3);

    @Deprecated
    default public boolean id_int(rfH_2 rfH_22) {
        return this.id_break(rfH_22.b_() >> 4, rfH_22.d_() >> 4);
    }

    @Deprecated
    default public boolean id_class(rfH_2 rfH_22, rfH_2 rfH_23) {
        return this.id_class(rfH_22.b_(), rfH_22.c_(), rfH_22.d_(), rfH_23.b_(), rfH_23.c_(), rfH_23.d_());
    }

    default public rfH_2 id_class(rKv_1 rKv_12, rfH_2 rfH_22) {
        return new rfH_2(rfH_22.b_(), this.id_class(rKv_12, rfH_22.b_(), rfH_22.d_()), rfH_22.d_());
    }

    @Deprecated
    default public boolean id_class(int n, int n2, int n3, int n4, int n5, int n6) {
        if (n5 >= 0 && n2 < 256) {
            n3 >>= 4;
            n4 >>= 4;
            n6 >>= 4;
            for (int i = n >>= 4; i <= n4; ++i) {
                for (int j = n3; j <= n6; ++j) {
                    if (this.id_break(i, j)) continue;
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    default public int id_class(rfH_2 rfH_22, rpr_3 rpr_32) {
        return this.id_byte(rfH_22).id_byte((rRq_1)this, rfH_22, rpr_32);
    }

    default public roC_2 id_class(int n, int n2, roN_2 roN_22) {
        return this.id_class(n, n2, roN_22, true);
    }

    public roC_2 id_class(int var1, int var2, roN_2 var3, boolean var4);

    public int id_class(rKv_1 var1, int var2, int var3);

    @Override
    default public int id_class(rfH_2 rfH_22, rrsC_2 rrsC_22) {
        return rrsC_22.getColor(this.id_implements(rfH_22), rfH_22.b_(), rfH_22.d_());
    }

    public rRJ id_default();

    @Deprecated
    public int id_short();

    public int id_void();

    @Deprecated
    public boolean id_break(int var1, int var2);

    default public int id_break(rfH_2 rfH_22, int n) {
        return rfH_22.b_() >= -30000000 && rfH_22.d_() >= -30000000 && rfH_22.b_() < 30000000 && rfH_22.d_() < 30000000 ? this.id_class(rfH_22, n) : 15;
    }

    default public boolean id_finally(rfH_2 rfH_22) {
        return this.id_byte(rfH_22).id_catch();
    }

    default public boolean id_extends(rfH_2 rfH_22) {
        if (rfH_22.c_() >= this.id_short()) {
            return this.id_case(rfH_22);
        }
        rfH_2 rfH_23 = new rfH_2(rfH_22.b_(), this.id_short(), rfH_22.d_());
        if (!this.id_case(rfH_23)) {
            return false;
        }
        rfH_2 rfH_24 = rfH_23.id_break();
        while (rfH_24.c_() > rfH_22.c_()) {
            xc_3 xc_32 = this.id_byte(rfH_24);
            if (xc_32.id_break(this, rfH_24) > 0 && !xc_32.id_byte().id_class()) {
                return false;
            }
            rfH_24 = rfH_24.id_break();
        }
        return true;
    }

    default public rYG id_implements(rfH_2 rfH_22) {
        return this.id_static().id_class(rfH_22);
    }

    public boolean id_import();

    default public int id_package(rfH_2 rfH_22) {
        return this.id_break(rfH_22, this.id_void());
    }

    public rYA id_static();

    @Override
    default public rYG id_protected(int n, int n2, int n3) {
        roC_2 roC_22 = this.id_class(n >> 2, n3 >> 2, roN_2.id_protected, false);
        return roC_22 != null && roC_22.id_implements() != null ? roC_22.id_implements().id_protected(n, n2, n3) : this.id_byte(n, n2, n3);
    }

    default public roC_2 id_protected(int n, int n2) {
        return this.id_class(n, n2, roN_2.id_volatile, true);
    }

    default public boolean id_protected(rfl_3 rfl_32) {
        int n = rfU_2.id_byte(rfl_32.id_class);
        int n2 = rfU_2.id_throws(rfl_32.id_protected);
        int n3 = rfU_2.id_byte(rfl_32.id_break);
        int n4 = rfU_2.id_throws(rfl_32.id_throws);
        int n5 = rfU_2.id_byte(rfl_32.id_byte);
        int n6 = rfU_2.id_throws(rfl_32.id_case);
        rfw_3 rfw_32 = new rfw_3();
        for (int i = n; i < n2; ++i) {
            for (int j = n3; j < n4; ++j) {
                for (int k = n5; k < n6; ++k) {
                    xc_3 xc_32 = this.id_byte(rfw_32.id_class(i, j, k));
                    if (xc_32.id_volatile().id_byte()) continue;
                    return true;
                }
            }
        }
        return false;
    }

    default public boolean id_final(rfH_2 rfH_22) {
        return this.id_break(rfH_22).id_class(rlG_2.id_break);
    }

    default public roC_2 id_volatile(rfH_2 rfH_22) {
        return this.id_protected(rfH_22.b_() >> 4, rfH_22.d_() >> 4);
    }

    @Deprecated
    default public float id_native(rfH_2 rfH_22) {
        return this.id_default().id_class(this.id_package(rfH_22));
    }
}

