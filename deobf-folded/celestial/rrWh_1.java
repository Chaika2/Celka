package celestial;

import java.util.ArrayList;

public class rrWh_1 {
   private ArrayList id_class = null;
   private int id_break = 0;
   private float id_byte = 1.0F;
   private int id_protected = 0;

   public boolean id_byte() {
      return this.id_class.isEmpty();
   }

   public rrWh_1() {
      this(10, 0.75F);
   }

   public rrWh_1(int var1, float var2) {
      this.id_class = new ArrayList(var1);
      this.id_break = var1;
      this.id_byte = var2;
   }

   public rrWh_1(int var1) {
      this(var1, 0.75F);
   }

   public void id_class() {
      this.id_class.clear();
      this.id_protected = 0;
   }

   public Object id_class(int var1) {
      Object var2 = this.id_class.remove(var1);
      if (var2 != null) {
         this.id_protected--;
      }

      return var2;
   }

   public void id_class(int var1, Object var2) {
      if (var2 != null) {
         this.id_protected++;
      }

      this.id_class.add(var1, var2);
   }

   public boolean id_class(Object var1) {
      if (var1 != null) {
         this.id_protected++;
      }

      return this.id_class.add(var1);
   }

   public boolean id_break(Object var1) {
      return this.id_class.contains(var1);
   }

   public Object id_break(int var1) {
      return this.id_class.get(var1);
   }

   public void id_break() {
      if (this.id_protected <= 0 && this.id_class.size() <= 0) {
         this.id_class();
      } else if (this.id_class.size() > this.id_break) {
         float var1 = (float)this.id_protected * 1.0F / (float)this.id_class.size();
         if (!(var1 > this.id_byte)) {
            int var2 = 0;

            for (int var3 = 0; var3 < this.id_class.size(); var3++) {
               Object var4 = this.id_class.get(var3);
               if (var4 != null) {
                  if (var3 != var2) {
                     this.id_class.set(var2, var4);
                  }

                  var2++;
               }
            }

            for (int var5 = this.id_class.size() - 1; var5 >= var2; var5--) {
               this.id_class.remove(var5);
            }
         }
      }
   }

   public Object id_break(int var1, Object var2) {
      Object var3 = this.id_class.set(var1, var2);
      if (var2 != var3) {
         if (var3 == null) {
            this.id_protected++;
         }

         if (var2 == null) {
            this.id_protected--;
         }
      }

      return var3;
   }

   public int id_throws() {
      return this.id_protected;
   }

   public int id_protected() {
      return this.id_class.size();
   }
}
