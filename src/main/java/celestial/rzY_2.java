/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rNL;
import celestial.rNl_1;
import celestial.rQs_1;
import celestial.rQz_1;
import celestial.rWR;
import celestial.rdn_3;
import celestial.rzD_2;
import celestial.rzE_2;
import celestial.rzK_2;
import celestial.rze_3;
import celestial.rzo_3;
import celestial.rzr_3;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public abstract class rzY_2
extends rzE_2 {
    protected final int id_protected;
    protected final int id_throws;
    protected final rNL[] id_case;
    public final BiFunction<rdn_3, rzr_3, rdn_3> id_catch;
    private final rWR id_private = new rzo_3(this);

    protected rzY_2(int n, int n2, rQz_1[] rQz_1Array, rNL[] rNLArray) {
        super(rQz_1Array);
        this.id_protected = n;
        this.id_throws = n2;
        this.id_case = rNLArray;
        this.id_catch = rNl_1.id_class(rNLArray);
    }

    @Override
    public boolean expand(rzr_3 rzr_32, Consumer<rWR> consumer) {
        if (this.id_class(rzr_32)) {
            consumer.accept(this.id_private);
            return true;
        }
        return false;
    }

    public static rzK_2<?> id_class(rze_3 rze_32) {
        return new rzD_2(rze_32);
    }

    protected abstract void id_class(Consumer<rdn_3> var1, rzr_3 var2);

    @Override
    public void id_class(rQs_1 rQs_12) {
        super.id_class(rQs_12);
        for (int i = 0; i < this.id_case.length; ++i) {
            this.id_case[i].id_class(rQs_12.id_break(".functions[" + i + "]"));
        }
    }
}

