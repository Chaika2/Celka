package celestial;

import java.util.Properties;

public class rrbT_2 {
   private rqO_2 class_;
   private int break_ = 0;
   private int byte_ = 2;
   private boolean protected_;
   private static final int throws_ = 2;
   private static final int case_ = 0;
   private static final int catch_ = 1;
   private static final int private_ = 2;

   public rrbT_2(rqO_2 var1, int var2, int var3, boolean var4) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
   }

   private static int class_(String var0) {
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
            rrbt_3.class_("Invalid scale mode: " + var0);
            return 0;
         }
      }
   }

   private static int class_(String var0, int var1) {
      if (var0 == null) {
         return var1;
      } else {
         var0 = var0.trim();
         int var2 = rrbb_3.class_(var0, -1);
         if (var2 < 1) {
            rrbt_3.class_("Invalid scale: " + var0);
            return var1;
         } else {
            return var2;
         }
      }
   }

   public void class_(int var1, int var2) {
      MT.catch_();
      MT.instanceof_();
      yb_3 var3 = yb_3.class_();
      lD_2 var4 = var3.byte_();
      rrbb_3.J().class_(this.class_);
      MT.protected_(1.0F, 1.0F, 1.0F, 1.0F);
      float var5 = (float)(16 * this.byte_);
      float var6 = (float)var1 / var5;
      float var7 = (float)var2 / var5;
      float var8 = 0.0F;
      float var9 = 0.0F;
      if (this.protected_) {
         var8 = (var5 - (float)var1) / (var5 * 2.0F);
         var9 = (var5 - (float)var2) / (var5 * 2.0F);
      }

      switch (this.break_) {
         case 1:
            var5 = (float)Math.max(var1, var2);
            var6 = (float)(this.byte_ * var1) / var5;
            var7 = (float)(this.byte_ * var2) / var5;
            if (this.protected_) {
               var8 = (float)this.byte_ * (var5 - (float)var1) / (var5 * 2.0F);
               var9 = (float)this.byte_ * (var5 - (float)var2) / (var5 * 2.0F);
            }
            break;
         case 2:
            var6 = (float)this.byte_;
            var7 = (float)this.byte_;
            var8 = 0.0F;
            var9 = 0.0F;
      }

      var4.class_(7, ju_3.public_);
      var4.class_(0.0, (double)var2, 0.0).class_(var8, var9 + var7).break_(255, 255, 255, 255).class_();
      var4.class_((double)var1, (double)var2, 0.0).class_(var8 + var6, var9 + var7).break_(255, 255, 255, 255).class_();
      var4.class_((double)var1, 0.0, 0.0).class_(var8 + var6, var9).break_(255, 255, 255, 255).class_();
      var4.class_(0.0, 0.0, 0.0).class_(var8, var9).break_(255, 255, 255, 255).class_();
      var3.break_();
   }

   public static rrbT_2 class_(String var0, int var1, Properties var2) {
      rqO_2 var3 = new rqO_2(var0);
      int var4 = class_(break_("scaleMode", var1, var2));
      int var5 = var4 == 0 ? 2 : 1;
      int var6 = class_(break_("scale", var1, var2), var5);
      boolean var7 = rrbb_3.class_(break_("center", var1, var2), false);
      return new rrbT_2(var3, var4, var6, var7);
   }

   private static String break_(String var0, int var1, Properties var2) {
      if (var2 == null) {
         return null;
      } else {
         String var3 = var2.getProperty("dim" + var1 + "." + var0);
         return var3 != null ? var3 : var2.getProperty(var0);
      }
   }
}
