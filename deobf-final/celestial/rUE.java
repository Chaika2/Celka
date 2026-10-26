package celestial;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.LoadingCache;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class rUE extends rUO<rUM> {
   private static final LoadingCache<Long, List<rUG>> class_ = CacheBuilder.newBuilder().expireAfterWrite(5L, TimeUnit.MINUTES).build(new rUb_1());

   public rUE(Codec<rUM> var1) {
      super(var1);
   }

   private void class_(rRf_1 var1, Random var2, rUM var3, rUG var4) {
      int var5 = var4.byte_();

      for (rfH_2 var7 : rfH_2.class_(
         new rfH_2(var4.class_() - var5, 0, var4.break_() - var5), new rfH_2(var4.class_() + var5, var4.protected_() + 10, var4.break_() + var5)
      )) {
         if (var7.class_((double)var4.class_(), (double)var7.c_(), (double)var4.break_(), false) <= (double)(var5 * var5 + 1) && var7.c_() < var4.protected_()) {
            this.class_(var1, var7, xu_3.rg.continue_());
         } else if (var7.c_() > 65) {
            this.class_(var1, var7, xu_3.class_.continue_());
         }
      }

      if (var4.throws_()) {
         byte var19 = -2;
         byte var21 = 2;
         byte var8 = 3;
         rfw_3 var9 = new rfw_3();

         for (int var10 = -2; var10 <= 2; var10++) {
            for (int var11 = -2; var11 <= 2; var11++) {
               for (int var12 = 0; var12 <= 3; var12++) {
                  boolean var13 = rfU_2.class_(var10) == 2;
                  boolean var14 = rfU_2.class_(var11) == 2;
                  boolean var15 = var12 == 3;
                  if (var13 || var14 || var15) {
                     boolean var16 = var10 == -2 || var10 == 2 || var15;
                     boolean var17 = var11 == -2 || var11 == 2 || var15;
                     xc_3 var18 = xu_3.Bf
                        .continue_()
                        .class_(kK_2.volatile_, Boolean.valueOf(var16 && var11 != -2))
                        .class_(kK_2.package_, Boolean.valueOf(var16 && var11 != 2))
                        .class_(kK_2.int_, Boolean.valueOf(var17 && var10 != -2))
                        .class_(kK_2.final_, Boolean.valueOf(var17 && var10 != 2));
                     this.class_(var1, var9.class_(var4.class_() + var10, var4.protected_() + var12, var4.break_() + var11), var18);
                  }
               }
            }
         }
      }

      rSa_1 var20 = aI_2.super_.class_(var1.byte_());
      var20.class_(var3.protected_());
      var20.catch_(var3.break_());
      var20.class_((double)var4.class_() + 0.5, (double)(var4.protected_() + 1), (double)var4.break_() + 0.5, var2.nextFloat() * 360.0F, 0.0F);
      var1.a_(var20);
      this.class_(var1, new rfH_2(var4.class_(), var4.protected_(), var4.break_()), xu_3.while_.continue_());
   }

   public static List<rUG> class_(rRI var0) {
      Random var1 = new Random(var0.break_());
      long var2 = var1.nextLong() & 65535L;
      return (List<rUG>)class_.getUnchecked(var2);
   }

   public boolean class_(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rUM var5) {
      List var6 = var5.byte_();
      if (var6.isEmpty()) {
         var6 = class_(var1);
      }

      for (rUG var8 : var6) {
         if (var8.class_(var4)) {
            this.class_(var1, var3, var5, var8);
         }
      }

      return true;
   }
}
