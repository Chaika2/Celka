/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 */
package celestial;

import celestial.gp_3;
import celestial.gy_3;
import celestial.rRA;
import celestial.rRC;
import celestial.rRF;
import celestial.rRv_1;
import celestial.rnW_2;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class rRn_1<T extends rRC<T>> {
    private final Supplier<ArgumentType<?>> id_class;
    private final Function<rRn_1<T>, T> id_break;
    public final BiConsumer<rnW_2, T> id_byte;
    private final rRv_1<T> id_protected;

    public rRn_1(Supplier<ArgumentType<?>> supplier, Function<rRn_1<T>, T> function, BiConsumer<rnW_2, T> biConsumer, rRv_1<T> rRv_12) {
        this.id_class = supplier;
        this.id_break = function;
        this.id_byte = biConsumer;
        this.id_protected = rRv_12;
    }

    public void id_class(rRF rRF2, rRA<T> rRA2) {
        this.id_protected.call(rRF2, rRA2, this);
    }

    public T id_class() {
        return (T)((rRC)this.id_break.apply(this));
    }

    public RequiredArgumentBuilder<gy_3, ?> id_class(String string) {
        return gp_3.id_class(string, this.id_class.get());
    }
}

