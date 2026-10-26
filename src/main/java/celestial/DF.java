/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.DL;
import celestial.Dw_1;
import celestial.rWc_1;
import java.util.function.Consumer;

public class DF {
    public final rWc_1<?> id_class;

    public DF(rWc_1<?> rWc_12) {
        this.id_class = rWc_12;
    }

    public static DF id_class(rWc_1<?> rWc_12) {
        return new DF(rWc_12);
    }

    public void id_class(Consumer<Dw_1> consumer, String string) {
        consumer.accept(new DL(this, string));
    }
}

