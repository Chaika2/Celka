package celestial;

import java.util.Random;

public class rOg_1 extends rOt_1 {
   private static final rut_3<Integer> id_break = rmE_2.id_class(rOg_1.class, ruw_3.id_break);
   private static final rqO_2[] id_protected = new rqO_2[]{new rqO_2("textures/entity/fish/tropical_a.png"), new rqO_2("textures/entity/fish/tropical_b.png")};
   private static final rqO_2[] id_super = new rqO_2[]{
      new rqO_2("textures/entity/fish/tropical_a_pattern_1.png"),
      new rqO_2("textures/entity/fish/tropical_a_pattern_2.png"),
      new rqO_2("textures/entity/fish/tropical_a_pattern_3.png"),
      new rqO_2("textures/entity/fish/tropical_a_pattern_4.png"),
      new rqO_2("textures/entity/fish/tropical_a_pattern_5.png"),
      new rqO_2("textures/entity/fish/tropical_a_pattern_6.png")
   };
   private static final rqO_2[] id_this = new rqO_2[]{
      new rqO_2("textures/entity/fish/tropical_b_pattern_1.png"),
      new rqO_2("textures/entity/fish/tropical_b_pattern_2.png"),
      new rqO_2("textures/entity/fish/tropical_b_pattern_3.png"),
      new rqO_2("textures/entity/fish/tropical_b_pattern_4.png"),
      new rqO_2("textures/entity/fish/tropical_b_pattern_5.png"),
      new rqO_2("textures/entity/fish/tropical_b_pattern_6.png")
   };
   public static final int[] id_class = new int[]{
      id_class(rOY.STRIPEY, rxL_2.ORANGE, rxL_2.GRAY),
      id_class(rOY.FLOPPER, rxL_2.GRAY, rxL_2.GRAY),
      id_class(rOY.FLOPPER, rxL_2.GRAY, rxL_2.BLUE),
      id_class(rOY.CLAYFISH, rxL_2.WHITE, rxL_2.GRAY),
      id_class(rOY.SUNSTREAK, rxL_2.BLUE, rxL_2.GRAY),
      id_class(rOY.KOB, rxL_2.ORANGE, rxL_2.WHITE),
      id_class(rOY.SPOTTY, rxL_2.PINK, rxL_2.LIGHT_BLUE),
      id_class(rOY.BLOCKFISH, rxL_2.PURPLE, rxL_2.YELLOW),
      id_class(rOY.CLAYFISH, rxL_2.WHITE, rxL_2.RED),
      id_class(rOY.SPOTTY, rxL_2.WHITE, rxL_2.YELLOW),
      id_class(rOY.GLITTER, rxL_2.WHITE, rxL_2.GRAY),
      id_class(rOY.CLAYFISH, rxL_2.WHITE, rxL_2.ORANGE),
      id_class(rOY.DASHER, rxL_2.CYAN, rxL_2.PINK),
      id_class(rOY.BRINELY, rxL_2.LIME, rxL_2.LIGHT_BLUE),
      id_class(rOY.BETTY, rxL_2.RED, rxL_2.WHITE),
      id_class(rOY.SNOOPER, rxL_2.GRAY, rxL_2.RED),
      id_class(rOY.BLOCKFISH, rxL_2.RED, rxL_2.WHITE),
      id_class(rOY.FLOPPER, rxL_2.WHITE, rxL_2.YELLOW),
      id_class(rOY.KOB, rxL_2.RED, rxL_2.WHITE),
      id_class(rOY.SUNSTREAK, rxL_2.GRAY, rxL_2.WHITE),
      id_class(rOY.DASHER, rxL_2.CYAN, rxL_2.YELLOW),
      id_class(rOY.FLOPPER, rxL_2.YELLOW, rxL_2.YELLOW)
   };
   private boolean id_else = true;

   @Override
   protected rqA_2 id_byte(rye_3 var1) {
      return rqn_3.dv;
   }

   public rOg_1(aI_2<? extends rOg_1> var1, rYB var2) {
      super(var1, var2);
   }

   public static rxL_2 id_this(int var0) {
      return rxL_2.id_class(id_goto(var0));
   }

   @Override
   public aU_2 id_class(rRf_1 var1, rRh_1 var2, iO_2 var3, aU_2 var4, rcd_3 var5) {
      var4 = super.id_class(var1, var2, var3, var4, var5);
      if (var5 != null && var5.id_byte("BucketVariantTag", 3)) {
         this.id_return(var5.id_private("BucketVariantTag"));
         return var4;
      } else {
         int var6;
         int var7;
         int var8;
         int var9;
         if (var4 instanceof rOR var10) {
            var6 = var10.id_break;
            var7 = var10.id_byte;
            var8 = var10.id_protected;
            var9 = var10.id_throws;
         } else if ((double)((Random)this.id_throws[40]).nextFloat() < 0.9) {
            int var12 = rqR_2.id_class(id_class, (Random)this.id_throws[40]);
            var6 = var12 & 0xFF;
            var7 = (var12 & 0xFF00) >> 8;
            var8 = (var12 & 0xFF0000) >> 16;
            var9 = (var12 & 0xFF000000) >> 24;
            var4 = new rOR(this, var6, var7, var8, var9);
         } else {
            this.id_else = false;
            var6 = ((Random)this.id_throws[40]).nextInt(2);
            var7 = ((Random)this.id_throws[40]).nextInt(6);
            var8 = ((Random)this.id_throws[40]).nextInt(15);
            var9 = ((Random)this.id_throws[40]).nextInt(15);
         }

         this.id_return(var6 | var7 << 8 | var8 << 16 | var9 << 24);
         return var4;
      }
   }

   private static int id_class(rOY var0, rxL_2 var1, rxL_2 var2) {
      return var0.id_class() & 0xFF | (var0.id_break() & 0xFF) << 8 | (var1.id_break() & 0xFF) << 16 | (var2.id_break() & 0xFF) << 24;
   }

   @Override
   public void id_class(rcd_3 var1) {
      super.id_class(var1);
      var1.id_break("Variant", this.sc());
   }

   public float[] sm() {
      return rxL_2.id_class(id_while(this.sc())).id_protected();
   }

   public int sc() {
      return ((rmE_2)this.id_throws[49]).id_class(id_break);
   }

   @Override
   public void id_break(rcd_3 var1) {
      super.id_break(var1);
      this.id_return(var1.id_private("Variant"));
   }

   public static String id_break(int var0) {
      return "entity.minecraft.tropical_fish.predefined." + var0;
   }

   @Override
   protected rdn_3 L() {
      return new rdn_3(rdy_3.XS);
   }

   public rqO_2 sv() {
      return id_public(this.sc()) == 0 ? id_super[id_try(this.sc())] : id_this[id_try(this.sc())];
   }

   @Override
   protected void id_extends(rdn_3 var1) {
      super.id_extends(var1);
      rcd_3 var2 = var1.id_int();
      var2.id_break("BucketVariantTag", this.sc());
   }

   private static int id_goto(int var0) {
      return (var0 & 0xFF0000) >> 16;
   }

   @Override
   public boolean id_continue(int var1) {
      return !this.id_else;
   }

   public static rxL_2 id_else(int var0) {
      return rxL_2.id_class(id_while(var0));
   }

   public void id_return(int var1) {
      ((rmE_2)this.id_throws[49]).id_break(id_break, var1);
   }

   private static int id_try(int var0) {
      return Math.min((var0 & 0xFF00) >> 8, 5);
   }

   private static int id_while(int var0) {
      return (var0 & 0xFF000000) >> 24;
   }

   @Override
   protected rqA_2 id_static() {
      return rqn_3.du;
   }

   public static int id_public(int var0) {
      return Math.min(var0 & 0xFF, 1);
   }

   public static String id_synchronized(int var0) {
      int var1 = id_public(var0);
      int var2 = id_try(var0);
      return "entity.minecraft.tropical_fish.type." + rOY.id_class(var1, var2);
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
      return rxL_2.id_class(id_goto(this.sc())).id_protected();
   }

   public int sZ() {
      return id_public(this.sc());
   }

   public rqO_2 sF() {
      return id_protected[id_public(this.sc())];
   }

   @Override
   protected void m_() {
      super.m_();
      ((rmE_2)this.id_throws[49]).id_class(id_break, 0);
   }
}
