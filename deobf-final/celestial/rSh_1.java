package celestial;

import java.util.function.Predicate;

public class rSh_1<T extends iB_2> extends rBI<T> {
   private boolean implements_ = true;

   public rSh_1(rEB var1, Class<T> var2, int var3, boolean var4, boolean var5, Predicate<iB_2> var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   public void class_(boolean var1) {
      this.implements_ = var1;
   }

   @Override
   public boolean class_() {
      return this.implements_ && super.class_();
   }
}
