package celestial;

import com.google.common.collect.Lists;
import java.util.List;

public class WJ {
   private final rYB id_class;
   private final rfH_2 id_break;
   private final Jo_1 id_byte;
   private xc_3 id_protected;
   private final boolean id_throws;
   private final List<rfH_2> id_case = Lists.newArrayList();

   private void id_byte(WJ var1) {
      this.id_case.add(var1.id_break);
      rfH_2 var2 = this.id_break.id_private();
      rfH_2 var3 = this.id_break.id_protected();
      rfH_2 var4 = this.id_break.id_byte();
      rfH_2 var5 = this.id_break.id_extends();
      boolean var6 = this.id_byte(var2);
      boolean var7 = this.id_byte(var3);
      boolean var8 = this.id_byte(var4);
      boolean var9 = this.id_byte(var5);
      rCR var10 = null;
      if (var6 || var7) {
         var10 = rCR.NORTH_SOUTH;
      }

      if (var8 || var9) {
         var10 = rCR.EAST_WEST;
      }

      if (!this.id_throws) {
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
         if (Jo_1.id_class(this.id_class, var2.id_final())) {
            var10 = rCR.ASCENDING_NORTH;
         }

         if (Jo_1.id_class(this.id_class, var3.id_final())) {
            var10 = rCR.ASCENDING_SOUTH;
         }
      }

      if (var10 == rCR.EAST_WEST) {
         if (Jo_1.id_class(this.id_class, var5.id_final())) {
            var10 = rCR.ASCENDING_EAST;
         }

         if (Jo_1.id_class(this.id_class, var4.id_final())) {
            var10 = rCR.ASCENDING_WEST;
         }
      }

      if (var10 == null) {
         var10 = rCR.NORTH_SOUTH;
      }

      this.id_protected = this.id_protected.id_class(this.id_byte.id_implements(), var10);
      this.id_class.id_class(this.id_break, this.id_protected, 3);
   }

   public xc_3 id_byte() {
      return this.id_protected;
   }

   private boolean id_byte(rfH_2 var1) {
      for (int var2 = 0; var2 < this.id_case.size(); var2++) {
         rfH_2 var3 = this.id_case.get(var2);
         if (var3.b_() == var1.b_() && var3.d_() == var1.d_()) {
            return true;
         }
      }

      return false;
   }

   public WJ(rYB var1, rfH_2 var2, xc_3 var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_protected = var3;
      this.id_byte = (Jo_1)var3.id_break();
      rCR var4 = var3.id_byte(this.id_byte.id_implements());
      this.id_throws = this.id_byte.id_break();
      this.id_class(var4);
   }

   public WJ id_class(boolean var1, boolean var2, rCR var3) {
      rfH_2 var4 = this.id_break.id_private();
      rfH_2 var5 = this.id_break.id_protected();
      rfH_2 var6 = this.id_break.id_byte();
      rfH_2 var7 = this.id_break.id_extends();
      boolean var8 = this.id_protected(var4);
      boolean var9 = this.id_protected(var5);
      boolean var10 = this.id_protected(var6);
      boolean var11 = this.id_protected(var7);
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
      if (!this.id_throws) {
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

         if (!this.id_throws) {
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
         if (Jo_1.id_class(this.id_class, var4.id_final())) {
            var12 = rCR.ASCENDING_NORTH;
         }

         if (Jo_1.id_class(this.id_class, var5.id_final())) {
            var12 = rCR.ASCENDING_SOUTH;
         }
      }

      if (var12 == rCR.EAST_WEST) {
         if (Jo_1.id_class(this.id_class, var7.id_final())) {
            var12 = rCR.ASCENDING_EAST;
         }

         if (Jo_1.id_class(this.id_class, var6.id_final())) {
            var12 = rCR.ASCENDING_WEST;
         }
      }

      if (var12 == null) {
         var12 = var3;
      }

      this.id_class(var12);
      this.id_protected = this.id_protected.id_class(this.id_byte.id_implements(), var12);
      if (var2 || this.id_class.id_byte(this.id_break) != this.id_protected) {
         this.id_class.id_class(this.id_break, this.id_protected, 3);

         for (int var19 = 0; var19 < this.id_case.size(); var19++) {
            WJ var20 = this.id_break(this.id_case.get(var19));
            if (var20 != null) {
               var20.id_protected();
               if (var20.id_break(this)) {
                  var20.id_byte(this);
               }
            }
         }
      }

      return this;
   }

   private void id_class(rCR var1) {
      this.id_case.clear();
      switch (var1) {
         case NORTH_SOUTH:
            this.id_case.add(this.id_break.id_private());
            this.id_case.add(this.id_break.id_protected());
            break;
         case EAST_WEST:
            this.id_case.add(this.id_break.id_byte());
            this.id_case.add(this.id_break.id_extends());
            break;
         case ASCENDING_EAST:
            this.id_case.add(this.id_break.id_byte());
            this.id_case.add(this.id_break.id_extends().id_final());
            break;
         case ASCENDING_WEST:
            this.id_case.add(this.id_break.id_byte().id_final());
            this.id_case.add(this.id_break.id_extends());
            break;
         case ASCENDING_NORTH:
            this.id_case.add(this.id_break.id_private().id_final());
            this.id_case.add(this.id_break.id_protected());
            break;
         case ASCENDING_SOUTH:
            this.id_case.add(this.id_break.id_private());
            this.id_case.add(this.id_break.id_protected().id_final());
            break;
         case SOUTH_EAST:
            this.id_case.add(this.id_break.id_extends());
            this.id_case.add(this.id_break.id_protected());
            break;
         case SOUTH_WEST:
            this.id_case.add(this.id_break.id_byte());
            this.id_case.add(this.id_break.id_protected());
            break;
         case NORTH_WEST:
            this.id_case.add(this.id_break.id_byte());
            this.id_case.add(this.id_break.id_private());
            break;
         case NORTH_EAST:
            this.id_case.add(this.id_break.id_extends());
            this.id_case.add(this.id_break.id_private());
      }
   }

   public List<rfH_2> id_class() {
      return this.id_case;
   }

   private boolean id_class(rfH_2 var1) {
      return Jo_1.id_class(this.id_class, var1) || Jo_1.id_class(this.id_class, var1.id_final()) || Jo_1.id_class(this.id_class, var1.id_break());
   }

   private boolean id_class(WJ var1) {
      return this.id_byte(var1.id_break);
   }

   protected int id_break() {
      int var1 = 0;

      for (rpr_3 var3 : rpb_3.HORIZONTAL) {
         if (this.id_class(this.id_break.id_break(var3))) {
            var1++;
         }
      }

      return var1;
   }

   private boolean id_break(WJ var1) {
      return this.id_class(var1) || this.id_case.size() != 2;
   }

   private WJ id_break(rfH_2 var1) {
      xc_3 var2 = this.id_class.id_byte(var1);
      if (Jo_1.id_catch(var2)) {
         return new WJ(this.id_class, var1, var2);
      } else {
         rfH_2 var3 = var1.id_final();
         var2 = this.id_class.id_byte(var3);
         if (Jo_1.id_catch(var2)) {
            return new WJ(this.id_class, var3, var2);
         } else {
            var3 = var1.id_break();
            var2 = this.id_class.id_byte(var3);
            return Jo_1.id_catch(var2) ? new WJ(this.id_class, var3, var2) : null;
         }
      }
   }

   private boolean id_protected(rfH_2 var1) {
      WJ var2 = this.id_break(var1);
      if (var2 == null) {
         return false;
      } else {
         var2.id_protected();
         return var2.id_break(this);
      }
   }

   private void id_protected() {
      for (int var1 = 0; var1 < this.id_case.size(); var1++) {
         WJ var2 = this.id_break(this.id_case.get(var1));
         if (var2 != null && var2.id_class(this)) {
            this.id_case.set(var1, var2.id_break);
         } else {
            this.id_case.remove(var1--);
         }
      }
   }
}
