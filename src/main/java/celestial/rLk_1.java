/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.RY;
import celestial.rLW;
import celestial.rLd_1;
import celestial.rLx_1;
import celestial.rLz_1;
import celestial.rVL;
import celestial.rdn_3;
import celestial.ruu_3;
import com.mojang.serialization.Codec;

public class rLk_1
implements rLx_1 {
    public static final rLd_1<rLk_1> id_class = new rLW();
    private final rLz_1<rLk_1> id_break;
    private final rdn_3 id_byte;

    @Override
    public String id_byte() {
        return rVL.id_switch.id_break(this.id_protected()) + " " + new RY(this.id_byte.id_break(), this.id_byte.id_package()).id_break();
    }

    public rLk_1(rLz_1<rLk_1> rLz_12, rdn_3 rdn_32) {
        this.id_break = rLz_12;
        this.id_byte = rdn_32;
    }

    public rdn_3 id_class() {
        return this.id_byte;
    }

    public static Codec<rLk_1> id_class(rLz_1<rLk_1> rLz_12) {
        return rdn_3.id_class.xmap(rdn_32 -> new rLk_1(rLz_12, (rdn_3)rdn_32), rLk_12 -> rLk_12.id_byte);
    }

    @Override
    public void id_class(ruu_3 ruu_32) {
        ruu_32.id_class(this.id_byte);
    }

    public rLz_1<rLk_1> id_protected() {
        return this.id_break;
    }
}

