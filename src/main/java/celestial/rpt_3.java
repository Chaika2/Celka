/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rYB;
import celestial.rfH_2;
import celestial.rpq_3;
import java.util.Optional;
import java.util.function.BiFunction;

public class rpt_3
implements rpq_3 {
    public final /* synthetic */ rYB id_break;
    public final /* synthetic */ rfH_2 id_byte;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public rpt_3(rYB rYB2, rfH_2 rfH_22) {
        this.id_break = rYB2;
        this.id_byte = rfH_22;
    }

    @Override
    public <T> Optional<T> id_class(BiFunction<rYB, rfH_2, T> biFunction) {
        return Optional.of(biFunction.apply(this.id_break, this.id_byte));
    }
}

