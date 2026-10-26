package celestial;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class rHA extends ryO_2 implements rHf_1 {
   private static final xd_3[] id_break = new xd_3[]{xu_3.Em, xu_3.EZ, xu_3.EH, xu_3.Ev};
   public int id_class;
   private float id_byte;
   private boolean id_protected;
   private boolean id_throws;
   private final List<rfH_2> id_case = Lists.newArrayList();
   private iB_2 id_catch;
   private UUID id_private;
   private long id_implements;

   public rHA() {
      this(ryW_2.id_goto);
   }

   public rHA(ryW_2<?> var1) {
      super(var1);
   }

   public void id_class(rqA_2 var1) {
      this.id_extends.id_class((rhd_3)null, this.id_native, var1, rqL_2.BLOCKS, 1.0F, 1.0F);
   }

   public float id_class(float var1) {
      return (this.id_byte + var1) * -0.0375F;
   }

   @Override
   public void id_class(xc_3 var1, rcd_3 var2) {
      super.id_class(var1, var2);
      if (var2.id_break("Target")) {
         this.id_private = var2.id_class("Target");
      } else {
         this.id_private = null;
      }
   }

   private void id_class(boolean var1) {
      if (var1 != this.id_protected) {
         this.id_class(var1 ? rqn_3.Ps : rqn_3.PM);
      }

      this.id_protected = var1;
   }

   @Override
   public rcd_3 id_class(rcd_3 var1) {
      super.id_class(var1);
      if (this.id_catch != null) {
         var1.id_class("Target", this.id_catch.ro());
      }

      return var1;
   }

   private void id_break(boolean var1) {
      this.id_throws = var1;
   }

   @Override
   public void id_throws() {
      this.id_class++;
      long var1 = this.id_extends.r();
      if (var1 % 40L == 0L) {
         this.id_class(this.id_finally());
         if (!this.id_extends.id_continue && this.id_catch()) {
            this.id_extends();
            this.id_native();
         }
      }

      if (var1 % 80L == 0L && this.id_catch()) {
         this.id_class(rqn_3.PE);
      }

      if (var1 > this.id_implements && this.id_catch()) {
         this.id_implements = var1 + 60L + (long)this.id_extends.id_long().nextInt(40);
         this.id_class(rqn_3.PG);
      }

      if (this.id_extends.id_continue) {
         this.id_volatile();
         this.id_new();
         if (this.id_catch()) {
            this.id_byte++;
         }
      }
   }

   private boolean id_finally() {
      this.id_case.clear();

      for (int var1 = -1; var1 <= 1; var1++) {
         for (int var2 = -1; var2 <= 1; var2++) {
            for (int var3 = -1; var3 <= 1; var3++) {
               rfH_2 var4 = this.id_native.id_break(var1, var2, var3);
               if (!this.id_extends.id_final(var4)) {
                  return false;
               }
            }
         }
      }

      for (int var13 = -2; var13 <= 2; var13++) {
         for (int var14 = -2; var14 <= 2; var14++) {
            for (int var15 = -2; var15 <= 2; var15++) {
               int var16 = Math.abs(var13);
               int var5 = Math.abs(var14);
               int var6 = Math.abs(var15);
               if ((var16 > 1 || var5 > 1 || var6 > 1)
                  && (var13 == 0 && (var5 == 2 || var6 == 2) || var14 == 0 && (var16 == 2 || var6 == 2) || var15 == 0 && (var16 == 2 || var5 == 2))) {
                  rfH_2 var7 = this.id_native.id_break(var13, var14, var15);
                  xc_3 var8 = this.id_extends.id_byte(var7);

                  for (xd_3 var12 : id_break) {
                     if (var8.id_class(var12)) {
                        this.id_case.add(var7);
                     }
                  }
               }
            }
         }
      }

      this.id_break(this.id_case.size() >= 42);
      return this.id_case.size() >= 16;
   }

   public boolean id_catch() {
      return this.id_protected;
   }

   private void id_extends() {
      int var1 = this.id_case.size();
      int var2 = var1 / 7 * 16;
      int var3 = this.id_native.b_();
      int var4 = this.id_native.c_();
      int var5 = this.id_native.d_();
      rfl_3 var6 = new rfl_3((double)var3, (double)var4, (double)var5, (double)(var3 + 1), (double)(var4 + 1), (double)(var5 + 1))
         .id_class((double)var2)
         .id_break(0.0, (double)this.id_extends.id_try(), 0.0);
      List var7 = this.id_extends.id_class(rhd_3.class, var6);
      if (!var7.isEmpty()) {
         for (rhd_3 var9 : var7) {
            if (this.id_native.id_class(var9.Bs(), (double)var2) && var9.Pf()) {
               var9.id_break(new rLY(rLD.id_throw, 260, 0, true, true));
            }
         }
      }
   }

   private void id_new() {
      Random var1 = this.id_extends.id_int;
      double var2 = (double)(rfU_2.id_class((float)(this.id_class + 35) * 0.1F) / 2.0F + 0.5F);
      var2 = (var2 * var2 + var2) * 0.3F;
      rjU_2 var4 = new rjU_2((double)this.id_native.b_() + 0.5, (double)this.id_native.c_() + 1.5 + var2, (double)this.id_native.d_() + 0.5);

      for (rfH_2 var6 : this.id_case) {
         if (var1.nextInt(50) == 0) {
            float var7 = -0.5F + var1.nextFloat();
            float var8 = -2.0F + var1.nextFloat();
            float var9 = -0.5F + var1.nextFloat();
            rfH_2 var10 = var6.id_byte(this.id_native);
            rjU_2 var11 = new rjU_2((double)var7, (double)var8, (double)var9).id_break((double)var10.b_(), (double)var10.c_(), (double)var10.d_());
            this.id_extends.id_class(rLQ.h, var4.id_break, var4.id_byte, var4.id_protected, var11.id_break, var11.id_byte, var11.id_protected);
         }
      }

      if (this.id_catch != null) {
         rjU_2 var13 = new rjU_2(this.id_catch.rx(), this.id_catch.rH(), this.id_catch.BO());
         float var14 = (-0.5F + var1.nextFloat()) * (3.0F + this.id_catch.PN());
         float var15 = -1.0F + var1.nextFloat() * this.id_catch.Bm();
         float var16 = (-0.5F + var1.nextFloat()) * (3.0F + this.id_catch.PN());
         rjU_2 var17 = new rjU_2((double)var14, (double)var15, (double)var16);
         this.id_extends.id_class(rLQ.h, var13.id_break, var13.id_byte, var13.id_protected, var17.id_break, var17.id_byte, var17.id_protected);
      }
   }

   private iB_2 id_package() {
      List var1 = this.id_extends.id_class(iB_2.class, this.id_final(), var1x -> var1x.ro().equals(this.id_private));
      return var1.size() == 1 ? (iB_2)var1.get(0) : null;
   }

   public boolean id_private() {
      return this.id_throws;
   }

   private rfl_3 id_final() {
      int var1 = this.id_native.b_();
      int var2 = this.id_native.c_();
      int var3 = this.id_native.d_();
      return new rfl_3((double)var1, (double)var2, (double)var3, (double)(var1 + 1), (double)(var2 + 1), (double)(var3 + 1)).id_class(8.0);
   }

   private void id_volatile() {
      if (this.id_private == null) {
         this.id_catch = null;
      } else if (this.id_catch == null || !this.id_catch.ro().equals(this.id_private)) {
         this.id_catch = this.id_package();
         if (this.id_catch == null) {
            this.id_private = null;
         }
      }
   }

   private void id_native() {
      iB_2 var1 = this.id_catch;
      int var2 = this.id_case.size();
      if (var2 < 42) {
         this.id_catch = null;
      } else if (this.id_catch == null && this.id_private != null) {
         this.id_catch = this.id_package();
         this.id_private = null;
      } else if (this.id_catch == null) {
         List var3 = this.id_extends.id_class(iB_2.class, this.id_final(), var0 -> var0 instanceof rEK && var0.Pf());
         if (!var3.isEmpty()) {
            this.id_catch = (iB_2)var3.get(this.id_extends.id_int.nextInt(var3.size()));
         }
      } else if (!this.id_catch.BM() || !this.id_native.id_class(this.id_catch.Bs(), 8.0)) {
         this.id_catch = null;
      }

      if (this.id_catch != null) {
         this.id_extends.id_class((rhd_3)null, this.id_catch.rx(), this.id_catch.re(), this.id_catch.BO(), rqn_3.Pb, rqL_2.BLOCKS, 1.0F, 1.0F);
         this.id_catch.id_break(rye_3.id_package, 4.0F);
      }

      if (var1 != this.id_catch) {
         xc_3 var4 = this.id_abstract();
         this.id_extends.id_class(this.id_native, var4, var4, 2);
      }
   }

   @Override
   public rFy_1 Y_() {
      return new rFy_1(this.id_native, 5, this.Z_());
   }

   @Override
   public rcd_3 Z_() {
      return this.id_class(new rcd_3());
   }
}
