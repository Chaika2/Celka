/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.rcY_2;
import celestial.rcZ_2;
import celestial.rcd_3;
import celestial.rcg_3;
import celestial.rcv_3;
import com.google.common.collect.Maps;
import java.io.DataInput;
import java.io.IOException;
import java.util.HashMap;

public class rck_3
implements rcv_3<rcd_3> {
    @Override
    public String id_class() {
        return "COMPOUND";
    }

    public rcd_3 id_class(DataInput dataInput, int n, rcg_3 rcg_32) throws IOException {
        byte by;
        rcg_32.id_class(384L);
        if (n > 512) {
            throw new RuntimeException("Tried to read NBT tag with too high complexity, depth > 512");
        }
        HashMap hashMap = Maps.newHashMap();
        while ((by = rcd_3.id_class(dataInput, rcg_32)) != 0) {
            String string = rcd_3.id_break(dataInput, rcg_32);
            rcg_32.id_class(224 + 16 * string.length());
            rcZ_2 rcZ_22 = rcd_3.id_class(rcY_2.id_class(by), string, dataInput, n + 1, rcg_32);
            if (hashMap.put(string, rcZ_22) == null) continue;
            rcg_32.id_class(288L);
        }
        return new rcd_3(hashMap);
    }

    @Override
    public String id_break() {
        return "TAG_Compound";
    }

    @Override
    public /* synthetic */ rcZ_2 id_break(DataInput dataInput, int n, rcg_3 rcg_32) throws IOException {
        return this.id_class(dataInput, n, rcg_32);
    }
}

