/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Om_1;
import celestial.Oq_1;
import celestial.Oy_1;
import celestial.util.MinecraftAccessor;

public interface OA
extends MinecraftAccessor {
    public void id_byte(Class<?> var1);

    public void id_byte(Object var1);

    public void id_class(Oy_1 var1);

    public void id_class(String var1, Oq_1 var2);

    public boolean id_class(Class<?> var1);

    public <T> T id_class(T var1);

    public <T extends Om_1> T id_class(T var1);

    public void id_break(Oy_1 var1);

    public void id_break(Class<?> var1);

    public void id_break(Object var1);
}

