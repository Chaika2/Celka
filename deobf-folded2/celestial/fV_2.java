package celestial;

public final class fV_2 {
   final rqO_2 id_class;
   int id_break;
   int id_byte;
   final ji_3 id_protected;
   double id_throws = 1.0;

   public int id_byte() {
      return this.id_byte;
   }

   public fV_2(rqO_2 var1, int var2, int var3, ji_3 var4) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
   }

   @Override
   public String toString() {
      return this.id_class
         + ", width: "
         + this.id_break
         + ", height: "
         + this.id_byte
         + ", frames: "
         + this.id_protected.id_class()
         + ", scale: "
         + this.id_throws;
   }

   public rqO_2 id_class() {
      return this.id_class;
   }

   public void id_class(int var1) {
      this.id_break = var1;
   }

   public void id_class(double var1) {
      this.id_throws = var1;
   }

   public void id_break(int var1) {
      this.id_byte = var1;
   }

   public int id_break() {
      return this.id_break;
   }

   public double id_throws() {
      return this.id_throws;
   }

   public ji_3 id_protected() {
      return this.id_protected;
   }
}
