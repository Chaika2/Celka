package celestial;

import java.awt.Rectangle;

public class rrJx_1 implements rrJJ {
   private String[] id_class(rrdy_1 var1) {
      return rrJd_1.id_class(var1.id_class());
   }

   @Override
   public String[] id_class(LZ var1, int var2) {
      if (var1 instanceof rrkM) {
         return rrJd_1.id_class("of.options.shaders.DOWNLOAD");
      } else if (!(var1 instanceof rrkO var3)) {
         return null;
      } else {
         rrdy_1 var4 = var3.id_private();
         return this.id_class(var4);
      }
   }

   @Override
   public boolean id_class() {
      return true;
   }

   @Override
   public Rectangle id_class(vm_3 var1, int var2, int var3) {
      int var4 = var1.id_package - 450;
      byte var5 = 35;
      if (var4 < 10) {
         var4 = 10;
      }

      if (var3 <= var5 + 94) {
         var5 += 100;
      }

      int var6 = var4 + 150 + 150;
      int var7 = var5 + 84 + 10;
      return new Rectangle(var4, var5, var6 - var4, var7 - var5);
   }
}
