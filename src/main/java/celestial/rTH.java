/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
package celestial;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class rTH {
    public static final rTH id_class = new rTH((List<String>)ImmutableList.of((Object)"vanilla"), (List<String>)ImmutableList.of());
    public static final Codec<rTH> id_break = RecordCodecBuilder.create(instance -> instance.group((App)Codec.STRING.listOf().fieldOf("Enabled").forGetter(rTH2 -> rTH2.id_byte), (App)Codec.STRING.listOf().fieldOf("Disabled").forGetter(rTH2 -> rTH2.id_protected)).apply((Applicative)instance, rTH::new));
    private final List<String> id_byte;
    private final List<String> id_protected;

    public rTH(List<String> list, List<String> list2) {
        this.id_byte = ImmutableList.copyOf(list);
        this.id_protected = ImmutableList.copyOf(list2);
    }

    public List<String> id_class() {
        return this.id_byte;
    }

    public List<String> id_break() {
        return this.id_protected;
    }
}

