/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.shorts.Short2ObjectMap
 *  it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.apache.logging.log4j.util.Supplier
 */
package celestial;

import celestial.rRP;
import celestial.rRr_1;
import celestial.rfH_2;
import celestial.rgU_2;
import celestial.rjh_3;
import celestial.rqR_2;
import celestial.rqu_3;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.util.Supplier;

public class rge_3 {
    private static final Logger id_class = LogManager.getLogger();
    private final Short2ObjectMap<rgU_2> id_break = new Short2ObjectOpenHashMap();
    private final Map<rRP, Set<rgU_2>> id_byte = Maps.newHashMap();
    private final Runnable id_protected;
    private boolean id_throws;

    public Optional<rRP> id_byte(rfH_2 rfH_22) {
        short s = rjh_3.id_break(rfH_22);
        rgU_2 rgU_22 = (rgU_2)this.id_break.get(s);
        return rgU_22 != null ? Optional.of(rgU_22.id_case()) : Optional.empty();
    }

    private rge_3(Runnable runnable, boolean bl, List<rgU_2> list) {
        this.id_protected = runnable;
        this.id_throws = bl;
        list.forEach(this::id_class);
    }

    public rge_3(Runnable runnable) {
        this(runnable, true, (List<rgU_2>)ImmutableList.of());
    }

    private /* synthetic */ void id_class(Short2ObjectMap short2ObjectMap, rfH_2 rfH_22, rRP rRP2) {
        short s = rjh_3.id_break(rfH_22);
        rgU_2 rgU_22 = (rgU_2)short2ObjectMap.computeIfAbsent(s, n -> new rgU_2(rfH_22, rRP2, this.id_protected));
        this.id_class(rgU_22);
    }

    public boolean id_class() {
        return this.id_throws;
    }

    public static Codec<rge_3> id_class(Runnable runnable) {
        return RecordCodecBuilder.create(instance -> instance.group((App)RecordCodecBuilder.point((Object)runnable), (App)Codec.BOOL.optionalFieldOf("Valid", (Object)false).forGetter(rge_32 -> rge_32.id_throws), (App)rgU_2.id_class(runnable).listOf().fieldOf("Records").forGetter(rge_32 -> ImmutableList.copyOf((Collection)rge_32.id_break.values()))).apply((Applicative)instance, rge_3::new)).orElseGet((Consumer)((Object)rqR_2.id_class("Failed to read POI section: ", arg_0 -> ((Logger)id_class).error(arg_0))), () -> new rge_3(runnable, false, (List<rgU_2>)ImmutableList.of()));
    }

    public void id_class(rfH_2 rfH_22, rRP rRP2) {
        if (this.id_class(new rgU_2(rfH_22, rRP2, this.id_protected))) {
            id_class.debug("Added POI of type {} @ {}", new Supplier[]{() -> rRP2, () -> rfH_22});
            this.id_protected.run();
        }
    }

    private boolean id_class(rgU_2 rgU_22) {
        rfH_2 rfH_22 = rgU_22.id_throws();
        rRP rRP3 = rgU_22.id_case();
        short s = rjh_3.id_break(rfH_22);
        rgU_2 rgU_23 = (rgU_2)this.id_break.get(s);
        if (rgU_23 != null) {
            if (rRP3.equals(rgU_23.id_case())) {
                return false;
            }
            String string = "POI data mismatch: already registered at " + rfH_22;
            if (rqu_3.id_byte) {
                throw rqR_2.id_byte(new IllegalStateException(string));
            }
            id_class.error(string);
        }
        this.id_break.put(s, (Object)rgU_22);
        this.id_byte.computeIfAbsent(rRP3, rRP2 -> Sets.newHashSet()).add(rgU_22);
        return true;
    }

    public Stream<rgU_2> id_class(Predicate<rRP> predicate, rRr_1 rRr_12) {
        return this.id_byte.entrySet().stream().filter(entry -> predicate.test((rRP)entry.getKey())).flatMap(entry -> ((Set)entry.getValue()).stream()).filter(rRr_12.id_class());
    }

    public boolean id_class(rfH_2 rfH_22, Predicate<rRP> predicate) {
        short s = rjh_3.id_break(rfH_22);
        rgU_2 rgU_22 = (rgU_2)this.id_break.get(s);
        return rgU_22 != null && predicate.test(rgU_22.id_case());
    }

    public void id_class(rfH_2 rfH_22) {
        rgU_2 rgU_22 = (rgU_2)this.id_break.remove(rjh_3.id_break(rfH_22));
        if (rgU_22 == null) {
            id_class.error("POI data mismatch: never registered at " + rfH_22);
        } else {
            this.id_byte.get(rgU_22.id_case()).remove(rgU_22);
            Supplier[] supplierArray = new Supplier[2];
            supplierArray[0] = rgU_22::id_case;
            supplierArray[1] = rgU_22::id_throws;
            id_class.debug("Removed POI of type {} @ {}", supplierArray);
            this.id_protected.run();
        }
    }

    public void id_class(Consumer<BiConsumer<rfH_2, rRP>> consumer) {
        if (!this.id_throws) {
            Short2ObjectOpenHashMap short2ObjectOpenHashMap = new Short2ObjectOpenHashMap(this.id_break);
            this.id_break();
            consumer.accept((arg_0, arg_1) -> this.id_class((Short2ObjectMap)short2ObjectOpenHashMap, arg_0, arg_1));
            this.id_throws = true;
            this.id_protected.run();
        }
    }

    private void id_break() {
        this.id_break.clear();
        this.id_byte.clear();
    }

    public boolean id_break(rfH_2 rfH_22) {
        rgU_2 rgU_22 = (rgU_2)this.id_break.get(rjh_3.id_break(rfH_22));
        if (rgU_22 == null) {
            throw rqR_2.id_byte(new IllegalStateException("POI never registered at " + rfH_22));
        }
        boolean bl = rgU_22.id_break();
        this.id_protected.run();
        return bl;
    }
}

