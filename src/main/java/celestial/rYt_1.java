/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMap
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.Keyable
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.aH_2;
import celestial.aI_2;
import celestial.rVL;
import celestial.rYI;
import celestial.rYf_1;
import celestial.rpH_2;
import celestial.rqR_2;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Keyable;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Stream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rYt_1 {
    public static final Logger id_class = LogManager.getLogger();
    public static final rYt_1 id_break = new rYt_1(0.1f, (Map)Stream.of(aH_2.values()).collect(ImmutableMap.toImmutableMap(aH_22 -> aH_22, aH_22 -> ImmutableList.of())), (Map<aI_2<?>, rYI>)ImmutableMap.of(), false);
    public static final MapCodec<rYt_1> id_byte = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.FLOAT.optionalFieldOf("creature_spawn_probability", (Object)Float.valueOf(0.1f)).forGetter(rYt_12 -> Float.valueOf(rYt_12.id_protected)), (App)Codec.simpleMap(aH_2.CODEC, (Codec)rYf_1.id_class.listOf().promotePartial((Consumer)((Object)rqR_2.id_class("Spawn data: ", arg_0 -> ((Logger)id_class).error(arg_0)))), (Keyable)rpH_2.id_class(aH_2.values())).fieldOf("spawners").forGetter(rYt_12 -> rYt_12.id_throws), (App)Codec.simpleMap(rVL.id_transient, rYI.id_class, rVL.id_transient).fieldOf("spawn_costs").forGetter(rYt_12 -> rYt_12.id_case), (App)Codec.BOOL.fieldOf("player_spawn_friendly").orElse((Object)false).forGetter(rYt_1::id_break)).apply((Applicative)instance, rYt_1::new));
    private final float id_protected;
    private final Map<aH_2, List<rYf_1>> id_throws;
    private final Map<aI_2<?>, rYI> id_case;
    private final boolean id_catch;

    public rYt_1(float f, Map<aH_2, List<rYf_1>> map, Map<aI_2<?>, rYI> map2, boolean bl) {
        this.id_protected = f;
        this.id_throws = map;
        this.id_case = map2;
        this.id_catch = bl;
    }

    public List<rYf_1> id_class(aH_2 aH_22) {
        return this.id_throws.getOrDefault(aH_22, (List<rYf_1>)ImmutableList.of());
    }

    public float id_class() {
        return this.id_protected;
    }

    public rYI id_class(aI_2<?> aI_22) {
        return this.id_case.get(aI_22);
    }

    public boolean id_break() {
        return this.id_catch;
    }
}

