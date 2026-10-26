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

import celestial.rrSa_1;
import celestial.xc_3;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rrsG_2
implements rrSa_1 {
    public static final Codec<rrsG_2> id_class = RecordCodecBuilder.create(instance -> instance.group((App)xc_3.id_break.fieldOf("top_material").forGetter(rrsG_22 -> rrsG_22.id_break), (App)xc_3.id_break.fieldOf("under_material").forGetter(rrsG_22 -> rrsG_22.id_byte), (App)xc_3.id_break.fieldOf("underwater_material").forGetter(rrsG_22 -> rrsG_22.id_protected)).apply((Applicative)instance, rrsG_2::new));
    private final xc_3 id_break;
    private final xc_3 id_byte;
    private final xc_3 id_protected;

    public xc_3 id_byte() {
        return this.id_protected;
    }

    public rrsG_2(xc_3 xc_32, xc_3 xc_33, xc_3 xc_34) {
        this.id_break = xc_32;
        this.id_byte = xc_33;
        this.id_protected = xc_34;
    }

    @Override
    public xc_3 id_class() {
        return this.id_break;
    }

    @Override
    public xc_3 id_break() {
        return this.id_byte;
    }
}

