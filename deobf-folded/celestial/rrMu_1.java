package celestial;

public class rrMu_1 {
   public static boolean id_class(VF var0) {
      rgP_2 var1 = id_class(var0, 0.0);
      return var1 != null;
   }

   public static rgP_2 id_class(QF var0, double var1) {
      if (var0 == QF.id_int) {
         return var0.id_class(new rgn_3("options.chunks", (int)var1));
      } else if (var0 == QF.id_volatile) {
         if (var1 >= 4.0) {
            return var0.id_class(new rgn_3("of.general.max"));
         } else {
            return (rgP_2)(var1 == 0.0 ? cN_2.id_class(var0.id_class(), false) : var0.id_byte((int)var1));
         }
      } else if (var0 == QF.id_class) {
         int var4 = (int)var1 * 2 + 1;
         return var0.id_class(new rgn_3("options.biomeBlendRadius." + var4));
      } else {
         String var3 = id_break(var0, var1);
         return var3 != null ? new rgN_2(var3) : null;
      }
   }

   public static String id_break(QF var0, double var1) {
      String var3 = jI_2.id_class(var0.id_byte()) + ": ";
      if (var0 == QF.d) {
         return var1 == 0.0 ? var3 + jI_2.id_class("options.off") : var3 + (int)(var1 * 100.0) + "%";
      } else if (var0 == QF.s) {
         int var7 = (int)var1;
         switch (var7) {
            case 0:
               return var3 + rrba_3.id_class("of.options.mipmap.nearest");
            case 1:
               return var3 + rrba_3.id_class("of.options.mipmap.linear");
            case 2:
               return var3 + rrba_3.id_class("of.options.mipmap.bilinear");
            case 3:
               return var3 + rrba_3.id_class("of.options.mipmap.trilinear");
            default:
               return var3 + "of.options.mipmap.nearest";
         }
      } else if (var0 == QF.rr) {
         int var6 = (int)var1;
         String var5 = "";
         if (var6 != rrbb_3.q()) {
            var5 = " (" + rrba_3.id_class("of.general.restart") + ")";
         }

         return var6 == 0 ? var3 + rrba_3.id_byte() + var5 : var3 + var6 + var5;
      } else if (var0 == QF.rP) {
         int var4 = (int)var1;
         return var4 == 1 ? var3 + rrba_3.id_byte() : var3 + var4;
      } else {
         return null;
      }
   }
}
