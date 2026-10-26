package celestial;

public abstract class TH<T extends an_3 & aR_2, M extends tp_3<T>> extends Tf_1<T, M> {
   public TH(qE_2<T, M> var1) {
      super(var1);
   }

   protected abstract rqO_2 class_();

   protected abstract float class_(float var1);

   @Override
   public void class_(Ml_1 var1, Hx_1 var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      if (((aR_2)var4).class_()) {
         float var11 = (float)((Integer)var4.throws_[41]).intValue() + var7;
         tp_3 var12 = this.break_();
         var12.class_(var4, var5, var6, var7);
         this.byte_().class_(var12);
         Ok_1 var13 = var2.getBuffer(HU.class_(this.class_(), this.class_(var11), var11 * 0.01F));
         var12.class_(var4, var5, var6, var8, var9, var10);
         var12.class_(var1, var13, var3, fZ_2.class_, 0.5F, 0.5F, 0.5F, 1.0F);
      }
   }

   protected abstract tp_3<T> break_();
}
