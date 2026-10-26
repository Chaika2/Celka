/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 */
package celestial;

import celestial.II;
import celestial.IJ;
import celestial.Ip_1;
import celestial.fj_3;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rpL_2;
import celestial.rxJ_2;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Map;

public class HW {
    public final Int2ObjectMap<II> id_class = new Int2ObjectOpenHashMap(256);
    private final Int2ObjectMap<IJ> id_break = new Int2ObjectOpenHashMap(256);
    private final Ip_1 id_byte;

    public HW(Ip_1 ip_1) {
        this.id_byte = ip_1;
    }

    public IJ id_class(rdb_3 rdb_32) {
        return (IJ)this.id_break.get(HW.id_break(rdb_32));
    }

    public void id_class(rdb_3 rdb_32, II iI) {
        this.id_class.put(HW.id_break(rdb_32), (Object)iI);
    }

    public Ip_1 id_class() {
        return this.id_byte;
    }

    public fj_3 id_class(rdn_3 rdn_32) {
        IJ iJ = this.id_break(rdn_32);
        return iJ == this.id_byte.id_break() && rdn_32.id_break() instanceof rxJ_2 ? this.id_byte.id_byte().id_class(((rxJ_2)rdn_32.id_break()).id_catch().id_continue()) : iJ.id_throws();
    }

    public fj_3 id_class(rpL_2 rpL_22) {
        return this.id_class(new rdn_3(rpL_22));
    }

    public void id_break() {
        this.id_break.clear();
        for (Map.Entry entry : this.id_class.entrySet()) {
            this.id_break.put((Integer)entry.getKey(), (Object)this.id_byte.id_class((II)entry.getValue()));
        }
    }

    public IJ id_break(rdn_3 rdn_32) {
        IJ iJ = this.id_class(rdn_32.id_break());
        return iJ == null ? this.id_byte.id_break() : iJ;
    }

    private static int id_break(rdb_3 rdb_32) {
        return rdb_3.id_class(rdb_32);
    }
}

