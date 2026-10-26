/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Lifecycle
 */
package celestial;

import celestial.rVL;
import celestial.rqM_2;
import com.mojang.serialization.Lifecycle;
import java.util.OptionalInt;

public abstract class rVF<T>
extends rVL<T> {
    public rVF(rqM_2<? extends rVL<T>> rqM_22, Lifecycle lifecycle) {
        super(rqM_22, lifecycle);
    }

    public abstract <V extends T> V id_class(OptionalInt var1, rqM_2<T> var2, V var3, Lifecycle var4);

    public abstract <V extends T> V id_class(rqM_2<T> var1, V var2, Lifecycle var3);

    public abstract <V extends T> V id_class(int var1, rqM_2<T> var2, V var3, Lifecycle var4);
}

