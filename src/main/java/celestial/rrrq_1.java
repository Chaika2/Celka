/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.aI_2;
import celestial.rUt_1;
import celestial.rYf_1;
import celestial.rrrT;
import celestial.rrrZ;
import celestial.rrrv_1;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;

public class rrrq_1
extends rrrZ<rUt_1> {
    private static final List<rYf_1> id_else = ImmutableList.of((Object)new rYf_1(aI_2.a, 1, 1, 1));
    private static final List<rYf_1> id_synchronized = ImmutableList.of((Object)new rYf_1(aI_2.id_private, 1, 1, 1));

    @Override
    public List<rYf_1> id_byte() {
        return id_else;
    }

    public rrrq_1(Codec<rUt_1> codec) {
        super(codec);
    }

    @Override
    public rrrv_1<rUt_1> id_class() {
        return rrrT::new;
    }

    @Override
    public List<rYf_1> id_private() {
        return id_synchronized;
    }
}

