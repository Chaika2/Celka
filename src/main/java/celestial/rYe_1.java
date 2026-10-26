/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.doubles.DoubleArrayList
 *  it.unimi.dsi.fastutil.doubles.DoubleList
 */
package celestial;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import java.util.List;

public class rYe_1 {
    private final int id_break;
    private final DoubleList id_byte;
    public static final Codec<rYe_1> id_class = RecordCodecBuilder.create(instance -> instance.group((App)Codec.INT.fieldOf("firstOctave").forGetter(rYe_1::id_class), (App)Codec.DOUBLE.listOf().fieldOf("amplitudes").forGetter(rYe_1::id_break)).apply((Applicative)instance, rYe_1::new));

    public rYe_1(int n, List<Double> list) {
        this.id_break = n;
        this.id_byte = new DoubleArrayList(list);
    }

    public int id_class() {
        return this.id_break;
    }

    public DoubleList id_break() {
        return this.id_byte;
    }
}

