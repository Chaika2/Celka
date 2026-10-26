package celestial;

import com.google.common.collect.ImmutableList;

public class wv_3<T extends rGz_1> extends wN_2<T> {
   private final Iq_1 class_;
   private final Iq_1 break_ = new Iq_1(64, 64, 0, 0);
   private final Iq_1 byte_;

   public Iq_1 byte_() {
      return this.break_;
   }

   public wv_3() {
      super(HU::throws_);
      this.class_ = new Iq_1(64, 64, 0, 28);
      this.byte_ = new Iq_1(64, 64, 0, 52);
      this.break_.class_(-8.0F, -16.0F, -8.0F, 16.0F, 12.0F, 16.0F);
      this.break_.class_(0.0F, 24.0F, 0.0F);
      this.class_.class_(-8.0F, -8.0F, -8.0F, 16.0F, 8.0F, 16.0F);
      this.class_.class_(0.0F, 24.0F, 0.0F);
      this.byte_.class_(-3.0F, 0.0F, -3.0F, 6.0F, 6.0F, 6.0F);
      this.byte_.class_(0.0F, 12.0F, 0.0F);
   }

   @Override
   public Iterable<Iq_1> class_() {
      return ImmutableList.of(this.class_, this.break_);
   }

   public void class_(T var1, float var2, float var3, float var4, float var5, float var6) {
      float var7 = var4 - (float)((Integer)var1.throws_[41]).intValue();
      float var8 = (0.5F + var1.throw_(var7)) * (float) Math.PI;
      float var9 = -1.0F + rfU_2.class_(var8);
      float var10 = 0.0F;
      if (var8 > (float) Math.PI) {
         var10 = rfU_2.class_(var4 * 0.1F) * 0.7F;
      }

      this.break_.class_(0.0F, 16.0F + rfU_2.class_(var8) * 8.0F + var10, 0.0F);
      if (var1.throw_(var7) > 0.3F) {
         this.break_.catch_ = var9 * var9 * var9 * var9 * (float) Math.PI * 0.125F;
      } else {
         this.break_.catch_ = 0.0F;
      }

      this.byte_.case_ = var6 * (float) (Math.PI / 180.0);
      this.byte_.catch_ = ((Float)var1.private_[25] - 180.0F - (Float)var1.private_[23]) * (float) (Math.PI / 180.0);
   }

   public Iq_1 break_() {
      return this.class_;
   }

   public Iq_1 protected_() {
      return this.byte_;
   }
}
