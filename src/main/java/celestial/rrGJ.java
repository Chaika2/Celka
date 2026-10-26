/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMap$Entry
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 */
package celestial;

import celestial.rcd_3;
import celestial.rrGc_1;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;

public class rrGJ
extends rrGc_1 {
    private final Object2IntMap<String> id_class = new Object2IntOpenHashMap();

    @Override
    public rcd_3 id_byte(rcd_3 rcd_32) {
        for (Object2IntMap.Entry entry : this.id_class.object2IntEntrySet()) {
            rcd_32.id_break((String)entry.getKey(), entry.getIntValue());
        }
        return rcd_32;
    }

    public rrGJ() {
        super("idcounts");
        this.id_class.defaultReturnValue(-1);
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        this.id_class.clear();
        for (String string : rcd_32.id_protected()) {
            if (!rcd_32.id_byte(string, 99)) continue;
            this.id_class.put((Object)string, rcd_32.id_private(string));
        }
    }

    public int id_class() {
        int n = this.id_class.getInt((Object)"map") + 1;
        this.id_class.put((Object)"map", n);
        this.id_byte();
        return n;
    }
}

