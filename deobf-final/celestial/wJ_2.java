package celestial;

import com.google.common.collect.ImmutableList;

public class wJ_2<T extends an_3> extends wN_2<T> {
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
   private final Iq_1 native_;
   private final Iq_1 volatile_;

   public wJ_2() {
      this.return_ = 32;
      this.public_ = 32;
      byte var1 = 22;
      this.class_ = new Iq_1(this, 0, 0);
      this.class_.class_(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F);
      this.class_.class_(0.0F, 22.0F, 0.0F);
      this.break_ = new Iq_1(this, 24, 0);
      this.break_.class_(-2.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F);
      this.break_.class_(-4.0F, 15.0F, -2.0F);
      this.byte_ = new Iq_1(this, 24, 3);
      this.byte_.class_(0.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F);
      this.byte_.class_(4.0F, 15.0F, -2.0F);
      this.protected_ = new Iq_1(this, 15, 17);
      this.protected_.class_(-4.0F, -1.0F, 0.0F, 8.0F, 1.0F, 0.0F);
      this.protected_.class_(0.0F, 14.0F, -4.0F);
      this.protected_.case_ = (float) (Math.PI / 4);
      this.throws_ = new Iq_1(this, 14, 16);
      this.throws_.class_(-4.0F, -1.0F, 0.0F, 8.0F, 1.0F, 1.0F);
      this.throws_.class_(0.0F, 14.0F, 0.0F);
      this.case_ = new Iq_1(this, 23, 18);
      this.case_.class_(-4.0F, -1.0F, 0.0F, 8.0F, 1.0F, 0.0F);
      this.case_.class_(0.0F, 14.0F, 4.0F);
      this.case_.case_ = (float) (-Math.PI / 4);
      this.catch_ = new Iq_1(this, 5, 17);
      this.catch_.class_(-1.0F, -8.0F, 0.0F, 1.0F, 8.0F, 0.0F);
      this.catch_.class_(-4.0F, 22.0F, -4.0F);
      this.catch_.catch_ = (float) (-Math.PI / 4);
      this.private_ = new Iq_1(this, 1, 17);
      this.private_.class_(0.0F, -8.0F, 0.0F, 1.0F, 8.0F, 0.0F);
      this.private_.class_(4.0F, 22.0F, -4.0F);
      this.private_.catch_ = (float) (Math.PI / 4);
      this.implements_ = new Iq_1(this, 15, 20);
      this.implements_.class_(-4.0F, 0.0F, 0.0F, 8.0F, 1.0F, 0.0F);
      this.implements_.class_(0.0F, 22.0F, -4.0F);
      this.implements_.case_ = (float) (-Math.PI / 4);
      this.extends_ = new Iq_1(this, 15, 20);
      this.extends_.class_(-4.0F, 0.0F, 0.0F, 8.0F, 1.0F, 0.0F);
      this.extends_.class_(0.0F, 22.0F, 0.0F);
      this.finally_ = new Iq_1(this, 15, 20);
      this.finally_.class_(-4.0F, 0.0F, 0.0F, 8.0F, 1.0F, 0.0F);
      this.finally_.class_(0.0F, 22.0F, 4.0F);
      this.finally_.case_ = (float) (Math.PI / 4);
      this.native_ = new Iq_1(this, 9, 17);
      this.native_.class_(-1.0F, -8.0F, 0.0F, 1.0F, 8.0F, 0.0F);
      this.native_.class_(-4.0F, 22.0F, 4.0F);
      this.native_.catch_ = (float) (Math.PI / 4);
      this.volatile_ = new Iq_1(this, 9, 17);
      this.volatile_.class_(0.0F, -8.0F, 0.0F, 1.0F, 8.0F, 0.0F);
      this.volatile_.class_(4.0F, 22.0F, 4.0F);
      this.volatile_.catch_ = (float) (-Math.PI / 4);
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
         this.extends_,
         this.finally_,
         this.native_,
         new Iq_1[]{this.volatile_}
      );
   }

   @Override
   public void class_(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.break_.private_ = -0.2F + 0.4F * rfU_2.class_(var4 * 0.2F);
      this.byte_.private_ = 0.2F - 0.4F * rfU_2.class_(var4 * 0.2F);
   }
}
