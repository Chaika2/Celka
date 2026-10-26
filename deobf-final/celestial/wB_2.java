package celestial;

import com.google.common.collect.ImmutableList;

public class wB_2<T extends an_3> extends tX_2<T> {
   protected final Iq_1 class_;
   protected final Iq_1 break_;
   protected final Iq_1 byte_;
   protected final Iq_1 protected_;
   protected final Iq_1 throws_;
   protected final Iq_1 case_;
   protected final Iq_1 catch_;
   protected final Iq_1 private_;
   protected int implements_ = 1;

   public wB_2(float var1) {
      super(true, 10.0F, 4.0F);
      this.catch_ = new Iq_1(this);
      this.catch_.class_("main", -2.5F, -2.0F, -3.0F, 5, 4, 5, var1, 0, 0);
      this.catch_.class_("nose", -1.5F, 0.0F, -4.0F, 3, 2, 2, var1, 0, 24);
      this.catch_.class_("ear1", -2.0F, -3.0F, 0.0F, 1, 1, 2, var1, 0, 10);
      this.catch_.class_("ear2", 1.0F, -3.0F, 0.0F, 1, 1, 2, var1, 6, 10);
      this.catch_.class_(0.0F, 15.0F, -9.0F);
      this.private_ = new Iq_1(this, 20, 0);
      this.private_.class_(-2.0F, 3.0F, -8.0F, 4.0F, 16.0F, 6.0F, var1);
      this.private_.class_(0.0F, 12.0F, -10.0F);
      this.throws_ = new Iq_1(this, 0, 15);
      this.throws_.class_(-0.5F, 0.0F, 0.0F, 1.0F, 8.0F, 1.0F, var1);
      this.throws_.case_ = 0.9F;
      this.throws_.class_(0.0F, 15.0F, 8.0F);
      this.case_ = new Iq_1(this, 4, 15);
      this.case_.class_(-0.5F, 0.0F, 0.0F, 1.0F, 8.0F, 1.0F, var1);
      this.case_.class_(0.0F, 20.0F, 14.0F);
      this.class_ = new Iq_1(this, 8, 13);
      this.class_.class_(-1.0F, 0.0F, 1.0F, 2.0F, 6.0F, 2.0F, var1);
      this.class_.class_(1.1F, 18.0F, 5.0F);
      this.break_ = new Iq_1(this, 8, 13);
      this.break_.class_(-1.0F, 0.0F, 1.0F, 2.0F, 6.0F, 2.0F, var1);
      this.break_.class_(-1.1F, 18.0F, 5.0F);
      this.byte_ = new Iq_1(this, 40, 0);
      this.byte_.class_(-1.0F, 0.0F, 0.0F, 2.0F, 10.0F, 2.0F, var1);
      this.byte_.class_(1.2F, 14.1F, -5.0F);
      this.protected_ = new Iq_1(this, 40, 0);
      this.protected_.class_(-1.0F, 0.0F, 0.0F, 2.0F, 10.0F, 2.0F, var1);
      this.protected_.class_(-1.2F, 14.1F, -5.0F);
   }

   @Override
   public void class_(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.catch_.case_ = var6 * (float) (Math.PI / 180.0);
      this.catch_.catch_ = var5 * (float) (Math.PI / 180.0);
      if (this.implements_ != 3) {
         this.private_.case_ = (float) (Math.PI / 2);
         if (this.implements_ == 2) {
            this.class_.case_ = rfU_2.break_(var2 * 0.6662F) * var3;
            this.break_.case_ = rfU_2.break_(var2 * 0.6662F + 0.3F) * var3;
            this.byte_.case_ = rfU_2.break_(var2 * 0.6662F + (float) Math.PI + 0.3F) * var3;
            this.protected_.case_ = rfU_2.break_(var2 * 0.6662F + (float) Math.PI) * var3;
            this.case_.case_ = 1.7278761F + (float) (Math.PI / 10) * rfU_2.break_(var2) * var3;
         } else {
            this.class_.case_ = rfU_2.break_(var2 * 0.6662F) * var3;
            this.break_.case_ = rfU_2.break_(var2 * 0.6662F + (float) Math.PI) * var3;
            this.byte_.case_ = rfU_2.break_(var2 * 0.6662F + (float) Math.PI) * var3;
            this.protected_.case_ = rfU_2.break_(var2 * 0.6662F) * var3;
            if (this.implements_ == 1) {
               this.case_.case_ = 1.7278761F + (float) (Math.PI / 4) * rfU_2.break_(var2) * var3;
            } else {
               this.case_.case_ = 1.7278761F + 0.47123894F * rfU_2.break_(var2) * var3;
            }
         }
      }
   }

   @Override
   public void class_(T var1, float var2, float var3, float var4) {
      this.private_.protected_ = 12.0F;
      this.private_.throws_ = -10.0F;
      this.catch_.protected_ = 15.0F;
      this.catch_.throws_ = -9.0F;
      this.throws_.protected_ = 15.0F;
      this.throws_.throws_ = 8.0F;
      this.case_.protected_ = 20.0F;
      this.case_.throws_ = 14.0F;
      this.byte_.protected_ = 14.1F;
      this.byte_.throws_ = -5.0F;
      this.protected_.protected_ = 14.1F;
      this.protected_.throws_ = -5.0F;
      this.class_.protected_ = 18.0F;
      this.class_.throws_ = 5.0F;
      this.break_.protected_ = 18.0F;
      this.break_.throws_ = 5.0F;
      this.throws_.case_ = 0.9F;
      if (var1.x()) {
         this.private_.protected_++;
         this.catch_.protected_ += 2.0F;
         this.throws_.protected_++;
         this.case_.protected_ += -4.0F;
         this.case_.throws_ += 2.0F;
         this.throws_.case_ = (float) (Math.PI / 2);
         this.case_.case_ = (float) (Math.PI / 2);
         this.implements_ = 0;
      } else if (var1.PF()) {
         this.case_.protected_ = this.throws_.protected_;
         this.case_.throws_ += 2.0F;
         this.throws_.case_ = (float) (Math.PI / 2);
         this.case_.case_ = (float) (Math.PI / 2);
         this.implements_ = 2;
      } else {
         this.implements_ = 1;
      }
   }

   @Override
   protected Iterable<Iq_1> class_() {
      return ImmutableList.of(this.catch_);
   }

   @Override
   protected Iterable<Iq_1> break_() {
      return ImmutableList.of(this.private_, this.class_, this.break_, this.byte_, this.protected_, this.throws_, this.case_);
   }
}
