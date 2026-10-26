package celestial;

public class FV extends FI {
   public FV(Fb_1<?> var1, int var2, int var3, int var4, int var5, LL var6) {
      super(var1, var2, var3, var4, var5, new rgn_3("container.action.take_all"), var6);
   }

   @Override
   public boolean extends_() {
      rJr_1 var1 = this.native_().G_();

      for (rJY var4 : var1.class_(var0 -> !((cb_3)import_.class_[57]).sK().class_(var0.class_().break_()))) {
         if (var4.break_()) {
            return true;
         }
      }

      return false;
   }

   @Override
   public FM implements_() {
      return FM.TAKE_ALL;
   }

   @Override
   public void private_() {
      Fb_1 var1 = this.native_();
      if (var1.package_() == this.implements_()) {
         rJr_1 var2 = var1.G_();

         for (rJY var5 : var2.class_(var0 -> !((cb_3)import_.class_[57]).sK().class_(var0.class_().break_()))) {
            if (var5.break_()) {
               ((Ax_1)import_.class_[55]).class_(var2.case_, var5.protected_, 0, rXa_1.QUICK_MOVE, false);
            }
         }

         var1.class_(null);
      }
   }
}
