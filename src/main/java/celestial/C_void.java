/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_abstract;
import celestial.C_float;
import celestial.C_import;
import celestial.C_long;
import celestial.L;
import celestial.W;

public interface C_void {
    public <T> T id_class(Class<T> var1, C_import var2) throws W;

    public <T, S> C_long<T, S> id_class(Class<T> var1, Class<S> var2);

    public <T, S> T id_class(Class<T> var1, Class<S> var2, C_import var3, S var4) throws W;

    public <T> C_float<T> id_class(Class<T> var1);

    public L<C_abstract> id_class();
}

