package celestial;

import java.util.List;
import java.util.Random;

public class rJE extends rJr_1 {
   private final rXu_1 id_protected = new rJG(this, 2);
   private final rpq_3 id_catch;
   private final Random id_private = new Random();
   private final rpj_3 id_implements = rpj_3.id_class();
   public final int[] id_class = new int[3];
   public final int[] id_break = new int[]{-1, -1, -1};
   public final int[] id_byte = new int[]{-1, -1, -1};

   public rJE(int var1, rhz_3 var2) {
      this(var1, var2, rpq_3.id_class);
   }

   public rJE(int var1, rhz_3 var2, rpq_3 var3) {
      super(rJP.id_volatile, var1);
      this.id_catch = var3;
      this.id_break(new rJb_1(this, this.id_protected, 0, 15, 47));
      this.id_break(new rJM(this, this.id_protected, 1, 35, 47));

      for (int var4 = 0; var4 < 3; var4++) {
         for (int var5 = 0; var5 < 9; var5++) {
            this.id_break(new rJY(var2, var5 + var4 * 9 + 9, 8 + var5 * 18, 84 + var4 * 18));
         }
      }

      for (int var6 = 0; var6 < 9; var6++) {
         this.id_break(new rJY(var2, var6, 8 + var6 * 18, 142));
      }

      this.id_class(rpj_3.id_class(this.id_class, 0));
      this.id_class(rpj_3.id_class(this.id_class, 1));
      this.id_class(rpj_3.id_class(this.id_class, 2));
      this.id_class(this.id_implements).id_class(var2.id_throws.sH());
      this.id_class(rpj_3.id_class(this.id_break, 0));
      this.id_class(rpj_3.id_class(this.id_break, 1));
      this.id_class(rpj_3.id_class(this.id_break, 2));
      this.id_class(rpj_3.id_class(this.id_byte, 0));
      this.id_class(rpj_3.id_class(this.id_byte, 1));
      this.id_class(rpj_3.id_class(this.id_byte, 2));
   }

   @Override
   public boolean id_class(rhd_3 var1) {
      return id_class(this.id_catch, var1, xu_3.SE);
   }

   @Override
   public rdn_3 id_class(rhd_3 var1, int var2) {
      rdn_3 var3 = rdn_3.id_break;
      rJY var4 = this.id_throws.get(var2);
      if (var4 != null && var4.id_break()) {
         rdn_3 var5 = var4.id_class();
         var3 = var5.id_implements();
         if (var2 == 0) {
            if (!this.id_class(var5, 2, 38, true)) {
               return rdn_3.id_break;
            }
         } else if (var2 == 1) {
            if (!this.id_class(var5, 2, 38, true)) {
               return rdn_3.id_break;
            }
         } else if (var5.id_break() == rdy_3.XF) {
            if (!this.id_class(var5, 1, 2, true)) {
               return rdn_3.id_break;
            }
         } else {
            if (this.id_throws.get(0).id_break() || !this.id_throws.get(0).id_class(var5)) {
               return rdn_3.id_break;
            }

            rdn_3 var6 = var5.id_implements();
            var6.id_throws(1);
            var5.id_catch(1);
            this.id_throws.get(0).id_break(var6);
         }

         if (var5.id_class()) {
            var4.id_break(rdn_3.id_break);
         } else {
            var4.id_byte();
         }

         if (var5.id_char() == var3.id_char()) {
            return rdn_3.id_break;
         }

         var4.id_class(var1, var5);
      }

      return var3;
   }

   @Override
   public void id_class(rXu_1 var1) {
      if (var1 == this.id_protected) {
         rdn_3 var2 = var1.id_extends(0);
         if (!var2.id_class() && var2.id_return()) {
            this.id_catch.id_class((var2x, var3x) -> {
               int var4 = 0;

               for (int var5 = -1; var5 <= 1; var5++) {
                  for (int var6 = -1; var6 <= 1; var6++) {
                     if ((var5 != 0 || var6 != 0) && var2x.id_finally(var3x.id_break(var6, 0, var5)) && var2x.id_finally(var3x.id_break(var6, 1, var5))) {
                        if (var2x.id_byte(var3x.id_break(var6 * 2, 0, var5 * 2)).id_class(xu_3.rj)) {
                           var4++;
                        }

                        if (var2x.id_byte(var3x.id_break(var6 * 2, 1, var5 * 2)).id_class(xu_3.rj)) {
                           var4++;
                        }

                        if (var6 != 0 && var5 != 0) {
                           if (var2x.id_byte(var3x.id_break(var6 * 2, 0, var5)).id_class(xu_3.rj)) {
                              var4++;
                           }

                           if (var2x.id_byte(var3x.id_break(var6 * 2, 1, var5)).id_class(xu_3.rj)) {
                              var4++;
                           }

                           if (var2x.id_byte(var3x.id_break(var6, 0, var5 * 2)).id_class(xu_3.rj)) {
                              var4++;
                           }

                           if (var2x.id_byte(var3x.id_break(var6, 1, var5 * 2)).id_class(xu_3.rj)) {
                              var4++;
                           }
                        }
                     }
                  }
               }

               this.id_private.setSeed((long)this.id_implements.id_break());

               for (int var8 = 0; var8 < 3; var8++) {
                  this.id_class[var8] = eA_2.id_class(this.id_private, var8, var4, var2);
                  this.id_break[var8] = -1;
                  this.id_byte[var8] = -1;
                  if (this.id_class[var8] < var8 + 1) {
                     this.id_class[var8] = 0;
                  }
               }

               for (int var9 = 0; var9 < 3; var9++) {
                  if (this.id_class[var9] > 0) {
                     List var10 = this.id_class(var2, var9, this.id_class[var9]);
                     if (var10 != null && !var10.isEmpty()) {
                        eL_2 var7 = (eL_2)var10.get(this.id_private.nextInt(var10.size()));
                        this.id_break[var9] = rVL.id_boolean.id_class(var7.id_class);
                        this.id_byte[var9] = var7.id_break;
                     }
                  }
               }

               this.id_native();
            });
         } else {
            for (int var3 = 0; var3 < 3; var3++) {
               this.id_class[var3] = 0;
               this.id_break[var3] = -1;
               this.id_byte[var3] = -1;
            }
         }
      }
   }

   public int id_class() {
      rdn_3 var1 = this.id_protected.id_extends(1);
      return var1.id_class() ? 0 : var1.id_char();
   }

   private List<eL_2> id_class(rdn_3 var1, int var2, int var3) {
      this.id_private.setSeed((long)(this.id_implements.id_break() + var2));
      List var4 = eA_2.id_break(this.id_private, var1, var3, false);
      if (var1.id_break() == rdy_3.XM && var4.size() > 1) {
         var4.remove(this.id_private.nextInt(var4.size()));
      }

      return var4;
   }

   public int id_break() {
      return this.id_implements.id_break();
   }

   @Override
   public boolean id_break(rhd_3 var1, int var2) {
      rdn_3 var3 = this.id_protected.id_extends(0);
      rdn_3 var4 = this.id_protected.id_extends(1);
      int var5 = var2 + 1;
      if ((var4.id_class() || var4.id_char() < var5) && !((rhx_3)var1.id_implements[18]).id_protected) {
         return false;
      } else if (this.id_class[var2] > 0
         && !var3.id_class()
         && ((Integer)var1.id_implements[19] >= var5 && (Integer)var1.id_implements[19] >= this.id_class[var2] || ((rhx_3)var1.id_implements[18]).id_protected)
         )
       {
         this.id_catch.id_class((var6, var7) -> {
            rdn_3 var8 = var3;
            List var9 = this.id_class(var3, var2, this.id_class[var2]);
            if (!var9.isEmpty()) {
               var1.id_break(var3, var5);
               boolean var10 = var3.id_break() == rdy_3.XM;
               if (var10) {
                  var8 = new rdn_3(rdy_3.dm);
                  rcd_3 var11 = var3.id_package();
                  if (var11 != null) {
                     var8.id_byte(var11.id_catch());
                  }

                  this.id_protected.id_break(0, var8);
               }

               for (int var13 = 0; var13 < var9.size(); var13++) {
                  eL_2 var12 = (eL_2)var9.get(var13);
                  if (var10) {
                     rxy_3.id_class(var8, var12);
                  } else {
                     var8.id_class(var12.id_class, var12.id_break);
                  }
               }

               if (!((rhx_3)var1.id_implements[18]).id_protected) {
                  var4.id_catch(var5);
                  if (var4.id_class()) {
                     this.id_protected.id_break(1, rdn_3.id_break);
                  }
               }

               var1.id_break(rlB_2.k);
               if (var1 instanceof rhN_2) {
                  Oo_1.id_implements.id_class((rhN_2)var1, var8, var5);
               }

               this.id_protected.id_break();
               this.id_implements.id_class(var1.sH());
               this.id_class(this.id_protected);
               var6.id_class((rhd_3)null, var7, rqn_3.BQ, rqL_2.BLOCKS, 1.0F, var6.id_int.nextFloat() * 0.1F + 0.9F);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   @Override
   public void id_break(rhd_3 var1) {
      super.id_break(var1);
      this.id_catch.id_class((var2, var3) -> this.id_class(var1, (rYB)var1.id_throws[7], this.id_protected));
   }
}
