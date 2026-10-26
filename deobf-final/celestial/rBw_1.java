package celestial;

import java.util.function.Predicate;

public class rBw_1<T extends iB_2> extends rBI<T> {
   private int implements_ = 0;

   @Override
   public void byte_() {
      this.implements_ = 200;
      super.byte_();
   }

   public rBw_1(rEB var1, Class<T> var2, boolean var3, Predicate<iB_2> var4) {
      super(var1, var2, 500, var3, false, var4);
   }

   @Override
   public boolean class_() {
      if (this.implements_ > 0 || !this.throws_.Sa().nextBoolean()) {
         return false;
      } else if (!((rEB)this.throws_).sd()) {
         return false;
      } else {
         this.finally_();
         return this.byte_ != null;
      }
   }

   public int catch_() {
      return this.implements_;
   }

   public void private_() {
      this.implements_--;
   }
}
