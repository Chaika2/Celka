package celestial;

public class ek_3 implements Uq_1 {
   private final rrEm_1 class_;
   private final rfH_2 break_;

   @Override
   public double byte_() {
      return (double)this.break_.d_() + 0.5;
   }

   public ek_3(rrEm_1 var1, rfH_2 var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   @Override
   public double class_() {
      return (double)this.break_.b_() + 0.5;
   }

   @Override
   public double break_() {
      return (double)this.break_.c_() + 0.5;
   }

   @Override
   public xc_3 throws_() {
      return this.class_.byte_(this.break_);
   }

   @Override
   public rrEm_1 catch_() {
      return this.class_;
   }

   @Override
   public <T extends ryO_2> T case_() {
      return (T)this.class_.class_(this.break_);
   }

   @Override
   public rfH_2 protected_() {
      return this.break_;
   }
}
