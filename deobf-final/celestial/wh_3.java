package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public class wh_3<T extends iB_2> extends tW_2<T> implements rruP {
   private List<Iq_1> native_ = Lists.newArrayList();
   public final Iq_1 new_;
   public final Iq_1 continue_;
   public final Iq_1 super_;
   public final Iq_1 this_;
   public final Iq_1 else_;
   private final Iq_1 volatile_;
   private final Iq_1 goto_;
   private final boolean while_;

   public wh_3(float var1, boolean var2) {
      super(HU::private_, var1, 0.0F, 64, 64);
      this.while_ = var2;
      this.goto_ = new Iq_1(this, 24, 0);
      this.goto_.class_(-3.0F, -6.0F, -1.0F, 6.0F, 6.0F, 1.0F, var1);
      this.volatile_ = new Iq_1(this, 0, 0);
      this.volatile_.break_(64, 32);
      this.volatile_.class_(-5.0F, 0.0F, -1.0F, 10.0F, 16.0F, 1.0F, var1);
      if (var2) {
         this.throws_ = new Iq_1(this, 32, 48);
         this.throws_.class_(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, var1);
         this.throws_.class_(5.0F, 2.5F, 0.0F);
         this.protected_ = new Iq_1(this, 40, 16);
         this.protected_.class_(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, var1);
         this.protected_.class_(-5.0F, 2.5F, 0.0F);
         this.new_ = new Iq_1(this, 48, 48);
         this.new_.class_(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, var1 + 0.25F);
         this.new_.class_(5.0F, 2.5F, 0.0F);
         this.continue_ = new Iq_1(this, 40, 32);
         this.continue_.class_(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, var1 + 0.25F);
         this.continue_.class_(-5.0F, 2.5F, 10.0F);
      } else {
         this.throws_ = new Iq_1(this, 32, 48);
         this.throws_.class_(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1);
         this.throws_.class_(5.0F, 2.0F, 0.0F);
         this.new_ = new Iq_1(this, 48, 48);
         this.new_.class_(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1 + 0.25F);
         this.new_.class_(5.0F, 2.0F, 0.0F);
         this.continue_ = new Iq_1(this, 40, 32);
         this.continue_.class_(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1 + 0.25F);
         this.continue_.class_(-5.0F, 2.0F, 10.0F);
      }

      this.catch_ = new Iq_1(this, 16, 48);
      this.catch_.class_(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1);
      this.catch_.class_(1.9F, 12.0F, 0.0F);
      this.super_ = new Iq_1(this, 0, 48);
      this.super_.class_(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1 + 0.25F);
      this.super_.class_(1.9F, 12.0F, 0.0F);
      this.this_ = new Iq_1(this, 0, 32);
      this.this_.class_(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1 + 0.25F);
      this.this_.class_(-1.9F, 12.0F, 0.0F);
      this.else_ = new Iq_1(this, 16, 32);
      this.else_.class_(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, var1 + 0.25F);
      this.else_.class_(0.0F, 0.0F, 0.0F);
   }

   @Override
   public void class_(T var1, float var2, float var3, float var4, float var5, float var6) {
      super.class_((T)var1, var2, var3, var4, var5, var6);
      this.super_.class_(this.catch_);
      this.this_.class_(this.case_);
      this.new_.class_(this.throws_);
      this.continue_.class_(this.protected_);
      this.else_.class_(this.byte_);
      if (var1.class_(rXQ.CHEST).class_()) {
         if (var1.x()) {
            this.volatile_.throws_ = 1.4F;
            this.volatile_.protected_ = 1.85F;
         } else {
            this.volatile_.throws_ = 0.0F;
            this.volatile_.protected_ = 0.0F;
         }
      } else if (var1.x()) {
         this.volatile_.throws_ = 0.3F;
         this.volatile_.protected_ = 0.8F;
      } else {
         this.volatile_.throws_ = -1.1F;
         this.volatile_.protected_ = -0.85F;
      }
   }

   @Override
   public void class_(rpZ_2 var1, Ml_1 var2) {
      Iq_1 var3 = this.class_(var1);
      if (this.while_) {
         float var4 = 0.5F * (float)(var1 == rpZ_2.RIGHT ? 1 : -1);
         var3.byte_ += var4;
         var3.class_(var2);
         var3.byte_ -= var4;
      } else {
         var3.class_(var2);
      }
   }

   public Iq_1 class_(Random var1) {
      return this.native_.get(var1.nextInt(this.native_.size()));
   }

   public void class_(Ml_1 var1, Ok_1 var2, int var3, int var4) {
      this.goto_.class_(this.class_);
      this.goto_.byte_ = 0.0F;
      this.goto_.protected_ = 0.0F;
      this.goto_.class_(var1, var2, var3, var4);
   }

   public void break_(Ml_1 var1, Ok_1 var2, int var3, int var4) {
      this.volatile_.class_(var1, var2, var3, var4);
   }

   @Override
   protected Iterable<Iq_1> break_() {
      return Iterables.concat(super.break_(), ImmutableList.of(this.super_, this.this_, this.new_, this.continue_, this.else_));
   }

   @Override
   public Iq_1 protected_() {
      return this.volatile_;
   }

   @Override
   public void a_(Iq_1 var1) {
      if (this.native_ == null) {
         this.native_ = Lists.newArrayList();
      }

      this.native_.add(var1);
   }

   @Override
   public void b_(boolean var1) {
      super.b_(var1);
      this.new_.finally_ = var1;
      this.continue_.finally_ = var1;
      this.super_.finally_ = var1;
      this.this_.finally_ = var1;
      this.else_.finally_ = var1;
      this.volatile_.finally_ = var1;
      this.goto_.finally_ = var1;
   }
}
