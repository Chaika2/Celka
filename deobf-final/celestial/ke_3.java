package celestial;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;

public class ke_3 {
   private final rYB class_;
   private final rfH_2 break_;
   private final boolean byte_;
   private final rfH_2 protected_;
   private final rpr_3 throws_;
   private final List<rfH_2> case_ = Lists.newArrayList();
   private final List<rfH_2> catch_ = Lists.newArrayList();
   private final rpr_3 private_;

   public List<rfH_2> byte_() {
      return this.catch_;
   }

   public ke_3(rYB var1, rfH_2 var2, rpr_3 var3, boolean var4) {
      this.class_ = var1;
      this.break_ = var2;
      this.private_ = var3;
      this.byte_ = var4;
      if (var4) {
         this.throws_ = var3;
         this.protected_ = var2.break_(var3);
      } else {
         this.throws_ = var3.case_();
         this.protected_ = var2.class_(var3, 2);
      }
   }

   private boolean class_(rfH_2 var1, rpr_3 var2) {
      xc_3 var3 = this.class_.byte_(var1);
      xd_3 var4 = var3.break_();
      if (var3.catch_()) {
         return true;
      } else if (!kD_2.class_(var3, this.class_, var1, this.throws_, false, var2)) {
         return true;
      } else if (var1.equals(this.break_)) {
         return true;
      } else if (this.case_.contains(var1)) {
         return true;
      } else {
         int var5 = 1;
         if (var5 + this.case_.size() > 12) {
            return false;
         } else {
            while (class_(var4)) {
               rfH_2 var6 = var1.class_(this.throws_.case_(), var5);
               xd_3 var7 = var4;
               var3 = this.class_.byte_(var6);
               var4 = var3.break_();
               if (var3.catch_()
                  || !class_(var7, var4)
                  || !kD_2.class_(var3, this.class_, var6, this.throws_, false, this.throws_.case_())
                  || var6.equals(this.break_)) {
                  break;
               }

               if (++var5 + this.case_.size() > 12) {
                  return false;
               }
            }

            int var14 = 0;

            for (int var15 = var5 - 1; var15 >= 0; var15--) {
               this.case_.add(var1.class_(this.throws_.case_(), var15));
               var14++;
            }

            int var16 = 1;

            while (true) {
               rfH_2 var8 = var1.class_(this.throws_, var16);
               int var9 = this.case_.indexOf(var8);
               if (var9 > -1) {
                  this.class_(var14, var9);

                  for (int var10 = 0; var10 <= var9 + var14; var10++) {
                     rfH_2 var11 = this.case_.get(var10);
                     if (class_(this.class_.byte_(var11).break_()) && !this.class_(var11)) {
                        return false;
                     }
                  }

                  return true;
               }

               var3 = this.class_.byte_(var8);
               if (var3.catch_()) {
                  return true;
               }

               if (!kD_2.class_(var3, this.class_, var8, this.throws_, true, this.throws_) || var8.equals(this.break_)) {
                  return false;
               }

               if (var3.extends_() == Qs_1.DESTROY) {
                  this.catch_.add(var8);
                  return true;
               }

               if (this.case_.size() >= 12) {
                  return false;
               }

               this.case_.add(var8);
               var14++;
               var16++;
            }
         }
      }
   }

   private boolean class_(rfH_2 var1) {
      xc_3 var2 = this.class_.byte_(var1);

      for (rpr_3 var6 : rpr_3.values()) {
         if (var6.final_() != this.throws_.final_()) {
            rfH_2 var7 = var1.break_(var6);
            xc_3 var8 = this.class_.byte_(var7);
            if (class_(var8.break_(), var2.break_()) && !this.class_(var7, var6)) {
               return false;
            }
         }
      }

      return true;
   }

   private void class_(int var1, int var2) {
      ArrayList var3 = Lists.newArrayList();
      ArrayList var4 = Lists.newArrayList();
      ArrayList var5 = Lists.newArrayList();
      var3.addAll(this.case_.subList(0, var2));
      var4.addAll(this.case_.subList(this.case_.size() - var1, this.case_.size()));
      var5.addAll(this.case_.subList(var2, this.case_.size() - var1));
      this.case_.clear();
      this.case_.addAll(var3);
      this.case_.addAll(var4);
      this.case_.addAll(var5);
   }

   private static boolean class_(xd_3 var0) {
      return var0 == xu_3.EN || var0 == xu_3.Jh;
   }

   private static boolean class_(xd_3 var0, xd_3 var1) {
      if (var0 == xu_3.Jh && var1 == xu_3.EN) {
         return false;
      } else {
         return var0 == xu_3.EN && var1 == xu_3.Jh ? false : class_(var0) || class_(var1);
      }
   }

   public boolean class_() {
      this.case_.clear();
      this.catch_.clear();
      xc_3 var1 = this.class_.byte_(this.protected_);
      if (!kD_2.class_(var1, this.class_, this.protected_, this.throws_, false, this.private_)) {
         if (this.byte_ && var1.extends_() == Qs_1.DESTROY) {
            this.catch_.add(this.protected_);
            return true;
         } else {
            return false;
         }
      } else if (!this.class_(this.protected_, this.throws_)) {
         return false;
      } else {
         for (int var2 = 0; var2 < this.case_.size(); var2++) {
            rfH_2 var3 = this.case_.get(var2);
            if (class_(this.class_.byte_(var3).break_()) && !this.class_(var3)) {
               return false;
            }
         }

         return true;
      }
   }

   public List<rfH_2> break_() {
      return this.case_;
   }
}
