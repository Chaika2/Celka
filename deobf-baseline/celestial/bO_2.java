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
   private static boolean[] id_catch;
   private static double[] id_private;
   public Object[] id_break;
   private static long[] id_implements;
   private static String[] id_finally;
   private static float[] id_extends;
   public static Object[] id_throws;
   private static short[] id_native;
   private static byte[] id_volatile;

   @Override
   public boolean id_byte() {
      this.id_this();
      return !this.id_break[id_native[64]] || (Supplier)this.id_break[id_native[65]] != null && !((Supplier)this.id_break[id_native[66]]).get()
         ? id_catch[16]
         : id_catch[15];
   }

   private void id_int() {
      this.id_this();
      Boolean var5 = id_catch[32];
      this.id_break[id_native[92]] = var5;
      Boolean var6 = id_catch[33];
      this.id_break[id_native[93]] = var6;
      Object var7 = null;
      this.id_break[id_native[94]] = var7;
      if (!((List)this.id_break[id_native[95]]).isEmpty()) {
         ((List)this.id_break[id_native[96]]).clear();
      }
   }

   public bO_2(C_class var1) {
      super(var1);
      this.id_this();
      bX_2 var6 = new bX_2();
      this.id_break[id_native[0]] = var6;
      ArrayList var7 = new ArrayList();
      this.id_break[id_native[1]] = var7;
      rrfw_3 var8 = new rrfw_3();
      this.id_break[id_native[2]] = var8;
      var1.s().id_class(this);
   }

   static {
      ntfClinit();
   }

   private void id_this() {
      if (this.id_break == null) {
         this.id_break = new Object[id_volatile[3]];
         Object[] var1 = this.id_break;
         var1[id_volatile[4]] = id_catch[41];
         var1[id_volatile[5]] = id_catch[42];
         var1[id_volatile[6]] = id_catch[43];
         var1[id_volatile[7]] = id_catch[44];
         var1[id_volatile[8]] = id_catch[45];
         var1[id_volatile[9]] = id_implements[0];
      }
   }

   public boolean id_class(xc_3 var1) {
      this.id_this();
      return !var1.id_catch() && this.id_break[id_native[81]] ? id_catch[22] : id_catch[23];
   }

   private boolean id_class(rdn_3 var1) {
      return var1.id_break() == rdy_3.hr && !((rhz_3)((Ps_1)this.id_case[id_native[82]]).id_catch().id_implements[id_native[83]]).id_case(var1)
         ? id_catch[24]
         : id_catch[25];
   }

   @Override
   public String id_class() {
      return id_finally[3];
   }

   private void id_class(List<iB_2> var1) {
      this.id_this();
      cb_3 var2 = ((Ps_1)this.id_case[id_native[76]]).id_catch();
      PE var3 = ((Ps_1)this.id_case[id_native[77]]).id_native();
      if (!var1.isEmpty() && (float)(System.currentTimeMillis() - (Long)this.id_break[id_native[78]]) >= id_extends[2] && rrfo_3.id_protected()) {
         boolean var4 = ((rrIk_1)this.id_break[id_native[79]]).id_class();
         boolean var5 = id_catch[19];

         for (iB_2 var7 : var1) {
            if (var2.id_int(var7) < id_private[1]) {
               var3.id_class(var2, var7, id_catch[20]);
               var5 = id_catch[21];
               if (!var4) {
                  break;
               }
            }
         }

         if (var5) {
            Long var12 = System.currentTimeMillis();
            this.id_break[id_native[80]] = var12;
         }
      }
   }

   @Override
   public void id_class(rrLz_1 var1) {
      this.id_this();
      if ((Boolean)this.id_break[id_native[52]]
         && ((Ps_1)this.id_case[id_native[53]]).id_catch().BL()
         && (rrfq_3)rrfp_3.id_class[id_native[54]] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_native[55]]) {
         var1.id_class(var1.id_byte());
      }
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-48, 1, 104, -97, -63, 24, 114, -31}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_class(rrAM var1) {
      this.id_this();
      ((rrfw_3)this.id_break[id_native[63]]).id_class();
   }

   @Override
   public void id_class(rY_2 var1, Supplier<Boolean> var2, rrIk_1 var3, rrIk_1 var4, rrIk_1 var5, rrIk_1 var6, rrIm_1 var7) {
      this.id_this();
      if (var1 == null) {
         throw new IllegalArgumentException(id_finally[2]);
      } else {
         Boolean var12 = id_catch[17];
         this.id_break[id_native[67]] = var12;
         this.id_break[id_native[68]] = var2;
         this.id_class(var1);
         this.id_break[id_native[69]] = var3;
         this.id_break[id_native[70]] = var4;
         this.id_break[id_native[71]] = var5;
         this.id_break[id_native[72]] = var6;
         this.id_break[id_native[73]] = var7;
         ((rrfw_3)this.id_break[id_native[74]]).id_class();
      }
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8157415545062725845L;
   }

   @Override
   public void id_class(q_1 var1) {
      this.id_this();
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_native[45]]) {
         if (!this.id_byte()) {
            this.id_int();
            return;
         }

         Boolean var6 = id_catch[9];
         this.id_break[id_native[46]] = var6;
         if ((rrIk_1)this.id_break[id_native[47]] != null && ((rrIk_1)this.id_break[id_native[48]]).id_class() && this.id_else()) {
            ((C_class)this.id_case[id_native[49]]).id_int().id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_native[50]], id_catch[10]);
            Boolean var7 = id_catch[11];
            this.id_break[id_native[51]] = var7;
         }
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -846337967;
   }

   @Override
   public void id_class(rrAS var1) {
      this.id_this();
      if ((Boolean)this.id_break[id_native[62]]) {
         var1.id_class(id_catch[14]);
      }
   }

   public void id_class(rY_2 var1) {
      this.id_this();
      if (var1 == null) {
         throw new IllegalArgumentException(id_finally[4]);
      } else {
         this.id_break[id_native[91]] = var1;
         this.id_implements();
      }
   }

   @Override
   public void id_class(rrLX var1) {
      this.id_this();
      if ((Boolean)this.id_break[id_native[59]]
         && (rrfq_3)rrfp_3.id_class[id_native[60]] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_native[61]]) {
         var1.id_break(id_catch[13]);
      }
   }

   public static List<iB_2> id_class(Ps_1 var0, Predicate<iB_2> var1) {
      ArrayList var2 = new ArrayList();

      for (an_3 var5 : var0.id_final()) {
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
   public rn_3 id_class(boolean var1, boolean var2) {
      this.id_this();
      Boolean var22 = var1;
      this.id_break[id_native[3]] = var22;
      cb_3 var3 = ((Ps_1)this.id_case[id_native[4]]).id_catch();
      rYB var4 = ((Ps_1)this.id_case[id_native[5]]).id_case();
      rfl_3 var5 = ((rY_2)this.id_break[id_native[6]]).id_break();
      if ((Boolean)this.id_break[id_native[7]]) {
         Float var23 = id_extends[0];
         var3.id_throws[id_native[8]] = var23;
      }

      CreeperFarm var6 = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_native[9]]).id_private().i();
      String var7 = rrfu_3.id_class((Module)var6);
      List var8 = id_class((Ps_1)this.id_case[id_native[10]], var0 -> var0.BC().id_throws().id_private() && var0.Pu() ? id_catch[37] : id_catch[38]);
      ((List)this.id_break[id_native[11]]).clear();
      ((List)this.id_break[id_native[12]]).addAll(var8);
      Map var9 = this.id_break(
         (Ps_1)this.id_case[id_native[13]],
         var2x -> {
            if (((Set)id_throws[id_native[98]]).contains(var2x.id_protected().id_break()) && var5.id_byte(var2x.rN())) {
               rfH_2 var3x = var2x.Bs();
               return EF.id_private(var4.id_byte(var3x)) == (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[id_native[99]]
                     && EF.id_private(var4.id_byte(var3x.id_final())) == (Gx_1)Gx_1.staticFields5eb6de38577e3355bf35a0696e0b0ac4[id_native[100]]
                  ? id_catch[35]
                  : id_catch[36];
            } else {
               return id_catch[34];
            }
         }
      );
      boolean var10 = !((List)this.id_break[id_native[14]]).isEmpty() ? id_catch[0] : id_catch[1];
      boolean var11 = !var9.isEmpty() ? id_catch[2] : id_catch[3];
      ArrayList var12 = null;
      if (var10) {
         ((List)this.id_break[id_native[15]]).sort((bh_3)id_throws[id_native[16]]);
         var12 = new ArrayList();

         for (iB_2 var14 : (List)this.id_break[id_native[17]]) {
            if (var14.id_int(var3) <= id_private[0] && var14.id_while(var3)) {
               var12.add(var14);
            }
         }

         var12.sort((bk_3)id_throws[id_native[18]]);
         this.id_class(var12);
      }

      Boolean var24 = var12 != null && !var12.isEmpty() ? id_catch[4] : id_catch[5];
      this.id_break[id_native[19]] = var24;
      if (((rrIk_1)this.id_break[id_native[20]]).id_class()
         && ((rrfw_3)this.id_break[id_native[21]]).id_class((double)(((rrIm_1)this.id_break[id_native[22]]).id_byte() * id_extends[1]))
         && !(Boolean)this.id_break[id_native[23]]
         && !var11) {
         PI var27 = ((C_class)this.id_case[id_native[24]]).id_native().id_protected();
         if (var27 != null) {
            Pf_1 var30 = var27.id_class();
            if (var30.id_break()) {
               var3.id_case(id_finally[0]);
               ((C_class)this.id_case[id_native[25]]).id_default().id_class(new Sl_1(var30.id_class() + var27.id_break(), id_volatile[0]));
               rrfu_3.id_byte(var7 + "Перезаходим на сервер через 6 секунд, чтобы все враждебные существа исчезли");
               ((rrfw_3)this.id_break[id_native[26]]).id_class();
            }
         }
      }

      if (!(Boolean)this.id_break[id_native[27]] && var11 && !(Boolean)this.id_break[id_native[28]]) {
         ArrayList var29 = new ArrayList();

         for (Entry var15 : var9.entrySet()) {
            rfH_2 var16 = (rfH_2)var15.getKey();
            rsE_2 var17 = (rsE_2)var15.getValue();
            if (this.id_class(var17.id_protected())) {
               var29.add(new rS_2(var16));
            }
         }

         if (var29.isEmpty()) {
            this.id_protected();
            if (((rrIk_1)this.id_break[id_native[29]]).id_class()) {
               String var33 = id_finally[1];
               rrjv_3.id_class(var6.id_case(), new rgN_2(var33));
               MinecraftAccessor.a_(var7 + var33, id_catch[6]);
            } else {
               String var34 = var7 + "У вас нет места в инвентаре, процесс остановлен";
               rrfu_3.id_byte(var34);
               MinecraftAccessor.a_(var34, id_catch[7]);
            }

            var6.id_super();
            return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_native[30]]);
         } else {
            rs_3 var32 = new rs_3(var29.toArray(rP_2[]::new));
            return new rn_3(var32, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_native[31]]);
         }
      } else {
         if (!(Boolean)this.id_break[id_native[32]] && var10) {
            rP_2 var28 = ((bX_2)this.id_break[id_native[33]])
               .id_class(
                  (Ps_1)this.id_case[id_native[34]],
                  var5,
                  ((List)this.id_break[id_native[35]]).stream().filter(var1x -> var5.id_byte(var1x.rN())).toList(),
                  var12
               );
            if (var28 != null) {
               return new rn_3(var28, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_native[36]]);
            }
         }

         if ((rS_2)this.id_break[id_native[37]] == null || (Boolean)this.id_break[id_native[38]]) {
            rS_2 var25 = ((bX_2)this.id_break[id_native[39]])
               .id_class((Ps_1)this.id_case[id_native[40]], var5, id_volatile[1], () -> rrfu_3.id_byte(var7 + "Не удалось найти подходящее место"));
            this.id_break[id_native[41]] = var25;
            Boolean var26 = id_catch[8];
            this.id_break[id_native[42]] = var26;
         }

         if (this.id_super()) {
            this.id_implements();
         }

         return new rn_3((rS_2)this.id_break[id_native[43]], (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_native[44]]);
      }
   }

   @Override
   public void id_class(rrLx_1 var1) {
      this.id_this();
      if ((Boolean)this.id_break[id_native[56]]
         && (rrfq_3)rrfp_3.id_class[id_native[57]] == (rrfq_3)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_native[58]]) {
         var1.id_break(id_catch[12]);
      }
   }

   public Map<rfH_2, rsE_2> id_break(Ps_1 var1, Predicate<rsE_2> var2) {
      Iterable var3 = var1.id_final();
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

   private static void id_finally() {
      id_implements = new long[1];
   }

   private static void id_extends() {
      id_private = new double[]{100.0, 36.0};
   }

   private static void id_continue() {
      id_native = new short[]{
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

   private boolean id_else() {
      return !((Ps_1)this.id_case[id_native[84]]).id_case().id_byte(((Ps_1)this.id_case[id_native[85]]).id_extends()).id_catch() ? id_catch[26] : id_catch[27];
   }

   public void id_implements() {
      this.id_this();
      Boolean var5 = id_catch[31];
      this.id_break[id_native[90]] = var5;
   }

   private static void id_new() {
      id_catch = new boolean[]{
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

   private static void id_package() {
      Object[] var0 = new Object[]{new bh_3(), new bk_3(), Set.of((rdb_3)rdy_3.hr, (rdb_3)rdy_3.xe)};
      id_throws = var0;
   }

   private static void id_return() {
      id_volatile = new byte[]{120, 100, 2, 17, 11, 12, 13, 14, 15, 16, 3};
   }

   private boolean id_super() {
      this.id_this();
      if (((rS_2)this.id_break[id_native[86]]).id_break(((Ps_1)this.id_case[id_native[87]]).id_volatile())) {
         return id_catch[28];
      } else {
         return !((Ps_1)this.id_case[id_native[88]]).id_case().id_byte(((rS_2)this.id_break[id_native[89]]).id_break()).id_catch()
            ? id_catch[29]
            : id_catch[30];
      }
   }

   @Override
   public void id_protected() {
      this.id_this();
      super.id_protected();
      this.id_int();
      Boolean var5 = id_catch[18];
      this.id_break[id_native[75]] = var5;
   }

   public boolean id_private() {
      this.id_this();
      return (Boolean)this.id_break[id_native[97]];
   }

   private static void id_final() {
      id_finally = new String[]{
         new String("/hub"),
         new String("У вас нет места в инвентаре, вы отключены от сервера"),
         new String("Selection cannot be null"),
         new String("Creeper Farming"),
         new String("Selection cannot be null")
      };
   }

   private static void id_synchronized() {
      id_extends = new float[]{0.0F, 1000.0F, 500.0F};
   }
}
