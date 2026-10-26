/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rcZ_2;
import celestial.rca_3;
import celestial.rcg_3;
import celestial.rcv_3;
import java.io.DataInput;
import java.io.IOException;

public class rci_3
implements rcv_3<rca_3> {
    @Override
    public boolean id_byte() {
        return true;
    }

    public rca_3 id_class(DataInput dataInput, int n, rcg_3 rcg_32) throws IOException {
        rcg_32.id_class(288L);
        String string = dataInput.readUTF();
        rcg_32.id_class(16 * string.length());
        return rca_3.id_class(string);
    }

    @Override
    public String id_class() {
        return "STRING";
    }

    @Override
    public /* synthetic */ rcZ_2 id_break(DataInput dataInput, int n, rcg_3 rcg_32) throws IOException {
        return this.id_class(dataInput, n, rcg_32);
    }

    @Override
    public String id_break() {
        return "TAG_String";
    }
}

