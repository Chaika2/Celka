package celestial;

import java.util.Optional;

public class rgL_2 {
   private static final Optional<Object> id_class = Optional.of(rqg_3.INSTANCE);

   public static boolean id_byte(String var0, rgc_3 var1, rpv_3 var2) {
      return id_class(var0, 0, var1, var2);
   }

   private static boolean id_class(rgc_3 var0, rpv_3 var1, int var2, char var3) {
      return Character.isSurrogate(var3) ? var1.accept(var2, var0, 65533) : var1.accept(var2, var0, var3);
   }

   public static boolean id_class(rgS_2 var0, rgc_3 var1, rpv_3 var2) {
      return !var0.id_class((var1x, var2x) -> id_class(var2x, 0, var1x, var2) ? Optional.empty() : id_class, var1).isPresent();
   }

   public static String id_class(rgS_2 var0) {
      StringBuilder var1 = new StringBuilder();
      id_class(var0, rgc_3.id_class, (var1x, var2, var3) -> {
         var1.appendCodePoint(var3);
         return true;
      });
      return var1.toString();
   }

   public static String id_class(String var0) {
      StringBuilder var1 = new StringBuilder();
      id_class(var0, rgc_3.id_class, (var1x, var2, var3) -> {
         var1.appendCodePoint(var3);
         return true;
      });
      return var1.toString();
   }

   public static boolean id_class(String var0, rgc_3 var1, rpv_3 var2) {
      int var3 = var0.length();

      for (int var4 = 0; var4 < var3; var4++) {
         char var5 = var0.charAt(var4);
         if (Character.isHighSurrogate(var5)) {
            if (var4 + 1 >= var3) {
               if (!var2.accept(var4, var1, 65533)) {
                  return false;
               }
               break;
            }

            char var6 = var0.charAt(var4 + 1);
            if (Character.isLowSurrogate(var6)) {
               if (!var2.accept(var4, var1, Character.toCodePoint(var5, var6))) {
                  return false;
               }

               var4++;
            } else if (!var2.accept(var4, var1, 65533)) {
               return false;
            }
         } else if (!id_class(var1, var2, var4, var5)) {
            return false;
         }
      }

      return true;
   }

   public static boolean id_class(String var0, int var1, rgc_3 var2, rpv_3 var3) {
      return id_class(var0, var1, var2, var2, var3);
   }

   public static boolean id_class(String var0, int var1, rgc_3 var2, rgc_3 var3, rpv_3 var4) {
      int var5 = var0.length();
      rgc_3 var6 = var2;

      for (int var7 = var1; var7 < var5; var7++) {
         char var8 = var0.charAt(var7);
         if (var8 == 167) {
            if (var7 + 1 >= var5) {
               break;
            }

            char var9 = var0.charAt(var7 + 1);
            rgF_2 var10 = rgF_2.id_class(var9);
            if (var10 != null) {
               var6 = var10 == rgF_2.RESET ? var3 : var6.id_byte(var10);
            }

            var7++;
         } else if (Character.isHighSurrogate(var8)) {
            if (var7 + 1 >= var5) {
               if (!var4.accept(var7, var6, 65533)) {
                  return false;
               }
               break;
            }

            char var11 = var0.charAt(var7 + 1);
            if (Character.isLowSurrogate(var11)) {
               if (!var4.accept(var7, var6, Character.toCodePoint(var8, var11))) {
                  return false;
               }

               var7++;
            } else if (!var4.accept(var7, var6, 65533)) {
               return false;
            }
         } else if (!id_class(var6, var4, var7, var8)) {
            return false;
         }
      }

      return true;
   }

   public static boolean id_break(String var0, rgc_3 var1, rpv_3 var2) {
      int var3 = var0.length();

      for (int var4 = var3 - 1; var4 >= 0; var4--) {
         char var5 = var0.charAt(var4);
         if (Character.isLowSurrogate(var5)) {
            if (var4 - 1 < 0) {
               if (!var2.accept(0, var1, 65533)) {
                  return false;
               }
               break;
            }

            char var6 = var0.charAt(var4 - 1);
            if (Character.isHighSurrogate(var6)) {
               if (!var2.accept(--var4, var1, Character.toCodePoint(var6, var5))) {
                  return false;
               }
            } else if (!var2.accept(var4, var1, 65533)) {
               return false;
            }
         } else if (!id_class(var1, var2, var4, var5)) {
            return false;
         }
      }

      return true;
   }
}
