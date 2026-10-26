/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rcZ_2;
import celestial.rcc_3;
import celestial.rcv_3;
import celestial.rgN_2;
import celestial.rgP_2;
import java.io.DataOutput;
import java.io.IOException;

public class rcN_2
implements rcZ_2 {
    public static final rcv_3<rcN_2> id_class = new rcc_3();
    public static final rcN_2 id_break = new rcN_2();

    @Override
    public /* synthetic */ rcZ_2 id_byte() {
        return this.id_protected();
    }

    private rcN_2() {
    }

    @Override
    public String toString() {
        return "END";
    }

    @Override
    public void id_class(DataOutput dataOutput) throws IOException {
    }

    @Override
    public rgP_2 id_class(String string, int n) {
        return rgN_2.id_byte;
    }

    @Override
    public byte id_class() {
        return 0;
    }

    public rcv_3<rcN_2> id_break() {
        return id_class;
    }

    public rcN_2 id_protected() {
        return this;
    }
}

