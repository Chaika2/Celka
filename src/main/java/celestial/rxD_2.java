/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.util.Pair
 */
package celestial;

import celestial.rLY;
import celestial.rxK_2;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.List;

public class rxD_2 {
    private int id_class;
    private float id_break;
    private boolean id_byte;
    private boolean id_protected;
    private boolean id_throws;
    private boolean id_case;
    private final List<Pair<rLY, Float>> id_catch = Lists.newArrayList();

    public rxD_2 id_byte() {
        this.id_throws = true;
        return this;
    }

    public rxD_2 id_class() {
        this.id_byte = true;
        return this;
    }

    public rxD_2 id_class(rLY rLY2, float f) {
        this.id_catch.add((Pair<rLY, Float>)Pair.of((Object)rLY2, (Object)Float.valueOf(f)));
        return this;
    }

    public rxD_2 id_class(int n) {
        this.id_class = n;
        return this;
    }

    public rxD_2 id_class(float f) {
        this.id_break = f;
        return this;
    }

    public rxD_2 id_break() {
        this.id_protected = true;
        return this;
    }

    public rxK_2 id_throws() {
        return new rxK_2(this.id_class, this.id_break, this.id_byte, this.id_protected, this.id_throws, this.id_case, this.id_catch);
    }

    public rxD_2 id_protected() {
        this.id_case = true;
        return this;
    }
}

