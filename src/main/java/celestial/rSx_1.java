/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.iB_2;
import celestial.is_3;
import celestial.rBk_1;
import celestial.rXQ;
import celestial.rdn_3;
import celestial.rpm_3;
import celestial.rqA_2;
import java.util.function.Predicate;

public class rSx_1<T extends is_3>
extends rBk_1 {
    private final T id_class;
    private final rdn_3 id_break;
    private final Predicate<? super T> id_byte;
    private final rqA_2 id_protected;

    @Override
    public void id_byte() {
        ((is_3)this.id_class).id_class(rXQ.MAINHAND, this.id_break.id_implements());
        ((iB_2)this.id_class).id_break(rpm_3.MAIN_HAND);
    }

    public rSx_1(T t, rdn_3 rdn_32, rqA_2 rqA_22, Predicate<? super T> predicate) {
        this.id_class = t;
        this.id_break = rdn_32;
        this.id_protected = rqA_22;
        this.id_byte = predicate;
    }

    @Override
    public boolean id_class() {
        return this.id_byte.test(this.id_class);
    }

    @Override
    public boolean id_break() {
        return ((iB_2)this.id_class).id_return();
    }

    @Override
    public void id_protected() {
        ((is_3)this.id_class).id_class(rXQ.MAINHAND, rdn_3.id_break);
        if (this.id_protected != null) {
            ((an_3)this.id_class).id_class(this.id_protected, 1.0f, ((iB_2)this.id_class).Sa().nextFloat() * 0.2f + 0.9f);
        }
    }
}

