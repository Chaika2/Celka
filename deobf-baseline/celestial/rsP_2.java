package celestial;

import java.util.Random;
import java.util.Map.Entry;

public class rsP_2 extends an_3 {
   public int id_class;
   public int id_break;
   public int id_protected;
   private int id_catch = 5;
   private int id_private;
   private rhd_3 id_implements;
   private int id_finally;

   private int id_byte(int var1) {
      return var1 * 2;
   }

   public rsP_2(rYB var1, double var2, double var4, double var6, int var8) {
      this(aI_2.id_goto, var1);
      this.id_new(var2, var4, var6);
      Float var13 = (float)(((Random)this.id_throws[40]).nextDouble() * 360.0);
      this.id_throws[15] = var13;
      this.id_catch(
         (((Random)this.id_throws[40]).nextDouble() * 0.2F - 0.1F) * 2.0,
         ((Random)this.id_throws[40]).nextDouble() * 0.2 * 2.0,
         (((Random)this.id_throws[40]).nextDouble() * 0.2F - 0.1F) * 2.0
      );
      this.id_private = var8;
   }

   public rsP_2(aI_2<? extends rsP_2> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   public void id_this() {
      super.id_this();
      if (this.id_protected > 0) {
         this.id_protected--;
      }

      Double var12 = this.rx();
      this.id_throws[8] = var12;
      Double var13 = this.re();
      this.id_throws[9] = var13;
      Double var14 = this.BO();
      this.id_throws[10] = var14;
      if (this.id_class(rlG_2.id_break)) {
         this.id_case();
      } else if (!this.rw()) {
         this.id_byte(this.rv().id_break(0.0, -0.03, 0.0));
      }

      if (((rYB)this.id_throws[7]).id_break(this.Bs()).id_class(rlG_2.id_byte)) {
         this.id_catch(
            (double)((((Random)this.id_throws[40]).nextFloat() - ((Random)this.id_throws[40]).nextFloat()) * 0.2F),
            0.2F,
            (double)((((Random)this.id_throws[40]).nextFloat() - ((Random)this.id_throws[40]).nextFloat()) * 0.2F)
         );
         this.id_class(rqn_3.Sf, 0.4F, 2.0F + ((Random)this.id_throws[40]).nextFloat() * 0.4F);
      }

      if (!((rYB)this.id_throws[7]).id_break(this.rN())) {
         this.id_protected(this.rx(), (this.rN().id_break + this.rN().id_throws) / 2.0, this.BO());
      }

      double var1 = 8.0;
      if (this.id_finally < this.id_class - 20 + this.V() % 100) {
         if (this.id_implements == null || this.id_implements.id_int(this) > 64.0) {
            this.id_implements = ((rYB)this.id_throws[7]).id_class(this, 8.0);
         }

         this.id_finally = this.id_class;
      }

      if (this.id_implements != null && this.id_implements.id_native()) {
         this.id_implements = null;
      }

      if (this.id_implements != null) {
         rjU_2 var3 = new rjU_2(
            this.id_implements.rx() - this.rx(),
            this.id_implements.re() + (double)this.id_implements.Bx() / 2.0 - this.re(),
            this.id_implements.BO() - this.BO()
         );
         double var4 = var3.id_catch();
         if (var4 < 64.0) {
            double var6 = 1.0 - Math.sqrt(var4) / 8.0;
            this.id_byte(this.rv().id_throws(var3.id_protected().id_class(var6 * var6 * 0.1)));
         }
      }

      this.id_class(iG_2.SELF, this.rv());
      float var15 = 0.98F;
      if ((Boolean)this.id_throws[20]) {
         var15 = ((rYB)this.id_throws[7]).id_byte(new rfH_2(this.rx(), this.re() - 1.0, this.BO())).id_break().id_final() * 0.98F;
      }

      this.id_byte(this.rv().id_throws((double)var15, 0.98, (double)var15));
      if ((Boolean)this.id_throws[20]) {
         this.id_byte(this.rv().id_throws(1.0, -0.9, 1.0));
      }

      this.id_class++;
      this.id_break++;
      if (this.id_break >= 6000) {
         this.PD();
      }
   }

   @Override
   public void id_class(rcd_3 var1) {
      var1.id_class("Health", (short)this.id_catch);
      var1.id_class("Age", (short)this.id_break);
      var1.id_class("Value", (short)this.id_private);
   }

   public static int id_class(int var0) {
      if (var0 >= 2477) {
         return 2477;
      } else if (var0 >= 1237) {
         return 1237;
      } else if (var0 >= 617) {
         return 617;
      } else if (var0 >= 307) {
         return 307;
      } else if (var0 >= 149) {
         return 149;
      } else if (var0 >= 73) {
         return 73;
      } else if (var0 >= 37) {
         return 37;
      } else if (var0 >= 17) {
         return 17;
      } else if (var0 >= 7) {
         return 7;
      } else {
         return var0 >= 3 ? 3 : 1;
      }
   }

   @Override
   protected void U() {
   }

   private int id_break(int var1) {
      return var1 / 2;
   }

   @Override
   public void id_break(rcd_3 var1) {
      this.id_catch = var1.id_catch("Health");
      this.id_break = var1.id_catch("Age");
      this.id_private = var1.id_catch("Value");
   }

   @Override
   public boolean id_break(rye_3 var1, float var2) {
      if (this.id_class(var1)) {
         return false;
      } else {
         this.rf();
         this.id_catch = (int)((float)this.id_catch - var2);
         if (this.id_catch <= 0) {
            this.PD();
         }

         return false;
      }
   }

   public int id_throws() {
      if (this.id_private >= 2477) {
         return 10;
      } else if (this.id_private >= 1237) {
         return 9;
      } else if (this.id_private >= 617) {
         return 8;
      } else if (this.id_private >= 307) {
         return 7;
      } else if (this.id_private >= 149) {
         return 6;
      } else if (this.id_private >= 73) {
         return 5;
      } else if (this.id_private >= 37) {
         return 4;
      } else if (this.id_private >= 17) {
         return 3;
      } else if (this.id_private >= 7) {
         return 2;
      } else {
         return this.id_private >= 3 ? 1 : 0;
      }
   }

   @Override
   public boolean rt() {
      return false;
   }

   private void id_case() {
      rjU_2 var1 = this.rv();
      this.id_catch(var1.id_break * 0.99F, Math.min(var1.id_byte + 5.0E-4F, 0.06F), var1.id_protected * 0.99F);
   }

   public int id_protected() {
      return this.id_private;
   }

   @Override
   protected boolean PK() {
      return false;
   }

   @Override
   protected void m_() {
   }

   @Override
   public ruS_2<?> p_() {
      return new rFO(this);
   }

   @Override
   public void c_(rhd_3 var1) {
      if (!((rYB)this.id_throws[7]).id_continue && this.id_protected == 0 && (Integer)var1.id_implements[9] == 0) {
         Integer var9 = 2;
         var1.id_implements[9] = var9;
         var1.id_class(this, 1);
         Entry var2 = eA_2.id_class(eY_2.id_import, var1, rdn_3::id_case);
         if (var2 != null) {
            rdn_3 var3 = (rdn_3)var2.getValue();
            if (!var3.id_class() && var3.id_case()) {
               int var4 = Math.min(this.id_byte(this.id_private), var3.id_catch());
               this.id_private = this.id_private - this.id_break(var4);
               var3.id_break(var3.id_catch() - var4);
            }
         }

         if (this.id_private > 0) {
            var1.id_this(this.id_private);
         }

         this.PD();
      }
   }
}
