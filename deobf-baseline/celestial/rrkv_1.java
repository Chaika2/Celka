package celestial;

public class rrkv_1 implements rrXf_1 {
   private rrkm_1 id_class;
   private int id_break;
   private int id_byte;

   public rrkv_1(rrkm_1 var1, int var2, int var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
   }

   public rrkv_1(rrkm_1 var1, int var2) {
      this(var1, var2, 0);
   }

   public rrkv_1(rrkm_1 var1) {
      this(var1, 0, 0);
   }

   @Override
   public String toString() {
      if (this.id_class.id_byte() == null) {
         return this.id_class + "";
      } else {
         return this.id_class.id_protected() == null
            ? this.id_class + "." + this.id_class.id_byte()[this.id_break]
            : this.id_class + "." + this.id_class.id_byte()[this.id_break] + "." + this.id_class.id_protected()[this.id_byte];
      }
   }

   @Override
   public float id_class() {
      return this.id_class.id_class(this.id_break, this.id_byte);
   }
}
