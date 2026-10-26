/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 */
package celestial;

import celestial.rfj_3;
import celestial.roN_2;
import celestial.roq_3;
import celestial.rot_3;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class row_3
implements roq_3 {
    private final rot_3 id_class;
    private final Long2ObjectOpenHashMap<roN_2> id_break;
    private rfj_3 id_byte = new rfj_3(0, 0);
    private final int id_protected;
    private final int id_throws;
    private final int id_case;
    private boolean id_catch;

    public int id_byte() {
        return this.id_protected;
    }

    public row_3(int n) {
        this.id_class = new rot_3(n);
        this.id_protected = n * 2 + 1;
        this.id_throws = n + roN_2.id_break();
        this.id_case = this.id_throws * 2 + 1;
        this.id_break = new Long2ObjectOpenHashMap();
    }

    public roN_2 id_class(int n, int n2) {
        return (roN_2)this.id_break.get(rfj_3.id_class(n + this.id_byte.id_break - this.id_throws, n2 + this.id_byte.id_byte - this.id_throws));
    }

    @Override
    public void id_class() {
        this.id_catch = false;
        this.id_class.id_class();
    }

    @Override
    public void id_class(rfj_3 rfj_32) {
        if (this.id_catch) {
            this.id_class.id_class(rfj_32);
            this.id_byte = rfj_32;
        }
    }

    @Override
    public void id_class(rfj_3 rfj_32, roN_2 roN_22) {
        if (this.id_catch) {
            this.id_class.id_class(rfj_32, roN_22);
            if (roN_22 == null) {
                this.id_break.remove(rfj_32.id_class());
            } else {
                this.id_break.put(rfj_32.id_class(), (Object)roN_22);
            }
        }
    }

    public void id_break() {
        this.id_catch = true;
        this.id_break.clear();
    }

    public int id_throws() {
        return this.id_class.id_break();
    }

    public int id_protected() {
        return this.id_case;
    }
}

