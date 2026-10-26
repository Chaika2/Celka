package celestial;

import celestial.event.PacketEvent;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;

public class gm_3 extends rYB {
   private final Int2ObjectMap<an_3> id_this = new Int2ObjectOpenHashMap();
   private final Aq_1 id_else;
   private final yX_2 id_synchronized;
   private final gv_3 id_return;
   private final gF_2 id_public;
   private final QY id_goto = QY.id_instanceof();
   private final List<cG_2> id_while = Lists.newArrayList();
   private rns_3 id_try = new rns_3();
   private final Map<String, rrGb_1> id_instanceof = Maps.newHashMap();
   private int id_throw;
   private final Object2ObjectArrayMap<rrsC_2, yl_3> id_interface = (Object2ObjectArrayMap)rqR_2.id_class(new Object2ObjectArrayMap(3), (var0) -> {
      var0.put(rYm_1.id_class, new yl_3());
      var0.put(rYm_1.id_break, new yl_3());
      var0.put(rYm_1.id_byte, new yl_3());
   });
   private final AO id_char;
   private boolean id_abstract = false;

   public rYG id_byte(int var1, int var2, int var3) {
      return (rYG)this.id_new().id_break(rVL.n).id_byte(rYl_1.id_break);
   }

   public float id_byte(float var1) {
      float var2 = this.id_protected(var1);
      float var3 = 1.0F - (rfU_2.id_break(var2 * ((float)Math.PI * 2F)) * 2.0F + 0.25F);
      var3 = rfU_2.id_class(var3, 0.0F, 1.0F);
      return var3 * var3 * 0.5F;
   }

   public Iterable<an_3> id_byte() {
      return this.id_this.values();
   }

   public void id_byte(int var1) {
      this.id_throw = var1;
   }

   public void id_byte(an_3 var1) {
      rrME.id_break(var1, this);
      if (rrbb_3.rL()) {
         rrbg_3.id_break(var1, rrbb_3.z());
      }

   }

   public rlQ_2 id_int() {
      return this.id_else.id_extends();
   }

   public gm_3(Aq_1 var1, gv_3 var2, rqM_2<rYB> var3, rRJ var4, int var5, yX_2 var6, boolean var7, long var8) {
      super(var2, var3, var4, true, var7, var8);
      this.id_else = var1;
      this.id_char = new AO(this, var5);
      this.id_return = var2;
      this.id_synchronized = var6;
      this.id_public = gF_2.id_class(var4);
      this.id_break(new rfH_2(8, 64, 8), 0.0F);
      this.id_double();
      this.id_switch();
      if ((Ax_1)this.id_goto.id_class[55] != null && ((Ax_1)this.id_goto.id_class[55]).getClass() == Ax_1.class) {
         QY var10000 = this.id_goto;
         rrJf_1 var14 = new rrJf_1(this.id_goto, this.id_else);
         var10000.id_class[55] = var14;
         rrbl_3.id_class((rrJf_1)((Ax_1)this.id_goto.id_class[55]));
      }

   }

   public String toString() {
      return "ClientLevel";
   }

   public rfH_2 id_this() {
      rfH_2 var1 = new rfH_2(this.id_new.id_class(), this.id_new.id_break(), this.id_new.id_byte());
      if (!this.id_instanceof().id_class(var1)) {
         var1 = this.id_class((rKv_1)rKv_1.MOTION_BLOCKING, (rfH_2)(new rfH_2(this.id_instanceof().id_class(), (double)0.0F, this.id_instanceof().id_break())));
      }

      return var1;
   }

   public void id_class(rfH_2 var1, rqA_2 var2, rqL_2 var3, float var4, float var5, boolean var6) {
      this.id_class((double)var1.b_() + (double)0.5F, (double)var1.c_() + (double)0.5F, (double)var1.d_() + (double)0.5F, var2, var3, var4, var5, var6);
   }

   public rrGb_1 id_class(String var1) {
      return (rrGb_1)this.id_instanceof.get(var1);
   }

   public void id_class(rrGb_1 var1) {
      this.id_instanceof.put(var1.id_throws(), var1);
   }

   public void id_class(rfH_2 var1, xc_3 var2, xc_3 var3, int var4) {
      this.id_synchronized.id_class(this, var1, var2, var3, var4);
   }

   public void id_class(rhd_3 var1, an_3 var2, rqA_2 var3, rqL_2 var4, float var5, float var6) {
      if (var1 == (cb_3)this.id_goto.id_class[57]) {
         this.id_goto.c().id_class(new Nd_1(var3, var4, var2));
      }

   }

   public void id_class(double var1, double var3, double var5, double var7, double var9, double var11, rcd_3 var13) {
      ((Cy_1)this.id_goto.id_class[12]).id_class(new CB(this, var1, var3, var5, var7, var9, var11, (Cy_1)this.id_goto.id_class[12], var13));
   }

   public void id_class(ruS_2<?> var1) {
      this.id_else.id_class(var1);
   }

   public void id_class(rns_3 var1) {
      this.id_try = var1;
   }

   public boolean id_class(rfH_2 var1, xc_3 var2, int var3) {
      this.id_abstract = this.O();
      boolean var4 = super.id_class(var1, var2, var3);
      PacketEvent.id_break(var1, var2, var4);
      this.id_abstract = false;
      return var4;
   }

   public void id_class(double var1, double var3, double var5, rqA_2 var7, rqL_2 var8, float var9, float var10, boolean var11) {
      double var12 = ((Hh_1)this.id_goto.id_class[16]).id_finally().id_break().id_protected(var1, var3, var5);
      Np_1 var14 = new Np_1(var7, var8, var9, var10, var1, var3, var5);
      if (var11 && var12 > (double)100.0F) {
         double var15 = Math.sqrt(var12) / (double)40.0F;
         this.id_goto.c().id_class(var14, (int)(var15 * (double)20.0F));
      } else {
         this.id_goto.c().id_class(var14);
      }

   }

   public rjU_2 id_class(rfH_2 var1, float var2) {
      float var3 = this.id_protected(var2);
      float var4 = rfU_2.id_break(var3 * ((float)Math.PI * 2F)) * 2.0F + 0.5F;
      var4 = rfU_2.id_class(var4, 0.0F, 1.0F);
      rYG var5 = this.id_implements(var1);
      int var6 = var5.id_class();
      float var7 = (float)(var6 >> 16 & 255) / 255.0F;
      float var8 = (float)(var6 >> 8 & 255) / 255.0F;
      float var9 = (float)(var6 & 255) / 255.0F;
      var7 *= var4;
      var8 *= var4;
      var9 *= var4;
      float var10 = this.id_private(var2);
      if (var10 > 0.0F) {
         float var11 = (var7 * 0.3F + var8 * 0.59F + var9 * 0.11F) * 0.6F;
         float var12 = 1.0F - var10 * 0.75F;
         var7 = var7 * var12 + var11 * (1.0F - var12);
         var8 = var8 * var12 + var11 * (1.0F - var12);
         var9 = var9 * var12 + var11 * (1.0F - var12);
      }

      float var18 = this.id_case(var2);
      if (var18 > 0.0F) {
         float var19 = (var7 * 0.3F + var8 * 0.59F + var9 * 0.11F) * 0.2F;
         float var13 = 1.0F - var18 * 0.75F;
         var7 = var7 * var13 + var19 * (1.0F - var13);
         var8 = var8 * var13 + var19 * (1.0F - var13);
         var9 = var9 * var13 + var19 * (1.0F - var13);
      }

      if (this.id_throw > 0) {
         float var20 = (float)this.id_throw - var2;
         if (var20 > 1.0F) {
            var20 = 1.0F;
         }

         var20 *= 0.45F;
         var7 = var7 * (1.0F - var20) + 0.8F * var20;
         var8 = var8 * (1.0F - var20) + 0.8F * var20;
         var9 = var9 * (1.0F - var20) + 1.0F * var20;
      }

      return new rjU_2((double)var7, (double)var8, (double)var9);
   }

   public float id_class(rpr_3 var1, boolean var2) {
      boolean var3 = this.id_break().id_throws();
      boolean var4 = rrbb_3.rs();
      if (!var2) {
         return var3 ? 0.9F : 1.0F;
      } else {
         switch (gZ_2.id_class[var1.ordinal()]) {
            case 1:
               return var3 ? 0.9F : (var4 ? rrdZ.sp : 0.5F);
            case 2:
               return var3 ? 0.9F : 1.0F;
            case 3:
            case 4:
               if (rrbb_3.rs()) {
                  return rrdZ.sT;
               }

               return 0.8F;
            case 5:
            case 6:
               if (rrbb_3.rs()) {
                  return rrdZ.sq;
               }

               return 0.6F;
            default:
               return 1.0F;
         }
      }
   }

   public int id_class(rfH_2 var1, rrsC_2 var2) {
      yl_3 var3 = (yl_3)this.id_interface.get(var2);
      return var3.id_class(var1, () -> this.id_break(var1, var2));
   }

   public void id_class(rfH_2 var1, xc_3 var2, xc_3 var3) {
      this.id_synchronized.id_class(var1, var2, var3);
   }

   public void id_class(int var1, rfH_2 var2, int var3) {
      this.id_synchronized.id_break(var1, var2, var3);
   }

   public void id_class(rhd_3 var1, int var2, rfH_2 var3, int var4) {
      try {
         this.id_synchronized.id_class(var1, var2, var3, var4);
      } catch (Throwable var8) {
         KY var6 = KY.id_class(var8, "Playing level event");
         Ko_1 var7 = var6.id_class("Level event being played");
         var7.id_class("Block coordinates", Ko_1.id_class(var3));
         var7.id_class("Event source", var1);
         var7.id_class("Event type", var2);
         var7.id_class("Event data", var4);
         throw new KU(var6);
      }
   }

   public void id_class(rLx_1 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      this.id_synchronized.id_class(var1, var1.id_protected().id_throws(), var2, var4, var6, var8, var10, var12);
   }

   public void id_class(rLx_1 var1, boolean var2, double var3, double var5, double var7, double var9, double var11, double var13) {
      this.id_synchronized.id_class(var1, var1.id_protected().id_throws() || var2, var3, var5, var7, var9, var11, var13);
   }

   public float id_class(float var1) {
      float var2 = this.id_protected(var1);
      float var3 = 1.0F - (rfU_2.id_break(var2 * ((float)Math.PI * 2F)) * 2.0F + 0.2F);
      var3 = rfU_2.id_class(var3, 0.0F, 1.0F);
      var3 = 1.0F - var3;
      var3 = (float)((double)var3 * ((double)1.0F - (double)(this.id_private(var1) * 5.0F) / (double)16.0F));
      var3 = (float)((double)var3 * ((double)1.0F - (double)(this.id_case(var1) * 5.0F) / (double)16.0F));
      return var3 * 0.8F + 0.2F;
   }

   public void id_class(rfH_2 var1, xc_3 var2) {
      this.id_class(var1, var2, 19);
   }

   public void id_class(an_3 var1, an_3 var2) {
      if (!(Boolean)var2.id_throws[27] && var2.ra() == var1) {
         if (var2 instanceof rhd_3 || this.id_native().id_class(var2)) {
            var2.id_native(var2.rx(), var2.re(), var2.BO());
            Float var9 = (Float)var2.id_throws[15];
            var2.id_throws[17] = var9;
            Float var10 = (Float)var2.id_throws[16];
            var2.id_throws[18] = var10;
            if ((Boolean)var2.id_throws[50]) {
               Integer var11 = (Integer)var2.id_throws[41] + 1;
               var2.id_throws[41] = var11;
               var2.A();
            }

            this.id_case(var2);
            if ((Boolean)var2.id_throws[50]) {
               for(an_3 var4 : var2.Bh()) {
                  this.id_class(var2, var4);
               }
            }
         }
      } else {
         var2.BH();
      }

   }

   public void id_class(int var1, int var2, int var3) {
      Random var4 = new Random();
      boolean var5 = false;
      if (((Ax_1)this.id_goto.id_class[55]).id_native() == rRl_1.CREATIVE) {
         for(rdn_3 var7 : ((cb_3)this.id_goto.id_class[57]).rs()) {
            if (var7.id_break() == xu_3.Ec.id_case()) {
               var5 = true;
               break;
            }
         }
      }

      rfw_3 var8 = new rfw_3();

      for(int var9 = 0; var9 < 667; ++var9) {
         this.id_class(var1, var2, var3, 16, var4, var5, var8);
         this.id_class(var1, var2, var3, 32, var4, var5, var8);
      }

   }

   public void id_class(int var1, int var2, int var3, int var4, Random var5, boolean var6, rfw_3 var7) {
      int var8 = var1 + this.id_int.nextInt(var4) - this.id_int.nextInt(var4);
      int var9 = var2 + this.id_int.nextInt(var4) - this.id_int.nextInt(var4);
      int var10 = var3 + this.id_int.nextInt(var4) - this.id_int.nextInt(var4);
      var7.id_class(var8, var9, var10);
      xc_3 var11 = this.id_byte(var7);
      var11.id_break().id_class(var11, this, var7, var5);
      rXE var12 = this.id_break((rfH_2)var7);
      if (!var12.id_byte()) {
         var12.id_class(this, var7, var5);
         rLx_1 var13 = var12.id_private();
         if (var13 != null && this.id_int.nextInt(10) == 0) {
            boolean var14 = var11.id_protected(this, var7, rpr_3.DOWN);
            rfH_2 var15 = var7.id_break();
            this.id_class(var15, this.id_byte(var15), var13, var14);
         }
      }

      if (var6 && var11.id_class(xu_3.Ec)) {
         this.id_class(rLQ.id_byte, (double)var8 + (double)0.5F, (double)var9 + (double)0.5F, (double)var10 + (double)0.5F, (double)0.0F, (double)0.0F, (double)0.0F);
      }

      if (!var11.id_new(this, var7)) {
         this.id_implements(var7).id_package().ifPresent((var2x) -> {
            if (var2x.id_class(this.id_int)) {
               this.id_class(var2x.id_class(), (double)var7.b_() + this.id_int.nextDouble(), (double)var7.c_() + this.id_int.nextDouble(), (double)var7.d_() + this.id_int.nextDouble(), (double)0.0F, (double)0.0F, (double)0.0F);
            }

         });
      }

   }

   public void id_class(an_3 var1) {
      if (!(var1 instanceof rhd_3) && !this.id_native().id_class(var1)) {
         this.id_case(var1);
      } else {
         var1.id_native(var1.rx(), var1.re(), var1.BO());
         Float var8 = (Float)var1.id_throws[15];
         var1.id_throws[17] = var8;
         Float var9 = (Float)var1.id_throws[16];
         var1.id_throws[18] = var9;
         if ((Boolean)var1.id_throws[50] || var1.id_native()) {
            Integer var10 = (Integer)var1.id_throws[41] + 1;
            var1.id_throws[41] = var10;
            var1.id_this();
         }

         this.id_case(var1);
         if ((Boolean)var1.id_throws[50]) {
            for(an_3 var3 : var1.Bh()) {
               this.id_class(var1, var3);
            }
         }
      }

   }

   public void id_class(int var1, an_3 var2) {
      if (!((rrnb_3)((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).id_finally().id_class(rrnb_3.id_class(var2))).id_byte()) {
         this.id_break(var1, var2);
      }
   }

   public void id_class(int var1) {
      an_3 var2 = (an_3)this.id_this.remove(var1);
      if (var2 != null) {
         var2.PD();
         this.id_catch(var2);
         rrAQ.id_class(var2);
      }

   }

   public void id_class(int var1, cG_2 var2) {
      this.id_break(var1, var2);
      this.id_while.add(var2);
      rrnM_2.id_break(var2);
   }

   public void id_class(int var1, int var2) {
      this.id_interface.forEach((var2x, var3) -> var3.id_class(var1, var2));
   }

   public void id_class(roJ_2 var1) {
      Object var2;
      if (rrxr_3.PR.id_protected()) {
         var2 = (Collection)rrxr_3.id_class(this, rrxr_3.PR);
      } else {
         var2 = this.id_implements;
      }

      ((Collection)var2).addAll(var1.id_volatile().values());
      this.id_char.id_class().id_class(var1.id_private(), false);
   }

   public void id_class(long var1) {
      this.id_return.id_class(var1);
   }

   private void id_class(rfH_2 var1, rLx_1 var2, rjC_2 var3, double var4) {
      this.id_class((double)var1.b_() + var3.id_break(rpB_2.X), (double)var1.b_() + var3.id_byte(rpB_2.X), (double)var1.d_() + var3.id_break(rpB_2.Z), (double)var1.d_() + var3.id_byte(rpB_2.Z), var4, var2);
   }

   public void id_class(BooleanSupplier var1) {
      this.id_instanceof().id_super();
      this.M();
      this.id_char.id_class(var1);
   }

   private void id_class(double var1, double var3, double var5, double var7, double var9, rLx_1 var11) {
      this.id_class(var11, rfU_2.id_protected(this.id_int.nextDouble(), var1, var3), var9, rfU_2.id_protected(this.id_int.nextDouble(), var5, var7), (double)0.0F, (double)0.0F, (double)0.0F);
   }

   private void id_class(rfH_2 var1, xc_3 var2, rLx_1 var3, boolean var4) {
      if (var2.id_volatile().id_byte()) {
         rjC_2 var5 = var2.id_extends(this, var1);
         double var6 = var5.id_byte(rpB_2.Y);
         if (var6 < (double)1.0F) {
            if (var4) {
               this.id_class((double)var1.b_(), (double)(var1.b_() + 1), (double)var1.d_(), (double)(var1.d_() + 1), (double)(var1.c_() + 1) - 0.05, var3);
            }
         } else if (!var2.id_class(rls_3.B)) {
            double var8 = var5.id_break(rpB_2.Y);
            if (var8 > (double)0.0F) {
               this.id_class(var1, var3, var5, (double)var1.c_() + var8 - 0.05);
            } else {
               rfH_2 var10 = var1.id_break();
               xc_3 var11 = this.id_byte(var10);
               rjC_2 var12 = var11.id_extends(this, var10);
               double var13 = var12.id_byte(rpB_2.Y);
               if (var13 < (double)1.0F && var11.id_volatile().id_byte()) {
                  this.id_class(var1, var3, var5, (double)var1.c_() - 0.05);
               }
            }
         }
      }

   }

   public void id_class(rhd_3 var1, double var2, double var4, double var6, rqA_2 var8, rqL_2 var9, float var10, float var11) {
      if (var1 == (cb_3)this.id_goto.id_class[57]) {
         this.id_class(var2, var4, var6, var8, var9, var10, var11, false);
      }

   }

   public Ko_1 id_class(KY var1) {
      Ko_1 var2 = super.id_class(var1);
      var2.id_class("Server brand", () -> ((cb_3)this.id_goto.id_class[57]).id_short());
      var2.id_class("Server type", () -> this.id_goto.id_this() == null ? "Non-integrated multiplayer server" : "Integrated singleplayer server");
      return var2;
   }

   public void id_break(rLx_1 var1, boolean var2, double var3, double var5, double var7, double var9, double var11, double var13) {
      this.id_synchronized.id_class(var1, var1.id_protected().id_throws() || var2, true, var3, var5, var7, var9, var11, var13);
   }

   public void id_break(rLx_1 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      this.id_synchronized.id_class(var1, false, true, var2, var4, var6, var8, var10, var12);
   }

   public gF_2 id_break() {
      return this.id_public;
   }

   private void id_break(int var1, an_3 var2) {
      this.id_class(var1);
      this.id_this.put(var1, var2);
      this.id_native().id_class(rfU_2.id_byte(var2.rx() / (double)16.0F), rfU_2.id_byte(var2.BO() / (double)16.0F), roN_2.id_volatile, true).id_class(var2);
      this.id_break(var2);
   }

   public void id_break(rfH_2 var1, float var2) {
      this.id_new.id_class(var1, var2);
   }

   public int id_break(rfH_2 var1, rrsC_2 var2) {
      int var3 = ((Qw_1)QY.id_instanceof().id_class[20]).id_abstract;
      if (var3 == 0) {
         return var2.getColor(this.id_implements(var1), (double)var1.b_(), (double)var1.d_());
      } else {
         int var4 = (var3 * 2 + 1) * (var3 * 2 + 1);
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         rfR_2 var8 = new rfR_2(var1.b_() - var3, var1.c_(), var1.d_() - var3, var1.b_() + var3, var1.c_(), var1.d_() + var3);

         int var9;
         for(rfw_3 var10 = new rfw_3(); var8.id_class(); var7 += var9 & 255) {
            var10.id_class(var8.id_break(), var8.id_byte(), var8.id_protected());
            var9 = var2.getColor(this.id_implements(var10), (double)var10.b_(), (double)var10.d_());
            var5 += (var9 & 16711680) >> 16;
            var6 += (var9 & '\uff00') >> 8;
         }

         return (var5 / var4 & 255) << 16 | (var6 / var4 & 255) << 8 | var7 / var4 & 255;
      }
   }

   public void id_break(long var1) {
      if (var1 < 0L) {
         var1 = -var1;
         ((rRm_1)this.B().id_class(rRu_1.id_finally)).id_class(false, (rnW_2)null);
      } else {
         ((rRm_1)this.B().id_class(rRu_1.id_finally)).id_class(true, (rnW_2)null);
      }

      this.id_return.id_break(var1);
   }

   public rjU_2 id_break(float var1) {
      float var2 = this.id_protected(var1);
      float var3 = rfU_2.id_break(var2 * ((float)Math.PI * 2F)) * 2.0F + 0.5F;
      var3 = rfU_2.id_class(var3, 0.0F, 1.0F);
      float var4 = 1.0F;
      float var5 = 1.0F;
      float var6 = 1.0F;
      float var7 = this.id_private(var1);
      if (var7 > 0.0F) {
         float var8 = (var4 * 0.3F + var5 * 0.59F + var6 * 0.11F) * 0.6F;
         float var9 = 1.0F - var7 * 0.95F;
         var4 = var4 * var9 + var8 * (1.0F - var9);
         var5 = var5 * var9 + var8 * (1.0F - var9);
         var6 = var6 * var9 + var8 * (1.0F - var9);
      }

      var4 *= var3 * 0.9F + 0.1F;
      var5 *= var3 * 0.9F + 0.1F;
      var6 *= var3 * 0.85F + 0.15F;
      float var15 = this.id_case(var1);
      if (var15 > 0.0F) {
         float var16 = (var4 * 0.3F + var5 * 0.59F + var6 * 0.11F) * 0.2F;
         float var10 = 1.0F - var15 * 0.95F;
         var4 = var4 * var10 + var16 * (1.0F - var10);
         var5 = var5 * var10 + var16 * (1.0F - var10);
         var6 = var6 * var10 + var16 * (1.0F - var10);
      }

      return new rjU_2((double)var4, (double)var5, (double)var6);
   }

   public boolean id_break(int var1, int var2) {
      return true;
   }

   public an_3 id_break(int var1) {
      return (an_3)this.id_this.get(var1);
   }

   public void id_break(roJ_2 var1) {
      ObjectIterator var2 = this.id_this.int2ObjectEntrySet().iterator();

      while(var2.hasNext()) {
         Int2ObjectMap.Entry var3 = (Int2ObjectMap.Entry)var2.next();
         an_3 var4 = (an_3)var3.getValue();
         int var5 = rfU_2.id_byte(var4.rx() / (double)16.0F);
         int var6 = rfU_2.id_byte(var4.BO() / (double)16.0F);
         if (var5 == var1.id_private().id_break && var6 == var1.id_private().id_byte) {
            var1.id_class(var4);
         }
      }

   }

   public void id_break(an_3 var1) {
      rrME.id_class(var1, this);
      if (rrbb_3.rL()) {
         rrbg_3.id_class(var1, rrbb_3.z());
      }

   }

   public void id_break(int var1, rfH_2 var2, int var3) {
      this.id_synchronized.id_class(var1, var2, var3);
   }

   public void id_break(int var1, int var2, int var3) {
      this.id_synchronized.id_class(var1, var2, var3);
   }

   public void id_throws() {
      this.id_interface.forEach((var0, var1) -> var1.id_class());
   }

   private void M() {
      this.id_class(this.id_new.id_throws() + 1L);
      if (this.id_new.id_finally().id_break(rRu_1.id_finally)) {
         this.id_break(this.id_new.id_case() + 1L);
      }

   }

   public rRV<xd_3> id_finally() {
      return rRd_1.id_class();
   }

   public void id_catch() {
      rud_3 var1 = this.id_else.id_class();
      var1.id_class(new rgn_3("multiplayer.status.quitting"));
      rrFK.id_class((rrFD)rrFD.staticFields1658baa549203f63991cdcef51acf497[1], rgP_2.id_byte(""), var1);
   }

   private void id_catch(an_3 var1) {
      var1.K();
      if ((Boolean)var1.id_throws[50]) {
         this.id_throws((Integer)var1.id_throws[51], (Integer)var1.id_throws[53]).id_break(var1);
      }

      this.id_while.remove(var1);
      this.id_byte(var1);
   }

   private boolean O() {
      if ((Ax_1)this.id_goto.id_class[55] instanceof rrJf_1) {
         rrJf_1 var1 = (rrJf_1)((Ax_1)this.id_goto.id_class[55]);
         return var1.id_new();
      } else {
         return false;
      }
   }

   public rRV<rXs_1> id_extends() {
      return rRd_1.id_class();
   }

   // $FF: synthetic method
   public roX_2 id_goto() {
      return this.id_native();
   }

   private void id_case(an_3 var1) {
      if (var1.BE()) {
         int var2 = rfU_2.id_byte(var1.rx() / (double)16.0F);
         int var3 = rfU_2.id_byte(var1.re() / (double)16.0F);
         int var4 = rfU_2.id_byte(var1.BO() / (double)16.0F);
         if (!(Boolean)var1.id_throws[50] || (Integer)var1.id_throws[51] != var2 || (Integer)var1.id_throws[52] != var3 || (Integer)var1.id_throws[53] != var4) {
            if ((Boolean)var1.id_throws[50] && this.id_break((Integer)var1.id_throws[51], (Integer)var1.id_throws[53])) {
               this.id_throws((Integer)var1.id_throws[51], (Integer)var1.id_throws[53]).id_class(var1, (Integer)var1.id_throws[52]);
            }

            if (!var1.rn() && !this.id_break(var2, var4)) {
               if ((Boolean)var1.id_throws[50]) {
                  id_class.warn("Entity {} left loaded chunk area", var1);
               }

               Boolean var9 = false;
               var1.id_throws[50] = var9;
            } else {
               this.id_throws(var2, var4).id_class(var1);
            }
         }
      }

   }

   public int id_case() {
      return this.id_this.size();
   }

   public List<cG_2> id_continue() {
      return this.id_while;
   }

   public float id_else() {
      return this.id_new.id_protected();
   }

   public rWB id_implements() {
      return this.id_else.id_protected();
   }

   public rVm_1 id_new() {
      return this.id_else.id_package();
   }

   public rns_3 id_package() {
      return this.id_try;
   }

   public Int2ObjectMap<an_3> id_return() {
      return this.id_this;
   }

   public int id_super() {
      return this.id_throw;
   }

   // $FF: synthetic method
   public rrGs_1 id_public() {
      return this.id_synchronized();
   }

   public void id_protected() {
      ObjectIterator var1 = this.id_this.int2ObjectEntrySet().iterator();
      cb_3 var2 = (cb_3)this.id_goto.id_class[57];

      while(var1.hasNext()) {
         Int2ObjectMap.Entry var3 = (Int2ObjectMap.Entry)var1.next();
         an_3 var4 = (an_3)var3.getValue();
         if (var4 != var2 && !var4.Pm()) {
            if (!(Boolean)var4.id_throws[27]) {
               this.id_class((Consumer)(this::id_class), (an_3)var4);
            }

            if ((Boolean)var4.id_throws[27]) {
               var1.remove();
               this.id_catch(var4);
            }
         }
      }

      if (var2 != null && !var2.Pm()) {
         if (!(Boolean)var2.id_throws[27]) {
            this.id_class((Consumer)(this::id_class), (an_3)var2);
         }

         if ((Boolean)var2.id_throws[27]) {
            this.id_this.remove(var2.V());
            this.id_catch(var2);
         }
      }

      this.id_transient();
   }

   public void id_private() {
      ObjectIterator var1 = this.id_this.int2ObjectEntrySet().iterator();

      while(var1.hasNext()) {
         Int2ObjectMap.Entry var2 = (Int2ObjectMap.Entry)var1.next();
         an_3 var3 = (an_3)var2.getValue();
         if ((Boolean)var3.id_throws[27]) {
            var1.remove();
            this.id_catch(var3);
         }
      }

   }

   public int id_final() {
      return 0;
   }

   public boolean id_volatile() {
      return this.id_abstract;
   }

   public gv_3 id_synchronized() {
      return this.id_return;
   }

   public AO id_native() {
      return this.id_char;
   }
}
