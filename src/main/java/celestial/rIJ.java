/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 *  it.unimi.dsi.fastutil.ints.IntOpenHashSet
 *  it.unimi.dsi.fastutil.ints.IntSet
 */
package celestial;

import celestial.rwO_2;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.Objects;

public final class rIJ
extends rwO_2 {
    private IntSet id_throws;

    public rIJ(Typed<?> typed, Schema schema) {
        super(typed, schema);
    }

    @Override
    protected boolean id_class() {
        this.id_throws = new IntOpenHashSet();
        for (int i = 0; i < this.id_break.size(); ++i) {
            Dynamic dynamic = (Dynamic)this.id_break.get(i);
            String string = dynamic.get("Name").asString("");
            if (!Objects.equals(string, "minecraft:trapped_chest")) continue;
            this.id_throws.add(i);
        }
        return this.id_throws.isEmpty();
    }

    public boolean id_class(int n) {
        return this.id_throws.contains(n);
    }
}

