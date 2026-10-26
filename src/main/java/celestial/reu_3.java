/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.objects.ObjectArrays
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.rVA;
import celestial.rVL;
import celestial.rem_3;
import celestial.rev_3;
import celestial.rfH_2;
import celestial.rqO_2;
import celestial.rqR_2;
import celestial.rqd_3;
import celestial.rrPt_1;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class reu_3 {
    private static final Logger id_byte = LogManager.getLogger();
    public static final Codec<reu_3> id_class = RecordCodecBuilder.create(instance -> instance.group((App)rqO_2.id_class.fieldOf("name").forGetter(reu_3::id_break), (App)rqO_2.id_class.fieldOf("fallback").forGetter(reu_3::id_class), (App)Codec.mapPair((MapCodec)rev_3.id_byte.fieldOf("element"), (MapCodec)Codec.INT.fieldOf("weight")).codec().listOf().promotePartial((Consumer)((Object)rqR_2.id_class("Pool element: ", arg_0 -> ((Logger)id_byte).error(arg_0)))).fieldOf("elements").forGetter(reu_32 -> reu_32.id_throws)).apply((Applicative)instance, reu_3::new));
    public static final Codec<Supplier<reu_3>> id_break = rVA.id_class(rVL.A, id_class);
    private final rqO_2 id_protected;
    private final List<Pair<rev_3, Integer>> id_throws;
    private final List<rev_3> id_case;
    private final rqO_2 id_catch;
    private int id_private = Integer.MIN_VALUE;

    public int id_byte() {
        return this.id_case.size();
    }

    public reu_3(rqO_2 rqO_22, rqO_2 rqO_23, List<Pair<rev_3, Integer>> list) {
        this.id_protected = rqO_22;
        this.id_throws = list;
        this.id_case = Lists.newArrayList();
        for (Pair<rev_3, Integer> pair : list) {
            rev_3 rev_32 = (rev_3)pair.getFirst();
            for (int i = 0; i < (Integer)pair.getSecond(); ++i) {
                this.id_case.add(rev_32);
            }
        }
        this.id_catch = rqO_23;
    }

    public reu_3(rqO_2 rqO_22, rqO_2 rqO_23, List<Pair<Function<rem_3, ? extends rev_3>, Integer>> list, rem_3 rem_32) {
        this.id_protected = rqO_22;
        this.id_throws = Lists.newArrayList();
        this.id_case = Lists.newArrayList();
        for (Pair<Function<rem_3, ? extends rev_3>, Integer> pair : list) {
            rev_3 rev_32 = (rev_3)((Function)pair.getFirst()).apply(rem_32);
            this.id_throws.add((Pair<rev_3, Integer>)Pair.of((Object)rev_32, (Object)((Integer)pair.getSecond())));
            for (int i = 0; i < (Integer)pair.getSecond(); ++i) {
                this.id_case.add(rev_32);
            }
        }
        this.id_catch = rqO_23;
    }

    public int id_class(rrPt_1 rrPt_12) {
        if (this.id_private == Integer.MIN_VALUE) {
            this.id_private = this.id_case.stream().mapToInt(rev_32 -> rev_32.id_class(rrPt_12, rfH_2.id_protected, rqd_3.NONE).id_throws()).max().orElse(0);
        }
        return this.id_private;
    }

    public rev_3 id_class(Random random) {
        return this.id_case.get(random.nextInt(this.id_case.size()));
    }

    public rqO_2 id_class() {
        return this.id_catch;
    }

    public List<rev_3> id_break(Random random) {
        return ImmutableList.copyOf((Object[])((rev_3[])ObjectArrays.shuffle((Object[])this.id_case.toArray(new rev_3[0]), (Random)random)));
    }

    public rqO_2 id_break() {
        return this.id_protected;
    }
}

