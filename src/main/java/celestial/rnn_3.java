/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rVm_1;
import celestial.rnA_2;
import java.util.Properties;
import java.util.function.Function;
import java.util.function.Supplier;

public class rnn_3<V>
implements Supplier<V> {
    private final String id_break;
    private final V id_byte;
    private final Function<V, String> id_protected;
    public final /* synthetic */ rnA_2 id_class;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public rnn_3(rnA_2 rnA_22, String string, Object object, Function function) {
        this.id_class = rnA_22;
        this.id_break = string;
        this.id_byte = object;
        this.id_protected = function;
    }

    @Override
    public V get() {
        return this.id_byte;
    }

    public T id_class(rVm_1 rVm_12, V v) {
        Properties properties = this.id_class.id_class();
        properties.put(this.id_break, this.id_protected.apply(v));
        return this.id_class.id_class(rVm_12, properties);
    }
}

