/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.util.Pair
 */
package celestial;

import celestial.At_1;
import celestial.rXQ;
import celestial.rdn_3;
import celestial.ruS_2;
import celestial.ruu_3;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.io.IOException;
import java.util.List;

public class rvO_2
implements ruS_2<At_1> {
    private int id_class;
    private final List<Pair<rXQ, rdn_3>> id_break;

    public List<Pair<rXQ, rdn_3>> id_byte() {
        return this.id_break;
    }

    public rvO_2() {
        this.id_break = Lists.newArrayList();
    }

    public rvO_2(int n, List<Pair<rXQ, rdn_3>> list) {
        this.id_class = n;
        this.id_break = list;
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        byte by;
        this.id_class = ruu_32.id_case();
        rXQ[] rXQArray = rXQ.values();
        do {
            by = ruu_32.readByte();
            rXQ rXQ2 = rXQArray[by & 0x7F];
            rdn_3 rdn_32 = ruu_32.id_extends();
            this.id_break.add((Pair<rXQ, rdn_3>)Pair.of((Object)((Object)rXQ2), (Object)rdn_32));
        } while ((by & 0xFFFFFF80) != 0);
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_protected(this.id_class);
        int n = this.id_break.size();
        for (int i = 0; i < n; ++i) {
            Pair<rXQ, rdn_3> pair = this.id_break.get(i);
            rXQ rXQ2 = (rXQ)((Object)pair.getFirst());
            boolean bl = i != n - 1;
            int n2 = rXQ2.ordinal();
            ruu_32.writeByte(bl ? n2 | 0xFFFFFF80 : n2);
            ruu_32.id_class((rdn_3)pair.getSecond());
        }
    }

    public int id_break() {
        return this.id_class;
    }
}

