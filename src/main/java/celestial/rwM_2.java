/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 *  it.unimi.dsi.fastutil.ints.Int2IntMap
 *  it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap
 *  it.unimi.dsi.fastutil.ints.IntOpenHashSet
 *  it.unimi.dsi.fastutil.ints.IntSet
 */
package celestial;

import celestial.rwO_2;
import celestial.rwb_3;
import celestial.ryv_3;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.Objects;

public final class rwM_2
extends rwO_2 {
    private IntSet id_throws;
    private IntSet id_case;
    private Int2IntMap id_catch;

    public rwM_2(Typed<?> typed, Schema schema) {
        super(typed, schema);
    }

    public void id_class(int n, int n2, int n3) {
        int n4;
        boolean bl;
        Dynamic dynamic = (Dynamic)this.id_break.get(n2);
        String string = dynamic.get("Name").asString("");
        int n5 = this.id_class(string, bl = Objects.equals(dynamic.get("Properties").get("persistent").asString(""), "true"), n3);
        if (!this.id_catch.containsKey(n5)) {
            n4 = this.id_break.size();
            this.id_throws.add(n4);
            this.id_catch.put(n5, n4);
            this.id_break.add(this.id_class(dynamic, string, bl, n3));
        }
        n4 = this.id_catch.get(n5);
        if (1 << this.id_protected.id_break() <= n4) {
            ryv_3 ryv_32 = new ryv_3(this.id_protected.id_break() + 1, 4096);
            for (int i = 0; i < 4096; ++i) {
                ryv_32.id_class(i, this.id_protected.id_class(i));
            }
            this.id_protected = ryv_32;
        }
        this.id_protected.id_class(n, n4);
    }

    public boolean id_class(int n) {
        return this.id_case.contains(n);
    }

    @Override
    protected boolean id_class() {
        this.id_throws = new IntOpenHashSet();
        this.id_case = new IntOpenHashSet();
        this.id_catch = new Int2IntOpenHashMap();
        for (int i = 0; i < this.id_break.size(); ++i) {
            Dynamic dynamic = (Dynamic)this.id_break.get(i);
            String string = dynamic.get("Name").asString("");
            if (rwb_3.id_break.containsKey((Object)string)) {
                boolean bl = Objects.equals(dynamic.get("Properties").get("decayable").asString(""), "false");
                this.id_throws.add(i);
                this.id_catch.put(this.id_class(string, bl, 7), i);
                this.id_break.set(i, this.id_class(dynamic, string, bl, 7));
            }
            if (!rwb_3.id_byte.contains(string)) continue;
            this.id_case.add(i);
        }
        return this.id_throws.isEmpty() && this.id_case.isEmpty();
    }

    private Dynamic<?> id_class(Dynamic<?> dynamic, String string, boolean bl, int n) {
        Dynamic dynamic2 = dynamic.emptyMap();
        dynamic2 = dynamic2.set("persistent", dynamic2.createString(bl ? "true" : "false"));
        dynamic2 = dynamic2.set("distance", dynamic2.createString(Integer.toString(n)));
        Dynamic dynamic3 = dynamic.emptyMap();
        dynamic3 = dynamic3.set("Properties", dynamic2);
        return dynamic3.set("Name", dynamic3.createString(string));
    }

    public boolean id_break(int n) {
        return this.id_throws.contains(n);
    }

    public int id_protected(int n) {
        return this.id_class(n) ? 0 : Integer.parseInt(((Dynamic)this.id_break.get(n)).get("Properties").get("distance").asString(""));
    }
}

