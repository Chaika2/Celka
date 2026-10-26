package celestial;

import java.util.Objects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rni_3 {
   private static final Logger id_byte = LogManager.getLogger();
   public rrEm_1 id_class;
   public rhN_2 id_break;
   private rRl_1 id_protected = rRl_1.NOT_SET;
   private rRl_1 id_throws = rRl_1.NOT_SET;
   private boolean id_case;
   private int id_catch;
   private rfH_2 id_private = rfH_2.id_protected;
   private int id_implements;
   private boolean id_finally;
   private rfH_2 id_extends = rfH_2.id_protected;
   private int id_native;
   private int id_volatile = -1;

   public rRl_1 id_byte() {
      return this.id_throws;
   }

   public rni_3(rrEm_1 var1) {
      this.id_class = var1;
   }

   public boolean id_class(rfH_2 var1) {
      xc_3 var2 = this.id_class.id_byte(var1);
      if (!this.id_break.ss().id_break().id_class(var2, this.id_class, var1, this.id_break)) {
         return false;
      } else {
         ryO_2 var3 = this.id_class.id_class(var1);
         xd_3 var4 = var2.id_break();
         if ((var4 instanceof xK_2 || var4 instanceof zx_3 || var4 instanceof kW_2) && !this.id_break.sU()) {
            this.id_class.id_class(var1, var2, var2, 3);
            return false;
         } else if (this.id_break.id_class(this.id_class, var1, this.id_protected)) {
            return false;
         } else {
            var4.id_class(this.id_class, var1, var2, this.id_break);
            boolean var5 = this.id_class.id_class(var1, false);
            if (var5) {
               var4.id_class((rRg_1)this.id_class, var1, var2);
            }

            if (this.id_throws()) {
               return true;
            } else {
               rdn_3 var6 = this.id_break.ss();
               rdn_3 var7 = var6.id_implements();
               boolean var8 = this.id_break.id_byte(var2);
               var6.id_class(this.id_class, var2, var1, this.id_break);
               if (var5 && var8) {
                  var4.id_class(this.id_class, this.id_break, var1, var2, var3, var7);
               }

               return true;
            }
         }
      }
   }

   public void id_class(rfH_2 var1, rZM var2, String var3) {
      if (this.id_class(var1)) {
         this.id_break.id_class.id_class(new rvj_3(var1, this.id_class.id_byte(var1), var2, true, var3));
      } else {
         this.id_break.id_class.id_class(new rvj_3(var1, this.id_class.id_byte(var1), var2, false, var3));
      }
   }

   public void id_class() {
      this.id_implements++;
      if (this.id_finally) {
         xc_3 var1 = this.id_class.id_byte(this.id_extends);
         if (var1.id_catch()) {
            this.id_finally = false;
         } else {
            float var2 = this.id_class(var1, this.id_extends, this.id_native);
            if (var2 >= 1.0F) {
               this.id_finally = false;
               this.id_class(this.id_extends);
            }
         }
      } else if (this.id_case) {
         xc_3 var3 = this.id_class.id_byte(this.id_private);
         if (var3.id_catch()) {
            this.id_class.id_class(this.id_break.V(), this.id_private, -1);
            this.id_volatile = -1;
            this.id_case = false;
         } else {
            this.id_class(var3, this.id_private, this.id_catch);
         }
      }
   }

   private float id_class(xc_3 var1, rfH_2 var2, int var3) {
      int var4 = this.id_implements - var3;
      float var5 = var1.id_class(this.id_break, (rYB)this.id_break.id_throws[7], var2) * (float)(var4 + 1);
      int var6 = (int)(var5 * 10.0F);
      if (var6 != this.id_volatile) {
         this.id_class.id_class(this.id_break.V(), var2, var6);
         this.id_volatile = var6;
      }

      return var5;
   }

   public ryZ_2 id_class(rhN_2 var1, rYB var2, rdn_3 var3, rpm_3 var4) {
      if (this.id_protected == rRl_1.SPECTATOR) {
         return ryZ_2.PASS;
      } else if (var1.sK().id_class(var3.id_break())) {
         return ryZ_2.PASS;
      } else {
         int var5 = var3.id_char();
         int var6 = var3.id_catch();
         rym_3 var7 = var3.id_class(var2, var1, var4);
         rdn_3 var8 = (rdn_3)var7.id_break();
         if (var8 == var3 && var8.id_char() == var5 && var8.id_extends() <= 0 && var8.id_catch() == var6) {
            return var7.id_class();
         } else if (var7.id_class() == ryZ_2.FAIL && var8.id_extends() > 0 && !var1.id_return()) {
            return var7.id_class();
         } else {
            var1.id_class(var4, var8);
            if (this.id_throws()) {
               var8.id_throws(var5);
               if (var8.id_throws() && var8.id_catch() != var6) {
                  var8.id_break(var6);
               }
            }

            if (var8.id_class()) {
               var1.id_class(var4, rdn_3.id_break);
            }

            if (!var1.id_return()) {
               var1.id_class((rJT)var1.id_implements[3]);
            }

            return var7.id_class();
         }
      }
   }

   public ryZ_2 id_class(rhN_2 var1, rYB var2, rdn_3 var3, rpm_3 var4, rff_3 var5) {
      rfH_2 var6 = var5.id_class();
      xc_3 var7 = var2.id_byte(var6);
      if (this.id_protected == rRl_1.SPECTATOR) {
         rJZ var14 = var7.id_break(var2, var6);
         if (var14 != null) {
            var1.id_class(var14);
            return ryZ_2.SUCCESS;
         } else {
            return ryZ_2.PASS;
         }
      } else {
         boolean var8 = !var1.ss().id_class() || !var1.Sn().id_class();
         boolean var9 = var1.sN() && var8;
         rdn_3 var10 = var3.id_implements();
         if (!var9) {
            ryZ_2 var11 = var7.id_class(var2, var1, var4, var5);
            if (var11.id_class()) {
               Oo_1.id_default.id_class(var1, var6, var10);
               return var11;
            }
         }

         if (!var3.id_class() && !var1.sK().id_class(var3.id_break())) {
            rdH_2 var15 = new rdH_2(var1, var4, var5);
            ryZ_2 var12;
            if (this.id_throws()) {
               int var13 = var3.id_char();
               var12 = var3.id_class(var15);
               var3.id_throws(var13);
            } else {
               var12 = var3.id_class(var15);
            }

            if (var12.id_class()) {
               Oo_1.id_default.id_class(var1, var6, var10);
            }

            return var12;
         } else {
            return ryZ_2.PASS;
         }
      }
   }

   public void id_class(rrEm_1 var1) {
      this.id_class = var1;
   }

   public void id_class(rRl_1 var1, rRl_1 var2) {
      this.id_throws = var2;
      this.id_protected = var1;
      var1.id_class((rhx_3)this.id_break.id_implements[18]);
      this.id_break.G();
      this.id_break.id_break.x().id_class(new rvg_3(rvY_2.UPDATE_GAME_MODE, this.id_break));
      this.id_class.id_private();
   }

   public void id_class(rfH_2 var1, rZM var2, rpr_3 var3, int var4) {
      double var5 = this.id_break.rx() - ((double)var1.b_() + 0.5);
      double var7 = this.id_break.re() - ((double)var1.c_() + 0.5) + 1.5;
      double var9 = this.id_break.BO() - ((double)var1.d_() + 0.5);
      double var11 = var5 * var5 + var7 * var7 + var9 * var9;
      if (var11 > 36.0) {
         this.id_break.id_class.id_class(new rvj_3(var1, this.id_class.id_byte(var1), var2, false, "too far"));
      } else if (var1.c_() >= var4) {
         this.id_break.id_class.id_class(new rvj_3(var1, this.id_class.id_byte(var1), var2, false, "too high"));
      } else if (var2 == rZM.START_DESTROY_BLOCK) {
         if (!this.id_class.id_class(this.id_break, var1)) {
            this.id_break.id_class.id_class(new rvj_3(var1, this.id_class.id_byte(var1), var2, false, "may not interact"));
            return;
         }

         if (this.id_throws()) {
            this.id_class(var1, var2, "creative destroy");
            return;
         }

         if (this.id_break.id_class(this.id_class, var1, this.id_protected)) {
            this.id_break.id_class.id_class(new rvj_3(var1, this.id_class.id_byte(var1), var2, false, "block action restricted"));
            return;
         }

         this.id_catch = this.id_implements;
         float var13 = 1.0F;
         xc_3 var14 = this.id_class.id_byte(var1);
         if (!var14.id_catch()) {
            var14.id_class(this.id_class, var1, this.id_break);
            var13 = var14.id_class(this.id_break, (rYB)this.id_break.id_throws[7], var1);
         }

         if (!var14.id_catch() && var13 >= 1.0F) {
            this.id_class(var1, var2, "insta mine");
         } else {
            if (this.id_case) {
               this.id_break
                  .id_class
                  .id_class(
                     new rvj_3(
                        this.id_private,
                        this.id_class.id_byte(this.id_private),
                        rZM.START_DESTROY_BLOCK,
                        false,
                        "abort destroying since another started (client insta mine, server disagreed)"
                     )
                  );
            }

            this.id_case = true;
            this.id_private = var1.id_int();
            int var15 = (int)(var13 * 10.0F);
            this.id_class.id_class(this.id_break.V(), var1, var15);
            this.id_break.id_class.id_class(new rvj_3(var1, this.id_class.id_byte(var1), var2, true, "actual start of destroying"));
            this.id_volatile = var15;
         }
      } else if (var2 == rZM.STOP_DESTROY_BLOCK) {
         if (var1.equals(this.id_private)) {
            int var16 = this.id_implements - this.id_catch;
            xc_3 var17 = this.id_class.id_byte(var1);
            if (!var17.id_catch()) {
               float var18 = var17.id_class(this.id_break, (rYB)this.id_break.id_throws[7], var1) * (float)(var16 + 1);
               if (var18 >= 0.7F) {
                  this.id_case = false;
                  this.id_class.id_class(this.id_break.V(), var1, -1);
                  this.id_class(var1, var2, "destroyed");
                  return;
               }

               if (!this.id_finally) {
                  this.id_case = false;
                  this.id_finally = true;
                  this.id_extends = var1;
                  this.id_native = this.id_catch;
               }
            }
         }

         this.id_break.id_class.id_class(new rvj_3(var1, this.id_class.id_byte(var1), var2, true, "stopped destroying"));
      } else if (var2 == rZM.ABORT_DESTROY_BLOCK) {
         this.id_case = false;
         if (!Objects.equals(this.id_private, var1)) {
            id_byte.warn("Mismatch in destroy block pos: " + this.id_private + " " + var1);
            this.id_class.id_class(this.id_break.V(), this.id_private, -1);
            this.id_break.id_class.id_class(new rvj_3(this.id_private, this.id_class.id_byte(this.id_private), var2, true, "aborted mismatched destroying"));
         }

         this.id_class.id_class(this.id_break.V(), var1, -1);
         this.id_break.id_class.id_class(new rvj_3(var1, this.id_class.id_byte(var1), var2, true, "aborted destroying"));
      }
   }

   public void id_class(rRl_1 var1) {
      this.id_class(var1, var1 != this.id_protected ? this.id_protected : this.id_throws);
   }

   public rRl_1 id_break() {
      return this.id_protected;
   }

   public void id_break(rRl_1 var1) {
      if (this.id_protected == rRl_1.NOT_SET) {
         this.id_protected = var1;
      }

      this.id_class(this.id_protected);
   }

   public boolean id_throws() {
      return this.id_protected.id_throws();
   }

   public boolean id_protected() {
      return this.id_protected.id_case();
   }
}
