package celestial;

import java.util.function.Function;

public abstract class wN_2<E extends an_3> extends tp_3<E> {
   public wN_2() {
      this(HU::id_protected);
   }

   public wN_2(Function<rqO_2, HU> var1) {
      super(var1);
   }

   public abstract Iterable<Iq_1> id_class();

   @Override
   public void id_class(Ml_1 var1, Ok_1 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      this.id_class().forEach(var8x -> var8x.id_class(var1, var2, var3, var4, var5, var6, var7, var8));
   }
}
