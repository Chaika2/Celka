/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rlC_2;
import celestial.rlY_2;
import celestial.rle_3;
import java.util.function.Consumer;

public class rlo_3
implements rlC_2 {
    public final /* synthetic */ Consumer id_class;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public rlo_3(rlY_2 rlY_22, Consumer consumer) {
        this.id_class = consumer;
    }

    @Override
    public void id_class(rle_3 rle_32) {
    }

    @Override
    public void id_break(rle_3 rle_32) {
        this.id_class.accept(rle_32);
    }
}

