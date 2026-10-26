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
import celestial.rhi_3;
import celestial.rsT_2;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rsp_3 {
    private static final int[] id_break = new int[]{0, 10, 70, 150, 250};
    public static final Codec<rsp_3> id_class = RecordCodecBuilder.create(instance -> instance.group((App)rVL.X.fieldOf("type").orElseGet(() -> rhi_3.id_byte).forGetter(rsp_32 -> rsp_32.id_byte), (App)rVL.J.fieldOf("profession").orElseGet(() -> rsT_2.id_class).forGetter(rsp_32 -> rsp_32.id_protected), (App)Codec.INT.fieldOf("level").orElse((Object)1).forGetter(rsp_32 -> rsp_32.id_throws)).apply((Applicative)instance, rsp_3::new));
    private final rhi_3 id_byte;
    private final rsT_2 id_protected;
    private final int id_throws;

    public int id_byte() {
        return this.id_throws;
    }

    public static int id_byte(int n) {
        return rsp_3.id_protected(n) ? id_break[n] : 0;
    }

    public rsp_3(rhi_3 rhi_32, rsT_2 rsT_22, int n) {
        this.id_byte = rhi_32;
        this.id_protected = rsT_22;
        this.id_throws = Math.max(1, n);
    }

    public rhi_3 id_class() {
        return this.id_byte;
    }

    public rsp_3 id_class(rhi_3 rhi_32) {
        return new rsp_3(rhi_32, this.id_protected, this.id_throws);
    }

    public rsp_3 id_class(rsT_2 rsT_22) {
        return new rsp_3(this.id_byte, rsT_22, this.id_throws);
    }

    public rsp_3 id_class(int n) {
        return new rsp_3(this.id_byte, this.id_protected, n);
    }

    public rsT_2 id_break() {
        return this.id_protected;
    }

    public static int id_break(int n) {
        return rsp_3.id_protected(n) ? id_break[n - 1] : 0;
    }

    public static boolean id_protected(int n) {
        return n >= 1 && n < 5;
    }
}

