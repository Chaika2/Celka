package celestial;

import java.util.List;
import java.util.Map;

public class rxJ_2 extends rdb_3 {
   @Deprecated
   private final xd_3 id_class;

   public xc_3 id_byte(rxx_3 var1) {
      xc_3 var2 = this.id_catch().id_class(var1);
      return var2 != null && this.id_break(var1, var2) ? var2 : null;
   }

   public rxJ_2(xd_3 var1, rdO_2 var2) {
      super(var2);
      this.id_class = var1;
   }

   protected boolean id_class(rxx_3 var1, xc_3 var2) {
      return var1.id_int().id_class(var1.id_class(), var2, 11);
   }

   private static <T extends Comparable<T>> xc_3 id_class(xc_3 var0, rCZ<T> var1, String var2) {
      return var1.id_break(var2).map(var2x -> var0.id_class(var1, var2x)).orElse(var0);
   }

   public void id_class(Map<xd_3, rdb_3> var1, rdb_3 var2) {
      var1.put(this.id_catch(), var2);
   }

   @Override
   public void id_class(rdn_3 var1, rYB var2, List<rgP_2> var3, VD var4) {
      super.id_class(var1, var2, var3, var4);
      this.id_catch().id_class(var1, var2, var3, var4);
   }

   @Override
   public void id_class(rdX_2 var1, rqs_3<rdn_3> var2) {
      if (this.id_class(var1)) {
         this.id_catch().id_class(var1, var2);
      }
   }

   public static boolean id_class(rYB var0, rhd_3 var1, rfH_2 var2, rdn_3 var3) {
      rnW_2 var4 = var0.id_const();
      if (var4 == null) {
         return false;
      } else {
         rcd_3 var5 = var3.id_break("BlockEntityTag");
         if (var5 != null) {
            ryO_2 var6 = var0.id_class(var2);
            if (var6 != null) {
               if (!var0.id_continue && var6.ac_() && (var1 == null || !var1.sU())) {
                  return false;
               }

               rcd_3 var7 = var6.id_class(new rcd_3());
               rcd_3 var8 = var7.id_catch();
               var7.id_class(var5);
               var7.id_break("x", var2.b_());
               var7.id_break("y", var2.c_());
               var7.id_break("z", var2.d_());
               if (!var7.equals(var8)) {
                  var6.id_class(var0.id_byte(var2), var7);
                  var6.id_break();
                  return true;
               }
            }
         }

         return false;
      }
   }

   @Override
   public ryZ_2 id_class(rdH_2 var1) {
      ryZ_2 var2 = this.id_class(new rxx_3(var1));
      return !var2.id_class() && this.id_super() ? this.id_class(var1.id_int(), var1.id_final(), var1.id_package()).id_class() : var2;
   }

   public ryZ_2 id_class(rxx_3 var1) {
      if (!var1.id_break()) {
         return ryZ_2.FAIL;
      } else {
         rxx_3 var2 = this.id_break(var1);
         if (var2 == null) {
            return ryZ_2.FAIL;
         } else {
            xc_3 var3 = this.id_byte(var2);
            if (var3 == null) {
               return ryZ_2.FAIL;
            } else if (!this.id_class(var2, var3)) {
               return ryZ_2.FAIL;
            } else {
               rfH_2 var4 = var2.id_class();
               rYB var5 = var2.id_int();
               rhd_3 var6 = var2.id_final();
               rdn_3 var7 = var2.id_volatile();
               xc_3 var8 = var5.id_byte(var4);
               xd_3 var9 = var8.id_break();
               if (var9 == var3.id_break()) {
                  var8 = this.id_class(var4, var5, var7, var8);
                  this.id_class(var4, var5, var6, var7, var8);
                  var9.id_class(var5, var4, var8, var6, var7);
                  if (var6 instanceof rhN_2) {
                     Oo_1.id_goto.id_class((rhN_2)var6, var4, var7);
                  }
               }

               zr_3 var10 = var8.id_package();
               var5.id_class(var6, var4, this.id_class(var8), rqL_2.BLOCKS, (var10.id_class() + 1.0F) / 2.0F, var10.id_break() * 0.8F);
               if (var6 == null || !((rhx_3)var6.id_implements[18]).id_protected) {
                  var7.id_catch(1);
               }

               return ryZ_2.id_class(var5.id_continue);
            }
         }
      }
   }

   protected rqA_2 id_class(xc_3 var1) {
      return var1.id_package().id_throws();
   }

   private xc_3 id_class(rfH_2 var1, rYB var2, rdn_3 var3, xc_3 var4) {
      xc_3 var5 = var4;
      rcd_3 var6 = var3.id_package();
      if (var6 != null) {
         rcd_3 var7 = var6.id_int("BlockStateTag");
         rCF var8 = var4.id_break().id_new();

         for (String var10 : var7.id_protected()) {
            rCZ var11 = var8.id_class(var10);
            if (var11 != null) {
               String var12 = var7.id_byte(var10).id_native();
               var5 = id_class(var5, var11, var12);
            }
         }
      }

      if (var5 != var4) {
         var2.id_class(var1, var5, 2);
      }

      return var5;
   }

   protected boolean id_class(rfH_2 var1, rYB var2, rhd_3 var3, rdn_3 var4, xc_3 var5) {
      return id_class(var2, var3, var1, var4);
   }

   protected boolean id_break(rxx_3 var1, xc_3 var2) {
      rhd_3 var3 = var1.id_final();
      rjm_3 var4 = var3 == null ? rjm_3.id_break() : rjm_3.id_class(var3);
      return (!this.id_throws() || var2.id_class((rRR)var1.id_int(), var1.id_class())) && var1.id_int().id_class(var2, var1.id_class(), var4);
   }

   public rxx_3 id_break(rxx_3 var1) {
      return var1;
   }

   @Override
   public String id_break() {
      return this.id_catch().id_volatile();
   }

   protected boolean id_throws() {
      return true;
   }

   public xd_3 id_catch() {
      return this.id_class;
   }
}
