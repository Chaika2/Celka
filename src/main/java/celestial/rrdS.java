/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfH_2;
import celestial.rrGi_1;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class rrdS
implements Iterator<rfH_2> {
    private double id_class;
    private double id_break;
    private int id_byte;
    private int id_protected;
    private double id_throws;
    private double id_case;
    private double id_catch;
    private double id_private;
    private int id_implements;
    private double id_finally;
    private double id_extends;
    private rrGi_1 id_native = new rrGi_1(0, 0, 0);
    private boolean id_volatile = false;

    public rrdS(rfH_2 rfH_22, rfH_2 rfH_23, double d, double d2) {
        this.id_class = d;
        this.id_break = d2;
        this.id_byte = rfH_22.b_();
        this.id_protected = rfH_23.b_();
        this.id_throws = rfH_22.c_();
        this.id_case = (double)rfH_23.c_() - 0.5;
        this.id_catch = rfH_22.d_();
        this.id_private = (double)rfH_23.d_() - 0.5;
        this.id_implements = this.id_byte;
        this.id_finally = this.id_throws;
        this.id_extends = this.id_catch;
        this.id_volatile = this.id_implements < this.id_protected && this.id_finally < this.id_case && this.id_extends < this.id_private;
    }

    @Override
    public void remove() {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public boolean hasNext() {
        return this.id_volatile;
    }

    @Override
    public /* synthetic */ Object next() {
        return this.id_class();
    }

    public rfH_2 id_class() {
        if (!this.id_volatile) {
            throw new NoSuchElementException();
        }
        this.id_native.id_break((double)this.id_implements, this.id_finally, this.id_extends);
        this.id_break();
        this.id_volatile = this.id_implements < this.id_protected && this.id_finally < this.id_case && this.id_extends < this.id_private;
        return this.id_native;
    }

    private void id_break() {
        this.id_extends += 1.0;
        if (!(this.id_extends < this.id_private)) {
            this.id_extends = this.id_catch;
            this.id_finally += 1.0;
            if (!(this.id_finally < this.id_case)) {
                this.id_finally = this.id_throws;
                this.id_throws += this.id_class;
                this.id_case += this.id_class;
                this.id_finally = this.id_throws;
                this.id_catch += this.id_break;
                this.id_private += this.id_break;
                this.id_extends = this.id_catch;
                ++this.id_implements;
                if (this.id_implements >= this.id_protected) {
                    // empty if block
                }
            }
        }
    }
}

