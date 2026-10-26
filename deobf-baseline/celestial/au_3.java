package celestial;

import java.util.Random;

public abstract class au_3 extends aA_2 {
   private static final rut_3<Boolean> id_super = rmE_2.id_class(au_3.class, ruw_3.id_implements);
   protected int id_class;
   protected int id_break;
   protected int id_protected;

   protected au_3(aI_2<? extends au_3> var1, rYB var2) {
      super(var1, var2);
   }

   public void id_class(int var1, boolean var2) {
      int var3 = this.O_();
      var3 += var1 * 20;
      if (var3 > 0) {
         var3 = 0;
      }

      int var4 = var3 - var3;
      this.e_(var3);
      if (var2) {
         this.id_break += var4;
         if (this.id_protected == 0) {
            this.id_protected = 40;
         }
      }

      if (this.O_() == 0) {
         this.e_(this.id_break);
      }
   }

   @Override
   public aU_2 id_class(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      if (var4 == null) {
         var4 = new am_3(true);
      }

      am_3 var6 = (am_3)var4;
      if (var6.id_byte() && var6.id_class() > 0 && ((Random)this.id_throws[40]).nextFloat() <= var6.id_protected()) {
         this.e_(-24000);
      }

      var6.id_break();
      return super.id_class(var1, var2, var3, (aU_2)var4, var5);
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_break("Age", this.O_());
      var1.id_break("ForcedAge", this.id_break);
   }

   @Override
   public void id_class(rut_3<?> var1) {
      if (id_super.equals(var1)) {
         this.q_();
      }

      super.id_class(var1);
   }

   @Override
   public void id_class(boolean var1) {
      this.e_(var1 ? -24000 : 0);
   }

   public abstract au_3 id_class(rrEm_1 var1, au_3 var2);

   @Override
   public void id_default() {
      super.id_default();
      if (((rYB)this.id_throws[7]).id_continue) {
         if (this.id_protected > 0) {
            if (this.id_protected % 4 == 0) {
               ((rYB)this.id_throws[7]).id_class(rLQ.id_char, this.id_break(1.0), this.Ph() + 0.5, this.id_protected(1.0), 0.0, 0.0, 0.0);
            }

            this.id_protected--;
         }
      } else if (this.BM()) {
         int var1 = this.O_();
         if (var1 < 0) {
            this.e_(++var1);
         } else if (var1 > 0) {
            this.e_(--var1);
         }
      }
   }

   @Override
   public void id_break(rcd_3 var1) {
      super.id_break(var1);
      this.e_(var1.id_private("Age"));
      this.id_break = var1.id_private("ForcedAge");
   }

   public int O_() {
      if (((rYB)this.id_throws[7]).id_continue) {
         return ((rmE_2)this.id_throws[49]).id_class(id_super) ? -1 : 1;
      } else {
         return this.id_class;
      }
   }

   protected void P_() {
   }

   public boolean N_() {
      return false;
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.id_throws[49]).id_class(id_super, false);
   }

   @Override
   public boolean n_() {
      return this.O_() < 0;
   }

   public void e_(int var1) {
      int var2 = this.id_class;
      this.id_class = var1;
      if (var2 < 0 && var1 >= 0 || var2 >= 0 && var1 < 0) {
         ((rmE_2)this.id_throws[49]).id_break(id_super, var1 < 0);
         this.P_();
      }
   }

   public void d_(int var1) {
      this.id_class(var1, false);
   }
}
