package celestial;

import java.util.Properties;

public class rrbT_2 {
   private rqO_2 id_class;
   private int id_break = 0;
   private int id_byte = 2;
   private boolean id_protected;
   private static final int id_throws = 2;
   private static final int id_case = 0;
   private static final int id_catch = 1;
   private static final int id_private = 2;

   public rrbT_2(rqO_2 var1, int var2, int var3, boolean var4) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
   }

   private static int id_class(String var0) {
      if (var0 == null) {
         return 0;
      } else {
         var0 = var0.toLowerCase().trim();
         if (var0.equals("fixed")) {
            return 0;
         } else if (var0.equals("full")) {
            return 1;
         } else if (var0.equals("stretch")) {
            return 2;
         } else {
            rrbt_3.id_class("Invalid scale mode: " + var0);
            return 0;
         }
      }
   }

   private static int id_class(String var0, int var1) {
      if (var0 == null) {
         return var1;
      } else {
         var0 = var0.trim();
         int var2 = rrbb_3.id_class(var0, -1);
         if (var2 < 1) {
            rrbt_3.id_class("Invalid scale: " + var0);
            return var1;
         } else {
            return var2;
         }
      }
   }

   public void id_class(int var1, int var2) {
      MT.id_catch();
      MT.id_instanceof();
      yb_3 var3 = yb_3.id_class();
      lD_2 var4 = var3.id_byte();
      rrbb_3.J().id_class(this.id_class);
      MT.id_protected(1.0F, 1.0F, 1.0F, 1.0F);
      float var5 = (float)(16 * this.id_byte);
      float var6 = (float)var1 / var5;
      float var7 = (float)var2 / var5;
      float var8 = 0.0F;
      float var9 = 0.0F;
      if (this.id_protected) {
         var8 = (var5 - (float)var1) / (var5 * 2.0F);
         var9 = (var5 - (float)var2) / (var5 * 2.0F);
      }

      switch (this.id_break) {
         case 1:
            var5 = (float)Math.max(var1, var2);
            var6 = (float)(this.id_byte * var1) / var5;
            var7 = (float)(this.id_byte * var2) / var5;
            if (this.id_protected) {
               var8 = (float)this.id_byte * (var5 - (float)var1) / (var5 * 2.0F);
               var9 = (float)this.id_byte * (var5 - (float)var2) / (var5 * 2.0F);
            }
            break;
         case 2:
            var6 = (float)this.id_byte;
            var7 = (float)this.id_byte;
            var8 = 0.0F;
            var9 = 0.0F;
      }

      var4.id_class(7, ju_3.id_public);
      var4.id_class(0.0, (double)var2, 0.0).id_class(var8, var9 + var7).id_break(255, 255, 255, 255).id_class();
      var4.id_class((double)var1, (double)var2, 0.0).id_class(var8 + var6, var9 + var7).id_break(255, 255, 255, 255).id_class();
      var4.id_class((double)var1, 0.0, 0.0).id_class(var8 + var6, var9).id_break(255, 255, 255, 255).id_class();
      var4.id_class(0.0, 0.0, 0.0).id_class(var8, var9).id_break(255, 255, 255, 255).id_class();
      var3.id_break();
   }

   public static rrbT_2 id_class(String var0, int var1, Properties var2) {
      rqO_2 var3 = new rqO_2(var0);
      int var4 = id_class(id_break("scaleMode", var1, var2));
      int var5 = var4 == 0 ? 2 : 1;
      int var6 = id_class(id_break("scale", var1, var2), var5);
      boolean var7 = rrbb_3.id_class(id_break("center", var1, var2), false);
      return new rrbT_2(var3, var4, var6, var7);
   }

   private static String id_break(String var0, int var1, Properties var2) {
      if (var2 == null) {
         return null;
      } else {
         String var3 = var2.getProperty("dim" + var1 + "." + var0);
         return var3 != null ? var3 : var2.getProperty(var0);
      }
   }
}
