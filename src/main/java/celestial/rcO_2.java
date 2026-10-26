/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rcM_2;
import celestial.rcZ_2;
import celestial.rcg_3;
import celestial.rcv_3;
import java.io.DataInput;
import java.io.IOException;

public class rcO_2
implements rcv_3<rcM_2> {
    @Override
    public String id_class() {
        return "BYTE[]";
    }

    public rcM_2 id_class(DataInput dataInput, int n, rcg_3 rcg_32) throws IOException {
        rcg_32.id_class(192L);
        int n2 = dataInput.readInt();
        rcg_32.id_class(8L * (long)n2);
        byte[] byArray = new byte[n2];
        dataInput.readFully(byArray);
        return new rcM_2(byArray);
    }

    @Override
    public String id_break() {
        return "TAG_Byte_Array";
    }

    @Override
    public /* synthetic */ rcZ_2 id_break(DataInput dataInput, int n, rcg_3 rcg_32) throws IOException {
        return this.id_class(dataInput, n, rcg_32);
    }
}

