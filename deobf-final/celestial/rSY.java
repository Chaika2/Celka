package celestial;

import java.util.List;
import java.util.function.Predicate;

public class rSY extends iB_2 {
   private static final rjO_2 final_ = new rjO_2(0.0F, 0.0F, 0.0F);
   private static final rjO_2 package_ = new rjO_2(0.0F, 0.0F, 0.0F);
   private static final rjO_2 int_ = new rjO_2(-10.0F, 0.0F, -10.0F);
   private static final rjO_2 new_ = new rjO_2(-15.0F, 0.0F, 10.0F);
   private static final rjO_2 continue_ = new rjO_2(-1.0F, 0.0F, -1.0F);
   private static final rjO_2 super_ = new rjO_2(1.0F, 0.0F, 1.0F);
   private static final ap_3 this_ = new ap_3(0.0F, 0.0F, true);
   private static final ap_3 else_ = aI_2.break_.volatile_().class_(0.5F);
   public static final rut_3<Byte> class_ = rmE_2.class_(rSY.class, ruw_3.class_);
   public static final rut_3<rjO_2> break_ = rmE_2.class_(rSY.class, ruw_3.extends_);
   public static final rut_3<rjO_2> protected_ = rmE_2.class_(rSY.class, ruw_3.extends_);
   public static final rut_3<rjO_2> implements_ = rmE_2.class_(rSY.class, ruw_3.extends_);
   public static final rut_3<rjO_2> finally_ = rmE_2.class_(rSY.class, ruw_3.extends_);
   public static final rut_3<rjO_2> extends_ = rmE_2.class_(rSY.class, ruw_3.extends_);
   public static final rut_3<rjO_2> native_ = rmE_2.class_(rSY.class, ruw_3.extends_);
   private static final Predicate<an_3> synchronized_ = var0 -> var0 instanceof rsJ_2 && ((rsJ_2)var0).final_() == rsd_3.RIDEABLE;
   private final rqs_3<rdn_3> return_ = rqs_3.class_(2, rdn_3.break_);
   private final rqs_3<rdn_3> public_ = rqs_3.class_(4, rdn_3.break_);
   private boolean goto_;
   public long volatile_;
   private int while_;
   private rjO_2 try_ = final_;
   private rjO_2 instanceof_ = package_;
   private rjO_2 throw_ = int_;
   private rjO_2 interface_ = new_;
   private rjO_2 char_ = continue_;
   private rjO_2 abstract_ = super_;

   @Override
   protected rqA_2 byte_(int var1) {
      return rqn_3.switch_;
   }

   public void byte_(rjO_2 var1) {
      this.throw_ = var1;
      ((rmE_2)this.throws_[49]).break_(implements_, var1);
   }

   private void byte_(boolean var1) {
      ((rmE_2)this.throws_[49]).break_(class_, this.class_(((rmE_2)this.throws_[49]).class_(class_), 4, var1));
   }

   @Override
   protected rqA_2 byte_(rye_3 var1) {
      return rqn_3.r;
   }

   public rjO_2 int_() {
      return this.throw_;
   }

   public rSY(aI_2<? extends rSY> var1, rYB var2) {
      super(var1, var2);
      Float var7 = 0.0F;
      this.throws_[37] = var7;
   }

   public rSY(rYB var1, double var2, double var4, double var6) {
      this(aI_2.break_, var1);
      this.new_(var2, var4, var6);
   }

   @Override
   public void this_() {
      super.this_();
      rjO_2 var1 = ((rmE_2)this.throws_[49]).class_(break_);
      if (!this.try_.equals(var1)) {
         this.class_(var1);
      }

      rjO_2 var2 = ((rmE_2)this.throws_[49]).class_(protected_);
      if (!this.instanceof_.equals(var2)) {
         this.break_(var2);
      }

      rjO_2 var3 = ((rmE_2)this.throws_[49]).class_(implements_);
      if (!this.throw_.equals(var3)) {
         this.byte_(var3);
      }

      rjO_2 var4 = ((rmE_2)this.throws_[49]).class_(finally_);
      if (!this.interface_.equals(var4)) {
         this.protected_(var4);
      }

      rjO_2 var5 = ((rmE_2)this.throws_[49]).class_(extends_);
      if (!this.char_.equals(var5)) {
         this.throws_(var5);
      }

      rjO_2 var6 = ((rmE_2)this.throws_[49]).class_(native_);
      if (!this.abstract_.equals(var6)) {
         this.case_(var6);
      }
   }

   private void class_(boolean var1) {
      ((rmE_2)this.throws_[49]).break_(class_, this.class_(((rmE_2)this.throws_[49]).class_(class_), 1, var1));
   }

   @Override
   public boolean class_(double var1) {
      double var3 = this.rN().class_() * 4.0;
      if (Double.isNaN(var3) || var3 == 0.0) {
         var3 = 4.0;
      }

      var3 *= 64.0;
      return var1 < var3 * var3;
   }

   @Override
   public void class_(byte var1) {
      if (var1 == 32) {
         if (((rYB)this.throws_[7]).continue_) {
            ((rYB)this.throws_[7]).class_(this.rx(), this.re(), this.BO(), rqn_3.r, this.Pr(), 0.3F, 1.0F, false);
            this.volatile_ = ((rYB)this.throws_[7]).r();
         }
      } else {
         super.class_(var1);
      }
   }

   private boolean class_(rhd_3 var1, rXQ var2, rdn_3 var3, rpm_3 var4) {
      rdn_3 var5 = this.class_(var2);
      if (!var5.class_() && (this.while_ & 1 << var2.byte_() + 8) != 0) {
         return false;
      } else if (var5.class_() && (this.while_ & 1 << var2.byte_() + 16) != 0) {
         return false;
      } else if (((rhx_3)var1.implements_[18]).protected_ && var5.class_() && !var3.class_()) {
         rdn_3 var7 = var3.implements_();
         var7.throws_(1);
         this.class_(var2, var7);
         return true;
      } else if (var3.class_() || var3.char_() <= 1) {
         this.class_(var2, var3);
         var1.class_(var4, var5);
         return true;
      } else if (!var5.class_()) {
         return false;
      } else {
         rdn_3 var6 = var3.implements_();
         var6.throws_(1);
         this.class_(var2, var6);
         var3.catch_(1);
         return true;
      }
   }

   @Override
   public ryZ_2 class_(rhd_3 var1, rjU_2 var2, rpm_3 var3) {
      rdn_3 var4 = var1.protected_(var3);
      if (this.implements_() || var4.break_() == rdy_3.dj) {
         return ryZ_2.PASS;
      } else if (var1.native_()) {
         return ryZ_2.SUCCESS;
      } else if (((rYB)var1.throws_[7]).continue_) {
         return ryZ_2.CONSUME;
      } else {
         rXQ var5 = is_3.finally_(var4);
         if (var4.class_()) {
            rXQ var6 = this.finally_(var2);
            rXQ var7 = this.protected_(var6) ? var5 : var6;
            if (this.byte_(var7) && this.class_(var1, var7, var4, var3)) {
               return ryZ_2.SUCCESS;
            }
         } else {
            if (this.protected_(var5)) {
               return ryZ_2.FAIL;
            }

            if (var5.class_() == rXN.HAND && !this.catch_()) {
               return ryZ_2.FAIL;
            }

            if (this.class_(var1, var5, var4, var3)) {
               return ryZ_2.SUCCESS;
            }
         }

         return ryZ_2.PASS;
      }
   }

   @Override
   public void class_(rut_3<?> var1) {
      if (class_.equals(var1)) {
         this.q_();
         Boolean var6 = !this.implements_();
         this.throws_[2] = var6;
      }

      super.class_(var1);
   }

   @Override
   public void class_(rrEm_1 var1, rSg_1 var2) {
   }

   public void class_(rjO_2 var1) {
      this.try_ = var1;
      ((rmE_2)this.throws_[49]).break_(break_, var1);
   }

   private byte class_(byte var1, int var2, boolean var3) {
      if (var3) {
         var1 = (byte)(var1 | var2);
      } else {
         var1 = (byte)(var1 & ~var2);
      }

      return var1;
   }

   @Override
   public void class_(rXQ var1, rdn_3 var2) {
      switch (var1.class_()) {
         case HAND:
            this.break_(var2);
            this.return_.set(var1.break_(), var2);
            break;
         case ARMOR:
            this.break_(var2);
            this.public_.set(var1.break_(), var2);
      }
   }

   @Override
   public boolean class_(int var1, rdn_3 var2) {
      rXQ var3;
      if (var1 == 98) {
         var3 = rXQ.MAINHAND;
      } else if (var1 == 99) {
         var3 = rXQ.OFFHAND;
      } else if (var1 == 100 + rXQ.HEAD.break_()) {
         var3 = rXQ.HEAD;
      } else if (var1 == 100 + rXQ.CHEST.break_()) {
         var3 = rXQ.CHEST;
      } else if (var1 == 100 + rXQ.LEGS.break_()) {
         var3 = rXQ.LEGS;
      } else {
         if (var1 != 100 + rXQ.FEET.break_()) {
            return false;
         }

         var3 = rXQ.FEET;
      }

      if (!var2.class_() && !is_3.byte_(var3, var2) && var3 != rXQ.HEAD) {
         return false;
      } else {
         this.class_(var3, var2);
         return true;
      }
   }

   @Override
   public rdn_3 class_(rXQ var1) {
      switch (var1.class_()) {
         case HAND:
            return this.return_.get(var1.break_());
         case ARMOR:
            return this.public_.get(var1.break_());
         default:
            return rdn_3.break_;
      }
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      rcy_3 var2 = new rcy_3();

      for (rdn_3 var4 : this.public_) {
         rcd_3 var5 = new rcd_3();
         if (!var4.class_()) {
            var4.break_(var5);
         }

         var2.add(var5);
      }

      var1.class_("ArmorItems", var2);
      rcy_3 var7 = new rcy_3();

      for (rdn_3 var9 : this.return_) {
         rcd_3 var6 = new rcd_3();
         if (!var9.class_()) {
            var9.break_(var6);
         }

         var7.add(var6);
      }

      var1.class_("HandItems", var7);
      var1.class_("Invisible", this.Pp());
      var1.class_("Small", this.throws_());
      var1.class_("ShowArms", this.catch_());
      var1.break_("DisabledSlots", this.while_);
      var1.class_("NoBasePlate", this.private_());
      if (this.implements_()) {
         var1.class_("Marker", this.implements_());
      }

      var1.class_("Pose", this.public_());
   }

   @Override
   public void j() {
      this.PD();
   }

   protected float break_(float var1, float var2) {
      Float var7 = (Float)this.throws_[17];
      this.private_[24] = var7;
      Float var8 = (Float)this.throws_[15];
      this.private_[23] = var8;
      return 0.0F;
   }

   @Override
   public void break_(rcd_3 var1) {
      super.break_(var1);
      if (var1.byte_("ArmorItems", 9)) {
         rcy_3 var2 = var1.protected_("ArmorItems", 10);

         for (int var3 = 0; var3 < this.public_.size(); var3++) {
            this.public_.set(var3, rdn_3.class_(var2.class_(var3)));
         }
      }

      if (var1.byte_("HandItems", 9)) {
         rcy_3 var9 = var1.protected_("HandItems", 10);

         for (int var11 = 0; var11 < this.return_.size(); var11++) {
            this.return_.set(var11, rdn_3.class_(var9.class_(var11)));
         }
      }

      this.package_(var1.new_("Invisible"));
      this.class_(var1.new_("Small"));
      this.byte_(var1.new_("ShowArms"));
      this.while_ = var1.private_("DisabledSlots");
      this.protected_(var1.new_("NoBasePlate"));
      this.throws_(var1.new_("Marker"));
      Boolean var8 = !this.else_();
      this.throws_[38] = var8;
      rcd_3 var10 = var1.int_("Pose");
      this.catch_(var10);
   }

   @Override
   protected float break_(iM_2 var1, ap_3 var2) {
      return var2.break_ * (this.n_() ? 0.5F : 0.9F);
   }

   @Override
   public boolean break_(rye_3 var1, float var2) {
      if (((rYB)this.throws_[7]).continue_ || (Boolean)this.throws_[27]) {
         return false;
      } else if (rye_3.volatile_.equals(var1)) {
         this.PD();
         return false;
      } else if (this.class_(var1) || this.goto_ || this.implements_()) {
         return false;
      } else if (var1.protected_()) {
         this.catch_(var1);
         this.PD();
         return false;
      } else if (rye_3.class_.equals(var1)) {
         if (this.Pz()) {
            this.case_(var1, 0.15F);
         } else {
            this.case_(5);
         }

         return false;
      } else if (rye_3.byte_.equals(var1) && this.Ss() > 0.5F) {
         this.case_(var1, 4.0F);
         return false;
      } else {
         boolean var3 = var1.finally_() instanceof rhm_3;
         boolean var4 = var3 && ((rhm_3)var1.finally_()).package_() > 0;
         boolean var5 = "player".equals(var1.new_());
         if (!var5 && !var3) {
            return false;
         } else if (var1.extends_() instanceof rhd_3 && !((rhx_3)((rhd_3)var1.extends_()).implements_[18]).throws_) {
            return false;
         } else if (var1.synchronized_()) {
            this.instanceof_();
            this.goto_();
            this.PD();
            return var4;
         } else {
            long var6 = ((rYB)this.throws_[7]).r();
            if (var6 - this.volatile_ > 5L && !var3) {
               ((rYB)this.throws_[7]).class_(this, (byte)32);
               this.volatile_ = var6;
            } else {
               this.case_(var1);
               this.goto_();
               this.PD();
            }

            return true;
         }
      }
   }

   public void break_(rjO_2 var1) {
      this.instanceof_ = var1;
      ((rmE_2)this.throws_[49]).break_(protected_, var1);
   }

   public boolean throws_() {
      return (((rmE_2)this.throws_[49]).class_(class_) & 1) != 0;
   }

   public void throws_(rjO_2 var1) {
      this.char_ = var1;
      ((rmE_2)this.throws_[49]).break_(extends_, var1);
   }

   private void throws_(boolean var1) {
      ((rmE_2)this.throws_[49]).break_(class_, this.class_(((rmE_2)this.throws_[49]).class_(class_), 16, var1));
   }

   @Override
   public boolean throws_(rdn_3 var1) {
      rXQ var2 = is_3.finally_(var1);
      return this.class_(var2).class_() && !this.protected_(var2);
   }

   @Override
   public boolean finally_(an_3 var1) {
      return var1 instanceof rhd_3 && !((rYB)this.throws_[7]).class_((rhd_3)var1, this.Bs());
   }

   private rXQ finally_(rjU_2 var1) {
      rXQ var2 = rXQ.MAINHAND;
      boolean var3 = this.throws_();
      double var4 = var3 ? var1.byte_ * 2.0 : var1.byte_;
      rXQ var6 = rXQ.FEET;
      if (var4 >= 0.1 && var4 < 0.1 + (var3 ? 0.8 : 0.45) && this.byte_(var6)) {
         var2 = rXQ.FEET;
      } else if (var4 >= 0.9 + (var3 ? 0.3 : 0.0) && var4 < 0.9 + (var3 ? 1.0 : 0.7) && this.byte_(rXQ.CHEST)) {
         var2 = rXQ.CHEST;
      } else if (var4 >= 0.4 && var4 < 0.4 + (var3 ? 1.0 : 0.8) && this.byte_(rXQ.LEGS)) {
         var2 = rXQ.LEGS;
      } else if (var4 >= 1.6 && this.byte_(rXQ.HEAD)) {
         var2 = rXQ.HEAD;
      } else if (!this.byte_(rXQ.MAINHAND) && this.byte_(rXQ.OFFHAND)) {
         var2 = rXQ.OFFHAND;
      }

      return var2;
   }

   private void catch_(rcd_3 var1) {
      rcy_3 var2 = var1.protected_("Head", 5);
      this.class_(var2.isEmpty() ? final_ : new rjO_2(var2));
      rcy_3 var3 = var1.protected_("Body", 5);
      this.break_(var3.isEmpty() ? package_ : new rjO_2(var3));
      rcy_3 var4 = var1.protected_("LeftArm", 5);
      this.byte_(var4.isEmpty() ? int_ : new rjO_2(var4));
      rcy_3 var5 = var1.protected_("RightArm", 5);
      this.protected_(var5.isEmpty() ? new_ : new rjO_2(var5));
      rcy_3 var6 = var1.protected_("LeftLeg", 5);
      this.throws_(var6.isEmpty() ? continue_ : new rjO_2(var6));
      rcy_3 var7 = var1.protected_("RightLeg", 5);
      this.case_(var7.isEmpty() ? super_ : new rjO_2(var7));
   }

   public boolean catch_() {
      return (((rmE_2)this.throws_[49]).class_(class_) & 4) != 0;
   }

   private void catch_(rye_3 var1) {
      this.instanceof_();
      this.protected_(var1);

      for (int var2 = 0; var2 < this.return_.size(); var2++) {
         rdn_3 var3 = this.return_.get(var2);
         if (!var3.class_()) {
            xd_3.class_((rYB)this.throws_[7], this.Bs().final_(), var3);
            this.return_.set(var2, rdn_3.break_);
         }
      }

      for (int var4 = 0; var4 < this.public_.size(); var4++) {
         rdn_3 var5 = this.public_.get(var4);
         if (!var5.class_()) {
            xd_3.class_((rYB)this.throws_[7], this.Bs().final_(), var5);
            this.public_.set(var4, rdn_3.break_);
         }
      }
   }

   private void goto_() {
      if ((rYB)this.throws_[7] instanceof rrEm_1) {
         ((rrEm_1)((rYB)this.throws_[7]))
            .class_(
               new rLX(rLQ.protected_, xu_3.final_.continue_()),
               this.rx(),
               this.byte_(0.6666666666666666),
               this.BO(),
               10,
               (double)(this.PN() / 4.0F),
               (double)(this.Bm() / 4.0F),
               (double)(this.PN() / 4.0F),
               0.05
            );
      }
   }

   private ap_3 case_(boolean var1) {
      if (var1) {
         return this_;
      } else {
         return this.n_() ? else_ : this.BC().volatile_();
      }
   }

   private void case_(rye_3 var1) {
      xd_3.class_((rYB)this.throws_[7], this.Bs(), new rdn_3(rdy_3.dq));
      this.catch_(var1);
   }

   public void case_(rjO_2 var1) {
      this.abstract_ = var1;
      ((rmE_2)this.throws_[49]).break_(native_, var1);
   }

   private void case_(rye_3 var1, float var2) {
      float var3 = this.Ss();
      var3 -= var2;
      if (var3 <= 0.5F) {
         this.catch_(var1);
         this.PD();
      } else {
         this.public_(var3);
      }
   }

   public rjO_2 continue_() {
      return this.char_;
   }

   private boolean else_() {
      return !this.implements_() && !this.rw();
   }

   public boolean implements_() {
      return (((rmE_2)this.throws_[49]).class_(class_) & 16) != 0;
   }

   @Override
   public void implements_(float var1) {
      Float var6 = var1;
      this.throws_[17] = var6;
      Float var7 = var1;
      this.private_[24] = var7;
      Float var8 = var1;
      this.private_[25] = var8;
      Float var9 = var1;
      this.private_[27] = var9;
   }

   @Override
   protected void instanceof_(an_3 var1) {
   }

   private void instanceof_() {
      ((rYB)this.throws_[7]).class_((rhd_3)null, this.rx(), this.re(), this.BO(), rqn_3.double_, this.Pr(), 1.0F, 1.0F);
   }

   public rjO_2 new_() {
      return this.interface_;
   }

   public rjO_2 package_() {
      return this.instanceof_;
   }

   @Override
   public void package_(boolean var1) {
      this.goto_ = var1;
      super.package_(var1);
   }

   public rjO_2 super_() {
      return this.abstract_;
   }

   @Override
   public boolean try_() {
      return super.try_() && this.else_();
   }

   @Override
   public Iterable<rdn_3> rs() {
      return this.return_;
   }

   private rcd_3 public_() {
      rcd_3 var1 = new rcd_3();
      if (!final_.equals(this.try_)) {
         var1.class_("Head", this.try_.class_());
      }

      if (!package_.equals(this.instanceof_)) {
         var1.class_("Body", this.instanceof_.class_());
      }

      if (!int_.equals(this.throw_)) {
         var1.class_("LeftArm", this.throw_.class_());
      }

      if (!new_.equals(this.interface_)) {
         var1.class_("RightArm", this.interface_.class_());
      }

      if (!continue_.equals(this.char_)) {
         var1.class_("LeftLeg", this.char_.class_());
      }

      if (!super_.equals(this.abstract_)) {
         var1.class_("RightLeg", this.abstract_.class_());
      }

      return var1;
   }

   private boolean protected_(rXQ var1) {
      return (this.while_ & 1 << var1.byte_()) != 0 || var1.class_() == rXN.HAND && !this.catch_();
   }

   private void protected_(boolean var1) {
      ((rmE_2)this.throws_[49]).break_(class_, this.class_(((rmE_2)this.throws_[49]).class_(class_), 8, var1));
   }

   public void protected_(rjO_2 var1) {
      this.interface_ = var1;
      ((rmE_2)this.throws_[49]).break_(finally_, var1);
   }

   public boolean private_() {
      return (((rmE_2)this.throws_[49]).class_(class_) & 8) != 0;
   }

   @Override
   public void private_(rjU_2 var1) {
      if (this.else_()) {
         super.private_(var1);
      }
   }

   public rjO_2 final_() {
      return this.try_;
   }

   @Override
   public rjU_2 volatile_(float var1) {
      if (this.implements_()) {
         rfl_3 var2 = this.case_(false).class_(this.Ps());
         rfH_2 var3 = this.Bs();
         int var4 = Integer.MIN_VALUE;

         for (rfH_2 var6 : rfH_2.class_(new rfH_2(var2.class_, var2.break_, var2.byte_), new rfH_2(var2.protected_, var2.throws_, var2.case_))) {
            int var7 = Math.max(((rYB)this.throws_[7]).class_(rRo_1.BLOCK, var6), ((rYB)this.throws_[7]).class_(rRo_1.SKY, var6));
            if (var7 == 15) {
               return rjU_2.class_((rja_3)var6);
            }

            if (var7 > var4) {
               var4 = var7;
               var3 = var6.int_();
            }
         }

         return rjU_2.class_((rja_3)var3);
      } else {
         return super.volatile_(var1);
      }
   }

   @Override
   public void native_(float var1) {
      Float var6 = var1;
      this.throws_[17] = var6;
      Float var7 = var1;
      this.private_[24] = var7;
      Float var8 = var1;
      this.private_[25] = var8;
      Float var9 = var1;
      this.private_[27] = var9;
   }

   @Override
   public boolean rG() {
      return false;
   }

   @Override
   public double Pv() {
      return this.implements_() ? 0.0 : 0.1F;
   }

   @Override
   public boolean rY() {
      return super.rY() && !this.implements_();
   }

   @Override
   public Iterable<rdn_3> PV() {
      return this.public_;
   }

   @Override
   public boolean Bl() {
      return this.Pp();
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.double_;
   }

   @Override
   protected void SS() {
      List var1 = ((rYB)this.throws_[7]).break_(this, this.rN(), synchronized_);

      for (int var2 = 0; var2 < var1.size(); var2++) {
         an_3 var3 = (an_3)var1.get(var2);
         if (this.int_(var3) <= 0.2) {
            var3.byte_(this);
         }
      }
   }

   @Override
   public boolean SL() {
      return false;
   }

   @Override
   public rpZ_2 Su() {
      return rpZ_2.RIGHT;
   }

   @Override
   public boolean Sq() {
      return false;
   }

   @Override
   protected void SA() {
      this.package_(this.goto_);
   }

   @Override
   public ap_3 a_(iM_2 var1) {
      return this.case_(this.implements_());
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.throws_[49]).class_(class_, (byte)0);
      ((rmE_2)this.throws_[49]).class_(break_, final_);
      ((rmE_2)this.throws_[49]).class_(protected_, package_);
      ((rmE_2)this.throws_[49]).class_(implements_, int_);
      ((rmE_2)this.throws_[49]).class_(finally_, new_);
      ((rmE_2)this.throws_[49]).class_(extends_, continue_);
      ((rmE_2)this.throws_[49]).class_(native_, super_);
   }

   @Override
   public void q_() {
      double var1 = this.rx();
      double var3 = this.re();
      double var5 = this.BO();
      super.q_();
      this.new_(var1, var3, var5);
   }

   @Override
   public Qs_1 r_() {
      return this.implements_() ? Qs_1.IGNORE : super.r_();
   }

   @Override
   public boolean n_() {
      return this.throws_();
   }
}
