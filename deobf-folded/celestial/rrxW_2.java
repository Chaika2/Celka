package celestial;

public class rrxW_2 {
   private boolean id_class;
   private int id_break;
   private float id_byte;

   public boolean id_byte() {
      return this.id_class;
   }

   public rrxW_2(boolean var1, int var2, float var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
   }

   public rrxW_2(boolean var1) {
      this(var1, 519, 0.0F);
   }

   public rrxW_2() {
      this(false, 519, 0.0F);
   }

   @Override
   public String toString() {
      return "enabled: " + this.id_class + ", func: " + this.id_break + ", ref: " + this.id_byte;
   }

   public void id_class() {
      this.id_class = true;
   }

   public void id_class(boolean var1, int var2, float var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
   }

   public void id_class(rrxW_2 var1) {
      this.id_class = var1.id_class;
      this.id_break = var1.id_break;
      this.id_byte = var1.id_byte;
   }

   public void id_class(int var1, float var2) {
      this.id_break = var1;
      this.id_byte = var2;
   }

   public void id_class(boolean var1) {
      this.id_class = var1;
   }

   public void id_break() {
      this.id_class = false;
   }

   public float id_throws() {
      return this.id_byte;
   }

   public void id_case() {
      if (!this.id_class) {
         MT.id_protected();
      } else {
         MT.id_throws();
         MT.id_class(this.id_break, this.id_byte);
      }
   }

   public int id_protected() {
      return this.id_break;
   }
}
