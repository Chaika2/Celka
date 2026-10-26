package celestial;

import java.util.Iterator;

public class rrWR<T> {
   private rrWo_1<T> class_;
   private rrWo_1<T> break_;
   private int byte_;

   public rrWo_1<T> byte_(rrWo_1<T> var1) {
      this.throws_(var1);
      rrWo_1 var2 = var1.break_();
      rrWo_1 var3 = var1.byte_();
      if (var2 != null) {
         var2.break_(var3);
      } else {
         this.class_ = var3;
      }

      if (var3 != null) {
         var3.class_(var2);
      } else {
         this.break_ = var2;
      }

      var1.class_((rrWo_1<T>)null);
      var1.break_((rrWo_1<T>)null);
      var1.class_((rrWR<T>)null);
      this.byte_--;
      return var1;
   }

   public rrWo_1<T> byte_() {
      return this.break_;
   }

   @Override
   public String toString() {
      StringBuffer var1 = new StringBuffer();
      Iterator var2 = this.class_();

      while (var2.hasNext()) {
         rrWo_1 var3 = (rrWo_1)var2.next();
         if (var1.length() > 0) {
            var1.append(", ");
         }

         var1.append(var3.class_());
      }

      return this.byte_ + " [" + var1.toString() + "]";
   }

   public void class_(rrWo_1<T> var1) {
      this.case_(var1);
      if (this.throws_()) {
         this.class_ = var1;
         this.break_ = var1;
      } else {
         rrWo_1 var2 = this.class_;
         var1.break_(var2);
         var2.class_(var1);
         this.class_ = var1;
      }

      var1.class_(this);
      this.byte_++;
   }

   public Iterator<rrWo_1<T>> class_() {
      return new rrWY(this);
   }

   public boolean class_(rrWo_1<T> var1, rrWo_1<T> var2, rrWo_1<T> var3) {
      this.throws_(var2);
      if (var3 != null) {
         this.throws_(var3);
      }

      rrWo_1 var4;
      for (var4 = var2; var4 != null && var4 != var3; var4 = var4.byte_()) {
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

   public void class_(rrWo_1<T> var1, rrWo_1<T> var2) {
      if (var1 == null) {
         this.class_(var2);
      } else if (var1 == this.break_) {
         this.break_(var2);
      } else {
         this.throws_(var1);
         this.case_(var2);
         rrWo_1 var3 = var1.byte_();
         var1.break_(var2);
         var2.class_(var1);
         var3.class_(var2);
         var2.break_(var3);
         var2.class_(this);
         this.byte_++;
      }
   }

   public void break_(rrWo_1<T> var1, rrWo_1<T> var2) {
      this.byte_(var2);
      this.class_(var1, var2);
   }

   public rrWo_1<T> break_() {
      return this.class_;
   }

   public void break_(rrWo_1<T> var1) {
      this.case_(var1);
      if (this.throws_()) {
         this.class_ = var1;
         this.break_ = var1;
      } else {
         rrWo_1 var2 = this.break_;
         var1.class_(var2);
         var2.break_(var1);
         this.break_ = var1;
      }

      var1.class_(this);
      this.byte_++;
   }

   public boolean throws_() {
      return this.byte_ <= 0;
   }

   private void throws_(rrWo_1<T> var1) {
      if (var1.protected_ != this) {
         throw new IllegalArgumentException("Node has different parent, node: " + var1 + ", parent: " + var1.protected_ + ", this: " + this);
      }
   }

   private void case_(rrWo_1<T> var1) {
      if (var1.protected_ != null) {
         throw new IllegalArgumentException("Node has different parent, node: " + var1 + ", parent: " + var1.protected_ + ", this: " + this);
      }
   }

   public int protected_() {
      return this.byte_;
   }

   public boolean protected_(rrWo_1<T> var1) {
      return var1.protected_ == this;
   }
}
