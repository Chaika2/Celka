package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

public class zq_3 extends xd_3 {
   public static final rCN id_volatile = Wt_1.id_new;
   public static final rCN id_final = Wt_1.id_volatile;
   public static final rCN id_package = Wt_1.id_final;
   public static final rCN id_int = Wt_1.id_package;
   public static final rCN id_new = Wt_1.id_int;
   public static final Map<rpr_3, rCN> id_continue = Wt_1.id_super.entrySet().stream().filter(var0 -> var0.getKey() != rpr_3.DOWN).collect(rqR_2.id_class());
   private static final rjC_2 id_super = xd_3.id_class(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final rjC_2 id_this = xd_3.id_class(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final rjC_2 id_else = xd_3.id_class(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final rjC_2 id_synchronized = xd_3.id_class(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final rjC_2 id_return = xd_3.id_class(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<xc_3, rjC_2> id_public;

   public zq_3(Jq_1 var1) {
      super(var1);
      this.id_extends(
         this.id_abstract
            .id_break()
            .id_class(id_volatile, Boolean.valueOf(false))
            .id_class(id_final, Boolean.valueOf(false))
            .id_class(id_package, Boolean.valueOf(false))
            .id_class(id_int, Boolean.valueOf(false))
            .id_class(id_new, Boolean.valueOf(false))
      );
      this.id_public = ImmutableMap.copyOf(this.id_abstract.id_class().stream().collect(Collectors.toMap(Function.identity(), zq_3::id_private)));
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_volatile, id_final, id_package, id_int, id_new);
   }

   @Override
   public xc_3 id_class(rxx_3 var1) {
      xc_3 var2 = var1.id_int().id_byte(var1.id_class());
      boolean var3 = var2.id_class(this);
      xc_3 var4 = var3 ? var2 : this.id_continue();

      for (rpr_3 var8 : var1.id_throws()) {
         if (var8 != rpr_3.DOWN) {
            rCN var9 = id_class(var8);
            boolean var10 = var3 && var2.id_byte(var9);
            if (!var10 && this.id_break(var1.id_int(), var1.id_class(), var8)) {
               return var4.id_class(var9, Boolean.valueOf(true));
            }
         }
      }

      return var3 ? var4 : null;
   }

   @Override
   public boolean id_class(xc_3 var1, rxx_3 var2) {
      xc_3 var3 = var2.id_int().id_byte(var2.id_class());
      return var3.id_class(this) ? this.id_volatile(var3) < id_continue.size() : super.id_class(var1, var2);
   }

   private boolean id_class(rRq_1 var1, rfH_2 var2) {
      byte var3 = 4;
      Iterable var4 = rfH_2.id_break(var2.b_() - 4, var2.c_() - 1, var2.d_() - 4, var2.b_() + 4, var2.c_() + 1, var2.d_() + 4);
      int var5 = 5;

      for (rfH_2 var7 : var4) {
         if (var1.id_byte(var7).id_class(this)) {
            if (--var5 <= 0) {
               return false;
            }
         }
      }

      return true;
   }

   private xc_3 id_class(xc_3 var1, xc_3 var2, Random var3) {
      for (rpr_3 var5 : rpb_3.HORIZONTAL) {
         if (var3.nextBoolean()) {
            rCN var6 = id_class(var5);
            if (var1.id_byte(var6)) {
               var2 = var2.id_class(var6, Boolean.valueOf(true));
            }
         }
      }

      return var2;
   }

   public static rCN id_class(rpr_3 var0) {
      return id_continue.get(var0);
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpa_3 var2) {
      switch (var2) {
         case LEFT_RIGHT:
            return var1.id_class(id_final, var1.id_byte(id_int)).id_class(id_int, var1.id_byte(id_final));
         case FRONT_BACK:
            return var1.id_class(id_package, var1.id_byte(id_new)).id_class(id_new, var1.id_byte(id_package));
         default:
            return super.id_class(var1, var2);
      }
   }

   @Override
   public xc_3 id_class(xc_3 var1, rqd_3 var2) {
      switch (var2) {
         case CLOCKWISE_180:
            return var1.id_class(id_final, var1.id_byte(id_int))
               .id_class(id_package, var1.id_byte(id_new))
               .id_class(id_int, var1.id_byte(id_final))
               .id_class(id_new, var1.id_byte(id_package));
         case COUNTERCLOCKWISE_90:
            return var1.id_class(id_final, var1.id_byte(id_package))
               .id_class(id_package, var1.id_byte(id_int))
               .id_class(id_int, var1.id_byte(id_new))
               .id_class(id_new, var1.id_byte(id_final));
         case CLOCKWISE_90:
            return var1.id_class(id_final, var1.id_byte(id_new))
               .id_class(id_package, var1.id_byte(id_final))
               .id_class(id_int, var1.id_byte(id_package))
               .id_class(id_new, var1.id_byte(id_int));
         default:
            return var1;
      }
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return this.id_public.get(var1);
   }

   @Override
   public boolean id_class(xc_3 var1, rRR var2, rfH_2 var3) {
      return this.id_implements(this.id_catch(var1, var2, var3));
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      if (var2 == rpr_3.DOWN) {
         return super.id_class(var1, var2, var3, var4, var5, var6);
      } else {
         xc_3 var7 = this.id_catch(var1, var4, var5);
         return !this.id_implements(var7) ? xu_3.id_class.id_continue() : var7;
      }
   }

   @Override
   public void id_class(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (var2.id_int.nextInt(4) == 0) {
         rpr_3 var5 = rpr_3.id_class(var4);
         rfH_2 var6 = var3.id_final();
         if (var5.id_final().id_protected() && !var1.id_byte(id_class(var5))) {
            if (this.id_class(var2, var3)) {
               rfH_2 var17 = var3.id_break(var5);
               xc_3 var19 = var2.id_byte(var17);
               if (var19.id_catch()) {
                  rpr_3 var21 = var5.id_catch();
                  rpr_3 var22 = var5.id_private();
                  boolean var11 = var1.id_byte(id_class(var21));
                  boolean var12 = var1.id_byte(id_class(var22));
                  rfH_2 var13 = var17.id_break(var21);
                  rfH_2 var14 = var17.id_break(var22);
                  if (var11 && id_class(var2, var13, var21)) {
                     var2.id_class(var17, this.id_continue().id_class(id_class(var21), Boolean.valueOf(true)), 2);
                  } else if (var12 && id_class(var2, var14, var22)) {
                     var2.id_class(var17, this.id_continue().id_class(id_class(var22), Boolean.valueOf(true)), 2);
                  } else {
                     rpr_3 var15 = var5.id_case();
                     if (var11 && var2.id_finally(var13) && id_class(var2, var3.id_break(var21), var15)) {
                        var2.id_class(var13, this.id_continue().id_class(id_class(var15), Boolean.valueOf(true)), 2);
                     } else if (var12 && var2.id_finally(var14) && id_class(var2, var3.id_break(var22), var15)) {
                        var2.id_class(var14, this.id_continue().id_class(id_class(var15), Boolean.valueOf(true)), 2);
                     } else if ((double)var2.id_int.nextFloat() < 0.05 && id_class(var2, var17.id_final(), rpr_3.UP)) {
                        var2.id_class(var17, this.id_continue().id_class(id_volatile, Boolean.valueOf(true)), 2);
                     }
                  }
               } else if (id_class(var2, var17, var5)) {
                  var2.id_class(var3, var1.id_class(id_class(var5), Boolean.valueOf(true)), 2);
               }
            }
         } else {
            if (var5 == rpr_3.UP && var3.c_() < 255) {
               if (this.id_break(var2, var3, var5)) {
                  var2.id_class(var3, var1.id_class(id_volatile, Boolean.valueOf(true)), 2);
                  return;
               }

               if (var2.id_finally(var6)) {
                  if (!this.id_class(var2, var3)) {
                     return;
                  }

                  xc_3 var16 = var1;

                  for (rpr_3 var20 : rpb_3.HORIZONTAL) {
                     if (var4.nextBoolean() || !id_class(var2, var6.id_break(var20), rpr_3.UP)) {
                        var16 = var16.id_class(id_class(var20), Boolean.valueOf(false));
                     }
                  }

                  if (this.id_final(var16)) {
                     var2.id_class(var6, var16, 2);
                  }

                  return;
               }
            }

            if (var3.c_() > 0) {
               rfH_2 var7 = var3.id_break();
               xc_3 var8 = var2.id_byte(var7);
               if (var8.id_catch() || var8.id_class(this)) {
                  xc_3 var9 = var8.id_catch() ? this.id_continue() : var8;
                  xc_3 var10 = this.id_class(var1, var9, var4);
                  if (var9 != var10 && this.id_final(var10)) {
                     var2.id_class(var7, var10, 2);
                  }
               }
            }
         }
      }
   }

   public static boolean id_class(rRq_1 var0, rfH_2 var1, rpr_3 var2) {
      xc_3 var3 = var0.id_byte(var1);
      return xd_3.id_class(var3.id_extends(var0, var1), var2.id_case());
   }

   private boolean id_break(rRq_1 var1, rfH_2 var2, rpr_3 var3) {
      if (var3 == rpr_3.DOWN) {
         return false;
      } else {
         rfH_2 var4 = var2.id_break(var3);
         if (id_class(var1, var4, var3)) {
            return true;
         } else if (var3.id_final() == rpB_2.Y) {
            return false;
         } else {
            rCN var5 = id_continue.get(var3);
            xc_3 var6 = var1.id_byte(var2.id_final());
            return var6.id_class(this) && var6.id_byte(var5);
         }
      }
   }

   private xc_3 id_catch(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      rfH_2 var4 = var3.id_final();
      if (var1.id_byte(id_volatile)) {
         var1 = var1.id_class(id_volatile, Boolean.valueOf(id_class(var2, var4, rpr_3.DOWN)));
      }

      xc_3 var5 = null;

      for (rpr_3 var7 : rpb_3.HORIZONTAL) {
         rCN var8 = id_class(var7);
         if (var1.id_byte(var8)) {
            boolean var9 = this.id_break(var2, var3, var7);
            if (!var9) {
               if (var5 == null) {
                  var5 = var2.id_byte(var4);
               }

               var9 = var5.id_class(this) && var5.id_byte(var8);
            }

            var1 = var1.id_class(var8, Boolean.valueOf(var9));
         }
      }

      return var1;
   }

   private boolean id_implements(xc_3 var1) {
      return this.id_volatile(var1) > 0;
   }

   private static rjC_2 id_private(xc_3 var0) {
      rjC_2 var1 = rjw_3.id_class();
      if (var0.id_byte(id_volatile)) {
         var1 = id_super;
      }

      if (var0.id_byte(id_final)) {
         var1 = rjw_3.id_class(var1, id_synchronized);
      }

      if (var0.id_byte(id_int)) {
         var1 = rjw_3.id_class(var1, id_return);
      }

      if (var0.id_byte(id_package)) {
         var1 = rjw_3.id_class(var1, id_else);
      }

      if (var0.id_byte(id_new)) {
         var1 = rjw_3.id_class(var1, id_this);
      }

      return var1;
   }

   private boolean id_final(xc_3 var1) {
      return var1.id_byte(id_final) || var1.id_byte(id_package) || var1.id_byte(id_int) || var1.id_byte(id_new);
   }

   private int id_volatile(xc_3 var1) {
      int var2 = 0;

      for (rCN var4 : id_continue.values()) {
         if (var1.id_byte(var4)) {
            var2++;
         }
      }

      return var2;
   }
}
