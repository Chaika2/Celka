package celestial;

import java.util.Iterator;

public class rrWR<T> {
   private rrWo_1<T> id_class;
   private rrWo_1<T> id_break;
   private int id_byte;

   public rrWo_1<T> id_byte(rrWo_1<T> var1) {
      this.id_throws(var1);
      rrWo_1 var2 = var1.id_break();
      rrWo_1 var3 = var1.id_byte();
      if (var2 != null) {
         var2.id_break(var3);
      } else {
         this.id_class = var3;
      }

      if (var3 != null) {
         var3.id_class(var2);
      } else {
         this.id_break = var2;
      }

      var1.id_class((rrWo_1<T>)null);
      var1.id_break((rrWo_1<T>)null);
      var1.id_class((rrWR<T>)null);
      this.id_byte--;
      return var1;
   }

   public rrWo_1<T> id_byte() {
      return this.id_break;
   }

   @Override
   public String toString() {
      StringBuffer var1 = new StringBuffer();
      Iterator var2 = this.id_class();

      while (var2.hasNext()) {
         rrWo_1 var3 = (rrWo_1)var2.next();
         if (var1.length() > 0) {
            var1.append(", ");
         }

         var1.append(var3.id_class());
      }

      return this.id_byte + " [" + var1.toString() + "]";
   }

   public void id_class(rrWo_1<T> var1) {
      this.id_case(var1);
      if (this.id_throws()) {
         this.id_class = var1;
         this.id_break = var1;
      } else {
         rrWo_1 var2 = this.id_class;
         var1.id_break(var2);
         var2.id_class(var1);
         this.id_class = var1;
      }

      var1.id_class(this);
      this.id_byte++;
   }

   public Iterator<rrWo_1<T>> id_class() {
      return new rrWY(this);
   }

   public boolean id_class(rrWo_1<T> var1, rrWo_1<T> var2, rrWo_1<T> var3) {
      this.id_throws(var2);
      if (var3 != null) {
         this.id_throws(var3);
      }

      rrWo_1 var4;
      for (var4 = var2; var4 != null && var4 != var3; var4 = var4.id_byte()) {
         if (var4 == var1) {
            return true;
         }
      }

      if (var4 != var3) {
         throw new IllegalArgumentException("Sublist is not linked, from: " + var2 + ", to: " + var3);
      } else {
         return false;
      }
   }

   public void id_class(rrWo_1<T> var1, rrWo_1<T> var2) {
      if (var1 == null) {
         this.id_class(var2);
      } else if (var1 == this.id_break) {
         this.id_break(var2);
      } else {
         this.id_throws(var1);
         this.id_case(var2);
         rrWo_1 var3 = var1.id_byte();
         var1.id_break(var2);
         var2.id_class(var1);
         var3.id_class(var2);
         var2.id_break(var3);
         var2.id_class(this);
         this.id_byte++;
      }
   }

   public void id_break(rrWo_1<T> var1, rrWo_1<T> var2) {
      this.id_byte(var2);
      this.id_class(var1, var2);
   }

   public rrWo_1<T> id_break() {
      return this.id_class;
   }

   public void id_break(rrWo_1<T> var1) {
      this.id_case(var1);
      if (this.id_throws()) {
         this.id_class = var1;
         this.id_break = var1;
      } else {
         rrWo_1 var2 = this.id_break;
         var1.id_class(var2);
         var2.id_break(var1);
         this.id_break = var1;
      }

      var1.id_class(this);
      this.id_byte++;
   }

   public boolean id_throws() {
      return this.id_byte <= 0;
   }

   private void id_throws(rrWo_1<T> var1) {
      if (var1.id_protected != this) {
         throw new IllegalArgumentException("Node has different parent, node: " + var1 + ", parent: " + var1.id_protected + ", this: " + this);
      }
   }

   private void id_case(rrWo_1<T> var1) {
      if (var1.id_protected != null) {
         throw new IllegalArgumentException("Node has different parent, node: " + var1 + ", parent: " + var1.id_protected + ", this: " + this);
      }
   }

   public int id_protected() {
      return this.id_byte;
   }

   public boolean id_protected(rrWo_1<T> var1) {
      return var1.id_protected == this;
   }
}
