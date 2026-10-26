package celestial;

import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class VJ extends QF {
   private final Predicate<Qw_1> rF;
   private final BiConsumer<Qw_1, Boolean> rL;
   private final rgP_2 rA;

   public rgP_2 byte_(Qw_1 var1) {
      return cN_2.class_(this.class_(), this.break_(var1));
   }

   public VJ(String var1, Predicate<Qw_1> var2, BiConsumer<Qw_1, Boolean> var3) {
      this(var1, (rgP_2)null, var2, var3);
   }

   public VJ(String var1, rgP_2 var2, Predicate<Qw_1> var3, BiConsumer<Qw_1, Boolean> var4) {
      super(var1);
      this.rF = var3;
      this.rL = var4;
      this.rA = var2;
   }

   @Override
   public LZ class_(Qw_1 var1, int var2, int var3, int var4) {
      if (this.rA != null) {
         this.class_(((cm_3)QY.instanceof_().class_[15]).break_(this.rA, 200));
      }

      return new Vx_1(this, var2, var3, var4, 20, this, this.byte_(var1), var2x -> {
         this.class_(var1);
         var2x.break_(this.byte_(var1));
      });
   }

   public void class_(Qw_1 var1, String var2) {
      this.class_(var1, "true".equals(var2));
   }

   private void class_(Qw_1 var1, boolean var2) {
      this.rL.accept(var1, var2);
   }

   public void class_(Qw_1 var1) {
      this.class_(var1, !this.break_(var1));
      var1.break_();
   }

   public boolean break_(Qw_1 var1) {
      return this.rF.test(var1);
   }
}
