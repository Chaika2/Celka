/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.AbstractIterator
 */
package celestial;

import celestial.rfH_2;
import celestial.rfw_3;
import com.google.common.collect.AbstractIterator;

public class rfq_3
extends AbstractIterator<rfH_2> {
    private final rfw_3 id_catch = new rfw_3();
    private int id_private;
    public final /* synthetic */ int id_class;
    public final /* synthetic */ int id_break;
    public final /* synthetic */ int id_byte;
    public final /* synthetic */ int id_protected;
    public final /* synthetic */ int id_throws;
    public final /* synthetic */ int id_case;

    public rfq_3(int n, int n2, int n3, int n4, int n5, int n6) {
        this.id_class = n;
        this.id_break = n2;
        this.id_byte = n3;
        this.id_protected = n4;
        this.id_throws = n5;
        this.id_case = n6;
    }

    protected rfH_2 id_class() {
        if (this.id_private == this.id_class) {
            return (rfH_2)this.endOfData();
        }
        int n = this.id_private % this.id_break;
        int n2 = this.id_private / this.id_break;
        int n3 = n2 % this.id_byte;
        int n4 = n2 / this.id_byte;
        ++this.id_private;
        return this.id_catch.id_class(this.id_protected + n, this.id_throws + n3, this.id_case + n4);
    }

    protected /* synthetic */ Object computeNext() {
        return this.id_class();
    }
}

