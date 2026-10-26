package celestial;

import java.util.EnumSet;

public class rBK extends rBk_1 {
   private final rBk_1 id_class;
   private final int id_break;
   private boolean id_byte;

   @Override
   public void id_byte() {
      if (!this.id_byte) {
         this.id_byte = true;
         this.id_class.id_byte();
      }
   }

   public rBK(int var1, rBk_1 var2) {
      this.id_break = var1;
      this.id_class = var2;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return var1 != null && this.getClass() == var1.getClass() ? this.id_class.equals(((rBK)var1).id_class) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.id_class.hashCode();
   }

   @Override
   public void id_class(EnumSet<rBW> var1) {
      this.id_class.id_class(var1);
   }

   public boolean id_class(rBK var1) {
      return this.J_() && var1.id_private() < this.id_private();
   }

   @Override
   public boolean id_class() {
      return this.id_class.id_class();
   }

   @Override
   public boolean id_break() {
      return this.id_class.id_break();
   }

   @Override
   public void id_throws() {
      this.id_class.id_throws();
   }

   public rBk_1 id_finally() {
      return this.id_class;
   }

   public boolean id_catch() {
      return this.id_byte;
   }

   @Override
   public EnumSet<rBW> id_implements() {
      return this.id_class.id_implements();
   }

   @Override
   public void id_protected() {
      if (this.id_byte) {
         this.id_byte = false;
         this.id_class.id_protected();
      }
   }

   public int id_private() {
      return this.id_break;
   }

   @Override
   public boolean J_() {
      return this.id_class.J_();
   }
}
