package celestial;

import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class rGJ extends rsi_3 implements aY_2 {
   private static final rut_3<Boolean> id_protected = rmE_2.id_class(rGJ.class, ruw_3.id_implements);
   private final rXA id_super = new rXA(5);

   @Override
   protected rqA_2 id_byte(rye_3 var1) {
      return rqn_3.hz;
   }

   public rGJ(aI_2<? extends rGJ> var1, rYB var2) {
      super(var1, var2);
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      rcy_3 var2 = new rcy_3();

      for (int var3 = 0; var3 < this.id_super.id_else(); var3++) {
         rdn_3 var4 = this.id_super.id_extends(var3);
         if (!var4.id_class()) {
            var2.add(var4.id_break(new rcd_3()));
         }
      }

      var1.id_class("Inventory", var2);
   }

   @Override
   public float id_class(rfH_2 var1, rRR var2) {
      xc_3 var3 = var2.id_byte(var1.id_break());
      return !var3.id_class(xu_3.id_implements) && !var3.id_class(xu_3.id_throw) ? 0.5F - var2.id_native(var1) : 10.0F;
   }

   @Override
   public void id_class(int var1, boolean var2) {
      rrEr_1 var3 = this.sx();
      boolean var4 = ((Random)this.id_throws[40]).nextFloat() <= var3.id_else();
      if (var4) {
         rdn_3 var5 = new rdn_3(rdy_3.kU);
         HashMap var6 = Maps.newHashMap();
         if (var1 > var3.id_class(rRO.NORMAL)) {
            var6.put(eY_2.id_void, 2);
         } else if (var1 > var3.id_class(rRO.EASY)) {
            var6.put(eY_2.id_void, 1);
         }

         var6.put(eY_2.id_float, 1);
         eA_2.id_class(var6, var5);
         this.id_class(rXQ.MAINHAND, var5);
      }
   }

   @Override
   public aU_2 id_class(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      this.id_class(var2);
      this.id_break(var2);
      return super.id_class(var1, var2, var3, var4, var5);
   }

   @Override
   public boolean id_class(int var1, rdn_3 var2) {
      if (super.id_class(var1, var2)) {
         return true;
      } else {
         int var3 = var1 - 300;
         if (var3 >= 0 && var3 < this.id_super.id_else()) {
            this.id_super.id_break(var3, var2);
            return true;
         } else {
            return false;
         }
      }
   }

   @Override
   public void id_class(iB_2 var1, rdn_3 var2, rhf_3 var3, float var4) {
      this.id_class(this, var1, var3, var4, 1.6F);
   }

   @Override
   public void id_class() {
      Integer var5 = 0;
      this.id_private[33] = var5;
   }

   @Override
   protected void id_class(rRh_1 var1) {
      this.id_class(rXQ.MAINHAND, new rdn_3(rdy_3.kU));
   }

   @Override
   public boolean id_class(rkB_2 var1) {
      return var1 == rdy_3.kU;
   }

   public boolean sc() {
      return ((rmE_2)this.id_throws[49]).id_class(id_protected);
   }

   private boolean id_break(rdb_3 var1) {
      return this.sd() && var1 == rdy_3.dY;
   }

   @Override
   protected void id_break(rsE_2 var1) {
      rdn_3 var2 = var1.id_protected();
      if (var2.id_break() instanceof rxO_2) {
         super.id_break(var1);
      } else {
         rdb_3 var3 = var2.id_break();
         if (this.id_break(var3)) {
            this.id_class(var1);
            rdn_3 var4 = this.id_super.id_class(var2);
            if (var4.id_class()) {
               var1.PD();
            } else {
               var2.id_throws(var4.id_char());
            }
         }
      }
   }

   @Override
   public void id_break(rcd_3 var1) {
      super.id_break(var1);
      rcy_3 var2 = var1.id_protected("Inventory", 10);

      for (int var3 = 0; var3 < var2.size(); var3++) {
         rdn_3 var4 = rdn_3.id_class(var2.id_class(var3));
         if (!var4.id_class()) {
            this.id_super.id_class(var4);
         }
      }

      this.id_byte(true);
   }

   @Override
   public void id_break(boolean var1) {
      ((rmE_2)this.id_throws[49]).id_break(id_protected, var1);
   }

   @Override
   public void id_break(iB_2 var1, float var2) {
      this.id_class(this, 1.6F);
   }

   @Override
   public rEr_1 id_throws() {
      if (this.sc()) {
         return rEr_1.CROSSBOW_CHARGE;
      } else if (this.id_class(rdy_3.kU)) {
         return rEr_1.CROSSBOW_HOLD;
      } else {
         return this.v() ? rEr_1.ATTACKING : rEr_1.NEUTRAL;
      }
   }

   @Override
   protected void id_instanceof(float var1) {
      super.id_instanceof(var1);
      if (((Random)this.id_throws[40]).nextInt(300) == 0) {
         rdn_3 var2 = this.ss();
         if (var2.id_break() == rdy_3.kU) {
            Map var3 = eA_2.id_class(var2);
            var3.putIfAbsent(eY_2.id_static, 1);
            eA_2.id_class(var3, var2);
            this.id_class(rXQ.MAINHAND, var2);
         }
      }
   }

   @Override
   protected rqA_2 id_static() {
      return rqn_3.hd;
   }

   @Override
   protected void id_final() {
      super.id_final();
      this.id_package.id_class(0, new rSb_1(this));
      this.id_package.id_class(2, new rEs_1(this, this, 10.0F));
      this.id_package.id_class(3, new rBi_1<>(this, 1.0, 8.0F));
      this.id_package.id_class(8, new rBU(this, 0.6));
      this.id_package.id_class(9, new rBA(this, rhd_3.class, 15.0F, 1.0F));
      this.id_package.id_class(10, new rBA(this, is_3.class, 15.0F));
      this.id_int.id_class(1, new rBc_1(this, rEB.class).id_class());
      this.id_int.id_class(2, new rBI<>(this, rhd_3.class, true));
      this.id_int.id_class(3, new rBI<>(this, rsy_3.class, false));
      this.id_int.id_class(3, new rBI<>(this, rMZ.class, true));
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
   public int E() {
      return 1;
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.hW;
   }

   public static iz_3 sN() {
      return rEi_1.sm().id_class(iQ_2.id_protected, 0.35F).id_class(iQ_2.id_class, 24.0).id_class(iQ_2.id_case, 5.0).id_class(iQ_2.id_break, 32.0);
   }

   @Override
   public rqA_2 sQ() {
      return rqn_3.hk;
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.id_throws[49]).id_class(id_protected, false);
   }
}
