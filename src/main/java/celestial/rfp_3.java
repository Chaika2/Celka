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

public class rfp_3
extends AbstractIterator<rfH_2> {
    private final rfw_3 id_private = new rfw_3();
    private int id_implements;
    private int id_finally;
    private int id_extends;
    private int id_native;
    private int id_volatile;
    private boolean id_final;
    public final /* synthetic */ int id_class;
    public final /* synthetic */ int id_break;
    public final /* synthetic */ int id_byte;
    public final /* synthetic */ int id_protected;
    public final /* synthetic */ int id_throws;
    public final /* synthetic */ int id_case;
    public final /* synthetic */ int id_catch;

    public rfp_3(int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        this.id_class = n;
        this.id_break = n2;
        this.id_byte = n3;
        this.id_protected = n4;
        this.id_throws = n5;
        this.id_case = n6;
        this.id_catch = n7;
    }

    protected rfH_2 id_class() {
        if (this.id_final) {
            this.id_final = false;
            this.id_private.c_(this.id_class - (this.id_private.d_() - this.id_class));
            return this.id_private;
        }
        rfw_3 rfw_32 = null;
        while (rfw_32 == null) {
            if (this.id_volatile > this.id_extends) {
                ++this.id_native;
                if (this.id_native > this.id_finally) {
                    ++this.id_implements;
                    if (this.id_implements > this.id_break) {
                        return (rfH_2)this.endOfData();
                    }
                    this.id_finally = Math.min(this.id_byte, this.id_implements);
                    this.id_native = -this.id_finally;
                }
                this.id_extends = Math.min(this.id_protected, this.id_implements - Math.abs(this.id_native));
                this.id_volatile = -this.id_extends;
            }
            int n = this.id_native;
            int n2 = this.id_volatile;
            int n3 = this.id_implements - Math.abs(n) - Math.abs(n2);
            if (n3 <= this.id_throws) {
                this.id_final = n3 != 0;
                rfw_32 = this.id_private.id_class(this.id_case + n, this.id_catch + n2, this.id_class + n3);
            }
            ++this.id_volatile;
        }
        return rfw_32;
    }

    protected /* synthetic */ Object computeNext() {
        return this.id_class();
    }
}

