package celestial;

import java.util.Objects;
import java.util.stream.Stream;

public class rgW_2 extends rgx_3 {
   private final rqO_2 catch_;

   public rgW_2(String var1, boolean var2, rqO_2 var3) {
      super(var1, var2);
      this.catch_ = var3;
   }

   public rgW_2(String var1, YJ var2, boolean var3, rqO_2 var4) {
      super(var1, var2, var3);
      this.catch_ = var4;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof rgW_2 var2)
            ? false
            : Objects.equals(this.catch_, var2.catch_) && Objects.equals(this.protected_, var2.protected_) && super.equals(var1);
      }
   }

   @Override
   public String toString() {
      return "StorageNbtComponent{id='" + this.catch_ + "'path='" + this.protected_ + "', siblings=" + this.case_ + ", style=" + this.class_() + "}";
   }

   @Override
   protected Stream<rcd_3> class_(gy_3 var1) {
      rcd_3 var2 = var1.super_().Y().class_(this.catch_);
      return Stream.of(var2);
   }

   public rqO_2 extends_() {
      return this.catch_;
   }

   public rgW_2 native_() {
      return new rgW_2(this.protected_, this.throws_, this.byte_, this.catch_);
   }
}
