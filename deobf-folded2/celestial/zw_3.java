package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Map;

public class zw_3 extends xd_3 implements kd_3 {
   public static final rCN id_volatile = rCT.id_long;
   public static final rCu_1<zf_3> id_final = rCT.id_double;
   public static final rCu_1<zf_3> id_package = rCT.id_switch;
   public static final rCu_1<zf_3> id_int = rCT.r;
   public static final rCu_1<zf_3> id_new = rCT.P;
   public static final rCN id_continue = rCT.id_throw;
   private final Map<xc_3, rjC_2> id_super;
   private final Map<xc_3, rjC_2> id_this;
   private static final rjC_2 id_else = xd_3.id_class(7.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final rjC_2 id_synchronized = xd_3.id_class(7.0, 0.0, 0.0, 9.0, 16.0, 9.0);
   private static final rjC_2 id_return = xd_3.id_class(7.0, 0.0, 7.0, 9.0, 16.0, 16.0);
   private static final rjC_2 id_public = xd_3.id_class(0.0, 0.0, 7.0, 9.0, 16.0, 9.0);
   private static final rjC_2 id_goto = xd_3.id_class(7.0, 0.0, 7.0, 16.0, 16.0, 9.0);

   public zw_3(Jq_1 var1) {
      super(var1);
      this.id_extends(
         this.id_abstract
            .id_break()
            .id_class(id_volatile, Boolean.valueOf(true))
            .id_class(id_package, zf_3.NONE)
            .id_class(id_final, zf_3.NONE)
            .id_class(id_int, zf_3.NONE)
            .id_class(id_new, zf_3.NONE)
            .id_class(id_continue, Boolean.valueOf(false))
      );
      this.id_super = this.id_class(4.0F, 3.0F, 16.0F, 0.0F, 14.0F, 16.0F);
      this.id_this = this.id_class(4.0F, 3.0F, 24.0F, 0.0F, 24.0F, 24.0F);
   }

   private xc_3 id_class(xc_3 var1, boolean var2, boolean var3, boolean var4, boolean var5, rjC_2 var6) {
      return var1.id_class(id_package, this.id_class(var2, var6, id_synchronized))
         .id_class(id_final, this.id_class(var3, var6, id_goto))
         .id_class(id_int, this.id_class(var4, var6, id_return))
         .id_class(id_new, this.id_class(var5, var6, id_public));
   }

   private boolean id_class(xc_3 var1, xc_3 var2, rjC_2 var3) {
      boolean var4 = var2.id_break() instanceof zw_3 && var2.id_byte(id_volatile);
      if (var4) {
         return true;
      } else {
         zf_3 var5 = var1.id_byte(id_package);
         zf_3 var6 = var1.id_byte(id_int);
         zf_3 var7 = var1.id_byte(id_final);
         zf_3 var8 = var1.id_byte(id_new);
         boolean var9 = var6 == zf_3.NONE;
         boolean var10 = var8 == zf_3.NONE;
         boolean var11 = var7 == zf_3.NONE;
         boolean var12 = var5 == zf_3.NONE;
         boolean var13 = var12 && var9 && var10 && var11 || var12 != var9 || var10 != var11;
         if (var13) {
            return true;
         } else {
            boolean var14 = var5 == zf_3.TALL && var6 == zf_3.TALL || var7 == zf_3.TALL && var8 == zf_3.TALL;
            return var14 ? false : var2.id_break().id_class(rls_3.v) || id_class(var3, id_else);
         }
      }
   }

   private xc_3 id_class(rRR var1, xc_3 var2, rfH_2 var3, xc_3 var4, boolean var5, boolean var6, boolean var7, boolean var8) {
      rjC_2 var9 = var4.id_extends(var1, var3).id_class(rpr_3.DOWN);
      xc_3 var10 = this.id_class(var2, var5, var6, var7, var8, var9);
      return var10.id_class(id_volatile, Boolean.valueOf(this.id_class(var10, var4, var9)));
   }

   private xc_3 id_class(rRR var1, rfH_2 var2, xc_3 var3, rfH_2 var4, xc_3 var5, rpr_3 var6) {
      rpr_3 var7 = var6.id_case();
      boolean var8 = var6 == rpr_3.NORTH ? this.id_class(var5, var5.id_protected(var1, var4, var7), var7) : id_class(var3, id_package);
      boolean var9 = var6 == rpr_3.EAST ? this.id_class(var5, var5.id_protected(var1, var4, var7), var7) : id_class(var3, id_final);
      boolean var10 = var6 == rpr_3.SOUTH ? this.id_class(var5, var5.id_protected(var1, var4, var7), var7) : id_class(var3, id_int);
      boolean var11 = var6 == rpr_3.WEST ? this.id_class(var5, var5.id_protected(var1, var4, var7), var7) : id_class(var3, id_new);
      rfH_2 var12 = var2.id_final();
      xc_3 var13 = var1.id_byte(var12);
      return this.id_class(var1, var3, var12, var13, var8, var9, var10, var11);
   }

   private static rjC_2 id_class(rjC_2 var0, zf_3 var1, rjC_2 var2, rjC_2 var3) {
      if (var1 == zf_3.TALL) {
         return rjw_3.id_class(var0, var3);
      } else {
         return var1 == zf_3.LOW ? rjw_3.id_class(var0, var2) : var0;
      }
   }

   private xc_3 id_class(rRR var1, xc_3 var2, rfH_2 var3, xc_3 var4) {
      boolean var5 = id_class(var2, id_package);
      boolean var6 = id_class(var2, id_final);
      boolean var7 = id_class(var2, id_int);
      boolean var8 = id_class(var2, id_new);
      return this.id_class(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpa_3 var2) {
      switch (var2) {
         case LEFT_RIGHT:
            return var1.id_class(id_package, var1.id_byte(id_int)).id_class(id_int, var1.id_byte(id_package));
         case FRONT_BACK:
            return var1.id_class(id_final, var1.id_byte(id_new)).id_class(id_new, var1.id_byte(id_final));
         default:
            return super.id_class(var1, var2);
      }
   }

   @Override
   public xc_3 id_class(xc_3 var1, rqd_3 var2) {
      switch (var2) {
         case CLOCKWISE_180:
            return var1.id_class(id_package, var1.id_byte(id_int))
               .id_class(id_final, var1.id_byte(id_new))
               .id_class(id_int, var1.id_byte(id_package))
               .id_class(id_new, var1.id_byte(id_final));
         case COUNTERCLOCKWISE_90:
            return var1.id_class(id_package, var1.id_byte(id_final))
               .id_class(id_final, var1.id_byte(id_int))
               .id_class(id_int, var1.id_byte(id_new))
               .id_class(id_new, var1.id_byte(id_package));
         case CLOCKWISE_90:
            return var1.id_class(id_package, var1.id_byte(id_new))
               .id_class(id_final, var1.id_byte(id_package))
               .id_class(id_int, var1.id_byte(id_final))
               .id_class(id_new, var1.id_byte(id_int));
         default:
            return var1;
      }
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_volatile, id_package, id_final, id_new, id_int, id_continue);
   }

   private zf_3 id_class(boolean var1, rjC_2 var2, rjC_2 var3) {
      if (var1) {
         return id_class(var2, var3) ? zf_3.TALL : zf_3.LOW;
      } else {
         return zf_3.NONE;
      }
   }

   private boolean id_class(xc_3 var1, boolean var2, rpr_3 var3) {
      xd_3 var4 = var1.id_break();
      boolean var5 = var4 instanceof dq_3 && dq_3.id_class(var1, var3);
      return var1.id_class(rls_3.id_abstract) || !id_byte(var4) && var2 || var4 instanceof kK_2 || var5;
   }

   private Map<xc_3, rjC_2> id_class(float var1, float var2, float var3, float var4, float var5, float var6) {
      float var7 = 8.0F - var1;
      float var8 = 8.0F + var1;
      float var9 = 8.0F - var2;
      float var10 = 8.0F + var2;
      rjC_2 var11 = xd_3.id_class((double)var7, 0.0, (double)var7, (double)var8, (double)var3, (double)var8);
      rjC_2 var12 = xd_3.id_class((double)var9, (double)var4, 0.0, (double)var10, (double)var5, (double)var10);
      rjC_2 var13 = xd_3.id_class((double)var9, (double)var4, (double)var9, (double)var10, (double)var5, 16.0);
      rjC_2 var14 = xd_3.id_class(0.0, (double)var4, (double)var9, (double)var10, (double)var5, (double)var10);
      rjC_2 var15 = xd_3.id_class((double)var9, (double)var4, (double)var9, 16.0, (double)var5, (double)var10);
      rjC_2 var16 = xd_3.id_class((double)var9, (double)var4, 0.0, (double)var10, (double)var6, (double)var10);
      rjC_2 var17 = xd_3.id_class((double)var9, (double)var4, (double)var9, (double)var10, (double)var6, 16.0);
      rjC_2 var18 = xd_3.id_class(0.0, (double)var4, (double)var9, (double)var10, (double)var6, (double)var10);
      rjC_2 var19 = xd_3.id_class((double)var9, (double)var4, (double)var9, 16.0, (double)var6, (double)var10);
      Builder var20 = ImmutableMap.builder();

      for (Boolean var22 : id_volatile.id_class()) {
         for (zf_3 var24 : id_final.id_class()) {
            for (zf_3 var26 : id_package.id_class()) {
               for (zf_3 var28 : id_new.id_class()) {
                  for (zf_3 var30 : id_int.id_class()) {
                     rjC_2 var31 = rjw_3.id_class();
                     var31 = id_class(var31, var24, var15, var19);
                     var31 = id_class(var31, var28, var14, var18);
                     var31 = id_class(var31, var26, var12, var16);
                     var31 = id_class(var31, var30, var13, var17);
                     if (var22) {
                        var31 = rjw_3.id_class(var31, var11);
                     }

                     xc_3 var32 = this.id_continue()
                        .id_class(id_volatile, var22)
                        .id_class(id_final, var24)
                        .id_class(id_new, var28)
                        .id_class(id_package, var26)
                        .id_class(id_int, var30);
                     var20.put(var32.id_class(id_continue, Boolean.valueOf(false)), var31);
                     var20.put(var32.id_class(id_continue, Boolean.valueOf(true)), var31);
                  }
               }
            }
         }
      }

      return var20.build();
   }

   @Override
   public boolean id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rLT var4) {
      return false;
   }

   @Override
   public rjC_2 id_class(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return this.id_super.get(var1);
   }

   private static boolean id_class(rjC_2 var0, rjC_2 var1) {
      return !rjw_3.id_byte(var1, var0, rjN_2.id_throws);
   }

   private static boolean id_class(xc_3 var0, rCZ<zf_3> var1) {
      return var0.id_byte(var1) != zf_3.NONE;
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpr_3 var2, xc_3 var3, rRg_1 var4, rfH_2 var5, rfH_2 var6) {
      if (var1.id_byte(id_continue)) {
         var4.id_extends().id_class(var5, rXG.id_byte, rXG.id_byte.id_class(var4));
      }

      if (var2 == rpr_3.DOWN) {
         return super.id_class(var1, var2, var3, var4, var5, var6);
      } else {
         return var2 == rpr_3.UP ? this.id_class(var4, var1, var6, var3) : this.id_class(var4, var5, var1, var6, var3, var2);
      }
   }

   @Override
   public xc_3 id_class(rxx_3 var1) {
      rYB var2 = var1.id_int();
      rfH_2 var3 = var1.id_class();
      rXE var4 = var1.id_int().id_break(var1.id_class());
      rfH_2 var5 = var3.id_private();
      rfH_2 var6 = var3.id_extends();
      rfH_2 var7 = var3.id_protected();
      rfH_2 var8 = var3.id_byte();
      rfH_2 var9 = var3.id_final();
      xc_3 var10 = var2.id_byte(var5);
      xc_3 var11 = var2.id_byte(var6);
      xc_3 var12 = var2.id_byte(var7);
      xc_3 var13 = var2.id_byte(var8);
      xc_3 var14 = var2.id_byte(var9);
      boolean var15 = this.id_class(var10, var10.id_protected(var2, var5, rpr_3.SOUTH), rpr_3.SOUTH);
      boolean var16 = this.id_class(var11, var11.id_protected(var2, var6, rpr_3.WEST), rpr_3.WEST);
      boolean var17 = this.id_class(var12, var12.id_protected(var2, var7, rpr_3.NORTH), rpr_3.NORTH);
      boolean var18 = this.id_class(var13, var13.id_protected(var2, var8, rpr_3.EAST), rpr_3.EAST);
      xc_3 var19 = this.id_continue().id_class(id_continue, Boolean.valueOf(var4.id_class() == rXG.id_byte));
      return this.id_class(var2, var19, var9, var14, var15, var16, var17, var18);
   }

   @Override
   public rjC_2 id_break(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      return this.id_this.get(var1);
   }

   @Override
   public rXE id_throws(xc_3 var1) {
      return var1.id_byte(id_continue) ? rXG.id_byte.id_class(false) : super.id_throws(var1);
   }

   @Override
   public boolean a_(xc_3 var1, rRq_1 var2, rfH_2 var3) {
      return !var1.id_byte(id_continue);
   }
}
