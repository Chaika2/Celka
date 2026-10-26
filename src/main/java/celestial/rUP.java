/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
package celestial;

import celestial.rUv_1;
import celestial.rfH_2;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class rUP
implements rUv_1 {
    public static final Codec<rUP> id_class = RecordCodecBuilder.create(instance -> instance.group((App)rfH_2.id_byte.optionalFieldOf("exit").forGetter(rUP2 -> rUP2.id_break), (App)Codec.BOOL.fieldOf("exact").forGetter(rUP2 -> rUP2.id_byte)).apply((Applicative)instance, rUP::new));
    private final Optional<rfH_2> id_break;
    private final boolean id_byte;

    public Optional<rfH_2> id_byte() {
        return this.id_break;
    }

    private rUP(Optional<rfH_2> optional, boolean bl) {
        this.id_break = optional;
        this.id_byte = bl;
    }

    public static rUP id_class(rfH_2 rfH_22, boolean bl) {
        return new rUP(Optional.of(rfH_22), bl);
    }

    public static rUP id_break() {
        return new rUP(Optional.empty(), false);
    }

    public boolean id_protected() {
        return this.id_byte;
    }
}

