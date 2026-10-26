/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rAT;
import celestial.rAY;
import celestial.rAZ;
import celestial.rAm_1;
import celestial.rAp_1;
import celestial.rAq_1;
import java.util.function.Consumer;

public class rAf_1
implements rAm_1 {
    private final rAY id_class = new rAY("minecraft");

    @Override
    public void id_class(Consumer<rAp_1> consumer, rAq_1 rAq_12) {
        rAp_1 rAp_12 = rAp_1.id_class("vanilla", false, () -> this.id_class, rAq_12, rAT.BOTTOM, rAZ.id_break);
        if (rAp_12 != null) {
            consumer.accept(rAp_12);
        }
    }
}

