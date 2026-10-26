package celestial;

public interface rrBT extends rrBt_1 {
   @Override
   default int id_class(int var1) {
      return var1 - 1;
   }

   @Override
   default int id_break(int var1) {
      return var1 - 1;
   }
}
