package celestial;

import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class xK_2 extends dB_2 {
   private static final Logger id_package = LogManager.getLogger();
   public static final rCc_1 id_volatile = dz_3.id_volatile;
   public static final rCN id_final = rCT.id_byte;

   public xK_2(Jq_1 var1) {
      super(var1);
      this.id_extends(this.id_abstract.id_break().id_class(id_volatile, rpr_3.NORTH).id_class(id_final, Boolean.valueOf(false)));
   }

   @Override
   protected void id_class(rCL<xd_3, xc_3> var1) {
      var1.id_class(id_volatile, id_final);
   }

   @Override
   public xc_3 id_class(xc_3 var1, rpa_3 var2) {
      return var1.id_class(var2.id_class(var1.id_byte(id_volatile)));
   }

   @Override
   public xc_3 id_class(xc_3 var1, rqd_3 var2) {
      return var1.id_class(id_volatile, var2.id_class(var1.id_byte(id_volatile)));
   }

   @Override
   public xN_2 id_class(xc_3 var1) {
      return xN_2.MODEL;
   }

   @Override
   public xc_3 id_class(rxx_3 var1) {
      return this.id_continue().id_class(id_volatile, var1.id_protected().id_case());
   }

   private static void id_class(rYB var0, rfH_2 var1, rpr_3 var2) {
      rfw_3 var3 = var1.id_new();
      rRu_1 var4 = var0.B();
      int var5 = var4.id_byte(rRu_1.id_synchronized);

      while (var5-- > 0) {
         var3.id_class(var2);
         xc_3 var6 = var0.id_byte(var3);
         xd_3 var7 = var6.id_break();
         if (!var6.id_class(xu_3.bf) || !(var0.id_class(var3) instanceof rHZ var9) || var9.id_final() != rHF.SEQUENCE) {
            break;
         }

         if (var9.id_catch() || var9.id_private()) {
            rHm_1 var10 = var9.id_throws();
            if (var9.id_native()) {
               if (!var10.id_class(var0)) {
                  break;
               }

               var0.id_byte(var3, var7);
            } else if (var9.id_package()) {
               var10.id_class(0);
            }
         }

         var2 = var6.id_byte(id_volatile);
      }

      if (var5 <= 0) {
         int var11 = Math.max(var4.id_byte(rRu_1.id_synchronized), 0);
         id_package.warn("Command Block chain tried to execute more than {} steps!", var11);
      }
   }

   @Override
   public void id_class(rYB var1, rfH_2 var2, xc_3 var3, iB_2 var4, rdn_3 var5) {
      if (var1.id_class(var2) instanceof rHZ var7) {
         rHm_1 var8 = var7.id_throws();
         if (var5.id_this()) {
            var8.id_class(var5.id_continue());
         }

         if (!var1.id_continue) {
            if (var5.id_break("BlockEntityTag") == null) {
               var8.id_class(var1.B().id_break(rRu_1.id_final));
               var7.id_break(this == xu_3.bf);
            }

            if (var7.id_final() == rHF.SEQUENCE) {
               boolean var9 = var1.id_public(var2);
               var7.id_class(var9);
            }
         }
      }
   }

   @Override
   public void id_class(xc_3 var1, rYB var2, rfH_2 var3, xd_3 var4, rfH_2 var5, boolean var6) {
      if (!var2.id_continue && var2.id_class(var3) instanceof rHZ var8) {
         boolean var9 = var2.id_public(var3);
         boolean var10 = var8.id_catch();
         var8.id_class(var9);
         if (!var10 && !var8.id_private() && var8.id_final() != rHF.SEQUENCE && var9) {
            var8.id_native();
            var2.id_finally().id_class(var3, this, 1);
         }
      }
   }

   private void id_class(xc_3 var1, rYB var2, rfH_2 var3, rHm_1 var4, boolean var5) {
      if (var5) {
         var4.id_class(var2);
      } else {
         var4.id_class(0);
      }

      id_class(var2, var3, var1.id_byte(id_volatile));
   }

   @Override
   public ryZ_2 id_class(xc_3 var1, rYB var2, rfH_2 var3, rhd_3 var4, rpm_3 var5, rff_3 var6) {
      ryO_2 var7 = var2.id_class(var3);
      if (var7 instanceof rHZ && var4.sU()) {
         var4.id_class((rHZ)var7);
         return ryZ_2.id_class(var2.id_continue);
      } else {
         return ryZ_2.PASS;
      }
   }

   @Override
   public ryO_2 id_class(rRq_1 var1) {
      rHZ var2 = new rHZ();
      var2.id_break(this == xu_3.bf);
      return var2;
   }

   @Override
   public void id_break(xc_3 var1, rrEm_1 var2, rfH_2 var3, Random var4) {
      if (var2.id_class(var3) instanceof rHZ var6) {
         rHm_1 var7 = var6.id_throws();
         boolean var8 = !rql_3.id_break(var7.id_private());
         rHF var9 = var6.id_final();
         boolean var10 = var6.id_extends();
         if (var9 == rHF.AUTO) {
            var6.id_native();
            if (var10) {
               this.id_class(var1, var2, var3, var7, var8);
            } else if (var6.id_package()) {
               var7.id_class(0);
            }

            if (var6.id_catch() || var6.id_private()) {
               var2.id_synchronized().id_class(var3, this, 1);
            }
         } else if (var9 == rHF.REDSTONE) {
            if (var10) {
               this.id_class(var1, var2, var3, var7, var8);
            } else if (var6.id_package()) {
               var7.id_class(0);
            }
         }

         var2.id_byte(var3, this);
      }
   }

   @Override
   public int id_break(xc_3 var1, rYB var2, rfH_2 var3) {
      ryO_2 var4 = var2.id_class(var3);
      return var4 instanceof rHZ ? ((rHZ)var4).id_throws().id_case() : 0;
   }

   @Override
   public boolean id_case(xc_3 var1) {
      return true;
   }
}
