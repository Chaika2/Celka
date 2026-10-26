package celestial;

public class rqw_3 {
   public float id_class;
   public float id_break;
   private long id_byte;
   private final float id_protected;
   private float id_throws = 1.0F;

   public rqw_3(float var1, long var2) {
      this.id_protected = 1000.0F / var1;
      this.id_byte = var2;
   }

   public void id_class(float var1) {
      this.id_throws = var1;
   }

   public float id_class() {
      return this.id_throws;
   }

   public int id_class(long var1) {
      this.id_break = (float)(var1 - this.id_byte) / this.id_protected * this.id_throws;
      this.id_byte = var1;
      this.id_class = this.id_class + this.id_break;
      int var3 = (int)this.id_class;
      this.id_class -= (float)var3;
      return var3;
   }
}
