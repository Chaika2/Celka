package celestial;

import java.util.function.Function;

public abstract class tX_2<E extends an_3> extends tp_3<E> {
   private final boolean id_class;
   private final float id_break;
   private final float id_byte;
   private final float id_protected;
   private final float id_throws;
   private final float id_case;

   protected tX_2() {
      this(false, 5.0F, 2.0F);
   }

   protected tX_2(Function<rqO_2, HU> var1, boolean var2, float var3, float var4, float var5, float var6, float var7) {
      super(var1);
      this.id_class = var2;
      this.id_break = var3;
      this.id_byte = var4;
      this.id_protected = var5;
      this.id_throws = var6;
      this.id_case = var7;
   }

   protected tX_2(boolean var1, float var2, float var3, float var4, float var5, float var6) {
      this(HU::id_protected, var1, var2, var3, var4, var5, var6);
   }

   protected tX_2(boolean var1, float var2, float var3) {
      this(var1, var2, var3, 2.0F, 2.0F, 24.0F);
   }

   @Override
   public void id_class(Ml_1 var1, Ok_1 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      if (this.id_int) {
         var1.id_class();
         if (this.id_class) {
            float var9 = 1.5F / this.id_protected;
            var1.id_class(var9, var9, var9);
         }

         var1.id_class(0.0, (double)(this.id_break / 16.0F), (double)(this.id_byte / 16.0F));
         this.id_class().forEach(var8x -> var8x.id_class(var1, var2, var3, var4, var5, var6, var7, var8));
         var1.id_break();
         var1.id_class();
         float var10 = 1.0F / this.id_throws;
         var1.id_class(var10, var10, var10);
         var1.id_class(0.0, (double)(this.id_case / 16.0F), 0.0);
         this.id_break().forEach(var8x -> var8x.id_class(var1, var2, var3, var4, var5, var6, var7, var8));
         var1.id_break();
      } else {
         this.id_class().forEach(var8x -> var8x.id_class(var1, var2, var3, var4, var5, var6, var7, var8));
         this.id_break().forEach(var8x -> var8x.id_class(var1, var2, var3, var4, var5, var6, var7, var8));
      }
   }

   protected abstract Iterable<Iq_1> id_class();

   protected abstract Iterable<Iq_1> id_break();
}
