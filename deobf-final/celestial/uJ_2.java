package celestial;

public interface uJ_2 extends uX_2 {
   float byte_();

   int class_();

   void class_(int var1, int var2);

   int break_();

   default float finally_() {
      return this.native_();
   }

   default float extends_() {
      return this.finally_() + (float)this.break_() / this.byte_();
   }

   default float implements_() {
      return this.private_() + (float)this.class_() / this.byte_();
   }

   boolean protected_();

   default float private_() {
      return this.throws_();
   }

   default float native_() {
      return 3.0F;
   }
}
