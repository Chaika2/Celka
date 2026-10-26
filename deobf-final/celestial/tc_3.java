package celestial;

import com.google.common.collect.ImmutableList;

public class tc_3<T extends is_3 & rEo_1> extends tX_2<T> {
   private final Iq_1 class_;
   private final Iq_1 break_;
   private final Iq_1 byte_;
   private final Iq_1 protected_;
   private final Iq_1 throws_;
   private final Iq_1 case_;
   private final Iq_1 catch_;
   private final Iq_1 private_;
   private final Iq_1 implements_;

   public tc_3() {
      super(true, 8.0F, 6.0F, 1.9F, 2.0F, 24.0F);
      this.return_ = 128;
      this.public_ = 64;
      this.protected_ = new Iq_1(this);
      this.protected_.class_(0.0F, 7.0F, 0.0F);
      this.protected_.class_(1, 1).class_(-8.0F, -7.0F, -13.0F, 16.0F, 14.0F, 26.0F);
      this.implements_ = new Iq_1(this);
      this.implements_.class_(0.0F, -14.0F, -5.0F);
      this.implements_.class_(90, 33).class_(0.0F, 0.0F, -9.0F, 0.0F, 10.0F, 19.0F, 0.001F);
      this.protected_.break_(this.implements_);
      this.class_ = new Iq_1(this);
      this.class_.class_(0.0F, 2.0F, -12.0F);
      this.class_.class_(61, 1).class_(-7.0F, -3.0F, -19.0F, 14.0F, 6.0F, 19.0F);
      this.break_ = new Iq_1(this);
      this.break_.class_(-6.0F, -2.0F, -3.0F);
      this.break_.class_(1, 1).class_(-6.0F, -1.0F, -2.0F, 6.0F, 1.0F, 4.0F);
      this.break_.private_ = (float) -Math.PI * 2.0F / 9.0F;
      this.class_.break_(this.break_);
      this.byte_ = new Iq_1(this);
      this.byte_.class_(6.0F, -2.0F, -3.0F);
      this.byte_.class_(1, 6).class_(0.0F, -1.0F, -2.0F, 6.0F, 1.0F, 4.0F);
      this.byte_.private_ = (float) Math.PI * 2.0F / 9.0F;
      this.class_.break_(this.byte_);
      Iq_1 var1 = new Iq_1(this);
      var1.class_(-7.0F, 2.0F, -12.0F);
      var1.class_(10, 13).class_(-1.0F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F);
      this.class_.break_(var1);
      Iq_1 var2 = new Iq_1(this);
      var2.class_(7.0F, 2.0F, -12.0F);
      var2.class_(1, 13).class_(-1.0F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F);
      this.class_.break_(var2);
      this.class_.case_ = 0.87266463F;
      byte var3 = 14;
      byte var4 = 11;
      this.throws_ = new Iq_1(this);
      this.throws_.class_(-4.0F, 10.0F, -8.5F);
      this.throws_.class_(66, 42).class_(-3.0F, 0.0F, -3.0F, 6.0F, 14.0F, 6.0F);
      this.case_ = new Iq_1(this);
      this.case_.class_(4.0F, 10.0F, -8.5F);
      this.case_.class_(41, 42).class_(-3.0F, 0.0F, -3.0F, 6.0F, 14.0F, 6.0F);
      this.catch_ = new Iq_1(this);
      this.catch_.class_(-5.0F, 13.0F, 10.0F);
      this.catch_.class_(21, 45).class_(-2.5F, 0.0F, -2.5F, 5.0F, 11.0F, 5.0F);
      this.private_ = new Iq_1(this);
      this.private_.class_(5.0F, 13.0F, 10.0F);
      this.private_.class_(0, 45).class_(-2.5F, 0.0F, -2.5F, 5.0F, 11.0F, 5.0F);
   }

   public void class_(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.break_.private_ = ((float) -Math.PI * 2.0F / 9.0F) - var3 * rfU_2.class_(var2);
      this.byte_.private_ = ((float) Math.PI * 2.0F / 9.0F) + var3 * rfU_2.class_(var2);
      this.class_.catch_ = var5 * (float) (Math.PI / 180.0);
      int var7 = ((rEo_1)var1).n();
      float var8 = 1.0F - (float)rfU_2.class_(10 - 2 * var7) / 10.0F;
      this.class_.case_ = rfU_2.catch_(var8, 0.87266463F, (float) (-Math.PI / 9));
      if (var1.n_()) {
         this.class_.protected_ = rfU_2.catch_(var8, 2.0F, 5.0F);
         this.implements_.throws_ = -3.0F;
      } else {
         this.class_.protected_ = 2.0F;
         this.implements_.throws_ = -7.0F;
      }

      float var9 = 1.2F;
      this.throws_.case_ = rfU_2.break_(var2) * 1.2F * var3;
      this.case_.case_ = rfU_2.break_(var2 + (float) Math.PI) * 1.2F * var3;
      this.catch_.case_ = this.case_.case_;
      this.private_.case_ = this.throws_.case_;
   }

   @Override
   protected Iterable<Iq_1> class_() {
      return ImmutableList.of(this.class_);
   }

   @Override
   protected Iterable<Iq_1> break_() {
      return ImmutableList.of(this.protected_, this.throws_, this.case_, this.catch_, this.private_);
   }
}
