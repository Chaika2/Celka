package celestial;

import org.apache.commons.lang3.mutable.MutableInt;

public final class rrso_3 extends rrsV_2<rrsU_2, rrsK_2> {
   private static final rpr_3[] id_throws = rpr_3.values();
   private static final rpr_3[] id_case = new rpr_3[]{rpr_3.NORTH, rpr_3.SOUTH, rpr_3.WEST, rpr_3.EAST};

   public rrso_3(rol_3 var1) {
      super(var1, rRo_1.SKY, new rrsK_2(var1));
   }

   @Override
   protected int id_class(long var1, long var3, int var5) {
      int var6 = var5;
      if (Long.MAX_VALUE != var3) {
         int var7 = this.id_break(Long.MAX_VALUE, var1, 0);
         if (var5 > var7) {
            var6 = var7;
         }

         if (var6 == 0) {
            return var6;
         }
      }

      long var21 = rjh_3.id_throws(var1);
      roH_2 var9 = this.id_byte.id_class(var21, true);

      for (rpr_3 var13 : id_throws) {
         long var14 = rfH_2.id_class(var1, var13);
         long var16 = rjh_3.id_throws(var14);
         roH_2 var18;
         if (var21 == var16) {
            var18 = var9;
         } else {
            var18 = this.id_byte.id_class(var16, true);
         }

         if (var18 != null) {
            if (var14 != var3) {
               int var23 = this.id_break(var14, var1, this.id_class(var18, var14));
               if (var6 > var23) {
                  var6 = var23;
               }

               if (var6 == 0) {
                  return var6;
               }
            }
         } else if (var13 != rpr_3.DOWN) {
            for (var14 = rfH_2.id_throws(var14); !this.id_byte.id_catch(var16) && !this.id_byte.id_final(var16); var14 = rfH_2.id_class(var14, 0, 16, 0)) {
               var16 = rjh_3.id_class(var16, rpr_3.UP);
            }

            roH_2 var19 = this.id_byte.id_class(var16, true);
            if (var14 != var3) {
               int var20;
               if (var19 != null) {
                  var20 = this.id_break(var14, var1, this.id_class(var19, var14));
               } else {
                  var20 = this.id_byte.id_package(var16) ? 0 : 15;
               }

               if (var6 > var20) {
                  var6 = var20;
               }

               if (var6 == 0) {
                  return var6;
               }
            }
         }
      }

      return var6;
   }

   @Override
   protected void id_class(long var1, int var3, boolean var4) {
      long var5 = rjh_3.id_throws(var1);
      int var7 = rfH_2.id_break(var1);
      int var8 = rjh_3.id_break(var7);
      int var9 = rjh_3.id_class(var7);
      int var10;
      if (var8 != 0) {
         var10 = 0;
      } else {
         int var11 = 0;

         while (!this.id_byte.id_catch(rjh_3.id_class(var5, 0, -var11 - 1, 0)) && this.id_byte.id_break(var9 - var11 - 1)) {
            var11++;
         }

         var10 = var11;
      }

      long var28 = rfH_2.id_class(var1, 0, -1 - var10 * 16, 0);
      long var13 = rjh_3.id_throws(var28);
      if (var5 == var13 || this.id_byte.id_catch(var13)) {
         this.id_break(var1, var28, var3, var4);
      }

      long var15 = rfH_2.id_class(var1, rpr_3.UP);
      long var17 = rjh_3.id_throws(var15);
      if (var5 == var17 || this.id_byte.id_catch(var17)) {
         this.id_break(var1, var15, var3, var4);
      }

      for (rpr_3 var22 : id_case) {
         int var23 = 0;

         do {
            long var24 = rfH_2.id_class(var1, var22.id_implements(), -var23, var22.id_extends());
            long var26 = rjh_3.id_throws(var24);
            if (var5 == var26) {
               this.id_break(var1, var24, var3, var4);
               break;
            }

            if (this.id_byte.id_catch(var26)) {
               this.id_break(var1, var24, var3, var4);
            }
         } while (++var23 > var10 * 16);
      }
   }

   @Override
   public String id_break(long var1) {
      return super.id_break(var1) + (this.id_byte.id_final(var1) ? "*" : "");
   }

   @Override
   protected int id_break(long var1, long var3, int var5) {
      if (var3 == Long.MAX_VALUE) {
         return 15;
      } else {
         if (var1 == Long.MAX_VALUE) {
            if (!this.id_byte.id_volatile(var3)) {
               return 15;
            }

            var5 = 0;
         }

         if (var5 >= 15) {
            return var5;
         } else {
            MutableInt var6 = new MutableInt();
            xc_3 var7 = this.id_class(var3, var6);
            if (var6.getValue() >= 15) {
               return 15;
            } else {
               int var8 = rfH_2.id_class(var1);
               int var9 = rfH_2.id_break(var1);
               int var10 = rfH_2.id_byte(var1);
               int var11 = rfH_2.id_class(var3);
               int var12 = rfH_2.id_break(var3);
               int var13 = rfH_2.id_byte(var3);
               boolean var14 = var8 == var11 && var10 == var13;
               int var15 = Integer.signum(var11 - var8);
               int var16 = Integer.signum(var12 - var9);
               int var17 = Integer.signum(var13 - var10);
               rpr_3 var18;
               if (var1 == Long.MAX_VALUE) {
                  var18 = rpr_3.DOWN;
               } else {
                  var18 = rpr_3.id_class(var15, var16, var17);
               }

               xc_3 var19 = this.id_class(var1, (MutableInt)null);
               if (var18 != null) {
                  rjC_2 var20 = this.id_class(var19, var1, var18);
                  rjC_2 var21 = this.id_class(var7, var3, var18.id_case());
                  if (rjw_3.id_break(var20, var21)) {
                     return 15;
                  }
               } else {
                  rjC_2 var24 = this.id_class(var19, var1, rpr_3.DOWN);
                  if (rjw_3.id_break(var24, rjw_3.id_class())) {
                     return 15;
                  }

                  int var26 = var14 ? -1 : 0;
                  rpr_3 var22 = rpr_3.id_class(var15, var26, var17);
                  if (var22 == null) {
                     return 15;
                  }

                  rjC_2 var23 = this.id_class(var7, var3, var22.id_case());
                  if (rjw_3.id_break(rjw_3.id_class(), var23)) {
                     return 15;
                  }
               }

               boolean var25 = var1 == Long.MAX_VALUE || var14 && var9 > var12;
               return var25 && var5 == 0 && var6.getValue() == 0 ? 0 : var5 + Math.max(1, var6.getValue());
            }
         }
      }
   }

   @Override
   protected void id_case(long var1) {
      this.id_byte.id_throws();
      long var3 = rjh_3.id_throws(var1);
      if (this.id_byte.id_catch(var3)) {
         super.id_case(var1);
      } else {
         for (var1 = rfH_2.id_throws(var1); !this.id_byte.id_catch(var3) && !this.id_byte.id_final(var3); var1 = rfH_2.id_class(var1, 0, 16, 0)) {
            var3 = rjh_3.id_class(var3, rpr_3.UP);
         }

         if (this.id_byte.id_catch(var3)) {
            super.id_case(var1);
         }
      }
   }
}
