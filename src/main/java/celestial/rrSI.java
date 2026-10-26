/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
package celestial;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Function;

public class rrSI {
    public static final Codec<rrSI> id_class = RecordCodecBuilder.create(instance -> instance.group((App)Codec.intRange((int)0, (int)4096).fieldOf("spacing").forGetter(rrSI2 -> rrSI2.id_break), (App)Codec.intRange((int)0, (int)4096).fieldOf("separation").forGetter(rrSI2 -> rrSI2.id_byte), (App)Codec.intRange((int)0, (int)Integer.MAX_VALUE).fieldOf("salt").forGetter(rrSI2 -> rrSI2.id_protected)).apply((Applicative)instance, rrSI::new)).comapFlatMap(rrSI2 -> rrSI2.id_break <= rrSI2.id_byte ? DataResult.error((String)"Spacing has to be smaller than separation") : DataResult.success((Object)rrSI2), Function.identity());
    private final int id_break;
    private final int id_byte;
    private final int id_protected;

    public int id_byte() {
        return this.id_protected;
    }

    public rrSI(int n, int n2, int n3) {
        this.id_break = n;
        this.id_byte = n2;
        this.id_protected = n3;
    }

    public int id_class() {
        return this.id_break;
    }

    public int id_break() {
        return this.id_byte;
    }
}

