package celestial;

public interface rrBT extends rrBt_1 {
   @Override
   default int class_(int var1) {
      return var1 - 1;
   }

   @Override
   default int break_(int var1) {
      return var1 - 1;
   }
}
