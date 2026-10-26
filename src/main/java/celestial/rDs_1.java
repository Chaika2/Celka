/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 */
package celestial;

import celestial.rDr_1;
import celestial.rKi_1;
import celestial.rTB;
import celestial.rfH_2;
import celestial.xc_3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Random;

public class rDs_1
extends rKi_1 {
    public static final Codec<rDs_1> id_class = rTB.id_class(xc_3.id_break).comapFlatMap(rDs_1::id_class, rDs_12 -> rDs_12.id_byte).fieldOf("entries").codec();
    private final rTB<xc_3> id_byte;

    public rDs_1() {
        this(new rTB<xc_3>());
    }

    private rDs_1(rTB<xc_3> rTB2) {
        this.id_byte = rTB2;
    }

    private static DataResult<rDs_1> id_class(rTB<xc_3> rTB2) {
        return rTB2.id_break() ? DataResult.error((String)"WeightedStateProvider with no states") : DataResult.success((Object)new rDs_1(rTB2));
    }

    @Override
    public xc_3 id_class(Random random, rfH_2 rfH_22) {
        return this.id_byte.id_break(random);
    }

    public rDs_1 id_class(xc_3 xc_32, int n) {
        this.id_byte.id_class(xc_32, n);
        return this;
    }

    @Override
    protected rDr_1<?> id_class() {
        return rDr_1.id_break;
    }
}

