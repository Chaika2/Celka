package celestial;

import java.nio.charset.StandardCharsets;
import java.util.Date;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class C_while implements C_this {
   private static byte[] id_break;
   public Object[] id_class;
   private static boolean[] id_byte;
   private static long[] id_protected;
   private static String[] id_throws;
   private static short[] id_case;

   @Override
   public String id_byte() {
      return (String)this.id_class[id_case[8]];
   }

   public C_while(String var1, C_else var2, rU_2 var3, long var4) {
      this.id_catch();
      this.id_class[id_case[0]] = var1;
      this.id_class[1] = var2;
      this.id_class[3] = var3;
      Long var13 = var4;
      this.id_class[2] = var13;
   }

   public C_while(String var1, C_else var2, rU_2 var3) {
      this(var1, var2, var3, System.currentTimeMillis());
   }

   static {
      ntfClinit();
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == null) {
         return id_byte[2];
      } else if (!(var1 instanceof C_this var2)) {
         return id_byte[3];
      } else {
         return ((String)this.id_class[id_case[15]]).equals(var2.id_byte())
               && (C_else)this.id_class[1] == var2.id_break()
               && ((rU_2)this.id_class[3]).equals(var2.id_class())
            ? true
            : id_byte[5];
      }
   }

   @Override
   public String toString() {
      String var10000 = id_throws[0];
      Object[] var10001 = new Object[3];
      var10001[id_byte[0]] = (String)this.id_class[id_case[12]];
      var10001[1] = rU_2.id_class((rfH_2)((rU_2)this.id_class[3])).toString();
      var10001[2] = new Date((Long)this.id_class[2]).toString();
      return String.format(var10000, var10001);
   }

   @Override
   public int hashCode() {
      return ((String)this.id_class[id_case[4]]).hashCode()
         ^ ((C_else)this.id_class[1]).hashCode()
         ^ ((rU_2)this.id_class[3]).hashCode()
         ^ Long.hashCode((Long)this.id_class[2]);
   }

   @Override
   public rU_2 id_class() {
      return (rU_2)this.id_class[3];
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{-53, 100, 34, 118, -11, 112, -10, -23}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ -1167426005761382253L;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 300072883;
   }

   @Override
   public C_else id_break() {
      return (C_else)this.id_class[1];
   }

   private static void id_throws() {
      id_byte = new boolean[]{false, true, false, false, true, false};
   }

   private static void id_finally() {
      id_case = new short[]{0, 1, 3, 2, 0, 1, 3, 2, 0, 1, 2, 3, 0, 3, 2, 0, 1, 3};
   }

   private void id_catch() {
      if (this.id_class == null) {
         this.id_class = new Object[4];
         Object[] var1 = this.id_class;
         var1[2] = id_protected[0];
      }
   }

   private static void id_case() {
      id_protected = new long[1];
   }

   private static void id_implements() {
      id_break = new byte[]{3, 2, 4, 2};
   }

   @Override
   public long id_protected() {
      return (Long)this.id_class[2];
   }

   private static void id_private() {
      id_throws = new String[]{new String("%s %s %s")};
   }
}
