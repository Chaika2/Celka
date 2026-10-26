package celestial;

import java.util.Objects;
import java.util.function.Function;

public class Ig_1 {
   private final rqO_2 id_class;
   private final rqO_2 id_break;
   private HU id_byte;

   public fj_3 id_byte() {
      fj_3 var1 = QY.id_instanceof().id_class(this.id_class()).apply(this.id_break());
      if (rrbY_2.id_class()) {
         var1 = rrbY_2.id_class(var1);
      }

      return var1;
   }

   public Ig_1(rqO_2 var1, rqO_2 var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         Ig_1 var2 = (Ig_1)var1;
         return this.id_class.equals(var2.id_class) && this.id_break.equals(var2.id_break);
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return "Material{atlasLocation=" + this.id_class + ", texture=" + this.id_break + "}";
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.id_class, this.id_break);
   }

   public Ok_1 id_class(Hx_1 var1, Function<rqO_2, HU> var2) {
      fj_3 var3 = this.id_byte();
      HU var4 = this.id_class(var2);
      if (var3.id_package && var4.id_abstract()) {
         rrxn_3.id_break();
         var4 = HU.id_byte(this.id_class);
      }

      return var3.id_class(var1.getBuffer(var4));
   }

   public rqO_2 id_class() {
      return this.id_class;
   }

   public Ok_1 id_class(Hx_1 var1, Function<rqO_2, HU> var2, boolean var3) {
      return this.id_byte().id_class(Hz_1.id_byte(var1, this.id_class(var2), true, var3));
   }

   public HU id_class(Function<rqO_2, HU> var1) {
      if (this.id_byte == null) {
         this.id_byte = (HU)var1.apply(this.id_class);
      }

      return this.id_byte;
   }

   public rqO_2 id_break() {
      return this.id_break;
   }
}
