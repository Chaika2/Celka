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

public class rRc_1
extends rrGc_1 {
    private LongSet id_class = new LongOpenHashSet();

    @Override
    public rcd_3 id_byte(rcd_3 rcd_32) {
        rcd_32.id_class("Forced", this.id_class.toLongArray());
        return rcd_32;
    }

    public rRc_1() {
        super("chunks");
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        this.id_class = new LongOpenHashSet(rcd_32.id_package("Forced"));
    }

    public LongSet id_class() {
        return this.id_class;
    }
}

