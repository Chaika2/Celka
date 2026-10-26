package celestial;

public class TK<T extends an_3 & aK_2, M extends tp_3<T>> extends Tf_1<T, M> {
   private final rqO_2 id_class;
   private final M id_break;

   public TK(qE_2<T, M> var1, M var2, rqO_2 var3) {
      super(var1);
      this.id_break = (M)var2;
      this.id_class = var3;
   }

   @Override
   public void id_class(Ml_1 var1, Hx_1 var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      if (((aK_2)var4).id_byte()) {
         this.id_byte().id_class(this.id_break);
         this.id_break.id_class((T)var4, var5, var6, var7);
         this.id_break.id_class((T)var4, var5, var6, var8, var9, var10);
         Ok_1 var11 = var2.getBuffer(HU.id_protected(this.id_class));
         this.id_break.id_class(var1, var11, var3, fZ_2.id_class, 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
