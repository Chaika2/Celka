/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
package celestial;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import java.util.Random;
import java.util.function.Function;

public class rUX {
    public static final Codec<rUX> id_class = Codec.either((Codec)Codec.INT, (Codec)RecordCodecBuilder.create(instance -> instance.group((App)Codec.INT.fieldOf("base").forGetter(rUX2 -> rUX2.id_break), (App)Codec.INT.fieldOf("spread").forGetter(rUX2 -> rUX2.id_byte)).apply((Applicative)instance, rUX::new)).comapFlatMap(rUX2 -> rUX2.id_byte < 0 ? DataResult.error((String)("Spread must be non-negative, got: " + rUX2.id_byte)) : DataResult.success((Object)rUX2), Function.identity())).xmap(either -> (rUX)either.map(rUX::id_class, rUX2 -> rUX2), rUX2 -> rUX2.id_byte == 0 ? Either.left((Object)rUX2.id_break) : Either.right((Object)rUX2));
    private final int id_break;
    private final int id_byte;

    private rUX(int n, int n2) {
        this.id_break = n;
        this.id_byte = n2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            rUX rUX2 = (rUX)object;
            return this.id_break == rUX2.id_break && this.id_byte == rUX2.id_byte;
        }
        return false;
    }

    public String toString() {
        return "[" + this.id_break + "-" + (this.id_break + this.id_byte) + "]";
    }

    public int hashCode() {
        return Objects.hash(this.id_break, this.id_byte);
    }

    public static Codec<rUX> id_class(int n, int n2, int n3) {
        Function<rUX, DataResult> function = rUX2 -> {
            if (rUX2.id_break >= n && rUX2.id_break <= n2) {
                return rUX2.id_byte <= n3 ? DataResult.success((Object)rUX2) : DataResult.error((String)("Spread too big: " + rUX2.id_byte + " > " + n3));
            }
            return DataResult.error((String)("Base value out of range: " + rUX2.id_break + " [" + n + "-" + n2 + "]"));
        };
        return id_class.flatXmap(function, function);
    }

    public static rUX id_class(int n) {
        return new rUX(n, 0);
    }

    public static rUX id_class(int n, int n2) {
        return new rUX(n, n2);
    }

    public int id_class(Random random) {
        return this.id_byte == 0 ? this.id_break : this.id_break + random.nextInt(this.id_byte + 1);
    }
}

