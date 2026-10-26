package celestial;

import java.util.Random;

public abstract class rOK extends rOD {
   private static final rut_3<Boolean> id_try = rmE_2.id_class(rOK.class, ruw_3.id_implements);

   protected rOK(aI_2<? extends rOK> var1, rYB var2) {
      super(var1, var2);
      this.id_goto = false;
   }

   public void id_this(boolean var1) {
      ((rmE_2)this.id_throws[49]).id_break(id_try, var1);
   }

   public static iz_3 n() {
      return sq().id_class(iQ_2.id_protected, 0.175F).id_class(iQ_2.id_volatile, 0.5);
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_class("ChestedHorse", this.sJ());
      if (this.sJ()) {
         rcy_3 var2 = new rcy_3();

         for (int var3 = 2; var3 < this.id_synchronized.id_else(); var3++) {
            rdn_3 var4 = this.id_synchronized.id_extends(var3);
            if (!var4.id_class()) {
               rcd_3 var5 = new rcd_3();
               var5.id_class("Slot", (byte)var3);
               var4.id_break(var5);
               var2.add(var5);
            }
         }

         var1.id_class("Items", var2);
      }
   }

   @Override
   public boolean id_class(int var1, rdn_3 var2) {
      if (var1 == 499) {
         if (this.sJ() && var2.id_class()) {
            this.id_this(false);
            this.sC();
            return true;
         }

         if (!this.sJ() && var2.id_break() == xu_3.re.id_case()) {
            this.id_this(true);
            this.sC();
            return true;
         }
      }

      return super.id_class(var1, var2);
   }

   public int sc() {
      return 5;
   }

   @Override
   protected void sd() {
      this.id_class(rqn_3.PD, 1.0F, (((Random)this.id_throws[40]).nextFloat() - ((Random)this.id_throws[40]).nextFloat()) * 0.2F + 1.0F);
   }

   @Override
   public ryZ_2 id_break(rhd_3 var1, rpm_3 var2) {
      rdn_3 var3 = var1.id_protected(var2);
      if (!this.n_()) {
         if (this.sm() && var1.sN()) {
            this.id_case(var1);
            return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
         }

         if (this.BP()) {
            return super.id_break(var1, var2);
         }
      }

      if (!var3.id_class()) {
         if (this.id_extends(var3)) {
            return this.id_break(var1, var3);
         }

         if (!this.sm()) {
            this.sI();
            return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
         }

         if (!this.sJ() && var3.id_break() == xu_3.re.id_case()) {
            this.id_this(true);
            this.sd();
            if (!((rhx_3)var1.id_implements[18]).id_protected) {
               var3.id_catch(1);
            }

            this.sC();
            return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
         }

         if (!this.n_() && !this.id_byte() && var3.id_break() == rdy_3.hK) {
            this.id_case(var1);
            return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
         }
      }

      if (this.n_()) {
         return super.id_break(var1, var2);
      } else {
         this.id_catch(var1);
         return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
      }
   }

   @Override
   public void id_break(rcd_3 var1) {
      super.id_break(var1);
      this.id_this(var1.id_new("ChestedHorse"));
      if (this.sJ()) {
         rcy_3 var2 = var1.id_protected("Items", 10);
         this.sC();

         for (int var3 = 0; var3 < var2.size(); var3++) {
            rcd_3 var4 = var2.id_class(var3);
            int var5 = var4.id_case("Slot") & 255;
            if (var5 >= 2 && var5 < this.id_synchronized.id_else()) {
               this.id_synchronized.id_break(var5, rdn_3.id_class(var4));
            }
         }
      }

      this.sl();
   }

   @Override
   protected void L() {
      this.id_byte(iQ_2.id_class).id_class((double)this.sV());
   }

   @Override
   protected int sx() {
      return this.sJ() ? 17 : super.sx();
   }

   @Override
   public double PS() {
      return super.PS() - 0.25;
   }

   public boolean sJ() {
      return ((rmE_2)this.id_throws[49]).id_class(id_try);
   }

   @Override
   protected void Sx() {
      super.Sx();
      if (this.sJ()) {
         if (!((rYB)this.id_throws[7]).id_continue) {
            this.id_class(xu_3.re);
         }

         this.id_this(false);
      }
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.id_throws[49]).id_class(id_try, false);
   }
}
