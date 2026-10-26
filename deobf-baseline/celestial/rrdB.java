package celestial;

import java.util.Iterator;

public class rrdB implements Iterator<rfH_2> {
   private rrdS id_class;
   private rrGi_1 id_break = new rrGi_1(0, 0, 0);
   private int id_byte = 0;
   private int id_protected;
   private int id_throws;
   private int id_case;
   private static final int id_catch = 0;
   private static final int id_private = 1;
   private static final int id_implements = 2;

   public rrdB(rfH_2 var1, rfH_2 var2, int var3, int var4) {
      boolean var5 = var1.b_() > var2.b_();
      boolean var6 = var1.c_() > var2.c_();
      boolean var7 = var1.d_() > var2.d_();
      var1 = this.id_class(var1, var5, var6, var7);
      var2 = this.id_class(var2, var5, var6, var7);
      this.id_protected = var5 ? -1 : 1;
      this.id_throws = var6 ? -1 : 1;
      this.id_case = var7 ? -1 : 1;
      rjU_2 var8 = new rjU_2((double)(var2.b_() - var1.b_()), (double)(var2.c_() - var1.c_()), (double)(var2.d_() - var1.d_()));
      rjU_2 var9 = var8.id_protected();
      rjU_2 var10 = new rjU_2(1.0, 0.0, 0.0);
      double var11 = var9.id_break(var10);
      double var13 = Math.abs(var11);
      rjU_2 var15 = new rjU_2(0.0, 1.0, 0.0);
      double var16 = var9.id_break(var15);
      double var18 = Math.abs(var16);
      rjU_2 var20 = new rjU_2(0.0, 0.0, 1.0);
      double var21 = var9.id_break(var20);
      double var23 = Math.abs(var21);
      if (var23 >= var18 && var23 >= var13) {
         this.id_byte = 2;
         rfH_2 var35 = new rfH_2(var1.d_(), var1.c_() - var3, var1.b_() - var4);
         rfH_2 var37 = new rfH_2(var2.d_(), var1.c_() + var3 + 1, var1.b_() + var4 + 1);
         int var39 = var2.d_() - var1.d_();
         double var41 = (double)(var2.c_() - var1.c_()) / (1.0 * (double)var39);
         double var43 = (double)(var2.b_() - var1.b_()) / (1.0 * (double)var39);
         this.id_class = new rrdS(var35, var37, var41, var43);
      } else if (var18 >= var13 && var18 >= var23) {
         this.id_byte = 1;
         rfH_2 var34 = new rfH_2(var1.c_(), var1.b_() - var3, var1.d_() - var4);
         rfH_2 var36 = new rfH_2(var2.c_(), var1.b_() + var3 + 1, var1.d_() + var4 + 1);
         int var38 = var2.c_() - var1.c_();
         double var40 = (double)(var2.b_() - var1.b_()) / (1.0 * (double)var38);
         double var42 = (double)(var2.d_() - var1.d_()) / (1.0 * (double)var38);
         this.id_class = new rrdS(var34, var36, var40, var42);
      } else {
         this.id_byte = 0;
         rfH_2 var25 = new rfH_2(var1.b_(), var1.c_() - var3, var1.d_() - var4);
         rfH_2 var26 = new rfH_2(var2.b_(), var1.c_() + var3 + 1, var1.d_() + var4 + 1);
         int var27 = var2.b_() - var1.b_();
         double var28 = (double)(var2.c_() - var1.c_()) / (1.0 * (double)var27);
         double var30 = (double)(var2.d_() - var1.d_()) / (1.0 * (double)var27);
         this.id_class = new rrdS(var25, var26, var28, var30);
      }
   }

   @Override
   public void remove() {
      throw new RuntimeException("Not supported");
   }

   @Override
   public boolean hasNext() {
      return this.id_class.hasNext();
   }

   private rfH_2 id_class(rfH_2 var1, boolean var2, boolean var3, boolean var4) {
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

   public rfH_2 id_class() {
      rfH_2 var1 = this.id_class.id_class();
      switch (this.id_byte) {
         case 0:
            this.id_break.id_class(var1.b_() * this.id_protected, var1.c_() * this.id_throws, var1.d_() * this.id_case);
            return this.id_break;
         case 1:
            this.id_break.id_class(var1.c_() * this.id_protected, var1.b_() * this.id_throws, var1.d_() * this.id_case);
            return this.id_break;
         case 2:
            this.id_break.id_class(var1.d_() * this.id_protected, var1.c_() * this.id_throws, var1.b_() * this.id_case);
            return this.id_break;
         default:
            this.id_break.id_class(var1.b_() * this.id_protected, var1.c_() * this.id_throws, var1.d_() * this.id_case);
            return this.id_break;
      }
   }
}
