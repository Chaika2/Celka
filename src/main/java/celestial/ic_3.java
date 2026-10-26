/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap
 *  it.unimi.dsi.fastutil.objects.ObjectArraySet
 */
package celestial;

import celestial.iJ_2;
import celestial.id_3;
import celestial.ix_3;
import celestial.rVL;
import celestial.rcd_3;
import celestial.rcy_3;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.function.Consumer;

public class ic_3 {
    private final iJ_2 id_class;
    private final Map<id_3, Set<ix_3>> id_break = Maps.newEnumMap(id_3.class);
    private final Map<UUID, ix_3> id_byte = new Object2ObjectArrayMap();
    private final Set<ix_3> id_protected = new ObjectArraySet();
    private double id_throws;
    private boolean id_case = true;
    private double id_catch;
    private final Consumer<ic_3> id_private;

    public void id_byte(ix_3 ix_32) {
        this.id_throws(ix_32);
        this.id_protected.add(ix_32);
    }

    public Set<ix_3> id_byte() {
        return ImmutableSet.copyOf(this.id_byte.values());
    }

    public boolean id_byte(UUID uUID) {
        ix_3 ix_32 = this.id_class(uUID);
        if (ix_32 != null && this.id_protected.contains(ix_32)) {
            this.id_protected(ix_32);
            return true;
        }
        return false;
    }

    public ic_3(iJ_2 iJ_22, Consumer<ic_3> consumer) {
        this.id_class = iJ_22;
        this.id_private = consumer;
        this.id_throws = iJ_22.id_class();
    }

    public void id_class(double d) {
        if (d != this.id_throws) {
            this.id_throws = d;
            this.id_protected();
        }
    }

    public iJ_2 id_class() {
        return this.id_class;
    }

    public void id_class(ic_3 ic_32) {
        this.id_throws = ic_32.id_throws;
        this.id_byte.clear();
        this.id_byte.putAll(ic_32.id_byte);
        this.id_protected.clear();
        this.id_protected.addAll(ic_32.id_protected);
        this.id_break.clear();
        ic_32.id_break.forEach((id_32, set) -> this.id_class((id_3)((Object)id_32)).addAll((Collection<ix_3>)set));
        this.id_protected();
    }

    public void id_class(rcd_3 rcd_32) {
        this.id_throws = rcd_32.id_extends("Base");
        if (rcd_32.id_byte("Modifiers", 9)) {
            rcy_3 rcy_32 = rcd_32.id_protected("Modifiers", 10);
            for (int i = 0; i < rcy_32.size(); ++i) {
                ix_3 ix_32 = ix_3.id_class(rcy_32.id_class(i));
                if (ix_32 == null) continue;
                this.id_byte.put(ix_32.id_class(), ix_32);
                this.id_class(ix_32.id_byte()).add(ix_32);
                this.id_protected.add(ix_32);
            }
        }
        this.id_protected();
    }

    public boolean id_class(ix_3 ix_32) {
        return this.id_byte.get(ix_32.id_class()) != null;
    }

    public Set<ix_3> id_class(id_3 id_33) {
        return this.id_break.computeIfAbsent(id_33, id_32 -> Sets.newHashSet());
    }

    public ix_3 id_class(UUID uUID) {
        return this.id_byte.get(uUID);
    }

    private Collection<ix_3> id_break(id_3 id_32) {
        return this.id_break.getOrDefault((Object)id_32, Collections.emptySet());
    }

    public void id_break(ix_3 ix_32) {
        this.id_throws(ix_32);
    }

    public void id_break(UUID uUID) {
        ix_3 ix_32 = this.id_class(uUID);
        if (ix_32 != null) {
            this.id_protected(ix_32);
        }
    }

    public double id_break() {
        return this.id_throws;
    }

    private void id_throws(ix_3 ix_32) {
        ix_3 ix_33 = this.id_byte.putIfAbsent(ix_32.id_class(), ix_32);
        if (ix_33 != null) {
            throw new IllegalArgumentException("Modifier is already applied on this attribute!");
        }
        this.id_class(ix_32.id_byte()).add(ix_32);
        this.id_protected();
    }

    public void id_throws() {
        for (ix_3 ix_32 : this.id_byte()) {
            this.id_protected(ix_32);
        }
    }

    public rcd_3 id_catch() {
        rcd_3 rcd_32 = new rcd_3();
        rcd_32.id_class("Name", rVL.O.id_break(this.id_class).toString());
        rcd_32.id_class("Base", this.id_throws);
        if (!this.id_protected.isEmpty()) {
            rcy_3 rcy_32 = new rcy_3();
            for (ix_3 ix_32 : this.id_protected) {
                rcy_32.add(ix_32.id_throws());
            }
            rcd_32.id_class("Modifiers", rcy_32);
        }
        return rcd_32;
    }

    public double id_case() {
        if (this.id_case) {
            this.id_catch = this.id_private();
            this.id_case = false;
        }
        return this.id_catch;
    }

    public void id_protected(ix_3 ix_32) {
        this.id_class(ix_32.id_byte()).remove(ix_32);
        this.id_byte.remove(ix_32.id_class());
        this.id_protected.remove(ix_32);
        this.id_protected();
    }

    protected void id_protected() {
        this.id_case = true;
        this.id_private.accept(this);
    }

    private double id_private() {
        double d = this.id_break();
        for (ix_3 ix_32 : this.id_break(id_3.ADDITION)) {
            d += ix_32.id_protected();
        }
        double d2 = d;
        for (ix_3 ix_33 : this.id_break(id_3.MULTIPLY_BASE)) {
            d2 += d * ix_33.id_protected();
        }
        for (ix_3 ix_33 : this.id_break(id_3.MULTIPLY_TOTAL)) {
            d2 *= 1.0 + ix_33.id_protected();
        }
        return this.id_class.id_class(d2);
    }
}

