/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rcN_2;
import celestial.rcZ_2;
import celestial.rcg_3;
import celestial.rcv_3;
import java.io.DataInput;
import java.io.IOException;

public class rcc_3
implements rcv_3<rcN_2> {
    @Override
    public boolean id_byte() {
        return true;
    }

    public rcN_2 id_class(DataInput dataInput, int n, rcg_3 rcg_32) {
        rcg_32.id_class(64L);
        return rcN_2.id_break;
    }

    @Override
    public String id_class() {
        return "END";
    }

    @Override
    public /* synthetic */ rcZ_2 id_break(DataInput dataInput, int n, rcg_3 rcg_32) throws IOException {
        return this.id_class(dataInput, n, rcg_32);
    }

    @Override
    public String id_break() {
        return "TAG_End";
    }
}

