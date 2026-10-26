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

import celestial.rYB;
import celestial.rfH_2;
import celestial.rqM_2;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;

public final class rfK_2 {
    public static final Codec<rfK_2> id_class = RecordCodecBuilder.create(instance -> instance.group((App)rYB.id_break.fieldOf("dimension").forGetter(rfK_2::id_class), (App)rfH_2.id_byte.fieldOf("pos").forGetter(rfK_2::id_break)).apply((Applicative)instance, rfK_2::id_class));
    private final rqM_2<rYB> id_break;
    private final rfH_2 id_byte;

    private rfK_2(rqM_2<rYB> rqM_22, rfH_2 rfH_22) {
        this.id_break = rqM_22;
        this.id_byte = rfH_22;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            rfK_2 rfK_22 = (rfK_2)object;
            return Objects.equals(this.id_break, rfK_22.id_break) && Objects.equals(this.id_byte, rfK_22.id_byte);
        }
        return false;
    }

    public String toString() {
        return this.id_break.toString() + " " + this.id_byte;
    }

    public int hashCode() {
        return Objects.hash(this.id_break, this.id_byte);
    }

    public rqM_2<rYB> id_class() {
        return this.id_break;
    }

    public static rfK_2 id_class(rqM_2<rYB> rqM_22, rfH_2 rfH_22) {
        return new rfK_2(rqM_22, rfH_22);
    }

    public rfH_2 id_break() {
        return this.id_byte;
    }
}

