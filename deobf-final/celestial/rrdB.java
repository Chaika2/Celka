package celestial;

import java.util.Iterator;

public class rrdB implements Iterator<rfH_2> {
   private rrdS class_;
   private rrGi_1 break_ = new rrGi_1(0, 0, 0);
   private int byte_ = 0;
   private int protected_;
   private int throws_;
   private int case_;
   private static final int catch_ = 0;
   private static final int private_ = 1;
   private static final int implements_ = 2;

   public rrdB(rfH_2 var1, rfH_2 var2, int var3, int var4) {
      boolean var5 = var1.b_() > var2.b_();
      boolean var6 = var1.c_() > var2.c_();
      boolean var7 = var1.d_() > var2.d_();
      var1 = this.class_(var1, var5, var6, var7);
      var2 = this.class_(var2, var5, var6, var7);
      this.protected_ = var5 ? -1 : 1;
      this.throws_ = var6 ? -1 : 1;
      this.case_ = var7 ? -1 : 1;
      rjU_2 var8 = new rjU_2((double)(var2.b_() - var1.b_()), (double)(var2.c_() - var1.c_()), (double)(var2.d_() - var1.d_()));
      rjU_2 var9 = var8.protected_();
      rjU_2 var10 = new rjU_2(1.0, 0.0, 0.0);
      double var11 = var9.break_(var10);
      double var13 = Math.abs(var11);
      rjU_2 var15 = new rjU_2(0.0, 1.0, 0.0);
      double var16 = var9.break_(var15);
      double var18 = Math.abs(var16);
      rjU_2 var20 = new rjU_2(0.0, 0.0, 1.0);
      double var21 = var9.break_(var20);
      double var23 = Math.abs(var21);
      if (var23 >= var18 && var23 >= var13) {
         this.byte_ = 2;
         rfH_2 var35 = new rfH_2(var1.d_(), var1.c_() - var3, var1.b_() - var4);
         rfH_2 var37 = new rfH_2(var2.d_(), var1.c_() + var3 + 1, var1.b_() + var4 + 1);
         int var39 = var2.d_() - var1.d_();
         double var41 = (double)(var2.c_() - var1.c_()) / (1.0 * (double)var39);
         double var43 = (double)(var2.b_() - var1.b_()) / (1.0 * (double)var39);
         this.class_ = new rrdS(var35, var37, var41, var43);
      } else if (var18 >= var13 && var18 >= var23) {
         this.byte_ = 1;
         rfH_2 var34 = new rfH_2(var1.c_(), var1.b_() - var3, var1.d_() - var4);
         rfH_2 var36 = new rfH_2(var2.c_(), var1.b_() + var3 + 1, var1.d_() + var4 + 1);
         int var38 = var2.c_() - var1.c_();
         double var40 = (double)(var2.b_() - var1.b_()) / (1.0 * (double)var38);
         double var42 = (double)(var2.d_() - var1.d_()) / (1.0 * (double)var38);
         this.class_ = new rrdS(var34, var36, var40, var42);
      } else {
         this.byte_ = 0;
         rfH_2 var25 = new rfH_2(var1.b_(), var1.c_() - var3, var1.d_() - var4);
         rfH_2 var26 = new rfH_2(var2.b_(), var1.c_() + var3 + 1, var1.d_() + var4 + 1);
         int var27 = var2.b_() - var1.b_();
         double var28 = (double)(var2.c_() - var1.c_()) / (1.0 * (double)var27);
         double var30 = (double)(var2.d_() - var1.d_()) / (1.0 * (double)var27);
         this.class_ = new rrdS(var25, var26, var28, var30);
      }
   }

   @Override
   public void remove() {
      throw new RuntimeException("Not supported");
   }

   @Override
   public boolean hasNext() {
      return this.class_.hasNext();
   }

   private rfH_2 class_(rfH_2 var1, boolean var2, boolean var3, boolean var4) {
      if (var2) {
         var1 = new rfH_2(-var1.b_(), var1.c_(), var1.d_());
      }

      if (var3) {
         var1 = new rfH_2(var1.b_(), -var1.c_(), var1.d_());
      }

      if (var4) {
         var1 = new rfH_2(var1.b_(), var1.c_(), -var1.d_());
      }

      return var1;
   }

   public rfH_2 class_() {
      rfH_2 var1 = this.class_.class_();
      switch (this.byte_) {
         case 0:
            this.break_.class_(var1.b_() * this.protected_, var1.c_() * this.throws_, var1.d_() * this.case_);
            return this.break_;
         case 1:
            this.break_.class_(var1.c_() * this.protected_, var1.b_() * this.throws_, var1.d_() * this.case_);
            return this.break_;
         case 2:
            this.break_.class_(var1.d_() * this.protected_, var1.c_() * this.throws_, var1.b_() * this.case_);
            return this.break_;
         default:
            this.break_.class_(var1.b_() * this.protected_, var1.c_() * this.throws_, var1.d_() * this.case_);
            return this.break_;
      }
   }
}
