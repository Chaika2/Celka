/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rKQ;
import celestial.rKZ;
import celestial.rKd_1;
import celestial.rKf_1;
import celestial.rKv_1;
import celestial.rRE;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rfw_3;
import celestial.roC_2;
import celestial.ror_3;
import celestial.rrrA;
import celestial.xc_3;
import celestial.xu_3;
import com.mojang.serialization.Codec;
import java.util.Arrays;

public class rKz_1
extends rKd_1 {
    public static final Codec<rKz_1> id_protected = rKQ.id_class.fieldOf("settings").xmap(rKz_1::new, rKz_1::id_catch).codec();
    private final rKQ id_throws;

    @Override
    public int id_byte() {
        xc_3[] xc_3Array = this.id_throws.id_catch();
        for (int i = 0; i < xc_3Array.length; ++i) {
            xc_3 xc_32;
            xc_3 xc_33 = xc_32 = xc_3Array[i] == null ? xu_3.id_class.id_continue() : xc_3Array[i];
            if (rKv_1.MOTION_BLOCKING.id_throws().test(xc_32)) continue;
            return i - 1;
        }
        return xc_3Array.length;
    }

    public rKz_1(rKQ rKQ2) {
        super(new ror_3(rKQ2.id_byte()), new ror_3(rKQ2.id_throws()), rKQ2.id_protected(), 0L);
        this.id_throws = rKQ2;
    }

    @Override
    public void id_class(rRg_1 rRg_12, rrrA rrrA2, roC_2 roC_22) {
        xc_3[] xc_3Array = this.id_throws.id_catch();
        rfw_3 rfw_32 = new rfw_3();
        rKZ rKZ2 = roC_22.id_class(rKv_1.OCEAN_FLOOR_WG);
        rKZ rKZ3 = roC_22.id_class(rKv_1.WORLD_SURFACE_WG);
        for (int i = 0; i < xc_3Array.length; ++i) {
            xc_3 xc_32 = xc_3Array[i];
            if (xc_32 == null) continue;
            for (int j = 0; j < 16; ++j) {
                for (int k = 0; k < 16; ++k) {
                    roC_22.id_class(rfw_32.id_class(j, i, k), xc_32, false);
                    rKZ2.id_class(j, i, k, xc_32);
                    rKZ3.id_class(j, i, k, xc_32);
                }
            }
        }
    }

    @Override
    public rRq_1 id_class(int n, int n2) {
        return new rRE((xc_3[])Arrays.stream(this.id_throws.id_catch()).map(xc_32 -> xc_32 == null ? xu_3.id_class.id_continue() : xc_32).toArray(xc_3[]::new));
    }

    @Override
    public int id_class(int n, int n2, rKv_1 rKv_12) {
        xc_3[] xc_3Array = this.id_throws.id_catch();
        for (int i = xc_3Array.length - 1; i >= 0; --i) {
            xc_3 xc_32 = xc_3Array[i];
            if (xc_32 == null || !rKv_12.id_throws().test(xc_32)) continue;
            return i + 1;
        }
        return 0;
    }

    @Override
    public void id_class(rKf_1 rKf_12, roC_2 roC_22) {
    }

    @Override
    public rKd_1 id_class(long l) {
        return this;
    }

    @Override
    protected Codec<? extends rKd_1> id_class() {
        return id_protected;
    }

    public rKQ id_catch() {
        return this.id_throws;
    }
}

