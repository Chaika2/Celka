package celestial;

import java.util.Random;
import java.util.UUID;

public class rbG_2 extends rbB_2 implements ag_3 {
   private static final UUID id_class = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
   private static final ix_3 id_break = new ix_3(id_class, "Attacking speed boost", 0.05, id_3.ADDITION);
   private static final rqb_3 id_protected = rqt_3.id_class(0, 1);
   private int id_super;
   private static final rqb_3 id_this = rqt_3.id_class(20, 39);
   private int id_else;
   private UUID id_synchronized;
   private static final rqb_3 id_return = rqt_3.id_class(4, 6);
   private int id_public;

   @Override
   public void id_byte(iB_2 var1) {
      if (this.I_() == null && var1 != null) {
         this.id_super = id_protected.id_class((Random)this.id_throws[40]);
         this.id_public = id_return.id_class((Random)this.id_throws[40]);
      }

      if (var1 instanceof rhd_3) {
         this.id_break((rhd_3)var1);
      }

      super.id_byte(var1);
   }

   @Override
   public UUID id_byte() {
      return this.id_synchronized;
   }

   @Override
   protected rqA_2 id_byte(rye_3 var1) {
      return rqn_3.zB;
   }

   @Override
   protected void id_double() {
      ic_3 var1 = this.id_byte(iQ_2.id_protected);
      if (this.T_()) {
         if (!this.n_() && !var1.id_class(id_break)) {
            var1.id_break(id_break);
         }

         this.sZ();
      } else if (var1.id_class(id_break)) {
         var1.id_protected(id_break);
      }

      this.id_class((rrEm_1)((rYB)this.id_throws[7]), true);
      if (this.I_() != null) {
         this.sv();
      }

      if (this.T_()) {
         Integer var6 = (Integer)this.id_throws[41];
         this.id_private[31] = var6;
      }

      super.id_double();
   }

   public rbG_2(aI_2<? extends rbG_2> var1, rYB var2) {
      super(var1, var2);
      this.id_class(rLp_1.LAVA, 8.0F);
   }

   @Override
   public boolean id_class(rRR var1) {
      return var1.id_protected(this) && !var1.id_protected(this.rN());
   }

   @Override
   protected void id_class(rRh_1 var1) {
      this.id_class(rXQ.MAINHAND, new rdn_3(rdy_3.OA));
   }

   @Override
   public void id_class(int var1) {
      this.id_else = var1;
   }

   @Override
   public int id_class() {
      return this.id_else;
   }

   @Override
   public void id_class(UUID var1) {
      this.id_synchronized = var1;
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      this.a_(var1);
   }

   @Override
   protected void sc() {
      this.id_byte(iQ_2.id_native).id_class(0.0);
   }

   @Override
   protected boolean sd() {
      return false;
   }

   @Override
   public void id_break(rcd_3 var1) {
      super.id_break(var1);
      this.id_class((rrEm_1)((rYB)this.id_throws[7]), var1);
   }

   @Override
   public boolean id_break(rye_3 var1, float var2) {
      return this.id_class(var1) ? false : super.id_break(var1, var2);
   }

   public static boolean id_break(aI_2<rbG_2> var0, rRg_1 var1, iO_2 var2, rfH_2 var3, Random var4) {
      return var1.id_abstract() != rRO.PEACEFUL && var1.id_byte(var3.id_break()).id_break() != xu_3.bg;
   }

   @Override
   public boolean id_throws(rhd_3 var1) {
      return this.b_(var1);
   }

   @Override
   protected void id_throws() {
      this.id_package.id_class(2, new rSW(this, 1.0, false));
      this.id_package.id_class(7, new rSk_1(this, 1.0));
      this.id_int.id_class(1, new rBc_1(this).id_class());
      this.id_int.id_class(2, new rBI<>(this, rhd_3.class, 10, true, false, this::b_));
      this.id_int.id_class(3, new rSP<>(this, true));
   }

   @Override
   protected rdn_3 sx() {
      return rdn_3.id_break;
   }

   private void sv() {
      if (this.id_public > 0) {
         this.id_public--;
      } else {
         if (this.id_goto().id_class(this.I_())) {
            this.sF();
         }

         this.id_public = id_return.id_class((Random)this.id_throws[40]);
      }
   }

   @Override
   protected rqA_2 id_static() {
      return this.T_() ? rqn_3.zr : rqn_3.Wi;
   }

   @Override
   public void id_protected() {
      this.id_class(id_this.id_class((Random)this.id_throws[40]));
   }

   @Override
   public double Pv() {
      return this.n_() ? -0.05 : -0.45;
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.zP;
   }

   private void sL() {
      this.id_class(rqn_3.zr, this.Si() * 2.0F, this.SN() * 1.8F);
   }

   public static iz_3 su() {
      return rbB_2.sz().id_class(iQ_2.id_native, 0.0).id_class(iQ_2.id_protected, 0.23F).id_class(iQ_2.id_case, 5.0);
   }

   private void sZ() {
      if (this.id_super > 0) {
         this.id_super--;
         if (this.id_super == 0) {
            this.sL();
         }
      }
   }

   private void sF() {
      double var1 = this.id_class(iQ_2.id_break);
      rfl_3 var3 = rfl_3.id_class(this.Ps()).id_byte(var1, 10.0, var1);
      ((rYB)this.id_throws[7])
         .id_break(rbG_2.class, var3)
         .stream()
         .filter(var1x -> var1x != this)
         .filter(var0 -> var0.I_() == null)
         .filter(var1x -> !var1x.id_final(this.I_()))
         .forEach(var1x -> var1x.id_byte(this.I_()));
   }
}
