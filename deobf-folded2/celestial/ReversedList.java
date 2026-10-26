package celestial;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ReversedList<T> extends ArrayList<T> {
   private static boolean[] id_class;

   static {
      ntfClinit();
   }

   @Override
   public void add(int var1, T var2) {
      super.add(this.size() - var1, var2);
   }

   @Override
   public boolean add(T var1) {
      super.add(0, var1);
      return true;
   }

   private static int id_class(int var0) {
      return Integer.rotateLeft(var0, 16) ^ 1203308983;
   }

   public static String id_class(String var0) throws Exception {
      Cipher var1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
      SecretKeySpec var2 = new SecretKeySpec(new byte[]{123, 5, -19, -71, -100, -77, -108, 65}, "DES");
      IvParameterSpec var3 = new IvParameterSpec(new byte[8]);
      var1.init(2, var2, var3);
      return new String(var1.doFinal(var0.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
   }

   private static void id_class() {
      id_class = new boolean[]{false, true, false};
   }

   private static long id_class(long var0) {
      return Long.rotateLeft(var0, 32) ^ 8748290244893845024L;
   }

   @Override
   public boolean addAll(int var1, Collection<? extends T> var2) {
      return super.addAll(this.size() - var1, new ReversedList<>());
   }

   @Override
   public boolean addAll(Collection<? extends T> var1) {
      return super.addAll(0, new ReversedList<>());
   }
}
