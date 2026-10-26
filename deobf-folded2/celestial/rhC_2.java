package celestial;

import java.util.Random;
import java.util.UUID;

public class rhC_2 extends an_3 {
   private int id_class;
   private boolean id_break;
   private int id_protected = 22;
   private boolean id_catch;
   private iB_2 id_private;
   private UUID id_implements;

   private void id_byte(iB_2 var1) {
      iB_2 var2 = this.id_protected();
      if (var1.BM() && !var1.rg() && var1 != var2) {
         if (var2 == null) {
            var1.id_break(rye_3.id_package, 6.0F);
         } else {
            if (var2.id_final(var1)) {
               return;
            }

            var1.id_break(rye_3.id_byte(this, var2), 6.0F);
         }
      }
   }

   public float id_byte(float var1) {
      if (!this.id_catch) {
         return 0.0F;
      } else {
         int var2 = this.id_protected - 2;
         return var2 <= 0 ? 1.0F : 1.0F - ((float)var2 - var1) / 20.0F;
      }
   }

   public rhC_2(rYB var1, double var2, double var4, double var6, float var8, int var9, iB_2 var10) {
      this(aI_2.id_public, var1);
      this.id_class = var9;
      this.id_class(var10);
      Float var15 = var8 * (180.0F / (float)Math.PI);
      this.id_throws[15] = var15;
      this.id_new(var2, var4, var6);
   }

   public rhC_2(aI_2<? extends rhC_2> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   public void id_this() {
      super.id_this();
      if (((rYB)this.id_throws[7]).id_continue) {
         if (this.id_catch) {
            this.id_protected--;
            if (this.id_protected == 14) {
               for (int var1 = 0; var1 < 12; var1++) {
                  double var2 = this.rx() + (((Random)this.id_throws[40]).nextDouble() * 2.0 - 1.0) * (double)this.PN() * 0.5;
                  double var4 = this.re() + 0.05 + ((Random)this.id_throws[40]).nextDouble();
                  double var6 = this.BO() + (((Random)this.id_throws[40]).nextDouble() * 2.0 - 1.0) * (double)this.PN() * 0.5;
                  double var8 = (((Random)this.id_throws[40]).nextDouble() * 2.0 - 1.0) * 0.3;
                  double var10 = 0.3 + ((Random)this.id_throws[40]).nextDouble() * 0.3;
                  double var12 = (((Random)this.id_throws[40]).nextDouble() * 2.0 - 1.0) * 0.3;
                  ((rYB)this.id_throws[7]).id_class(rLQ.id_catch, var2, var4 + 1.0, var6, var8, var10, var12);
               }
            }
         }
      } else if (--this.id_class < 0) {
         if (this.id_class == -8) {
            for (iB_2 var15 : ((rYB)this.id_throws[7]).id_class(iB_2.class, this.rN().id_byte(0.2, 0.0, 0.2))) {
               this.id_byte(var15);
            }
         }

         if (!this.id_break) {
            ((rYB)this.id_throws[7]).id_class(this, (byte)4);
            this.id_break = true;
         }

         if (--this.id_protected < 0) {
            this.PD();
         }
      }
   }

   @Override
   protected void id_class(rcd_3 var1) {
      var1.id_break("Warmup", this.id_class);
      if (this.id_implements != null) {
         var1.id_class("Owner", this.id_implements);
      }
   }

   @Override
   public void id_class(byte var1) {
      super.id_class(var1);
      if (var1 == 4) {
         this.id_catch = true;
         if (!this.BF()) {
            ((rYB)this.id_throws[7])
               .id_class(this.rx(), this.re(), this.BO(), rqn_3.BU, this.Pr(), 1.0F, ((Random)this.id_throws[40]).nextFloat() * 0.2F + 0.85F, false);
         }
      }
   }

   public void id_class(iB_2 var1) {
      this.id_private = var1;
      this.id_implements = var1 == null ? null : var1.ro();
   }

   @Override
   protected void id_break(rcd_3 var1) {
      this.id_class = var1.id_private("Warmup");
      if (var1.id_break("Owner")) {
         this.id_implements = var1.id_class("Owner");
      }
   }

   public iB_2 id_protected() {
      if (this.id_private == null && this.id_implements != null && (rYB)this.id_throws[7] instanceof rrEm_1) {
         an_3 var1 = ((rrEm_1)((rYB)this.id_throws[7])).id_break(this.id_implements);
         if (var1 instanceof iB_2) {
            this.id_private = (iB_2)var1;
         }
      }

      return this.id_private;
   }

   @Override
   protected void m_() {
   }

   @Override
   public ruS_2<?> p_() {
      return new rFJ(this);
   }
}
