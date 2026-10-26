package celestial;

import java.util.Random;

public class rMi_1 extends rbZ_2 {
   private static final rut_3<Integer> id_super = rmE_2.id_class(rMi_1.class, ruw_3.id_break);
   private static final rqO_2 id_this = new rqO_2("killer_bunny");
   private int id_else;
   private int id_synchronized;
   private boolean id_return;
   private int id_public;
   int id_goto;

   @Override
   protected rqA_2 id_byte(rye_3 var1) {
      return rqn_3.Xb;
   }

   @Override
   public void id_double() {
      if (this.id_public > 0) {
         this.id_public--;
      }

      if (this.id_goto > 0) {
         this.id_goto = this.id_goto - ((Random)this.id_throws[40]).nextInt(3);
         if (this.id_goto < 0) {
            this.id_goto = 0;
         }
      }

      if ((Boolean)this.id_throws[20]) {
         if (!this.id_return) {
            this.id_super(false);
            this.sm();
         }

         if (this.sx() == 99 && this.id_public == 0) {
            iB_2 var1 = this.I_();
            if (var1 != null && this.id_int(var1) < 16.0) {
               this.id_class(var1.rx(), var1.BO());
               this.id_native.id_class(var1.rx(), var1.re(), var1.BO(), this.id_native.id_byte());
               this.L();
               this.id_return = true;
            }
         }

         rOB var4 = (rOB)this.id_volatile;
         if (!var4.id_byte()) {
            if (this.id_native.id_break() && this.id_public == 0) {
               rLC var2 = this.id_final.id_finally();
               rjU_2 var3 = new rjU_2(this.id_native.id_protected(), this.id_native.id_throws(), this.id_native.id_case());
               if (var2 != null && !var2.id_byte()) {
                  var3 = var2.id_class(this);
               }

               this.id_class(var3.id_break, var3.id_protected);
               this.L();
            }
         } else if (!var4.id_protected()) {
            this.sd();
         }
      }

      this.id_return = (Boolean)this.id_throws[20];
   }

   public rMi_1(aI_2<? extends rMi_1> var1, rYB var2) {
      super(var1, var2);
      this.id_volatile = new rOB(this, this);
      this.id_native = new rOS(this);
      this.id_implements(0.0);
   }

   @Override
   public boolean B() {
      return false;
   }

   public static iz_3 n() {
      return is_3.id_package().id_class(iQ_2.id_class, 3.0).id_class(iQ_2.id_protected, 0.3F);
   }

   private void id_class(double var1, double var3) {
      Float var9 = (float)(rfU_2.id_protected(var3 - this.BO(), var1 - this.rx()) * 180.0F / (float)Math.PI) - 90.0F;
      this.id_throws[15] = var9;
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_break("RabbitType", this.sx());
      var1.id_break("MoreCarrotTicks", this.id_goto);
   }

   @Override
   public aU_2 id_class(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      int var6 = this.id_class(var1);
      if (var4 instanceof rOE) {
         var6 = ((rOE)var4).id_class;
      } else {
         var4 = new rOE(var6);
      }

      this.id_else(var6);
      return super.id_class(var1, var2, var3, (aU_2)var4, var5);
   }

   private int id_class(rRg_1 var1) {
      rYG var2 = var1.id_implements(this.Bs());
      int var3 = ((Random)this.id_throws[40]).nextInt(100);
      if (var2.id_byte() == rYJ.SNOW) {
         return var3 < 80 ? 1 : 3;
      } else if (var2.id_this() == rYh_1.DESERT) {
         return 4;
      } else {
         return var3 < 50 ? 0 : (var3 < 90 ? 5 : 2);
      }
   }

   @Override
   public void id_class(byte var1) {
      if (var1 == 1) {
         this.Bb();
         this.id_synchronized = 10;
         this.id_else = 0;
      } else {
         super.id_class(var1);
      }
   }

   private void sm() {
      this.su();
      this.sc();
   }

   private void sc() {
      ((rOB)this.id_volatile).id_class(false);
   }

   @Override
   public void id_default() {
      super.id_default();
      if (this.id_else != this.id_synchronized) {
         this.id_else++;
      } else if (this.id_synchronized != 0) {
         this.id_else = 0;
         this.id_synchronized = 0;
         this.id_super(false);
      }
   }

   private void sd() {
      ((rOB)this.id_volatile).id_class(true);
   }

   public static boolean id_break(aI_2<rMi_1> var0, rRg_1 var1, iO_2 var2, rfH_2 var3, Random var4) {
      xc_3 var5 = var1.id_byte(var3.id_break());
      return (var5.id_class(xu_3.id_implements) || var5.id_class(xu_3.Pq) || var5.id_class(xu_3.id_throw)) && var1.id_class(var3, 0) > 8;
   }

   @Override
   public boolean id_break(rye_3 var1, float var2) {
      return this.id_class(var1) ? false : super.id_break(var1, var2);
   }

   private boolean id_break(rdb_3 var1) {
      return var1 == rdy_3.ds || var1 == rdy_3.dO || var1 == xu_3.ru.id_case();
   }

   public rMi_1 id_break(rrEm_1 var1, au_3 var2) {
      rMi_1 var3 = aI_2.c.id_class(var1);
      int var4 = this.id_class(var1);
      if (((Random)this.id_throws[40]).nextInt(20) != 0) {
         if (var2 instanceof rMi_1 && ((Random)this.id_throws[40]).nextBoolean()) {
            var4 = ((rMi_1)var2).sx();
         } else {
            var4 = this.sx();
         }
      }

      var3.id_else(var4);
      return var3;
   }

   @Override
   public void id_break(rcd_3 var1) {
      super.id_break(var1);
      this.id_else(var1.id_private("RabbitType"));
      this.id_goto = var1.id_private("MoreCarrotTicks");
   }

   @Override
   public void L() {
      this.id_super(true);
      this.id_synchronized = 10;
      this.id_else = 0;
   }

   public int sx() {
      return ((rmE_2)this.id_throws[49]).id_class(id_super);
   }

   @Override
   public boolean id_extends(rdn_3 var1) {
      return this.id_break(var1.id_break());
   }

   @Override
   protected void id_continue(boolean var1) {
      super.id_continue(var1);
      double var2 = this.id_native.id_byte();
      if (var2 > 0.0) {
         double var4 = id_case(this.rv());
         if (var4 < 0.01) {
            this.id_class(0.1F, new rjU_2(0.0, 0.0, 1.0));
         }
      }

      if (!((rYB)this.id_throws[7]).id_continue) {
         ((rYB)this.id_throws[7]).id_class(this, (byte)1);
      }
   }

   public void id_else(int var1) {
      if (var1 == 99) {
         this.id_byte(iQ_2.id_implements).id_class(8.0);
         this.id_package.id_class(4, new rOP(this));
         this.id_int.id_class(1, new rBc_1(this).id_class());
         this.id_int.id_class(2, new rBI<>(this, rhd_3.class, true));
         this.id_int.id_class(2, new rBI<>(this, rOH.class, true));
         if (!this.Bk()) {
            this.id_break(new rgn_3(rqR_2.id_class("entity", id_this)));
         }
      }

      ((rmE_2)this.id_throws[49]).id_break(id_super, var1);
   }

   public void id_implements(double var1) {
      this.id_public().id_class(var1);
      this.id_native.id_class(this.id_native.id_protected(), this.id_native.id_throws(), this.id_native.id_case(), var1);
   }

   @Override
   public void id_super(boolean var1) {
      super.id_super(var1);
      if (var1) {
         this.id_class(this.sJ(), this.Si(), ((((Random)this.id_throws[40]).nextFloat() - ((Random)this.id_throws[40]).nextFloat()) * 0.2F + 1.0F) * 0.8F);
      }
   }

   public float id_throw(float var1) {
      return this.id_synchronized == 0 ? 0.0F : ((float)this.id_else + var1) / (float)this.id_synchronized;
   }

   @Override
   protected rqA_2 id_static() {
      return rqn_3.Xs;
   }

   @Override
   public boolean id_public(an_3 var1) {
      if (this.sx() == 99) {
         this.id_class(rqn_3.XE, 1.0F, (((Random)this.id_throws[40]).nextFloat() - ((Random)this.id_throws[40]).nextFloat()) * 0.2F + 1.0F);
         return var1.id_break(rye_3.id_byte(this), 8.0F);
      } else {
         return var1.id_break(rye_3.id_byte(this), 3.0F);
      }
   }

   @Override
   protected void id_final() {
      this.id_package.id_class(1, new rSb_1(this));
      this.id_package.id_class(1, new rOs_1(this, 2.2));
      this.id_package.id_class(2, new rBP(this, 0.8));
      this.id_package.id_class(3, new rSO(this, 1.0, rkg_3.id_class(rdy_3.ds, rdy_3.dO, xu_3.ru), false));
      this.id_package.id_class(4, new rOr_1<>(this, rhd_3.class, 8.0F, 2.2, 2.2));
      this.id_package.id_class(4, new rOr_1<>(this, rOH.class, 10.0F, 2.2, 2.2));
      this.id_package.id_class(4, new rOr_1<>(this, rEi_1.class, 4.0F, 2.2, 2.2));
      this.id_package.id_class(5, new rOG(this));
      this.id_package.id_class(6, new rSk_1(this, 0.6));
      this.id_package.id_class(11, new rBA(this, rhd_3.class, 10.0F));
   }

   @Override
   public rqL_2 Pr() {
      return this.sx() == 99 ? rqL_2.HOSTILE : rqL_2.NEUTRAL;
   }

   @Override
   public rjU_2 BA() {
      return new rjU_2(0.0, (double)(0.6F * this.Bx()), (double)(this.PN() * 0.4F));
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.XG;
   }

   protected rqA_2 sJ() {
      return rqn_3.XM;
   }

   @Override
   protected float ST() {
      if (!(Boolean)this.id_throws[23] && (!this.id_native.id_break() || !(this.id_native.id_throws() > this.re() + 0.5))) {
         rLC var1 = this.id_final.id_finally();
         if (var1 != null && !var1.id_byte()) {
            rjU_2 var2 = var1.id_class(this);
            if (var2.id_byte > this.re() + 0.5) {
               return 0.5F;
            }
         }

         return this.id_native.id_byte() <= 0.6 ? 0.2F : 0.3F;
      } else {
         return 0.5F;
      }
   }

   private void su() {
      if (this.id_native.id_byte() < 2.2) {
         this.id_public = 10;
      } else {
         this.id_public = 1;
      }
   }

   boolean sZ() {
      return this.id_goto == 0;
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.id_throws[49]).id_class(id_super, 0);
   }
}
