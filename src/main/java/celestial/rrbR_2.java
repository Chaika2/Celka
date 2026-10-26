/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 */
package celestial;

import celestial.rrbV_2;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class rrbR_2 {
    private Int2ObjectMap<rrbV_2> id_class = new Int2ObjectOpenHashMap();
    private List<rrbV_2> id_break = new ArrayList<rrbV_2>();
    private boolean id_byte = false;

    public List<rrbV_2> id_byte() {
        if (this.id_byte) {
            this.id_break.clear();
            this.id_break.addAll((Collection<rrbV_2>)this.id_class.values());
            this.id_byte = false;
        }
        return this.id_break;
    }

    public rrbV_2 id_class(int n, rrbV_2 rrbV_22) {
        rrbV_2 rrbV_23 = (rrbV_2)this.id_class.put(n, (Object)rrbV_22);
        this.id_protected();
        return rrbV_23;
    }

    public int id_class() {
        return this.id_class.size();
    }

    public rrbV_2 id_class(int n) {
        return (rrbV_2)this.id_class.get(n);
    }

    public rrbV_2 id_break(int n) {
        rrbV_2 rrbV_22 = (rrbV_2)this.id_class.remove(n);
        if (rrbV_22 != null) {
            this.id_protected();
        }
        return rrbV_22;
    }

    public void id_break() {
        this.id_class.clear();
        this.id_break.clear();
        this.id_protected();
    }

    private void id_protected() {
        this.id_byte = true;
    }
}

