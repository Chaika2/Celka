package celestial;

public class rrWK {
   private int id_class;

   public boolean id_byte() {
      return this.id_class > 0;
   }

   @Override
   public String toString() {
      return "lockCount: " + this.id_class;
   }

   public boolean id_class() {
      this.id_class++;
      return this.id_class == 1;
   }

   public boolean id_break() {
      if (this.id_class <= 0) {
         return false;
      } else {
         this.id_class--;
         return this.id_class == 0;
      }
   }

   public int id_protected() {
      return this.id_class;
   }
}
