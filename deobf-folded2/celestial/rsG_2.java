package celestial;

import java.util.Random;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rsG_2 extends rsS_2 {
   private static final Logger id_catch = LogManager.getLogger();
   private static final rut_3<rdn_3> id_private = rmE_2.id_class(rsG_2.class, ruw_3.id_catch);
   private static final rut_3<Integer> id_implements = rmE_2.id_class(rsG_2.class, ruw_3.id_break);
   private float id_finally = 1.0F;
   private boolean id_extends;

   private void id_byte(rdn_3 var1) {
      if (var1.id_break() == rdy_3.JX) {
         rrGb_1 var2 = rxI_2.id_break(var1, (rYB)this.id_throws[7]);
         var2.id_class(this.id_break, this.V());
         var2.id_class(true);
      }

      var1.id_class((an_3)null);
   }

   public int id_int() {
      return this.id_final().id_class() ? 0 : this.id_package() % 8 + 1;
   }

   public rsG_2(aI_2<? extends rsG_2> var1, rYB var2) {
      super(var1, var2);
   }

   public rsG_2(rYB var1, rfH_2 var2, rpr_3 var3) {
      super(aI_2.id_default, var1, var2);
      this.id_class(var3);
   }

   @Override
   public float f() {
      return 0.0F;
   }

   @Override
   public ryZ_2 id_class(rhd_3 var1, rpm_3 var2) {
      rdn_3 var3 = var1.id_protected(var2);
      boolean var4 = !this.id_final().id_class();
      boolean var5 = !var3.id_class();
      if (this.id_extends) {
         return ryZ_2.PASS;
      } else if (!((rYB)this.id_throws[7]).id_continue) {
         if (!var4) {
            if (var5 && !(Boolean)this.id_throws[27]) {
               this.id_break(var3);
               if (!((rhx_3)var1.id_implements[18]).id_protected) {
                  var3.id_catch(1);
               }
            }
         } else {
            this.id_class(rqn_3.EV, 1.0F, 1.0F);
            this.id_class(this.id_package() + 1);
         }

         return ryZ_2.CONSUME;
      } else {
         return !var4 && !var5 ? ryZ_2.PASS : ryZ_2.SUCCESS;
      }
   }

   @Override
   public boolean id_class(double var1) {
      double var3 = 16.0;
      var3 = var3 * 64.0 * Br();
      return var1 < var3 * var3;
   }

   public void id_class(rdn_3 var1, boolean var2) {
      if (!var1.id_class()) {
         var1 = var1.id_implements();
         var1.id_throws(1);
         var1.id_class(this);
      }

      this.BQ().id_break(id_private, var1);
      if (!var1.id_class()) {
         this.id_class(rqn_3.Ew, 1.0F, 1.0F);
      }

      if (var2 && this.id_break != null) {
         ((rYB)this.id_throws[7]).id_byte(this.id_break, xu_3.id_class);
      }
   }

   @Override
   public boolean id_class(int var1, rdn_3 var2) {
      if (var1 == 0) {
         this.id_break(var2);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void id_class(an_3 var1) {
      this.id_class(rqn_3.EI, 1.0F, 1.0F);
      this.id_break(var1, true);
   }

   @Override
   protected void id_class(rpr_3 var1) {
      Validate.notNull(var1);
      this.id_protected = var1;
      if (var1.id_final().id_protected()) {
         Float var6 = 0.0F;
         this.id_throws[16] = var6;
         Float var7 = (float)(this.id_protected.id_protected() * 90);
         this.id_throws[15] = var7;
      } else {
         Float var8 = (float)(-90 * var1.id_throws().id_class());
         this.id_throws[16] = var8;
         Float var9 = 0.0F;
         this.id_throws[15] = var9;
      }

      Float var10 = (Float)this.id_throws[16];
      this.id_throws[18] = var10;
      Float var11 = (Float)this.id_throws[15];
      this.id_throws[17] = var11;
      this.id_protected();
   }

   @Override
   protected float id_class(iM_2 var1, ap_3 var2) {
      return 0.0F;
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      if (!this.id_final().id_class()) {
         var1.id_class("Item", this.id_final().id_break(new rcd_3()));
         var1.id_class("ItemRotation", (byte)this.id_package());
         var1.id_class("ItemDropChance", this.id_finally);
      }

      var1.id_class("Facing", (byte)this.id_protected.id_byte());
      var1.id_class("Invisible", this.Pp());
      var1.id_class("Fixed", this.id_extends);
   }

   private void id_class(int var1, boolean var2) {
      this.BQ().id_break(id_implements, var1 % 8);
      if (var2 && this.id_break != null) {
         ((rYB)this.id_throws[7]).id_byte(this.id_break, xu_3.id_class);
      }
   }

   @Override
   public void id_class(iG_2 var1, rjU_2 var2) {
      if (!this.id_extends) {
         super.id_class(var1, var2);
      }
   }

   @Override
   public void id_class(rut_3<?> var1) {
      if (var1.equals(id_private)) {
         rdn_3 var2 = this.id_final();
         if (!var2.id_class() && var2.id_while() != this) {
            var2.id_class(this);
         }
      }
   }

   public void id_class(int var1) {
      this.id_class(var1, true);
   }

   @Override
   public void j() {
      this.id_byte(this.id_final());
      super.j();
   }

   public void id_break(rdn_3 var1) {
      this.id_class(var1, true);
   }

   private void id_break(an_3 var1, boolean var2) {
      if (!this.id_extends) {
         rdn_3 var3 = this.id_final();
         this.id_break(rdn_3.id_break);
         if (!((rYB)this.id_throws[7]).B().id_break(rRu_1.id_catch)) {
            if (var1 == null) {
               this.id_byte(var3);
            }
         } else {
            if (var1 instanceof rhd_3 var4 && ((rhx_3)var4.id_implements[18]).id_protected) {
               this.id_byte(var3);
               return;
            }

            if (var2) {
               this.id_class(rdy_3.dB);
            }

            if (!var3.id_class()) {
               var3 = var3.id_implements();
               this.id_byte(var3);
               if (((Random)this.id_throws[40]).nextFloat() < this.id_finally) {
                  this.a_(var3);
               }
            }
         }
      }
   }

   @Override
   public boolean id_break(rye_3 var1, float var2) {
      if (!this.id_extends) {
         if (this.id_class(var1)) {
            return false;
         } else if (!var1.id_protected() && !this.id_final().id_class()) {
            if (!((rYB)this.id_throws[7]).id_continue) {
               this.id_break(var1.id_extends(), false);
               this.id_class(rqn_3.Ej, 1.0F, 1.0F);
            }

            return true;
         } else {
            return super.id_break(var1, var2);
         }
      } else {
         return var1 != rye_3.id_volatile && !var1.id_synchronized() ? false : super.id_break(var1, var2);
      }
   }

   @Override
   public void id_break(rcd_3 var1) {
      super.id_break(var1);
      rcd_3 var2 = var1.id_int("Item");
      if (var2 != null && !var2.id_case()) {
         rdn_3 var3 = rdn_3.id_class(var2);
         if (var3.id_class()) {
            id_catch.warn("Unable to load item from: {}", var2);
         }

         rdn_3 var4 = this.id_final();
         if (!var4.id_class() && !rdn_3.id_break(var3, var4)) {
            this.id_byte(var4);
         }

         this.id_class(var3, false);
         this.id_class(var1.id_case("ItemRotation"), false);
         if (var1.id_byte("ItemDropChance", 99)) {
            this.id_finally = var1.id_finally("ItemDropChance");
         }
      }

      this.id_class(rpr_3.id_class(var1.id_case("Facing")));
      this.id_package(var1.id_new("Invisible"));
      this.id_extends = var1.id_new("Fixed");
   }

   @Override
   public boolean id_throws() {
      if (this.id_extends) {
         return true;
      } else if (!((rYB)this.id_throws[7]).id_throws(this)) {
         return false;
      } else {
         xc_3 var1 = ((rYB)this.id_throws[7]).id_byte(this.id_break.id_break(this.id_protected.id_case()));
         return !var1.id_byte().id_break() && (!this.id_protected.id_final().id_protected() || !Wk_1.id_volatile(var1))
            ? false
            : ((rYB)this.id_throws[7]).id_break(this, this.rN(), id_class).isEmpty();
      }
   }

   @Override
   public int id_catch() {
      return 12;
   }

   @Override
   public int id_case() {
      return 12;
   }

   @Override
   public void id_implements(double var1, double var3, double var5) {
      if (!this.id_extends) {
         super.id_implements(var1, var3, var5);
      }
   }

   public int id_package() {
      return this.BQ().id_class(id_implements);
   }

   @Override
   protected void id_protected() {
      if (this.id_protected != null) {
         double var1 = 0.46875;
         double var3 = (double)this.id_break.b_() + 0.5 - (double)this.id_protected.id_implements() * 0.46875;
         double var5 = (double)this.id_break.c_() + 0.5 - (double)this.id_protected.id_finally() * 0.46875;
         double var7 = (double)this.id_break.d_() + 0.5 - (double)this.id_protected.id_extends() * 0.46875;
         this.id_volatile(var3, var5, var7);
         double var9 = (double)this.id_case();
         double var11 = (double)this.id_catch();
         double var13 = (double)this.id_case();
         rpB_2 var15 = this.id_protected.id_final();
         switch (var15) {
            case X:
               var9 = 1.0;
               break;
            case Y:
               var11 = 1.0;
               break;
            case Z:
               var13 = 1.0;
         }

         var9 /= 32.0;
         var11 /= 32.0;
         var13 /= 32.0;
         this.id_class(new rfl_3(var3 - var9, var5 - var11, var7 - var13, var3 + var9, var5 + var11, var7 + var13));
      }
   }

   @Override
   public void id_private() {
      this.id_class(rqn_3.Ef, 1.0F, 1.0F);
   }

   public rdn_3 id_final() {
      return this.BQ().id_class(id_private);
   }

   @Override
   protected void m_() {
      this.BQ().id_class(id_private, rdn_3.id_break);
      this.BQ().id_class(id_implements, 0);
   }

   @Override
   public ruS_2<?> p_() {
      return new rFJ(this, this.BC(), this.id_protected.id_byte(), this.id_implements());
   }
}
