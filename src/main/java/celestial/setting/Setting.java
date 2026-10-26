/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.tuple.Pair
 */
package celestial.setting;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import org.apache.commons.lang3.tuple.Pair;

public class Setting<T> {
    public Object[] id_class;

    public T id_byte() {
        return (T)this.id_class[3];
    }

    public void id_byte(String var1) {
        this.id_class[0] = var1;
    }

    public Setting(String var1, T var2) {
        Supplier<Boolean> var11;
        HashMap var8;
        this.id_native();
        this.id_class[4] = var8 = new HashMap();
        this.id_class[0] = var1;
        this.id_class[3] = var2;
        this.id_class[5] = var11 = () -> true;
        for (int var3 = 0; var3 < var1.length(); ++var3) {
            if (var1.charAt(var3) != '\n') continue;
            this.id_class[2] = (Integer)this.id_class[2] + 1;
        }
    }

    public boolean equals(Object var1) {
        if (this == var1) {
            return true;
        }
        if (var1 != null && this.getClass() == var1.getClass()) {
            Setting var2 = (Setting)var1;
            return Objects.equals((String)this.id_class[0], (String)var2.id_class[0]);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode((String)this.id_class[0]);
    }

    public void id_class(T var1, boolean var2, boolean var3) {
        this.id_class[3] = var1;
        if (var3 && !((Map)this.id_class[4]).isEmpty()) {
            for (Map.Entry var5 : ((Map)this.id_class[4]).entrySet()) {
                ((BiConsumer)var5.getValue()).accept(this, Pair.of(var1, (Object)var2));
            }
        }
    }

    public <E extends Setting<E>> E id_class(String var1) {
        this.id_class[1] = var1;
        return (E)this;
    }

    public <E> E id_class(Supplier<Boolean> var1) {
        this.id_class[5] = var1;
        return (E)this;
    }

    public <E> E id_class(String var1, BiConsumer<Setting<T>, Pair<T, Boolean>> var2) {
        ((Map)this.id_class[4]).put(var1, var2);
        return (E)this;
    }

    public String id_throws() {
        return (String)this.id_class[0];
    }

    public String id_catch() {
        return (String)this.id_class[1];
    }

    public Supplier<Boolean> id_case() {
        return (Supplier)this.id_class[5];
    }

    public int id_implements() {
        return (Integer)this.id_class[2];
    }

    public Map<String, BiConsumer<Setting<T>, Pair<T, Boolean>>> id_protected() {
        return (Map)this.id_class[4];
    }

    public boolean id_private() {
        return (Boolean)((Supplier)this.id_class[5]).get();
    }

    private void id_native() {
        if (this.id_class == null) {
            Object[] var1 = this.id_class = new Object[6];
            var1[2] = 0;
        }
    }
}

