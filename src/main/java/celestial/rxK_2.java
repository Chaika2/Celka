/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 */
package celestial;

import celestial.rLY;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class rxK_2 {
    private final int id_class;
    private final float id_break;
    private final boolean id_byte;
    private final boolean id_protected;
    private final boolean id_throws;
    private final boolean id_case;
    private final List<Pair<rLY, Float>> id_catch;

    public boolean id_byte() {
        return this.id_byte;
    }

    public rxK_2(int n, float f, boolean bl, boolean bl2, boolean bl3, boolean bl4, List<Pair<rLY, Float>> list) {
        this.id_class = n;
        this.id_break = f;
        this.id_byte = bl;
        this.id_protected = bl2;
        this.id_throws = bl3;
        this.id_catch = list;
        this.id_case = bl4;
    }

    public int id_class() {
        return this.id_class;
    }

    public float id_break() {
        return this.id_break;
    }

    public boolean id_throws() {
        return this.id_throws;
    }

    public boolean id_catch() {
        return this.id_case;
    }

    public List<Pair<rLY, Float>> id_case() {
        return this.id_catch;
    }

    public boolean id_protected() {
        return this.id_protected;
    }
}

