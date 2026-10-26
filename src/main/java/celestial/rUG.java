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

import celestial.rfH_2;
import celestial.rfl_3;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rUG {
    public static final Codec<rUG> id_class = RecordCodecBuilder.create(instance -> instance.group((App)Codec.INT.fieldOf("centerX").orElse((Object)0).forGetter(rUG2 -> rUG2.id_break), (App)Codec.INT.fieldOf("centerZ").orElse((Object)0).forGetter(rUG2 -> rUG2.id_byte), (App)Codec.INT.fieldOf("radius").orElse((Object)0).forGetter(rUG2 -> rUG2.id_protected), (App)Codec.INT.fieldOf("height").orElse((Object)0).forGetter(rUG2 -> rUG2.id_throws), (App)Codec.BOOL.fieldOf("guarded").orElse((Object)false).forGetter(rUG2 -> rUG2.id_case)).apply((Applicative)instance, rUG::new));
    private final int id_break;
    private final int id_byte;
    private final int id_protected;
    private final int id_throws;
    private final boolean id_case;
    private final rfl_3 id_catch;

    public int id_byte() {
        return this.id_protected;
    }

    public rUG(int n, int n2, int n3, int n4, boolean bl) {
        this.id_break = n;
        this.id_byte = n2;
        this.id_protected = n3;
        this.id_throws = n4;
        this.id_case = bl;
        this.id_catch = new rfl_3(n - n3, 0.0, n2 - n3, n + n3, 256.0, n2 + n3);
    }

    public int id_class() {
        return this.id_break;
    }

    public boolean id_class(rfH_2 rfH_22) {
        return rfH_22.b_() >> 4 == this.id_break >> 4 && rfH_22.d_() >> 4 == this.id_byte >> 4;
    }

    public int id_break() {
        return this.id_byte;
    }

    public boolean id_throws() {
        return this.id_case;
    }

    public rfl_3 id_case() {
        return this.id_catch;
    }

    public int id_protected() {
        return this.id_throws;
    }
}

