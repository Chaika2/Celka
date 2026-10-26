package celestial;

import com.google.common.collect.ImmutableList;

public final class Ha_1 {
   final HR class_;
   private final Ho_1 break_;
   private final Hp_1 byte_;
   private final HV protected_;
   private final HC throws_;
   private final Hy_1 case_;
   final HH catch_;
   private final Ht_1 private_;
   private final Hf_1 implements_;
   private final Hq_1 finally_;
   private final HT extends_;
   private final Hg_1 native_;
   private final HY volatile_;
   private final HK final_;
   private final Hw_1 package_;
   final He_1 int_;
   final ImmutableList<Hn_1> new_;

   Ha_1(
      HR var1,
      Ho_1 var2,
      Hp_1 var3,
      HV var4,
      HC var5,
      Hy_1 var6,
      HH var7,
      Ht_1 var8,
      Hf_1 var9,
      Hq_1 var10,
      HT var11,
      Hg_1 var12,
      HY var13,
      HK var14,
      Hw_1 var15,
      He_1 var16
   ) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
      this.throws_ = var5;
      this.case_ = var6;
      this.catch_ = var7;
      this.private_ = var8;
      this.implements_ = var9;
      this.finally_ = var10;
      this.extends_ = var11;
      this.native_ = var12;
      this.volatile_ = var13;
      this.final_ = var14;
      this.package_ = var15;
      this.int_ = var16;
      this.new_ = ImmutableList.of(
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
         this.extends_,
         this.native_,
         new Hn_1[]{this.volatile_, this.final_, this.package_}
      );
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         Ha_1 var2 = (Ha_1)var1;
         return this.int_ == var2.int_ && this.new_.equals(var2.new_);
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return "CompositeState[" + this.new_ + ", outlineProperty=" + this.int_ + "]";
   }

   @Override
   public int hashCode() {
      return rrWX.class_(this.new_, this.int_);
   }

   public static Hi_1 class_() {
      return new Hi_1();
   }

   public Hi_1 break_() {
      Hi_1 var1 = new Hi_1();
      var1.class_(this.class_);
      var1.class_(this.break_);
      var1.class_(this.byte_);
      var1.class_(this.protected_);
      var1.class_(this.throws_);
      var1.class_(this.case_);
      var1.class_(this.catch_);
      var1.class_(this.private_);
      var1.class_(this.implements_);
      var1.class_(this.finally_);
      var1.class_(this.extends_);
      var1.class_(this.native_);
      var1.class_(this.volatile_);
      var1.class_(this.final_);
      var1.class_(this.package_);
      return var1;
   }
}
