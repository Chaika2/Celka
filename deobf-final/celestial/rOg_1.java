package celestial;

import java.util.Random;

public class rOg_1 extends rOt_1 {
   private static final rut_3<Integer> break_ = rmE_2.class_(rOg_1.class, ruw_3.break_);
   private static final rqO_2[] protected_ = new rqO_2[]{new rqO_2("textures/entity/fish/tropical_a.png"), new rqO_2("textures/entity/fish/tropical_b.png")};
   private static final rqO_2[] super_ = new rqO_2[]{
      new rqO_2("textures/entity/fish/tropical_a_pattern_1.png"),
      new rqO_2("textures/entity/fish/tropical_a_pattern_2.png"),
      new rqO_2("textures/entity/fish/tropical_a_pattern_3.png"),
      new rqO_2("textures/entity/fish/tropical_a_pattern_4.png"),
      new rqO_2("textures/entity/fish/tropical_a_pattern_5.png"),
      new rqO_2("textures/entity/fish/tropical_a_pattern_6.png")
   };
   private static final rqO_2[] this_ = new rqO_2[]{
      new rqO_2("textures/entity/fish/tropical_b_pattern_1.png"),
      new rqO_2("textures/entity/fish/tropical_b_pattern_2.png"),
      new rqO_2("textures/entity/fish/tropical_b_pattern_3.png"),
      new rqO_2("textures/entity/fish/tropical_b_pattern_4.png"),
      new rqO_2("textures/entity/fish/tropical_b_pattern_5.png"),
      new rqO_2("textures/entity/fish/tropical_b_pattern_6.png")
   };
   public static final int[] class_ = new int[]{
      class_(rOY.STRIPEY, rxL_2.ORANGE, rxL_2.GRAY),
      class_(rOY.FLOPPER, rxL_2.GRAY, rxL_2.GRAY),
      class_(rOY.FLOPPER, rxL_2.GRAY, rxL_2.BLUE),
      class_(rOY.CLAYFISH, rxL_2.WHITE, rxL_2.GRAY),
      class_(rOY.SUNSTREAK, rxL_2.BLUE, rxL_2.GRAY),
      class_(rOY.KOB, rxL_2.ORANGE, rxL_2.WHITE),
      class_(rOY.SPOTTY, rxL_2.PINK, rxL_2.LIGHT_BLUE),
      class_(rOY.BLOCKFISH, rxL_2.PURPLE, rxL_2.YELLOW),
      class_(rOY.CLAYFISH, rxL_2.WHITE, rxL_2.RED),
      class_(rOY.SPOTTY, rxL_2.WHITE, rxL_2.YELLOW),
      class_(rOY.GLITTER, rxL_2.WHITE, rxL_2.GRAY),
      class_(rOY.CLAYFISH, rxL_2.WHITE, rxL_2.ORANGE),
      class_(rOY.DASHER, rxL_2.CYAN, rxL_2.PINK),
      class_(rOY.BRINELY, rxL_2.LIME, rxL_2.LIGHT_BLUE),
      class_(rOY.BETTY, rxL_2.RED, rxL_2.WHITE),
      class_(rOY.SNOOPER, rxL_2.GRAY, rxL_2.RED),
      class_(rOY.BLOCKFISH, rxL_2.RED, rxL_2.WHITE),
      class_(rOY.FLOPPER, rxL_2.WHITE, rxL_2.YELLOW),
      class_(rOY.KOB, rxL_2.RED, rxL_2.WHITE),
      class_(rOY.SUNSTREAK, rxL_2.GRAY, rxL_2.WHITE),
      class_(rOY.DASHER, rxL_2.CYAN, rxL_2.YELLOW),
      class_(rOY.FLOPPER, rxL_2.YELLOW, rxL_2.YELLOW)
   };
   private boolean else_ = true;

   @Override
   protected rqA_2 byte_(rye_3 var1) {
      return rqn_3.dv;
   }

   public rOg_1(aI_2<? extends rOg_1> var1, rYB var2) {
      super(var1, var2);
   }

   public static rxL_2 this_(int var0) {
      return rxL_2.class_(goto_(var0));
   }

   @Override
   public aU_2 class_(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      var4 = super.class_(var1, var2, var3, var4, var5);
      if (var5 != null && var5.byte_("BucketVariantTag", 3)) {
         this.return_(var5.private_("BucketVariantTag"));
         return var4;
      } else {
         int var6;
         int var7;
         int var8;
         int var9;
         if (var4 instanceof rOR var10) {
            var6 = var10.break_;
            var7 = var10.byte_;
            var8 = var10.protected_;
            var9 = var10.throws_;
         } else if ((double)((Random)this.throws_[40]).nextFloat() < 0.9) {
            int var12 = rqR_2.class_(class_, (Random)this.throws_[40]);
            var6 = var12 & 0xFF;
            var7 = (var12 & 0xFF00) >> 8;
            var8 = (var12 & 0xFF0000) >> 16;
            var9 = (var12 & 0xFF000000) >> 24;
            var4 = new rOR(this, var6, var7, var8, var9);
         } else {
            this.else_ = false;
            var6 = ((Random)this.throws_[40]).nextInt(2);
            var7 = ((Random)this.throws_[40]).nextInt(6);
            var8 = ((Random)this.throws_[40]).nextInt(15);
            var9 = ((Random)this.throws_[40]).nextInt(15);
         }

         this.return_(var6 | var7 << 8 | var8 << 16 | var9 << 24);
         return var4;
      }
   }

   private static int class_(rOY var0, rxL_2 var1, rxL_2 var2) {
      return var0.class_() & 0xFF | (var0.break_() & 0xFF) << 8 | (var1.break_() & 0xFF) << 16 | (var2.break_() & 0xFF) << 24;
   }

   @Override
   public void class_(rcd_3 var1) {
      super.class_(var1);
      var1.break_("Variant", this.sc());
   }

   public float[] sm() {
      return rxL_2.class_(while_(this.sc())).protected_();
   }

   public int sc() {
      return ((rmE_2)this.throws_[49]).class_(break_);
   }

   @Override
   public void break_(rcd_3 var1) {
      super.break_(var1);
      this.return_(var1.private_("Variant"));
   }

   public static String break_(int var0) {
      return "entity.minecraft.tropical_fish.predefined." + var0;
   }

   @Override
   protected rdn_3 L() {
      return new rdn_3(rdy_3.XS);
   }

   public rqO_2 sv() {
      return public_(this.sc()) == 0 ? super_[try_(this.sc())] : this_[try_(this.sc())];
   }

   @Override
   protected void extends_(rdn_3 var1) {
      super.extends_(var1);
      rcd_3 var2 = var1.int_();
      var2.break_("BucketVariantTag", this.sc());
   }

   private static int goto_(int var0) {
      return (var0 & 0xFF0000) >> 16;
   }

   @Override
   public boolean continue_(int var1) {
      return !this.else_;
   }

   public static rxL_2 else_(int var0) {
      return rxL_2.class_(while_(var0));
   }

   public void return_(int var1) {
      ((rmE_2)this.throws_[49]).break_(break_, var1);
   }

   private static int try_(int var0) {
      return Math.min((var0 & 0xFF00) >> 8, 5);
   }

   private static int while_(int var0) {
      return (var0 & 0xFF000000) >> 24;
   }

   @Override
   protected rqA_2 static_() {
      return rqn_3.du;
   }

   public static int public_(int var0) {
      return Math.min(var0 & 0xFF, 1);
   }

   public static String synchronized_(int var0) {
      int var1 = public_(var0);
      int var2 = try_(var0);
      return "entity.minecraft.tropical_fish.type." + rOY.class_(var1, var2);
   }

   @Override
   protected rqA_2 Bt() {
      return rqn_3.dm;
   }

   @Override
   protected rqA_2 sJ() {
      return rqn_3.dZ;
   }

   public float[] su() {
      return rxL_2.class_(goto_(this.sc())).protected_();
   }

   public int sZ() {
      return public_(this.sc());
   }

   public rqO_2 sF() {
      return protected_[public_(this.sc())];
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.throws_[49]).class_(break_, 0);
   }
}
