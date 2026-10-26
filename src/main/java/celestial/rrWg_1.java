/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrWV;
import java.util.Iterator;

public class rrWg_1
implements Iterator<String> {
    private int id_break;
    public final /* synthetic */ rrWV id_class;

    public rrWg_1(rrWV rrWV2) {
        this.id_class = rrWV2;
    }

    @Override
    public boolean hasNext() {
        return this.id_break < this.id_class.id_class.size();
    }

    @Override
    public /* synthetic */ Object next() {
        return this.id_class();
    }

    public String id_class() {
        String string = this.id_class.id_class.get(this.id_break);
        ++this.id_break;
        return string;
    }
}

