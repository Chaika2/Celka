package celestial;

import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrTF<T> implements MinecraftAccessor {
   private static short[] id_class;
   public Object[] id_throws;
   private static boolean[] id_break;

   public rrTF(T var1) {
      this.id_package();
      this.id_throws[id_class[3]] = var1;
   }

   static {
      ntfClinit();
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ -860454532;
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 1160207334969593820L;
   }

   public static String id_throws(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{28, -17, 37, -115, -115, 77, 69, -121}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   public T id_continue() {
      return (T)this.id_throws[id_class[2]];
   }

   private void id_package() {
      if (this.id_throws == null) {
         this.id_throws = new Object[1];
      }
   }

   public void id_super() {
   }

   private static void id_private() {
      id_break = new boolean[]{true, true, true};
   }

   private static void id_final() {
      id_class = new short[4];
   }

   public boolean aI_() {
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_class[0]]).id_finally().id_break(this);
      return id_break[0];
   }

   public boolean aK_() {
      ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_class[1]]).id_finally().id_byte(this);
      return id_break[1];
   }
}
