package celestial;

import java.util.List;

public class Fj_1 extends FI {
   public Fj_1(Fb_1<?> var1, int var2, int var3, int var4, int var5, LL var6) {
      super(var1, var2, var3, var4, var5, new rgn_3("container.action.put_all"), var6);
   }

   @Override
   public boolean id_extends() {
      rJr_1 var1 = this.id_native().G_();
      List var2 = var1.id_class(null);

      for (int var3 = var2.size(); var3 < var1.id_throws.size(); var3++) {
         rJY var4 = var1.id_throws.get(var3);
         if (var4.id_break()) {
            return true;
         }
      }

      return false;
   }

   @Override
   public FM id_implements() {
      return FM.PUT_ALL;
   }

   @Override
   public void id_private() {
      Fb_1 var1 = this.id_native();
      if (var1.id_package() == this.id_implements()) {
         rJr_1 var2 = var1.G_();
         List var3 = var2.id_class(null);

         for (int var4 = var3.size(); var4 < var2.id_throws.size(); var4++) {
            rJY var5 = var2.id_throws.get(var4);
            if (var5.id_break() && var5.id_class(var5.id_class())) {
               ((Ax_1)id_import.id_class[55]).id_class(var2.id_case, var5.id_protected, 0, rXa_1.QUICK_MOVE, false);
            }
         }

         var1.id_class(null);
      }
   }
}
