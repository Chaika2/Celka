package celestial;

import java.util.function.Predicate;

public class rBf_1<T extends iB_2> extends rBI<T> {
   private final rOQ implements_;

   public rBf_1(rOQ var1, Class<T> var2, boolean var3, Predicate<iB_2> var4) {
      super(var1, var2, 10, var3, false, var4);
      this.implements_ = var1;
   }

   @Override
   public boolean class_() {
      return !this.implements_.sZ() && super.class_();
   }

   @Override
   public boolean break_() {
      return this.protected_ != null ? this.protected_.class_(this.throws_, this.byte_) : super.break_();
   }
}
