package celestial;

import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.stream.Stream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class rrEj_1 {
   private static final Logger class_ = LogManager.getLogger();
   static final int break_ = (int)Math.pow(17.0, 2.0);
   private static final aH_2[] byte_ = Stream.of(aH_2.values()).filter(var0 -> var0 != aH_2.MISC).toArray(aH_2[]::new);

   private static rfH_2 class_(rRR var0, aI_2<?> var1, int var2, int var3) {
      int var4 = var0.class_(aq_3.break_(var1), var2, var3);
      rfw_3 var5 = new rfw_3(var2, var4, var3);
      if (var0.default_().byte_()) {
         do {
            var5.class_(rpr_3.DOWN);
         } while (!var0.byte_(var5).catch_());

         do {
            var5.class_(rpr_3.DOWN);
         } while (var0.byte_(var5).catch_() && var5.c_() > 0);
      }

      if (aq_3.class_(var1) == aw_3.ON_GROUND) {
         rfH_2 var6 = var5.break_();
         if (var0.byte_(var6).class_(var0, var6, rLT.LAND)) {
            return var6;
         }
      }

      return var5.int_();
   }

   public static void class_(rRf_1 var0, rYG var1, int var2, int var3, Random var4) {
      rYt_1 var5 = var1.break_();
      List var6 = var5.class_(aH_2.CREATURE);
      if (!var6.isEmpty()) {
         int var7 = var2 << 4;
         int var8 = var3 << 4;

         while (var4.nextFloat() < var5.class_()) {
            rYf_1 var9 = rTE.class_(var4, var6);
            int var10 = var9.protected_ + var4.nextInt(1 + var9.throws_ - var9.protected_);
            aU_2 var11 = null;
            int var12 = var7 + var4.nextInt(16);
            int var13 = var8 + var4.nextInt(16);
            int var14 = var12;
            int var15 = var13;

            for (int var16 = 0; var16 < var10; var16++) {
               boolean var17 = false;

               for (int var18 = 0; !var17 && var18 < 4; var18++) {
                  rfH_2 var19 = class_(var0, var9.break_, var12, var13);
                  if (var9.break_.break_() && class_(aq_3.class_(var9.break_), var0, var19, var9.break_)) {
                     float var20 = var9.break_.extends_();
                     double var21 = rfU_2.class_((double)var12, (double)var7 + (double)var20, (double)var7 + 16.0 - (double)var20);
                     double var23 = rfU_2.class_((double)var13, (double)var8 + (double)var20, (double)var8 + 16.0 - (double)var20);
                     if (!var0.break_(var9.break_.class_(var21, (double)var19.c_(), var23))
                        || !aq_3.class_(var9.break_, var0, iO_2.CHUNK_GENERATION, new rfH_2(var21, (double)var19.c_(), var23), var0.long_())) {
                        continue;
                     }

                     an_3 var25;
                     try {
                        var25 = var9.break_.class_(var0.byte_());
                     } catch (Exception var27) {
                        class_.warn("Failed to create mob", var27);
                        continue;
                     }

                     var25.class_(var21, (double)var19.c_(), var23, var4.nextFloat() * 360.0F, 0.0F);
                     if (var25 instanceof is_3 var26 && var26.class_(var0, iO_2.CHUNK_GENERATION) && var26.class_(var0)) {
                        var11 = var26.class_(var0, var0.throws_(var26.Bs()), iO_2.CHUNK_GENERATION, var11, (rcd_3)null);
                        var0.class_(var26);
                        var17 = true;
                     }
                  }

                  var12 += var4.nextInt(5) - var4.nextInt(5);

                  for (var13 += var4.nextInt(5) - var4.nextInt(5);
                     var12 < var7 || var12 >= var7 + 16 || var13 < var8 || var13 >= var8 + 16;
                     var13 = var15 + var4.nextInt(5) - var4.nextInt(5)
                  ) {
                     var12 = var14 + var4.nextInt(5) - var4.nextInt(5);
                  }
               }
            }
         }
      }
   }

   public static boolean class_(aw_3 var0, rRR var1, rfH_2 var2, aI_2<?> var3) {
      if (var0 == aw_3.NO_RESTRICTIONS) {
         return true;
      } else if (var3 != null && var1.instanceof_().class_(var2)) {
         xc_3 var4 = var1.byte_(var2);
         rXE var5 = var1.break_(var2);
         rfH_2 var6 = var2.final_();
         rfH_2 var7 = var2.break_();
         switch (var0) {
            case IN_WATER:
               return var5.class_(rlG_2.break_) && var1.break_(var7).class_(rlG_2.break_) && !var1.byte_(var6).catch_(var1, var6);
            case IN_LAVA:
               return var5.class_(rlG_2.byte_);
            case ON_GROUND:
            default:
               xc_3 var8 = var1.byte_(var7);
               return !var8.class_(var1, var7, var3)
                  ? false
                  : class_(var1, var2, var4, var5, var3) && class_(var1, var6, var1.byte_(var6), var1.break_(var6), var3);
         }
      } else {
         return false;
      }
   }

   public static boolean class_(rRq_1 var0, rfH_2 var1, xc_3 var2, rXE var3, aI_2<?> var4) {
      if (var2.new_(var0, var1)) {
         return false;
      } else if (var2.implements_()) {
         return false;
      } else if (!var3.byte_()) {
         return false;
      } else {
         return var2.class_(rls_3.y) ? false : !var4.class_(var2);
      }
   }

   private static rfH_2 class_(rYB var0, roJ_2 var1) {
      rfj_3 var2 = var1.private_();
      int var3 = var2.break_() + var0.int_.nextInt(16);
      int var4 = var2.byte_() + var0.int_.nextInt(16);
      int var5 = var1.class_(rKv_1.WORLD_SURFACE, var3, var4) + 1;
      int var6 = var0.int_.nextInt(var5 + 1);
      return new rfH_2(var3, var6, var4);
   }

   private static List<rYf_1> class_(rrEm_1 var0, rrrA var1, rKd_1 var2, aH_2 var3, rfH_2 var4, rYG var5) {
      return var3 == aH_2.MONSTER && var0.byte_(var4.break_()).break_() == xu_3.SP && var1.class_(var4, false, rrrZ.final_).throws_()
         ? rrrZ.final_.byte_()
         : var2.class_(var5 != null ? var5 : var0.implements_(var4), var1, var3, var4);
   }

   private static boolean class_(rrEm_1 var0, aH_2 var1, rrrA var2, rKd_1 var3, rYf_1 var4, rfw_3 var5, double var6) {
      aI_2 var8 = var4.break_;
      if (var8.throws_() == aH_2.MISC) {
         return false;
      } else if (!var8.protected_() && var6 > (double)(var8.throws_().case_() * var8.throws_().case_())) {
         return false;
      } else if (var8.break_() && class_(var0, var2, var3, var1, var4, var5)) {
         aw_3 var9 = aq_3.class_(var8);
         if (!class_(var9, var0, var5, var8)) {
            return false;
         } else {
            return !aq_3.class_(var8, var0, iO_2.NATURAL, var5, var0.int_)
               ? false
               : var0.break_(var8.class_((double)var5.b_() + 0.5, (double)var5.c_(), (double)var5.d_() + 0.5));
         }
      } else {
         return false;
      }
   }

   private static boolean class_(rrEm_1 var0, roC_2 var1, rfw_3 var2, double var3) {
      if (var3 <= 576.0) {
         return false;
      } else if (var0.X().class_(new rjU_2((double)var2.b_() + 0.5, (double)var2.c_(), (double)var2.d_() + 0.5), 24.0)) {
         return false;
      } else {
         rfj_3 var5 = new rfj_3(var2);
         return Objects.equals(var5, var1.private_()) || var0.else_().class_(var5);
      }
   }

   public static void class_(aH_2 var0, rrEm_1 var1, roC_2 var2, rfH_2 var3, rrER var4, rrEo_1 var5) {
      rrrA var6 = var1.protected_();
      rKd_1 var7 = var1.else_().implements_();
      int var8 = var3.c_();
      xc_3 var9 = var2.byte_(var3);
      if (!var9.catch_(var2, var3)) {
         rfw_3 var10 = new rfw_3();
         int var11 = 0;

         for (int var12 = 0; var12 < 3; var12++) {
            int var13 = var3.b_();
            int var14 = var3.d_();
            byte var15 = 6;
            rYf_1 var16 = null;
            aU_2 var17 = null;
            int var18 = rfU_2.case_(var1.int_.nextFloat() * 4.0F);
            int var19 = 0;

            for (int var20 = 0; var20 < var18; var20++) {
               var13 += var1.int_.nextInt(6) - var1.int_.nextInt(6);
               var14 += var1.int_.nextInt(6) - var1.int_.nextInt(6);
               var10.class_(var13, var8, var14);
               double var21 = (double)var13 + 0.5;
               double var23 = (double)var14 + 0.5;
               rhd_3 var25 = var1.class_(var21, (double)var8, var23, -1.0, false);
               if (var25 != null) {
                  double var26 = var25.class_(var21, (double)var8, var23);
                  if (class_(var1, var2, var10, var26)) {
                     if (var16 == null) {
                        var16 = class_(var1, var6, var7, var0, var1.int_, var10);
                        if (var16 == null) {
                           break;
                        }

                        var18 = var16.protected_ + var1.int_.nextInt(1 + var16.throws_ - var16.protected_);
                     }

                     if (class_(var1, var0, var6, var7, var16, var10, var26) && var4.test(var16.break_, var10, var2)) {
                        is_3 var28 = class_(var1, var16.break_);
                        if (var28 == null) {
                           return;
                        }

                        var28.class_(var21, (double)var8, var23, var1.int_.nextFloat() * 360.0F, 0.0F);
                        if (class_(var1, var28, var26)) {
                           var17 = var28.class_(var1, var1.throws_(var28.Bs()), iO_2.NATURAL, var17, (rcd_3)null);
                           var11++;
                           var19++;
                           var1.class_(var28);
                           var5.run(var28, var2);
                           if (var11 >= var28.E()) {
                              return;
                           }

                           if (var28.continue_(var19)) {
                              break;
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public static void class_(aH_2 var0, rrEm_1 var1, roJ_2 var2, rrER var3, rrEo_1 var4) {
      rfH_2 var5 = class_(var1, var2);
      if (var5.c_() >= 1) {
         class_(var0, var1, var2, var5, var3, var4);
      }
   }

   public static void class_(rrEm_1 var0, roJ_2 var1, rrEg_1 var2, boolean var3, boolean var4, boolean var5) {
      for (aH_2 var9 : byte_) {
         if ((var3 || !var9.protected_()) && (var4 || var9.protected_()) && (var5 || !var9.throws_()) && var2.class_(var9)) {
            class_(var9, var0, var1, (var1x, var2x, var3x) -> var2.class_(var1x, var2x, var3x), (var1x, var2x) -> var2.class_(var1x, var2x));
         }
      }
   }

   static rYG class_(rfH_2 var0, roC_2 var1) {
      return rYp_1.INSTANCE.class_(0L, var0.b_(), var0.c_(), var0.d_(), var1.implements_());
   }

   public static rrEg_1 class_(int var0, Iterable<an_3> var1, rrEY var2) {
      rrET var3 = new rrET();
      Object2IntOpenHashMap var4 = new Object2IntOpenHashMap();

      for (an_3 var6 : var1) {
         if (var6 instanceof is_3 var7 && (var7.O() || var7.strictfp_())) {
            continue;
         }

         aH_2 var9 = var6.BC().throws_();
         if (var9 != aH_2.MISC) {
            rfH_2 var10 = var6.Bs();
            long var11 = rfj_3.class_(var10.b_() >> 4, var10.d_() >> 4);
            var2.query(var11, var5 -> {
               rYI var6x = class_(var10, var5).break_().class_(var6.BC());
               if (var6x != null) {
                  var3.class_(var6.Bs(), var6x.break_());
               }

               var4.addTo(var9, 1);
            });
         }
      }

      return new rrEg_1(var0, var4, var3);
   }

   private static boolean class_(rrEm_1 var0, rrrA var1, rKd_1 var2, aH_2 var3, rYf_1 var4, rfH_2 var5) {
      return class_(var0, var1, var2, var3, var5, (rYG)null).contains(var4);
   }

   private static rYf_1 class_(rrEm_1 var0, rrrA var1, rKd_1 var2, aH_2 var3, Random var4, rfH_2 var5) {
      rYG var6 = var0.implements_(var5);
      if (var3 == aH_2.WATER_AMBIENT && var6.this_() == rYh_1.RIVER && var4.nextFloat() < 0.98F) {
         return null;
      } else {
         List var7 = class_(var0, var1, var2, var3, var5, var6);
         return var7.isEmpty() ? null : rTE.class_(var4, var7);
      }
   }

   private static boolean class_(rrEm_1 var0, is_3 var1, double var2) {
      return var2 > (double)(var1.BC().throws_().case_() * var1.BC().throws_().case_()) && var1.private_(var2)
         ? false
         : var1.class_(var0, iO_2.NATURAL) && var1.class_(var0);
   }

   private static is_3 class_(rrEm_1 var0, aI_2<?> var1) {
      try {
         an_3 var2 = var1.class_(var0);
         if (!(var2 instanceof is_3)) {
            throw new IllegalStateException("Trying to spawn a non-mob: " + rVL.transient_.break_(var1));
         } else {
            return (is_3)var2;
         }
      } catch (Exception var3) {
         class_.warn("Failed to create mob", var3);
         return null;
      }
   }
}
