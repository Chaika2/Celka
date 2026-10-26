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

import celestial.rRP;
import celestial.rVL;
import celestial.rfH_2;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;

public class rgU_2 {
    private final rfH_2 id_class;
    private final rRP id_break;
    private int id_byte;
    private final Runnable id_protected;

    public boolean id_byte() {
        return this.id_byte > 0;
    }

    public rgU_2(rfH_2 rfH_22, rRP rRP2, Runnable runnable) {
        this(rfH_22, rRP2, rRP2.id_class(), runnable);
    }

    private rgU_2(rfH_2 rfH_22, rRP rRP2, int n, Runnable runnable) {
        this.id_class = rfH_22.id_int();
        this.id_break = rRP2;
        this.id_byte = n;
        this.id_protected = runnable;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        return object != null && this.getClass() == object.getClass() ? Objects.equals(this.id_class, ((rgU_2)object).id_class) : false;
    }

    public int hashCode() {
        return this.id_class.hashCode();
    }

    protected boolean id_class() {
        if (this.id_byte <= 0) {
            return false;
        }
        --this.id_byte;
        this.id_protected.run();
        return true;
    }

    public static Codec<rgU_2> id_class(Runnable runnable) {
        return RecordCodecBuilder.create(instance -> instance.group((App)rfH_2.id_byte.fieldOf("pos").forGetter(rgU_22 -> rgU_22.id_class), (App)rVL.x.fieldOf("type").forGetter(rgU_22 -> rgU_22.id_break), (App)Codec.INT.fieldOf("free_tickets").orElse((Object)0).forGetter(rgU_22 -> rgU_22.id_byte), (App)RecordCodecBuilder.point((Object)runnable)).apply((Applicative)instance, rgU_2::new));
    }

    protected boolean id_break() {
        if (this.id_byte >= this.id_break.id_class()) {
            return false;
        }
        ++this.id_byte;
        this.id_protected.run();
        return true;
    }

    public rfH_2 id_throws() {
        return this.id_class;
    }

    public rRP id_case() {
        return this.id_break;
    }

    public boolean id_protected() {
        return this.id_byte != this.id_break.id_class();
    }
}

