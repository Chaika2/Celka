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
import java.util.Random;

public class rfy_3
extends AbstractIterator<rfH_2> {
    public final rfw_3 id_class = new rfw_3();
    public int id_break = this.id_byte;
    public final /* synthetic */ int id_byte;
    public final /* synthetic */ int id_protected;
    public final /* synthetic */ Random id_throws;
    public final /* synthetic */ int id_case;
    public final /* synthetic */ int id_catch;
    public final /* synthetic */ int id_private;
    public final /* synthetic */ int id_implements;
    public final /* synthetic */ int id_finally;

    public rfy_3(int n, int n2, Random random, int n3, int n4, int n5, int n6, int n7) {
        this.id_byte = n;
        this.id_protected = n2;
        this.id_throws = random;
        this.id_case = n3;
        this.id_catch = n4;
        this.id_private = n5;
        this.id_implements = n6;
        this.id_finally = n7;
    }

    protected rfH_2 id_class() {
        if (this.id_break <= 0) {
            return (rfH_2)this.endOfData();
        }
        rfw_3 rfw_32 = this.id_class.id_class(this.id_protected + this.id_throws.nextInt(this.id_case), this.id_catch + this.id_throws.nextInt(this.id_private), this.id_implements + this.id_throws.nextInt(this.id_finally));
        --this.id_break;
        return rfw_32;
    }

    protected /* synthetic */ Object computeNext() {
        return this.id_class();
    }
}

