package celestial;

public interface uJ_2 extends uX_2 {
   float id_byte();

   int id_class();

   void id_class(int var1, int var2);

   int id_break();

   default float id_finally() {
      return this.id_native();
   }

   default float id_extends() {
      return this.id_finally() + (float)this.id_break() / this.id_byte();
   }

   default float id_implements() {
      return this.id_private() + (float)this.id_class() / this.id_byte();
   }

   boolean id_protected();

   default float id_private() {
      return this.id_throws();
   }

   default float id_native() {
      return 3.0F;
   }
}
