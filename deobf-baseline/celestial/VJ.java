package celestial;

import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class VJ extends QF {
   private final Predicate<Qw_1> rF;
   private final BiConsumer<Qw_1, Boolean> rL;
   private final rgP_2 rA;

   public rgP_2 id_byte(Qw_1 var1) {
      return cN_2.id_class(this.id_class(), this.id_break(var1));
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
   public LZ id_class(Qw_1 var1, int var2, int var3, int var4) {
      if (this.rA != null) {
         this.id_class(((cm_3)QY.id_instanceof().id_class[15]).id_break(this.rA, 200));
      }

      return new Vx_1(this, var2, var3, var4, 20, this, this.id_byte(var1), var2x -> {
         this.id_class(var1);
         var2x.id_break(this.id_byte(var1));
      });
   }

   public void id_class(Qw_1 var1, String var2) {
      this.id_class(var1, "true".equals(var2));
   }

   private void id_class(Qw_1 var1, boolean var2) {
      this.rL.accept(var1, var2);
   }

   public void id_class(Qw_1 var1) {
      this.id_class(var1, !this.id_break(var1));
      var1.id_break();
   }

   public boolean id_break(Qw_1 var1) {
      return this.rF.test(var1);
   }
}
