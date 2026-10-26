/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rcF_2;
import celestial.rcN_2;
import celestial.rcZ_2;
import celestial.rcg_3;
import java.io.DataInput;
import java.io.IOException;

public interface rcv_3<T extends rcZ_2> {
    default public boolean id_byte() {
        return false;
    }

    public static rcv_3<rcN_2> id_class(int n) {
        return new rcF_2(n);
    }

    public String id_class();

    public String id_break();

    public T id_break(DataInput var1, int var2, rcg_3 var3) throws IOException;
}

