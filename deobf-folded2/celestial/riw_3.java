package celestial;

import com.google.common.collect.Lists;
import com.mojang.serialization.Dynamic;
import java.util.ArrayList;
import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class riw_3 extends rrrw_1 {
   private static final Logger id_protected = LogManager.getLogger();
   private final rqO_2 id_throws;
   private final rqd_3 id_case;
   private final rpa_3 id_catch;
   private final riI_2 id_private;
   private final rif_3 id_implements;

   private void id_byte(Random var1, rRg_1 var2, rfH_2 var3) {
      rfw_3 var4 = var3.id_new();
      this.id_protected(var1, var2, var4);
      int var5 = 8;

      while (var5 > 0 && var1.nextFloat() < 0.5F) {
         var4.id_class(rpr_3.DOWN);
         var5--;
         this.id_protected(var1, var2, var4);
      }
   }

   public riw_3(rfH_2 var1, riI_2 var2, rif_3 var3, rqO_2 var4, rrPl_1 var5, rqd_3 var6, rpa_3 var7, rfH_2 var8) {
      super(raF_2.id_static, 0);
      this.id_byte = var1;
      this.id_throws = var4;
      this.id_case = var6;
      this.id_catch = var7;
      this.id_private = var2;
      this.id_implements = var3;
      this.id_class(var5, var8);
   }

   public riw_3(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.id_static, var2);
      this.id_throws = new rqO_2(var2.id_native("Template"));
      this.id_case = rqd_3.valueOf(var2.id_native("Rotation"));
      this.id_catch = rpa_3.valueOf(var2.id_native("Mirror"));
      this.id_private = riI_2.id_class(var2.id_native("VerticalPlacement"));
      this.id_implements = (rif_3)rif_3.id_class.parse(new Dynamic(rcf_3.id_class, var2.id_byte("Properties"))).getOrThrow(true, id_protected::error);
      rrPl_1 var3 = var1.id_class(this.id_throws);
      this.id_class(var3, new rfH_2(var3.id_class().b_() / 2, 0, var3.id_class().d_() / 2));
   }

   public static rKv_1 id_class(riI_2 var0) {
      return var0 == riI_2.ON_OCEAN_FLOOR ? rKv_1.OCEAN_FLOOR_WG : rKv_1.WORLD_SURFACE_WG;
   }

   private static int id_class(rRg_1 var0, int var1, int var2, riI_2 var3) {
      return var0.id_class(id_class(var3), var1, var2) - 1;
   }

   private boolean id_class(rRg_1 var1, rfH_2 var2) {
      xc_3 var3 = var1.id_byte(var2);
      return !var3.id_class(xu_3.id_class)
         && !var3.id_class(xu_3.rg)
         && !var3.id_class(xu_3.re)
         && (this.id_private == riI_2.IN_NETHER || !var3.id_class(xu_3.id_instanceof));
   }

   @Override
   protected void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_class("Template", this.id_throws.toString());
      var1.id_class("Rotation", this.id_case.name());
      var1.id_class("Mirror", this.id_catch.name());
      var1.id_class("VerticalPlacement", this.id_private.id_class());
      rif_3.id_class
         .encodeStart(rcf_3.id_class, this.id_implements)
         .resultOrPartial(id_protected::error)
         .ifPresent(var1x -> var1.id_class("Properties", var1x));
   }

   private static rrPv_1 id_class(xd_3 var0, xd_3 var1) {
      return new rrPv_1(new rrPb_1(var0), rrPB.id_break, var1.id_continue());
   }

   private static rrPv_1 id_class(xd_3 var0, float var1, xd_3 var2) {
      return new rrPv_1(new rrPm_1(var0, var1), rrPB.id_break, var2.id_continue());
   }

   private void id_class(Random var1, rRg_1 var2, rfH_2 var3) {
      xc_3 var4 = var2.id_byte(var3);
      if (!var4.id_catch() && !var4.id_class(xu_3.BD)) {
         rpr_3 var5 = rpb_3.HORIZONTAL.id_class(var1);
         rfH_2 var6 = var3.id_break(var5);
         xc_3 var7 = var2.id_byte(var6);
         if (var7.id_catch() && xd_3.id_class(var4.id_extends(var2, var3), var5)) {
            rCN var8 = zq_3.id_class(var5.id_case());
            var2.id_class(var6, xu_3.BD.id_continue().id_class(var8, Boolean.valueOf(true)), 3);
         }
      }
   }

   @Override
   protected void id_class(String var1, rfH_2 var2, rRf_1 var3, Random var4, rfi_3 var5) {
   }

   @Override
   public boolean id_class(rRI var1, rrrA var2, rKd_1 var3, Random var4, rfi_3 var5, rfj_3 var6, rfH_2 var7) {
      if (!var5.id_break(this.id_byte)) {
         return true;
      } else {
         var5.id_break(this.id_class.id_break(this.id_break, this.id_byte));
         boolean var8 = super.id_class(var1, var2, var3, var4, var5, var6, var7);
         this.id_break(var4, var1);
         this.id_class(var4, var1);
         if (this.id_implements.id_case || this.id_implements.id_throws) {
            rfH_2.id_class(this.id_catch()).forEach(var3x -> {
               if (this.id_implements.id_case) {
                  this.id_class(var4, (rRg_1)var1, var3x);
               }

               if (this.id_implements.id_throws) {
                  this.id_break(var4, var1, var3x);
               }
            });
         }

         return var8;
      }
   }

   private void id_class(rrPl_1 var1, rfH_2 var2) {
      rrPG var3 = this.id_implements.id_protected ? rrPG.id_break : rrPG.id_protected;
      ArrayList var4 = Lists.newArrayList();
      var4.add(id_class(xu_3.rt, 0.3F, xu_3.id_class));
      var4.add(this.id_break());
      if (!this.id_implements.id_break) {
         var4.add(id_class(xu_3.PR, 0.07F, xu_3.bV));
      }

      rrPN var5 = new rrPN()
         .id_class(this.id_case)
         .id_class(this.id_catch)
         .id_class(var2)
         .id_class(var3)
         .id_class(new rrPF(var4))
         .id_class(new rrPM(this.id_implements.id_byte))
         .id_class(new rrPW());
      if (this.id_implements.id_catch) {
         var5.id_class(rrPE.id_break);
      }

      this.id_class(var1, this.id_byte, var5);
   }

   private void id_class(Random var1, rRg_1 var2) {
      for (int var3 = this.id_final.id_class + 1; var3 < this.id_final.id_protected; var3++) {
         for (int var4 = this.id_final.id_byte + 1; var4 < this.id_final.id_case; var4++) {
            rfH_2 var5 = new rfH_2(var3, this.id_final.id_break, var4);
            if (var2.id_byte(var5).id_class(xu_3.PR)) {
               this.id_byte(var1, var2, var5.id_break());
            }
         }
      }
   }

   private void id_break(Random var1, rRg_1 var2) {
      boolean var3 = this.id_private == riI_2.ON_LAND_SURFACE || this.id_private == riI_2.ON_OCEAN_FLOOR;
      rja_3 var4 = this.id_final.id_catch();
      int var5 = var4.b_();
      int var6 = var4.d_();
      float[] var7 = new float[]{1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 0.9F, 0.9F, 0.8F, 0.7F, 0.6F, 0.4F, 0.2F};
      int var8 = var7.length;
      int var9 = (this.id_final.id_protected() + this.id_final.id_case()) / 2;
      int var10 = var1.nextInt(Math.max(1, 8 - var9 / 2));
      byte var11 = 3;
      rfw_3 var12 = rfH_2.id_protected.id_new();

      for (int var13 = var5 - var8; var13 <= var5 + var8; var13++) {
         for (int var14 = var6 - var8; var14 <= var6 + var8; var14++) {
            int var15 = Math.abs(var13 - var5) + Math.abs(var14 - var6);
            int var16 = Math.max(0, var15 + var10);
            if (var16 < var8) {
               float var17 = var7[var16];
               if (var1.nextDouble() < (double)var17) {
                  int var18 = id_class(var2, var13, var14, this.id_private);
                  int var19 = var3 ? var18 : Math.min(this.id_final.id_break, var18);
                  var12.id_class(var13, var19, var14);
                  if (Math.abs(var19 - this.id_final.id_break) <= 3 && this.id_class(var2, var12)) {
                     this.id_protected(var1, var2, var12);
                     if (this.id_implements.id_throws) {
                        this.id_break(var1, var2, var12);
                     }

                     this.id_byte(var1, var2, var12.id_break());
                  }
               }
            }
         }
      }
   }

   private rrPv_1 id_break() {
      if (this.id_private == riI_2.ON_OCEAN_FLOOR) {
         return id_class(xu_3.id_instanceof, xu_3.bV);
      } else {
         return this.id_implements.id_break ? id_class(xu_3.id_instanceof, xu_3.PR) : id_class(xu_3.id_instanceof, 0.2F, xu_3.bV);
      }
   }

   private void id_break(Random var1, rRg_1 var2, rfH_2 var3) {
      if (var1.nextFloat() < 0.5F && var2.id_byte(var3).id_class(xu_3.PR) && var2.id_byte(var3.id_final()).id_catch()) {
         var2.id_class(var3.id_final(), xu_3.W.id_continue().id_class(kZ_2.id_final, Boolean.valueOf(true)), 3);
      }
   }

   private void id_protected(Random var1, rRg_1 var2, rfH_2 var3) {
      if (!this.id_implements.id_break && var1.nextFloat() < 0.07F) {
         var2.id_class(var3, xu_3.bV.id_continue(), 3);
      } else {
         var2.id_class(var3, xu_3.PR.id_continue(), 3);
      }
   }
}
