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

import celestial.rUG;
import celestial.rUv_1;
import celestial.rfH_2;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public class rUM
implements rUv_1 {
    public static final Codec<rUM> id_class = RecordCodecBuilder.create(instance -> instance.group((App)Codec.BOOL.fieldOf("crystal_invulnerable").orElse((Object)false).forGetter(rUM2 -> rUM2.id_break), (App)rUG.id_class.listOf().fieldOf("spikes").forGetter(rUM2 -> rUM2.id_byte), (App)rfH_2.id_byte.optionalFieldOf("crystal_beam_target").forGetter(rUM2 -> Optional.ofNullable(rUM2.id_protected))).apply((Applicative)instance, rUM::new));
    private final boolean id_break;
    private final List<rUG> id_byte;
    private final rfH_2 id_protected;

    public List<rUG> id_byte() {
        return this.id_byte;
    }

    public rUM(boolean bl, List<rUG> list, rfH_2 rfH_22) {
        this(bl, list, Optional.ofNullable(rfH_22));
    }

    private rUM(boolean bl, List<rUG> list, Optional<rfH_2> optional) {
        this.id_break = bl;
        this.id_byte = list;
        this.id_protected = optional.orElse(null);
    }

    public boolean id_break() {
        return this.id_break;
    }

    public rfH_2 id_protected() {
        return this.id_protected;
    }
}

