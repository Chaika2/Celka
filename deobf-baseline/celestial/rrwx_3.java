package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwx_3 implements Af_1 {
   private static byte[] id_break;
   private static boolean[] id_byte;
   private static String[] id_protected;
   private static short[] id_throws;
   public Object[] id_class;

   private static void id_byte() {
      id_break = new byte[]{2, 4};
   }

   public rrwx_3(rrwJ_2 var1, rud_3 var2, String var3) {
      this.id_protected();
      this.id_class[id_throws[0]] = var1;
      this.id_class[id_throws[1]] = var2;
      this.id_class[id_throws[2]] = var3;
   }

   static {
      ntfClinit();
   }

   @Override
   public void id_class(rLG var1) {
      Boolean var8 = id_byte[0];
      this.id_class[id_throws[8]] = var8;
      rrwJ_2 var10000 = (rrwJ_2)this.id_class[id_throws[9]];
      Object var9 = null;
      var10000.id_class[id_throws[10]] = var9;
      long var2 = rqR_2.id_break() - (Long)((rrwJ_2)this.id_class[id_throws[11]]).id_class[id_throws[12]];
      var10000 = (rrwJ_2)this.id_class[id_throws[13]];
      String var10003 = id_protected[0];
      Object[] var10004 = new Object[id_byte[1]];
      var10004[id_byte[2]] = var2;
      String var10 = new rgn_3(var10003, var10004).getString();
      var10000.id_class[id_throws[14]] = var10;
      ((rud_3)this.id_class[id_throws[15]]).id_class(new rgn_3(id_protected[1]));
   }

   @Override
   public rud_3 id_class() {
      return (rud_3)this.id_class[id_throws[22]];
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1280433270939446778L;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{126, -59, -21, 28, 38, 25, 76, 65}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public void id_class(rgP_2 var1, rgP_2 var2) {
      rrwJ_2 var10000 = (rrwJ_2)this.id_class[id_throws[16]];
      Object var7 = null;
      var10000.id_class[id_throws[17]] = var7;
      if (!(Boolean)this.id_class[id_throws[18]]) {
         var10000 = (rrwJ_2)this.id_class[id_throws[19]];
         rgF_2 var10001 = rgF_2.RED;
         String var10004 = id_protected[2];
         Object[] var10005 = new Object[id_break[0]];
         var10005[id_byte[3]] = (String)this.id_class[id_throws[20]];
         var10005[id_byte[4]] = var2.getString();
         String var8 = var10001 + new rgn_3(var10004, var10005).getString();
         var10000.id_class[id_throws[21]] = var8;
      }
   }

   @Override
   public void id_class(rLb_1 var1) {
      rrwJ_2 var10000 = (rrwJ_2)this.id_class[id_throws[3]];
      Long var6 = rqR_2.id_break();
      var10000.id_class[id_throws[4]] = var6;
      ((rud_3)this.id_class[id_throws[5]]).id_class(new rLB((Long)((rrwJ_2)this.id_class[id_throws[6]]).id_class[id_throws[7]]));
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1069250188;
   }

   private static void id_break() {
      id_byte = new boolean[]{true, true, false, false, true, false, false};
   }

   private static void id_throws() {
      id_throws = new short[]{3, 1, 2, 3, 1, 1, 3, 1, 0, 3, 2, 3, 1, 3, 0, 1, 3, 2, 0, 3, 2, 0, 1};
   }

   private static void id_case() {
      id_protected = new String[]{
         new String("ui.proxyserver.ping.showPing"), new String("multiplayer.status.finished"), new String("ui.proxyserver.err.cantPingReason")
      };
   }

   private void id_protected() {
      if (this.id_class == null) {
         this.id_class = new Object[id_break[1]];
         Object[] var1 = this.id_class;
         var1[id_byte[5]] = id_byte[6];
      }
   }
}
