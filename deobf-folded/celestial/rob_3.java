package celestial;

import java.util.Objects;

class rob_3 implements roG_2 {
   private final double id_break;
   private final double id_byte;
   private final long id_protected;
   private final long id_throws;
   private final double id_case;

   @Override
   public double id_byte() {
      return Math.max(this.id_class.id_break() - this.id_throws() / 2.0, (double)(-this.id_class.id_implements));
   }

   rob_3(roE_2 var1, double var2, double var4, long var6) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var4;
      this.id_case = (double)var6;
      this.id_throws = rqR_2.id_break();
      this.id_protected = this.id_throws + var6;
   }

   @Override
   public double id_class() {
      return Math.max(this.id_class.id_class() - this.id_throws() / 2.0, (double)(-this.id_class.id_implements));
   }

   @Override
   public double id_break() {
      return Math.min(this.id_class.id_class() + this.id_throws() / 2.0, (double)this.id_class.id_implements);
   }

   @Override
   public double id_throws() {
      double var1 = (double)(rqR_2.id_break() - this.id_throws) / this.id_case;
      return var1 < 1.0 ? rfU_2.id_protected(var1, this.id_break, this.id_byte) : this.id_byte;
   }

   @Override
   public void id_finally() {
   }

   @Override
   public long id_catch() {
      return this.id_protected - rqR_2.id_break();
   }

   @Override
   public void id_extends() {
   }

   @Override
   public double id_case() {
      return Math.abs(this.id_break - this.id_byte) / (double)(this.id_protected - this.id_throws);
   }

   @Override
   public roB_2 id_implements() {
      return this.id_byte < this.id_break ? roB_2.SHRINKING : roB_2.GROWING;
   }

   @Override
   public double id_protected() {
      return Math.min(this.id_class.id_break() + this.id_throws() / 2.0, (double)this.id_class.id_implements);
   }

   @Override
   public double id_private() {
      return this.id_byte;
   }

   @Override
   public rjC_2 id_volatile() {
      return rjw_3.id_class(
         rjw_3.id_class,
         rjw_3.id_class(
            Math.floor(this.id_class()),
            Double.NEGATIVE_INFINITY,
            Math.floor(this.id_byte()),
            Math.ceil(this.id_break()),
            Double.POSITIVE_INFINITY,
            Math.ceil(this.id_protected())
         ),
         rjN_2.id_throws
      );
   }

   @Override
   public roG_2 id_native() {
      Object var10000;
      if (this.id_catch() <= 0L) {
         roE_2 var10002 = this.id_class;
         Objects.requireNonNull(this.id_class);
         var10000 = new roO_2(var10002, this.id_byte);
      } else {
         var10000 = this;
      }

      return (roG_2)var10000;
   }
}
