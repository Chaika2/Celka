package celestial;

public class rrbK_2 {
   private int id_class;
   private int id_break = 0;
   private int id_byte = 0;
   private boolean id_protected = false;
   private boolean id_throws = false;

   public rrbK_2(int var1) {
      this.id_class = var1;
   }

   public void id_class() {
      if (this.id_byte > 0) {
         rrbb_3.id_throws("Suppressed " + this.id_break + " OpenGL errors: " + this.id_class);
      }

      this.id_protected = this.id_break > 10;
      this.id_break = 0;
      this.id_byte = 0;
      this.id_throws = true;
   }

   public boolean id_break() {
      this.id_break++;
      if (this.id_throws) {
         this.id_throws = false;
         return true;
      } else {
         if (this.id_protected) {
            this.id_byte++;
         }

         return !this.id_protected;
      }
   }
}
