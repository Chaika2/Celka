package celestial;

import java.util.function.Predicate;

public abstract class rkB_2 extends rdb_3 {
   public static final Predicate<rdn_3> id_break = var0 -> var0.id_break().id_class(rlc_3.s);
   public static final Predicate<rdn_3> id_byte = id_break.or(var0 -> var0.id_break() == rdy_3.dc);

   public abstract Predicate<rdn_3> id_byte();

   public rkB_2(rdO_2 var1) {
      super(var1);
   }

   public static rdn_3 id_class(iB_2 var0, Predicate<rdn_3> var1) {
      if (var1.test(var0.id_protected(rpm_3.OFF_HAND))) {
         return var0.id_protected(rpm_3.OFF_HAND);
      } else {
         return var1.test(var0.id_protected(rpm_3.MAIN_HAND)) ? var0.id_protected(rpm_3.MAIN_HAND) : rdn_3.id_break;
      }
   }

   public abstract int id_throws();

   @Override
   public int id_protected() {
      return 1;
   }

   public Predicate<rdn_3> id_private() {
      return this.id_byte();
   }
}
