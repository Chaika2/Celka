/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 */
package celestial;

import celestial.rCF;
import celestial.rCZ;
import celestial.rCn_1;
import com.google.gson.JsonElement;
import java.util.function.Consumer;

public abstract class JG {
    private final String id_class;

    public JG(String string) {
        this.id_class = string;
    }

    public void id_class(rCF<?, ?> rCF2, Consumer<String> consumer) {
        rCZ<?> rCZ2 = rCF2.id_class(this.id_class);
        if (rCZ2 == null) {
            consumer.accept(this.id_class);
        }
    }

    public abstract JsonElement id_class();

    protected abstract <T extends Comparable<T>> boolean id_class(rCn_1<?, ?> var1, rCZ<T> var2);

    public <S extends rCn_1<?, S>> boolean id_class(rCF<?, S> rCF2, S s) {
        rCZ<?> rCZ2 = rCF2.id_class(this.id_class);
        return rCZ2 == null ? false : this.id_class(s, rCZ2);
    }

    public String id_break() {
        return this.id_class;
    }
}

