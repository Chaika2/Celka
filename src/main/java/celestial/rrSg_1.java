/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rrsG_2;
import celestial.rrsM_2;
import celestial.xc_3;
import celestial.xu_3;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;

public class rrSg_1
extends rrsM_2 {
    private static final xc_3 id_class = xu_3.PK.id_continue();
    private static final xc_3 id_break = xu_3.Ju.id_continue();
    private static final xc_3 id_byte = xu_3.id_char.id_continue();
    private static final ImmutableList<xc_3> id_protected = ImmutableList.of((Object)id_class, (Object)id_break);
    private static final ImmutableList<xc_3> id_throws = ImmutableList.of((Object)id_class);

    @Override
    protected xc_3 id_byte() {
        return id_byte;
    }

    public rrSg_1(Codec<rrsG_2> codec) {
        super(codec);
    }

    @Override
    protected ImmutableList<xc_3> id_class() {
        return id_protected;
    }

    @Override
    protected ImmutableList<xc_3> id_break() {
        return id_throws;
    }
}

