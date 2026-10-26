package celestial;

import com.google.common.collect.Lists;
import java.util.List;

public class WJ {
   private final rYB class_;
   private final rfH_2 break_;
   private final Jo_1 byte_;
   private xc_3 protected_;
   private final boolean throws_;
   private final List<rfH_2> case_ = Lists.newArrayList();

   private void byte_(WJ var1) {
      this.case_.add(var1.break_);
      rfH_2 var2 = this.break_.private_();
      rfH_2 var3 = this.break_.protected_();
      rfH_2 var4 = this.break_.byte_();
      rfH_2 var5 = this.break_.extends_();
      boolean var6 = this.byte_(var2);
      boolean var7 = this.byte_(var3);
      boolean var8 = this.byte_(var4);
      boolean var9 = this.byte_(var5);
      rCR var10 = null;
      if (var6 || var7) {
         var10 = rCR.NORTH_SOUTH;
      }

      if (var8 || var9) {
         var10 = rCR.EAST_WEST;
      }

      if (!this.throws_) {
         if (var7 && var9 && !var6 && !var8) {
            var10 = rCR.SOUTH_EAST;
         }

         if (var7 && var8 && !var6 && !var9) {
            var10 = rCR.SOUTH_WEST;
         }

         if (var6 && var8 && !var7 && !var9) {
            var10 = rCR.NORTH_WEST;
         }

         if (var6 && var9 && !var7 && !var8) {
            var10 = rCR.NORTH_EAST;
         }
      }

      if (var10 == rCR.NORTH_SOUTH) {
         if (Jo_1.class_(this.class_, var2.final_())) {
            var10 = rCR.ASCENDING_NORTH;
         }

         if (Jo_1.class_(this.class_, var3.final_())) {
            var10 = rCR.ASCENDING_SOUTH;
         }
      }

      if (var10 == rCR.EAST_WEST) {
         if (Jo_1.class_(this.class_, var5.final_())) {
            var10 = rCR.ASCENDING_EAST;
         }

         if (Jo_1.class_(this.class_, var4.final_())) {
            var10 = rCR.ASCENDING_WEST;
         }
      }

      if (var10 == null) {
         var10 = rCR.NORTH_SOUTH;
      }

      this.protected_ = this.protected_.class_(this.byte_.implements_(), var10);
      this.class_.class_(this.break_, this.protected_, 3);
   }

   public xc_3 byte_() {
      return this.protected_;
   }

   private boolean byte_(rfH_2 var1) {
      for (int var2 = 0; var2 < this.case_.size(); var2++) {
         rfH_2 var3 = this.case_.get(var2);
         if (var3.b_() == var1.b_() && var3.d_() == var1.d_()) {
            return true;
         }
      }

      return false;
   }

   public WJ(rYB var1, rfH_2 var2, xc_3 var3) {
      this.class_ = var1;
      this.break_ = var2;
      this.protected_ = var3;
      this.byte_ = (Jo_1)var3.break_();
      rCR var4 = var3.byte_(this.byte_.implements_());
      this.throws_ = this.byte_.break_();
      this.class_(var4);
   }

   public WJ class_(boolean var1, boolean var2, rCR var3) {
      rfH_2 var4 = this.break_.private_();
      rfH_2 var5 = this.break_.protected_();
      rfH_2 var6 = this.break_.byte_();
      rfH_2 var7 = this.break_.extends_();
      boolean var8 = this.protected_(var4);
      boolean var9 = this.protected_(var5);
      boolean var10 = this.protected_(var6);
      boolean var11 = this.protected_(var7);
      rCR var12 = null;
      boolean var13 = var8 || var9;
      boolean var14 = var10 || var11;
      if (var13 && !var14) {
         var12 = rCR.NORTH_SOUTH;
      }

      if (var14 && !var13) {
         var12 = rCR.EAST_WEST;
      }

      boolean var15 = var9 && var11;
      boolean var16 = var9 && var10;
      boolean var17 = var8 && var11;
      boolean var18 = var8 && var10;
      if (!this.throws_) {
         if (var15 && !var8 && !var10) {
            var12 = rCR.SOUTH_EAST;
         }

         if (var16 && !var8 && !var11) {
            var12 = rCR.SOUTH_WEST;
         }

         if (var18 && !var9 && !var11) {
            var12 = rCR.NORTH_WEST;
         }

         if (var17 && !var9 && !var10) {
            var12 = rCR.NORTH_EAST;
         }
      }

      if (var12 == null) {
         if (var13 && var14) {
            var12 = var3;
         } else if (var13) {
            var12 = rCR.NORTH_SOUTH;
         } else if (var14) {
            var12 = rCR.EAST_WEST;
         }

         if (!this.throws_) {
            if (var1) {
               if (var15) {
                  var12 = rCR.SOUTH_EAST;
               }

               if (var16) {
                  var12 = rCR.SOUTH_WEST;
               }

               if (var17) {
                  var12 = rCR.NORTH_EAST;
               }

               if (var18) {
                  var12 = rCR.NORTH_WEST;
               }
            } else {
               if (var18) {
                  var12 = rCR.NORTH_WEST;
               }

               if (var17) {
                  var12 = rCR.NORTH_EAST;
               }

               if (var16) {
                  var12 = rCR.SOUTH_WEST;
               }

               if (var15) {
                  var12 = rCR.SOUTH_EAST;
               }
            }
         }
      }

      if (var12 == rCR.NORTH_SOUTH) {
         if (Jo_1.class_(this.class_, var4.final_())) {
            var12 = rCR.ASCENDING_NORTH;
         }

         if (Jo_1.class_(this.class_, var5.final_())) {
            var12 = rCR.ASCENDING_SOUTH;
         }
      }

      if (var12 == rCR.EAST_WEST) {
         if (Jo_1.class_(this.class_, var7.final_())) {
            var12 = rCR.ASCENDING_EAST;
         }

         if (Jo_1.class_(this.class_, var6.final_())) {
            var12 = rCR.ASCENDING_WEST;
         }
      }

      if (var12 == null) {
         var12 = var3;
      }

      this.class_(var12);
      this.protected_ = this.protected_.class_(this.byte_.implements_(), var12);
      if (var2 || this.class_.byte_(this.break_) != this.protected_) {
         this.class_.class_(this.break_, this.protected_, 3);

         for (int var19 = 0; var19 < this.case_.size(); var19++) {
            WJ var20 = this.break_(this.case_.get(var19));
            if (var20 != null) {
               var20.protected_();
               if (var20.break_(this)) {
                  var20.byte_(this);
               }
            }
         }
      }

      return this;
   }

   private void class_(rCR var1) {
      this.case_.clear();
      switch (var1) {
         case NORTH_SOUTH:
            this.case_.add(this.break_.private_());
            this.case_.add(this.break_.protected_());
            break;
         case EAST_WEST:
            this.case_.add(this.break_.byte_());
            this.case_.add(this.break_.extends_());
            break;
         case ASCENDING_EAST:
            this.case_.add(this.break_.byte_());
            this.case_.add(this.break_.extends_().final_());
            break;
         case ASCENDING_WEST:
            this.case_.add(this.break_.byte_().final_());
            this.case_.add(this.break_.extends_());
            break;
         case ASCENDING_NORTH:
            this.case_.add(this.break_.private_().final_());
            this.case_.add(this.break_.protected_());
            break;
         case ASCENDING_SOUTH:
            this.case_.add(this.break_.private_());
            this.case_.add(this.break_.protected_().final_());
            break;
         case SOUTH_EAST:
            this.case_.add(this.break_.extends_());
            this.case_.add(this.break_.protected_());
            break;
         case SOUTH_WEST:
            this.case_.add(this.break_.byte_());
            this.case_.add(this.break_.protected_());
            break;
         case NORTH_WEST:
            this.case_.add(this.break_.byte_());
            this.case_.add(this.break_.private_());
            break;
         case NORTH_EAST:
            this.case_.add(this.break_.extends_());
            this.case_.add(this.break_.private_());
      }
   }

   public List<rfH_2> class_() {
      return this.case_;
   }

   private boolean class_(rfH_2 var1) {
      return Jo_1.class_(this.class_, var1) || Jo_1.class_(this.class_, var1.final_()) || Jo_1.class_(this.class_, var1.break_());
   }

   private boolean class_(WJ var1) {
      return this.byte_(var1.break_);
   }

   protected int break_() {
      int var1 = 0;

      for (rpr_3 var3 : rpb_3.HORIZONTAL) {
         if (this.class_(this.break_.break_(var3))) {
            var1++;
         }
      }

      return var1;
   }

   private boolean break_(WJ var1) {
      return this.class_(var1) || this.case_.size() != 2;
   }

   private WJ break_(rfH_2 var1) {
      xc_3 var2 = this.class_.byte_(var1);
      if (Jo_1.catch_(var2)) {
         return new WJ(this.class_, var1, var2);
      } else {
         rfH_2 var3 = var1.final_();
         var2 = this.class_.byte_(var3);
         if (Jo_1.catch_(var2)) {
            return new WJ(this.class_, var3, var2);
         } else {
            var3 = var1.break_();
            var2 = this.class_.byte_(var3);
            return Jo_1.catch_(var2) ? new WJ(this.class_, var3, var2) : null;
         }
      }
   }

   private boolean protected_(rfH_2 var1) {
      WJ var2 = this.break_(var1);
      if (var2 == null) {
         return false;
      } else {
         var2.protected_();
         return var2.break_(this);
      }
   }

   private void protected_() {
      for (int var1 = 0; var1 < this.case_.size(); var1++) {
         WJ var2 = this.break_(this.case_.get(var1));
         if (var2 != null && var2.class_(this)) {
            this.case_.set(var1, var2.break_);
         } else {
            this.case_.remove(var1--);
         }
      }
   }
}
