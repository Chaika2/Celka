package celestial;

import java.util.function.Predicate;

public abstract class rkB_2 extends rdb_3 {
   public static final Predicate<rdn_3> break_ = var0 -> var0.break_().class_(rlc_3.s);
   public static final Predicate<rdn_3> byte_ = break_.or(var0 -> var0.break_() == rdy_3.dc);

   public abstract Predicate<rdn_3> byte_();

   public rkB_2(rdO_2 var1) {
      super(var1);
   }

   public static rdn_3 class_(iB_2 var0, Predicate<rdn_3> var1) {
      if (var1.test(var0.protected_(rpm_3.OFF_HAND))) {
         return var0.protected_(rpm_3.OFF_HAND);
      } else {
         return var1.test(var0.protected_(rpm_3.MAIN_HAND)) ? var0.protected_(rpm_3.MAIN_HAND) : rdn_3.break_;
      }
   }

   public abstract int throws_();

   @Override
   public int protected_() {
      return 1;
   }

   public Predicate<rdn_3> private_() {
      return this.byte_();
   }
}
