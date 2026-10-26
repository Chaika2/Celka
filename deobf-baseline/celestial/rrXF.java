package celestial;

public class rrXF implements rrXI, rrXj_1 {
   private rrXj_1 id_class;
   private boolean id_break;
   private float[] id_byte;

   @Override
   public rrXC id_byte() {
      return rrXC.FLOAT;
   }

   public rrXF(rrXj_1 var1) {
      this.id_class = var1;
   }

   @Override
   public String toString() {
      return "cached(" + this.id_class + ")";
   }

   @Override
   public float[] id_class() {
      if (!this.id_break) {
         this.id_byte = this.id_class.id_class();
         this.id_break = true;
      }

      return this.id_byte;
   }

   @Override
   public void id_break() {
      this.id_break = false;
   }
}
