/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Dynamic
 */
package celestial;

import celestial.rTC;
import celestial.rwb_3;
import celestial.ryv_3;
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public abstract class rwO_2 {
    private final Type<Pair<String, Dynamic<?>>> id_throws = DSL.named((String)rTC.id_volatile.typeName(), (Type)DSL.remainderType());
    protected final OpticFinder<List<Pair<String, Dynamic<?>>>> id_class = DSL.fieldFinder((String)"Palette", (Type)DSL.list(this.id_throws));
    protected final List id_break;
    protected final int id_byte;
    protected ryv_3 id_protected;

    public int id_byte() {
        return this.id_byte;
    }

    public int id_byte(int n) {
        return this.id_protected.id_class(n);
    }

    public rwO_2(Typed<?> typed, Schema schema) {
        if (!Objects.equals(schema.getType(rTC.id_volatile), this.id_throws)) {
            throw new IllegalStateException("Block state type is not what was expected.");
        }
        Optional optional = typed.getOptional(this.id_class);
        this.id_break = optional.map(list -> list.stream().map(Pair::getSecond).collect(Collectors.toList())).orElse((List)ImmutableList.of());
        Dynamic dynamic = (Dynamic)typed.get(DSL.remainderFinder());
        this.id_byte = dynamic.get("Y").asInt(0);
        this.id_class(dynamic);
    }

    protected abstract boolean id_class();

    protected void id_class(Dynamic<?> dynamic) {
        if (this.id_class()) {
            this.id_protected = null;
        } else {
            long[] lArray = dynamic.get("BlockStates").asLongStream().toArray();
            int n = Math.max(4, DataFixUtils.ceillog2((int)this.id_break.size()));
            this.id_protected = new ryv_3(n, 4096, lArray);
        }
    }

    public Typed<?> id_class(Typed<?> typed) {
        return this.id_break() ? typed : typed.update(DSL.remainderFinder(), dynamic -> dynamic.set("BlockStates", dynamic.createLongList(Arrays.stream(this.id_protected.id_class())))).set(this.id_class, this.id_break.stream().map(object -> Pair.of((Object)rTC.id_volatile.typeName(), (Object)object)).collect(Collectors.toList()));
    }

    protected int id_class(String string, boolean bl, int n) {
        return rwb_3.id_break.get((Object)string) << 5 | (bl ? 16 : 0) | n;
    }

    public boolean id_break() {
        return this.id_protected == null;
    }
}

