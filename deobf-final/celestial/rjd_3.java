package celestial;

import java.util.BitSet;

public final class rjd_3 extends rjp_3 {
   private final BitSet protected_;
   private int throws_;
   private int case_;
   private int catch_;
   private int private_;
   private int implements_;
   private int finally_;

   public rjd_3(rjp_3 var1) {
      super(var1.class_, var1.break_, var1.byte_);
      if (var1 instanceof rjd_3) {
         this.protected_ = (BitSet)((rjd_3)var1).protected_.clone();
      } else {
         this.protected_ = new BitSet(this.class_ * this.break_ * this.byte_);

         for (int var2 = 0; var2 < this.class_; var2++) {
            for (int var3 = 0; var3 < this.break_; var3++) {
               for (int var4 = 0; var4 < this.byte_; var4++) {
                  if (var1.break_(var2, var3, var4)) {
                     this.protected_.set(this.class_(var2, var3, var4));
                  }
               }
            }
         }
      }

      this.throws_ = var1.class_(rpB_2.X);
      this.case_ = var1.class_(rpB_2.Y);
      this.catch_ = var1.class_(rpB_2.Z);
      this.private_ = var1.break_(rpB_2.X);
      this.implements_ = var1.break_(rpB_2.Y);
      this.finally_ = var1.break_(rpB_2.Z);
   }

   public rjd_3(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      super(var1, var2, var3);
      this.protected_ = new BitSet(var1 * var2 * var3);
      this.throws_ = var4;
      this.case_ = var5;
      this.catch_ = var6;
      this.private_ = var7;
      this.implements_ = var8;
      this.finally_ = var9;
   }

   public rjd_3(int var1, int var2, int var3) {
      this(var1, var2, var3, var1, var2, var3, 0, 0, 0);
   }

   static rjd_3 class_(rjp_3 var0, rjp_3 var1, rjc_3 var2, rjc_3 var3, rjc_3 var4, rjN_2 var5) {
      rjd_3 var6 = new rjd_3(var2.class_().size() - 1, var3.class_().size() - 1, var4.class_().size() - 1);
      int[] var7 = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
      var2.class_((var7x, var8, var9) -> {
         boolean[] var10 = new boolean[]{false};
         boolean var11 = var3.class_((var10x, var11x, var12) -> {
            boolean[] var13 = new boolean[]{false};
            boolean var14 = var4.class_((var12x, var13x, var14x) -> {
               boolean var15 = var5.apply(var0.byte_(var7x, var10x, var12x), var1.byte_(var8, var11x, var13x));
               if (var15) {
                  var6.protected_.set(var6.class_(var9, var12, var14x));
                  var7[2] = Math.min(var7[2], var14x);
                  var7[5] = Math.max(var7[5], var14x);
                  var13[0] = true;
               }

               return true;
            });
            if (var13[0]) {
               var7[1] = Math.min(var7[1], var12);
               var7[4] = Math.max(var7[4], var12);
               var10[0] = true;
            }

            return var14;
         });
         if (var10[0]) {
            var7[0] = Math.min(var7[0], var9);
            var7[3] = Math.max(var7[3], var9);
         }

         return var11;
      });
      var6.throws_ = var7[0];
      var6.case_ = var7[1];
      var6.catch_ = var7[2];
      var6.private_ = var7[3] + 1;
      var6.implements_ = var7[4] + 1;
      var6.finally_ = var7[5] + 1;
      return var6;
   }

   @Override
   protected void class_(int var1, int var2, int var3, int var4, boolean var5) {
      this.protected_.set(this.class_(var3, var4, var1), this.class_(var3, var4, var2), var5);
   }

   @Override
   protected boolean class_(int var1, int var2, int var3, int var4) {
      if (var3 < 0 || var4 < 0 || var1 < 0) {
         return false;
      } else {
         return var3 < this.class_ && var4 < this.break_ && var2 <= this.byte_
            ? this.protected_.nextClearBit(this.class_(var3, var4, var1)) >= this.class_(var3, var4, var2)
            : false;
      }
   }

   protected int class_(int var1, int var2, int var3) {
      return (var1 * this.break_ + var2) * this.byte_ + var3;
   }

   @Override
   public boolean class_() {
      return this.protected_.isEmpty();
   }

   @Override
   public int class_(rpB_2 var1) {
      return var1.class_(this.throws_, this.case_, this.catch_);
   }

   @Override
   public void class_(int var1, int var2, int var3, boolean var4, boolean var5) {
      this.protected_.set(this.class_(var1, var2, var3), var5);
      if (var4 && var5) {
         this.throws_ = Math.min(this.throws_, var1);
         this.case_ = Math.min(this.case_, var2);
         this.catch_ = Math.min(this.catch_, var3);
         this.private_ = Math.max(this.private_, var1 + 1);
         this.implements_ = Math.max(this.implements_, var2 + 1);
         this.finally_ = Math.max(this.finally_, var3 + 1);
      }
   }

   @Override
   public int break_(rpB_2 var1) {
      return var1.class_(this.private_, this.implements_, this.finally_);
   }

   @Override
   public boolean break_(int var1, int var2, int var3) {
      return this.protected_.get(this.class_(var1, var2, var3));
   }
}
