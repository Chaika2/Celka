/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rcL_2;
import celestial.rcZ_2;
import celestial.rcg_3;
import celestial.rcv_3;
import java.io.DataInput;
import java.io.IOException;

public class rcA_2
implements rcv_3<rcL_2> {
    @Override
    public String id_class() {
        return "INT[]";
    }

    public rcL_2 id_class(DataInput dataInput, int n, rcg_3 rcg_32) throws IOException {
        rcg_32.id_class(192L);
        int n2 = dataInput.readInt();
        rcg_32.id_class(32L * (long)n2);
        int[] nArray = new int[n2];
        for (int i = 0; i < n2; ++i) {
            nArray[i] = dataInput.readInt();
        }
        return new rcL_2(nArray);
    }

    @Override
    public String id_break() {
        return "TAG_Int_Array";
    }

    @Override
    public /* synthetic */ rcZ_2 id_break(DataInput dataInput, int n, rcg_3 rcg_32) throws IOException {
        return this.id_class(dataInput, n, rcg_32);
    }
}

