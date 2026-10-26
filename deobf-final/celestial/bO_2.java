package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Predicate;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bO_2 extends bq_3 implements D, rN_2 {
   private static boolean[] catch_;
   private static double[] private_;
   public Object[] break_;
   private static long[] implements_;
   private static String[] finally_;
   private static float[] extends_;
   public static Object[] throws_;
   private static short[] native_;
   private static byte[] volatile_;

   @Override
   public boolean byte_() {
      this.this_();
      return !this.break_[11] || (Supplier)this.break_[10] != null && !((Supplier)this.break_[10]).get() ? catch_[16] : catch_[15];
   }

   private void int_() {
      this.this_();
      Boolean var5 = false;
      this.break_[14] = var5;
      Boolean var6 = false;
      this.break_[15] = var6;
      Object var7 = null;
      this.break_[9] = var7;
      if (!((List)this.break_[6]).isEmpty()) {
         ((List)this.break_[6]).clear();
      }
   }

   public bO_2(C_class var1) {
      super(var1);
      this.this_();
      bX_2 var6 = new bX_2();
      this.break_[5] = var6;
      ArrayList var7 = new ArrayList();
      this.break_[6] = var7;
      rrfw_3 var8 = new rrfw_3();
      this.break_[7] = var8;
      var1.s().class_(this);
   }

   static {
      ntfClinit();
   }

   private void this_() {
      if (this.break_ == null) {
         this.break_ = new Object[17];
         Object[] var1 = this.break_;
         var1[11] = false;
         var1[12] = false;
         var1[13] = false;
         var1[14] = false;
         var1[15] = false;
         var1[16] = 0L;
      }
   }

   public boolean class_(xc_3 var1) {
      this.this_();
      return !var1.catch_() && this.break_[13] ? true : catch_[23];
   }

   private boolean class_(rdn_3 var1) {
      return var1.break_() == rdy_3.hr && !((rhz_3)((Ps_1)this.case_[1]).catch_().implements_[1]).case_(var1) ? false : catch_[25];
   }

   @Override
   public String class_() {
      return "Creeper Farming";
   }

   private void class_(List<iB_2> var1) {
      this.this_();
      cb_3 var2 = ((Ps_1)this.case_[1]).catch_();
      PE var3 = ((Ps_1)this.case_[1]).native_();
      if (!var1.isEmpty() && (float)(System.currentTimeMillis() - (Long)this.break_[16]) >= 500.0F && rrfo_3.protected_()) {
         boolean var4 = ((rrIk_1)this.break_[1]).class_();
         boolean var5 = false;

         for (iB_2 var7 : var1) {
            if (var2.int_(var7) < 36.0) {
               var3.class_(var2, var7, true);
               var5 = true;
               if (!var4) {
                  break;
               }
            }
         }

         if (var5) {
            Long var12 = System.currentTimeMillis();
            this.break_[16] = var12;
         }
      }
   }

   @Override
   public void class_(rrLz_1 var1) {
      this.this_();
      if ((Boolean)this.break_[15]
         && ((Ps_1)this.case_[1]).catch_().BL()
         && (rrfq_3)rrfp_3.class_[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]) {
         var1.class_(var1.byte_());
      }
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-48, 1, 104, -97, -63, 24, 114, -31}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void class_(rrAM var1) {
      this.this_();
      ((rrfw_3)this.break_[7]).class_();
   }

   @Override
   public void class_(rY_2 var1, Supplier<Boolean> var2, rrIk_1 var3, rrIk_1 var4, rrIk_1 var5, rrIk_1 var6, rrIm_1 var7) {
      this.this_();
      if (var1 == null) {
         throw new IllegalArgumentException("Selection cannot be null");
      } else {
         Boolean var12 = true;
         this.break_[11] = var12;
         this.break_[10] = var2;
         this.class_(var1);
         this.break_[0] = var3;
         this.break_[1] = var4;
         this.break_[2] = var5;
         this.break_[3] = var6;
         this.break_[4] = var7;
         ((rrfw_3)this.break_[7]).class_();
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8157415545062725845L;
   }

   @Override
   public void class_(q_1 var1) {
      this.this_();
      if (var1.class_() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         if (!this.byte_()) {
            this.int_();
            return;
         }

         Boolean var6 = false;
         this.break_[15] = var6;
         if ((rrIk_1)this.break_[0] != null && ((rrIk_1)this.break_[0]).class_() && this.else_()) {
            ((C_class)this.case_[0]).int_().class_((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[6], true);
            Boolean var7 = true;
            this.break_[15] = var7;
         }
      }
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -846337967;
   }

   @Override
   public void class_(rrAS var1) {
      this.this_();
      if ((Boolean)this.break_[15]) {
         var1.class_(0);
      }
   }

   public void class_(rY_2 var1) {
      this.this_();
      if (var1 == null) {
         throw new IllegalArgumentException("Selection cannot be null");
      } else {
         this.break_[8] = var1;
         this.implements_();
      }
   }

   @Override
   public void class_(rrLX var1) {
      this.this_();
      if ((Boolean)this.break_[15] && (rrfq_3)rrfp_3.class_[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]) {
         var1.break_(false);
      }
   }

   public static List<iB_2> class_(Ps_1 var0, Predicate<iB_2> var1) {
      ArrayList var2 = new ArrayList();

      for (an_3 var5 : var0.final_()) {
         if (var5 instanceof iB_2) {
            iB_2 var6 = (iB_2)var5;
            if (var1.test(var6)) {
               var2.add(var6);
            }
         }
      }

      return var2;
   }

   @Override
   public rn_3 class_(boolean var1, boolean var2) {
      this.this_();
      Boolean var22 = var1;
      this.break_[13] = var22;
      cb_3 var3 = ((Ps_1)this.case_[1]).catch_();
      rYB var4 = ((Ps_1)this.case_[1]).case_();
      rfl_3 var5 = ((rY_2)this.break_[8]).break_();
      if ((Boolean)this.break_[13]) {
         Float var23 = 0.0F;
         var3.throws_[16] = var23;
      }

      CreeperFarm var6 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[0]).private_().i();
      String var7 = rrfu_3.class_((Module)var6);
      List var8 = class_((Ps_1)this.case_[1], var0 -> var0.BC().throws_().private_() && var0.Pu() ? true : catch_[38]);
      ((List)this.break_[6]).clear();
      ((List)this.break_[6]).addAll(var8);
      Map var9 = this.break_(
         (Ps_1)this.case_[1],
         var2x -> {
            if (((Set)throws_[2]).contains(var2x.protected_().break_()) && var5.byte_(var2x.rN())) {
               rfH_2 var3x = var2x.Bs();
               return EF.private_(var4.byte_(var3x)) == (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[0]
                     && EF.private_(var4.byte_(var3x.final_())) == (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[0]
                  ? true
                  : catch_[36];
            } else {
               return catch_[34];
            }
         }
      );
      boolean var10 = !((List)this.break_[6]).isEmpty() ? true : catch_[1];
      boolean var11 = !var9.isEmpty() ? true : catch_[3];
      ArrayList var12 = null;
      if (var10) {
         ((List)this.break_[6]).sort((bh_3)throws_[0]);
         var12 = new ArrayList();

         for (iB_2 var14 : (List)this.break_[6]) {
            if (var14.int_(var3) <= 100.0 && var14.while_(var3)) {
               var12.add(var14);
            }
         }

         var12.sort((bk_3)throws_[1]);
         this.class_(var12);
      }

      Boolean var24 = var12 != null && !var12.isEmpty() ? true : catch_[5];
      this.break_[14] = var24;
      if (((rrIk_1)this.break_[3]).class_()
         && ((rrfw_3)this.break_[7]).class_((double)(((rrIm_1)this.break_[4]).byte_() * 1000.0F))
         && !(Boolean)this.break_[14]
         && !var11) {
         PI var27 = ((C_class)this.case_[0]).native_().protected_();
         if (var27 != null) {
            Pf_1 var30 = var27.class_();
            if (var30.break_()) {
               var3.case_("/hub");
               ((C_class)this.case_[0]).default_().class_(new Sl_1(var30.class_() + var27.break_(), 120));
               rrfu_3.byte_(var7 + "Перезаходим на сервер через 6 секунд, чтобы все враждебные существа исчезли");
               ((rrfw_3)this.break_[7]).class_();
            }
         }
      }

      if (!(Boolean)this.break_[13] && var11 && !(Boolean)this.break_[14]) {
         ArrayList var29 = new ArrayList();

         for (Entry var15 : var9.entrySet()) {
            rfH_2 var16 = (rfH_2)var15.getKey();
            rsE_2 var17 = (rsE_2)var15.getValue();
            if (this.class_(var17.protected_())) {
               var29.add(new rS_2(var16));
            }
         }

         if (var29.isEmpty()) {
            this.protected_();
            if (((rrIk_1)this.break_[2]).class_()) {
               String var33 = "У вас нет места в инвентаре, вы отключены от сервера";
               rrjv_3.class_(var6.case_(), new rgN_2(var33));
               MinecraftAccessor.a_(var7 + var33, false);
            } else {
               String var34 = var7 + "У вас нет места в инвентаре, процесс остановлен";
               rrfu_3.byte_(var34);
               MinecraftAccessor.a_(var34, false);
            }

            var6.super_();
            return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[1]);
         } else {
            rs_3 var32 = new rs_3(var29.toArray(rP_2[]::new));
            return new rn_3(var32, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[4]);
         }
      } else {
         if (!(Boolean)this.break_[13] && var10) {
            rP_2 var28 = ((bX_2)this.break_[5])
               .class_((Ps_1)this.case_[1], var5, ((List)this.break_[6]).stream().filter(var1x -> var5.byte_(var1x.rN())).toList(), var12);
            if (var28 != null) {
               return new rn_3(var28, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[4]);
            }
         }

         if ((rS_2)this.break_[9] == null || (Boolean)this.break_[12]) {
            rS_2 var25 = ((bX_2)this.break_[5]).class_((Ps_1)this.case_[1], var5, 100, () -> rrfu_3.byte_(var7 + "Не удалось найти подходящее место"));
            this.break_[9] = var25;
            Boolean var26 = false;
            this.break_[12] = var26;
         }

         if (this.super_()) {
            this.implements_();
         }

         return new rn_3((rS_2)this.break_[9], (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[0]);
      }
   }

   @Override
   public void class_(rrLx_1 var1) {
      this.this_();
      if ((Boolean)this.break_[15] && (rrfq_3)rrfp_3.class_[1] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[2]) {
         var1.break_(true);
      }
   }

   public Map<rfH_2, rsE_2> break_(Ps_1 var1, Predicate<rsE_2> var2) {
      Iterable var3 = var1.final_();
      HashMap var4 = new HashMap();

      for (an_3 var6 : var3) {
         if (var6 instanceof rsE_2) {
            rsE_2 var7 = (rsE_2)var6;
            if (var2.test(var7)) {
               var4.put(var6.Bs(), var7);
            }
         }
      }

      return var4;
   }

   private static void finally_() {
      implements_ = new long[1];
   }

   private static void extends_() {
      private_ = new double[]{100.0, 36.0};
   }

   private static void continue_() {
      native_ = new short[]{
         5,
         6,
         7,
         13,
         1,
         1,
         8,
         13,
         16,
         0,
         1,
         6,
         6,
         1,
         6,
         6,
         0,
         6,
         1,
         14,
         3,
         7,
         4,
         14,
         0,
         0,
         7,
         13,
         14,
         2,
         1,
         4,
         13,
         5,
         1,
         6,
         4,
         9,
         12,
         5,
         1,
         9,
         12,
         9,
         0,
         0,
         15,
         0,
         0,
         0,
         6,
         15,
         15,
         1,
         1,
         2,
         15,
         1,
         2,
         15,
         1,
         2,
         15,
         7,
         11,
         10,
         10,
         11,
         10,
         0,
         1,
         2,
         3,
         4,
         7,
         11,
         1,
         1,
         16,
         1,
         16,
         13,
         1,
         1,
         1,
         1,
         9,
         1,
         1,
         9,
         12,
         8,
         14,
         15,
         9,
         6,
         6,
         14,
         2,
         0,
         0
      };
   }

   private boolean else_() {
      return !((Ps_1)this.case_[1]).case_().byte_(((Ps_1)this.case_[1]).extends_()).catch_() ? true : catch_[27];
   }

   public void implements_() {
      this.this_();
      Boolean var5 = true;
      this.break_[12] = var5;
   }

   private static void new_() {
      catch_ = new boolean[]{
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         false,
         false,
         false,
         true,
         true,
         true,
         false,
         false,
         true,
         false,
         true,
         false,
         false,
         true,
         true,
         true,
         false,
         false,
         true,
         true,
         false,
         true,
         true,
         false,
         true,
         false,
         false,
         false,
         true,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         false,
         false,
         false
      };
   }

   private static void package_() {
      Object[] var0 = new Object[]{new bh_3(), new bk_3(), Set.of((rdb_3)rdy_3.hr, (rdb_3)rdy_3.xe)};
      throws_ = var0;
   }

   private static void return_() {
      volatile_ = new byte[]{120, 100, 2, 17, 11, 12, 13, 14, 15, 16, 3};
   }

   private boolean super_() {
      this.this_();
      if (((rS_2)this.break_[9]).break_(((Ps_1)this.case_[1]).volatile_())) {
         return true;
      } else {
         return !((Ps_1)this.case_[1]).case_().byte_(((rS_2)this.break_[9]).break_()).catch_() ? true : catch_[30];
      }
   }

   @Override
   public void protected_() {
      this.this_();
      super.protected_();
      this.int_();
      Boolean var5 = false;
      this.break_[11] = var5;
   }

   public boolean private_() {
      this.this_();
      return (Boolean)this.break_[14];
   }

   private static void final_() {
      finally_ = new String[]{
         new String("/hub"),
         new String("У вас нет места в инвентаре, вы отключены от сервера"),
         new String("Selection cannot be null"),
         new String("Creeper Farming"),
         new String("Selection cannot be null")
      };
   }

   private static void synchronized_() {
      extends_ = new float[]{0.0F, 1000.0F, 500.0F};
   }
}
