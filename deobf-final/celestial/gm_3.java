package celestial;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.BooleanSupplier;

public class gm_3 extends rYB {
   private final Int2ObjectMap<an_3> this_ = new Int2ObjectOpenHashMap();
   private final Aq_1 else_;
   private final yX_2 synchronized_;
   private final gv_3 return_;
   private final gF_2 public_;
   private final QY goto_ = QY.instanceof_();
   private final List<cG_2> while_ = Lists.newArrayList();
   private rns_3 try_ = new rns_3();
   private final Map<String, rrGb_1> instanceof_ = Maps.newHashMap();
   private int throw_;
   private final Object2ObjectArrayMap<rrsC_2, yl_3> interface_ = rqR_2.class_(new Object2ObjectArrayMap(3), var0 -> {
      var0.put(rYm_1.class_, new yl_3());
      var0.put(rYm_1.break_, new yl_3());
      var0.put(rYm_1.byte_, new yl_3());
   });
   private final AO char_;
   private boolean abstract_ = false;

   @Override
   public rYG byte_(int var1, int var2, int var3) {
      return this.new_().break_(rVL.n).byte_(rYl_1.break_);
   }

   public float byte_(float var1) {
      float var2 = this.protected_(var1);
      float var3 = 1.0F - (rfU_2.break_(var2 * (float) (Math.PI * 2)) * 2.0F + 0.25F);
      var3 = rfU_2.class_(var3, 0.0F, 1.0F);
      return var3 * var3 * 0.5F;
   }

   public Iterable<an_3> byte_() {
      return this.this_.values();
   }

   @Override
   public void byte_(int var1) {
      this.throw_ = var1;
   }

   public void byte_(an_3 var1) {
      rrME.break_(var1, this);
      if (rrbb_3.rL()) {
         rrbg_3.break_(var1, rrbb_3.z());
      }
   }

   @Override
   public rlQ_2 int_() {
      return this.else_.extends_();
   }

   public gm_3(Aq_1 var1, gv_3 var2, rqM_2<rYB> var3, rRJ var4, int var5, yX_2 var6, boolean var7, long var8) {
      super(var2, var3, var4, true, var7, var8);
      this.else_ = var1;
      this.char_ = new AO(this, var5);
      this.return_ = var2;
      this.synchronized_ = var6;
      this.public_ = gF_2.class_(var4);
      this.break_(new rfH_2(8, 64, 8), 0.0F);
      this.double_();
      this.switch_();
      if ((Ax_1)this.goto_.class_[55] != null && ((Ax_1)this.goto_.class_[55]).getClass() == Ax_1.class) {
         QY var10000 = this.goto_;
         rrJf_1 var14 = new rrJf_1(this.goto_, this.else_);
         var10000.class_[55] = var14;
         rrbl_3.class_((rrJf_1)((Ax_1)this.goto_.class_[55]));
      }
   }

   @Override
   public String toString() {
      return "ClientLevel";
   }

   public rfH_2 this_() {
      rfH_2 var1 = new rfH_2(this.new_.class_(), this.new_.break_(), this.new_.byte_());
      if (!this.instanceof_().class_(var1)) {
         var1 = this.class_(rKv_1.MOTION_BLOCKING, new rfH_2(this.instanceof_().class_(), 0.0, this.instanceof_().break_()));
      }

      return var1;
   }

   public void class_(rfH_2 var1, rqA_2 var2, rqL_2 var3, float var4, float var5, boolean var6) {
      this.class_((double)var1.b_() + 0.5, (double)var1.c_() + 0.5, (double)var1.d_() + 0.5, var2, var3, var4, var5, var6);
   }

   @Override
   public rrGb_1 class_(String var1) {
      return this.instanceof_.get(var1);
   }

   @Override
   public void class_(rrGb_1 var1) {
      this.instanceof_.put(var1.throws_(), var1);
   }

   @Override
   public void class_(rfH_2 var1, xc_3 var2, xc_3 var3, int var4) {
      this.synchronized_.class_(this, var1, var2, var3, var4);
   }

   @Override
   public void class_(rhd_3 var1, an_3 var2, rqA_2 var3, rqL_2 var4, float var5, float var6) {
      if (var1 == (cb_3)this.goto_.class_[57]) {
         this.goto_.c().class_((NQ)(new Nd_1(var3, var4, var2)));
      }
   }

   @Override
   public void class_(double var1, double var3, double var5, double var7, double var9, double var11, rcd_3 var13) {
      ((Cy_1)this.goto_.class_[12]).class_(new CB(this, var1, var3, var5, var7, var9, var11, (Cy_1)this.goto_.class_[12], var13));
   }

   @Override
   public void class_(ruS_2<?> var1) {
      this.else_.class_(var1);
   }

   public void class_(rns_3 var1) {
      this.try_ = var1;
   }

   @Override
   public boolean class_(rfH_2 var1, xc_3 var2, int var3) {
      this.abstract_ = this.O();
      boolean var4 = super.class_(var1, var2, var3);
      PacketEvent.break_(var1, var2, var4);
      this.abstract_ = false;
      return var4;
   }

   @Override
   public void class_(double var1, double var3, double var5, rqA_2 var7, rqL_2 var8, float var9, float var10, boolean var11) {
      double var12 = ((Hh_1)this.goto_.class_[16]).finally_().break_().protected_(var1, var3, var5);
      Np_1 var14 = new Np_1(var7, var8, var9, var10, var1, var3, var5);
      if (var11 && var12 > 100.0) {
         double var15 = Math.sqrt(var12) / 40.0;
         this.goto_.c().class_(var14, (int)(var15 * 20.0));
      } else {
         this.goto_.c().class_(var14);
      }
   }

   public rjU_2 class_(rfH_2 var1, float var2) {
      float var3 = this.protected_(var2);
      float var4 = rfU_2.break_(var3 * (float) (Math.PI * 2)) * 2.0F + 0.5F;
      var4 = rfU_2.class_(var4, 0.0F, 1.0F);
      rYG var5 = this.implements_(var1);
      int var6 = var5.class_();
      float var7 = (float)(var6 >> 16 & 0xFF) / 255.0F;
      float var8 = (float)(var6 >> 8 & 0xFF) / 255.0F;
      float var9 = (float)(var6 & 0xFF) / 255.0F;
      var7 *= var4;
      var8 *= var4;
      var9 *= var4;
      float var10 = this.private_(var2);
      if (var10 > 0.0F) {
         float var11 = (var7 * 0.3F + var8 * 0.59F + var9 * 0.11F) * 0.6F;
         float var12 = 1.0F - var10 * 0.75F;
         var7 = var7 * var12 + var11 * (1.0F - var12);
         var8 = var8 * var12 + var11 * (1.0F - var12);
         var9 = var9 * var12 + var11 * (1.0F - var12);
      }

      float var18 = this.case_(var2);
      if (var18 > 0.0F) {
         float var19 = (var7 * 0.3F + var8 * 0.59F + var9 * 0.11F) * 0.2F;
         float var13 = 1.0F - var18 * 0.75F;
         var7 = var7 * var13 + var19 * (1.0F - var13);
         var8 = var8 * var13 + var19 * (1.0F - var13);
         var9 = var9 * var13 + var19 * (1.0F - var13);
      }

      if (this.throw_ > 0) {
         float var20 = (float)this.throw_ - var2;
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

   @Override
   public float class_(rpr_3 var1, boolean var2) {
      boolean var3 = this.break_().throws_();
      boolean var4 = rrbb_3.rs();
      if (!var2) {
         return var3 ? 0.9F : 1.0F;
      } else {
         switch (var1) {
            case DOWN:
               return var3 ? 0.9F : (var4 ? rrdZ.sp : 0.5F);
            case UP:
               return var3 ? 0.9F : 1.0F;
            case NORTH:
            case SOUTH:
               if (rrbb_3.rs()) {
                  return rrdZ.sT;
               }

               return 0.8F;
            case WEST:
            case EAST:
               if (rrbb_3.rs()) {
                  return rrdZ.sq;
               }

               return 0.6F;
            default:
               return 1.0F;
         }
      }
   }

   @Override
   public int class_(rfH_2 var1, rrsC_2 var2) {
      yl_3 var3 = (yl_3)this.interface_.get(var2);
      return var3.class_(var1, () -> this.break_(var1, var2));
   }

   @Override
   public void class_(rfH_2 var1, xc_3 var2, xc_3 var3) {
      this.synchronized_.class_(var1, var2, var3);
   }

   @Override
   public void class_(int var1, rfH_2 var2, int var3) {
      this.synchronized_.break_(var1, var2, var3);
   }

   @Override
   public void class_(rhd_3 var1, int var2, rfH_2 var3, int var4) {
      try {
         this.synchronized_.class_(var1, var2, var3, var4);
      } catch (Throwable var8) {
         KY var6 = KY.class_(var8, "Playing level event");
         Ko_1 var7 = var6.class_("Level event being played");
         var7.class_("Block coordinates", Ko_1.class_(var3));
         var7.class_("Event source", var1);
         var7.class_("Event type", var2);
         var7.class_("Event data", var4);
         throw new KU(var6);
      }
   }

   @Override
   public void class_(rLx_1 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      this.synchronized_.class_(var1, var1.protected_().throws_(), var2, var4, var6, var8, var10, var12);
   }

   @Override
   public void class_(rLx_1 var1, boolean var2, double var3, double var5, double var7, double var9, double var11, double var13) {
      this.synchronized_.class_(var1, var1.protected_().throws_() || var2, var3, var5, var7, var9, var11, var13);
   }

   public float class_(float var1) {
      float var2 = this.protected_(var1);
      float var3 = 1.0F - (rfU_2.break_(var2 * (float) (Math.PI * 2)) * 2.0F + 0.2F);
      var3 = rfU_2.class_(var3, 0.0F, 1.0F);
      var3 = 1.0F - var3;
      var3 = (float)((double)var3 * (1.0 - (double)(this.private_(var1) * 5.0F) / 16.0));
      var3 = (float)((double)var3 * (1.0 - (double)(this.case_(var1) * 5.0F) / 16.0));
      return var3 * 0.8F + 0.2F;
   }

   public void class_(rfH_2 var1, xc_3 var2) {
      this.class_(var1, var2, 19);
   }

   public void class_(an_3 var1, an_3 var2) {
      if ((Boolean)var2.throws_[27] || var2.ra() != var1) {
         var2.BH();
      } else if (var2 instanceof rhd_3 || this.native_().class_(var2)) {
         var2.native_(var2.rx(), var2.re(), var2.BO());
         Float var9 = (Float)var2.throws_[15];
         var2.throws_[17] = var9;
         Float var10 = (Float)var2.throws_[16];
         var2.throws_[18] = var10;
         if ((Boolean)var2.throws_[50]) {
            Integer var11 = (Integer)var2.throws_[41] + 1;
            var2.throws_[41] = var11;
            var2.A();
         }

         this.case_(var2);
         if ((Boolean)var2.throws_[50]) {
            for (an_3 var4 : var2.Bh()) {
               this.class_(var2, var4);
            }
         }
      }
   }

   public void class_(int var1, int var2, int var3) {
      Random var4 = new Random();
      boolean var5 = false;
      if (((Ax_1)this.goto_.class_[55]).native_() == rRl_1.CREATIVE) {
         for (rdn_3 var7 : ((cb_3)this.goto_.class_[57]).rs()) {
            if (var7.break_() == xu_3.Ec.case_()) {
               var5 = true;
               break;
            }
         }
      }

      rfw_3 var8 = new rfw_3();

      for (int var9 = 0; var9 < 667; var9++) {
         this.class_(var1, var2, var3, 16, var4, var5, var8);
         this.class_(var1, var2, var3, 32, var4, var5, var8);
      }
   }

   public void class_(int var1, int var2, int var3, int var4, Random var5, boolean var6, rfw_3 var7) {
      int var8 = var1 + this.int_.nextInt(var4) - this.int_.nextInt(var4);
      int var9 = var2 + this.int_.nextInt(var4) - this.int_.nextInt(var4);
      int var10 = var3 + this.int_.nextInt(var4) - this.int_.nextInt(var4);
      var7.class_(var8, var9, var10);
      xc_3 var11 = this.byte_(var7);
      var11.break_().class_(var11, this, var7, var5);
      rXE var12 = this.break_(var7);
      if (!var12.byte_()) {
         var12.class_(this, var7, var5);
         rLx_1 var13 = var12.private_();
         if (var13 != null && this.int_.nextInt(10) == 0) {
            boolean var14 = var11.protected_(this, var7, rpr_3.DOWN);
            rfH_2 var15 = var7.break_();
            this.class_(var15, this.byte_(var15), var13, var14);
         }
      }

      if (var6 && var11.class_(xu_3.Ec)) {
         this.class_(rLQ.byte_, (double)var8 + 0.5, (double)var9 + 0.5, (double)var10 + 0.5, 0.0, 0.0, 0.0);
      }

      if (!var11.new_(this, var7)) {
         this.implements_(var7)
            .package_()
            .ifPresent(
               var2x -> {
                  if (var2x.class_(this.int_)) {
                     this.class_(
                        var2x.class_(),
                        (double)var7.b_() + this.int_.nextDouble(),
                        (double)var7.c_() + this.int_.nextDouble(),
                        (double)var7.d_() + this.int_.nextDouble(),
                        0.0,
                        0.0,
                        0.0
                     );
                  }
               }
            );
      }
   }

   public void class_(an_3 var1) {
      if (!(var1 instanceof rhd_3) && !this.native_().class_(var1)) {
         this.case_(var1);
      } else {
         var1.native_(var1.rx(), var1.re(), var1.BO());
         Float var8 = (Float)var1.throws_[15];
         var1.throws_[17] = var8;
         Float var9 = (Float)var1.throws_[16];
         var1.throws_[18] = var9;
         if ((Boolean)var1.throws_[50] || var1.native_()) {
            Integer var10 = (Integer)var1.throws_[41] + 1;
            var1.throws_[41] = var10;
            var1.this_();
         }

         this.case_(var1);
         if ((Boolean)var1.throws_[50]) {
            for (an_3 var3 : var1.Bh()) {
               this.class_(var1, var3);
            }
         }
      }
   }

   public void class_(int var1, an_3 var2) {
      if (!((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).finally_().class_(rrnb_3.class_(var2)).byte_()) {
         this.break_(var1, var2);
      }
   }

   public void class_(int var1) {
      an_3 var2 = (an_3)this.this_.remove(var1);
      if (var2 != null) {
         var2.PD();
         this.catch_(var2);
         rrAQ.class_(var2);
      }
   }

   public void class_(int var1, cG_2 var2) {
      this.break_(var1, var2);
      this.while_.add(var2);
      rrnM_2.break_(var2);
   }

   public void class_(int var1, int var2) {
      this.interface_.forEach((var2x, var3) -> var3.class_(var1, var2));
   }

   public void class_(roJ_2 var1) {
      Object var2;
      if (rrxr_3.PR.protected_()) {
         var2 = (Collection)rrxr_3.class_(this, rrxr_3.PR);
      } else {
         var2 = this.implements_;
      }

      var2.addAll(var1.volatile_().values());
      this.char_.class_().class_(var1.private_(), false);
   }

   public void class_(long var1) {
      this.return_.class_(var1);
   }

   private void class_(rfH_2 var1, rLx_1 var2, rjC_2 var3, double var4) {
      this.class_(
         (double)var1.b_() + var3.break_(rpB_2.X),
         (double)var1.b_() + var3.byte_(rpB_2.X),
         (double)var1.d_() + var3.break_(rpB_2.Z),
         (double)var1.d_() + var3.byte_(rpB_2.Z),
         var4,
         var2
      );
   }

   public void class_(BooleanSupplier var1) {
      this.instanceof_().super_();
      this.M();
      this.char_.class_(var1);
   }

   private void class_(double var1, double var3, double var5, double var7, double var9, rLx_1 var11) {
      this.class_(var11, rfU_2.protected_(this.int_.nextDouble(), var1, var3), var9, rfU_2.protected_(this.int_.nextDouble(), var5, var7), 0.0, 0.0, 0.0);
   }

   private void class_(rfH_2 var1, xc_3 var2, rLx_1 var3, boolean var4) {
      if (var2.volatile_().byte_()) {
         rjC_2 var5 = var2.extends_(this, var1);
         double var6 = var5.byte_(rpB_2.Y);
         if (var6 < 1.0) {
            if (var4) {
               this.class_((double)var1.b_(), (double)(var1.b_() + 1), (double)var1.d_(), (double)(var1.d_() + 1), (double)(var1.c_() + 1) - 0.05, var3);
            }
         } else if (!var2.class_(rls_3.B)) {
            double var8 = var5.break_(rpB_2.Y);
            if (var8 > 0.0) {
               this.class_(var1, var3, var5, (double)var1.c_() + var8 - 0.05);
            } else {
               rfH_2 var10 = var1.break_();
               xc_3 var11 = this.byte_(var10);
               rjC_2 var12 = var11.extends_(this, var10);
               double var13 = var12.byte_(rpB_2.Y);
               if (var13 < 1.0 && var11.volatile_().byte_()) {
                  this.class_(var1, var3, var5, (double)var1.c_() - 0.05);
               }
            }
         }
      }
   }

   @Override
   public void class_(rhd_3 var1, double var2, double var4, double var6, rqA_2 var8, rqL_2 var9, float var10, float var11) {
      if (var1 == (cb_3)this.goto_.class_[57]) {
         this.class_(var2, var4, var6, var8, var9, var10, var11, false);
      }
   }

   @Override
   public Ko_1 class_(KY var1) {
      Ko_1 var2 = super.class_(var1);
      var2.class_("Server brand", () -> ((cb_3)this.goto_.class_[57]).short_());
      var2.class_("Server type", () -> this.goto_.this_() == null ? "Non-integrated multiplayer server" : "Integrated singleplayer server");
      return var2;
   }

   @Override
   public void break_(rLx_1 var1, boolean var2, double var3, double var5, double var7, double var9, double var11, double var13) {
      this.synchronized_.class_(var1, var1.protected_().throws_() || var2, true, var3, var5, var7, var9, var11, var13);
   }

   @Override
   public void break_(rLx_1 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      this.synchronized_.class_(var1, false, true, var2, var4, var6, var8, var10, var12);
   }

   public gF_2 break_() {
      return this.public_;
   }

   private void break_(int var1, an_3 var2) {
      this.class_(var1);
      this.this_.put(var1, var2);
      this.native_().class_(rfU_2.byte_(var2.rx() / 16.0), rfU_2.byte_(var2.BO() / 16.0), roN_2.volatile_, true).class_(var2);
      this.break_(var2);
   }

   public void break_(rfH_2 var1, float var2) {
      this.new_.class_(var1, var2);
   }

   public int break_(rfH_2 var1, rrsC_2 var2) {
      int var3 = ((Qw_1)QY.instanceof_().class_[20]).abstract_;
      if (var3 == 0) {
         return var2.getColor(this.implements_(var1), (double)var1.b_(), (double)var1.d_());
      } else {
         int var4 = (var3 * 2 + 1) * (var3 * 2 + 1);
         int var5 = 0;
         int var6 = 0;
         int var7 = 0;
         rfR_2 var8 = new rfR_2(var1.b_() - var3, var1.c_(), var1.d_() - var3, var1.b_() + var3, var1.c_(), var1.d_() + var3);
         rfw_3 var10 = new rfw_3();

         while (var8.class_()) {
            var10.class_(var8.break_(), var8.byte_(), var8.protected_());
            int var9 = var2.getColor(this.implements_(var10), (double)var10.b_(), (double)var10.d_());
            var5 += (var9 & 0xFF0000) >> 16;
            var6 += (var9 & 0xFF00) >> 8;
            var7 += var9 & 0xFF;
         }

         return (var5 / var4 & 0xFF) << 16 | (var6 / var4 & 0xFF) << 8 | var7 / var4 & 0xFF;
      }
   }

   public void break_(long var1) {
      if (var1 < 0L) {
         var1 = -var1;
         this.B().class_(rRu_1.finally_).class_(false, (rnW_2)null);
      } else {
         this.B().class_(rRu_1.finally_).class_(true, (rnW_2)null);
      }

      this.return_.break_(var1);
   }

   public rjU_2 break_(float var1) {
      float var2 = this.protected_(var1);
      float var3 = rfU_2.break_(var2 * (float) (Math.PI * 2)) * 2.0F + 0.5F;
      var3 = rfU_2.class_(var3, 0.0F, 1.0F);
      float var4 = 1.0F;
      float var5 = 1.0F;
      float var6 = 1.0F;
      float var7 = this.private_(var1);
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
      float var15 = this.case_(var1);
      if (var15 > 0.0F) {
         float var16 = (var4 * 0.3F + var5 * 0.59F + var6 * 0.11F) * 0.2F;
         float var10 = 1.0F - var15 * 0.95F;
         var4 = var4 * var10 + var16 * (1.0F - var10);
         var5 = var5 * var10 + var16 * (1.0F - var10);
         var6 = var6 * var10 + var16 * (1.0F - var10);
      }

      return new rjU_2((double)var4, (double)var5, (double)var6);
   }

   @Override
   public boolean break_(int var1, int var2) {
      return true;
   }

   @Override
   public an_3 break_(int var1) {
      return (an_3)this.this_.get(var1);
   }

   public void break_(roJ_2 var1) {
      ObjectIterator var2 = this.this_.int2ObjectEntrySet().iterator();

      while (var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         an_3 var4 = (an_3)var3.getValue();
         int var5 = rfU_2.byte_(var4.rx() / 16.0);
         int var6 = rfU_2.byte_(var4.BO() / 16.0);
         if (var5 == var1.private_().break_ && var6 == var1.private_().byte_) {
            var1.class_(var4);
         }
      }
   }

   public void break_(an_3 var1) {
      rrME.class_(var1, this);
      if (rrbb_3.rL()) {
         rrbg_3.class_(var1, rrbb_3.z());
      }
   }

   @Override
   public void break_(int var1, rfH_2 var2, int var3) {
      this.synchronized_.class_(var1, var2, var3);
   }

   public void break_(int var1, int var2, int var3) {
      this.synchronized_.class_(var1, var2, var3);
   }

   public void throws_() {
      this.interface_.forEach((var0, var1) -> var1.class_());
   }

   private void M() {
      this.class_(this.new_.throws_() + 1L);
      if (this.new_.finally_().break_(rRu_1.finally_)) {
         this.break_(this.new_.case_() + 1L);
      }
   }

   @Override
   public rRV<xd_3> finally_() {
      return rRd_1.class_();
   }

   @Override
   public void catch_() {
      rud_3 var1 = this.else_.class_();
      var1.class_(new rgn_3("multiplayer.status.quitting"));
      rrFK.class_((rrFD)rrFD.staticFields1658baa549203f63991cdcef51acf497[1], rgP_2.byte_(""), var1);
   }

   private void catch_(an_3 var1) {
      var1.K();
      if ((Boolean)var1.throws_[50]) {
         this.throws_((Integer)var1.throws_[51], (Integer)var1.throws_[53]).break_(var1);
      }

      this.while_.remove(var1);
      this.byte_(var1);
   }

   private boolean O() {
      return (Ax_1)this.goto_.class_[55] instanceof rrJf_1 var1 ? var1.new_() : false;
   }

   @Override
   public rRV<rXs_1> extends_() {
      return rRd_1.class_();
   }

   private void case_(an_3 var1) {
      if (var1.BE()) {
         int var2 = rfU_2.byte_(var1.rx() / 16.0);
         int var3 = rfU_2.byte_(var1.re() / 16.0);
         int var4 = rfU_2.byte_(var1.BO() / 16.0);
         if (!(Boolean)var1.throws_[50] || (Integer)var1.throws_[51] != var2 || (Integer)var1.throws_[52] != var3 || (Integer)var1.throws_[53] != var4) {
            if ((Boolean)var1.throws_[50] && this.break_((Integer)var1.throws_[51], (Integer)var1.throws_[53])) {
               this.throws_((Integer)var1.throws_[51], (Integer)var1.throws_[53]).class_(var1, (Integer)var1.throws_[52]);
            }

            if (!var1.rn() && !this.break_(var2, var4)) {
               if ((Boolean)var1.throws_[50]) {
                  class_.warn("Entity {} left loaded chunk area", var1);
               }

               Boolean var9 = false;
               var1.throws_[50] = var9;
            } else {
               this.throws_(var2, var4).class_(var1);
            }
         }
      }
   }

   public int case_() {
      return this.this_.size();
   }

   @Override
   public List<cG_2> continue_() {
      return this.while_;
   }

   public float else_() {
      return this.new_.protected_();
   }

   @Override
   public rWB implements_() {
      return this.else_.protected_();
   }

   @Override
   public rVm_1 new_() {
      return this.else_.package_();
   }

   @Override
   public rns_3 package_() {
      return this.try_;
   }

   public Int2ObjectMap<an_3> return_() {
      return this.this_;
   }

   public int super_() {
      return this.throw_;
   }

   public void protected_() {
      ObjectIterator var1 = this.this_.int2ObjectEntrySet().iterator();
      cb_3 var2 = (cb_3)this.goto_.class_[57];

      while (var1.hasNext()) {
         Entry var3 = (Entry)var1.next();
         an_3 var4 = (an_3)var3.getValue();
         if (var4 != var2 && !var4.Pm()) {
            if (!(Boolean)var4.throws_[27]) {
               this.class_(this::class_, var4);
            }

            if ((Boolean)var4.throws_[27]) {
               var1.remove();
               this.catch_(var4);
            }
         }
      }

      if (var2 != null && !var2.Pm()) {
         if (!(Boolean)var2.throws_[27]) {
            this.class_(this::class_, var2);
         }

         if ((Boolean)var2.throws_[27]) {
            this.this_.remove(var2.V());
            this.catch_(var2);
         }
      }

      this.transient_();
   }

   public void private_() {
      ObjectIterator var1 = this.this_.int2ObjectEntrySet().iterator();

      while (var1.hasNext()) {
         Entry var2 = (Entry)var1.next();
         an_3 var3 = (an_3)var2.getValue();
         if ((Boolean)var3.throws_[27]) {
            var1.remove();
            this.catch_(var3);
         }
      }
   }

   @Override
   public int final_() {
      return 0;
   }

   public boolean volatile_() {
      return this.abstract_;
   }

   public gv_3 synchronized_() {
      return this.return_;
   }

   public AO native_() {
      return this.char_;
   }
}
