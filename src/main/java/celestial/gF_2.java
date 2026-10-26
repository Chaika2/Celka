/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap
 *  it.unimi.dsi.fastutil.objects.Object2ObjectMap
 */
package celestial;

import celestial.gA_2;
import celestial.gC_2;
import celestial.gL_2;
import celestial.gn_3;
import celestial.rRJ;
import celestial.rfU_2;
import celestial.rjU_2;
import celestial.rqO_2;
import celestial.rqR_2;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;

public abstract class gF_2 {
    private static final Object2ObjectMap<rqO_2, gF_2> id_class = (Object2ObjectMap)rqR_2.id_class(new Object2ObjectArrayMap(), object2ObjectArrayMap -> {
        gC_2 gC_22 = new gC_2();
        object2ObjectArrayMap.defaultReturnValue((Object)gC_22);
        object2ObjectArrayMap.put((Object)rRJ.id_class, (Object)gC_22);
        object2ObjectArrayMap.put((Object)rRJ.id_break, (Object)new gn_3());
        object2ObjectArrayMap.put((Object)rRJ.id_byte, (Object)new gL_2());
    });
    private final float[] id_break = new float[4];
    private final float id_byte;
    private final boolean id_protected;
    private final gA_2 id_throws;
    private final boolean id_case;
    private final boolean id_catch;

    public gA_2 id_byte() {
        return this.id_throws;
    }

    public gF_2(float f, boolean bl, gA_2 gA_22, boolean bl2, boolean bl3) {
        this.id_byte = f;
        this.id_protected = bl;
        this.id_throws = gA_22;
        this.id_case = bl2;
        this.id_catch = bl3;
    }

    public float[] id_class(float f, float f2) {
        float f3 = 0.4f;
        float f4 = rfU_2.id_break(f * ((float)Math.PI * 2)) - 0.0f;
        float f5 = -0.0f;
        if (f4 >= -0.4f && f4 <= 0.4f) {
            float f6 = (f4 - -0.0f) / 0.4f * 0.5f + 0.5f;
            float f7 = 1.0f - (1.0f - rfU_2.id_class(f6 * (float)Math.PI)) * 0.99f;
            f7 *= f7;
            this.id_break[0] = f6 * 0.3f + 0.7f;
            this.id_break[1] = f6 * f6 * 0.7f + 0.2f;
            this.id_break[2] = f6 * f6 * 0.0f + 0.2f;
            this.id_break[3] = f7;
            return this.id_break;
        }
        return null;
    }

    public static gF_2 id_class(rRJ rRJ2) {
        return (gF_2)id_class.get((Object)rRJ2.id_int());
    }

    public abstract boolean id_class(int var1, int var2);

    public float id_class() {
        return this.id_byte;
    }

    public abstract rjU_2 id_class(rjU_2 var1, float var2);

    public boolean id_break() {
        return this.id_protected;
    }

    public boolean id_throws() {
        return this.id_catch;
    }

    public boolean id_protected() {
        return this.id_case;
    }
}

