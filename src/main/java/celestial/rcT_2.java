/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rcZ_2;
import celestial.rcg_3;
import celestial.rcq_3;
import celestial.rcv_3;
import java.io.DataInput;
import java.io.IOException;

public class rcT_2
implements rcv_3<rcq_3> {
    @Override
    public String id_class() {
        return "LONG[]";
    }

    public rcq_3 id_class(DataInput dataInput, int n, rcg_3 rcg_32) throws IOException {
        rcg_32.id_class(192L);
        int n2 = dataInput.readInt();
        rcg_32.id_class(64L * (long)n2);
        long[] lArray = new long[n2];
        for (int i = 0; i < n2; ++i) {
            lArray[i] = dataInput.readLong();
        }
        return new rcq_3(lArray);
    }

    @Override
    public String id_break() {
        return "TAG_Long_Array";
    }

    @Override
    public /* synthetic */ rcZ_2 id_break(DataInput dataInput, int n, rcg_3 rcg_32) throws IOException {
        return this.id_class(dataInput, n, rcg_32);
    }
}

