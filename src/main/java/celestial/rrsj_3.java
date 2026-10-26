/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 */
package celestial;

import celestial.roH_2;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public abstract class rrsj_3<M extends rrsj_3<M>> {
    private final long[] id_break = new long[2];
    private final roH_2[] id_byte = new roH_2[2];
    private boolean id_protected;
    protected final Long2ObjectOpenHashMap<roH_2> id_class;

    public roH_2 id_byte(long l) {
        roH_2 roH_22;
        if (this.id_protected) {
            for (int i = 0; i < 2; ++i) {
                if (l != this.id_break[i]) continue;
                return this.id_byte[i];
            }
        }
        if ((roH_22 = (roH_2)this.id_class.get(l)) == null) {
            return null;
        }
        if (this.id_protected) {
            for (int i = 1; i > 0; --i) {
                this.id_break[i] = this.id_break[i - 1];
                this.id_byte[i] = this.id_byte[i - 1];
            }
            this.id_break[0] = l;
            this.id_byte[0] = roH_22;
        }
        return roH_22;
    }

    public void id_byte() {
        for (int i = 0; i < 2; ++i) {
            this.id_break[i] = Long.MAX_VALUE;
            this.id_byte[i] = null;
        }
    }

    protected rrsj_3(Long2ObjectOpenHashMap<roH_2> long2ObjectOpenHashMap) {
        this.id_class = long2ObjectOpenHashMap;
        this.id_byte();
        this.id_protected = true;
    }

    public void id_class(long l, roH_2 roH_22) {
        this.id_class.put(l, (Object)roH_22);
    }

    public void id_class(long l) {
        this.id_class.put(l, (Object)((roH_2)this.id_class.get(l)).id_break());
        this.id_byte();
    }

    public boolean id_break(long l) {
        return this.id_class.containsKey(l);
    }

    public abstract M id_break();

    public roH_2 id_protected(long l) {
        return (roH_2)this.id_class.remove(l);
    }

    public void id_protected() {
        this.id_protected = false;
    }
}

