package celestial;

import java.util.List;

public class Fj_1 extends FI {
   public Fj_1(Fb_1<?> var1, int var2, int var3, int var4, int var5, LL var6) {
      super(var1, var2, var3, var4, var5, new rgn_3("container.action.put_all"), var6);
   }

   @Override
   public boolean extends_() {
      rJr_1 var1 = this.native_().G_();
      List var2 = var1.class_(null);

      for (int var3 = var2.size(); var3 < var1.throws_.size(); var3++) {
         rJY var4 = var1.throws_.get(var3);
         if (var4.break_()) {
            return true;
         }
      }

      return false;
   }

   @Override
   public FM implements_() {
      return FM.PUT_ALL;
   }

   @Override
   public void private_() {
      Fb_1 var1 = this.native_();
      if (var1.package_() == this.implements_()) {
         rJr_1 var2 = var1.G_();
         List var3 = var2.class_(null);

         for (int var4 = var3.size(); var4 < var2.throws_.size(); var4++) {
            rJY var5 = var2.throws_.get(var4);
            if (var5.break_() && var5.class_(var5.class_())) {
               ((Ax_1)import_.class_[55]).class_(var2.case_, var5.protected_, 0, rXa_1.QUICK_MOVE, false);
            }
         }

         var1.class_(null);
      }
   }
}
