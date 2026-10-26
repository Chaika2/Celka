package celestial;

import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GQ implements rq_3 {
   public Object[] id_class;
   private static byte[] id_break;
   private static short[] id_byte;
   private static boolean[] id_protected;

   @Override
   public int id_byte() {
      return ((rq_3)this.id_class[id_byte[13]]).id_byte();
   }

   public GQ(GW var1, rq_3 var2, int var3, int var4) {
      this.id_catch();
      this.id_class[3] = var1;
      this.id_class[id_byte[1]] = var2;
      Integer var11 = var3;
      this.id_class[1] = var11;
      Integer var12 = var4;
      this.id_class[2] = var12;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 825026950;
   }

   @Override
   public boolean id_class(int var1, int var2, int var3, xc_3 var4) {
      return rq_3.super.id_class(var1, var2, var3, var4)
            && var2 >= this.id_class[1]
            && var2 <= this.id_class[2]
            && ((rq_3)this.id_class[id_byte[9]]).id_class(var1, var2, var3, var4)
         ? true
         : id_protected[1];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-97, 70, 106, 91, -36, 15, 104, 105}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   @Override
   public xc_3 id_class(int var1, int var2, int var3, xc_3 var4, List<xc_3> var5) {
      return ((rq_3)this.id_class[id_byte[4]]).id_class(var1, var2, var3, var4, (List<xc_3>)((GW)this.id_class[3]).id_break[10]);
   }

   @Override
   public int id_class() {
      return ((rq_3)this.id_class[id_byte[12]]).id_class();
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -2016567099564498140L;
   }

   @Override
   public int id_break() {
      return ((rq_3)this.id_class[id_byte[11]]).id_break();
   }

   private static void id_throws() {
      id_byte = new short[]{3, 0, 1, 2, 0, 3, 10, 1, 2, 0, 0, 0, 0, 0};
   }

   private void id_catch() {
      if (this.id_class == null) {
         this.id_class = new Object[4];
         Object[] var1 = this.id_class;
         var1[1] = Integer.valueOf(id_protected[3]);
         var1[2] = Integer.valueOf(id_protected[4]);
      }
   }

   private static void id_case() {
      id_protected = new boolean[]{true, false, true, false, false};
   }

   @Override
   public void id_protected() {
      ((rq_3)this.id_class[id_byte[10]]).id_protected();
   }

   private static void id_private() {
      id_break = new byte[]{4, 2};
   }
}
