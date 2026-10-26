/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rdX_2;
import celestial.rdb_3;
import celestial.rde_3;
import celestial.rxK_2;

public class rdO_2 {
    public int id_class = 64;
    public int id_break;
    public rdb_3 id_byte;
    public rdX_2 id_protected;
    public rde_3 id_throws = rde_3.COMMON;
    public rxK_2 id_case;
    public boolean id_catch;
    public boolean id_private;

    public rdO_2 id_byte(int n) {
        this.id_break = n;
        this.id_class = 1;
        return this;
    }

    public rdO_2 id_class(rdb_3 rdb_32) {
        this.id_byte = rdb_32;
        return this;
    }

    public rdO_2 id_class(rdX_2 rdX_22) {
        this.id_protected = rdX_22;
        return this;
    }

    public rdO_2 id_class(rde_3 rde_32) {
        this.id_throws = rde_32;
        return this;
    }

    public rdO_2 id_class() {
        this.id_catch = true;
        return this;
    }

    public rdO_2 id_class(boolean bl) {
        this.id_private = bl;
        return this;
    }

    public rdO_2 id_class(int n) {
        if (this.id_break > 0) {
            throw new RuntimeException("Unable to have damage AND stack.");
        }
        this.id_class = n;
        return this;
    }

    public rdO_2 id_class(rxK_2 rxK_22) {
        this.id_case = rxK_22;
        return this;
    }

    public rdO_2 id_break(int n) {
        return this.id_break == 0 ? this.id_byte(n) : this;
    }
}

