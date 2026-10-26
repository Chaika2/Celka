/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rlZ_2;
import celestial.rlb_3;
import celestial.rrPJ;
import celestial.rrPL;
import celestial.xc_3;
import celestial.xd_3;
import com.mojang.serialization.Codec;
import java.util.Random;

public class rrPC
extends rrPL {
    public static final Codec<rrPC> id_class = rlb_3.id_class(() -> rlZ_2.id_class().id_class()).fieldOf("tag").xmap(rrPC::new, rrPC2 -> rrPC2.id_break).codec();
    private final rlb_3<xd_3> id_break;

    public rrPC(rlb_3<xd_3> rlb_32) {
        this.id_break = rlb_32;
    }

    @Override
    public boolean id_class(xc_3 xc_32, Random random) {
        return xc_32.id_class(this.id_break);
    }

    @Override
    protected rrPJ<?> id_class() {
        return rrPJ.id_protected;
    }
}

