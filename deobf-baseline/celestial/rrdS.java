package celestial;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class rrdS implements Iterator<rfH_2> {
   private double id_class;
   private double id_break;
   private int id_byte;
   private int id_protected;
   private double id_throws;
   private double id_case;
   private double id_catch;
   private double id_private;
   private int id_implements;
   private double id_finally;
   private double id_extends;
   private rrGi_1 id_native = new rrGi_1(0, 0, 0);
   private boolean id_volatile = false;

   public rrdS(rfH_2 var1, rfH_2 var2, double var3, double var5) {
      this.id_class = var3;
      this.id_break = var5;
      this.id_byte = var1.b_();
      this.id_protected = var2.b_();
      this.id_throws = (double)var1.c_();
      this.id_case = (double)var2.c_() - 0.5;
      this.id_catch = (double)var1.d_();
      this.id_private = (double)var2.d_() - 0.5;
      this.id_implements = this.id_byte;
      this.id_finally = this.id_throws;
      this.id_extends = this.id_catch;
      this.id_volatile = this.id_implements < this.id_protected && this.id_finally < this.id_case && this.id_extends < this.id_private;
   }

   @Override
   public void remove() {
      throw new RuntimeException("Not implemented");
   }

   @Override
   public boolean hasNext() {
      return this.id_volatile;
   }

   public rfH_2 id_class() {
      if (!this.id_volatile) {
         throw new NoSuchElementException();
      } else {
         this.id_native.id_break((double)this.id_implements, this.id_finally, this.id_extends);
         this.id_break();
         this.id_volatile = this.id_implements < this.id_protected && this.id_finally < this.id_case && this.id_extends < this.id_private;
         return this.id_native;
      }
   }

   private void id_break() {
      this.id_extends++;
      if (!(this.id_extends < this.id_private)) {
         this.id_extends = this.id_catch;
         this.id_finally++;
         if (!(this.id_finally < this.id_case)) {
            this.id_finally = this.id_throws;
            this.id_throws = this.id_throws + this.id_class;
            this.id_case = this.id_case + this.id_class;
            this.id_finally = this.id_throws;
            this.id_catch = this.id_catch + this.id_break;
            this.id_private = this.id_private + this.id_break;
            this.id_extends = this.id_catch;
            this.id_implements++;
            if (this.id_implements >= this.id_protected) {
            }
         }
      }
   }
}
