package celestial;

import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.stream.Stream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class rrEj_1 {
   private static final Logger id_class = LogManager.getLogger();
   static final int id_break = (int)Math.pow(17.0, 2.0);
   private static final aH_2[] id_byte = Stream.of(aH_2.values()).filter(var0 -> var0 != aH_2.MISC).toArray(aH_2[]::new);

   private static rfH_2 id_class(rRR var0, aI_2<?> var1, int var2, int var3) {
      int var4 = var0.id_class(aq_3.id_break(var1), var2, var3);
      rfw_3 var5 = new rfw_3(var2, var4, var3);
      if (var0.id_default().id_byte()) {
         do {
            var5.id_class(rpr_3.DOWN);
         } while (!var0.id_byte(var5).id_catch());

         do {
            var5.id_class(rpr_3.DOWN);
         } while (var0.id_byte(var5).id_catch() && var5.c_() > 0);
      }

      if (aq_3.id_class(var1) == aw_3.ON_GROUND) {
         rfH_2 var6 = var5.id_break();
         if (var0.id_byte(var6).id_class(var0, var6, rLT.LAND)) {
            return var6;
         }
      }

      return var5.id_int();
   }

   public static void id_class(rRf_1 var0, rYG var1, int var2, int var3, Random var4) {
      rYt_1 var5 = var1.id_break();
      List var6 = var5.id_class(aH_2.CREATURE);
      if (!var6.isEmpty()) {
         int var7 = var2 << 4;
         int var8 = var3 << 4;

         while (var4.nextFloat() < var5.id_class()) {
            rYf_1 var9 = rTE.id_class(var4, var6);
            int var10 = var9.id_protected + var4.nextInt(1 + var9.id_throws - var9.id_protected);
            aU_2 var11 = null;
            int var12 = var7 + var4.nextInt(16);
            int var13 = var8 + var4.nextInt(16);
            int var14 = var12;
            int var15 = var13;

            for (int var16 = 0; var16 < var10; var16++) {
               boolean var17 = false;

               for (int var18 = 0; !var17 && var18 < 4; var18++) {
                  rfH_2 var19 = id_class(var0, var9.id_break, var12, var13);
                  if (var9.id_break.id_break() && id_class(aq_3.id_class(var9.id_break), var0, var19, var9.id_break)) {
                     float var20 = var9.id_break.id_extends();
                     double var21 = rfU_2.id_class((double)var12, (double)var7 + (double)var20, (double)var7 + 16.0 - (double)var20);
                     double var23 = rfU_2.id_class((double)var13, (double)var8 + (double)var20, (double)var8 + 16.0 - (double)var20);
                     if (!var0.id_break(var9.id_break.id_class(var21, (double)var19.c_(), var23))
                        || !aq_3.id_class(var9.id_break, var0, iO_2.CHUNK_GENERATION, new rfH_2(var21, (double)var19.c_(), var23), var0.id_long())) {
                        continue;
                     }

                     an_3 var25;
                     try {
                        var25 = var9.id_break.id_class(var0.id_byte());
                     } catch (Exception var27) {
                        id_class.warn("Failed to create mob", var27);
                        continue;
                     }

                     var25.id_class(var21, (double)var19.c_(), var23, var4.nextFloat() * 360.0F, 0.0F);
                     if (var25 instanceof is_3 var26 && var26.id_class(var0, iO_2.CHUNK_GENERATION) && var26.id_class(var0)) {
                        var11 = var26.id_class(var0, var0.id_throws(var26.Bs()), iO_2.CHUNK_GENERATION, var11, (rcd_3)null);
                        var0.id_class(var26);
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

   public static boolean id_class(aw_3 var0, rRR var1, rfH_2 var2, aI_2<?> var3) {
      if (var0 == aw_3.NO_RESTRICTIONS) {
         return true;
      } else if (var3 != null && var1.id_instanceof().id_class(var2)) {
         xc_3 var4 = var1.id_byte(var2);
         rXE var5 = var1.id_break(var2);
         rfH_2 var6 = var2.id_final();
         rfH_2 var7 = var2.id_break();
         switch (var0) {
            case IN_WATER:
               return var5.id_class(rlG_2.id_break) && var1.id_break(var7).id_class(rlG_2.id_break) && !var1.id_byte(var6).id_catch(var1, var6);
            case IN_LAVA:
               return var5.id_class(rlG_2.id_byte);
            case ON_GROUND:
            default:
               xc_3 var8 = var1.id_byte(var7);
               return !var8.id_class(var1, var7, var3)
                  ? false
                  : id_class(var1, var2, var4, var5, var3) && id_class(var1, var6, var1.id_byte(var6), var1.id_break(var6), var3);
         }
      } else {
         return false;
      }
   }

   public static boolean id_class(rRq_1 var0, rfH_2 var1, xc_3 var2, rXE var3, aI_2<?> var4) {
      if (var2.id_new(var0, var1)) {
         return false;
      } else if (var2.id_implements()) {
         return false;
      } else if (!var3.id_byte()) {
         return false;
      } else {
         return var2.id_class(rls_3.y) ? false : !var4.id_class(var2);
      }
   }

   private static rfH_2 id_class(rYB var0, roJ_2 var1) {
      rfj_3 var2 = var1.id_private();
      int var3 = var2.id_break() + var0.id_int.nextInt(16);
      int var4 = var2.id_byte() + var0.id_int.nextInt(16);
      int var5 = var1.id_class(rKv_1.WORLD_SURFACE, var3, var4) + 1;
      int var6 = var0.id_int.nextInt(var5 + 1);
      return new rfH_2(var3, var6, var4);
   }

   private static List<rYf_1> id_class(rrEm_1 var0, rrrA var1, rKd_1 var2, aH_2 var3, rfH_2 var4, rYG var5) {
      return var3 == aH_2.MONSTER && var0.id_byte(var4.id_break()).id_break() == xu_3.SP && var1.id_class(var4, false, rrrZ.id_final).id_throws()
         ? rrrZ.id_final.id_byte()
         : var2.id_class(var5 != null ? var5 : var0.id_implements(var4), var1, var3, var4);
   }

   private static boolean id_class(rrEm_1 var0, aH_2 var1, rrrA var2, rKd_1 var3, rYf_1 var4, rfw_3 var5, double var6) {
      aI_2 var8 = var4.id_break;
      if (var8.id_throws() == aH_2.MISC) {
         return false;
      } else if (!var8.id_protected() && var6 > (double)(var8.id_throws().id_case() * var8.id_throws().id_case())) {
         return false;
      } else if (var8.id_break() && id_class(var0, var2, var3, var1, var4, var5)) {
         aw_3 var9 = aq_3.id_class(var8);
         if (!id_class(var9, var0, var5, var8)) {
            return false;
         } else {
            return !aq_3.id_class(var8, var0, iO_2.NATURAL, var5, var0.id_int)
               ? false
               : var0.id_break(var8.id_class((double)var5.b_() + 0.5, (double)var5.c_(), (double)var5.d_() + 0.5));
         }
      } else {
         return false;
      }
   }

   private static boolean id_class(rrEm_1 var0, roC_2 var1, rfw_3 var2, double var3) {
      if (var3 <= 576.0) {
         return false;
      } else if (var0.X().id_class(new rjU_2((double)var2.b_() + 0.5, (double)var2.c_(), (double)var2.d_() + 0.5), 24.0)) {
         return false;
      } else {
         rfj_3 var5 = new rfj_3(var2);
         return Objects.equals(var5, var1.id_private()) || var0.id_else().id_class(var5);
      }
   }

   public static void id_class(aH_2 var0, rrEm_1 var1, roC_2 var2, rfH_2 var3, rrER var4, rrEo_1 var5) {
      rrrA var6 = var1.id_protected();
      rKd_1 var7 = var1.id_else().id_implements();
      int var8 = var3.c_();
      xc_3 var9 = var2.id_byte(var3);
      if (!var9.id_catch(var2, var3)) {
         rfw_3 var10 = new rfw_3();
         int var11 = 0;

         for (int var12 = 0; var12 < 3; var12++) {
            int var13 = var3.b_();
            int var14 = var3.d_();
            byte var15 = 6;
            rYf_1 var16 = null;
            aU_2 var17 = null;
            int var18 = rfU_2.id_case(var1.id_int.nextFloat() * 4.0F);
            int var19 = 0;

            for (int var20 = 0; var20 < var18; var20++) {
               var13 += var1.id_int.nextInt(6) - var1.id_int.nextInt(6);
               var14 += var1.id_int.nextInt(6) - var1.id_int.nextInt(6);
               var10.id_class(var13, var8, var14);
               double var21 = (double)var13 + 0.5;
               double var23 = (double)var14 + 0.5;
               rhd_3 var25 = var1.id_class(var21, (double)var8, var23, -1.0, false);
               if (var25 != null) {
                  double var26 = var25.id_class(var21, (double)var8, var23);
                  if (id_class(var1, var2, var10, var26)) {
                     if (var16 == null) {
                        var16 = id_class(var1, var6, var7, var0, var1.id_int, var10);
                        if (var16 == null) {
                           break;
                        }

                        var18 = var16.id_protected + var1.id_int.nextInt(1 + var16.id_throws - var16.id_protected);
                     }

                     if (id_class(var1, var0, var6, var7, var16, var10, var26) && var4.test(var16.id_break, var10, var2)) {
                        is_3 var28 = id_class(var1, var16.id_break);
                        if (var28 == null) {
                           return;
                        }

                        var28.id_class(var21, (double)var8, var23, var1.id_int.nextFloat() * 360.0F, 0.0F);
                        if (id_class(var1, var28, var26)) {
                           var17 = var28.id_class(var1, var1.id_throws(var28.Bs()), iO_2.NATURAL, var17, (rcd_3)null);
                           var11++;
                           var19++;
                           var1.id_class(var28);
                           var5.run(var28, var2);
                           if (var11 >= var28.E()) {
                              return;
                           }

                           if (var28.id_continue(var19)) {
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

   public static void id_class(aH_2 var0, rrEm_1 var1, roJ_2 var2, rrER var3, rrEo_1 var4) {
      rfH_2 var5 = id_class(var1, var2);
      if (var5.c_() >= 1) {
         id_class(var0, var1, var2, var5, var3, var4);
      }
   }

   public static void id_class(rrEm_1 var0, roJ_2 var1, rrEg_1 var2, boolean var3, boolean var4, boolean var5) {
      for (aH_2 var9 : id_byte) {
         if ((var3 || !var9.id_protected()) && (var4 || var9.id_protected()) && (var5 || !var9.id_throws()) && var2.id_class(var9)) {
            id_class(var9, var0, var1, (var1x, var2x, var3x) -> var2.id_class(var1x, var2x, var3x), (var1x, var2x) -> var2.id_class(var1x, var2x));
         }
      }
   }

   static rYG id_class(rfH_2 var0, roC_2 var1) {
      return rYp_1.INSTANCE.id_class(0L, var0.b_(), var0.c_(), var0.d_(), var1.id_implements());
   }

   public static rrEg_1 id_class(int var0, Iterable<an_3> var1, rrEY var2) {
      rrET var3 = new rrET();
      Object2IntOpenHashMap var4 = new Object2IntOpenHashMap();

      for (an_3 var6 : var1) {
         if (var6 instanceof is_3 var7 && (var7.O() || var7.id_strictfp())) {
            continue;
         }

         aH_2 var9 = var6.BC().id_throws();
         if (var9 != aH_2.MISC) {
            rfH_2 var10 = var6.Bs();
            long var11 = rfj_3.id_class(var10.b_() >> 4, var10.d_() >> 4);
            var2.query(var11, var5 -> {
               rYI var6x = id_class(var10, var5).id_break().id_class(var6.BC());
               if (var6x != null) {
                  var3.id_class(var6.Bs(), var6x.id_break());
               }

               var4.addTo(var9, 1);
            });
         }
      }

      return new rrEg_1(var0, var4, var3);
   }

   private static boolean id_class(rrEm_1 var0, rrrA var1, rKd_1 var2, aH_2 var3, rYf_1 var4, rfH_2 var5) {
      return id_class(var0, var1, var2, var3, var5, (rYG)null).contains(var4);
   }

   private static rYf_1 id_class(rrEm_1 var0, rrrA var1, rKd_1 var2, aH_2 var3, Random var4, rfH_2 var5) {
      rYG var6 = var0.id_implements(var5);
      if (var3 == aH_2.WATER_AMBIENT && var6.id_this() == rYh_1.RIVER && var4.nextFloat() < 0.98F) {
         return null;
      } else {
         List var7 = id_class(var0, var1, var2, var3, var5, var6);
         return var7.isEmpty() ? null : rTE.id_class(var4, var7);
      }
   }

   private static boolean id_class(rrEm_1 var0, is_3 var1, double var2) {
      return var2 > (double)(var1.BC().id_throws().id_case() * var1.BC().id_throws().id_case()) && var1.id_private(var2)
         ? false
         : var1.id_class(var0, iO_2.NATURAL) && var1.id_class(var0);
   }

   private static is_3 id_class(rrEm_1 var0, aI_2<?> var1) {
      try {
         an_3 var2 = var1.id_class(var0);
         if (!(var2 instanceof is_3)) {
            throw new IllegalStateException("Trying to spawn a non-mob: " + rVL.id_transient.id_break(var1));
         } else {
            return (is_3)var2;
         }
      } catch (Exception var3) {
         id_class.warn("Failed to create mob", var3);
         return null;
      }
   }
}
