package celestial;

public class dI_2 extends xF_2 {
   protected static final rjC_2 volatile_ = xd_3.class_(5.0, 0.0, 5.0, 11.0, 10.0, 11.0);
   private final rLR final_;
   private final int package_;

   @Override
   public Jp_1 byte_() {
      return Jp_1.XZ;
   }

   public dI_2(rLR var1, int var2, Jq_1 var3) {
      super(var3);
      this.final_ = var1;
      if (var1.class_()) {
         this.package_ = var2;
      } else {
         this.package_ = var2 * 20;
      }
   }

   @Override
   public rjC_2 class_(xc_3 var1, rRq_1 var2, rfH_2 var3, rjm_3 var4) {
      rjU_2 var5 = var1.class_(var3);
      return volatile_.class_(var5.break_, var5.byte_, var5.protected_);
   }

   public rLR break_() {
      return this.final_;
   }

   public int implements_() {
      return this.package_;
   }
}
