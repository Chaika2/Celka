package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class br_3 extends bq_3 implements rA_2 {
   private static short[] id_catch;
   private static boolean[] id_private;
   private static byte[] id_implements;
   private static String[] id_finally;
   public Object[] id_break;
   private static float[] id_extends;
   private static double[] id_native;
   public static Object[] id_throws;

   @Override
   public boolean id_byte() {
      this.id_volatile();
      return !this.id_break[id_catch[19]] || (Supplier)this.id_break[1] != null && !((Supplier)this.id_break[1]).get() ? id_private[3] : true;
   }

   private static void id_int() {
      id_implements = new byte[]{9, 7, 8, 2};
   }

   public br_3(C_class var1) {
      super(var1);
      this.id_volatile();
      Boolean var6 = true;
      this.id_break[8] = var6;
      bB_2 var7 = new bB_2();
      this.id_break[5] = var7;
      bP_2 var8 = new bP_2(this, var1);
      this.id_break[2] = var8;
      bM_2 var10000 = (bM_2)this.id_break[2];
      bS_2 var9;
      bS_2 var10001 = var9 = new bS_2(var1, (bM_2)this.id_break[2]);
      this.id_break[3] = var9;
      var10000.id_class(var10001);
      var10000 = (bM_2)this.id_break[2];
      bG_2 var10;
      bG_2 var12 = var10 = new bG_2(var1, (bM_2)this.id_break[2]);
      this.id_break[4] = var10;
      var10000.id_class(var12);
   }

   static {
      ntfClinit();
   }

   @Override
   public String id_class() {
      return id_finally[0];
   }

   @Override
   public rn_3 id_class(boolean var1, boolean var2) {
      this.id_volatile();
      ((bB_2)this.id_break[5]).id_class(((Ps_1)this.id_case[1]).id_catch().Ps());
      if (((bB_2)this.id_break[5]).id_class() >= 15.0F) {
         Boolean var9 = true;
         this.id_break[7] = var9;
      }

      Ps_1 var3 = ((C_class)this.id_case[id_catch[13]]).id_throw();
      Br_1 var4 = ((C_class)this.id_case[id_catch[14]]).id_private();
      if ((Boolean)this.id_break[7]) {
         this.id_class(var3, var4);
         return new rn_3(null, (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[1]);
      } else {
         this.id_class(var3);
         return new rn_3((rO_2)this.id_break[6], (rC_2)rC_2.staticFields8c829f9bf33c3c2bb018688b591a16ef[id_catch[18]]);
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 963514663;
   }

   private void id_class(Ps_1 var1) {
      rYB var2 = var1.id_case();
      cb_3 var3 = var1.id_catch();
      roE_2 var4 = var2.id_instanceof();
      if (var4.id_class(var3) <= 2.0) {
         ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_catch[35]]).id_private().id_static().id_new();
         this.id_private();
      }
   }

   @Override
   public void id_class(Supplier<Boolean> var1, Map<bE_2, rrIk_1> var2) {
      this.id_volatile();
      Boolean var7 = true;
      this.id_break[id_catch[22]] = var7;
      this.id_break[1] = var1;
      rO_2 var9 = new rO_2(((Ps_1)this.id_case[1]).id_volatile(), ((Ps_1)this.id_case[1]).id_catch().Pg());
      this.id_break[6] = var9;
      ((bM_2)this.id_break[2]).id_protected();
      ((bS_2)this.id_break[3]).id_class(true);
      ((bG_2)this.id_break[4]).id_class(true);
      ((bS_2)this.id_break[3]).id_class(var2);
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{79, -47, -25, -118, 0, 74, -107, -74}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -8997363086083576378L;
   }

   private void id_class(Ps_1 var1, Br_1 var2) {
      this.id_volatile();
      PX var3 = var2.id_protected().orElse(var1.id_protected());
      if ((Boolean)this.id_break[8]) {
         var2.id_class(var3.id_case(var3.id_protected() - 50.0F), id_private[8]);
         if (var3.id_protected() <= -90.0F) {
            Boolean var8 = id_private[9];
            this.id_break[8] = var8;
         }
      } else {
         var2.id_class(var3.id_case(var3.id_protected() + 50.0F), id_private[10]);
         if (var3.id_protected() >= 90.0F) {
            ((bB_2)this.id_break[5]).id_byte();
            Boolean var9 = true;
            this.id_break[8] = var9;
            Boolean var10 = id_private[12];
            this.id_break[7] = var10;
         }
      }
   }

   private static void id_finally() {
      id_private = new boolean[]{true, true, true, false, true, true, true, false, false, false, false, true, false, false, false, false, false, false, true};
   }

   private static void id_extends() {
      id_finally = new String[]{new String("Auto Tunneling")};
   }

   private static void id_implements() {
      id_catch = new short[]{8, 5, 2, 2, 2, 3, 2, 2, 4, 5, 1, 5, 7, 0, 0, 7, 1, 6, 0, 0, 1, 1, 0, 1, 1, 1, 6, 2, 3, 4, 3, 0, 0, 2, 5, 0, 8, 8, 5, 8, 7, 2, 2};
   }

   private static void id_package() {
      id_extends = new float[]{15.0F, 50.0F, -90.0F, 50.0F, 90.0F, 15.0F, 50.0F};
   }

   @Override
   public void id_protected() {
      this.id_volatile();
      super.id_protected();
      if ((Boolean)this.id_break[id_catch[31]]) {
         Boolean var5 = id_private[7];
         this.id_break[id_catch[32]] = var5;
         ((bM_2)this.id_break[2]).id_catch();
         ((bB_2)this.id_break[5]).id_byte();
      }
   }

   public void id_private() {
      this.id_volatile();
      this.id_protected();
      ((bM_2)this.id_break[2]).id_class();
      ((bM_2)this.id_break[2]).id_byte();
   }

   private static void id_final() {
      id_native = new double[]{2.0};
   }

   private void id_volatile() {
      if (this.id_break == null) {
         this.id_break = new Object[9];
         Object[] var1 = this.id_break;
         var1[id_private[13]] = id_private[14];
         var1[7] = id_private[15];
         var1[8] = id_private[16];
      }
   }

   private static void id_native() {
      Object[] var0 = new Object[]{0.0F, 0.0F};
      id_throws = var0;
   }
}
