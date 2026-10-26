/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
package celestial;

import celestial.rVL;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rKN {
    public static final Codec<rKN> id_class = RecordCodecBuilder.create(instance -> instance.group((App)Codec.intRange((int)0, (int)256).fieldOf("height").forGetter(rKN::id_class), (App)rVL.id_strictfp.fieldOf("block").orElse((Object)xu_3.id_class).forGetter(rKN2 -> rKN2.id_break().id_break())).apply((Applicative)instance, rKN::new));
    private final xc_3 id_break;
    private final int id_byte;
    private int id_protected;

    public int id_byte() {
        return this.id_protected;
    }

    public rKN(int n, xd_3 xd_32) {
        this.id_byte = n;
        this.id_break = xd_32.id_continue();
    }

    public String toString() {
        return (String)(this.id_byte != 1 ? this.id_byte + "*" : "") + rVL.id_strictfp.id_break(this.id_break.id_break());
    }

    public void id_class(int n) {
        this.id_protected = n;
    }

    public int id_class() {
        return this.id_byte;
    }

    public xc_3 id_break() {
        return this.id_break;
    }
}

