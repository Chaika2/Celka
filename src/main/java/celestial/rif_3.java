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

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rif_3 {
    public static final Codec<rif_3> id_class = RecordCodecBuilder.create(instance -> instance.group((App)Codec.BOOL.fieldOf("cold").forGetter(rif_32 -> rif_32.id_break), (App)Codec.FLOAT.fieldOf("mossiness").forGetter(rif_32 -> Float.valueOf(rif_32.id_byte)), (App)Codec.BOOL.fieldOf("air_pocket").forGetter(rif_32 -> rif_32.id_protected), (App)Codec.BOOL.fieldOf("overgrown").forGetter(rif_32 -> rif_32.id_throws), (App)Codec.BOOL.fieldOf("vines").forGetter(rif_32 -> rif_32.id_case), (App)Codec.BOOL.fieldOf("replace_with_blackstone").forGetter(rif_32 -> rif_32.id_catch)).apply((Applicative)instance, rif_3::new));
    public boolean id_break;
    public float id_byte = 0.2f;
    public boolean id_protected;
    public boolean id_throws;
    public boolean id_case;
    public boolean id_catch;

    public rif_3() {
    }

    public <T> rif_3(boolean bl, float f, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        this.id_break = bl;
        this.id_byte = f;
        this.id_protected = bl2;
        this.id_throws = bl3;
        this.id_case = bl4;
        this.id_catch = bl5;
    }
}

