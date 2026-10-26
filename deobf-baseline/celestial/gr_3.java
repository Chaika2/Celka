package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Locale;

public class gr_3 {
   private static gr_3 id_class;
   private final int id_break;
   private final int id_byte;
   private final int id_protected;
   private final int id_throws;
   private final int id_case;
   private final boolean id_catch;
   private final boolean id_private;

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
      this.id_catch = var1;
      this.id_break = var3;
      this.id_protected = var4;
      this.id_byte = var5;
      this.id_throws = var6;
      this.id_private = var2;
      this.id_case = var7;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof gr_3 var2)) {
         return false;
      } else if (this.id_case != var2.id_case) {
         return false;
      } else if (this.id_throws != var2.id_throws) {
         return false;
      } else if (this.id_protected != var2.id_protected) {
         return false;
      } else if (this.id_private != var2.id_private) {
         return false;
      } else if (this.id_catch != var2.id_catch) {
         return false;
      } else {
         return this.id_byte != var2.id_byte ? false : this.id_break == var2.id_break;
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.id_break;
      var1 = 31 * var1 + this.id_byte;
      var1 = 31 * var1 + this.id_protected;
      var1 = 31 * var1 + this.id_throws;
      var1 = 31 * var1 + this.id_case;
      var1 = 31 * var1 + (this.id_catch ? 1 : 0);
      return 31 * var1 + (this.id_private ? 1 : 0);
   }

   public static int id_class(String var0) {
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

   public void id_class() {
      if (!this.equals(id_class)) {
         if (id_class == null || this.id_private != id_class.id_break()) {
            id_class = this;
            if (this.id_private) {
               RenderSystem.disableBlend();
               return;
            }

            RenderSystem.enableBlend();
         }

         RenderSystem.blendEquation(this.id_case);
         if (this.id_catch) {
            RenderSystem.blendFuncSeparate(this.id_break, this.id_protected, this.id_byte, this.id_throws);
         } else {
            RenderSystem.blendFunc(this.id_break, this.id_protected);
         }
      }
   }

   public static int id_break(String var0) {
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

   public boolean id_break() {
      return this.id_private;
   }
}
