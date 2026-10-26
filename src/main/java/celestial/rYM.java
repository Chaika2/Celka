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

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rYM {
    public static final Codec<rYM> id_class = RecordCodecBuilder.create(instance -> instance.group((App)Codec.floatRange((float)-2.0f, (float)2.0f).fieldOf("temperature").forGetter(rYM2 -> Float.valueOf(rYM2.id_break)), (App)Codec.floatRange((float)-2.0f, (float)2.0f).fieldOf("humidity").forGetter(rYM2 -> Float.valueOf(rYM2.id_byte)), (App)Codec.floatRange((float)-2.0f, (float)2.0f).fieldOf("altitude").forGetter(rYM2 -> Float.valueOf(rYM2.id_protected)), (App)Codec.floatRange((float)-2.0f, (float)2.0f).fieldOf("weirdness").forGetter(rYM2 -> Float.valueOf(rYM2.id_throws)), (App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("offset").forGetter(rYM2 -> Float.valueOf(rYM2.id_case))).apply((Applicative)instance, rYM::new));
    private final float id_break;
    private final float id_byte;
    private final float id_protected;
    private final float id_throws;
    private final float id_case;

    public rYM(float f, float f2, float f3, float f4, float f5) {
        this.id_break = f;
        this.id_byte = f2;
        this.id_protected = f3;
        this.id_throws = f4;
        this.id_case = f5;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            rYM rYM2 = (rYM)object;
            if (Float.compare(rYM2.id_break, this.id_break) != 0) {
                return false;
            }
            if (Float.compare(rYM2.id_byte, this.id_byte) != 0) {
                return false;
            }
            if (Float.compare(rYM2.id_protected, this.id_protected) != 0) {
                return false;
            }
            return Float.compare(rYM2.id_throws, this.id_throws) == 0;
        }
        return false;
    }

    public int hashCode() {
        int n = this.id_break != 0.0f ? Float.floatToIntBits(this.id_break) : 0;
        n = 31 * n + (this.id_byte != 0.0f ? Float.floatToIntBits(this.id_byte) : 0);
        n = 31 * n + (this.id_protected != 0.0f ? Float.floatToIntBits(this.id_protected) : 0);
        return 31 * n + (this.id_throws != 0.0f ? Float.floatToIntBits(this.id_throws) : 0);
    }

    public float id_class(rYM rYM2) {
        return (this.id_break - rYM2.id_break) * (this.id_break - rYM2.id_break) + (this.id_byte - rYM2.id_byte) * (this.id_byte - rYM2.id_byte) + (this.id_protected - rYM2.id_protected) * (this.id_protected - rYM2.id_protected) + (this.id_throws - rYM2.id_throws) * (this.id_throws - rYM2.id_throws) + (this.id_case - rYM2.id_case) * (this.id_case - rYM2.id_case);
    }
}

