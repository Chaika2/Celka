/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rLd_1;
import celestial.rLh_1;
import celestial.rLx_1;
import celestial.rLz_1;
import celestial.rVL;
import celestial.ruu_3;
import com.mojang.serialization.Codec;

public class rLO
extends rLz_1<rLO>
implements rLx_1 {
    private static final rLd_1<rLO> id_class = new rLh_1();
    private final Codec<rLO> id_break = Codec.unit(this::id_class);

    @Override
    public String id_byte() {
        return rVL.id_switch.id_break(this).toString();
    }

    protected rLO(boolean bl) {
        super(bl, id_class);
    }

    @Override
    public void id_class(ruu_3 ruu_32) {
    }

    public rLO id_class() {
        return this;
    }

    @Override
    public Codec<rLO> id_break() {
        return this.id_break;
    }

    public /* synthetic */ rLz_1 id_protected() {
        return this.id_class();
    }
}

