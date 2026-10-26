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

public class rcF_2
implements rcv_3<rcN_2> {
    public final /* synthetic */ int id_class;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public rcF_2(int n) {
        this.id_class = n;
    }

    @Override
    public String id_class() {
        return "INVALID[" + this.id_class + "]";
    }

    public rcN_2 id_class(DataInput dataInput, int n, rcg_3 rcg_32) throws IOException {
        throw new IllegalArgumentException("Invalid tag id: " + this.id_class);
    }

    @Override
    public String id_break() {
        return "UNKNOWN_" + this.id_class;
    }

    @Override
    public /* synthetic */ rcZ_2 id_break(DataInput dataInput, int n, rcg_3 rcg_32) throws IOException {
        return this.id_class(dataInput, n, rcg_32);
    }
}

