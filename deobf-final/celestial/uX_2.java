package celestial;

public interface uX_2 {
   default float class_(boolean var1) {
      return this.getAdvance() + (var1 ? this.case_() : 0.0F);
   }

   default float throws_() {
      return 0.0F;
   }

   default float catch_() {
      return 1.0F;
   }

   default float case_() {
      return 1.0F;
   }

   float getAdvance();
}
