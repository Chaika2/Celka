package celestial;

import com.google.common.collect.ImmutableList;

public class vM_2 extends vm_3 {
   private static final QF[] class_ = new QF[]{QF.implements_};
   private final vm_3 throws_;
   private final Qw_1 case_;
   private LF catch_;
   private LH private_;
   private rRO implements_;

   private void byte_(boolean var1) {
      this.volatile_.break_(this);
      if (var1 && (gm_3)this.volatile_.class_[56] != null) {
         this.volatile_.void_().class_(new rZP(true));
         this.private_.byte_(true);
         this.private_.int_ = false;
         this.catch_.int_ = false;
      }
   }

   public vM_2(vm_3 var1, Qw_1 var2) {
      super(new rgn_3("options.title"));
      this.throws_ = var1;
      this.case_ = var2;
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.class_(var1);
      class_(var1, this.super_, this.extends_, this.package_ / 2, 15, 16777215);
      super.class_(var1, var2, var3, var4);
   }

   private rgP_2 class_(rRO var1) {
      return new rgn_3("options.difficulty").break_(": ").class_(var1.break_());
   }

   private void class_(rAt_1 var1) {
      ImmutableList var2 = ImmutableList.copyOf(this.case_.private_);
      this.case_.private_.clear();
      this.case_.implements_.clear();

      for (rAp_1 var4 : var1.throws_()) {
         if (!var4.catch_()) {
            this.case_.private_.add(var4.throws_());
            if (!var4.byte_().class_()) {
               this.case_.implements_.add(var4.throws_());
            }
         }
      }

      this.case_.break_();
      ImmutableList var5 = ImmutableList.copyOf(this.case_.private_);
      if (!var5.equals(var2)) {
         this.volatile_.private_();
      }
   }

   @Override
   protected void v_() {
      int var1 = 0;

      for (QF var5 : class_) {
         int var6 = this.package_ / 2 - 155 + var1 % 2 * 160;
         int var7 = this.int_ / 6 - 12 + 24 * (var1 >> 1);
         this.class_(var5.class_((Qw_1)this.volatile_.class_[20], var6, var7, (gm_3)this.volatile_.class_[56] != null ? 150 : 310));
         var1++;
      }

      if ((gm_3)this.volatile_.class_[56] != null) {
         this.implements_ = ((gm_3)this.volatile_.class_[56]).abstract_();
         this.catch_ = this.class_(
            (LF)(new LF(this.package_ / 2 - 155 + var1 % 2 * 160, this.int_ / 6 - 12 + 24 * (var1 >> 1), 150, 20, this.class_(this.implements_), var1x -> {
               this.implements_ = rRO.class_(this.implements_.class_() + 1);
               this.volatile_.void_().class_(new rZZ(this.implements_));
               this.catch_.break_(this.class_(this.implements_));
            }))
         );
         if (this.volatile_.finally_() && !((gm_3)this.volatile_.class_[56]).synchronized_().implements_()) {
            this.catch_.int_(this.catch_.case_() - 20);
            this.private_ = this.class_(
               new LH(
                  this.catch_.volatile_ + this.catch_.case_(),
                  this.catch_.final_,
                  var1x -> this.volatile_
                        .break_(
                           new mT_2(
                              this::byte_,
                              new rgn_3("difficulty.lock.title"),
                              new rgn_3(
                                 "difficulty.lock.question",
                                 new rgn_3("options.difficulty." + ((gm_3)this.volatile_.class_[56]).synchronized_().extends_().byte_())
                              )
                           )
                        )
               )
            );
            this.private_.byte_(((gm_3)this.volatile_.class_[56]).synchronized_().native_());
            this.private_.int_ = !this.private_.private_();
            this.catch_.int_ = !this.private_.private_();
         } else {
            this.catch_.int_ = false;
         }
      }

      this.class_(
         (LF)(new LF(
            this.package_ / 2 - 155,
            this.int_ / 6 + 48 - 6,
            150,
            20,
            new rgn_3("options.skinCustomisation"),
            var1x -> this.volatile_.break_(new ZP(this, this.case_))
         ))
      );
      this.class_(
         (LF)(new LF(
            this.package_ / 2 + 5, this.int_ / 6 + 48 - 6, 150, 20, new rgn_3("options.sounds"), var1x -> this.volatile_.break_(new vO_2(this, this.case_))
         ))
      );
      this.class_(
         (LF)(new LF(
            this.package_ / 2 - 155, this.int_ / 6 + 72 - 6, 150, 20, new rgn_3("options.video"), var1x -> this.volatile_.break_(new vV_2(this, this.case_))
         ))
      );
      this.class_(
         (LF)(new LF(
            this.package_ / 2 + 5, this.int_ / 6 + 72 - 6, 150, 20, new rgn_3("options.controls"), var1x -> this.volatile_.break_(new mI_2(this, this.case_))
         ))
      );
      this.class_(
         (LF)(new LF(
            this.package_ / 2 - 155,
            this.int_ / 6 + 96 - 6,
            150,
            20,
            new rgn_3("options.language"),
            var1x -> this.volatile_.break_(new ZU(this, this.case_, this.volatile_.u()))
         ))
      );
      this.class_(
         (LF)(new LF(
            this.package_ / 2 + 5, this.int_ / 6 + 96 - 6, 150, 20, new rgn_3("options.chat.title"), var1x -> this.volatile_.break_(new mC_2(this, this.case_))
         ))
      );
      this.class_((LF)(new LF(this.package_ / 2 - 155, this.int_ / 6 + 120 - 6, 150, 20, new rgn_3("options.resourcepack"), var1x -> {
         vk_3 var2 = new vk_3(this, this.volatile_.char_(), this::class_, this.volatile_.h(), new rgn_3("resourcePack.title"));
         this.volatile_.break_(new rAO(var2));
      })));
      this.class_(
         (LF)(new LF(
            this.package_ / 2 + 5,
            this.int_ / 6 + 120 - 6,
            150,
            20,
            new rgn_3("options.accessibility.title"),
            var1x -> this.volatile_.break_(new cJ_2(this, this.case_))
         ))
      );
      this.class_((LF)(new LF(this.package_ / 2 - 100, this.int_ / 6 + 168, 200, 20, cN_2.byte_, var1x -> this.volatile_.break_(this.throws_))));
   }

   @Override
   public void w_() {
      super.w_();
      this.case_.break_();
   }
}
