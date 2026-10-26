/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.rcY_2;
import celestial.rcZ_2;
import celestial.rcg_3;
import celestial.rcv_3;
import celestial.rcy_3;
import com.google.common.collect.Lists;
import java.io.DataInput;
import java.io.IOException;
import java.util.ArrayList;

public class rcp_3
implements rcv_3<rcy_3> {
    @Override
    public String id_class() {
        return "LIST";
    }

    public rcy_3 id_class(DataInput dataInput, int n, rcg_3 rcg_32) throws IOException {
        rcg_32.id_class(296L);
        if (n > 512) {
            throw new RuntimeException("Tried to read NBT tag with too high complexity, depth > 512");
        }
        byte by = dataInput.readByte();
        int n2 = dataInput.readInt();
        if (by == 0 && n2 > 0) {
            throw new RuntimeException("Missing type on ListTag");
        }
        rcg_32.id_class(32L * (long)n2);
        rcv_3<?> rcv_32 = rcY_2.id_class(by);
        ArrayList arrayList = Lists.newArrayListWithCapacity((int)n2);
        for (int i = 0; i < n2; ++i) {
            arrayList.add(rcv_32.id_break(dataInput, n + 1, rcg_32));
        }
        return new rcy_3(arrayList, by);
    }

    @Override
    public String id_break() {
        return "TAG_List";
    }

    @Override
    public /* synthetic */ rcZ_2 id_break(DataInput dataInput, int n, rcg_3 rcg_32) throws IOException {
        return this.id_class(dataInput, n, rcg_32);
    }
}

