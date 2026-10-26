package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Objects;
import java.util.OptionalDouble;

public class Hw_1 extends Hn_1 {
   private final OptionalDouble S;

   public Hw_1(OptionalDouble var1) {
      super("line_width", () -> {
         if (!Objects.equals(var1, OptionalDouble.of(1.0))) {
            if (var1.isPresent()) {
               RenderSystem.lineWidth((float)var1.getAsDouble());
            } else {
               RenderSystem.lineWidth(Math.max(2.5F, (float)QY.instanceof_().else_().extends_() / 1920.0F * 2.5F));
            }
         }
      }, () -> {
         if (!Objects.equals(var1, OptionalDouble.of(1.0))) {
            RenderSystem.lineWidth(1.0F);
         }
      });
      this.S = var1;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         return !super.equals(var1) ? false : Objects.equals(this.S, ((Hw_1)var1).S);
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return this.class_ + "[" + (this.S.isPresent() ? this.S.getAsDouble() : "window_scale") + "]";
   }

   @Override
   public int hashCode() {
      return rrWX.class_(super.hashCode(), this.S);
   }
}
