/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rcZ_2;
import celestial.rcg_3;
import celestial.rcv_3;
import celestial.rcz_3;
import java.io.DataInput;
import java.io.IOException;

public class rcQ_2
implements rcv_3<rcz_3> {
    @Override
    public boolean id_byte() {
        return true;
    }

    public rcz_3 id_class(DataInput dataInput, int n, rcg_3 rcg_32) throws IOException {
        rcg_32.id_class(128L);
        return rcz_3.id_class(dataInput.readDouble());
    }

    @Override
    public String id_class() {
        return "DOUBLE";
    }

    @Override
    public /* synthetic */ rcZ_2 id_break(DataInput dataInput, int n, rcg_3 rcg_32) throws IOException {
        return this.id_class(dataInput, n, rcg_32);
    }

    @Override
    public String id_break() {
        return "TAG_Double";
    }
}

