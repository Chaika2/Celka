/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongSet
 */
package celestial;

import celestial.rcd_3;
import celestial.rrGc_1;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;

public class rrrL
extends rrGc_1 {
    private LongSet id_class = new LongOpenHashSet();
    private LongSet id_break = new LongOpenHashSet();

    @Override
    public rcd_3 id_byte(rcd_3 rcd_32) {
        rcd_32.id_class("All", this.id_class.toLongArray());
        rcd_32.id_class("Remaining", this.id_break.toLongArray());
        return rcd_32;
    }

    public boolean id_byte(long l) {
        return this.id_break.contains(l);
    }

    public rrrL(String string) {
        super(string);
    }

    public LongSet id_class() {
        return this.id_class;
    }

    public void id_class(long l) {
        this.id_class.add(l);
        this.id_break.add(l);
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        this.id_class = new LongOpenHashSet(rcd_32.id_package("All"));
        this.id_break = new LongOpenHashSet(rcd_32.id_package("Remaining"));
    }

    public boolean id_break(long l) {
        return this.id_class.contains(l);
    }

    public void id_protected(long l) {
        this.id_break.remove(l);
    }
}

