package celestial;

import java.util.function.Function;

public abstract class wN_2<E extends an_3> extends tp_3<E> {
   public wN_2() {
      this(HU::protected_);
   }

   public wN_2(Function<rqO_2, HU> var1) {
      super(var1);
   }

   public abstract Iterable<Iq_1> class_();

   @Override
   public void class_(Ml_1 var1, Ok_1 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      this.class_().forEach(var8x -> var8x.class_(var1, var2, var3, var4, var5, var6, var7, var8));
   }
}
