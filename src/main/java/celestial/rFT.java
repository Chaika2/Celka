/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.At_1;
import celestial.rdn_3;
import celestial.rqs_3;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;
import java.util.List;

public class rFT
implements ruS_2<At_1> {
    private int id_class;
    private List<rdn_3> id_break;

    public List<rdn_3> id_byte() {
        return this.id_break;
    }

    public rFT() {
    }

    public rFT(int n, rqs_3<rdn_3> rqs_32) {
        this.id_class = n;
        this.id_break = rqs_3.id_class(rqs_32.size(), rdn_3.id_break);
        for (int i = 0; i < this.id_break.size(); ++i) {
            this.id_break.set(i, rqs_32.get(i).id_implements());
        }
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.readUnsignedByte();
        int n = ruu_32.readShort();
        this.id_break = rqs_3.id_class(n, rdn_3.id_break);
        for (int i = 0; i < n; ++i) {
            this.id_break.set(i, ruu_32.id_extends());
        }
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.writeByte(this.id_class);
        ruu_32.writeShort(this.id_break.size());
        for (rdn_3 rdn_32 : this.id_break) {
            ruu_32.id_class(rdn_32);
        }
    }

    public int id_break() {
        return this.id_class;
    }
}

