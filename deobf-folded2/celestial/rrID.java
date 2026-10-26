package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrID implements MinecraftAccessor {
   private static short[] id_break;
   private static boolean[] id_byte;
   private static byte[] id_protected;
   public Object[] id_class;
   private static double[] id_throws;

   public boolean id_byte() {
      return (Boolean)this.id_class[2];
   }

   public void id_byte(Runnable var1) {
      var1.run();
      Boolean var6 = true;
      this.id_class[2] = var6;
   }

   public rrID() {
      this.id_finally();
      rrfw_3 var5 = new rrfw_3();
      this.id_class[5] = var5;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 79096690;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{53, -86, 84, 80, 49, -3, 4, -2}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 6858188666995957075L;
   }

   public void id_class(Runnable var1) {
      this.id_class[0] = var1;
   }

   public void id_class(rrLu_1 var1) {
      if (var1.id_class() instanceof rvS_2 var3 && var3.id_protected() && (Runnable)this.id_class[0] != null && (Boolean)this.id_class[2]) {
         Boolean var8 = true;
         this.id_class[3] = var8;
      }
   }

   public void id_class(q_1 var1) {
      if (var1.id_class() == (Y)Y.staticFields22c81230f53b33f2a682b4198db24cc4[0]) {
         if ((Runnable)this.id_class[0] != null && (Boolean)this.id_class[2]) {
            ((Runnable)this.id_class[0]).run();
            Boolean var6 = false;
            this.id_class[2] = var6;
            Object var7 = null;
            this.id_class[0] = var7;
            Boolean var8 = false;
            this.id_class[3] = var8;
            Boolean var9 = true;
            this.id_class[4] = var9;
            ((rrfw_3)this.id_class[5]).id_class();
         }

         if ((Runnable)this.id_class[1] != null && (Boolean)this.id_class[4] && ((rrfw_3)this.id_class[5]).id_class(100.0)) {
            ((Runnable)this.id_class[1]).run();
            Object var10 = null;
            this.id_class[1] = var10;
            Boolean var11 = false;
            this.id_class[4] = var11;
            ((rrfw_3)this.id_class[5]).id_class();
         }
      }
   }

   public Runnable id_class() {
      return (Runnable)this.id_class[0];
   }

   public void id_break(Runnable var1) {
      this.id_class[1] = var1;
   }

   public Runnable id_break() {
      return (Runnable)this.id_class[1];
   }

   public boolean id_throws() {
      return (Boolean)this.id_class[3];
   }

   private void id_finally() {
      if (this.id_class == null) {
         this.id_class = new Object[6];
         this.id_class[2] = false;
         this.id_class[3] = false;
         this.id_class[4] = false;
      }
   }

   private static void id_catch() {
      id_throws = new double[]{100.0};
   }

   private static void id_extends() {
      id_protected = new byte[]{6, 2, 3, 4};
   }

   public rrfw_3 id_case() {
      return (rrfw_3)this.id_class[5];
   }

   private static void id_implements() {
      id_break = new short[]{5, 2, 0, 2, 3, 0, 0, 2, 0, 2, 0, 3, 4, 5, 1, 4, 5, 1, 1, 4, 5, 0, 1, 2, 3, 4, 5, 0, 1};
   }

   public boolean id_protected() {
      return (Boolean)this.id_class[4];
   }

   private static void id_private() {
      id_byte = new boolean[]{true, true, false, false, true, false, false, false, false};
   }
}
