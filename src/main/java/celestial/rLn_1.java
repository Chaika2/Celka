/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 */
package celestial;

import celestial.is_3;
import celestial.rLp_1;
import celestial.rLq_1;
import celestial.rLv_1;
import celestial.rRU;
import celestial.rRq_1;
import celestial.rfH_2;
import celestial.rfU_2;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public abstract class rLn_1 {
    protected rRU id_class;
    protected is_3 id_break;
    protected final Int2ObjectMap<rLq_1> id_byte = new Int2ObjectOpenHashMap();
    protected int id_protected;
    protected int id_throws;
    protected int id_case;
    protected boolean id_catch;
    protected boolean id_private;
    protected boolean id_implements;

    public void id_byte(boolean bl) {
        this.id_implements = bl;
    }

    public boolean id_byte() {
        return this.id_catch;
    }

    public abstract int id_class(rLq_1[] var1, rLq_1 var2);

    public abstract rLp_1 id_class(rRq_1 var1, int var2, int var3, int var4, is_3 var5, int var6, int var7, int var8, boolean var9, boolean var10);

    public abstract rLp_1 id_class(rRq_1 var1, int var2, int var3, int var4);

    public void id_class(boolean bl) {
        this.id_catch = bl;
    }

    public void id_class(rRU rRU2, is_3 is_32) {
        this.id_class = rRU2;
        this.id_break = is_32;
        this.id_byte.clear();
        this.id_protected = rfU_2.id_protected(is_32.PN() + 1.0f);
        this.id_throws = rfU_2.id_protected(is_32.Bm() + 1.0f);
        this.id_case = rfU_2.id_protected(is_32.PN() + 1.0f);
    }

    public void id_class() {
        this.id_class = null;
        this.id_break = null;
    }

    protected rLq_1 id_class(rfH_2 rfH_22) {
        return this.id_class(rfH_22.b_(), rfH_22.c_(), rfH_22.d_());
    }

    public abstract rLv_1 id_class(double var1, double var3, double var5);

    protected rLq_1 id_class(int n, int n2, int n3) {
        return (rLq_1)this.id_byte.computeIfAbsent(rLq_1.id_break(n, n2, n3), n4 -> new rLq_1(n, n2, n3));
    }

    public void id_break(boolean bl) {
        this.id_private = bl;
    }

    public abstract rLq_1 id_break();

    public boolean id_throws() {
        return this.id_implements;
    }

    public boolean id_protected() {
        return this.id_private;
    }
}

