package celestial;

public abstract class Tf_1<T extends an_3, M extends tp_3<T>> {
   private final qE_2<T, M> id_class;

   public M id_byte() {
      return this.id_class.id_class();
   }

   public Tf_1(qE_2<T, M> var1) {
      this.id_class = var1;
   }

   public abstract void id_class(Ml_1 var1, Hx_1 var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10);

   protected rqO_2 id_class(T var1) {
      return this.id_class.id_class((T)var1);
   }

   protected static <T extends iB_2> void id_class(
      tp_3<T> var0,
      tp_3<T> var1,
      rqO_2 var2,
      Ml_1 var3,
      Hx_1 var4,
      int var5,
      T var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14,
      float var15
   ) {
      if (!var6.Pp()) {
         var0.id_class(var1);
         var1.id_class(var6, var7, var8, var12);
         var1.id_class(var6, var7, var8, var9, var10, var11);
         id_class(var1, var2, var3, var4, var5, var6, var13, var14, var15);
      }
   }

   protected static <T extends iB_2> void id_class(tp_3<T> var0, rqO_2 var1, Ml_1 var2, Hx_1 var3, int var4, T var5, float var6, float var7, float var8) {
      Ok_1 var9 = var3.getBuffer(HU.id_protected(var1));
      var0.id_class(var2, var9, var4, qd_3.id_byte(var5, 0.0F), var6, var7, var8, 1.0F);
   }
}
