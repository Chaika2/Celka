package celestial;

import java.util.function.IntUnaryOperator;

public class rWD implements IntUnaryOperator {
   final Integer id_class;
   final Integer id_break;
   private final IntUnaryOperator id_byte;

   rWD(Integer var1, Integer var2) {
      this.id_class = var1;
      this.id_break = var2;
      if (var1 == null) {
         if (var2 == null) {
            this.id_byte = var0 -> var0;
         } else {
            int var3 = var2;
            this.id_byte = var1x -> Math.min(var3, var1x);
         }
      } else {
         int var5 = var1;
         if (var2 == null) {
            this.id_byte = var1x -> Math.max(var5, var1x);
         } else {
            int var4 = var2;
            this.id_byte = var2x -> rfU_2.id_class(var2x, var5, var4);
         }
      }
   }

   public static rWD id_class(int var0) {
      return new rWD(var0, (Integer)null);
   }

   public static rWD id_class(int var0, int var1) {
      return new rWD(var0, var1);
   }

   public static rWD id_break(int var0) {
      return new rWD((Integer)null, var0);
   }

   @Override
   public int applyAsInt(int var1) {
      return this.id_byte.applyAsInt(var1);
   }
}
