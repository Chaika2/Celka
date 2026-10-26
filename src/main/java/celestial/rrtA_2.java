/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.util.MinecraftAccessor;

public interface rrtA_2
extends MinecraftAccessor {
    public void id_byte();

    public boolean id_class(char var1, int var2);

    public void id_class(int var1, int var2, int var3);

    public void id_class(float var1, float var2, float var3, float var4, int var5, int var6);

    default public boolean id_class(int n, int n2, int n3, int n4, int n5, int n6) {
        return n >= n3 && n <= n3 + n5 && n2 >= n4 && n2 <= n4 + n6;
    }

    public void id_class();

    public void id_break();

    public void id_break(int var1, int var2, int var3);
}

