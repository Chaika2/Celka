package celestial;

import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rJf_1 extends rXy_1 {
   private static final Logger id_catch = LogManager.getLogger();
   private int id_private;
   private String id_implements;
   private final rpj_3 id_finally = rpj_3.id_class();

   public rJf_1(int var1, rhz_3 var2) {
      this(var1, var2, rpq_3.id_class);
   }

   public rJf_1(int var1, rhz_3 var2, rpq_3 var3) {
      super(rJP.id_private, var1, var2, var3);
      this.id_class(this.id_finally);
   }

   @Override
   public void id_class() {
      rdn_3 var1 = this.id_break.id_extends(0);
      this.id_finally.id_class(1);
      int var2 = 0;
      int var3 = 0;
      byte var4 = 0;
      if (var1.id_class()) {
         this.id_class.id_break(0, rdn_3.id_break);
         this.id_finally.id_class(0);
      } else {
         rdn_3 var5 = var1.id_implements();
         rdn_3 var6 = this.id_break.id_extends(1);
         Map var7 = eA_2.id_class(var5);
         var3 = var3 + var1.id_instanceof() + (var6.id_class() ? 0 : var6.id_instanceof());
         this.id_private = 0;
         if (!var6.id_class()) {
            boolean var8 = var6.id_break() == rdy_3.dm && !rxy_3.id_protected(var6).isEmpty();
            if (var5.id_throws() && var5.id_break().id_class(var1, var6)) {
               int var22 = Math.min(var5.id_catch(), var5.id_private() / 4);
               if (var22 <= 0) {
                  this.id_class.id_break(0, rdn_3.id_break);
                  this.id_finally.id_class(0);
                  return;
               }

               int var24;
               for (var24 = 0; var22 > 0 && var24 < var6.id_char(); var24++) {
                  int var26 = var5.id_catch() - var22;
                  var5.id_break(var26);
                  var2++;
                  var22 = Math.min(var5.id_catch(), var5.id_private() / 4);
               }

               this.id_private = var24;
            } else {
               if (!var8 && (var5.id_break() != var6.id_break() || !var5.id_throws())) {
                  this.id_class.id_break(0, rdn_3.id_break);
                  this.id_finally.id_class(0);
                  return;
               }

               if (var5.id_throws() && !var8) {
                  int var9 = var1.id_private() - var1.id_catch();
                  int var10 = var6.id_private() - var6.id_catch();
                  int var11 = var10 + var5.id_private() * 12 / 100;
                  int var12 = var9 + var11;
                  int var13 = var5.id_private() - var12;
                  if (var13 < 0) {
                     var13 = 0;
                  }

                  if (var13 < var5.id_catch()) {
                     var5.id_break(var13);
                     var2 += 2;
                  }
               }

               Map var21 = eA_2.id_class(var6);
               boolean var23 = false;
               boolean var25 = false;

               for (ev_3 var28 : var21.keySet()) {
                  if (var28 != null) {
                     int var14 = var7.getOrDefault(var28, 0);
                     int var15 = (Integer)var21.get(var28);
                     var15 = var14 == var15 ? var15 + 1 : Math.max(var15, var14);
                     boolean var16 = var28.id_class(var1);
                     if (((rhx_3)this.id_protected.id_implements[18]).id_protected || var1.id_break() == rdy_3.dm) {
                        var16 = true;
                     }

                     for (ev_3 var18 : var7.keySet()) {
                        if (var18 != var28 && !var28.id_break(var18)) {
                           var16 = false;
                           var2++;
                        }
                     }

                     if (!var16) {
                        var25 = true;
                     } else {
                        var23 = true;
                        if (var15 > var28.id_class()) {
                           var15 = var28.id_class();
                        }

                        var7.put(var28, var15);
                        int var30 = 0;
                        switch (var28.id_protected()) {
                           case COMMON:
                              var30 = 1;
                              break;
                           case UNCOMMON:
                              var30 = 2;
                              break;
                           case RARE:
                              var30 = 4;
                              break;
                           case VERY_RARE:
                              var30 = 8;
                        }

                        if (var8) {
                           var30 = Math.max(1, var30 / 2);
                        }

                        var2 += var30 * var15;
                        if (var1.id_char() > 1) {
                           var2 = 40;
                        }
                     }
                  }
               }

               if (var25 && !var23) {
                  this.id_class.id_break(0, rdn_3.id_break);
                  this.id_finally.id_class(0);
                  return;
               }
            }
         }

         if (StringUtils.isBlank(this.id_implements)) {
            if (var1.id_this()) {
               var4 = 1;
               var2 += var4;
               var5.id_super();
            }
         } else if (!this.id_implements.equals(var1.id_continue().getString())) {
            var4 = 1;
            var2 += var4;
            var5.id_class(new rgN_2(this.id_implements));
         }

         this.id_finally.id_class(var3 + var2);
         if (var2 <= 0) {
            var5 = rdn_3.id_break;
         }

         if (var4 == var2 && var4 > 0 && this.id_finally.id_break() >= 40) {
            this.id_finally.id_class(39);
         }

         if (this.id_finally.id_break() >= 40 && !((rhx_3)this.id_protected.id_implements[18]).id_protected) {
            var5 = rdn_3.id_break;
         }

         if (!var5.id_class()) {
            int var20 = var5.id_instanceof();
            if (!var6.id_class() && var20 < var6.id_instanceof()) {
               var20 = var6.id_instanceof();
            }

            if (var4 != var2 || var4 == 0) {
               var20 = id_protected(var20);
            }

            var5.id_byte(var20);
            eA_2.id_class(var7, var5);
         }

         this.id_class.id_break(0, var5);
         this.id_native();
      }
   }

   public void id_class(String var1) {
      this.id_implements = var1;
      if (this.id_class(2).id_break()) {
         rdn_3 var2 = this.id_class(2).id_class();
         if (StringUtils.isBlank(var1)) {
            var2.id_super();
         } else {
            var2.id_class(new rgN_2(this.id_implements));
         }
      }

      this.id_class();
   }

   @Override
   protected boolean id_class(rhd_3 var1, boolean var2) {
      return (((rhx_3)var1.id_implements[18]).id_protected || (Integer)var1.id_implements[19] >= this.id_finally.id_break()) && this.id_finally.id_break() > 0;
   }

   @Override
   protected boolean id_class(xc_3 var1) {
      return var1.id_class(rls_3.id_long);
   }

   @Override
   protected rdn_3 id_class(rhd_3 var1, rdn_3 var2) {
      if (!((rhx_3)var1.id_implements[18]).id_protected) {
         var1.id_super(-this.id_finally.id_break());
      }

      this.id_break.id_break(0, rdn_3.id_break);
      if (this.id_private > 0) {
         rdn_3 var3 = this.id_break.id_extends(1);
         if (!var3.id_class() && var3.id_char() > this.id_private) {
            var3.id_catch(this.id_private);
            this.id_break.id_break(1, var3);
         } else {
            this.id_break.id_break(1, rdn_3.id_break);
         }
      } else {
         this.id_break.id_break(1, rdn_3.id_break);
      }

      this.id_finally.id_class(0);
      this.id_byte.id_class((var1x, var2x) -> {
         xc_3 var3x = var1x.id_byte(var2x);
         if (!((rhx_3)var1.id_implements[18]).id_protected && var3x.id_class(rls_3.id_long) && var1.Sa().nextFloat() < 0.12F) {
            xc_3 var4 = Ji_1.id_private(var3x);
            if (var4 == null) {
               var1x.id_class(var2x, false);
               var1x.id_byte(1029, var2x, 0);
            } else {
               var1x.id_class(var2x, var4, 2);
               var1x.id_byte(1030, var2x, 0);
            }
         } else {
            var1x.id_byte(1030, var2x, 0);
         }
      });
      return var2;
   }

   public int id_break() {
      return this.id_finally.id_break();
   }

   public static int id_protected(int var0) {
      return var0 * 2 + 1;
   }
}
