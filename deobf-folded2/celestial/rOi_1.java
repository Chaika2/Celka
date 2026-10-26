package celestial;

import java.util.Random;
import java.util.UUID;

public class rOi_1 extends rOD {
   private static final UUID id_try = UUID.fromString("556E1665-8B10-40C8-8F9D-CF9B1667F295");
   private static final rut_3<Integer> id_instanceof = rmE_2.id_class(rOi_1.class, ruw_3.id_break);

   @Override
   protected rqA_2 id_byte(rye_3 var1) {
      super.id_byte(var1);
      return rqn_3.ES;
   }

   public rOi_1(aI_2<? extends rOi_1> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   protected rqA_2 sp() {
      super.sp();
      return rqn_3.se;
   }

   @Override
   protected void sl() {
      if (!((rYB)this.id_throws[7]).id_continue) {
         super.sl();
         this.id_final(this.id_synchronized.id_extends(1));
         this.id_class(rXQ.CHEST, 0.0F);
      }
   }

   public rdn_3 n() {
      return this.id_class(rXQ.CHEST);
   }

   @Override
   protected void id_class(zr_3 var1) {
      super.id_class(var1);
      if (((Random)this.id_throws[40]).nextInt(10) == 0) {
         this.id_class(rqn_3.si, var1.id_class() * 0.6F, var1.id_break());
      }
   }

   @Override
   public void id_class(rXu_1 var1) {
      rdn_3 var2 = this.n();
      super.id_class(var1);
      rdn_3 var3 = this.n();
      if ((Integer)this.id_throws[41] > 20 && this.id_native(var3) && var2 != var3) {
         this.id_class(rqn_3.sa, 0.5F, 1.0F);
      }
   }

   @Override
   public boolean id_class(rbZ_2 var1) {
      if (var1 == this) {
         return false;
      } else {
         return !(var1 instanceof rOa_1) && !(var1 instanceof rOi_1) ? false : this.sj() && ((rOD)var1).sj();
      }
   }

   @Override
   public au_3 id_class(rrEm_1 var1, au_3 var2) {
      rOD var3;
      if (var2 instanceof rOa_1) {
         var3 = aI_2.G.id_class(var1);
      } else {
         rOi_1 var4 = (rOi_1)var2;
         var3 = aI_2.id_float.id_class(var1);
         int var5 = ((Random)this.id_throws[40]).nextInt(9);
         rOU var6;
         if (var5 < 4) {
            var6 = this.sJ();
         } else if (var5 < 8) {
            var6 = var4.sJ();
         } else {
            var6 = rqR_2.id_class(rOU.values(), (Random)this.id_throws[40]);
         }

         int var7 = ((Random)this.id_throws[40]).nextInt(5);
         rOe_1 var8;
         if (var7 < 2) {
            var8 = this.sd();
         } else if (var7 < 4) {
            var8 = var4.sd();
         } else {
            var8 = rqR_2.id_class(rOe_1.values(), (Random)this.id_throws[40]);
         }

         ((rOi_1)var3).id_class(var6, var8);
      }

      this.id_class(var2, var3);
      return var3;
   }

   @Override
   public aU_2 id_class(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      rOU var6;
      if (var4 instanceof rhr_3) {
         var6 = ((rhr_3)var4).id_class;
      } else {
         var6 = rqR_2.id_class(rOU.values(), (Random)this.id_throws[40]);
         var4 = new rhr_3(var6);
      }

      this.id_class(var6, rqR_2.id_class(rOe_1.values(), (Random)this.id_throws[40]));
      return super.id_class(var1, var2, var3, (aU_2)var4, var5);
   }

   private void id_class(rOU var1, rOe_1 var2) {
      this.id_public(var1.id_class() & 0xFF | var2.id_class() << 8 & 0xFF00);
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_break("Variant", this.sc());
      if (!this.id_synchronized.id_extends(1).id_class()) {
         var1.id_class("ArmorItem", this.id_synchronized.id_extends(1).id_break(new rcd_3()));
      }
   }

   private int sc() {
      return ((rmE_2)this.id_throws[49]).id_class(id_instanceof);
   }

   public rOe_1 sd() {
      return rOe_1.id_class((this.sc() & 0xFF00) >> 8);
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

         ryZ_2 var4 = var3.id_class(var1, this, var2);
         if (var4.id_class()) {
            return var4;
         }

         if (!this.sm()) {
            this.sI();
            return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
         }

         boolean var5 = !this.n_() && !this.id_byte() && var3.id_break() == rdy_3.hK;
         if (this.id_native(var3) || var5) {
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
      this.id_public(var1.id_private("Variant"));
      if (var1.id_byte("ArmorItem", 10)) {
         rdn_3 var2 = rdn_3.id_class(var1.id_int("ArmorItem"));
         if (!var2.id_class() && this.id_native(var2)) {
            this.id_synchronized.id_break(1, var2);
         }
      }

      this.sl();
   }

   @Override
   protected void L() {
      this.id_byte(iQ_2.id_class).id_class((double)this.sV());
      this.id_byte(iQ_2.id_protected).id_class(this.sR());
      this.id_byte(iQ_2.id_volatile).id_class(this.sg());
   }

   @Override
   protected rqA_2 id_static() {
      super.id_static();
      return rqn_3.sU;
   }

   private void id_public(int var1) {
      ((rmE_2)this.id_throws[49]).id_break(id_instanceof, var1);
   }

   private void id_final(rdn_3 var1) {
      this.id_volatile(var1);
      if (!((rYB)this.id_throws[7]).id_continue) {
         this.id_byte(iQ_2.id_implements).id_break(id_try);
         if (this.id_native(var1)) {
            int var2 = ((rdP_2)var1.id_break()).id_private();
            if (var2 != 0) {
               this.id_byte(iQ_2.id_implements).id_break(new ix_3(id_try, "Horse armor bonus", (double)var2, id_3.ADDITION));
            }
         }
      }
   }

   private void id_volatile(rdn_3 var1) {
      this.id_class(rXQ.CHEST, var1);
      this.id_class(rXQ.CHEST, 0.0F);
   }

   @Override
   public boolean id_native(rdn_3 var1) {
      return var1.id_break() instanceof rdP_2;
   }

   @Override
   protected rqA_2 Bt() {
      super.Bt();
      return rqn_3.Er;
   }

   public rOU sJ() {
      return rOU.id_class(this.sc() & 0xFF);
   }

   @Override
   protected rqA_2 sy() {
      return rqn_3.EP;
   }

   @Override
   public boolean sY() {
      return true;
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.id_throws[49]).id_class(id_instanceof, 0);
   }
}
