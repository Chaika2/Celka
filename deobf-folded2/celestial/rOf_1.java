package celestial;

import java.util.function.Predicate;

public class rOf_1 extends rOp_1 {
   private static final rut_3<Integer> id_class = rmE_2.id_class(rOf_1.class, ruw_3.id_break);
   int id_break;
   int id_protected;
   static final Predicate<iB_2> id_super = var0 -> {
      if (var0 == null) {
         return false;
      } else {
         return !(var0 instanceof rhd_3) || !var0.id_native() && !((rhd_3)var0).id_implements() ? var0.sG() != aL_2.id_throws : false;
      }
   };

   @Override
   protected rqA_2 id_byte(rye_3 var1) {
      return rqn_3.XP;
   }

   public rOf_1(aI_2<? extends rOf_1> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   public void id_this() {
      if (!((rYB)this.id_throws[7]).id_continue && this.BM() && this.id_try()) {
         if (this.id_break > 0) {
            if (this.sx() == 0) {
               this.id_class(rqn_3.ha, this.Si(), this.SN());
               this.id_break(1);
            } else if (this.id_break > 40 && this.sx() == 1) {
               this.id_class(rqn_3.ha, this.Si(), this.SN());
               this.id_break(2);
            }

            this.id_break++;
         } else if (this.sx() != 0) {
            if (this.id_protected > 60 && this.sx() == 2) {
               this.id_class(rqn_3.he, this.Si(), this.SN());
               this.id_break(1);
            } else if (this.id_protected > 100 && this.sx() == 1) {
               this.id_class(rqn_3.he, this.Si(), this.SN());
               this.id_break(0);
            }

            this.id_protected++;
         }
      }

      super.id_this();
   }

   private static float id_this(int var0) {
      switch (var0) {
         case 0:
            return 0.5F;
         case 1:
            return 0.7F;
         default:
            return 1.0F;
      }
   }

   private void id_class(is_3 var1) {
      int var2 = this.sx();
      if (var1.id_break(rye_3.id_byte(this), (float)(1 + var2))) {
         var1.id_break(new rLY(rLD.id_super, 60 * var2, 0));
         this.id_class(rqn_3.XB, 1.0F, 1.0F);
      }
   }

   @Override
   public void id_class(rut_3<?> var1) {
      if (id_class.equals(var1)) {
         this.q_();
      }

      super.id_class(var1);
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_break("PuffState", this.sx());
   }

   @Override
   public void id_default() {
      super.id_default();
      if (this.BM() && this.sx() > 0) {
         for (is_3 var2 : ((rYB)this.id_throws[7]).id_class(is_3.class, this.rN().id_class(0.3), id_super)) {
            if (var2.BM()) {
               this.id_class(var2);
            }
         }
      }
   }

   public void id_break(int var1) {
      ((rmE_2)this.id_throws[49]).id_break(id_class, var1);
   }

   @Override
   public void id_break(rcd_3 var1) {
      super.id_break(var1);
      this.id_break(var1.id_private("PuffState"));
   }

   @Override
   protected rdn_3 L() {
      return new rdn_3(rdy_3.Xr);
   }

   public int sx() {
      return ((rmE_2)this.id_throws[49]).id_class(id_class);
   }

   @Override
   protected rqA_2 id_static() {
      return rqn_3.hU;
   }

   @Override
   protected void id_final() {
      super.id_final();
      this.id_package.id_class(1, new rOj_1(this));
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.hi;
   }

   @Override
   protected rqA_2 sJ() {
      return rqn_3.Xr;
   }

   @Override
   public ap_3 a_(iM_2 var1) {
      return super.a_(var1).id_class(id_this(this.sx()));
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.id_throws[49]).id_class(id_class, 0);
   }

   @Override
   public void c_(rhd_3 var1) {
      int var2 = this.sx();
      if (var1 instanceof rhN_2 && var2 > 0 && var1.id_break(rye_3.id_byte(this), (float)(1 + var2))) {
         if (!this.BF()) {
            ((rhN_2)var1).id_class.id_class(new rZY(rZY.id_finally, 0.0F));
         }

         var1.id_break(new rLY(rLD.id_super, 60 * var2, 0));
      }
   }
}
