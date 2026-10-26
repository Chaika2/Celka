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

import celestial.rUv_1;
import celestial.xc_3;
import celestial.xu_3;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rUm_1
implements rUv_1 {
    public static final Codec<rUm_1> id_class = RecordCodecBuilder.create(instance -> instance.group((App)xc_3.id_break.fieldOf("valid_base_block").forGetter(rUm_12 -> rUm_12.id_case), (App)xc_3.id_break.fieldOf("stem_state").forGetter(rUm_12 -> rUm_12.id_catch), (App)xc_3.id_break.fieldOf("hat_state").forGetter(rUm_12 -> rUm_12.id_private), (App)xc_3.id_break.fieldOf("decor_state").forGetter(rUm_12 -> rUm_12.id_implements), (App)Codec.BOOL.fieldOf("planted").orElse((Object)false).forGetter(rUm_12 -> rUm_12.id_finally)).apply((Applicative)instance, rUm_1::new));
    public static final rUm_1 id_break = new rUm_1(xu_3.XL.id_continue(), xu_3.Xm.id_continue(), xu_3.bg.id_continue(), xu_3.Xn.id_continue(), true);
    public static final rUm_1 id_byte;
    public static final rUm_1 id_protected;
    public static final rUm_1 id_throws;
    public final xc_3 id_case;
    public final xc_3 id_catch;
    public final xc_3 id_private;
    public final xc_3 id_implements;
    public final boolean id_finally;

    public rUm_1(xc_3 xc_32, xc_3 xc_33, xc_3 xc_34, xc_3 xc_35, boolean bl) {
        this.id_case = xc_32;
        this.id_catch = xc_33;
        this.id_private = xc_34;
        this.id_implements = xc_35;
        this.id_finally = bl;
    }

    static {
        id_protected = new rUm_1(xu_3.Xz.id_continue(), xu_3.Xx.id_continue(), xu_3.XN.id_continue(), xu_3.Xn.id_continue(), true);
        id_byte = new rUm_1(rUm_1.id_break.id_case, rUm_1.id_break.id_catch, rUm_1.id_break.id_private, rUm_1.id_break.id_implements, false);
        id_throws = new rUm_1(rUm_1.id_protected.id_case, rUm_1.id_protected.id_catch, rUm_1.id_protected.id_private, rUm_1.id_protected.id_implements, false);
    }
}

