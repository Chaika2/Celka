package celestial;

import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.Random;
import java.util.function.Predicate;

public class rGD extends rsi_3 {
   static final Predicate<rRO> id_protected = var0 -> var0 == rRO.NORMAL || var0 == rRO.HARD;
   boolean id_super;

   @Override
   protected rqA_2 id_byte(rye_3 var1) {
      return rqn_3.ku;
   }

   @Override
   protected void id_double() {
      if (!this.c() && rpc_3.id_class(this)) {
         boolean var1 = ((rrEm_1)((rYB)this.id_throws[7])).id_char(this.Bs());
         ((rLA)this.id_public()).id_class(var1);
      }

      super.id_double();
   }

   public rGD(aI_2<? extends rGD> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   public aU_2 id_class(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      aU_2 var6 = super.id_class(var1, var2, var3, var4, var5);
      ((rLA)this.id_public()).id_class(true);
      this.id_class(var2);
      this.id_break(var2);
      return var6;
   }

   @Override
   protected void id_class(rRh_1 var1) {
      if (this.sx() == null) {
         this.id_class(rXQ.MAINHAND, new rdn_3(rdy_3.OT));
      }
   }

   @Override
   public void id_class(int var1, boolean var2) {
      rdn_3 var3 = new rdn_3(rdy_3.OT);
      rrEr_1 var4 = this.sx();
      byte var5 = 1;
      if (var1 > var4.id_class(rRO.NORMAL)) {
         var5 = 2;
      }

      boolean var6 = ((Random)this.id_throws[40]).nextFloat() <= var4.id_else();
      if (var6) {
         HashMap var7 = Maps.newHashMap();
         var7.put(eY_2.id_volatile, Integer.valueOf(var5));
         eA_2.id_class(var7, var3);
      }

      this.id_class(rXQ.MAINHAND, var3);
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      if (this.id_super) {
         var1.id_class("Johnny", true);
      }
   }

   @Override
   public void id_break(rcd_3 var1) {
      super.id_break(var1);
      if (var1.id_byte("Johnny", 99)) {
         this.id_super = var1.id_new("Johnny");
      }
   }

   @Override
   public void id_break(rgP_2 var1) {
      super.id_break(var1);
      if (!this.id_super && var1 != null && var1.getString().equals("Johnny")) {
         this.id_super = true;
      }
   }

   @Override
   public rEr_1 id_throws() {
      if (this.v()) {
         return rEr_1.ATTACKING;
      } else {
         return this.sW() ? rEr_1.CELEBRATING : rEr_1.CROSSED;
      }
   }

   @Override
   protected rqA_2 id_static() {
      return rqn_3.kQ;
   }

   @Override
   protected void id_final() {
      super.id_final();
      this.id_package.id_class(0, new rSb_1(this));
      this.id_package.id_class(1, new rGe_1(this));
      this.id_package.id_class(2, new rEP(this, this));
      this.id_package.id_class(3, new rEs_1(this, this, 10.0F));
      this.id_package.id_class(4, new rGU(this, this));
      this.id_int.id_class(1, new rBc_1(this, rEB.class).id_class());
      this.id_int.id_class(2, new rBI<>(this, rhd_3.class, true));
      this.id_int.id_class(3, new rBI<>(this, rsy_3.class, true));
      this.id_int.id_class(3, new rBI<>(this, rMZ.class, true));
      this.id_int.id_class(4, new rGa_1(this));
      this.id_package.id_class(8, new rBU(this, 0.6));
      this.id_package.id_class(9, new rBA(this, rhd_3.class, 3.0F, 1.0F));
      this.id_package.id_class(10, new rBA(this, is_3.class, 8.0F));
   }

   @Override
   public boolean id_final(an_3 var1) {
      if (super.id_final(var1)) {
         return true;
      } else {
         return var1 instanceof iB_2 && ((iB_2)var1).sG() == aL_2.id_protected ? this.BG() == null && var1.BG() == null : false;
      }
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.kc;
   }

   public static iz_3 sN() {
      return rEi_1.sm().id_class(iQ_2.id_protected, 0.35F).id_class(iQ_2.id_break, 12.0).id_class(iQ_2.id_class, 24.0).id_class(iQ_2.id_case, 5.0);
   }

   @Override
   public rqA_2 sQ() {
      return rqn_3.kN;
   }
}
