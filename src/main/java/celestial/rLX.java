/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.Rk_1;
import celestial.rLJ;
import celestial.rLd_1;
import celestial.rLx_1;
import celestial.rLz_1;
import celestial.rVL;
import celestial.ruu_3;
import celestial.xc_3;
import celestial.xd_3;
import com.mojang.serialization.Codec;

public class rLX
implements rLx_1 {
    public static final rLd_1<rLX> id_class = new rLJ();
    private final rLz_1<rLX> id_break;
    private final xc_3 id_byte;

    @Override
    public String id_byte() {
        return rVL.id_switch.id_break(this.id_protected()) + " " + Rk_1.id_class(this.id_byte);
    }

    public rLX(rLz_1<rLX> rLz_12, xc_3 xc_32) {
        this.id_break = rLz_12;
        this.id_byte = xc_32;
    }

    public xc_3 id_class() {
        return this.id_byte;
    }

    public static Codec<rLX> id_class(rLz_1<rLX> rLz_12) {
        return xc_3.id_break.xmap(xc_32 -> new rLX(rLz_12, (xc_3)xc_32), rLX2 -> rLX2.id_byte);
    }

    @Override
    public void id_class(ruu_3 ruu_32) {
        ruu_32.id_protected(xd_3.id_char.id_class(this.id_byte));
    }

    public rLz_1<rLX> id_protected() {
        return this.id_break;
    }
}

