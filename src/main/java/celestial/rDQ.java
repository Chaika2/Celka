/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
package celestial;

import celestial.rUh_1;
import celestial.rVL;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.OptionalInt;

public abstract class rDQ {
    public static final Codec<rDQ> id_class = rVL.rs.dispatch(rDQ::id_break, rUh_1::id_class);
    protected final OptionalInt id_break;

    public OptionalInt id_byte() {
        return this.id_break;
    }

    public rDQ(OptionalInt optionalInt) {
        this.id_break = optionalInt;
    }

    protected static <S extends rDQ> RecordCodecBuilder<S, OptionalInt> id_class() {
        return Codec.intRange((int)0, (int)80).optionalFieldOf("min_clipped_height").xmap(optional -> optional.map(OptionalInt::of).orElse(OptionalInt.empty()), optionalInt -> optionalInt.isPresent() ? Optional.of(optionalInt.getAsInt()) : Optional.empty()).forGetter(rDQ2 -> rDQ2.id_break);
    }

    public abstract int id_class(int var1, int var2);

    protected abstract rUh_1<?> id_break();
}

