/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrWI;
import celestial.rrWt_1;
import java.util.List;

public class rrWw_1
implements rrWI<Object> {
    private List<Object> id_class;
    private int id_break;
    private boolean id_byte;

    @Override
    public boolean hasNext() {
        if (!this.id_byte) {
            rrWt_1.id_class(this);
            return false;
        }
        return this.id_byte;
    }

    @Override
    public Object next() {
        if (!this.id_byte) {
            return null;
        }
        Object object = this.id_class.get(this.id_break);
        ++this.id_break;
        this.id_byte = this.id_break < this.id_class.size();
        return object;
    }

    @Override
    public void id_class(List<Object> list) {
        if (this.id_byte) {
            throw new RuntimeException("Iterator still used, oldList: " + this.id_class + ", newList: " + list);
        }
        this.id_class = list;
        this.id_break = 0;
        this.id_byte = list != null && this.id_break < list.size();
    }
}

