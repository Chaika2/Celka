/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ByteMap
 *  it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap
 */
package celestial;

import celestial.rga_3;
import celestial.rqz_3;
import it.unimi.dsi.fastutil.longs.Long2ByteMap;
import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;

public final class rgi_3
extends rqz_3 {
    private final Long2ByteMap id_break;
    public final /* synthetic */ rga_3 id_class;

    @Override
    protected int id_byte(long l) {
        return this.id_break.get(l);
    }

    protected rgi_3(rga_3 rga_32) {
        this.id_class = rga_32;
        super(7, 16, 256);
        this.id_break = new Long2ByteOpenHashMap();
        this.id_break.defaultReturnValue((byte)7);
    }

    @Override
    protected void id_class(long l, int n) {
        if (n > 6) {
            this.id_break.remove(l);
        } else {
            this.id_break.put(l, (byte)n);
        }
    }

    public void id_class() {
        super.id_class(Integer.MAX_VALUE);
    }

    @Override
    protected int id_break(long l) {
        return this.id_class.id_case(l) ? 0 : 7;
    }
}

