package celestial;

import com.google.common.collect.ImmutableList;

public class te_3<T extends rOK> extends tp_3<T> {
   private final Iq_1 class_;
   private final Iq_1 break_;
   private final Iq_1 byte_;
   private final Iq_1 protected_;
   private final Iq_1 throws_;
   private final Iq_1 case_;
   private final Iq_1 catch_;
   private final Iq_1 private_;

   public te_3(float var1) {
      this.return_ = 128;
      this.public_ = 64;
      this.class_ = new Iq_1(this, 0, 0);
      this.class_.class_(-2.0F, -14.0F, -10.0F, 4.0F, 4.0F, 9.0F, var1);
      this.class_.class_(0.0F, 7.0F, -6.0F);
      this.class_.class_(0, 14).class_(-4.0F, -16.0F, -6.0F, 8.0F, 18.0F, 6.0F, var1);
      this.class_.class_(17, 0).class_(-4.0F, -19.0F, -4.0F, 3.0F, 3.0F, 2.0F, var1);
      this.class_.class_(17, 0).class_(1.0F, -19.0F, -4.0F, 3.0F, 3.0F, 2.0F, var1);
      this.break_ = new Iq_1(this, 29, 0);
      this.break_.class_(-6.0F, -10.0F, -7.0F, 12.0F, 18.0F, 10.0F, var1);
      this.break_.class_(0.0F, 5.0F, 2.0F);
      this.catch_ = new Iq_1(this, 45, 28);
      this.catch_.class_(-3.0F, 0.0F, 0.0F, 8.0F, 8.0F, 3.0F, var1);
      this.catch_.class_(-8.5F, 3.0F, 3.0F);
      this.catch_.catch_ = (float) (Math.PI / 2);
      this.private_ = new Iq_1(this, 45, 41);
      this.private_.class_(-3.0F, 0.0F, 0.0F, 8.0F, 8.0F, 3.0F, var1);
      this.private_.class_(5.5F, 3.0F, 3.0F);
      this.private_.catch_ = (float) (Math.PI / 2);
      byte var2 = 4;
      byte var3 = 14;
      this.byte_ = new Iq_1(this, 29, 29);
      this.byte_.class_(-2.0F, 0.0F, -2.0F, 4.0F, 14.0F, 4.0F, var1);
      this.byte_.class_(-2.5F, 10.0F, 6.0F);
      this.protected_ = new Iq_1(this, 29, 29);
      this.protected_.class_(-2.0F, 0.0F, -2.0F, 4.0F, 14.0F, 4.0F, var1);
      this.protected_.class_(2.5F, 10.0F, 6.0F);
      this.throws_ = new Iq_1(this, 29, 29);
      this.throws_.class_(-2.0F, 0.0F, -2.0F, 4.0F, 14.0F, 4.0F, var1);
      this.throws_.class_(-2.5F, 10.0F, -4.0F);
      this.case_ = new Iq_1(this, 29, 29);
      this.case_.class_(-2.0F, 0.0F, -2.0F, 4.0F, 14.0F, 4.0F, var1);
      this.case_.class_(2.5F, 10.0F, -4.0F);
      this.byte_.byte_--;
      this.protected_.byte_++;
      this.byte_.throws_ += 0.0F;
      this.protected_.throws_ += 0.0F;
      this.throws_.byte_--;
      this.case_.byte_++;
      this.throws_.throws_--;
      this.case_.throws_--;
   }

   @Override
   public void class_(Ml_1 var1, Ok_1 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      if (this.int_) {
         float var9 = 2.0F;
         var1.class_();
         float var10 = 0.7F;
         var1.class_(0.71428573F, 0.64935064F, 0.7936508F);
         var1.class_(0.0, 1.3125, 0.22F);
         this.class_.class_(var1, var2, var3, var4, var5, var6, var7, var8);
         var1.break_();
         var1.class_();
         float var11 = 1.1F;
         var1.class_(0.625F, 0.45454544F, 0.45454544F);
         var1.class_(0.0, 2.0625, 0.0);
         this.break_.class_(var1, var2, var3, var4, var5, var6, var7, var8);
         var1.break_();
         var1.class_();
         var1.class_(0.45454544F, 0.41322312F, 0.45454544F);
         var1.class_(0.0, 2.0625, 0.0);
         ImmutableList.of(this.byte_, this.protected_, this.throws_, this.case_, this.catch_, this.private_)
            .forEach(var8x -> var8x.class_(var1, var2, var3, var4, var5, var6, var7, var8));
         var1.break_();
      } else {
         ImmutableList.of(this.class_, this.break_, this.byte_, this.protected_, this.throws_, this.case_, this.catch_, this.private_)
            .forEach(var8x -> var8x.class_(var1, var2, var3, var4, var5, var6, var7, var8));
      }
   }

   public void class_(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.class_.case_ = var6 * (float) (Math.PI / 180.0);
      this.class_.catch_ = var5 * (float) (Math.PI / 180.0);
      this.break_.case_ = (float) (Math.PI / 2);
      this.byte_.case_ = rfU_2.break_(var2 * 0.6662F) * 1.4F * var3;
      this.protected_.case_ = rfU_2.break_(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3;
      this.throws_.case_ = rfU_2.break_(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3;
      this.case_.case_ = rfU_2.break_(var2 * 0.6662F) * 1.4F * var3;
      boolean var7 = !var1.n_() && var1.sJ();
      this.catch_.finally_ = var7;
      this.private_.finally_ = var7;
   }
}
