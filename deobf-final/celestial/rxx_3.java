package celestial;

public class rxx_3 extends rdH_2 {
   private final rfH_2 break_;
   protected boolean class_ = true;

   public boolean byte_() {
      return this.class_;
   }

   protected rxx_3(rYB var1, rhd_3 var2, rpm_3 var3, rdn_3 var4, rff_3 var5) {
      super(var1, var2, var3, var4, var5);
      this.break_ = var5.class_().break_(var5.break_());
      this.class_ = var1.byte_(var5.class_()).class_(this);
   }

   public rxx_3(rdH_2 var1) {
      this(var1.int_(), var1.final_(), var1.package_(), var1.volatile_(), var1.implements_());
   }

   public rxx_3(rhd_3 var1, rpm_3 var2, rdn_3 var3, rff_3 var4) {
      this((rYB)var1.throws_[7], var1, var2, var3, var4);
   }

   @Override
   public rfH_2 class_() {
      return this.class_ ? super.class_() : this.break_;
   }

   public static rxx_3 class_(rxx_3 var0, rfH_2 var1, rpr_3 var2) {
      return new rxx_3(
         var0.int_(),
         var0.final_(),
         var0.package_(),
         var0.volatile_(),
         new rff_3(
            new rjU_2(
               (double)var1.b_() + 0.5 + (double)var2.implements_() * 0.5,
               (double)var1.c_() + 0.5 + (double)var2.finally_() * 0.5,
               (double)var1.d_() + 0.5 + (double)var2.extends_() * 0.5
            ),
            var2,
            var1,
            false
         )
      );
   }

   public boolean break_() {
      return this.class_ || this.int_().byte_(this.class_()).class_(this);
   }

   public rpr_3[] throws_() {
      rpr_3[] var1 = rpr_3.class_(this.final_());
      if (this.class_) {
         return var1;
      } else {
         rpr_3 var2 = this.finally_();
         int var3 = 0;

         while (var3 < var1.length && var1[var3] != var2.case_()) {
            var3++;
         }

         if (var3 > 0) {
            System.arraycopy(var1, 0, var1, 1, var3);
            var1[0] = var2.case_();
         }

         return var1;
      }
   }

   public rpr_3 protected_() {
      return rpr_3.class_(this.final_())[0];
   }
}
