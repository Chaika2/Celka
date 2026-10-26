/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rTX;
import celestial.rqg_3;
import java.util.function.Function;
import java.util.function.IntSupplier;

public final class roL_2<T> {
    public final Function<rTX<rqg_3>, T> id_class;
    public final long id_break;
    public final IntSupplier id_byte;

    public roL_2(Function<rTX<rqg_3>, T> function, long l, IntSupplier intSupplier) {
        this.id_class = function;
        this.id_break = l;
        this.id_byte = intSupplier;
    }
}

