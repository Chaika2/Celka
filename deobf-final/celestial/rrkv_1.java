package celestial;

public class rrkv_1 implements rrXf_1 {
   private rrkm_1 class_;
   private int break_;
   private int byte_;

   public rrkv_1(rrkm_1 var1, int var2, int var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
   }

   public rrkv_1(rrkm_1 var1, int var2) {
      this(var1, var2, 0);
   }

   public rrkv_1(rrkm_1 var1) {
      this(var1, 0, 0);
   }

   @Override
   public String toString() {
      if (this.class_.byte_() == null) {
         return this.class_ + "";
      } else {
         return this.class_.protected_() == null
            ? this.class_ + "." + this.class_.byte_()[this.break_]
            : this.class_ + "." + this.class_.byte_()[this.break_] + "." + this.class_.protected_()[this.byte_];
      }
   }

   @Override
   public float class_() {
      return this.class_.class_(this.break_, this.byte_);
   }
}
