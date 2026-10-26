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
   protected static final Logger id_class = LogManager.getLogger();
   protected final rWr_1 id_break = new rWr_1();
   protected rhz_3 id_byte;
   protected rJI<C> id_protected;

   private int id_byte() {
      int var1 = 0;

      for (rdn_3 var3 : this.id_byte.id_class) {
         if (var3.id_class()) {
            var1++;
         }
      }

      return var1;
   }

   public rWE(rJI<C> var1) {
      this.id_protected = var1;
   }

   protected int id_class(boolean var1, int var2, boolean var3) {
      int var4 = 1;
      if (var1) {
         var4 = var2;
      } else if (var3) {
         var4 = 64;

         for (int var5 = 0; var5 < this.id_protected.id_byte() * this.id_protected.id_protected() + 1; var5++) {
            if (var5 != this.id_protected.id_break()) {
               rdn_3 var6 = this.id_protected.id_class(var5).id_class();
               if (!var6.id_class() && var4 > var6.id_char()) {
                  var4 = var6.id_char();
               }
            }
         }

         if (var4 < 64) {
            var4++;
         }
      }

      return var4;
   }

   protected void id_class(rJY var1, rdn_3 var2) {
      int var3 = this.id_byte.id_byte(var2);
      if (var3 != -1) {
         rdn_3 var4 = this.id_byte.id_extends(var3).id_implements();
         if (!var4.id_class()) {
            if (var4.id_char() > 1) {
               this.id_byte.id_class(var3, 1);
            } else {
               this.id_byte.id_native(var3);
            }

            var4.id_throws(1);
            if (var1.id_class().id_class()) {
               var1.id_break(var4);
            } else {
               var1.id_class().id_case(1);
            }
         }
      }
   }

   public void id_class(rhN_2 var1, rkw_3<C> var2, boolean var3) {
      if (var2 != null && var1.id_float().id_break(var2)) {
         this.id_byte = (rhz_3)var1.id_implements[1];
         if (this.id_break() || var1.id_implements()) {
            this.id_break.id_class();
            ((rhz_3)var1.id_implements[1]).id_class(this.id_break);
            this.id_protected.id_class(this.id_break);
            if (this.id_break.id_class(var2, (IntList)null)) {
               this.id_class(var2, var3);
            } else {
               this.id_class();
               var1.id_class.id_class(new rvq_3(((rJr_1)var1.id_implements[4]).id_case, var2));
            }

            ((rhz_3)var1.id_implements[1]).id_break();
         }
      }
   }

   @Override
   public void id_class(Iterator<Integer> var1, int var2, int var3, int var4, int var5) {
      rJY var6 = this.id_protected.id_class(var2);
      rdn_3 var7 = rWr_1.id_class((Integer)var1.next());
      if (!var7.id_class()) {
         for (int var8 = 0; var8 < var3; var8++) {
            this.id_class(var6, var7);
         }
      }
   }

   protected void id_class(int var1) {
      rdn_3 var2 = this.id_protected.id_class(var1).id_class();
      if (!var2.id_class()) {
         for (; var2.id_char() > 0; this.id_protected.id_class(var1).id_class(1)) {
            int var3 = this.id_byte.id_protected(var2);
            if (var3 == -1) {
               var3 = this.id_byte.id_throws();
            }

            rdn_3 var4 = var2.id_implements();
            var4.id_throws(1);
            if (!this.id_byte.id_class(var3, var4)) {
               id_class.error("Can't find any space for item in the inventory");
            }
         }
      }
   }

   protected void id_class(rkw_3<C> var1, boolean var2) {
      boolean var3 = this.id_protected.id_class(var1);
      int var4 = this.id_break.id_break(var1, (IntList)null);
      if (var3) {
         for (int var5 = 0; var5 < this.id_protected.id_protected() * this.id_protected.id_byte() + 1; var5++) {
            if (var5 != this.id_protected.id_break()) {
               rdn_3 var6 = this.id_protected.id_class(var5).id_class();
               if (!var6.id_class() && Math.min(var4, var6.id_byte()) < var6.id_char() + 1) {
                  return;
               }
            }
         }
      }

      int var11 = this.id_class(var2, var4, var3);
      IntArrayList var12 = new IntArrayList();
      if (this.id_break.id_class(var1, var12, var11)) {
         int var7 = var11;
         IntListIterator var8 = var12.iterator();

         while (var8.hasNext()) {
            int var9 = (Integer)var8.next();
            int var10 = rWr_1.id_class(var9).id_byte();
            if (var10 < var7) {
               var7 = var10;
            }
         }

         if (this.id_break.id_class(var1, var12, var7)) {
            this.id_class();
            this.id_class(this.id_protected.id_byte(), this.id_protected.id_protected(), this.id_protected.id_break(), var1, var12.iterator(), var7);
         }
      }
   }

   protected void id_class() {
      for (int var1 = 0; var1 < this.id_protected.id_byte() * this.id_protected.id_protected() + 1; var1++) {
         if (var1 != this.id_protected.id_break() || !(this.id_protected instanceof rJa_1) && !(this.id_protected instanceof rJT)) {
            this.id_class(var1);
         }
      }

      this.id_protected.id_class();
   }

   private boolean id_break() {
      ArrayList var1 = Lists.newArrayList();
      int var2 = this.id_byte();

      for (int var3 = 0; var3 < this.id_protected.id_byte() * this.id_protected.id_protected() + 1; var3++) {
         if (var3 != this.id_protected.id_break()) {
            rdn_3 var4 = this.id_protected.id_class(var3).id_class().id_implements();
            if (!var4.id_class()) {
               int var5 = this.id_byte.id_protected(var4);
               if (var5 == -1 && var1.size() <= var2) {
                  for (rdn_3 var7 : var1) {
                     if (var7.id_class(var4) && var7.id_char() != var7.id_byte() && var7.id_char() + var4.id_char() <= var7.id_byte()) {
                        var7.id_case(var4.id_char());
                        var4.id_throws(0);
                        break;
                     }
                  }

                  if (!var4.id_class()) {
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
