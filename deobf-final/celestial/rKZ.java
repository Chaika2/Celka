package celestial;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Set;
import java.util.function.Predicate;

public class rKZ {
   static final Predicate<xc_3> class_ = var0 -> !var0.catch_();
   static final Predicate<xc_3> break_ = var0 -> var0.byte_().byte_();
   private final ryl_3 byte_ = new ryl_3(9, 256);
   private final Predicate<xc_3> protected_;
   private final roC_2 throws_;

   public rKZ(roC_2 var1, rKv_1 var2) {
      this.protected_ = var2.throws_();
      this.throws_ = var1;
   }

   public static void class_(roC_2 var0, Set<rKv_1> var1) {
      int var2 = var1.size();
      ObjectArrayList var3 = new ObjectArrayList(var2);
      ObjectListIterator var4 = var3.iterator();
      int var5 = var0.char_() + 16;
      rfw_3 var6 = new rfw_3();

      for (int var7 = 0; var7 < 16; var7++) {
         for (int var8 = 0; var8 < 16; var8++) {
            for (rKv_1 var10 : var1) {
               var3.add(var0.class_(var10));
            }

            for (int var12 = var5 - 1; var12 >= 0; var12--) {
               var6.class_(var7, var12, var8);
               xc_3 var13 = var0.byte_(var6);
               if (!var13.class_(xu_3.class_)) {
                  while (var4.hasNext()) {
                     rKZ var11 = (rKZ)var4.next();
                     if (var11.protected_.test(var13)) {
                        var11.class_(var7, var8, var12 + 1);
                        var4.remove();
                     }
                  }

                  if (var3.isEmpty()) {
                     break;
                  }

                  var4.back(var2);
               }
            }
         }
      }
   }

   public long[] class_() {
      return this.byte_.class_();
   }

   public void class_(long[] var1) {
      System.arraycopy(var1, 0, this.byte_.class_(), 0, var1.length);
   }

   public boolean class_(int var1, int var2, int var3, xc_3 var4) {
      int var5 = this.class_(var1, var3);
      if (var2 <= var5 - 2) {
         return false;
      } else {
         if (this.protected_.test(var4)) {
            if (var2 >= var5) {
               this.class_(var1, var3, var2 + 1);
               return true;
            }
         } else if (var5 - 1 == var2) {
            rfw_3 var6 = new rfw_3();

            for (int var7 = var2 - 1; var7 >= 0; var7--) {
               var6.class_(var1, var7, var3);
               if (this.protected_.test(this.throws_.byte_(var6))) {
                  this.class_(var1, var3, var7 + 1);
                  return true;
               }
            }

            this.class_(var1, var3, 0);
            return true;
         }

         return false;
      }
   }

   public int class_(int var1, int var2) {
      return this.class_(break_(var1, var2));
   }

   private void class_(int var1, int var2, int var3) {
      this.byte_.break_(break_(var1, var2), var3);
   }

   private int class_(int var1) {
      return this.byte_.class_(var1);
   }

   private static int break_(int var0, int var1) {
      return var0 + var1 * 16;
   }
}
