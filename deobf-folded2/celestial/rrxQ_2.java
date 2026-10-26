package celestial;

public class rrxQ_2 {
   private boolean id_class;
   private int id_break;

   public boolean id_byte() {
      return this.id_class;
   }

   public rrxQ_2(boolean var1, int var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   public rrxQ_2(boolean var1) {
      this(var1, 1029);
   }

   public rrxQ_2() {
      this(false, 1029);
   }

   @Override
   public String toString() {
      return "enabled: " + this.id_class + ", mode: " + this.id_break;
   }

   public void id_class(boolean var1, int var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   public void id_class(boolean var1) {
      this.id_class = var1;
   }

   public void id_class() {
      this.id_class = true;
   }

   public void id_class(rrxQ_2 var1) {
      this.id_class = var1.id_class;
      this.id_break = var1.id_break;
   }

   public void id_class(int var1) {
      this.id_break = var1;
   }

   public void id_break() {
      this.id_class = false;
   }

   public int id_protected() {
      return this.id_break;
   }
}
