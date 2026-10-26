package celestial;

public class wX_2<T extends rMK> extends wk_3<T> {
   public wX_2() {
      super(12, 0.0F, true, 16.0F, 4.0F, 2.25F, 2.0F, 24);
      this.return_ = 128;
      this.public_ = 64;
      this.class_ = new Iq_1(this, 0, 0);
      this.class_.class_(-3.5F, -3.0F, -3.0F, 7.0F, 7.0F, 7.0F, 0.0F);
      this.class_.class_(0.0F, 10.0F, -16.0F);
      this.class_.class_(0, 44).class_(-2.5F, 1.0F, -6.0F, 5.0F, 3.0F, 3.0F, 0.0F);
      this.class_.class_(26, 0).class_(-4.5F, -4.0F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F);
      Iq_1 var1 = this.class_.class_(26, 0);
      var1.implements_ = true;
      var1.class_(2.5F, -4.0F, -1.0F, 2.0F, 2.0F, 1.0F, 0.0F);
      this.break_ = new Iq_1(this);
      this.break_.class_(0, 19).class_(-5.0F, -13.0F, -7.0F, 14.0F, 14.0F, 11.0F, 0.0F);
      this.break_.class_(39, 0).class_(-4.0F, -25.0F, -7.0F, 12.0F, 12.0F, 10.0F, 0.0F);
      this.break_.class_(-2.0F, 9.0F, 12.0F);
      byte var2 = 10;
      this.byte_ = new Iq_1(this, 50, 22);
      this.byte_.class_(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 8.0F, 0.0F);
      this.byte_.class_(-3.5F, 14.0F, 6.0F);
      this.protected_ = new Iq_1(this, 50, 22);
      this.protected_.class_(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 8.0F, 0.0F);
      this.protected_.class_(3.5F, 14.0F, 6.0F);
      this.throws_ = new Iq_1(this, 50, 40);
      this.throws_.class_(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 6.0F, 0.0F);
      this.throws_.class_(-2.5F, 14.0F, -7.0F);
      this.case_ = new Iq_1(this, 50, 40);
      this.case_.class_(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 6.0F, 0.0F);
      this.case_.class_(2.5F, 14.0F, -7.0F);
      this.byte_.byte_--;
      this.protected_.byte_++;
      this.byte_.throws_ += 0.0F;
      this.protected_.throws_ += 0.0F;
      this.throws_.byte_--;
      this.case_.byte_++;
      this.throws_.throws_--;
      this.case_.throws_--;
   }

   public void class_(T var1, float var2, float var3, float var4, float var5, float var6) {
      super.class_((T)var1, var2, var3, var4, var5, var6);
      float var7 = var4 - (float)((Integer)var1.throws_[41]).intValue();
      float var8 = var1.throw_(var7);
      var8 *= var8;
      float var9 = 1.0F - var8;
      this.break_.case_ = (float) (Math.PI / 2) - var8 * (float) Math.PI * 0.35F;
      this.break_.protected_ = 9.0F * var9 + 11.0F * var8;
      this.throws_.protected_ = 14.0F * var9 - 6.0F * var8;
      this.throws_.throws_ = -8.0F * var9 - 4.0F * var8;
      this.throws_.case_ -= var8 * (float) Math.PI * 0.45F;
      this.case_.protected_ = this.throws_.protected_;
      this.case_.throws_ = this.throws_.throws_;
      this.case_.case_ -= var8 * (float) Math.PI * 0.45F;
      if (this.int_) {
         this.class_.protected_ = 10.0F * var9 - 9.0F * var8;
         this.class_.throws_ = -16.0F * var9 - 7.0F * var8;
      } else {
         this.class_.protected_ = 10.0F * var9 - 14.0F * var8;
         this.class_.throws_ = -16.0F * var9 - 3.0F * var8;
      }

      this.class_.case_ += var8 * (float) Math.PI * 0.15F;
   }
}
