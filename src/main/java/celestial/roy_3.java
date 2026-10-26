/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2BooleanMap
 *  it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap
 */
package celestial;

import celestial.rhN_2;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import java.util.stream.Stream;

public final class roy_3 {
    private final Object2BooleanMap<rhN_2> id_class = new Object2BooleanOpenHashMap();

    public boolean id_byte(rhN_2 rhN_22) {
        return this.id_class.getOrDefault((Object)rhN_22, true);
    }

    public void id_class(long l, long l2, rhN_2 rhN_22) {
    }

    public void id_class(rhN_2 rhN_22) {
        this.id_class.replace((Object)rhN_22, true);
    }

    public Stream<rhN_2> id_class(long l) {
        return this.id_class.keySet().stream();
    }

    public void id_class(long l, rhN_2 rhN_22, boolean bl) {
        this.id_class.put((Object)rhN_22, bl);
    }

    public void id_class(long l, rhN_2 rhN_22) {
        this.id_class.removeBoolean((Object)rhN_22);
    }

    public void id_break(rhN_2 rhN_22) {
        this.id_class.replace((Object)rhN_22, false);
    }

    public boolean id_protected(rhN_2 rhN_22) {
        return this.id_class.getBoolean((Object)rhN_22);
    }
}

