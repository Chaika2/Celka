package celestial;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;

public class ke_3 {
   private final rYB id_class;
   private final rfH_2 id_break;
   private final boolean id_byte;
   private final rfH_2 id_protected;
   private final rpr_3 id_throws;
   private final List<rfH_2> id_case = Lists.newArrayList();
   private final List<rfH_2> id_catch = Lists.newArrayList();
   private final rpr_3 id_private;

   public List<rfH_2> id_byte() {
      return this.id_catch;
   }

   public ke_3(rYB var1, rfH_2 var2, rpr_3 var3, boolean var4) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_private = var3;
      this.id_byte = var4;
      if (var4) {
         this.id_throws = var3;
         this.id_protected = var2.id_break(var3);
      } else {
         this.id_throws = var3.id_case();
         this.id_protected = var2.id_class(var3, 2);
      }
   }

   private boolean id_class(rfH_2 var1, rpr_3 var2) {
      xc_3 var3 = this.id_class.id_byte(var1);
      xd_3 var4 = var3.id_break();
      if (var3.id_catch()) {
         return true;
      } else if (!kD_2.id_class(var3, this.id_class, var1, this.id_throws, false, var2)) {
         return true;
      } else if (var1.equals(this.id_break)) {
         return true;
      } else if (this.id_case.contains(var1)) {
         return true;
      } else {
         int var5 = 1;
         if (var5 + this.id_case.size() > 12) {
            return false;
         } else {
            while (id_class(var4)) {
               rfH_2 var6 = var1.id_class(this.id_throws.id_case(), var5);
               xd_3 var7 = var4;
               var3 = this.id_class.id_byte(var6);
               var4 = var3.id_break();
               if (var3.id_catch()
                  || !id_class(var7, var4)
                  || !kD_2.id_class(var3, this.id_class, var6, this.id_throws, false, this.id_throws.id_case())
                  || var6.equals(this.id_break)) {
                  break;
               }

               if (++var5 + this.id_case.size() > 12) {
                  return false;
               }
            }

            int var14 = 0;

            for (int var15 = var5 - 1; var15 >= 0; var15--) {
               this.id_case.add(var1.id_class(this.id_throws.id_case(), var15));
               var14++;
            }

            int var16 = 1;

            while (true) {
               rfH_2 var8 = var1.id_class(this.id_throws, var16);
               int var9 = this.id_case.indexOf(var8);
               if (var9 > -1) {
                  this.id_class(var14, var9);

                  for (int var10 = 0; var10 <= var9 + var14; var10++) {
                     rfH_2 var11 = this.id_case.get(var10);
                     if (id_class(this.id_class.id_byte(var11).id_break()) && !this.id_class(var11)) {
                        return false;
                     }
                  }

                  return true;
               }

               var3 = this.id_class.id_byte(var8);
               if (var3.id_catch()) {
                  return true;
               }

               if (!kD_2.id_class(var3, this.id_class, var8, this.id_throws, true, this.id_throws) || var8.equals(this.id_break)) {
                  return false;
               }

               if (var3.id_extends() == Qs_1.DESTROY) {
                  this.id_catch.add(var8);
                  return true;
               }

               if (this.id_case.size() >= 12) {
                  return false;
               }

               this.id_case.add(var8);
               var14++;
               var16++;
            }
         }
      }
   }

   private boolean id_class(rfH_2 var1) {
      xc_3 var2 = this.id_class.id_byte(var1);

      for (rpr_3 var6 : rpr_3.values()) {
         if (var6.id_final() != this.id_throws.id_final()) {
            rfH_2 var7 = var1.id_break(var6);
            xc_3 var8 = this.id_class.id_byte(var7);
            if (id_class(var8.id_break(), var2.id_break()) && !this.id_class(var7, var6)) {
               return false;
            }
         }
      }

      return true;
   }

   private void id_class(int var1, int var2) {
      ArrayList var3 = Lists.newArrayList();
      ArrayList var4 = Lists.newArrayList();
      ArrayList var5 = Lists.newArrayList();
      var3.addAll(this.id_case.subList(0, var2));
      var4.addAll(this.id_case.subList(this.id_case.size() - var1, this.id_case.size()));
      var5.addAll(this.id_case.subList(var2, this.id_case.size() - var1));
      this.id_case.clear();
      this.id_case.addAll(var3);
      this.id_case.addAll(var4);
      this.id_case.addAll(var5);
   }

   private static boolean id_class(xd_3 var0) {
      return var0 == xu_3.EN || var0 == xu_3.Jh;
   }

   private static boolean id_class(xd_3 var0, xd_3 var1) {
      if (var0 == xu_3.Jh && var1 == xu_3.EN) {
         return false;
      } else {
         return var0 == xu_3.EN && var1 == xu_3.Jh ? false : id_class(var0) || id_class(var1);
      }
   }

   public boolean id_class() {
      this.id_case.clear();
      this.id_catch.clear();
      xc_3 var1 = this.id_class.id_byte(this.id_protected);
      if (!kD_2.id_class(var1, this.id_class, this.id_protected, this.id_throws, false, this.id_private)) {
         if (this.id_byte && var1.id_extends() == Qs_1.DESTROY) {
            this.id_catch.add(this.id_protected);
            return true;
         } else {
            return false;
         }
      } else if (!this.id_class(this.id_protected, this.id_throws)) {
         return false;
      } else {
         for (int var2 = 0; var2 < this.id_case.size(); var2++) {
            rfH_2 var3 = this.id_case.get(var2);
            if (id_class(this.id_class.id_byte(var3).id_break()) && !this.id_class(var3)) {
               return false;
            }
         }

         return true;
      }
   }

   public List<rfH_2> id_break() {
      return this.id_case;
   }
}
