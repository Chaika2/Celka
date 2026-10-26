package celestial;

import com.google.common.collect.ImmutableList;

public class tk_3<T extends rbF_2> extends tX_2<T> {
   private final Iq_1 class_;
   private final Iq_1 break_;
   private final Iq_1 byte_;
   private final Iq_1 protected_;
   private final Iq_1 throws_;
   private final Iq_1 case_;
   private final Iq_1 catch_;
   private final Iq_1 private_;
   private final Iq_1 implements_;
   private final Iq_1 finally_;
   private float extends_;

   public tk_3() {
      super(false, 24.0F, 0.0F);
      this.return_ = 64;
      this.public_ = 64;
      this.class_ = new Iq_1(this);
      this.class_.class_(0.0F, 19.0F, 0.0F);
      this.break_ = new Iq_1(this, 0, 0);
      this.break_.class_(0.0F, 0.0F, 0.0F);
      this.class_.break_(this.break_);
      this.break_.class_(-3.5F, -4.0F, -5.0F, 7.0F, 7.0F, 10.0F, 0.0F);
      this.private_ = new Iq_1(this, 26, 7);
      this.private_.class_(0.0F, -1.0F, 5.0F, 0.0F, 1.0F, 2.0F, 0.0F);
      this.break_.break_(this.private_);
      this.implements_ = new Iq_1(this, 2, 0);
      this.implements_.class_(0.0F, -2.0F, -5.0F);
      this.implements_.class_(1.5F, -2.0F, -3.0F, 1.0F, 2.0F, 3.0F, 0.0F);
      this.finally_ = new Iq_1(this, 2, 3);
      this.finally_.class_(0.0F, -2.0F, -5.0F);
      this.finally_.class_(-2.5F, -2.0F, -3.0F, 1.0F, 2.0F, 3.0F, 0.0F);
      this.break_.break_(this.implements_);
      this.break_.break_(this.finally_);
      this.byte_ = new Iq_1(this, 0, 18);
      this.byte_.class_(-1.5F, -4.0F, -3.0F);
      this.byte_.case_ = 0.0F;
      this.byte_.catch_ = -0.2618F;
      this.byte_.private_ = 0.0F;
      this.class_.break_(this.byte_);
      this.byte_.class_(-9.0F, 0.0F, 0.0F, 9.0F, 0.0F, 6.0F, 0.001F);
      this.protected_ = new Iq_1(this, 0, 18);
      this.protected_.class_(1.5F, -4.0F, -3.0F);
      this.protected_.case_ = 0.0F;
      this.protected_.catch_ = 0.2618F;
      this.protected_.private_ = 0.0F;
      this.protected_.implements_ = true;
      this.class_.break_(this.protected_);
      this.protected_.class_(0.0F, 0.0F, 0.0F, 9.0F, 0.0F, 6.0F, 0.001F);
      this.throws_ = new Iq_1(this);
      this.throws_.class_(1.5F, 3.0F, -2.0F);
      this.class_.break_(this.throws_);
      this.throws_.class_("frontLegBox", -5.0F, 0.0F, 0.0F, 7, 2, 0, 0.0F, 26, 1);
      this.case_ = new Iq_1(this);
      this.case_.class_(1.5F, 3.0F, 0.0F);
      this.class_.break_(this.case_);
      this.case_.class_("midLegBox", -5.0F, 0.0F, 0.0F, 7, 2, 0, 0.0F, 26, 3);
      this.catch_ = new Iq_1(this);
      this.catch_.class_(1.5F, 3.0F, 2.0F);
      this.class_.break_(this.catch_);
      this.catch_.class_("backLegBox", -5.0F, 0.0F, 0.0F, 7, 2, 0, 0.0F, 26, 5);
   }

   @Override
   protected Iterable<Iq_1> class_() {
      return ImmutableList.of();
   }

   public void class_(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.byte_.case_ = 0.0F;
      this.implements_.case_ = 0.0F;
      this.finally_.case_ = 0.0F;
      this.class_.case_ = 0.0F;
      this.class_.protected_ = 19.0F;
      boolean var7 = var1.BL() && var1.rv().catch_() < 1.0E-7;
      if (var7) {
         this.byte_.catch_ = -0.2618F;
         this.byte_.private_ = 0.0F;
         this.protected_.case_ = 0.0F;
         this.protected_.catch_ = 0.2618F;
         this.protected_.private_ = 0.0F;
         this.throws_.case_ = 0.0F;
         this.case_.case_ = 0.0F;
         this.catch_.case_ = 0.0F;
      } else {
         float var8 = var4 * 2.1F;
         this.byte_.catch_ = 0.0F;
         this.byte_.private_ = rfU_2.break_(var8) * (float) Math.PI * 0.15F;
         this.protected_.case_ = this.byte_.case_;
         this.protected_.catch_ = this.byte_.catch_;
         this.protected_.private_ = -this.byte_.private_;
         this.throws_.case_ = (float) (Math.PI / 4);
         this.case_.case_ = (float) (Math.PI / 4);
         this.catch_.case_ = (float) (Math.PI / 4);
         this.class_.case_ = 0.0F;
         this.class_.catch_ = 0.0F;
         this.class_.private_ = 0.0F;
      }

      if (!var1.T_()) {
         this.class_.case_ = 0.0F;
         this.class_.catch_ = 0.0F;
         this.class_.private_ = 0.0F;
         if (!var7) {
            float var9 = rfU_2.break_(var4 * 0.18F);
            this.class_.case_ = 0.1F + var9 * (float) Math.PI * 0.025F;
            this.implements_.case_ = var9 * (float) Math.PI * 0.03F;
            this.finally_.case_ = var9 * (float) Math.PI * 0.03F;
            this.throws_.case_ = -var9 * (float) Math.PI * 0.1F + (float) (Math.PI / 8);
            this.catch_.case_ = -var9 * (float) Math.PI * 0.05F + (float) (Math.PI / 4);
            this.class_.protected_ = 19.0F - rfU_2.break_(var4 * 0.18F) * 0.9F;
         }
      }

      if (this.extends_ > 0.0F) {
         this.class_.case_ = wP_2.class_(this.class_.case_, 3.0915928F, this.extends_);
      }
   }

   public void class_(T var1, float var2, float var3, float var4) {
      super.class_(var1, var2, var3, var4);
      this.extends_ = var1.throw_(var4);
      this.private_.finally_ = !var1.su();
   }

   @Override
   protected Iterable<Iq_1> break_() {
      return ImmutableList.of(this.class_);
   }
}
