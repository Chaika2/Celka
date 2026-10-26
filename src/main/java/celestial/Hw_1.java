/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Hn_1;
import celestial.QY;
import celestial.rrWX;
import com.mojang.blaze3d.systems.RenderSystem;
import java.io.Serializable;
import java.util.Objects;
import java.util.OptionalDouble;

public class Hw_1
extends Hn_1 {
    private final OptionalDouble S;

    public Hw_1(OptionalDouble optionalDouble) {
        super("line_width", () -> {
            if (!Objects.equals(optionalDouble, OptionalDouble.of(1.0))) {
                if (optionalDouble.isPresent()) {
                    RenderSystem.lineWidth((float)optionalDouble.getAsDouble());
                } else {
                    RenderSystem.lineWidth(Math.max(2.5f, (float)QY.id_instanceof().id_else().id_extends() / 1920.0f * 2.5f));
                }
            }
        }, () -> {
            if (!Objects.equals(optionalDouble, OptionalDouble.of(1.0))) {
                RenderSystem.lineWidth(1.0f);
            }
        });
        this.S = optionalDouble;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            return !super.equals(object) ? false : Objects.equals(this.S, ((Hw_1)object).S);
        }
        return false;
    }

    @Override
    public String toString() {
        return this.id_class + "[" + (Serializable)(this.S.isPresent() ? Double.valueOf(this.S.getAsDouble()) : "window_scale") + "]";
    }

    @Override
    public int hashCode() {
        return rrWX.id_class(super.hashCode(), (Object)this.S);
    }
}

