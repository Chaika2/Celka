/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
package celestial;

import celestial.rVL;
import celestial.rVn_1;
import celestial.rYD;
import celestial.rYG;
import celestial.rYa_1;
import celestial.rqO_2;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public final class rYU {
    public static final MapCodec<rYU> id_class = RecordCodecBuilder.mapCodec(instance -> instance.group((App)rqO_2.id_class.flatXmap(rqO_22 -> Optional.ofNullable(rYa_1.id_break.get(rqO_22)).map(DataResult::success).orElseGet(() -> DataResult.error((String)("Unknown preset: " + rqO_22))), rYa_12 -> DataResult.success((Object)rYa_12.id_byte)).fieldOf("preset").stable().forGetter(rYU::id_class), (App)rVn_1.id_class(rVL.n).forGetter(rYU::id_break), (App)Codec.LONG.fieldOf("seed").stable().forGetter(rYU::id_byte)).apply((Applicative)instance, instance.stable(rYU::new)));
    private final rYa_1 id_break;
    private final rVL<rYG> id_byte;
    private final long id_protected;

    public long id_byte() {
        return this.id_protected;
    }

    public rYU(rYa_1 rYa_12, rVL<rYG> rVL2, long l) {
        this.id_break = rYa_12;
        this.id_byte = rVL2;
        this.id_protected = l;
    }

    public rYa_1 id_class() {
        return this.id_break;
    }

    public rVL<rYG> id_break() {
        return this.id_byte;
    }

    public rYD id_protected() {
        return this.id_break.id_class(this.id_byte, this.id_protected);
    }
}

