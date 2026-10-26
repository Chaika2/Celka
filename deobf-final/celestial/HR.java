package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Optional;

public class HR extends Hn_1 {
   private final Optional<rqO_2> S;
   private final boolean s;
   private final boolean E;

   public HR(rqO_2 var1, boolean var2, boolean var3) {
      super("texture", () -> {
         RenderSystem.enableTexture();
         fY_2 var3x = QY.instanceof_().A();
         var3x.class_(var1);
         var3x.byte_().class_(var2, var3);
      }, () -> {
      });
      this.S = Optional.of(var1);
      this.s = var2;
      this.E = var3;
   }

   public HR() {
      super("texture", () -> RenderSystem.disableTexture(), () -> RenderSystem.enableTexture());
      this.S = Optional.empty();
      this.s = false;
      this.E = false;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         HR var2 = (HR)var1;
         return this.S.equals(var2.S) && this.s == var2.s && this.E == var2.E;
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return this.class_ + "[" + this.S + "(blur=" + this.s + ", mipmap=" + this.E + ")]";
   }

   @Override
   public int hashCode() {
      return this.S.hashCode();
   }

   public boolean throws_() {
      return this.s;
   }

   public boolean case_() {
      return this.E;
   }

   protected Optional<rqO_2> protected_() {
      return this.S;
   }
}
