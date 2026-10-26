/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.shorts.ShortIterator
 *  it.unimi.dsi.fastutil.shorts.ShortSet
 */
package celestial;

import celestial.At_1;
import celestial.rfH_2;
import celestial.rfw_3;
import celestial.rjh_3;
import celestial.roQ_2;
import celestial.ruS_2;
import celestial.ruu_3;
import celestial.xc_3;
import celestial.xd_3;
import it.unimi.dsi.fastutil.shorts.ShortIterator;
import it.unimi.dsi.fastutil.shorts.ShortSet;
import java.io.IOException;
import java.util.function.BiConsumer;

public class rvC_2
implements ruS_2<At_1> {
    private rjh_3 id_class;
    private short[] id_break;
    private xc_3[] id_byte;
    private boolean id_protected;

    public rvC_2() {
    }

    public rvC_2(rjh_3 rjh_32, ShortSet shortSet, roQ_2 roQ_22, boolean bl) {
        this.id_class = rjh_32;
        this.id_protected = bl;
        this.id_class(shortSet.size());
        int n = 0;
        ShortIterator shortIterator = shortSet.iterator();
        while (shortIterator.hasNext()) {
            short s;
            this.id_break[n] = s = ((Short)shortIterator.next()).shortValue();
            this.id_byte[n] = roQ_22.id_class(rjh_3.id_class(s), rjh_3.id_break(s), rjh_3.id_byte(s));
            ++n;
        }
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    @Override
    public void id_class(BiConsumer<rfH_2, xc_3> biConsumer) {
        rfw_3 rfw_32 = new rfw_3();
        for (int i = 0; i < this.id_break.length; ++i) {
            short s = this.id_break[i];
            rfw_32.id_class(this.id_class.id_protected(s), this.id_class.id_throws(s), this.id_class.id_case(s));
            biConsumer.accept(rfw_32, this.id_byte[i]);
        }
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = rjh_3.id_class(ruu_32.readLong());
        this.id_protected = ruu_32.readBoolean();
        int n = ruu_32.id_case();
        this.id_class(n);
        for (int i = 0; i < this.id_break.length; ++i) {
            long l = ruu_32.id_catch();
            this.id_break[i] = (short)(l & 0xFFFL);
            this.id_byte[i] = xd_3.id_char.id_class((int)(l >>> 12));
        }
    }

    @Override
    private void id_class(int n) {
        this.id_break = new short[n];
        this.id_byte = new xc_3[n];
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.writeLong(this.id_class.id_continue());
        ruu_32.writeBoolean(this.id_protected);
        ruu_32.id_protected(this.id_break.length);
        for (int i = 0; i < this.id_break.length; ++i) {
            ruu_32.id_class(xd_3.id_finally(this.id_byte[i]) << 12 | this.id_break[i]);
        }
    }

    public boolean id_break() {
        return this.id_protected;
    }
}

