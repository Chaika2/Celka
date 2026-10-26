package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Locale;

public class gr_3 {
   private static gr_3 class_;
   private final int break_;
   private final int byte_;
   private final int protected_;
   private final int throws_;
   private final int case_;
   private final boolean catch_;
   private final boolean private_;

   public gr_3(int var1, int var2, int var3, int var4, int var5) {
      this(true, false, var1, var2, var3, var4, var5);
   }

   public gr_3(int var1, int var2, int var3) {
      this(false, false, var1, var2, var1, var2, var3);
   }

   public gr_3() {
      this(false, true, 1, 0, 1, 0, 32774);
   }

   private gr_3(boolean var1, boolean var2, int var3, int var4, int var5, int var6, int var7) {
      this.catch_ = var1;
      this.break_ = var3;
      this.protected_ = var4;
      this.byte_ = var5;
      this.throws_ = var6;
      this.private_ = var2;
      this.case_ = var7;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof gr_3 var2)) {
         return false;
      } else if (this.case_ != var2.case_) {
         return false;
      } else if (this.throws_ != var2.throws_) {
         return false;
      } else if (this.protected_ != var2.protected_) {
         return false;
      } else if (this.private_ != var2.private_) {
         return false;
      } else if (this.catch_ != var2.catch_) {
         return false;
      } else {
         return this.byte_ != var2.byte_ ? false : this.break_ == var2.break_;
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.break_;
      var1 = 31 * var1 + this.byte_;
      var1 = 31 * var1 + this.protected_;
      var1 = 31 * var1 + this.throws_;
      var1 = 31 * var1 + this.case_;
      var1 = 31 * var1 + (this.catch_ ? 1 : 0);
      return 31 * var1 + (this.private_ ? 1 : 0);
   }

   public static int class_(String var0) {
      String var1 = var0.trim().toLowerCase(Locale.ROOT);
      if ("add".equals(var1)) {
         return 32774;
      } else if ("subtract".equals(var1)) {
         return 32778;
      } else if ("reversesubtract".equals(var1)) {
         return 32779;
      } else if ("reverse_subtract".equals(var1)) {
         return 32779;
      } else if ("min".equals(var1)) {
         return 32775;
      } else {
         return "max".equals(var1) ? 32776 : 32774;
      }
   }

   public void class_() {
      if (!this.equals(class_)) {
         if (class_ == null || this.private_ != class_.break_()) {
            class_ = this;
            if (this.private_) {
               RenderSystem.disableBlend();
               return;
            }

            RenderSystem.enableBlend();
         }

         RenderSystem.blendEquation(this.case_);
         if (this.catch_) {
            RenderSystem.blendFuncSeparate(this.break_, this.protected_, this.byte_, this.throws_);
         } else {
            RenderSystem.blendFunc(this.break_, this.protected_);
         }
      }
   }

   public static int break_(String var0) {
      String var1 = var0.trim().toLowerCase(Locale.ROOT);
      var1 = var1.replaceAll("_", "");
      var1 = var1.replaceAll("one", "1");
      var1 = var1.replaceAll("zero", "0");
      var1 = var1.replaceAll("minus", "-");
      if ("0".equals(var1)) {
         return 0;
      } else if ("1".equals(var1)) {
         return 1;
      } else if ("srccolor".equals(var1)) {
         return 768;
      } else if ("1-srccolor".equals(var1)) {
         return 769;
      } else if ("dstcolor".equals(var1)) {
         return 774;
      } else if ("1-dstcolor".equals(var1)) {
         return 775;
      } else if ("srcalpha".equals(var1)) {
         return 770;
      } else if ("1-srcalpha".equals(var1)) {
         return 771;
      } else if ("dstalpha".equals(var1)) {
         return 772;
      } else {
         return "1-dstalpha".equals(var1) ? 773 : -1;
      }
   }

   public boolean break_() {
      return this.private_;
   }
}
