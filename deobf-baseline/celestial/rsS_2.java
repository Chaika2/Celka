package celestial;

import java.util.function.Predicate;
import org.apache.commons.lang3.Validate;

public abstract class rsS_2 extends an_3 {
   protected static final Predicate<an_3> id_class = var0 -> var0 instanceof rsS_2;
   private int id_catch;
   protected rfH_2 id_break;
   protected rpr_3 id_protected = rpr_3.SOUTH;

   protected rsS_2(aI_2<? extends rsS_2> var1, rYB var2) {
      super(var1, var2);
   }

   protected rsS_2(aI_2<? extends rsS_2> var1, rYB var2, rfH_2 var3) {
      this(var1, var2);
      this.id_break = var3;
   }

   @Override
   public void id_this() {
      if (!((rYB)this.id_throws[7]).id_continue) {
         if (this.re() < -64.0) {
            this.PQ();
         }

         if (this.id_catch++ == 100) {
            this.id_catch = 0;
            if (!(Boolean)this.id_throws[27] && !this.id_throws()) {
               this.PD();
               this.id_class((an_3)null);
            }
         }
      }
   }

   @Override
   public void id_class(rcd_3 var1) {
      rfH_2 var2 = this.id_implements();
      var1.id_break("TileX", var2.b_());
      var1.id_break("TileY", var2.c_());
      var1.id_break("TileZ", var2.d_());
   }

   @Override
   public rsE_2 id_class(rdn_3 var1, float var2) {
      rsE_2 var3 = new rsE_2(
         (rYB)this.id_throws[7],
         this.rx() + (double)((float)this.id_protected.id_implements() * 0.15F),
         this.re() + (double)var2,
         this.BO() + (double)((float)this.id_protected.id_extends() * 0.15F),
         var1
      );
      var3.id_private();
      ((rYB)this.id_throws[7]).a_(var3);
      return var3;
   }

   @Override
   public float id_class(rqd_3 var1) {
      if (this.id_protected.id_final() != rpB_2.Y) {
         switch (var1) {
            case CLOCKWISE_180:
               this.id_protected = this.id_protected.id_case();
               break;
            case COUNTERCLOCKWISE_90:
               this.id_protected = this.id_protected.id_private();
               break;
            case CLOCKWISE_90:
               this.id_protected = this.id_protected.id_catch();
         }
      }

      float var2 = rfU_2.id_catch((Float)this.id_throws[15]);
      switch (var1) {
         case CLOCKWISE_180:
            return var2 + 180.0F;
         case COUNTERCLOCKWISE_90:
            return var2 + 90.0F;
         case CLOCKWISE_90:
            return var2 + 270.0F;
         default:
            return var2;
      }
   }

   public abstract void id_class(an_3 var1);

   @Override
   public void id_class(iG_2 var1, rjU_2 var2) {
      if (!((rYB)this.id_throws[7]).id_continue && !(Boolean)this.id_throws[27] && var2.id_catch() > 0.0) {
         this.PD();
         this.id_class((an_3)null);
      }
   }

   protected void id_class(rpr_3 var1) {
      Validate.notNull(var1);
      Validate.isTrue(var1.id_final().id_protected());
      this.id_protected = var1;
      Float var6 = (float)(this.id_protected.id_protected() * 90);
      this.id_throws[15] = var6;
      Float var7 = (Float)this.id_throws[15];
      this.id_throws[17] = var7;
      this.id_protected();
   }

   private double id_class(int var1) {
      return var1 % 32 == 0 ? 0.5 : 0.0;
   }

   @Override
   public void id_class(rrEm_1 var1, rSg_1 var2) {
   }

   @Override
   public float id_class(rpa_3 var1) {
      return this.id_class(var1.id_class(this.id_protected));
   }

   @Override
   public void id_break(rcd_3 var1) {
      this.id_break = new rfH_2(var1.id_private("TileX"), var1.id_private("TileY"), var1.id_private("TileZ"));
   }

   @Override
   public boolean id_break(rye_3 var1, float var2) {
      if (this.id_class(var1)) {
         return false;
      } else {
         if (!(Boolean)this.id_throws[27] && !((rYB)this.id_throws[7]).id_continue) {
            this.PD();
            this.rf();
            this.id_class(var1.id_extends());
         }

         return true;
      }
   }

   public boolean id_throws() {
      if (!((rYB)this.id_throws[7]).id_throws(this)) {
         return false;
      } else {
         int var1 = Math.max(1, this.id_case() / 16);
         int var2 = Math.max(1, this.id_catch() / 16);
         rfH_2 var3 = this.id_break.id_break(this.id_protected.id_case());
         rpr_3 var4 = this.id_protected.id_private();
         rfw_3 var5 = new rfw_3();

         for (int var6 = 0; var6 < var1; var6++) {
            for (int var7 = 0; var7 < var2; var7++) {
               int var8 = (var1 - 1) / -2;
               int var9 = (var2 - 1) / -2;
               var5.id_class(var3).id_byte(var4, var6 + var8).id_byte(rpr_3.UP, var7 + var9);
               xc_3 var10 = ((rYB)this.id_throws[7]).id_byte(var5);
               if (!var10.id_byte().id_break() && !Wk_1.id_volatile(var10)) {
                  return false;
               }
            }
         }

         return ((rYB)this.id_throws[7]).id_break(this, this.rN(), id_class).isEmpty();
      }
   }

   @Override
   public boolean id_finally(an_3 var1) {
      if (var1 instanceof rhd_3 var2) {
         return !((rYB)this.id_throws[7]).id_class(var2, this.id_break) ? true : this.id_break(rye_3.id_class(var2), 0.0F);
      } else {
         return false;
      }
   }

   public abstract int id_catch();

   public abstract int id_case();

   @Override
   public void id_implements(double var1, double var3, double var5) {
      if (!((rYB)this.id_throws[7]).id_continue && !(Boolean)this.id_throws[27] && var1 * var1 + var3 * var3 + var5 * var5 > 0.0) {
         this.PD();
         this.id_class((an_3)null);
      }
   }

   public rfH_2 id_implements() {
      return this.id_break;
   }

   @Override
   public void id_new(double var1, double var3, double var5) {
      this.id_break = new rfH_2(var1, var3, var5);
      this.id_protected();
      Boolean var11 = true;
      this.id_throws[57] = var11;
   }

   protected void id_protected() {
      if (this.id_protected != null) {
         double var1 = (double)this.id_break.b_() + 0.5;
         double var3 = (double)this.id_break.c_() + 0.5;
         double var5 = (double)this.id_break.d_() + 0.5;
         double var7 = 0.46875;
         double var9 = this.id_class(this.id_case());
         double var11 = this.id_class(this.id_catch());
         var1 -= (double)this.id_protected.id_implements() * 0.46875;
         var5 -= (double)this.id_protected.id_extends() * 0.46875;
         var3 += var11;
         rpr_3 var13 = this.id_protected.id_private();
         var1 += var9 * (double)var13.id_implements();
         var5 += var9 * (double)var13.id_extends();
         this.id_volatile(var1, var3, var5);
         double var14 = (double)this.id_case();
         double var16 = (double)this.id_catch();
         double var18 = (double)this.id_case();
         if (this.id_protected.id_final() == rpB_2.Z) {
            var18 = 1.0;
         } else {
            var14 = 1.0;
         }

         var14 /= 32.0;
         var16 /= 32.0;
         var18 /= 32.0;
         this.id_class(new rfl_3(var1 - var14, var3 - var16, var5 - var18, var1 + var14, var3 + var16, var5 + var18));
      }
   }

   public abstract void id_private();

   @Override
   public boolean rY() {
      return true;
   }

   @Override
   protected boolean BZ() {
      return false;
   }

   @Override
   public rpr_3 Pg() {
      return this.id_protected;
   }

   @Override
   protected void m_() {
   }

   @Override
   public void q_() {
   }
}
