package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum rrIK {
   ;
   private static short[] shorts1247f214054b3fe790ff7a957ceb5ae0;
   private static String[] strings1247f214054b3fe790ff7a957ceb5ae0;
   private static boolean[] booleans1247f214054b3fe790ff7a957ceb5ae0;
   private static byte[] bytes1247f214054b3fe790ff7a957ceb5ae0;
   public Object[] fields1247f214054b3fe790ff7a957ceb5ae0;
   public static Object[] staticFields1247f214054b3fe790ff7a957ceb5ae0;

   private static void byte_() {
      booleans1247f214054b3fe790ff7a957ceb5ae0 = new boolean[]{true, false, false, false, true, true};
   }

   private rrIK() {
      this.implements_();
      ArrayList var7 = new ArrayList();
      this.fields1247f214054b3fe790ff7a957ceb5ae0[0] = var7;
   }

   static {
      ntfClinit();
   }

   public void class_() {
      Iterator var1 = ((List)this.fields1247f214054b3fe790ff7a957ceb5ae0[0]).iterator();

      while (var1.hasNext()) {
         rrIo_1 var2 = (rrIo_1)var1.next();
         var2.private_();
         if (var2.throws_()) {
            var1.remove();
         }
      }
   }

   private static long class_(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6095014903609766689L;
   }

   public static String class_(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-44, 18, -1, -61, -19, 92, 57, -85}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public void class_(rrIo_1 var1) {
      ((List)this.fields1247f214054b3fe790ff7a957ceb5ae0[0]).add(var1);
   }

   private static int class_(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -155570593;
   }

   public List<rrIo_1> break_() {
      return (List<rrIo_1>)this.fields1247f214054b3fe790ff7a957ceb5ae0[0];
   }

   private static void throws_() {
      Object[] var0 = new Object[]{new rrIK(), null};
      var0[1] = new rrIK[]{(rrIK)var0[0]};
      staticFields1247f214054b3fe790ff7a957ceb5ae0 = var0;
   }

   private static void catch_() {
      bytes1247f214054b3fe790ff7a957ceb5ae0 = new byte[]{2};
   }

   private static void case_() {
      shorts1247f214054b3fe790ff7a957ceb5ae0 = new short[]{1, 0, 0, 0, 0, 0};
   }

   private void implements_() {
      if (this.fields1247f214054b3fe790ff7a957ceb5ae0 == null) {
         this.fields1247f214054b3fe790ff7a957ceb5ae0 = new Object[1];
         Object[] var1 = this.fields1247f214054b3fe790ff7a957ceb5ae0;
      }
   }

   private static void protected_() {
      strings1247f214054b3fe790ff7a957ceb5ae0 = new String[]{new String("INSTANCE")};
   }
}
