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

import celestial.NS;
import celestial.rYQ;
import celestial.rYV;
import celestial.rYg_1;
import celestial.rYj_1;
import celestial.rqA_2;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class rYW {
    public static final Codec<rYW> id_class = RecordCodecBuilder.create(instance -> instance.group((App)Codec.INT.fieldOf("fog_color").forGetter(rYW2 -> rYW2.id_break), (App)Codec.INT.fieldOf("water_color").forGetter(rYW2 -> rYW2.id_byte), (App)Codec.INT.fieldOf("water_fog_color").forGetter(rYW2 -> rYW2.id_protected), (App)Codec.INT.fieldOf("sky_color").forGetter(rYW2 -> rYW2.id_throws), (App)Codec.INT.optionalFieldOf("foliage_color").forGetter(rYW2 -> rYW2.id_case), (App)Codec.INT.optionalFieldOf("grass_color").forGetter(rYW2 -> rYW2.id_catch), (App)rYQ.CODEC.optionalFieldOf("grass_color_modifier", (Object)rYQ.NONE).forGetter(rYW2 -> rYW2.id_private), (App)rYV.id_class.optionalFieldOf("particle").forGetter(rYW2 -> rYW2.id_implements), (App)rqA_2.id_class.optionalFieldOf("ambient_sound").forGetter(rYW2 -> rYW2.id_finally), (App)rYj_1.id_class.optionalFieldOf("mood_sound").forGetter(rYW2 -> rYW2.id_extends), (App)rYg_1.id_class.optionalFieldOf("additions_sound").forGetter(rYW2 -> rYW2.id_native), (App)NS.id_class.optionalFieldOf("music").forGetter(rYW2 -> rYW2.id_volatile)).apply((Applicative)instance, rYW::new));
    private final int id_break;
    private final int id_byte;
    private final int id_protected;
    private final int id_throws;
    private final Optional<Integer> id_case;
    private final Optional<Integer> id_catch;
    private final rYQ id_private;
    private final Optional<rYV> id_implements;
    private final Optional<rqA_2> id_finally;
    private final Optional<rYj_1> id_extends;
    private final Optional<rYg_1> id_native;
    private final Optional<NS> id_volatile;

    public int id_byte() {
        return this.id_protected;
    }

    public rYW(int n, int n2, int n3, int n4, Optional<Integer> optional, Optional<Integer> optional2, rYQ rYQ2, Optional<rYV> optional3, Optional<rqA_2> optional4, Optional<rYj_1> optional5, Optional<rYg_1> optional6, Optional<NS> optional7) {
        this.id_break = n;
        this.id_byte = n2;
        this.id_protected = n3;
        this.id_throws = n4;
        this.id_case = optional;
        this.id_catch = optional2;
        this.id_private = rYQ2;
        this.id_implements = optional3;
        this.id_finally = optional4;
        this.id_extends = optional5;
        this.id_native = optional6;
        this.id_volatile = optional7;
    }

    public int id_class() {
        return this.id_break;
    }

    public int id_break() {
        return this.id_byte;
    }

    public Optional<Integer> id_throws() {
        return this.id_case;
    }

    public Optional<rYj_1> id_finally() {
        return this.id_extends;
    }

    public rYQ id_catch() {
        return this.id_private;
    }

    public Optional<rYg_1> id_extends() {
        return this.id_native;
    }

    public Optional<Integer> id_case() {
        return this.id_catch;
    }

    public Optional<rqA_2> id_implements() {
        return this.id_finally;
    }

    public int id_protected() {
        return this.id_throws;
    }

    public Optional<rYV> id_private() {
        return this.id_implements;
    }

    public Optional<NS> id_native() {
        return this.id_volatile;
    }
}

