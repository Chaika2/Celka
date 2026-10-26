/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rLd_1;
import celestial.rLz_1;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public class rLN
extends rLz_1<T> {
    public final /* synthetic */ Function id_class;

    public rLN(boolean bl, rLd_1 rLd_12, Function function) {
        this.id_class = function;
        super(bl, rLd_12);
    }

    @Override
    public Codec<T> id_break() {
        return (Codec)this.id_class.apply(this);
    }
}

