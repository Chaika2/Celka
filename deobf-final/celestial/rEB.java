package celestial;

import java.util.Random;
import java.util.function.Predicate;

public abstract class rEB extends rGr_1 {
   protected static final rut_3<Boolean> class_ = rmE_2.class_(rEB.class, ruw_3.implements_);
   static final Predicate<rsE_2> protected_ = var0 -> !var0.package_() && var0.BM() && rdn_3.break_(var0.protected_(), rrEr_1.new_());
   protected rrEr_1 break_;
   private int super_;
   private boolean this_;
   private int else_;

   protected rEB(aI_2<? extends rEB> var1, rYB var2) {
      super(var1, var2);
   }

   public void this_(boolean var1) {
      this.this_ = var1;
   }

   @Override
   public aU_2 class_(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      this.this_(this.BC() != aI_2.a || var3 != iO_2.NATURAL);
      return super.class_(var1, var2, var3, var4, var5);
   }

   public void class_(rrEr_1 var1) {
      this.break_ = var1;
   }

   public abstract void class_(int var1, boolean var2);

   public void class_(int var1) {
      this.super_ = var1;
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      var1.break_("Wave", this.super_);
      var1.class_("CanJoinRaid", this.this_);
      if (this.break_ != null) {
         var1.break_("RaidId", this.break_.super_());
      }
   }

   @Override
   public void default_() {
      if ((rYB)this.throws_[7] instanceof rrEm_1 && this.BM()) {
         rrEr_1 var1 = this.sx();
         if (this.L()) {
            if (var1 == null) {
               if (((rYB)this.throws_[7]).r() % 20L == 0L) {
                  rrEr_1 var2 = ((rrEm_1)((rYB)this.throws_[7])).interface_(this.Bs());
                  if (var2 != null && rrEs_1.class_(this, var2)) {
                     var2.class_(var2.implements_(), this, (rfH_2)null, true);
                  }
               }
            } else {
               iB_2 var8 = this.I_();
               if (var8 != null && (var8.BC() == aI_2.rM || var8.BC() == aI_2.import_)) {
                  Integer var7 = 0;
                  this.private_[33] = var7;
               }
            }
         }
      }

      super.default_();
   }

   public boolean sd() {
      return this.sx() != null && this.sx().this_();
   }

   @Override
   protected void break_(rsE_2 var1) {
      rdn_3 var2 = var1.protected_();
      boolean var3 = this.sd() && this.sx().class_(this.sk()) != null;
      if (this.sd() && !var3 && rdn_3.break_(var2, rrEr_1.new_())) {
         rXQ var4 = rXQ.HEAD;
         rdn_3 var5 = this.class_(var4);
         double var6 = (double)this.throws_(var4);
         if (!var5.class_() && (double)Math.max(((Random)this.throws_[40]).nextFloat() - 0.1F, 0.0F) < var6) {
            this.a_(var5);
         }

         this.class_(var1);
         this.class_(var4, var2);
         this.class_(var1, var2.char_());
         var1.PD();
         this.sx().class_(this.sk(), this);
         this.synchronized_(true);
      } else {
         super.break_(var1);
      }
   }

   @Override
   public void break_(rcd_3 var1) {
      super.break_(var1);
      this.super_ = var1.private_("Wave");
      this.this_ = var1.new_("CanJoinRaid");
      if (var1.byte_("RaidId", 3)) {
         if ((rYB)this.throws_[7] instanceof rrEm_1) {
            this.break_ = ((rrEm_1)((rYB)this.throws_[7])).k().class_(var1.private_("RaidId"));
         }

         if (this.break_ != null) {
            this.break_.class_(this.super_, this, false);
            if (this.sF()) {
               this.break_.class_(this.super_, this);
            }
         }
      }
   }

   @Override
   public boolean break_(rye_3 var1, float var2) {
      if (this.sd()) {
         this.sx().final_();
      }

      return super.break_(var1, var2);
   }

   public void break_(int var1) {
      this.else_ = var1;
   }

   @Override
   public void break_(rye_3 var1) {
      if ((rYB)this.throws_[7] instanceof rrEm_1) {
         an_3 var2 = var1.extends_();
         rrEr_1 var3 = this.sx();
         if (var3 != null) {
            if (this.sF()) {
               var3.break_(this.sk());
            }

            if (var2 != null && var2.BC() == aI_2.rM) {
               var3.class_(var2);
            }

            var3.class_(this, false);
         }

         if (this.sF() && var3 == null && ((rrEm_1)((rYB)this.throws_[7])).interface_(this.Bs()) == null) {
            rdn_3 var4 = this.class_(rXQ.HEAD);
            rhd_3 var5 = null;
            if (var2 instanceof rhd_3) {
               var5 = (rhd_3)var2;
            } else if (var2 instanceof rOH var6) {
               iB_2 var7 = var6.sF();
               if (var6.sZ() && var7 instanceof rhd_3) {
                  var5 = (rhd_3)var7;
               }
            }

            if (!var4.class_() && rdn_3.break_(var4, rrEr_1.new_()) && var5 != null) {
               rLY var9 = var5.byte_(rLD.char_);
               int var10 = 1;
               if (var9 != null) {
                  var10 += var9.byte_();
                  var5.class_(rLD.char_);
               } else {
                  var10--;
               }

               var10 = rfU_2.class_(var10, 0, 4);
               rLY var8 = new rLY(rLD.char_, 120000, var10, false, false, true);
               if (!((rYB)this.throws_[7]).B().break_(rRu_1.public_)) {
                  var5.break_(var8);
               }
            }
         }
      }

      super.break_(var1);
   }

   public boolean L() {
      return this.this_;
   }

   public rrEr_1 sx() {
      return this.break_;
   }

   public int sk() {
      return this.super_;
   }

   public void else_(boolean var1) {
      ((rmE_2)this.throws_[49]).break_(class_, var1);
   }

   @Override
   public boolean private_(double var1) {
      return this.sx() == null ? super.private_(var1) : false;
   }

   @Override
   protected void final_() {
      super.final_();
      this.package_.class_(1, new rEG<>(this, this));
      this.package_.class_(3, new rBq_1<>(this));
      this.package_.class_(4, new rEE(this, 1.05F, 1));
      this.package_.class_(5, new rES(this, this));
   }

   @Override
   public boolean strictfp_() {
      return super.strictfp_() || this.sx() != null;
   }

   public int sz() {
      return this.else_;
   }

   @Override
   protected void K_() {
      Integer var5 = (Integer)this.private_[33] + 2;
      this.private_[33] = var5;
   }

   @Override
   public boolean sJ() {
      return !this.sd();
   }

   public boolean sW() {
      return ((rmE_2)this.throws_[49]).class_(class_);
   }

   public abstract rqA_2 sQ();

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.throws_[49]).class_(class_, false);
   }
}
