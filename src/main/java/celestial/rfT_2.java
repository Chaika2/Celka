/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.AbstractIterator
 */
package celestial;

import celestial.rfH_2;
import celestial.rfw_3;
import celestial.rpr_3;
import com.google.common.collect.AbstractIterator;

public class rfT_2
extends AbstractIterator<rfw_3> {
    private final rpr_3[] id_throws;
    private final rfw_3 id_case;
    private final int id_catch;
    private int id_private;
    private int id_implements;
    private int id_finally;
    private int id_extends;
    private int id_native;
    private int id_volatile;
    public final /* synthetic */ rpr_3 id_class;
    public final /* synthetic */ rpr_3 id_break;
    public final /* synthetic */ rfH_2 id_byte;
    public final /* synthetic */ int id_protected;

    public rfT_2(rpr_3 rpr_32, rpr_3 rpr_33, rfH_2 rfH_22, int n) {
        this.id_class = rpr_32;
        this.id_break = rpr_33;
        this.id_byte = rfH_22;
        this.id_protected = n;
        this.id_throws = new rpr_3[]{this.id_class, this.id_break, this.id_class.id_case(), this.id_break.id_case()};
        this.id_case = this.id_byte.id_new().id_class(this.id_break);
        this.id_catch = 4 * this.id_protected;
        this.id_private = -1;
        this.id_extends = this.id_case.b_();
        this.id_native = this.id_case.c_();
        this.id_volatile = this.id_case.d_();
    }

    protected rfw_3 id_class() {
        this.id_case.id_class(this.id_extends, this.id_native, this.id_volatile).id_class(this.id_throws[(this.id_private + 4) % 4]);
        this.id_extends = this.id_case.b_();
        this.id_native = this.id_case.c_();
        this.id_volatile = this.id_case.d_();
        if (this.id_finally >= this.id_implements) {
            if (this.id_private >= this.id_catch) {
                return (rfw_3)this.endOfData();
            }
            ++this.id_private;
            this.id_finally = 0;
            this.id_implements = this.id_private / 2 + 1;
        }
        ++this.id_finally;
        return this.id_case;
    }

    protected /* synthetic */ Object computeNext() {
        return this.id_class();
    }
}

