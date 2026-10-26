package celestial;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.LoadingCache;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class rUE extends rUO<rUM> {
   private static final LoadingCache<Long, List<rUG>> id_class = CacheBuilder.newBuilder().expireAfterWrite(5L, TimeUnit.MINUTES).build(new rUb_1());

   public rUE(Codec<rUM> var1) {
      super(var1);
   }

   private void id_class(rRf_1 var1, Random var2, rUM var3, rUG var4) {
      int var5 = var4.id_byte();

      for (rfH_2 var7 : rfH_2.id_class(
         new rfH_2(var4.id_class() - var5, 0, var4.id_break() - var5), new rfH_2(var4.id_class() + var5, var4.id_protected() + 10, var4.id_break() + var5)
      )) {
         if (var7.id_class((double)var4.id_class(), (double)var7.c_(), (double)var4.id_break(), false) <= (double)(var5 * var5 + 1)
            && var7.c_() < var4.id_protected()) {
            this.id_class(var1, var7, xu_3.rg.id_continue());
         } else if (var7.c_() > 65) {
            this.id_class(var1, var7, xu_3.id_class.id_continue());
         }
      }

      if (var4.id_throws()) {
         byte var19 = -2;
         byte var21 = 2;
         byte var8 = 3;
         rfw_3 var9 = new rfw_3();

         for (int var10 = -2; var10 <= 2; var10++) {
            for (int var11 = -2; var11 <= 2; var11++) {
               for (int var12 = 0; var12 <= 3; var12++) {
                  boolean var13 = rfU_2.id_class(var10) == 2;
                  boolean var14 = rfU_2.id_class(var11) == 2;
                  boolean var15 = var12 == 3;
                  if (var13 || var14 || var15) {
                     boolean var16 = var10 == -2 || var10 == 2 || var15;
                     boolean var17 = var11 == -2 || var11 == 2 || var15;
                     xc_3 var18 = xu_3.Bf
                        .id_continue()
                        .id_class(kK_2.id_volatile, Boolean.valueOf(var16 && var11 != -2))
                        .id_class(kK_2.id_package, Boolean.valueOf(var16 && var11 != 2))
                        .id_class(kK_2.id_int, Boolean.valueOf(var17 && var10 != -2))
                        .id_class(kK_2.id_final, Boolean.valueOf(var17 && var10 != 2));
                     this.id_class(var1, var9.id_class(var4.id_class() + var10, var4.id_protected() + var12, var4.id_break() + var11), var18);
                  }
               }
            }
         }
      }

      rSa_1 var20 = aI_2.id_super.id_class(var1.id_byte());
      var20.id_class(var3.id_protected());
      var20.id_catch(var3.id_break());
      var20.id_class((double)var4.id_class() + 0.5, (double)(var4.id_protected() + 1), (double)var4.id_break() + 0.5, var2.nextFloat() * 360.0F, 0.0F);
      var1.a_(var20);
      this.id_class(var1, new rfH_2(var4.id_class(), var4.id_protected(), var4.id_break()), xu_3.id_while.id_continue());
   }

   public static List<rUG> id_class(rRI var0) {
      Random var1 = new Random(var0.id_break());
      long var2 = var1.nextLong() & 65535L;
      return (List<rUG>)id_class.getUnchecked(var2);
   }

   public boolean id_class(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rUM var5) {
      List var6 = var5.id_byte();
      if (var6.isEmpty()) {
         var6 = id_class(var1);
      }

      for (rUG var8 : var6) {
         if (var8.id_class(var4)) {
            this.id_class(var1, var3, var5, var8);
         }
      }

      return true;
   }
}
