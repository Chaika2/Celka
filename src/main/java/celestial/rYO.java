/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rYG;
import celestial.rYJ;
import celestial.rYW;
import celestial.rYX;
import celestial.rYh_1;
import celestial.rYt_1;
import celestial.rYv_1;
import celestial.rYx_1;

public class rYO {
    private rYJ id_class;
    private rYh_1 id_break;
    private Float id_byte;
    private Float id_protected;
    private Float id_throws;
    private rYx_1 id_case = rYx_1.NONE;
    private Float id_catch;
    private rYW id_private;
    private rYt_1 id_implements;
    private rYv_1 id_finally;

    public rYO id_byte(float f) {
        this.id_throws = Float.valueOf(f);
        return this;
    }

    public String toString() {
        return "BiomeBuilder{\nprecipitation=" + this.id_class + ",\nbiomeCategory=" + this.id_break + ",\ndepth=" + this.id_byte + ",\nscale=" + this.id_protected + ",\ntemperature=" + this.id_throws + ",\ntemperatureModifier=" + this.id_case + ",\ndownfall=" + this.id_catch + ",\nspecialEffects=" + this.id_private + ",\nmobSpawnSettings=" + this.id_implements + ",\ngenerationSettings=" + this.id_finally + ",\n}";
    }

    public rYO id_class(rYW rYW2) {
        this.id_private = rYW2;
        return this;
    }

    public rYO id_class(rYt_1 rYt_12) {
        this.id_implements = rYt_12;
        return this;
    }

    public rYO id_class(rYv_1 rYv_12) {
        this.id_finally = rYv_12;
        return this;
    }

    public rYO id_class(rYx_1 rYx_12) {
        this.id_case = rYx_12;
        return this;
    }

    public rYG id_class() {
        if (this.id_class != null && this.id_break != null && this.id_byte != null && this.id_protected != null && this.id_throws != null && this.id_catch != null && this.id_private != null && this.id_implements != null && this.id_finally != null) {
            return new rYG(new rYX(this.id_class, this.id_throws.floatValue(), this.id_case, this.id_catch.floatValue()), this.id_break, this.id_byte.floatValue(), this.id_protected.floatValue(), this.id_private, this.id_finally, this.id_implements);
        }
        throw new IllegalStateException("You are missing parameters to build a proper biome\n" + this);
    }

    public rYO id_class(rYJ rYJ2) {
        this.id_class = rYJ2;
        return this;
    }

    public rYO id_class(rYh_1 rYh_12) {
        this.id_break = rYh_12;
        return this;
    }

    public rYO id_class(float f) {
        this.id_byte = Float.valueOf(f);
        return this;
    }

    public rYO id_break(float f) {
        this.id_protected = Float.valueOf(f);
        return this;
    }

    public rYO id_protected(float f) {
        this.id_catch = Float.valueOf(f);
        return this;
    }
}

