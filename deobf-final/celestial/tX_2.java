package celestial;

import java.util.function.Function;

public abstract class tX_2<E extends an_3> extends tp_3<E> {
   private final boolean class_;
   private final float break_;
   private final float byte_;
   private final float protected_;
   private final float throws_;
   private final float case_;

   protected tX_2() {
      this(false, 5.0F, 2.0F);
   }

   protected tX_2(Function<rqO_2, HU> var1, boolean var2, float var3, float var4, float var5, float var6, float var7) {
      super(var1);
      this.class_ = var2;
      this.break_ = var3;
      this.byte_ = var4;
      this.protected_ = var5;
      this.throws_ = var6;
      this.case_ = var7;
   }

   protected tX_2(boolean var1, float var2, float var3, float var4, float var5, float var6) {
      this(HU::protected_, var1, var2, var3, var4, var5, var6);
   }

   protected tX_2(boolean var1, float var2, float var3) {
      this(var1, var2, var3, 2.0F, 2.0F, 24.0F);
   }

   @Override
   public void class_(Ml_1 var1, Ok_1 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      if (this.int_) {
         var1.class_();
         if (this.class_) {
            float var9 = 1.5F / this.protected_;
            var1.class_(var9, var9, var9);
         }

         var1.class_(0.0, (double)(this.break_ / 16.0F), (double)(this.byte_ / 16.0F));
         this.class_().forEach(var8x -> var8x.class_(var1, var2, var3, var4, var5, var6, var7, var8));
         var1.break_();
         var1.class_();
         float var10 = 1.0F / this.throws_;
         var1.class_(var10, var10, var10);
         var1.class_(0.0, (double)(this.case_ / 16.0F), 0.0);
         this.break_().forEach(var8x -> var8x.class_(var1, var2, var3, var4, var5, var6, var7, var8));
         var1.break_();
      } else {
         this.class_().forEach(var8x -> var8x.class_(var1, var2, var3, var4, var5, var6, var7, var8));
         this.break_().forEach(var8x -> var8x.class_(var1, var2, var3, var4, var5, var6, var7, var8));
      }
   }

   protected abstract Iterable<Iq_1> class_();

   protected abstract Iterable<Iq_1> break_();
}
