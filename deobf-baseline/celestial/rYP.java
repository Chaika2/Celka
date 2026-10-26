package celestial;

import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rYP {
   private static final Logger id_class = LogManager.getLogger();
   private final rrEm_1 id_break;
   private final an_3 id_byte;
   private final int id_protected;
   private final boolean id_throws;
   private final Consumer<ruS_2<?>> id_case;
   private long id_catch;
   private long id_private;
   private long id_implements;
   private int id_finally;
   private int id_extends;
   private int id_native;
   private rjU_2 id_volatile = rjU_2.id_class;
   private int id_final;
   private int id_package;
   private List<an_3> id_int = Collections.emptyList();
   private boolean id_new;
   private boolean id_continue;

   private void id_byte() {
      rmE_2 var1 = this.id_byte.BQ();
      if (var1.id_class()) {
         this.id_class(new rvX_2(this.id_byte.V(), var1, false));
      }

      if (this.id_byte instanceof iB_2) {
         Set var2 = ((iB_2)this.id_byte).BT().id_class();
         if (!var2.isEmpty()) {
            this.id_class(new rvW_2(this.id_byte.V(), var2));
         }

         var2.clear();
      }
   }

   public rYP(rrEm_1 var1, an_3 var2, int var3, boolean var4, Consumer<ruS_2<?>> var5) {
      this.id_break = var1;
      this.id_case = var5;
      this.id_byte = var2;
      this.id_protected = var3;
      this.id_throws = var4;
      this.id_protected();
      this.id_finally = rfU_2.id_protected((Float)var2.id_throws[15] * 256.0F / 360.0F);
      this.id_extends = rfU_2.id_protected((Float)var2.id_throws[16] * 256.0F / 360.0F);
      this.id_native = rfU_2.id_protected(var2.t() * 256.0F / 360.0F);
      this.id_continue = var2.BL();
   }

   public void id_class() {
      List var1 = this.id_byte.Bh();
      if (!var1.equals(this.id_int)) {
         this.id_int = var1;
         this.id_case.accept(new rFb_1(this.id_byte));
      }

      if (this.id_byte instanceof rsG_2 && this.id_final % 10 == 0) {
         rsG_2 var2 = (rsG_2)this.id_byte;
         rdn_3 var3 = var2.id_final();
         if (var3.id_break() instanceof rxI_2) {
            rrGb_1 var4 = rxI_2.id_break(var3, this.id_break);

            for (rhN_2 var6 : this.id_break.id_continue()) {
               var4.id_class(var6, var3);
               ruS_2 var7 = ((rxI_2)var3.id_break()).id_class(var3, this.id_break, var6);
               if (var7 != null) {
                  var6.id_class.id_class(var7);
               }
            }
         }

         this.id_byte();
      }

      if (this.id_final % this.id_protected == 0 || (Boolean)this.id_byte.id_throws[57] || this.id_byte.BQ().id_class()) {
         if (this.id_byte.Pm()) {
            int var23 = rfU_2.id_protected((Float)this.id_byte.id_throws[15] * 256.0F / 360.0F);
            int var26 = rfU_2.id_protected((Float)this.id_byte.id_throws[16] * 256.0F / 360.0F);
            boolean var28 = Math.abs(var23 - this.id_finally) >= 1 || Math.abs(var26 - this.id_extends) >= 1;
            if (var28) {
               this.id_case.accept(new rvx_3(this.id_byte.V(), (byte)var23, (byte)var26, this.id_byte.BL()));
               this.id_finally = var23;
               this.id_extends = var26;
            }

            this.id_protected();
            this.id_byte();
            this.id_new = true;
         } else {
            this.id_package++;
            int var22 = rfU_2.id_protected((Float)this.id_byte.id_throws[15] * 256.0F / 360.0F);
            int var25 = rfU_2.id_protected((Float)this.id_byte.id_throws[16] * 256.0F / 360.0F);
            rjU_2 var27 = this.id_byte.Ps().id_protected(rvJ_2.id_class(this.id_catch, this.id_private, this.id_implements));
            boolean var29 = var27.id_catch() >= 7.6293945E-6F;
            Object var30 = null;
            boolean var31 = var29 || this.id_final % 60 == 0;
            boolean var8 = Math.abs(var22 - this.id_finally) >= 1 || Math.abs(var25 - this.id_extends) >= 1;
            if (this.id_final > 0 || this.id_byte instanceof rhm_3) {
               long var9 = rvJ_2.id_class(var27.id_break);
               long var11 = rvJ_2.id_class(var27.id_byte);
               long var13 = rvJ_2.id_class(var27.id_protected);
               boolean var15 = var9 < -32768L || var9 > 32767L || var11 < -32768L || var11 > 32767L || var13 < -32768L || var13 > 32767L;
               if (var15 || this.id_package > 400 || this.id_new || this.id_continue != this.id_byte.BL()) {
                  this.id_continue = this.id_byte.BL();
                  this.id_package = 0;
                  var30 = new rvN_2(this.id_byte);
               } else if ((!var31 || !var8) && !(this.id_byte instanceof rhm_3)) {
                  if (var31) {
                     var30 = new rvk_3(this.id_byte.V(), (short)((int)var9), (short)((int)var11), (short)((int)var13), this.id_byte.BL());
                  } else if (var8) {
                     var30 = new rvx_3(this.id_byte.V(), (byte)var22, (byte)var25, this.id_byte.BL());
                  }
               } else {
                  var30 = new rvd_3(this.id_byte.V(), (short)((int)var9), (short)((int)var11), (short)((int)var13), (byte)var22, (byte)var25, this.id_byte.BL());
               }
            }

            if ((this.id_throws || (Boolean)this.id_byte.id_throws[57] || this.id_byte instanceof iB_2 && ((iB_2)this.id_byte).Sy()) && this.id_final > 0) {
               rjU_2 var32 = this.id_byte.rv();
               double var10 = var32.id_implements(this.id_volatile);
               if (var10 > 1.0E-7 || var10 > 0.0 && var32.id_catch() == 0.0) {
                  this.id_volatile = var32;
                  this.id_case.accept(new rvc_3(this.id_byte.V(), this.id_volatile));
               }
            }

            if (var30 != null) {
               this.id_case.accept((ruS_2<?>)var30);
            }

            this.id_byte();
            if (var31) {
               this.id_protected();
            }

            if (var8) {
               this.id_finally = var22;
               this.id_extends = var25;
            }

            this.id_new = false;
         }

         int var24 = rfU_2.id_protected(this.id_byte.t() * 256.0F / 360.0F);
         if (Math.abs(var24 - this.id_native) >= 1) {
            this.id_case.accept(new rvh_3(this.id_byte, (byte)var24));
            this.id_native = var24;
         }

         an_3 var10000 = this.id_byte;
         Boolean var20 = false;
         var10000.id_throws[57] = var20;
      }

      this.id_final++;
      if ((Boolean)this.id_byte.id_throws[25]) {
         this.id_class(new rvc_3(this.id_byte));
         an_3 var33 = this.id_byte;
         Boolean var21 = false;
         var33.id_throws[25] = var21;
      }
   }

   public void id_class(rhN_2 var1) {
      this.id_byte.id_break(var1);
      var1.id_interface(this.id_byte);
   }

   private void id_class(ruS_2<?> var1) {
      this.id_case.accept(var1);
      if (this.id_byte instanceof rhN_2) {
         ((rhN_2)this.id_byte).id_class.id_class(var1);
      }
   }

   public void id_class(Consumer<ruS_2<?>> var1) {
      if ((Boolean)this.id_byte.id_throws[27]) {
         id_class.warn("Fetching packet for removed entity " + this.id_byte);
      }

      ruS_2 var2 = this.id_byte.p_();
      this.id_native = rfU_2.id_protected(this.id_byte.t() * 256.0F / 360.0F);
      var1.accept(var2);
      if (!this.id_byte.BQ().id_protected()) {
         var1.accept(new rvX_2(this.id_byte.V(), this.id_byte.BQ(), true));
      }

      boolean var3 = this.id_throws;
      if (this.id_byte instanceof iB_2) {
         Collection var4 = ((iB_2)this.id_byte).BT().id_break();
         if (!var4.isEmpty()) {
            var1.accept(new rvW_2(this.id_byte.V(), var4));
         }

         if (((iB_2)this.id_byte).Sy()) {
            var3 = true;
         }
      }

      this.id_volatile = this.id_byte.rv();
      if (var3 && !(var2 instanceof rFh_1)) {
         var1.accept(new rvc_3(this.id_byte.V(), this.id_volatile));
      }

      if (this.id_byte instanceof iB_2) {
         ArrayList var10 = Lists.newArrayList();

         for (rXQ var8 : rXQ.values()) {
            rdn_3 var9 = ((iB_2)this.id_byte).id_class(var8);
            if (!var9.id_class()) {
               var10.add(Pair.of(var8, var9.id_implements()));
            }
         }

         if (!var10.isEmpty()) {
            var1.accept(new rvO_2(this.id_byte.V(), var10));
         }
      }

      if (this.id_byte instanceof iB_2 var11) {
         for (rLY var14 : var11.So()) {
            var1.accept(new rvT_2(this.id_byte.V(), var14));
         }
      }

      if (!this.id_byte.Bh().isEmpty()) {
         var1.accept(new rFb_1(this.id_byte));
      }

      if (this.id_byte.Pm()) {
         var1.accept(new rFb_1(this.id_byte.ra()));
      }

      if (this.id_byte instanceof is_3 var12 && var12.z()) {
         var1.accept(new rvA_2(var12, var12.N()));
      }
   }

   public void id_break(rhN_2 var1) {
      this.id_class(var1.id_class::id_class);
      this.id_byte.id_class(var1);
      var1.id_char(this.id_byte);
   }

   public rjU_2 id_break() {
      return rvJ_2.id_class(this.id_catch, this.id_private, this.id_implements);
   }

   private void id_protected() {
      this.id_catch = rvJ_2.id_class(this.id_byte.rx());
      this.id_private = rvJ_2.id_class(this.id_byte.re());
      this.id_implements = rvJ_2.id_class(this.id_byte.BO());
   }
}
