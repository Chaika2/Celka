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

import celestial.rLQ;
import celestial.rLd_1;
import celestial.rLu_1;
import celestial.rLx_1;
import celestial.rLz_1;
import celestial.rVL;
import celestial.rfU_2;
import celestial.ruu_3;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;

public class rLc_1
implements rLx_1 {
    public static final rLc_1 id_class = new rLc_1(1.0f, 0.0f, 0.0f, 1.0f);
    public static final Codec<rLc_1> id_break = RecordCodecBuilder.create(instance -> instance.group((App)Codec.FLOAT.fieldOf("r").forGetter(rLc_12 -> Float.valueOf(rLc_12.id_protected)), (App)Codec.FLOAT.fieldOf("g").forGetter(rLc_12 -> Float.valueOf(rLc_12.id_throws)), (App)Codec.FLOAT.fieldOf("b").forGetter(rLc_12 -> Float.valueOf(rLc_12.id_case)), (App)Codec.FLOAT.fieldOf("scale").forGetter(rLc_12 -> Float.valueOf(rLc_12.id_catch))).apply((Applicative)instance, rLc_1::new));
    public static final rLd_1<rLc_1> id_byte = new rLu_1();
    private final float id_protected;
    private final float id_throws;
    private final float id_case;
    private final float id_catch;

    @Override
    public String id_byte() {
        return String.format(Locale.ROOT, "%s %.2f %.2f %.2f %.2f", rVL.id_switch.id_break(this.id_protected()), Float.valueOf(this.id_protected), Float.valueOf(this.id_throws), Float.valueOf(this.id_case), Float.valueOf(this.id_catch));
    }

    public rLc_1(float f, float f2, float f3, float f4) {
        this.id_protected = f;
        this.id_throws = f2;
        this.id_case = f3;
        this.id_catch = rfU_2.id_class(f4, 0.01f, 4.0f);
    }

    @Override
    public void id_class(ruu_3 ruu_32) {
        ruu_32.writeFloat(this.id_protected);
        ruu_32.writeFloat(this.id_throws);
        ruu_32.writeFloat(this.id_case);
        ruu_32.writeFloat(this.id_catch);
    }

    public float id_class() {
        return this.id_protected;
    }

    public float id_break() {
        return this.id_throws;
    }

    public float id_throws() {
        return this.id_case;
    }

    public float id_case() {
        return this.id_catch;
    }

    public rLz_1<rLc_1> id_protected() {
        return rLQ.id_package;
    }
}

