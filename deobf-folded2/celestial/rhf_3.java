package celestial;

import java.util.Random;
import java.util.UUID;

public abstract class rhf_3 extends an_3 {
   private UUID id_class;
   private int id_break;
   private boolean id_protected;

   public void id_byte(double var1, double var3, double var5, float var7, float var8) {
      rjU_2 var9 = new rjU_2(var1, var3, var5)
         .id_protected()
         .id_break(
            ((Random)this.id_throws[40]).nextGaussian() * 0.0075F * (double)var8,
            ((Random)this.id_throws[40]).nextGaussian() * 0.0075F * (double)var8,
            ((Random)this.id_throws[40]).nextGaussian() * 0.0075F * (double)var8
         )
         .id_class((double)var7);
      this.id_byte(var9);
      float var10 = rfU_2.id_class(id_case(var9));
      Float var15 = (float)(rfU_2.id_protected(var9.id_break, var9.id_protected) * 180.0F / (float)Math.PI);
      this.id_throws[15] = var15;
      Float var16 = (float)(rfU_2.id_protected(var9.id_byte, (double)var10) * 180.0F / (float)Math.PI);
      this.id_throws[16] = var16;
      Float var17 = (Float)this.id_throws[15];
      this.id_throws[17] = var17;
      Float var18 = (Float)this.id_throws[16];
      this.id_throws[18] = var18;
   }

   rhf_3(aI_2<? extends rhf_3> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   public void id_this() {
      if (!this.id_protected) {
         this.id_protected = this.id_protected();
      }

      super.id_this();
   }

   protected void id_class(rff_3 var1) {
      xc_3 var2 = ((rYB)this.id_throws[7]).id_byte(var1.id_class());
      var2.id_class((rYB)this.id_throws[7], var2, var1, this);
   }

   public void id_class(an_3 var1, float var2, float var3, float var4, float var5, float var6) {
      float var7 = -rfU_2.id_class(var3 * (float) (Math.PI / 180.0)) * rfU_2.id_break(var2 * (float) (Math.PI / 180.0));
      float var8 = -rfU_2.id_class((var2 + var4) * (float) (Math.PI / 180.0));
      float var9 = rfU_2.id_break(var3 * (float) (Math.PI / 180.0)) * rfU_2.id_break(var2 * (float) (Math.PI / 180.0));
      this.id_byte((double)var7, (double)var8, (double)var9, var5, var6);
      rjU_2 var10 = var1.rv();
      this.id_byte(this.rv().id_break(var10.id_break, var1.BL() ? 0.0 : var10.id_byte, var10.id_protected));
   }

   protected void id_class(rjG_2 var1) {
      rjM_2 var2 = var1.id_byte();
      if (var2 == rjM_2.ENTITY) {
         this.id_class((rfo_3)var1);
      } else if (var2 == rjM_2.BLOCK) {
         this.id_class((rff_3)var1);
      }
   }

   protected boolean id_class(an_3 var1) {
      if (!var1.id_native() && var1.BM() && var1.rY()) {
         an_3 var2 = this.id_else();
         return var2 == null || this.id_protected || !var2.id_return(var1);
      } else {
         return false;
      }
   }

   protected void id_class(rfo_3 var1) {
   }

   @Override
   protected void id_class(rcd_3 var1) {
      if (this.id_class != null) {
         var1.id_class("Owner", this.id_class);
      }

      if (this.id_protected) {
         var1.id_class("LeftOwner", true);
      }
   }

   public void id_break(an_3 var1) {
      if (var1 != null) {
         this.id_class = var1.ro();
         this.id_break = var1.V();
      }
   }

   protected static float id_break(float var0, float var1) {
      while (var1 - var0 < -180.0F) {
         var0 -= 360.0F;
      }

      while (var1 - var0 >= 180.0F) {
         var0 += 360.0F;
      }

      return rfU_2.id_catch(0.2F, var0, var1);
   }

   @Override
   protected void id_break(rcd_3 var1) {
      if (var1.id_break("Owner")) {
         this.id_class = var1.id_class("Owner");
      }

      this.id_protected = var1.id_new("LeftOwner");
   }

   @Override
   public void id_extends(double var1, double var3, double var5) {
      this.id_catch(var1, var3, var5);
      if ((Float)this.id_throws[18] == 0.0F && (Float)this.id_throws[17] == 0.0F) {
         float var7 = rfU_2.id_class(var1 * var1 + var5 * var5);
         Float var12 = (float)(rfU_2.id_protected(var3, (double)var7) * 180.0F / (float)Math.PI);
         this.id_throws[16] = var12;
         Float var13 = (float)(rfU_2.id_protected(var1, var5) * 180.0F / (float)Math.PI);
         this.id_throws[15] = var13;
         Float var14 = (Float)this.id_throws[16];
         this.id_throws[18] = var14;
         Float var15 = (Float)this.id_throws[15];
         this.id_throws[17] = var15;
         this.id_class(this.rx(), this.re(), this.BO(), (Float)this.id_throws[15], (Float)this.id_throws[16]);
      }
   }

   public an_3 id_else() {
      if (this.id_class != null && (rYB)this.id_throws[7] instanceof rrEm_1) {
         return ((rrEm_1)((rYB)this.id_throws[7])).id_break(this.id_class);
      } else {
         return this.id_break != 0 ? ((rYB)this.id_throws[7]).id_break(this.id_break) : null;
      }
   }

   protected void id_return() {
      rjU_2 var1 = this.rv();
      float var2 = rfU_2.id_class(id_case(var1));
      Float var7 = id_break((Float)this.id_throws[18], (float)(rfU_2.id_protected(var1.id_byte, (double)var2) * 180.0F / (float)Math.PI));
      this.id_throws[16] = var7;
      Float var8 = id_break((Float)this.id_throws[17], (float)(rfU_2.id_protected(var1.id_break, var1.id_protected) * 180.0F / (float)Math.PI));
      this.id_throws[15] = var8;
   }

   private boolean id_protected() {
      an_3 var1 = this.id_else();
      if (var1 != null) {
         for (an_3 var3 : ((rYB)this.id_throws[7]).id_break(this, this.rN().id_break(this.rv()).id_class(1.0), var0 -> !var0.id_native() && var0.rY())) {
            if (var3.PO() == var1.PO()) {
               return false;
            }
         }
      }

      return true;
   }
}
