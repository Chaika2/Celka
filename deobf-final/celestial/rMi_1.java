package celestial;

import java.util.Random;

public class rMi_1 extends rbZ_2 {
   private static final rut_3<Integer> super_ = rmE_2.class_(rMi_1.class, ruw_3.break_);
   private static final rqO_2 this_ = new rqO_2("killer_bunny");
   private int else_;
   private int synchronized_;
   private boolean return_;
   private int public_;
   int goto_;

   @Override
   protected rqA_2 byte_(rye_3 var1) {
      return rqn_3.Xb;
   }

   @Override
   public void double_() {
      if (this.public_ > 0) {
         this.public_--;
      }

      if (this.goto_ > 0) {
         this.goto_ = this.goto_ - ((Random)this.throws_[40]).nextInt(3);
         if (this.goto_ < 0) {
            this.goto_ = 0;
         }
      }

      if ((Boolean)this.throws_[20]) {
         if (!this.return_) {
            this.super_(false);
            this.sm();
         }

         if (this.sx() == 99 && this.public_ == 0) {
            iB_2 var1 = this.I_();
            if (var1 != null && this.int_(var1) < 16.0) {
               this.class_(var1.rx(), var1.BO());
               this.native_.class_(var1.rx(), var1.re(), var1.BO(), this.native_.byte_());
               this.L();
               this.return_ = true;
            }
         }

         rOB var4 = (rOB)this.volatile_;
         if (!var4.byte_()) {
            if (this.native_.break_() && this.public_ == 0) {
               rLC var2 = this.final_.finally_();
               rjU_2 var3 = new rjU_2(this.native_.protected_(), this.native_.throws_(), this.native_.case_());
               if (var2 != null && !var2.byte_()) {
                  var3 = var2.class_(this);
               }

               this.class_(var3.break_, var3.protected_);
               this.L();
            }
         } else if (!var4.protected_()) {
            this.sd();
         }
      }

      this.return_ = (Boolean)this.throws_[20];
   }

   public rMi_1(aI_2<? extends rMi_1> var1, rYB var2) {
      super(var1, var2);
      this.volatile_ = new rOB(this, this);
      this.native_ = new rOS(this);
      this.implements_(0.0);
   }

   @Override
   public boolean B() {
      return false;
   }

   public static iz_3 n() {
      return is_3.package_().class_(iQ_2.class_, 3.0).class_(iQ_2.protected_, 0.3F);
   }

   private void class_(double var1, double var3) {
      Float var9 = (float)(rfU_2.protected_(var3 - this.BO(), var1 - this.rx()) * 180.0F / (float)Math.PI) - 90.0F;
      this.throws_[15] = var9;
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      var1.break_("RabbitType", this.sx());
      var1.break_("MoreCarrotTicks", this.goto_);
   }

   @Override
   public aU_2 class_(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      int var6 = this.class_(var1);
      if (var4 instanceof rOE) {
         var6 = ((rOE)var4).class_;
      } else {
         var4 = new rOE(var6);
      }

      this.else_(var6);
      return super.class_(var1, var2, var3, (aU_2)var4, var5);
   }

   private int class_(rRg_1 var1) {
      rYG var2 = var1.implements_(this.Bs());
      int var3 = ((Random)this.throws_[40]).nextInt(100);
      if (var2.byte_() == rYJ.SNOW) {
         return var3 < 80 ? 1 : 3;
      } else if (var2.this_() == rYh_1.DESERT) {
         return 4;
      } else {
         return var3 < 50 ? 0 : (var3 < 90 ? 5 : 2);
      }
   }

   @Override
   public void class_(byte var1) {
      if (var1 == 1) {
         this.Bb();
         this.synchronized_ = 10;
         this.else_ = 0;
      } else {
         super.class_(var1);
      }
   }

   private void sm() {
      this.su();
      this.sc();
   }

   private void sc() {
      ((rOB)this.volatile_).class_(false);
   }

   @Override
   public void default_() {
      super.default_();
      if (this.else_ != this.synchronized_) {
         this.else_++;
      } else if (this.synchronized_ != 0) {
         this.else_ = 0;
         this.synchronized_ = 0;
         this.super_(false);
      }
   }

   private void sd() {
      ((rOB)this.volatile_).class_(true);
   }

   public static boolean break_(aI_2<rMi_1> var0, rRg_1 var1, iO_2 var2, rfH_2 var3, Random var4) {
      xc_3 var5 = var1.byte_(var3.break_());
      return (var5.class_(xu_3.implements_) || var5.class_(xu_3.Pq) || var5.class_(xu_3.throw_)) && var1.class_(var3, 0) > 8;
   }

   @Override
   public boolean break_(rye_3 var1, float var2) {
      return this.class_(var1) ? false : super.break_(var1, var2);
   }

   private boolean break_(rdb_3 var1) {
      return var1 == rdy_3.ds || var1 == rdy_3.dO || var1 == xu_3.ru.case_();
   }

   public rMi_1 break_(rrEm_1 var1, au_3 var2) {
      rMi_1 var3 = aI_2.c.class_(var1);
      int var4 = this.class_(var1);
      if (((Random)this.throws_[40]).nextInt(20) != 0) {
         if (var2 instanceof rMi_1 && ((Random)this.throws_[40]).nextBoolean()) {
            var4 = ((rMi_1)var2).sx();
         } else {
            var4 = this.sx();
         }
      }

      var3.else_(var4);
      return var3;
   }

   @Override
   public void break_(rcd_3 var1) {
      super.break_(var1);
      this.else_(var1.private_("RabbitType"));
      this.goto_ = var1.private_("MoreCarrotTicks");
   }

   @Override
   public void L() {
      this.super_(true);
      this.synchronized_ = 10;
      this.else_ = 0;
   }

   public int sx() {
      return ((rmE_2)this.throws_[49]).class_(super_);
   }

   @Override
   public boolean extends_(rdn_3 var1) {
      return this.break_(var1.break_());
   }

   @Override
   protected void continue_(boolean var1) {
      super.continue_(var1);
      double var2 = this.native_.byte_();
      if (var2 > 0.0) {
         double var4 = case_(this.rv());
         if (var4 < 0.01) {
            this.class_(0.1F, new rjU_2(0.0, 0.0, 1.0));
         }
      }

      if (!((rYB)this.throws_[7]).continue_) {
         ((rYB)this.throws_[7]).class_(this, (byte)1);
      }
   }

   public void else_(int var1) {
      if (var1 == 99) {
         this.byte_(iQ_2.implements_).class_(8.0);
         this.package_.class_(4, new rOP(this));
         this.int_.class_(1, new rBc_1(this).class_());
         this.int_.class_(2, new rBI<>(this, rhd_3.class, true));
         this.int_.class_(2, new rBI<>(this, rOH.class, true));
         if (!this.Bk()) {
            this.break_(new rgn_3(rqR_2.class_("entity", this_)));
         }
      }

      ((rmE_2)this.throws_[49]).break_(super_, var1);
   }

   public void implements_(double var1) {
      this.public_().class_(var1);
      this.native_.class_(this.native_.protected_(), this.native_.throws_(), this.native_.case_(), var1);
   }

   @Override
   public void super_(boolean var1) {
      super.super_(var1);
      if (var1) {
         this.class_(this.sJ(), this.Si(), ((((Random)this.throws_[40]).nextFloat() - ((Random)this.throws_[40]).nextFloat()) * 0.2F + 1.0F) * 0.8F);
      }
   }

   public float throw_(float var1) {
      return this.synchronized_ == 0 ? 0.0F : ((float)this.else_ + var1) / (float)this.synchronized_;
   }

   @Override
   protected rqA_2 static_() {
      return rqn_3.Xs;
   }

   @Override
   public boolean public_(an_3 var1) {
      if (this.sx() == 99) {
         this.class_(rqn_3.XE, 1.0F, (((Random)this.throws_[40]).nextFloat() - ((Random)this.throws_[40]).nextFloat()) * 0.2F + 1.0F);
         return var1.break_(rye_3.byte_(this), 8.0F);
      } else {
         return var1.break_(rye_3.byte_(this), 3.0F);
      }
   }

   @Override
   protected void final_() {
      this.package_.class_(1, new rSb_1(this));
      this.package_.class_(1, new rOs_1(this, 2.2));
      this.package_.class_(2, new rBP(this, 0.8));
      this.package_.class_(3, new rSO(this, 1.0, rkg_3.class_(rdy_3.ds, rdy_3.dO, xu_3.ru), false));
      this.package_.class_(4, new rOr_1<>(this, rhd_3.class, 8.0F, 2.2, 2.2));
      this.package_.class_(4, new rOr_1<>(this, rOH.class, 10.0F, 2.2, 2.2));
      this.package_.class_(4, new rOr_1<>(this, rEi_1.class, 4.0F, 2.2, 2.2));
      this.package_.class_(5, new rOG(this));
      this.package_.class_(6, new rSk_1(this, 0.6));
      this.package_.class_(11, new rBA(this, rhd_3.class, 10.0F));
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
      if (!(Boolean)this.throws_[23] && (!this.native_.break_() || !(this.native_.throws_() > this.re() + 0.5))) {
         rLC var1 = this.final_.finally_();
         if (var1 != null && !var1.byte_()) {
            rjU_2 var2 = var1.class_(this);
            if (var2.byte_ > this.re() + 0.5) {
               return 0.5F;
            }
         }

         return this.native_.byte_() <= 0.6 ? 0.2F : 0.3F;
      } else {
         return 0.5F;
      }
   }

   private void su() {
      if (this.native_.byte_() < 2.2) {
         this.public_ = 10;
      } else {
         this.public_ = 1;
      }
   }

   boolean sZ() {
      return this.goto_ == 0;
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.throws_[49]).class_(super_, 0);
   }
}
