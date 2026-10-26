package celestial;

import java.util.Random;

public class Ci_1 extends lO_2 {
   private static final Random id_class = new Random();
   private final Ch_1 id_break;

   Ci_1(gm_3 var1, double var2, double var4, double var6, double var8, double var10, double var12, Ch_1 var14) {
      super(var1, var2, var4, var6, 0.5 - id_class.nextDouble(), var10, 0.5 - id_class.nextDouble());
      this.id_break = var14;
      this.id_extends *= 0.2F;
      if (var8 == 0.0 && var12 == 0.0) {
         this.id_finally *= 0.1F;
         this.id_native *= 0.1F;
      }

      this.id_throw *= 0.75F;
      this.id_this = (int)(8.0 / (Math.random() * 0.8 + 0.2));
      this.id_final = false;
      this.id_break(var14);
   }

   @Override
   public CJ id_class() {
      return CJ.id_byte;
   }

   @Override
   public void id_case() {
      this.id_protected = this.id_catch;
      this.id_throws = this.id_private;
      this.id_case = this.id_implements;
      if (this.id_super++ >= this.id_this) {
         this.id_finally();
      } else {
         this.id_break(this.id_break);
         this.id_extends += 0.004;
         this.id_class(this.id_finally, this.id_extends, this.id_native);
         if (this.id_private == this.id_throws) {
            this.id_finally *= 1.1;
            this.id_native *= 1.1;
         }

         this.id_finally *= 0.96F;
         this.id_extends *= 0.96F;
         this.id_native *= 0.96F;
         if (this.id_volatile) {
            this.id_finally *= 0.7F;
            this.id_native *= 0.7F;
         }
      }
   }
}
