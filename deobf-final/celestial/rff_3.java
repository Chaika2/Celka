package celestial;

public class rff_3 extends rjG_2 {
   private rpr_3 break_;
   private rfH_2 byte_;
   private final boolean protected_;
   private final boolean throws_;

   @Override
   public rjM_2 byte_() {
      return this.protected_ ? rjM_2.MISS : rjM_2.BLOCK;
   }

   private rff_3(boolean var1, rjU_2 var2, rpr_3 var3, rfH_2 var4, boolean var5) {
      super(var2);
      this.protected_ = var1;
      this.break_ = var3;
      this.byte_ = var4;
      this.throws_ = var5;
   }

   public rff_3(rjU_2 var1, rpr_3 var2, rfH_2 var3, boolean var4) {
      this(false, var1, var2, var3, var4);
   }

   public rfH_2 class_() {
      return this.byte_;
   }

   public rff_3 class_(rjU_2 var1) {
      return new rff_3(this.protected_, var1, this.break_, new rfH_2(var1), this.throws_);
   }

   public static rff_3 class_(rjU_2 var0, rpr_3 var1, rfH_2 var2) {
      return new rff_3(true, var0, var1, var2, false);
   }

   public rff_3 class_(rpr_3 var1) {
      return new rff_3(this.protected_, this.class_, var1, this.byte_, this.throws_);
   }

   public rff_3 class_(rfH_2 var1) {
      return new rff_3(this.protected_, this.class_, this.break_, var1, this.throws_);
   }

   public void break_(rfH_2 var1) {
      this.byte_ = var1;
   }

   public void break_(rpr_3 var1) {
      this.break_ = var1;
   }

   public rpr_3 break_() {
      return this.break_;
   }

   public boolean throws_() {
      return this.throws_;
   }

   @Override
   public rrTj_1 protected_() {
      return this.byte_;
   }
}
