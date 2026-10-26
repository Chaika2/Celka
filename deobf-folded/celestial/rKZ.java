package celestial;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Set;
import java.util.function.Predicate;

public class rKZ {
   static final Predicate<xc_3> id_class = var0 -> !var0.id_catch();
   static final Predicate<xc_3> id_break = var0 -> var0.id_byte().id_byte();
   private final ryl_3 id_byte = new ryl_3(9, 256);
   private final Predicate<xc_3> id_protected;
   private final roC_2 id_throws;

   public rKZ(roC_2 var1, rKv_1 var2) {
      this.id_protected = var2.id_throws();
      this.id_throws = var1;
   }

   public static void id_class(roC_2 var0, Set<rKv_1> var1) {
      int var2 = var1.size();
      ObjectArrayList var3 = new ObjectArrayList(var2);
      ObjectListIterator var4 = var3.iterator();
      int var5 = var0.id_char() + 16;
      rfw_3 var6 = new rfw_3();

      for (int var7 = 0; var7 < 16; var7++) {
         for (int var8 = 0; var8 < 16; var8++) {
            for (rKv_1 var10 : var1) {
               var3.add(var0.id_class(var10));
            }

            for (int var12 = var5 - 1; var12 >= 0; var12--) {
               var6.id_class(var7, var12, var8);
               xc_3 var13 = var0.id_byte(var6);
               if (!var13.id_class(xu_3.id_class)) {
                  while (var4.hasNext()) {
                     rKZ var11 = (rKZ)var4.next();
                     if (var11.id_protected.test(var13)) {
                        var11.id_class(var7, var8, var12 + 1);
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

   public long[] id_class() {
      return this.id_byte.id_class();
   }

   public void id_class(long[] var1) {
      System.arraycopy(var1, 0, this.id_byte.id_class(), 0, var1.length);
   }

   public boolean id_class(int var1, int var2, int var3, xc_3 var4) {
      int var5 = this.id_class(var1, var3);
      if (var2 <= var5 - 2) {
         return false;
      } else {
         if (this.id_protected.test(var4)) {
            if (var2 >= var5) {
               this.id_class(var1, var3, var2 + 1);
               return true;
            }
         } else if (var5 - 1 == var2) {
            rfw_3 var6 = new rfw_3();

            for (int var7 = var2 - 1; var7 >= 0; var7--) {
               var6.id_class(var1, var7, var3);
               if (this.id_protected.test(this.id_throws.id_byte(var6))) {
                  this.id_class(var1, var3, var7 + 1);
                  return true;
               }
            }

            this.id_class(var1, var3, 0);
            return true;
         }

         return false;
      }
   }

   public int id_class(int var1, int var2) {
      return this.id_class(id_break(var1, var2));
   }

   private void id_class(int var1, int var2, int var3) {
      this.id_byte.id_break(id_break(var1, var2), var3);
   }

   private int id_class(int var1) {
      return this.id_byte.id_class(var1);
   }

   private static int id_break(int var0, int var1) {
      return var0 + var1 * 16;
   }
}
