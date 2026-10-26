package celestial;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntListIterator;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rWE<C extends rXu_1> implements rkI_2<Integer> {
   protected static final Logger class_ = LogManager.getLogger();
   protected final rWr_1 break_ = new rWr_1();
   protected rhz_3 byte_;
   protected rJI<C> protected_;

   private int byte_() {
      int var1 = 0;

      for (rdn_3 var3 : this.byte_.class_) {
         if (var3.class_()) {
            var1++;
         }
      }

      return var1;
   }

   public rWE(rJI<C> var1) {
      this.protected_ = var1;
   }

   protected int class_(boolean var1, int var2, boolean var3) {
      int var4 = 1;
      if (var1) {
         var4 = var2;
      } else if (var3) {
         var4 = 64;

         for (int var5 = 0; var5 < this.protected_.byte_() * this.protected_.protected_() + 1; var5++) {
            if (var5 != this.protected_.break_()) {
               rdn_3 var6 = this.protected_.class_(var5).class_();
               if (!var6.class_() && var4 > var6.char_()) {
                  var4 = var6.char_();
               }
            }
         }

         if (var4 < 64) {
            var4++;
         }
      }

      return var4;
   }

   protected void class_(rJY var1, rdn_3 var2) {
      int var3 = this.byte_.byte_(var2);
      if (var3 != -1) {
         rdn_3 var4 = this.byte_.extends_(var3).implements_();
         if (!var4.class_()) {
            if (var4.char_() > 1) {
               this.byte_.class_(var3, 1);
            } else {
               this.byte_.native_(var3);
            }

            var4.throws_(1);
            if (var1.class_().class_()) {
               var1.break_(var4);
            } else {
               var1.class_().case_(1);
            }
         }
      }
   }

   public void class_(rhN_2 var1, rkw_3<C> var2, boolean var3) {
      if (var2 != null && var1.float_().break_(var2)) {
         this.byte_ = (rhz_3)var1.implements_[1];
         if (this.break_() || var1.implements_()) {
            this.break_.class_();
            ((rhz_3)var1.implements_[1]).class_(this.break_);
            this.protected_.class_(this.break_);
            if (this.break_.class_(var2, (IntList)null)) {
               this.class_(var2, var3);
            } else {
               this.class_();
               var1.class_.class_(new rvq_3(((rJr_1)var1.implements_[4]).case_, var2));
            }

            ((rhz_3)var1.implements_[1]).break_();
         }
      }
   }

   @Override
   public void class_(Iterator<Integer> var1, int var2, int var3, int var4, int var5) {
      rJY var6 = this.protected_.class_(var2);
      rdn_3 var7 = rWr_1.class_((Integer)var1.next());
      if (!var7.class_()) {
         for (int var8 = 0; var8 < var3; var8++) {
            this.class_(var6, var7);
         }
      }
   }

   protected void class_(int var1) {
      rdn_3 var2 = this.protected_.class_(var1).class_();
      if (!var2.class_()) {
         for (; var2.char_() > 0; this.protected_.class_(var1).class_(1)) {
            int var3 = this.byte_.protected_(var2);
            if (var3 == -1) {
               var3 = this.byte_.throws_();
            }

            rdn_3 var4 = var2.implements_();
            var4.throws_(1);
            if (!this.byte_.class_(var3, var4)) {
               class_.error("Can't find any space for item in the inventory");
            }
         }
      }
   }

   protected void class_(rkw_3<C> var1, boolean var2) {
      boolean var3 = this.protected_.class_(var1);
      int var4 = this.break_.break_(var1, (IntList)null);
      if (var3) {
         for (int var5 = 0; var5 < this.protected_.protected_() * this.protected_.byte_() + 1; var5++) {
            if (var5 != this.protected_.break_()) {
               rdn_3 var6 = this.protected_.class_(var5).class_();
               if (!var6.class_() && Math.min(var4, var6.byte_()) < var6.char_() + 1) {
                  return;
               }
            }
         }
      }

      int var11 = this.class_(var2, var4, var3);
      IntArrayList var12 = new IntArrayList();
      if (this.break_.class_(var1, var12, var11)) {
         int var7 = var11;
         IntListIterator var8 = var12.iterator();

         while (var8.hasNext()) {
            int var9 = (Integer)var8.next();
            int var10 = rWr_1.class_(var9).byte_();
            if (var10 < var7) {
               var7 = var10;
            }
         }

         if (this.break_.class_(var1, var12, var7)) {
            this.class_();
            this.class_(this.protected_.byte_(), this.protected_.protected_(), this.protected_.break_(), var1, var12.iterator(), var7);
         }
      }
   }

   protected void class_() {
      for (int var1 = 0; var1 < this.protected_.byte_() * this.protected_.protected_() + 1; var1++) {
         if (var1 != this.protected_.break_() || !(this.protected_ instanceof rJa_1) && !(this.protected_ instanceof rJT)) {
            this.class_(var1);
         }
      }

      this.protected_.class_();
   }

   private boolean break_() {
      ArrayList var1 = Lists.newArrayList();
      int var2 = this.byte_();

      for (int var3 = 0; var3 < this.protected_.byte_() * this.protected_.protected_() + 1; var3++) {
         if (var3 != this.protected_.break_()) {
            rdn_3 var4 = this.protected_.class_(var3).class_().implements_();
            if (!var4.class_()) {
               int var5 = this.byte_.protected_(var4);
               if (var5 == -1 && var1.size() <= var2) {
                  for (rdn_3 var7 : var1) {
                     if (var7.class_(var4) && var7.char_() != var7.byte_() && var7.char_() + var4.char_() <= var7.byte_()) {
                        var7.case_(var4.char_());
                        var4.throws_(0);
                        break;
                     }
                  }

                  if (!var4.class_()) {
                     if (var1.size() >= var2) {
                        return false;
                     }

                     var1.add(var4);
                  }
               } else if (var5 == -1) {
                  return false;
               }
            }
         }
      }

      return true;
   }
}
