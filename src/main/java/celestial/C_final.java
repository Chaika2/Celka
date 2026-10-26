/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_native;
import celestial.a_1;
import celestial.i_1;
import celestial.rP_2;
import celestial.rW_2;
import java.util.Optional;

public interface C_final
extends C_native {
    public rP_2 id_byte();

    default public Optional<Double> id_class(boolean bl) {
        rW_2 rW_22 = this.id_throws();
        if (rW_22 == null) {
            return Optional.empty();
        }
        int n = bl ? rW_22.id_break() : rW_22.id_break() + 1;
        return Optional.of(rW_22.id_class().id_class(n));
    }

    public Optional<Double> id_class();

    public boolean id_break();

    public rW_2 id_throws();

    default public boolean id_finally() {
        return this.id_throws() != null;
    }

    public boolean id_catch();

    default public Optional<Double> id_extends() {
        return this.id_class(true);
    }

    public Optional<? extends i_1> id_case();

    public rW_2 id_implements();

    default public Optional<a_1> id_protected() {
        return Optional.ofNullable(this.id_throws()).map(rW_2::id_class);
    }

    public void id_private();
}

