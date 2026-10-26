package celestial;

public class ZU extends vl_3 {
   private static final rgP_2 class_ = new rgN_2("(").class_(new rgn_3("options.languageWarning")).break_(")").class_(rgF_2.GRAY);
   private Ze_1 throws_;
   final jV_2 private_;
   private Lp_1 implements_;
   private LF finally_;

   public ZU(vm_3 var1, Qw_1 var2, jV_2 var3) {
      super(var1, var2, new rgn_3("options.language"));
      this.private_ = var3;
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, float var4) {
      this.throws_.class_(var1, var2, var3, var4);
      class_(var1, this.super_, this.extends_, this.package_ / 2, 16, 16777215);
      class_(var1, this.super_, class_, this.package_ / 2, this.int_ - 56, 8421504);
      super.class_(var1, var2, var3, var4);
   }

   @Override
   protected void v_() {
      this.throws_ = new Ze_1(this, this.volatile_);
      this.native_.add(this.throws_);
      this.implements_ = this.class_(new Lp_1(this.package_ / 2 - 155, this.int_ - 38, 150, 20, QF.default_, QF.default_.byte_(this.catch_), var1 -> {
         QF.default_.class_(this.catch_);
         this.catch_.break_();
         var1.break_(QF.default_.byte_(this.catch_));
         this.volatile_.v();
      }));
      this.finally_ = this.class_(new LF(this.package_ / 2 - 155 + 160, this.int_ - 38, 150, 20, cN_2.byte_, var1 -> {
         Za_1 var2 = this.throws_.finally_();
         if (var2 != null && !var2.break_.getCode().equals(this.private_.break_().getCode())) {
            this.private_.class_(var2.break_);
            this.catch_.rG = var2.break_.getCode();
            this.volatile_.private_();
            this.finally_.break_(cN_2.byte_);
            this.implements_.break_(QF.default_.byte_(this.catch_));
            this.catch_.break_();
         }

         this.volatile_.break_(this.case_);
      }));
      super.v_();
   }
}
