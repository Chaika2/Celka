package celestial;

import java.util.Optional;
import java.util.Random;

public class rSa_1 extends an_3 {
   private static final rut_3<Optional<rfH_2>> break_ = rmE_2.class_(rSa_1.class, ruw_3.volatile_);
   private static final rut_3<Boolean> protected_ = rmE_2.class_(rSa_1.class, ruw_3.implements_);
   public int class_;

   public rSa_1(aI_2<? extends rSa_1> var1, rYB var2) {
      super(var1, var2);
      Boolean var7 = true;
      this.throws_[2] = var7;
      this.class_ = ((Random)this.throws_[40]).nextInt(100000);
   }

   public rSa_1(rYB var1, double var2, double var4, double var6) {
      this(aI_2.super_, var1);
      this.new_(var2, var4, var6);
   }

   @Override
   public void this_() {
      this.class_++;
      if ((rYB)this.throws_[7] instanceof rrEm_1) {
         rfH_2 var1 = this.Bs();
         if (((rrEm_1)((rYB)this.throws_[7])).Q() != null && ((rYB)this.throws_[7]).byte_(var1).catch_()) {
            ((rYB)this.throws_[7]).break_(var1, Jj_1.class_((rYB)this.throws_[7], var1));
         }
      }
   }

   public void class_(boolean var1) {
      this.BQ().break_(protected_, var1);
   }

   public void class_(rfH_2 var1) {
      this.BQ().break_(break_, Optional.ofNullable(var1));
   }

   @Override
   protected void class_(rcd_3 var1) {
      if (this.protected_() != null) {
         var1.class_("BeamTarget", rco_3.class_(this.protected_()));
      }

      var1.class_("ShowBottom", this.throws_());
   }

   @Override
   public boolean class_(double var1) {
      return super.class_(var1) || this.protected_() != null;
   }

   @Override
   public void j() {
      this.break_(rye_3.final_);
      super.j();
   }

   private void break_(rye_3 var1) {
      if ((rYB)this.throws_[7] instanceof rrEm_1) {
         rKG var2 = ((rrEm_1)((rYB)this.throws_[7])).Q();
         if (var2 != null) {
            var2.class_(this, var1);
         }
      }
   }

   @Override
   protected void break_(rcd_3 var1) {
      if (var1.byte_("BeamTarget", 10)) {
         this.class_(rco_3.break_(var1.int_("BeamTarget")));
      }

      if (var1.byte_("ShowBottom", 1)) {
         this.class_(var1.new_("ShowBottom"));
      }
   }

   @Override
   public boolean break_(rye_3 var1, float var2) {
      if (this.class_(var1)) {
         return false;
      } else if (var1.extends_() instanceof rSu_1) {
         return false;
      } else {
         if (!(Boolean)this.throws_[27] && !((rYB)this.throws_[7]).continue_) {
            this.PD();
            if (!var1.protected_()) {
               ((rYB)this.throws_[7]).class_((an_3)null, this.rx(), this.re(), this.BO(), 6.0F, rRz_1.DESTROY);
            }

            this.break_(var1);
         }

         return true;
      }
   }

   public boolean throws_() {
      return this.BQ().class_(protected_);
   }

   public rfH_2 protected_() {
      return this.BQ().class_(break_).orElse((rfH_2)null);
   }

   @Override
   public boolean rY() {
      return true;
   }

   @Override
   protected boolean PK() {
      return false;
   }

   @Override
   protected void m_() {
      this.BQ().class_(break_, Optional.empty());
      this.BQ().class_(protected_, true);
   }

   @Override
   public ruS_2<?> p_() {
      return new rFJ(this);
   }
}
