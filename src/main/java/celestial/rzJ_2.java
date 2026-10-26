/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rNL;
import celestial.rQz_1;
import celestial.rzh_3;
import java.util.function.Function;

public final class rzJ_2
extends rzh_3<rzJ_2> {
    private final Function<rQz_1[], rNL> id_class;

    public rzJ_2(Function<rQz_1[], rNL> function) {
        this.id_class = function;
    }

    @Override
    protected /* synthetic */ rzh_3 id_break() {
        return this.id_throws();
    }

    protected rzJ_2 id_throws() {
        return this;
    }

    @Override
    public rNL id_case() {
        return this.id_class.apply(this.id_byte());
    }
}

