package celestial;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Map;

public class rrxd_3 {
   public static final int id_class = 63;
   public static final rpr_3[][] id_break = id_class(false);
   public static final rpr_3[][] id_byte = id_class(true);
   private static int id_protected = 0;
   private static int id_throws = -1;
   private static int id_case = 16;
   private static rYB id_catch = null;
   private static int id_private = Integer.MIN_VALUE;
   private static int id_implements = Integer.MIN_VALUE;

   private static rpr_3[][] id_class(boolean var0) {
      byte var1 = 64;
      rpr_3[][] var2 = new rpr_3[var1][];

      for (int var3 = 0; var3 < var1; var3++) {
         ArrayList var4 = new ArrayList();

         for (int var5 = 0; var5 < rpr_3.VALUES.length; var5++) {
            rpr_3 var6 = rpr_3.VALUES[var5];
            rpr_3 var7 = var0 ? var6.id_case() : var6;
            int var8 = 1 << var7.ordinal();
            if ((var3 & var8) != 0) {
               var4.add(var6);
            }
         }

         rpr_3[] var9 = var4.toArray(new rpr_3[var4.size()]);
         var2[var3] = var9;
      }

      return var2;
   }

   public static rpr_3[] id_class(int var0) {
      int var1 = ~var0 & 63;
      return id_byte[var1];
   }

   public static int id_class(rYB var0, an_3 var1, int var2) {
      int var3 = rfU_2.id_byte(var1.rx()) >> 4;
      int var4 = rfU_2.id_byte(var1.re()) >> 4;
      int var5 = rfU_2.id_byte(var1.BO()) >> 4;
      var4 = rrbb_3.id_class(var4, 0, 15);
      roJ_2 var6 = var0.id_throws(var3, var5);
      int var7 = var3 - var2;
      int var8 = var3 + var2;
      int var9 = var5 - var2;
      int var10 = var5 + var2;
      if (var0 != id_catch || var3 != id_private || var5 != id_implements) {
         id_protected = 0;
         id_case = 16;
         id_catch = var0;
         id_private = var3;
         id_implements = var5;
      }

      if (id_protected == 0) {
         id_throws = -1;
      }

      int var11 = id_throws;
      switch (id_protected) {
         case 0:
            var8 = var3;
            var10 = var5;
            break;
         case 1:
            var7 = var3;
            var10 = var5;
            break;
         case 2:
            var8 = var3;
            var9 = var5;
            break;
         case 3:
            var7 = var3;
            var9 = var5;
      }

      for (int var12 = var7; var12 < var8; var12++) {
         for (int var13 = var9; var13 < var10; var13++) {
            roJ_2 var14 = var0.id_throws(var12, var13);
            if (!var14.id_catch()) {
               roQ_2[] var15 = var14.id_byte();

               for (int var16 = var15.length - 1; var16 > var11; var16--) {
                  roQ_2 var17 = var15[var16];
                  if (var17 != null && !var17.id_byte()) {
                     if (var16 > var11) {
                        var11 = var16;
                     }
                     break;
                  }
               }

               try {
                  Map var22 = var14.id_volatile();
                  if (!var22.isEmpty()) {
                     for (rfH_2 var18 : var22.keySet()) {
                        int var19 = var18.c_() >> 4;
                        if (var19 > var11) {
                           var11 = var19;
                        }
                     }
                  }
               } catch (ConcurrentModificationException var20) {
               }

               ryI_2[] var23 = var14.id_final();

               for (int var25 = var23.length - 1; var25 > var11; var25--) {
                  ryI_2 var26 = var23[var25];
                  if (!var26.isEmpty() && (var14 != var6 || var25 != var4 || var26.size() != 1)) {
                     if (var25 > var11) {
                        var11 = var25;
                     }
                     break;
                  }
               }
            }
         }
      }

      if (id_protected < 3) {
         id_throws = var11;
         var11 = id_case;
      } else {
         id_case = var11;
         id_throws = -1;
      }

      id_protected = (id_protected + 1) % 4;
      return var11 << 4;
   }

   public static boolean id_class() {
      return id_protected == 0;
   }

   public static void id_break() {
      id_catch = null;
   }
}
