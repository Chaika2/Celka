package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Go_1 extends bq_3 implements rF_2 {
   private static boolean[] id_throws;
   public Object[] id_break;
   private static String[] id_catch;
   private static short[] id_private;
   private static double[] id_implements;
   private static byte[] id_finally;

   private boolean id_byte(xd_3 var1) {
      if (!(Boolean)C_class.id_instanceof().rz.id_class[id_private[65]]) {
         return id_throws[29];
      } else {
         return var1 != xu_3.PP && var1 != xu_3.Ps && var1 != xu_3.Xr && var1 != xu_3.SW && var1 != xu_3.re && var1 != xu_3.sZ ? id_throws[31] : true;
      }
   }

   @Override
   public boolean id_byte() {
      this.id_finally();
      return (re_3)this.id_break[id_private[7]] != null ? true : id_throws[5];
   }

   public Go_1(C_class var1) {
      super(var1);
      this.id_finally();
      Integer var6 = Integer.valueOf(id_throws[0]);
      this.id_break[4] = var6;
      Integer var7 = Integer.valueOf(id_throws[1]);
      this.id_break[5] = var7;
   }

   static {
      ntfClinit();
   }

   private boolean id_class(rfH_2 var1, rfH_2 var2) {
      int var3 = Math.abs(var1.b_() - var2.b_());
      int var4 = Math.abs(var1.c_() - var2.c_());
      int var5 = Math.abs(var1.d_() - var2.d_());
      return var3 + var4 + var5 == 1 ? true : id_throws[16];
   }

   @Override
   public String id_class() {
      this.id_finally();
      return ((List)this.id_break[1]).isEmpty()
         ? "Exploring randomly to find " + (re_3)this.id_break[id_private[41]] + ", no known locations"
         : "Get To " + (re_3)this.id_break[id_private[42]] + ", " + ((List)this.id_break[1]).size() + " known locations";
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-48, -13, -46, -62, 14, -78, 61, -19}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_class(re_3 var1) {
      this.id_finally();
      this.id_protected();
      this.id_break[id_private[2]] = var1;
      rU_2 var7 = ((Ps_1)this.id_case[1]).id_volatile();
      this.id_break[3] = var7;
      ArrayList var8 = new ArrayList();
      this.id_break[2] = var8;
      Integer var9 = Integer.valueOf(id_throws[2]);
      this.id_break[5] = var9;
      this.id_break(new ArrayList<>(), new GD(this, id_throws[3]));
   }

   private rP_2 id_class(rfH_2 var1) {
      this.id_finally();
      if (this.id_protected(((re_3)this.id_break[id_private[48]]).id_break())) {
         return new rh_3(var1);
      } else {
         return (rP_2)(this.id_break(((re_3)this.id_break[id_private[49]]).id_break())
               && EF.id_catch(((bw_3)((C_class)this.id_case[id_private[50]]).id_break[34]).id_class(var1.id_final()))
            ? new rS_2(var1.id_final())
            : new rE_2(var1));
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 2057750871;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8475370078713254703L;
   }

   @Override
   public synchronized rn_3 id_class(boolean var1, boolean var2) {
      this.id_finally();
      if ((List)this.id_break[1] == null) {
         this.id_break(new ArrayList<>(), new GD(this, id_throws[6]));
      }

      if (((List)this.id_break[1]).isEmpty()) {
         if ((Boolean)C_class.id_instanceof().b.id_class[id_private[10]] && !var1) {
            rfH_2[] var10006 = new rfH_2[1];
            var10006[id_throws[8]] = (rfH_2)this.id_break[3];
            return new rn_3(new GK(this, 1.0, var10006), (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[4]);
         } else {
            this.id_case("No known locations of " + (re_3)this.id_break[id_private[13]] + ", canceling GetToBlock");
            if (var2) {
               this.id_protected();
            }

            return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[2]);
         }
      } else {
         rs_3 var3 = new rs_3(((List)this.id_break[1]).stream().map(this::id_class).toArray(rP_2[]::new));
         if (var1) {
            if ((Boolean)C_class.id_instanceof().Ph.id_class[id_private[16]]) {
               this.id_case("Unable to find any path to " + (re_3)this.id_break[id_private[17]] + ", blacklisting presumably unreachable closest instances...");
               this.id_private();
               return this.id_class(id_throws[9], var2);
            } else {
               this.id_case("Unable to find any path to " + (re_3)this.id_break[id_private[18]] + ", canceling GetToBlock");
               if (var2) {
                  this.id_protected();
               }

               return new rn_3(var3, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[2]);
            }
         } else {
            int var4 = (Integer)C_class.id_instanceof().Pf.id_class[id_private[20]];
            if (var4 != 0) {
               int var10002 = (Integer)this.id_break[4];
               Integer var11 = var10002 + 1;
               this.id_break[4] = var11;
               if (var10002 % var4 == 0) {
                  ArrayList var5 = new ArrayList((List)this.id_break[1]);
                  GD var6 = new GD(this, true);
                  C_class.id_interface().execute(() -> this.id_break(var5, var6));
               }
            }

            if (var3.id_break(((Ps_1)this.id_case[1]).id_volatile()) && var3.id_break(((C_class)this.id_case[id_private[25]]).id_while().id_super()) && var2) {
               if (!this.id_byte(((re_3)this.id_break[id_private[26]]).id_break())) {
                  this.id_protected();
                  return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[2]);
               }

               if (this.id_final()) {
                  this.id_protected();
                  return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[2]);
               }
            }

            return new rn_3(var3, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[3]);
         }
      }
   }

   private synchronized void id_break(List<rfH_2> var1, EZ var2) {
      this.id_finally();
      re_3[] var10003 = new re_3[1];
      var10003[id_throws[18]] = (re_3)this.id_break[id_private[44]];
      List var3 = Ge_1.id_class(var2, new ra_3(var10003), 64, var1, (List<rfH_2>)this.id_break[2], Collections.emptyList());
      var3.removeIf(((List)this.id_break[2])::contains);
      this.id_break[1] = var3;
   }

   private boolean id_break(xd_3 var1) {
      if (!this.id_byte(var1)) {
         return id_throws[32];
      } else {
         return var1 != xu_3.SW && var1 != xu_3.re && var1 != xu_3.sZ ? id_throws[34] : true;
      }
   }

   private void id_finally() {
      if (this.id_break == null) {
         this.id_break = new Object[6];
         Object[] var1 = this.id_break;
         var1[4] = Integer.valueOf(id_throws[35]);
         var1[5] = Integer.valueOf(id_throws[36]);
      }
   }

   private static void id_extends() {
      id_catch = new String[]{new String("Right click timed out"), new String("Arrived but failed to right click open")};
   }

   private static void id_implements() {
      id_private = new short[]{
         4,
         5,
         0,
         1,
         3,
         2,
         5,
         0,
         1,
         1,
         0,
         3,
         4,
         0,
         2,
         1,
         0,
         0,
         0,
         2,
         0,
         4,
         4,
         1,
         1,
         0,
         0,
         2,
         2,
         3,
         1,
         1,
         1,
         1,
         2,
         0,
         1,
         3,
         2,
         0,
         1,
         0,
         0,
         1,
         0,
         2,
         2,
         1,
         0,
         0,
         0,
         34,
         1,
         1,
         1,
         0,
         1,
         1,
         0,
         5,
         1,
         4,
         5,
         5,
         0,
         0,
         0
      };
   }

   private static void id_package() {
      id_implements = new double[]{1.0};
   }

   private boolean id_protected(xd_3 var1) {
      if (!(Boolean)C_class.id_instanceof().P.id_class[id_private[64]]) {
         return id_throws[26];
      } else {
         return var1 == xu_3.Pi ? true : id_throws[28];
      }
   }

   @Override
   public synchronized void id_protected() {
      this.id_finally();
      super.id_protected();
      Object var5 = null;
      this.id_break[id_private[35]] = var5;
      Object var6 = null;
      this.id_break[1] = var6;
      Object var7 = null;
      this.id_break[3] = var7;
      Object var8 = null;
      this.id_break[2] = var8;
      ((C_class)this.id_case[id_private[39]]).id_int().id_class();
   }

   @Override
   public synchronized boolean id_private() {
      this.id_finally();
      ArrayList var1 = new ArrayList();
      ((List)this.id_break[1]).stream().min(Comparator.comparingDouble(((Ps_1)this.id_case[1]).id_volatile()::id_private)).ifPresent(var1::add);

      label32:
      while (true) {
         for (rfH_2 var3 : (List)this.id_break[1]) {
            for (rfH_2 var5 : var1) {
               if (this.id_class(var3, var5)) {
                  var1.add(var3);
                  ((List)this.id_break[1]).remove(var3);
                  continue label32;
               }
            }
         }

         switch (var1.size()) {
            default:
               this.id_byte("Blacklisting unreachable locations " + var1);
               ((List)this.id_break[2]).addAll(var1);
               return !var1.isEmpty() ? true : id_throws[13];
         }
      }
   }

   private boolean id_final() {
      this.id_finally();

      for (rfH_2 var2 : (List)this.id_break[1]) {
         Optional var3 = PJ.id_class(((Ps_1)this.id_case[1]).id_catch(), var2, ((Ps_1)this.id_case[1]).id_native().id_case());
         if (var3.isPresent()) {
            ((C_class)this.id_case[id_private[55]]).id_private().id_class(((Px_1)var3.get()).id_class(), true);
            if (((List)this.id_break[1]).contains(((Ps_1)this.id_case[1]).id_class().orElse(null))) {
               ((C_class)this.id_case[id_private[58]]).id_int().id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[5], true);
               if (!((rJr_1)((Ps_1)this.id_case[1]).id_catch().id_implements[4] instanceof rJT)) {
                  return true;
               }
            }

            int var10002 = (Integer)this.id_break[5];
            Integer var8 = var10002 + 1;
            this.id_break[5] = var8;
            if (var10002 > 20) {
               this.id_case(id_catch[0]);
               return true;
            }

            return id_throws[24];
         }
      }

      this.id_case(id_catch[1]);
      return true;
   }

   private static void id_volatile() {
      id_finally = new byte[]{64, 20, 6, 4, 5};
   }

   private static void id_native() {
      id_throws = new boolean[]{
         false,
         false,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         true,
         true,
         true,
         false,
         true,
         true,
         false,
         true,
         false,
         true,
         true,
         true,
         true,
         true,
         false,
         true,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         true,
         false,
         false,
         false
      };
   }
}
