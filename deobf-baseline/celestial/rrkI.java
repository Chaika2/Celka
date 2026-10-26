package celestial;

public class rrkI implements rrkY {
   @Override
   public int id_class(int var1, int var2, int var3, int var4) {
      return (var1 + var2 + var3 + var4) / 4;
   }
}
