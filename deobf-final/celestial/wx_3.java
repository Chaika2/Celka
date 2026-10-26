package celestial;

import com.google.common.collect.ImmutableList;

public class wx_3<T extends an_3> extends wN_2<T> {
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
   private final Iq_1 extends_;

   public wx_3() {
      this.return_ = 32;
      this.public_ = 32;
      byte var1 = 22;
      this.class_ = new Iq_1(this, 12, 22);
      this.class_.class_(-2.5F, -5.0F, -2.5F, 5.0F, 5.0F, 5.0F);
      this.class_.class_(0.0F, 22.0F, 0.0F);
      this.break_ = new Iq_1(this, 24, 0);
      this.break_.class_(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F);
      this.break_.class_(-2.5F, 17.0F, -1.5F);
      this.byte_ = new Iq_1(this, 24, 3);
      this.byte_.class_(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F);
      this.byte_.class_(2.5F, 17.0F, -1.5F);
      this.protected_ = new Iq_1(this, 15, 16);
      this.protected_.class_(-2.5F, -1.0F, 0.0F, 5.0F, 1.0F, 1.0F);
      this.protected_.class_(0.0F, 17.0F, -2.5F);
      this.protected_.case_ = (float) (Math.PI / 4);
      this.throws_ = new Iq_1(this, 10, 16);
      this.throws_.class_(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 1.0F);
      this.throws_.class_(0.0F, 17.0F, 2.5F);
      this.throws_.case_ = (float) (-Math.PI / 4);
      this.case_ = new Iq_1(this, 8, 16);
      this.case_.class_(-1.0F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F);
      this.case_.class_(-2.5F, 22.0F, -2.5F);
      this.case_.catch_ = (float) (-Math.PI / 4);
      this.catch_ = new Iq_1(this, 8, 16);
      this.catch_.class_(-1.0F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F);
      this.catch_.class_(-2.5F, 22.0F, 2.5F);
      this.catch_.catch_ = (float) (Math.PI / 4);
      this.private_ = new Iq_1(this, 4, 16);
      this.private_.class_(0.0F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F);
      this.private_.class_(2.5F, 22.0F, 2.5F);
      this.private_.catch_ = (float) (-Math.PI / 4);
      this.implements_ = new Iq_1(this, 0, 16);
      this.implements_.class_(0.0F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F);
      this.implements_.class_(2.5F, 22.0F, -2.5F);
      this.implements_.catch_ = (float) (Math.PI / 4);
      this.finally_ = new Iq_1(this, 8, 22);
      this.finally_.class_(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      this.finally_.class_(0.5F, 22.0F, 2.5F);
      this.finally_.case_ = (float) (Math.PI / 4);
      this.extends_ = new Iq_1(this, 17, 21);
      this.extends_.class_(-2.5F, 0.0F, 0.0F, 5.0F, 1.0F, 1.0F);
      this.extends_.class_(0.0F, 22.0F, -2.5F);
      this.extends_.case_ = (float) (-Math.PI / 4);
   }

   @Override
   public Iterable<Iq_1> class_() {
      return ImmutableList.of(
         this.class_,
         this.break_,
         this.byte_,
         this.protected_,
         this.throws_,
         this.case_,
         this.catch_,
         this.private_,
         this.implements_,
         this.finally_,
         this.extends_
      );
   }

   @Override
   public void class_(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.break_.private_ = -0.2F + 0.4F * rfU_2.class_(var4 * 0.2F);
      this.byte_.private_ = 0.2F - 0.4F * rfU_2.class_(var4 * 0.2F);
   }
}
