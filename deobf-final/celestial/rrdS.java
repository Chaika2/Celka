package celestial;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class rrdS implements Iterator<rfH_2> {
   private double class_;
   private double break_;
   private int byte_;
   private int protected_;
   private double throws_;
   private double case_;
   private double catch_;
   private double private_;
   private int implements_;
   private double finally_;
   private double extends_;
   private rrGi_1 native_ = new rrGi_1(0, 0, 0);
   private boolean volatile_ = false;

   public rrdS(rfH_2 var1, rfH_2 var2, double var3, double var5) {
      this.class_ = var3;
      this.break_ = var5;
      this.byte_ = var1.b_();
      this.protected_ = var2.b_();
      this.throws_ = (double)var1.c_();
      this.case_ = (double)var2.c_() - 0.5;
      this.catch_ = (double)var1.d_();
      this.private_ = (double)var2.d_() - 0.5;
      this.implements_ = this.byte_;
      this.finally_ = this.throws_;
      this.extends_ = this.catch_;
      this.volatile_ = this.implements_ < this.protected_ && this.finally_ < this.case_ && this.extends_ < this.private_;
   }

   @Override
   public void remove() {
      throw new RuntimeException("Not implemented");
   }

   @Override
   public boolean hasNext() {
      return this.volatile_;
   }

   public rfH_2 class_() {
      if (!this.volatile_) {
         throw new NoSuchElementException();
      } else {
         this.native_.break_((double)this.implements_, this.finally_, this.extends_);
         this.break_();
         this.volatile_ = this.implements_ < this.protected_ && this.finally_ < this.case_ && this.extends_ < this.private_;
         return this.native_;
      }
   }

   private void break_() {
      this.extends_++;
      if (!(this.extends_ < this.private_)) {
         this.extends_ = this.catch_;
         this.finally_++;
         if (!(this.finally_ < this.case_)) {
            this.finally_ = this.throws_;
            this.throws_ = this.throws_ + this.class_;
            this.case_ = this.case_ + this.class_;
            this.finally_ = this.throws_;
            this.catch_ = this.catch_ + this.break_;
            this.private_ = this.private_ + this.break_;
            this.extends_ = this.catch_;
            this.implements_++;
            if (this.implements_ >= this.protected_) {
            }
         }
      }
   }
}
