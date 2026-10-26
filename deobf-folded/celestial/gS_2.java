package celestial;

import java.util.Arrays;

public class gS_2 {
   private final char[] id_class;
   private int id_break;
   private final Runnable id_byte;

   public gS_2(char[] var1, Runnable var2) {
      this.id_byte = var2;
      if (var1.length < 1) {
         throw new IllegalArgumentException("Must have at least one char");
      } else {
         this.id_class = var1;
      }
   }

   @Override
   public String toString() {
      return "KeyCombo{chars=" + Arrays.toString(this.id_class) + ", matchIndex=" + this.id_break + "}";
   }

   public boolean id_class(char var1) {
      if (var1 == this.id_class[this.id_break++]) {
         if (this.id_break == this.id_class.length) {
            this.id_class();
            this.id_byte.run();
            return true;
         }
      } else {
         this.id_class();
      }

      return false;
   }

   public void id_class() {
      this.id_break = 0;
   }
}
