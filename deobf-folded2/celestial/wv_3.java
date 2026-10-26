package celestial;

import com.google.common.collect.ImmutableList;

public class wv_3<T extends rGz_1> extends wN_2<T> {
   private final Iq_1 id_class;
   private final Iq_1 id_break = new Iq_1(64, 64, 0, 0);
   private final Iq_1 id_byte;

   public Iq_1 id_byte() {
      return this.id_break;
   }

   public wv_3() {
      super(HU::id_throws);
      this.id_class = new Iq_1(64, 64, 0, 28);
      this.id_byte = new Iq_1(64, 64, 0, 52);
      this.id_break.id_class(-8.0F, -16.0F, -8.0F, 16.0F, 12.0F, 16.0F);
      this.id_break.id_class(0.0F, 24.0F, 0.0F);
      this.id_class.id_class(-8.0F, -8.0F, -8.0F, 16.0F, 8.0F, 16.0F);
      this.id_class.id_class(0.0F, 24.0F, 0.0F);
      this.id_byte.id_class(-3.0F, 0.0F, -3.0F, 6.0F, 6.0F, 6.0F);
      this.id_byte.id_class(0.0F, 12.0F, 0.0F);
   }

   @Override
   public Iterable<Iq_1> id_class() {
      return ImmutableList.of(this.id_class, this.id_break);
   }

   public void id_class(T var1, float var2, float var3, float var4, float var5, float var6) {
      float var7 = var4 - (float)((Integer)var1.id_throws[41]).intValue();
      float var8 = (0.5F + var1.id_throw(var7)) * (float) Math.PI;
      float var9 = -1.0F + rfU_2.id_class(var8);
      float var10 = 0.0F;
      if (var8 > (float) Math.PI) {
         var10 = rfU_2.id_class(var4 * 0.1F) * 0.7F;
      }

      this.id_break.id_class(0.0F, 16.0F + rfU_2.id_class(var8) * 8.0F + var10, 0.0F);
      if (var1.id_throw(var7) > 0.3F) {
         this.id_break.id_catch = var9 * var9 * var9 * var9 * (float) Math.PI * 0.125F;
      } else {
         this.id_break.id_catch = 0.0F;
      }

      this.id_byte.id_case = var6 * (float) (Math.PI / 180.0);
      this.id_byte.id_catch = ((Float)var1.id_private[25] - 180.0F - (Float)var1.id_private[23]) * (float) (Math.PI / 180.0);
   }

   public Iq_1 id_break() {
      return this.id_class;
   }

   public Iq_1 id_protected() {
      return this.id_byte;
   }
}
