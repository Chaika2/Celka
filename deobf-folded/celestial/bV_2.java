package celestial;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bV_2 extends Pv_1 implements PS {
   private static boolean[] id_byte;
   private static byte[] id_protected;
   private static short[] id_throws;
   public Object[] id_break;

   private boolean id_byte() {
      Pm_1[] var10000 = new Pm_1[5];
      var10000[id_byte[3]] = (Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[id_throws[22]];
      var10000[1] = (Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[1];
      var10000[2] = (Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[2];
      var10000[3] = (Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[3];
      var10000[4] = (Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[7];
      Pm_1[] var1 = var10000;
      int var2 = var1.length;

      for (int var3 = id_byte[5]; var3 < var2; var3++) {
         Pm_1 var4 = var1[var3];
         if (this.id_class(var4)) {
            return true;
         }
      }

      return !((C_class)this.id_class[id_throws[27]]).id_while().id_catch() && (C_class)this.id_class[id_throws[28]] == C_throws.id_class().id_break()
         ? id_byte[8]
         : true;
   }

   public bV_2(C_class var1) {
      super(var1);
      this.id_throws();
      HashMap var6 = new HashMap();
      this.id_break[id_throws[0]] = var6;
      bT_2 var7 = new bT_2(var1.id_throw());
      this.id_break[1] = var7;
      bt_3 var8 = new bt_3(var1.id_throw());
      this.id_break[2] = var8;
   }

   static {
      ntfClinit();
   }

   @Override
   public void id_class() {
      this.id_throws();
      ((Map)this.id_break[id_throws[5]]).clear();
   }

   @Override
   public boolean id_class(Pm_1 var1) {
      this.id_throws();
      return var1 == null ? id_byte[0] : ((Map)this.id_break[id_throws[3]]).getOrDefault(var1, id_byte[1]);
   }

   @Override
   public void id_class(Pm_1 var1, boolean var2) {
      this.id_throws();
      ((Map)this.id_break[id_throws[4]]).put(var1, var2);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -5998623668820980303L;
   }

   @Override
   public void id_class(j_1 var1) {
      this.id_throws();
      if (var1.id_class() != (V)V.staticFields30e1cd8580ce39faa61be3646b7cc079[1]) {
         if (this.id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[4])) {
            this.id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[5], id_byte[2]);
         }

         ((bT_2)this.id_break[1]).id_class(this.id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[4]));
         ((bt_3)this.id_break[2]).id_class(this.id_class((Pm_1)Pm_1.staticFieldsd2ae74894aa334618e73ed450cdbde1f[5]));
         if (this.id_byte()) {
            if (((rqr_3)((Ps_1)this.id_class[1]).id_catch().id_break[17]).getClass() != bD_2.class) {
               cb_3 var10000 = ((Ps_1)this.id_class[1]).id_catch();
               bD_2 var6 = new bD_2(this);
               var10000.id_break[17] = var6;
            }
         } else if (((rqr_3)((Ps_1)this.id_class[1]).id_catch().id_break[17]).getClass() == bD_2.class) {
            cb_3 var8 = ((Ps_1)this.id_class[1]).id_catch();
            rqP_2 var7 = new rqP_2((Qw_1)QY.id_instanceof().id_class[20]);
            var8.id_break[17] = var7;
         }
      }
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1638104439;
   }

   public static String id_break(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{105, -64, 47, -29, -78, 112, 87, 88}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public bT_2 id_break() {
      this.id_throws();
      return (bT_2)this.id_break[1];
   }

   private void id_throws() {
      if (this.id_break == null) {
         this.id_break = new Object[3];
         Object[] var1 = this.id_break;
      }
   }

   private static void id_catch() {
      id_byte = new boolean[]{false, false, false, false, true, false, true, true, false};
   }

   private static void id_case() {
      id_throws = new short[]{0, 1, 2, 0, 0, 0, 1, 4, 5, 1, 4, 2, 5, 1, 17, 1, 17, 1, 17, 1, 20, 17, 0, 1, 2, 3, 7, 0, 0, 1};
   }

   private static void id_protected() {
      id_protected = new byte[]{5, 2, 3, 4, 3};
   }
}
