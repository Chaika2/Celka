package celestial;

public interface uX_2 {
   default float id_class(boolean var1) {
      return this.getAdvance() + (var1 ? this.id_case() : 0.0F);
   }

   default float id_throws() {
      return 0.0F;
   }

   default float id_catch() {
      return 1.0F;
   }

   default float id_case() {
      return 1.0F;
   }

   float getAdvance();
}
