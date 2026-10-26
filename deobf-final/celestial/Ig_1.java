package celestial;

import java.util.Objects;
import java.util.function.Function;

public class Ig_1 {
   private final rqO_2 class_;
   private final rqO_2 break_;
   private HU byte_;

   public fj_3 byte_() {
      fj_3 var1 = QY.instanceof_().class_(this.class_()).apply(this.break_());
      if (rrbY_2.class_()) {
         var1 = rrbY_2.class_(var1);
      }

      return var1;
   }

   public Ig_1(rqO_2 var1, rqO_2 var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         Ig_1 var2 = (Ig_1)var1;
         return this.class_.equals(var2.class_) && this.break_.equals(var2.break_);
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return "Material{atlasLocation=" + this.class_ + ", texture=" + this.break_ + "}";
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.class_, this.break_);
   }

   public Ok_1 class_(Hx_1 var1, Function<rqO_2, HU> var2) {
      fj_3 var3 = this.byte_();
      HU var4 = this.class_(var2);
      if (var3.package_ && var4.abstract_()) {
         rrxn_3.break_();
         var4 = HU.byte_(this.class_);
      }

      return var3.class_(var1.getBuffer(var4));
   }

   public rqO_2 class_() {
      return this.class_;
   }

   public Ok_1 class_(Hx_1 var1, Function<rqO_2, HU> var2, boolean var3) {
      return this.byte_().class_(Hz_1.byte_(var1, this.class_(var2), true, var3));
   }

   public HU class_(Function<rqO_2, HU> var1) {
      if (this.byte_ == null) {
         this.byte_ = (HU)var1.apply(this.class_);
      }

      return this.byte_;
   }

   public rqO_2 break_() {
      return this.break_;
   }
}
