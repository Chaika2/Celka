/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableMap
 *  com.mojang.datafixers.DataFixUtils
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

import celestial.rDM;
import celestial.rDg_1;
import celestial.rKu_1;
import celestial.rUO;
import celestial.reP_2;
import celestial.rpH_2;
import celestial.rqR_2;
import celestial.rrSR;
import celestial.rrSY;
import celestial.rrSa_1;
import celestial.rrrZ;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Keyable;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rYv_1 {
    public static final Logger id_class = LogManager.getLogger();
    public static final rYv_1 id_break = new rYv_1(() -> rrSY.id_int, (Map<rKu_1, List<Supplier<rDM<?>>>>)ImmutableMap.of(), (List<List<Supplier<rDg_1<?, ?>>>>)ImmutableList.of(), (List<Supplier<reP_2<?, ?>>>)ImmutableList.of());
    public static final MapCodec<rYv_1> id_byte = RecordCodecBuilder.mapCodec(instance -> instance.group((App)rrSR.id_break.fieldOf("surface_builder").forGetter(rYv_12 -> rYv_12.id_protected), (App)Codec.simpleMap(rKu_1.field_236074_c_, (Codec)rDM.id_byte.promotePartial((Consumer)((Object)rqR_2.id_class("Carver: ", arg_0 -> ((Logger)id_class).error(arg_0)))), (Keyable)rpH_2.id_class(rKu_1.values())).fieldOf("carvers").forGetter(rYv_12 -> rYv_12.id_throws), (App)rDg_1.id_byte.promotePartial((Consumer)((Object)rqR_2.id_class("Feature: ", arg_0 -> ((Logger)id_class).error(arg_0)))).listOf().fieldOf("features").forGetter(rYv_12 -> rYv_12.id_case), (App)reP_2.id_byte.promotePartial((Consumer)((Object)rqR_2.id_class("Structure start: ", arg_0 -> ((Logger)id_class).error(arg_0)))).fieldOf("starts").forGetter(rYv_12 -> rYv_12.id_catch)).apply((Applicative)instance, rYv_1::new));
    private final Supplier<rrSR<?>> id_protected;
    private final Map<rKu_1, List<Supplier<rDM<?>>>> id_throws;
    private final List<List<Supplier<rDg_1<?, ?>>>> id_case;
    private final List<Supplier<reP_2<?, ?>>> id_catch;
    private final List<rDg_1<?, ?>> id_private;

    public List<List<Supplier<rDg_1<?, ?>>>> id_byte() {
        return this.id_case;
    }

    public rYv_1(Supplier<rrSR<?>> supplier, Map<rKu_1, List<Supplier<rDM<?>>>> map, List<List<Supplier<rDg_1<?, ?>>>> list, List<Supplier<reP_2<?, ?>>> list2) {
        this.id_protected = supplier;
        this.id_throws = map;
        this.id_case = list;
        this.id_catch = list2;
        this.id_private = (List)list.stream().flatMap(Collection::stream).map(Supplier::get).flatMap(rDg_1::id_protected).filter(rDg_12 -> rDg_12.id_throws == rUO.id_protected).collect(ImmutableList.toImmutableList());
    }

    public List<Supplier<rDM<?>>> id_class(rKu_1 rKu_12) {
        return (List)this.id_throws.getOrDefault(rKu_12, (List<Supplier<rDM<?>>>)ImmutableList.of());
    }

    public reP_2<?, ?> id_class(reP_2<?, ?> reP_22) {
        return (reP_2)DataFixUtils.orElse(this.id_catch.stream().map(Supplier::get).filter(reP_23 -> reP_23.id_protected == reP_22.id_protected).findAny(), reP_22);
    }

    public Collection<Supplier<reP_2<?, ?>>> id_class() {
        return this.id_catch;
    }

    public boolean id_class(rrrZ<?> rrrZ2) {
        return this.id_catch.stream().anyMatch(supplier -> ((reP_2)supplier.get()).id_protected == rrrZ2);
    }

    public List<rDg_1<?, ?>> id_break() {
        return this.id_private;
    }

    public rrSa_1 id_throws() {
        return this.id_protected.get().id_class();
    }

    public Supplier<rrSR<?>> id_protected() {
        return this.id_protected;
    }
}

