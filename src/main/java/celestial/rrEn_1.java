/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ByteMap
 *  it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ObjectSet
 */
package celestial;

import celestial.rod_3;
import celestial.rrEL;
import it.unimi.dsi.fastutil.longs.Long2ByteMap;
import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectSet;

public class rrEn_1
extends rod_3 {
    protected final Long2ByteMap id_class;
    protected final int id_break;
    public final /* synthetic */ rrEL id_byte;

    @Override
    protected int id_byte(long l) {
        return this.id_class.get(l);
    }

    protected rrEn_1(rrEL rrEL2, int n) {
        this.id_byte = rrEL2;
        super(n + 2, 2048, 2048);
        this.id_class = new Long2ByteOpenHashMap();
        this.id_break = n;
        this.id_class.defaultReturnValue((byte)(n + 2));
    }

    protected void id_class(long l, int n, int n2) {
    }

    public void id_class() {
        this.id_class(Integer.MAX_VALUE);
    }

    @Override
    protected void id_class(long l, int n) {
        byte by = n > this.id_break ? this.id_class.remove(l) : this.id_class.put(l, (byte)n);
        this.id_class(l, (int)by, n);
    }

    @Override
    protected int id_break(long l) {
        return this.id_protected(l) ? 0 : Integer.MAX_VALUE;
    }

    private boolean id_protected(long l) {
        ObjectSet objectSet = (ObjectSet)this.id_byte.id_byte.get(l);
        return objectSet != null && !objectSet.isEmpty();
    }
}

