/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfj_3;
import java.util.Spliterators;
import java.util.function.Consumer;

public class rfV_2
extends Spliterators.AbstractSpliterator<rfj_3> {
    private rfj_3 id_throws;
    public final /* synthetic */ rfj_3 id_class;
    public final /* synthetic */ rfj_3 id_break;
    public final /* synthetic */ int id_byte;
    public final /* synthetic */ int id_protected;

    public rfV_2(long l, int n, rfj_3 rfj_32, rfj_3 rfj_33, int n2, int n3) {
        this.id_class = rfj_32;
        this.id_break = rfj_33;
        this.id_byte = n2;
        this.id_protected = n3;
        super(l, n);
    }

    @Override
    public boolean tryAdvance(Consumer<? super rfj_3> consumer) {
        if (this.id_throws == null) {
            this.id_throws = this.id_class;
        } else {
            int n = this.id_throws.id_break;
            int n2 = this.id_throws.id_byte;
            if (n == this.id_break.id_break) {
                if (n2 == this.id_break.id_byte) {
                    return false;
                }
                this.id_throws = new rfj_3(this.id_class.id_break, n2 + this.id_byte);
            } else {
                this.id_throws = new rfj_3(n + this.id_protected, n2);
            }
        }
        consumer.accept(this.id_throws);
        return true;
    }
}

