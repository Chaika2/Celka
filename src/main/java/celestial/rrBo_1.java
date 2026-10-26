/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rKL;
import celestial.rVL;
import celestial.reX_2;
import celestial.rfH_2;
import celestial.rrSP;
import celestial.rrSu_1;
import celestial.rrSx_1;
import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.Stream;

public class rrBo_1<DC extends rrSx_1>
implements rKL<rrBo_1<?>> {
    public static final Codec<rrBo_1<?>> id_class = rVL.j.dispatch("type", rrBo_12 -> rrBo_12.id_break, rrSu_1::id_class);
    private final rrSu_1<DC> id_break;
    private final DC id_byte;

    public rrBo_1(rrSu_1<DC> rrSu_12, DC DC2) {
        this.id_break = rrSu_12;
        this.id_byte = DC2;
    }

    public String toString() {
        return String.format("[%s %s]", rVL.j.id_break(this.id_break), this.id_byte);
    }

    public Stream<rfH_2> id_class(reX_2 reX_22, Random random, rfH_2 rfH_22) {
        return this.id_break.id_class(reX_22, random, this.id_byte, rfH_22);
    }

    @Override
    public /* synthetic */ Object id_class(rrBo_1 rrBo_12) {
        return this.id_break(rrBo_12);
    }

    public DC id_break() {
        return this.id_byte;
    }

    public rrBo_1<?> id_break(rrBo_1<?> rrBo_12) {
        return new rrBo_1<rrSP>(rrSu_1.id_instanceof, new rrSP(rrBo_12, this));
    }
}

