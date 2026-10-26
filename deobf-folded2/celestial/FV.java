package celestial;

public class FV extends FI {
   public FV(Fb_1<?> var1, int var2, int var3, int var4, int var5, LL var6) {
      super(var1, var2, var3, var4, var5, new rgn_3("container.action.take_all"), var6);
   }

   @Override
   public boolean id_extends() {
      rJr_1 var1 = this.id_native().G_();

      for (rJY var4 : var1.id_class(var0 -> !((cb_3)id_import.id_class[57]).sK().id_class(var0.id_class().id_break()))) {
         if (var4.id_break()) {
            return true;
         }
      }

      return false;
   }

   @Override
   public FM id_implements() {
      return FM.TAKE_ALL;
   }

   @Override
   public void id_private() {
      Fb_1 var1 = this.id_native();
      if (var1.id_package() == this.id_implements()) {
         rJr_1 var2 = var1.G_();

         for (rJY var5 : var2.id_class(var0 -> !((cb_3)id_import.id_class[57]).sK().id_class(var0.id_class().id_break()))) {
            if (var5.id_break()) {
               ((Ax_1)id_import.id_class[55]).id_class(var2.id_case, var5.id_protected, 0, rXa_1.QUICK_MOVE, false);
            }
         }

         var1.id_class(null);
      }
   }
}
