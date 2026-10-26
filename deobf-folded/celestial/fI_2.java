package celestial;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.function.Consumer;

public class fI_2 {
   private final int id_class;
   private final int id_break;
   private final int id_byte;
   private final int id_protected;
   private List<fI_2> id_throws;
   private ft_3 id_case;

   public int id_byte() {
      return this.id_break;
   }

   public fI_2(int var1, int var2, int var3, int var4) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
   }

   @Override
   public String toString() {
      return "Slot{originX="
         + this.id_class
         + ", originY="
         + this.id_break
         + ", width="
         + this.id_byte
         + ", height="
         + this.id_protected
         + ", texture="
         + this.id_case
         + ", subSlots="
         + this.id_throws
         + "}";
   }

   public void id_class(Consumer<fI_2> var1) {
      if (this.id_case != null) {
         var1.accept(this);
      } else if (this.id_throws != null) {
         for (fI_2 var3 : this.id_throws) {
            var3.id_class(var1);
         }
      }
   }

   public boolean id_class(ft_3 var1) {
      if (this.id_case != null) {
         return false;
      } else {
         int var2 = var1.id_break;
         int var3 = var1.id_byte;
         if (var2 <= this.id_byte && var3 <= this.id_protected) {
            if (var2 == this.id_byte && var3 == this.id_protected) {
               this.id_case = var1;
               return true;
            } else {
               if (this.id_throws == null) {
                  this.id_throws = Lists.newArrayListWithCapacity(1);
                  this.id_throws.add(new fI_2(this.id_class, this.id_break, var2, var3));
                  int var4 = this.id_byte - var2;
                  int var5 = this.id_protected - var3;
                  if (var5 > 0 && var4 > 0) {
                     int var6 = Math.max(this.id_protected, var4);
                     int var7 = Math.max(this.id_byte, var5);
                     if (var6 >= var7) {
                        this.id_throws.add(new fI_2(this.id_class, this.id_break + var3, var2, var5));
                        this.id_throws.add(new fI_2(this.id_class + var2, this.id_break, var4, this.id_protected));
                     } else {
                        this.id_throws.add(new fI_2(this.id_class + var2, this.id_break, var4, var3));
                        this.id_throws.add(new fI_2(this.id_class, this.id_break + var3, this.id_byte, var5));
                     }
                  } else if (var4 == 0) {
                     this.id_throws.add(new fI_2(this.id_class, this.id_break + var3, var2, var5));
                  } else if (var5 == 0) {
                     this.id_throws.add(new fI_2(this.id_class + var2, this.id_break, var4, var3));
                  }
               }

               for (fI_2 var9 : this.id_throws) {
                  if (var9.id_class(var1)) {
                     return true;
                  }
               }

               return false;
            }
         } else {
            return false;
         }
      }
   }

   public ft_3 id_class() {
      return this.id_case;
   }

   public int id_break() {
      return this.id_class;
   }
}
