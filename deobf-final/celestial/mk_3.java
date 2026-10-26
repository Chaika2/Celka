package celestial;

public abstract class mk_3 extends vm_3 {
   private static final rgP_2 finally_ = new rgn_3("advMode.setCommand");
   private static final rgP_2 else_ = new rgn_3("advMode.command");
   private static final rgP_2 synchronized_ = new rgn_3("advMode.previousOutput");
   protected Lu_1 class_;
   protected Lu_1 throws_;
   protected LF case_;
   protected LF catch_;
   protected LF private_;
   protected boolean implements_;
   cW_2 return_;

   public mk_3() {
      super(rgN_2.byte_);
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.class_(var1);
      class_(var1, this.super_, finally_, this.package_ / 2, 20, 16777215);
      break_(var1, this.super_, else_, this.package_ / 2 - 150, 40, 10526880);
      this.class_.class_(var1, var2, var3, var4);
      int var5 = 75;
      if (!this.throws_.private_().isEmpty()) {
         var5 += 46 + this.finally_() - 135;
         break_(var1, this.super_, synchronized_, this.package_ / 2 - 150, var5 + 4, 10526880);
         this.throws_.class_(var1, var2, var3, var4);
      }

      super.class_(var1, var2, var3, var4);
      this.return_.class_(var1, var2, var3);
   }

   protected abstract void class_(rHm_1 var1);

   @Override
   public boolean class_(double var1, double var3, double var5) {
      return this.return_.class_(var5) ? true : super.class_(var1, var3, var5);
   }

   @Override
   public boolean class_(int var1, int var2, int var3) {
      if (this.return_.class_(var1, var2, var3)) {
         return true;
      } else if (super.class_(var1, var2, var3)) {
         return true;
      } else if (var1 != 257 && var1 != 335) {
         return false;
      } else {
         this.native_();
         return true;
      }
   }

   private void class_(String var1) {
      this.return_.class_();
   }

   @Override
   public void class_(QY var1, int var2, int var3) {
      String var4 = this.class_.private_();
      this.break_(var1, var2, var3);
      this.class_.class_(var4);
      this.return_.class_();
   }

   @Override
   public boolean break_(double var1, double var3, int var5) {
      return this.return_.class_(var1, var3, var5) ? true : super.break_(var1, var3, var5);
   }

   abstract int finally_();

   protected void extends_() {
      if (this.implements_().finally_()) {
         this.private_.break_(new rgN_2("O"));
         this.throws_.class_(this.implements_().catch_().getString());
      } else {
         this.private_.break_(new rgN_2("X"));
         this.throws_.class_("-");
      }
   }

   abstract rHm_1 implements_();

   @Override
   public void private_() {
      this.class_.catch_();
   }

   @Override
   public void volatile_() {
      this.implements_().class_(this.implements_);
      this.volatile_.break_((vm_3)null);
   }

   protected void native_() {
      rHm_1 var1 = this.implements_();
      this.class_(var1);
      if (!var1.finally_()) {
         var1.break_((rgP_2)null);
      }

      this.volatile_.break_((vm_3)null);
   }

   @Override
   protected void v_() {
      ((Qj_1)this.volatile_.class_[23]).class_(true);
      this.case_ = this.class_((LF)(new LF(this.package_ / 2 - 4 - 150, this.int_ / 4 + 120 + 12, 150, 20, cN_2.byte_, var1 -> this.native_())));
      this.catch_ = this.class_((LF)(new LF(this.package_ / 2 + 4, this.int_ / 4 + 120 + 12, 150, 20, cN_2.protected_, var1 -> this.volatile_())));
      this.private_ = this.class_((LF)(new LF(this.package_ / 2 + 150 - 20, this.finally_(), 20, 20, new rgN_2("O"), var1 -> {
         rHm_1 var2 = this.implements_();
         var2.class_(!var2.finally_());
         this.extends_();
      })));
      this.class_ = new mW_2(this, this.super_, this.package_ / 2 - 150, 50, 300, 20, new rgn_3("advMode.command"));
      this.class_.implements_(32500);
      this.class_.class_(this::class_);
      this.native_.add(this.class_);
      this.throws_ = new Lu_1(this.super_, this.package_ / 2 - 150, this.finally_(), 276, 20, new rgn_3("advMode.previousOutput"));
      this.throws_.implements_(32500);
      this.throws_.case_(false);
      this.throws_.class_("-");
      this.native_.add(this.throws_);
      this.break_(this.class_);
      this.class_.byte_(true);
      this.return_ = new cW_2(this.volatile_, this, this.class_, this.super_, true, true, 0, 7, false, Integer.MIN_VALUE);
      this.return_.class_(true);
      this.return_.class_();
   }

   @Override
   public void w_() {
      super.w_();
      ((Qj_1)this.volatile_.class_[23]).class_(false);
   }
}
