/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.Lifecycle
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
package celestial;

import celestial.rrSt_1;
import celestial.rrSw_1;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rrST {
    public static final Codec<rrST> id_class = RecordCodecBuilder.create(instance -> instance.group((App)Codec.intRange((int)0, (int)256).fieldOf("height").forGetter(rrST::id_class), (App)rrSt_1.id_class.fieldOf("sampling").forGetter(rrST::id_break), (App)rrSw_1.id_class.fieldOf("top_slide").forGetter(rrST::id_byte), (App)rrSw_1.id_class.fieldOf("bottom_slide").forGetter(rrST::id_protected), (App)Codec.intRange((int)1, (int)4).fieldOf("size_horizontal").forGetter(rrST::id_throws), (App)Codec.intRange((int)1, (int)4).fieldOf("size_vertical").forGetter(rrST::id_case), (App)Codec.DOUBLE.fieldOf("density_factor").forGetter(rrST::id_catch), (App)Codec.DOUBLE.fieldOf("density_offset").forGetter(rrST::id_private), (App)Codec.BOOL.fieldOf("simplex_surface_noise").forGetter(rrST::id_implements), (App)Codec.BOOL.optionalFieldOf("random_density_offset", (Object)false, Lifecycle.experimental()).forGetter(rrST::id_finally), (App)Codec.BOOL.optionalFieldOf("island_noise_override", (Object)false, Lifecycle.experimental()).forGetter(rrST::id_extends), (App)Codec.BOOL.optionalFieldOf("amplified", (Object)false, Lifecycle.experimental()).forGetter(rrST::id_native)).apply((Applicative)instance, rrST::new));
    private final int id_break;
    private final rrSt_1 id_byte;
    private final rrSw_1 id_protected;
    private final rrSw_1 id_throws;
    private final int id_case;
    private final int id_catch;
    private final double id_private;
    private final double id_implements;
    private final boolean id_finally;
    private final boolean id_extends;
    private final boolean id_native;
    private final boolean id_volatile;

    public rrSw_1 id_byte() {
        return this.id_protected;
    }

    public rrST(int n, rrSt_1 rrSt_12, rrSw_1 rrSw_12, rrSw_1 rrSw_13, int n2, int n3, double d, double d2, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        this.id_break = n;
        this.id_byte = rrSt_12;
        this.id_protected = rrSw_12;
        this.id_throws = rrSw_13;
        this.id_case = n2;
        this.id_catch = n3;
        this.id_private = d;
        this.id_implements = d2;
        this.id_finally = bl;
        this.id_extends = bl2;
        this.id_native = bl3;
        this.id_volatile = bl4;
    }

    public int id_class() {
        return this.id_break;
    }

    public rrSt_1 id_break() {
        return this.id_byte;
    }

    public int id_throws() {
        return this.id_case;
    }

    @Deprecated
    public boolean id_finally() {
        return this.id_extends;
    }

    public double id_catch() {
        return this.id_private;
    }

    @Deprecated
    public boolean id_extends() {
        return this.id_native;
    }

    public int id_case() {
        return this.id_catch;
    }

    @Deprecated
    public boolean id_implements() {
        return this.id_finally;
    }

    public rrSw_1 id_protected() {
        return this.id_throws;
    }

    public double id_private() {
        return this.id_implements;
    }

    @Deprecated
    public boolean id_native() {
        return this.id_volatile;
    }
}

